package com.android.internal.telephony;

import android.hardware.radio.V1_0.SetupDataCallResult;

import java.util.ArrayList;

import vendor.mediatek.hardware.radio.V2_0.IRadioIndication;
import vendor.mediatek.hardware.radio.V2_0.IncomingCallNotification;
import vendor.mediatek.hardware.radio.V2_0.MtkSetupDataCallResult;

public class MtkRadioIndication extends IRadioIndication.Stub {
    RIL mRil;
    RadioIndication mIndication;

    MtkRadioIndication(RIL ril, RadioIndication indication) {
        mRil = ril;
        mIndication = indication;
    }

    //++ Radio V1_0
    public void radioStateChanged(int type, int radioState) {
        mIndication.radioStateChanged(type, radioState);
    }

    public void callStateChanged(int type) {
        mIndication.callStateChanged(type);
    }

    public void networkStateChanged(int type) {
        mIndication.networkStateChanged(type);
    }

    public void newSms(int type, ArrayList<Byte> pdu) {
        mIndication.newSms(type, pdu);
    }

    public void newSmsStatusReport(int type, ArrayList<Byte> pdu) {
        mIndication.newSmsStatusReport(type, pdu);
    }

    public void newSmsOnSim(int type, int recordNumber) {
        mIndication.newSmsOnSim(type, recordNumber);
    }

    public void onUssd(int type, int modeType, String msg) {
        mIndication.onUssd(type, modeType, msg);
    }

    public void nitzTimeReceived(int type, String nitzTime, long receivedTime) {
        mIndication.nitzTimeReceived(type, nitzTime, receivedTime);
    }

    public void currentSignalStrength(int type, android.hardware.radio.V1_0.SignalStrength signalStrength) {
        mIndication.currentSignalStrength(type, signalStrength);
    }

    public void dataCallListChanged(int type, ArrayList<SetupDataCallResult> dcList) {
        mIndication.dataCallListChanged(type, dcList);
    }

    public void suppSvcNotify(int type, android.hardware.radio.V1_0.SuppSvcNotification suppSvc) {
        mIndication.suppSvcNotify(type, suppSvc);
    }

    public void stkSessionEnd(int type) {
        mIndication.stkSessionEnd(type);
    }

    public void stkProactiveCommand(int type, String cmd) {
        mIndication.stkProactiveCommand(type, cmd);
    }

    public void stkEventNotify(int type, String cmd) {
        mIndication.stkEventNotify(type, cmd);
    }

    public void stkCallSetup(int type, long timeout) {
        mIndication.stkCallSetup(type, timeout);
    }

    public void simSmsStorageFull(int type) {
        mIndication.simSmsStorageFull(type);
    }

    public void simRefresh(int type, android.hardware.radio.V1_0.SimRefreshResult refreshResult) {
        mIndication.simRefresh(type, refreshResult);
    }

    public void callRing(int type, boolean isGsm, android.hardware.radio.V1_0.CdmaSignalInfoRecord record) {
        mIndication.callRing(type, isGsm, record);
    }

    public void simStatusChanged(int type) {
        mIndication.simStatusChanged(type);
    }

    public void cdmaNewSms(int type, android.hardware.radio.V1_0.CdmaSmsMessage msg) {
        mIndication.cdmaNewSms(type, msg);
    }

    public void newBroadcastSms(int type, ArrayList<Byte> data) {
        mIndication.newBroadcastSms(type, data);
    }

    public void cdmaRuimSmsStorageFull(int type) {
        mIndication.cdmaRuimSmsStorageFull(type);
    }

    public void restrictedStateChanged(int type, int state) {
        mIndication.restrictedStateChanged(type, state);
    }

    public void enterEmergencyCallbackMode(int type) {
        mIndication.enterEmergencyCallbackMode(type);
    }

    public void cdmaCallWaiting(int type, android.hardware.radio.V1_0.CdmaCallWaiting callWaitingRecord) {
        mIndication.cdmaCallWaiting(type, callWaitingRecord);
    }

    public void cdmaOtaProvisionStatus(int type, int status) {
        mIndication.cdmaOtaProvisionStatus(type, status);
    }

    public void cdmaInfoRec(int type, android.hardware.radio.V1_0.CdmaInformationRecords records) {
        mIndication.cdmaInfoRec(type, records);
    }

    public void indicateRingbackTone(int type, boolean start) {
        mIndication.indicateRingbackTone(type, start);
    }

    public void resendIncallMute(int type) {
        mIndication.resendIncallMute(type);
    }

    public void cdmaSubscriptionSourceChanged(int type, int cdmaSource) {
        mIndication.cdmaSubscriptionSourceChanged(type, cdmaSource);
    }

    public void cdmaPrlChanged(int type, int version) {
        mIndication.cdmaPrlChanged(type, version);
    }

    public void exitEmergencyCallbackMode(int type) {
        mIndication.exitEmergencyCallbackMode(type);
    }

    public void rilConnected(int type) {
        mIndication.rilConnected(type);
    }

    public void voiceRadioTechChanged(int type, int rat) {
        mIndication.voiceRadioTechChanged(type, rat);
    }

    public void cellInfoList(int type, ArrayList<android.hardware.radio.V1_0.CellInfo> records) {
        mIndication.cellInfoList(type, records);
    }

    public void imsNetworkStateChanged(int type) {
        mIndication.imsNetworkStateChanged(type);
    }

    public void subscriptionStatusChanged(int type, boolean activate) {
        mIndication.subscriptionStatusChanged(type, activate);
    }

    public void srvccStateNotify(int type, int state) {
        mIndication.srvccStateNotify(type, state);
    }

    public void hardwareConfigChanged(int type, ArrayList<android.hardware.radio.V1_0.HardwareConfig> configs) {
        mIndication.hardwareConfigChanged(type, configs);
    }

    public void radioCapabilityIndication(int type, android.hardware.radio.V1_0.RadioCapability rc) {
        mIndication.radioCapabilityIndication(type, rc);
    }

    public void onSupplementaryServiceIndication(int type, android.hardware.radio.V1_0.StkCcUnsolSsResult ss) {
        mIndication.onSupplementaryServiceIndication(type, ss);
    }

    public void stkCallControlAlphaNotify(int type, String alpha) {
        mIndication.stkCallControlAlphaNotify(type, alpha);
    }

    public void lceData(int type, android.hardware.radio.V1_0.LceDataInfo lce) {
        mIndication.lceData(type, lce);
    }

    public void pcoData(int type, android.hardware.radio.V1_0.PcoDataInfo pco) {
        mIndication.pcoData(type, pco);
    }

    public void modemReset(int type, String reason) {
        mIndication.modemReset(type, reason);
    }
    //-- Radio V1_0

    //++ Radio V1_1
    public void carrierInfoForImsiEncryption(int type) {
        mIndication.carrierInfoForImsiEncryption(type);
    }

    public void networkScanResult(int type, android.hardware.radio.V1_1.NetworkScanResult result) {
        mIndication.networkScanResult(type, result);
    }

    public void keepaliveStatus(int type, android.hardware.radio.V1_1.KeepaliveStatus status) {
        mIndication.keepaliveStatus(type, status);
    }

    //-- Radio V1_1

    //++ MTK Radio V2_0
    public void incomingCallIndication(int indicationType, IncomingCallNotification notification) {
        mRil.processIndication(indicationType);
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< incomingCallIndication");
        mRil.setCallIndication(
            Integer.parseInt(notification.callId), Integer.parseInt(notification.seqNo));
    }

    public void cipherIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< cipherIndication not implemented");
    }

    public void crssIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< crssIndication not implemented");
    }

    public void vtStatusInfoIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< vtStatusInfoIndication not implemented");
    }

    public void speechCodecInfoIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< speechCodecInfoIndication not implemented");
    }

    public void cdmaCallAccepted() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< cdmaCallAccepted not implemented");
    }

    public void onVirtualSimOn() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onVirtualSimOn not implemented");
    }

    public void onVirtualSimOff() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onVirtualSimOff not implemented");
    }

    public void onImeiLock() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onImeiLock not implemented");
    }

    public void onImsiRefreshDone() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onImsiRefreshDone not implemented");
    }

    public void newEtwsInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< newEtwsInd not implemented");
    }

    public void meSmsStorageFullInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< meSmsStorageFullInd not implemented");
    }

    public void smsReadyInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< smsReadyInd not implemented");
    }

    public void dataCallListChangedEx(int indicationType,
        ArrayList<MtkSetupDataCallResult> mtkDcList) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< dataCallListChangedEx");
        ArrayList<SetupDataCallResult> dcList = new java.util.ArrayList<SetupDataCallResult>();
        mtkDcList.forEach(entry -> dcList.add(entry.dcr));
        mIndication.dataCallListChanged(indicationType, dcList);
    }

    public void responseCsNetworkStateChangeInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< responseCsNetworkStateChangeInd not implemented");
    }

    public void eMBMSAtInfoIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< eMBMSAtInfoIndication not implemented");
    }

    public void eMBMSSessionStatusIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< eMBMSSessionStatusIndication not implemented");
    }

    public void responsePsNetworkStateChangeInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< responsePsNetworkStateChangeInd not implemented");
    }

    public void responseInvalidSimInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< responseInvalidSimInd not implemented");
    }

    public void responseNetworkEventInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< responseNetworkEventInd not implemented");
    }

    public void responseModulationInfoInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< responseModulationInfoInd not implemented");
    }

    public void dataAllowedNotification() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< dataAllowedNotification not implemented");
    }

    public void onPseudoCellInfoInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onPseudoCellInfoInd not implemented");
    }

    public void plmnChangedIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< plmnChangedIndication not implemented");
    }

    public void registrationSuspendedIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< registrationSuspendedIndication not implemented");
    }

    public void gmssRatChangedIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< gmssRatChangedIndication not implemented");
    }

    public void worldModeChangedIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< worldModeChangedIndication not implemented");
    }

    public void resetAttachApnInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< resetAttachApnInd not implemented");
    }

    public void mdChangedApnInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< mdChangedApnInd not implemented");
    }

    public void esnMeidChangeInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< esnMeidChangeInd not implemented");
    }

    public void responseFemtocellInfo() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< responseFemtocellInfo not implemented");
    }

    public void phbReadyNotification() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< phbReadyNotification not implemented");
    }

    public void bipProactiveCommand() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< bipProactiveCommand not implemented");
    }

    public void triggerOtaSP() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< triggerOtaSP not implemented");
    }

    public void onStkMenuReset() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onStkMenuReset not implemented");
    }

    public void onMdDataRetryCountReset() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onMdDataRetryCountReset not implemented");
    }

    public void onRemoveRestrictEutran() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onRemoveRestrictEutran not implemented");
    }

    public void onPcoStatus() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onPcoStatus not implemented");
    }

    public void onLteAccessStratumStateChanged() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onLteAccessStratumStateChanged not implemented");
    }

    public void onSimPlugIn() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimPlugIn not implemented");
    }

    public void onSimPlugOut() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimPlugOut not implemented");
    }

    public void onSimMissing() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimMissing not implemented");
    }

    public void onSimRecovery() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimRecovery not implemented");
    }

    public void onSimTrayPlugIn() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimTrayPlugIn not implemented");
    }

    public void onSimCommonSlotNoChanged() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimCommonSlotNoChanged not implemented");
    }

    public void onSimMeLockEvent() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onSimMeLockEvent not implemented");
    }

    public void networkInfoInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< networkInfoInd not implemented");
    }

    public void cfuStatusNotify() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< cfuStatusNotify not implemented");
    }

    public void pcoDataAfterAttached() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< pcoDataAfterAttached not implemented");
    }

    public void confSRVCC() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< confSRVCC not implemented");
    }

    public void onVsimEventIndication() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onVsimEventIndication not implemented");
    }

    public void volteLteConnectionStatus() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< volteLteConnectionStatus not implemented");
    }

    public void dedicatedBearerActivationInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< dedicatedBearerActivationInd not implemented");
    }

    public void dedicatedBearerModificationInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< dedicatedBearerModificationInd not implemented");
    }

    public void dedicatedBearerDeactivationInd() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< dedicatedBearerDeactivationInd not implemented");
    }

    public void onWifiMonitoringThreshouldChanged() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onWifiMonitoringThreshouldChanged not implemented");
    }

    public void onWifiPdnActivate() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onWifiPdnActivate not implemented");
    }

    public void onWfcPdnError() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onWfcPdnError not implemented");
    }

    public void onPdnHandover() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onPdnHandover not implemented");
    }

    public void onWifiRoveout() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onWifiRoveout not implemented");
    }

    public void onLocationRequest() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onLocationRequest not implemented");
    }

    public void onWfcPdnStateChanged() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onWfcPdnStateChanged not implemented");
    }

    public void onNattKeepAliveChanged() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< onNattKeepAliveChanged not implemented");
    }

    public void oemHookRaw() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[UNSL][MTK]< oemHookRaw not implemented");
    }
    //-- MTK Radio V2_0
}
