package com.android.internal.telephony;

import android.hardware.radio.V1_0.SetupDataCallResult;

import java.util.ArrayList;

import vendor.samsung.hardware.radio.V1_2.IRadioIndication;

import vendor.samsung.hardware.radio.V1_2.ApnProfile;
import vendor.samsung.hardware.radio.V1_2.SecSignalStrength;
import vendor.samsung.hardware.radio.V1_2.OemSSReleaseComplete;
import vendor.samsung.hardware.radio.V1_2.DcParam;
import vendor.samsung.hardware.radio.V1_2.NrSignalStrength;
import android.hardware.radio.V1_2.PhysicalChannelConfig;

public class SamsungRadioIndication extends IRadioIndication.Stub {
    RIL mRil;
    RadioIndication mIndication;

    SamsungRadioIndication(RIL ril, RadioIndication indication) {
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

    //++ Radio V1_2
    public void networkScanResult_1_2(int type, android.hardware.radio.V1_2.NetworkScanResult result) {
        mIndication.networkScanResult_1_2(type, result);
    }

    public void cellInfoList_1_2(int type, ArrayList<android.hardware.radio.V1_2.CellInfo> records) {
        mIndication.cellInfoList_1_2(type, records);
    }

    public void currentLinkCapacityEstimate(int type, android.hardware.radio.V1_2.LinkCapacityEstimate lce) {
        mIndication.currentLinkCapacityEstimate(type, lce);
    }

    public void currentPhysicalChannelConfigs(int type, ArrayList<PhysicalChannelConfig> configs) {
        mIndication.currentPhysicalChannelConfigs(type, configs);
    }

    public void currentSignalStrength_1_2(int type, android.hardware.radio.V1_2.SignalStrength signalStrength) {
        mIndication.currentSignalStrength_1_2(type, signalStrength);
    }
    //-- Radio V1_2

    public void secCurrentSignalStrength(int type, SecSignalStrength signalStrength) {
        mIndication.currentSignalStrength_1_2(type, signalStrength.base);
    }
    public void secImsNetworkStateChanged(int type, ArrayList<Integer> regState) {
    }
    public void oemAcbInfoChanged(int type, ArrayList<Integer> acbInfo) {
    }
    public void oemCsFallback(int type, int state) {
    }
    public void oemImsPreferenceChangeInd(int type, ArrayList<Integer> imsPref) {
    }
    public void oemVoiceRadioBearerHoStatusInd(int type, int state) {
    }
    public void oemHysteresisDcnInd(int type) {
    }
    public void oemTimerStatusChangedInd(int type, ArrayList<Integer> eventNoti) {
    }
    public void oemModemCapInd(int type, ArrayList<Byte> data) {
    }
    public void oemAmInd(int type, String intent) {
    }
    public void oemTrunRadioOnInd(int type) {
    }
    public void oemSimPbReadyInd(int type) {
    }
    public void oemPbInitCompleteInd(int type) {
    }
    public void oemDeviceReadyNoti(int type) {
    }
    public void oemStkSmsSendResultInd(int type, int result) {
    }
    public void oemStkCallControlResultInd(int type, String cmd) {
    }
    public void oemSimSwapStateChangedInd(int type, int state) {
    }
    public void oemSimCountMismatchedInd(int type, int state) {
    }
    public void oemSimIccidNoti(int type, String iccid) {
    }
    public void oemSimOnOffNoti(int type, int mode) {
    }
    public void oemReleaseCompleteMessageInd(int typer, OemSSReleaseComplete result) {
    }
    public void oemSapNoti(int type, ArrayList<Byte> data) {
    }
    public void oemNrBearerAllocationChangeInd(int type, int status) {
    }
    public void oem5gStatusChangeInd(int type, int status) {
    }
    public void oemNrDcParamChangeInd(int type, DcParam dcParam) {
    }
    public void oemNrSignalStrengthInd(int type, NrSignalStrength nrSignalStrength) {
    }
    public ApnProfile oemLoadApnProfile(String select) {
        return null;
    }
    public int oemGetSettingValue(String key, String table) {
        return 0;
    }
}
