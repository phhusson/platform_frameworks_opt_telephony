/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony;

import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CALL_RING;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CARRIER_INFO_IMSI_ENCRYPTION;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CDMA_CALL_WAITING;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CDMA_INFO_REC;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CDMA_OTA_PROVISION_STATUS;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CDMA_RUIM_SMS_STORAGE_FULL;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CDMA_SUBSCRIPTION_SOURCE_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_CELL_INFO_LIST;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_DATA_CALL_LIST_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_ENTER_EMERGENCY_CALLBACK_MODE;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_EXIT_EMERGENCY_CALLBACK_MODE;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_HARDWARE_CONFIG_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_LCEDATA_RECV;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_MODEM_RESTART;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_NETWORK_SCAN_RESULT;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_NITZ_TIME_RECEIVED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_ON_SS;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_ON_USSD;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_PCO_DATA;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RADIO_CAPABILITY;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESEND_INCALL_MUTE;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_CALL_STATE_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_CDMA_NEW_SMS;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_IMS_NETWORK_STATE_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_NETWORK_STATE_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_NEW_BROADCAST_SMS;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_NEW_SMS;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_NEW_SMS_ON_SIM;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_NEW_SMS_STATUS_REPORT;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_RADIO_STATE_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESPONSE_SIM_STATUS_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RESTRICTED_STATE_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RIL_CONNECTED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_RINGBACK_TONE;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_SIGNAL_STRENGTH;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_SIM_REFRESH;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_SIM_SMS_STORAGE_FULL;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_SRVCC_STATE_NOTIFY;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_STK_CALL_SETUP;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_STK_CC_ALPHA_NOTIFY;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_STK_EVENT_NOTIFY;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_STK_PROACTIVE_COMMAND;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_STK_SESSION_END;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_SUPP_SVC_NOTIFICATION;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_UICC_SUBSCRIPTION_STATUS_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOL_VOICE_RADIO_TECH_CHANGED;
import static com.android.internal.telephony.RILConstants.RIL_UNSOl_CDMA_PRL_CHANGED;

import android.hardware.radio.V1_0.CdmaCallWaiting;
import android.hardware.radio.V1_0.CdmaInformationRecord;
import android.hardware.radio.V1_0.CdmaLineControlInfoRecord;
import android.hardware.radio.V1_0.CdmaNumberInfoRecord;
import android.hardware.radio.V1_0.CdmaRedirectingNumberInfoRecord;
import android.hardware.radio.V1_0.CdmaSignalInfoRecord;
import android.hardware.radio.V1_0.CdmaSmsMessage;
import android.hardware.radio.V1_0.CdmaT53AudioControlInfoRecord;
import android.hardware.radio.V1_0.CfData;
import android.hardware.radio.V1_0.LceDataInfo;
import android.hardware.radio.V1_0.PcoDataInfo;
import android.hardware.radio.V1_0.SetupDataCallResult;
import android.hardware.radio.V1_0.SimRefreshResult;
import android.hardware.radio.V1_0.SsInfoData;
import android.hardware.radio.V1_0.StkCcUnsolSsResult;
import android.hardware.radio.V1_0.SuppSvcNotification;
import vendor.mediatek.hardware.radio.V2_0.CfuStatusNotification;
import vendor.mediatek.hardware.radio.V2_0.CipherNotification;
import vendor.mediatek.hardware.radio.V2_0.CrssNotification;
import vendor.mediatek.hardware.radio.V2_0.DedicateDataCall;
import vendor.mediatek.hardware.radio.V2_0.EtwsNotification;
import vendor.mediatek.hardware.radio.V2_0.IRadio;
import vendor.mediatek.hardware.radio.V2_0.IRadioIndication;
import vendor.mediatek.hardware.radio.V2_0.IncomingCallNotification;
import vendor.mediatek.hardware.radio.V2_0.MtkSetupDataCallResult;
import vendor.mediatek.hardware.radio.V2_0.PcoDataAttachedInfo;
import vendor.mediatek.hardware.radio.V2_0.VsimOperationEvent;
import android.hardware.radio.V1_1.KeepaliveStatus;
import android.os.AsyncResult;
import android.os.SystemProperties;
import android.telephony.CellInfo;
import android.telephony.PcoData;
import android.telephony.SignalStrength;
import android.telephony.SmsMessage;

import com.android.internal.telephony.cdma.CdmaCallWaitingNotification;
import com.android.internal.telephony.cdma.CdmaInformationRecords;
import com.android.internal.telephony.cdma.SmsMessageConverter;
import com.android.internal.telephony.dataconnection.DataCallResponse;
import com.android.internal.telephony.gsm.SsData;
import com.android.internal.telephony.gsm.SuppServiceNotification;
import com.android.internal.telephony.nano.TelephonyProto.SmsSession;
import com.android.internal.telephony.uicc.IccRefreshResponse;
import com.android.internal.telephony.uicc.IccUtils;

import java.util.ArrayList;

public class MtkRadioIndication extends IRadioIndication.Stub {
    RIL mRil;
    RadioIndication mInd;

    MtkRadioIndication(RIL ril, RadioIndication ind) {
        mRil = ril;
        mInd = ind;
    }

    public void incomingCallIndication(int p0, IncomingCallNotification p1) {
        android.util.Log.d("PHH", "MTK incoming call " + p0 + ":" + p1);
        try {
            int RINGING = 0;
            int WAITING = 1;

vendor.mediatek.hardware.radio.V2_0.IRadio.castFrom(mRil.mRadioProxy).setCallIndication(0x4242, RINGING, Integer.parseInt(p1.callId), Integer.parseInt(p1.seqNo));
        } catch(Exception e) {
            android.util.Log.d("PHH", "Failed setting call indication", e);
        }
    }

    public void confSRVCC(int p0, ArrayList<Integer> p1) {
    }
    public void dataCallListChangedEx(int p0, ArrayList<MtkSetupDataCallResult> p1) {
    }
    public void responseFemtocellInfo(int p0, ArrayList<String> p1) {
    }
    public void onPcoStatus(int p0, ArrayList<Integer> p1) {
    }
    public void responseNetworkEventInd(int p0, ArrayList<Integer> p1) {
    }
    public void volteLteConnectionStatus(int p0, ArrayList<Integer> p1) {
    }
    public void smsReadyInd(int p0) {
    }
    public void onVirtualSimOff(int p0, int p1) {
    }
    public void onWifiMonitoringThreshouldChanged(int p0, ArrayList<Integer> p1) {
    }
    public void onWifiRoveout(int p0, ArrayList<String> p1) {
    }
    public void oemHookRaw(int p0, ArrayList<Byte> p1) {
    }
    public void onImsiRefreshDone(int p0) {
    }
    public void cdmaCallAccepted(int p0) {
    }
    public void dataAllowedNotification(int p0, int p1) {
    }
    public void cipherIndication(int p0, CipherNotification p1) {
    }
    public void onVirtualSimOn(int p0, int p1) {
    }
    public void onPdnHandover(int p0, ArrayList<Integer> p1) {
    }
    public void responsePsNetworkStateChangeInd(int p0, ArrayList<Integer> p1) {
    }
    public void vtStatusInfoIndication(int p0, int p1) {
    }
    public void onSimMeLockEvent(int p0) {
    }
    public void resetAttachApnInd(int p0) {
    }
    public void onSimPlugOut(int p0) {
    }
    public void plmnChangedIndication(int p0, ArrayList<String> p1) {
    }
    public void triggerOtaSP(int p0) {
    }
    public void dedicatedBearerDeactivationInd(int p0, int p1) {
    }
    public void onSimTrayPlugIn(int p0) {
    }
    public void onSimCommonSlotNoChanged(int p0) {
    }
    public void registrationSuspendedIndication(int p0, ArrayList<Integer> p1) {
    }
    public void mdChangedApnInd(int p0, int p1) {
    }
    public void responseCsNetworkStateChangeInd(int p0, ArrayList<String> p1) {
    }
    public void meSmsStorageFullInd(int p0) {
    }
    public void onMdDataRetryCountReset(int p0) {
    }
    public void onWfcPdnStateChanged(int p0, ArrayList<Integer> p1) {
    }
    public void onRemoveRestrictEutran(int p0) {
    }
    public void onVsimEventIndication(int p0, VsimOperationEvent p1) {
    }
    public void onImeiLock(int p0) {
    }
    public void onNattKeepAliveChanged(int p0, ArrayList<String> p1) {
    }
    public void dedicatedBearerModificationInd(int p0, DedicateDataCall p1) {
    }
    public void networkInfoInd(int p0, ArrayList<String> p1) {
    }
    public void onLocationRequest(int p0, ArrayList<String> p1) {
    }
    public void speechCodecInfoIndication(int p0, int p1) {
    }
    public void pcoDataAfterAttached(int p0, PcoDataAttachedInfo p1) {
    }
    public void responseModulationInfoInd(int p0, ArrayList<Integer> p1) {
    }
    public void eMBMSAtInfoIndication(int p0, String p1) {
    }
    public void onSimRecovery(int p0, int p1) {
    }
    public void gmssRatChangedIndication(int p0, ArrayList<Integer> p1) {
    }
    public void phbReadyNotification(int p0, int p1) {
    }
    public void onStkMenuReset(int p0) {
    }
    public void responseInvalidSimInd(int p0, ArrayList<String> p1) {
    }
    public void onWfcPdnError(int p0, ArrayList<Integer> p1) {
    }
    public void onSimMissing(int p0, int p1) {
    }
    public void bipProactiveCommand(int p0, String p1) {
    }
    public void esnMeidChangeInd(int p0, String p1) {
    }
    public void onSimPlugIn(int p0) {
    }
    public void dedicatedBearerActivationInd(int p0, DedicateDataCall p1) {
    }
    public void worldModeChangedIndication(int p0, ArrayList<Integer> p1) {
    }
    public void onPseudoCellInfoInd(int p0, ArrayList<Integer> p1) {
    }
    public void onWifiPdnActivate(int p0, ArrayList<Integer> p1) {
    }
    public void newEtwsInd(int p0, EtwsNotification p1) {
    }
    public void onLteAccessStratumStateChanged(int p0, ArrayList<Integer> p1) {
    }
    public void cfuStatusNotify(int p0, CfuStatusNotification p1) {
    }
    public void eMBMSSessionStatusIndication(int p0, int p1) {
    }
    public void crssIndication(int p0, CrssNotification p1) {
    }

    public void radioStateChanged(int indicationType, int radioState) {
	    mInd.radioStateChanged(indicationType, radioState);
    }

    public void callStateChanged(int indicationType) {
        mInd.callStateChanged(indicationType);
    }

    public void networkStateChanged(int indicationType) {
        mInd.networkStateChanged(indicationType);
    }

    public void newSms(int indicationType, ArrayList<Byte> pdu) {
        mInd.newSms(indicationType, pdu);
    }

    public void newSmsStatusReport(int indicationType, ArrayList<Byte> pdu) {
        mInd.newSmsStatusReport(indicationType, pdu);
    }

    public void newSmsOnSim(int indicationType, int recordNumber) {
        mInd.newSmsOnSim(indicationType, recordNumber);
    }

    public void onUssd(int indicationType, int ussdModeType, String msg) {
        mInd.onUssd(indicationType, ussdModeType, msg);
    }

    public void nitzTimeReceived(int indicationType, String nitzTime, long receivedTime) {
        mInd.nitzTimeReceived(indicationType, nitzTime, receivedTime);
    }

    public void currentSignalStrength(int indicationType,
                                      android.hardware.radio.V1_0.SignalStrength signalStrength) {
        mInd.currentSignalStrength(indicationType, signalStrength);
    }

    public void dataCallListChanged(int indicationType, ArrayList<SetupDataCallResult> dcList) {
        mInd.dataCallListChanged(indicationType, dcList);
    }

    public void suppSvcNotify(int indicationType, SuppSvcNotification suppSvcNotification) {
        mInd.suppSvcNotify(indicationType, suppSvcNotification);
    }

    public void stkSessionEnd(int indicationType) {
        mInd.stkSessionEnd(indicationType);
    }

    public void stkProactiveCommand(int indicationType, String cmd) {
        mInd.stkProactiveCommand(indicationType, cmd);
    }

    public void stkEventNotify(int indicationType, String cmd) {
        mInd.stkEventNotify(indicationType, cmd);
    }

    public void stkCallSetup(int indicationType, long timeout) {
        mInd.stkCallSetup(indicationType, timeout);
    }

    public void simSmsStorageFull(int indicationType) {
        mInd.simSmsStorageFull(indicationType);
    }

    public void simRefresh(int indicationType, SimRefreshResult refreshResult) {
        mInd.simRefresh(indicationType, refreshResult);
    }

    public void callRing(int indicationType, boolean isGsm, CdmaSignalInfoRecord record) {
        mInd.callRing(indicationType, isGsm, record);
    }

    public void simStatusChanged(int indicationType) {
        mInd.simStatusChanged(indicationType);
    }

    public void cdmaNewSms(int indicationType, CdmaSmsMessage msg) {
        mInd.cdmaNewSms(indicationType, msg);
    }

    public void newBroadcastSms(int indicationType, ArrayList<Byte> data) {
        mInd.newBroadcastSms(indicationType, data);
    }

    public void cdmaRuimSmsStorageFull(int indicationType) {
        mInd.cdmaRuimSmsStorageFull(indicationType);
    }

    public void restrictedStateChanged(int indicationType, int state) {
        mInd.restrictedStateChanged(indicationType, state);
    }

    public void enterEmergencyCallbackMode(int indicationType) {
        mInd.enterEmergencyCallbackMode(indicationType);
    }

    public void cdmaCallWaiting(int indicationType, CdmaCallWaiting callWaitingRecord) {
        mInd.cdmaCallWaiting(indicationType, callWaitingRecord);
    }

    public void cdmaOtaProvisionStatus(int indicationType, int status) {
        mInd.cdmaOtaProvisionStatus(indicationType, status);
    }

    public void cdmaInfoRec(int indicationType,
                            android.hardware.radio.V1_0.CdmaInformationRecords records) {
        mInd.cdmaInfoRec(indicationType, records);
    }

    public void indicateRingbackTone(int indicationType, boolean start) {
        mInd.indicateRingbackTone(indicationType, start);
    }

    public void resendIncallMute(int indicationType) {
        mInd.resendIncallMute(indicationType);
    }

    public void cdmaSubscriptionSourceChanged(int indicationType, int cdmaSource) {
        mInd.cdmaSubscriptionSourceChanged(indicationType, cdmaSource);
    }

    public void cdmaPrlChanged(int indicationType, int version) {
        mInd.cdmaPrlChanged(indicationType, version);
    }

    public void exitEmergencyCallbackMode(int indicationType) {
        mInd.exitEmergencyCallbackMode(indicationType);
    }

    public void rilConnected(int indicationType) {
        mInd.rilConnected(indicationType);
    }

    public void voiceRadioTechChanged(int indicationType, int rat) {
        mInd.voiceRadioTechChanged(indicationType, rat);
    }

    public void cellInfoList(int indicationType,
                             ArrayList<android.hardware.radio.V1_0.CellInfo> records) {
        mInd.cellInfoList(indicationType, records);
    }

    /** Incremental network scan results */
    public void networkScanResult(int indicationType,
                                  android.hardware.radio.V1_1.NetworkScanResult result) {
        mInd.networkScanResult(indicationType, result);
    }

    public void imsNetworkStateChanged(int indicationType) {
        mInd.imsNetworkStateChanged(indicationType);
    }

    public void subscriptionStatusChanged(int indicationType, boolean activate) {
        mInd.subscriptionStatusChanged(indicationType, activate);
    }

    public void srvccStateNotify(int indicationType, int state) {
        mInd.srvccStateNotify(indicationType, state);
    }

    public void hardwareConfigChanged(
            int indicationType,
            ArrayList<android.hardware.radio.V1_0.HardwareConfig> configs) {
        mInd.hardwareConfigChanged(indicationType, configs);
    }

    public void radioCapabilityIndication(int indicationType,
                                          android.hardware.radio.V1_0.RadioCapability rc) {
        mInd.radioCapabilityIndication(indicationType, rc);
    }

    public void onSupplementaryServiceIndication(int indicationType, StkCcUnsolSsResult ss) {
        mInd.onSupplementaryServiceIndication(indicationType, ss);
    }

    public void stkCallControlAlphaNotify(int indicationType, String alpha) {
        mInd.stkCallControlAlphaNotify(indicationType, alpha);
    }

    public void lceData(int indicationType, LceDataInfo lce) {
        mInd.lceData(indicationType, lce);
    }

    public void pcoData(int indicationType, PcoDataInfo pco) {
        mInd.pcoData(indicationType, pco);
    }

    public void modemReset(int indicationType, String reason) {
        mInd.modemReset(indicationType, reason);
    }

    public void carrierInfoForImsiEncryption(int indicationType) {
        mInd.carrierInfoForImsiEncryption(indicationType);
    }

    public void keepaliveStatus(int indicationType, KeepaliveStatus keepaliveStatus) {
        mInd.keepaliveStatus(indicationType, keepaliveStatus);
    }
}
