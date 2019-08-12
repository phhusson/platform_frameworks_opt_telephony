package com.android.internal.telephony;

import android.hardware.radio.V1_0.ActivityStatsInfo;
import android.hardware.radio.V1_0.CallForwardInfo;
import android.hardware.radio.V1_0.Call;
import android.hardware.radio.V1_0.CardStatus;
import android.hardware.radio.V1_0.CarrierRestrictions;
import android.hardware.radio.V1_0.CdmaBroadcastSmsConfigInfo;
import android.hardware.radio.V1_0.CellInfo;
import android.hardware.radio.V1_0.DataRegStateResult;
import android.hardware.radio.V1_0.HardwareConfig;
import android.hardware.radio.V1_0.IccIoResult;
import android.hardware.radio.V1_0.GsmBroadcastSmsConfigInfo;
import android.hardware.radio.V1_0.LastCallFailCauseInfo;
import android.hardware.radio.V1_0.LceDataInfo;
import android.hardware.radio.V1_0.LceStatusInfo;
import android.hardware.radio.V1_0.NeighboringCell;
import android.hardware.radio.V1_0.OperatorInfo;
import android.hardware.radio.V1_0.RadioCapability;
import android.hardware.radio.V1_0.RadioResponseInfo;
import android.hardware.radio.V1_0.SendSmsResult;
import android.hardware.radio.V1_0.SetupDataCallResult;
import android.hardware.radio.V1_0.SignalStrength;
import android.hardware.radio.V1_0.VoiceRegStateResult;
import android.hardware.radio.V1_1.KeepaliveStatus;

import java.util.ArrayList;

import vendor.samsung.hardware.radio.V1_2.IRadioResponse;

import vendor.samsung.hardware.radio.V1_2.SecCall;
import vendor.samsung.hardware.radio.V1_2.SecCardStatus;
import vendor.samsung.hardware.radio.V1_2.SecSignalStrength;
import vendor.samsung.hardware.radio.V1_2.SecVoiceRegStateResult;
import vendor.samsung.hardware.radio.V1_2.SecDataRegStateResult;
import vendor.samsung.hardware.radio.V1_2.SecOperatorInfo;
import vendor.samsung.hardware.radio.V1_2.OemPreferredNetworkInfo;
import vendor.samsung.hardware.radio.V1_2.OemSimPBResponse;
import vendor.samsung.hardware.radio.V1_2.OemCbConfigArgs;
import vendor.samsung.hardware.radio.V1_2.SecSendSmsResult;
import vendor.samsung.hardware.radio.V1_2.DcParam;
import vendor.samsung.hardware.radio.V1_2.NrSignalStrength;
import vendor.samsung.hardware.radio.V1_2.OemCsgInfo;

public class SamsungRadioResponse extends IRadioResponse.Stub {
    RIL mRil;
    RadioResponse mResponse;

    SamsungRadioResponse(RIL ril, RadioResponse response) {
      mRil = ril;
        mResponse = response;
    }

    //++ Radio V1_0
    public void getIccCardStatusResponse(RadioResponseInfo info, CardStatus cardStatus) {
        mResponse.getIccCardStatusResponse(info, cardStatus);
    }
    public void supplyIccPinForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPinForAppResponse(info, remainingRetries);
    }

    public void supplyIccPukForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPukForAppResponse(info, remainingRetries);
    }

    public void supplyIccPin2ForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPin2ForAppResponse(info, remainingRetries);
    }

    public void supplyIccPuk2ForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPuk2ForAppResponse(info, remainingRetries);
    }

    public void changeIccPinForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.changeIccPinForAppResponse(info, remainingRetries);
    }

    public void changeIccPin2ForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.changeIccPin2ForAppResponse(info, remainingRetries);
    }

    public void supplyNetworkDepersonalizationResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyNetworkDepersonalizationResponse(info, remainingRetries);
    }

    public void getCurrentCallsResponse(RadioResponseInfo info, ArrayList<Call> calls) {
        mResponse.getCurrentCallsResponse(info, calls);
    }

    public void dialResponse(RadioResponseInfo info) {
        mResponse.dialResponse(info);
    }

    public void getIMSIForAppResponse(RadioResponseInfo info, String imsi) {
        mResponse.getIMSIForAppResponse(info, imsi);
    }

    public void hangupConnectionResponse(RadioResponseInfo info) {
        mResponse.hangupConnectionResponse(info);
    }

    public void hangupWaitingOrBackgroundResponse(RadioResponseInfo info) {
        mResponse.hangupWaitingOrBackgroundResponse(info);
    }

    public void hangupForegroundResumeBackgroundResponse(RadioResponseInfo info) {
        mResponse.hangupForegroundResumeBackgroundResponse(info);
    }

    public void switchWaitingOrHoldingAndActiveResponse(RadioResponseInfo info) {
        mResponse.switchWaitingOrHoldingAndActiveResponse(info);
    }

    public void conferenceResponse(RadioResponseInfo info) {
        mResponse.conferenceResponse(info);
    }

    public void rejectCallResponse(RadioResponseInfo info) {
        mResponse.rejectCallResponse(info);
    }

    public void getLastCallFailCauseResponse(RadioResponseInfo info, LastCallFailCauseInfo failCauseinfo) {
        mResponse.getLastCallFailCauseResponse(info, failCauseinfo);
    }

    public void getSignalStrengthResponse(RadioResponseInfo info, SignalStrength sigStrength) {
        mResponse.getSignalStrengthResponse(info, sigStrength);
    }

    public void getVoiceRegistrationStateResponse(RadioResponseInfo info, VoiceRegStateResult voiceRegResponse) {
        mResponse.getVoiceRegistrationStateResponse(info, voiceRegResponse);
    }

    public void getDataRegistrationStateResponse(RadioResponseInfo info, DataRegStateResult dataRegResponse) {
        mResponse.getDataRegistrationStateResponse(info, dataRegResponse);
    }

    public void getOperatorResponse(RadioResponseInfo info, String longName, String shortName, String numeric) {
        mResponse.getOperatorResponse(info, longName, shortName, numeric);
    }

    public void setRadioPowerResponse(RadioResponseInfo info) {
        mResponse.setRadioPowerResponse(info);
    }

    public void sendDtmfResponse(RadioResponseInfo info) {
        mResponse.sendDtmfResponse(info);
    }

    public void sendSmsResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendSmsResponse(info, sms);
    }

    public void sendSMSExpectMoreResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendSMSExpectMoreResponse(info, sms);
    }

    public void setupDataCallResponse(RadioResponseInfo info, SetupDataCallResult dcResponse) {
        mResponse.setupDataCallResponse(info, dcResponse);
    }

    public void iccIOForAppResponse(RadioResponseInfo info, IccIoResult iccIo) {
        mResponse.iccIOForAppResponse(info, iccIo);
    }

    public void sendUssdResponse(RadioResponseInfo info) {
        mResponse.sendUssdResponse(info);
    }

    public void cancelPendingUssdResponse(RadioResponseInfo info) {
        mResponse.cancelPendingUssdResponse(info);
    }

    public void getClirResponse(RadioResponseInfo info, int n, int m) {
        mResponse.getClirResponse(info, n, m);
    }

    public void setClirResponse(RadioResponseInfo info) {
        mResponse.setClirResponse(info);
    }

    public void getCallForwardStatusResponse(RadioResponseInfo info, ArrayList<CallForwardInfo> callForwardInfos) {
        mResponse.getCallForwardStatusResponse(info, callForwardInfos);
    }

    public void setCallForwardResponse(RadioResponseInfo info) {
        mResponse.setCallForwardResponse(info);
    }

    public void getCallWaitingResponse(RadioResponseInfo info, boolean enable, int serviceClass) {
        mResponse.getCallWaitingResponse(info, enable, serviceClass);
    }

    public void setCallWaitingResponse(RadioResponseInfo info) {
        mResponse.setCallWaitingResponse(info);
    }

    public void acknowledgeLastIncomingGsmSmsResponse(RadioResponseInfo info) {
        mResponse.acknowledgeLastIncomingGsmSmsResponse(info);
    }

    public void acceptCallResponse(RadioResponseInfo info) {
        mResponse.acceptCallResponse(info);
    }

    public void deactivateDataCallResponse(RadioResponseInfo info) {
        mResponse.deactivateDataCallResponse(info);
    }

    public void getFacilityLockForAppResponse(RadioResponseInfo info, int response) {
        mResponse.getFacilityLockForAppResponse(info, response);
    }

    public void setFacilityLockForAppResponse(RadioResponseInfo info, int retry) {
        mResponse.setFacilityLockForAppResponse(info, retry);
    }

    public void setBarringPasswordResponse(RadioResponseInfo info) {
        mResponse.setBarringPasswordResponse(info);
    }

    public void getNetworkSelectionModeResponse(RadioResponseInfo info, boolean manual) {
        mResponse.getNetworkSelectionModeResponse(info, manual);
    }

    public void setNetworkSelectionModeAutomaticResponse(RadioResponseInfo info) {
        mResponse.setNetworkSelectionModeAutomaticResponse(info);
    }

    public void setNetworkSelectionModeManualResponse(RadioResponseInfo info) {
        mResponse.setNetworkSelectionModeManualResponse(info);
    }

    public void getAvailableNetworksResponse(RadioResponseInfo info, ArrayList<OperatorInfo> networkInfos) {
        mResponse.getAvailableNetworksResponse(info, networkInfos);
    }

    public void startDtmfResponse(RadioResponseInfo info) {
        mResponse.startDtmfResponse(info);
    }

    public void stopDtmfResponse(RadioResponseInfo info) {
        mResponse.stopDtmfResponse(info);
    }

    public void getBasebandVersionResponse(RadioResponseInfo info, String version) {
        mResponse.getBasebandVersionResponse(info, version);
    }

    public void separateConnectionResponse(RadioResponseInfo info) {
        mResponse.separateConnectionResponse(info);
    }

    public void setMuteResponse(RadioResponseInfo info) {
        mResponse.setMuteResponse(info);
    }

    public void getMuteResponse(RadioResponseInfo info, boolean enable) {
        mResponse.getMuteResponse(info, enable);
    }

    public void getClipResponse(RadioResponseInfo info, int status) {
        mResponse.getClipResponse(info, status);
    }

    public void getDataCallListResponse(RadioResponseInfo info, ArrayList<SetupDataCallResult> dcResponse) {
        mResponse.getDataCallListResponse(info, dcResponse);
    }

    public void setSuppServiceNotificationsResponse(RadioResponseInfo info) {
        mResponse.setSuppServiceNotificationsResponse(info);
    }

    public void writeSmsToSimResponse(RadioResponseInfo info, int index) {
        mResponse.writeSmsToSimResponse(info, index);
    }

    public void deleteSmsOnSimResponse(RadioResponseInfo info) {
        mResponse.deleteSmsOnSimResponse(info);
    }

    public void setBandModeResponse(RadioResponseInfo info) {
        mResponse.setBandModeResponse(info);
    }

    public void getAvailableBandModesResponse(RadioResponseInfo info, ArrayList<Integer> bandModes) {
        mResponse.getAvailableBandModesResponse(info, bandModes);
    }

    public void sendEnvelopeResponse(RadioResponseInfo info, String commandResponse) {
        mResponse.sendEnvelopeResponse(info, commandResponse);
    }

    public void sendTerminalResponseToSimResponse(RadioResponseInfo info) {
        mResponse.sendTerminalResponseToSimResponse(info);
    }

    public void handleStkCallSetupRequestFromSimResponse(RadioResponseInfo info) {
        mResponse.handleStkCallSetupRequestFromSimResponse(info);
    }

    public void explicitCallTransferResponse(RadioResponseInfo info) {
        mResponse.explicitCallTransferResponse(info);
    }

    public void setPreferredNetworkTypeResponse(RadioResponseInfo info) {
        mResponse.setPreferredNetworkTypeResponse(info);
    }

    public void getPreferredNetworkTypeResponse(RadioResponseInfo info, int nwType) {
        mResponse.getPreferredNetworkTypeResponse(info, nwType);
    }

    public void getNeighboringCidsResponse(RadioResponseInfo info, ArrayList<NeighboringCell> cells) {
        mResponse.getNeighboringCidsResponse(info, cells);
    }

    public void setLocationUpdatesResponse(RadioResponseInfo info) {
        mResponse.setLocationUpdatesResponse(info);
    }

    public void setCdmaSubscriptionSourceResponse(RadioResponseInfo info) {
        mResponse.setCdmaSubscriptionSourceResponse(info);
    }

    public void setCdmaRoamingPreferenceResponse(RadioResponseInfo info) {
        mResponse.setCdmaRoamingPreferenceResponse(info);
    }

    public void getCdmaRoamingPreferenceResponse(RadioResponseInfo info, int type) {
        mResponse.getCdmaRoamingPreferenceResponse(info, type);
    }

    public void setTTYModeResponse(RadioResponseInfo info) {
        mResponse.setTTYModeResponse(info);
    }

    public void getTTYModeResponse(RadioResponseInfo info, int mode) {
        mResponse.getTTYModeResponse(info, mode);
    }

    public void setPreferredVoicePrivacyResponse(RadioResponseInfo info) {
        mResponse.setPreferredVoicePrivacyResponse(info);
    }

    public void getPreferredVoicePrivacyResponse(RadioResponseInfo info, boolean enable) {
        mResponse.getPreferredVoicePrivacyResponse(info, enable);
    }

    public void sendCDMAFeatureCodeResponse(RadioResponseInfo info) {
        mResponse.sendCDMAFeatureCodeResponse(info);
    }

    public void sendBurstDtmfResponse(RadioResponseInfo info) {
        mResponse.sendBurstDtmfResponse(info);
    }

    public void sendCdmaSmsResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendCdmaSmsResponse(info, sms);
    }

    public void acknowledgeLastIncomingCdmaSmsResponse(RadioResponseInfo info) {
        mResponse.acknowledgeLastIncomingCdmaSmsResponse(info);
    }

    public void getGsmBroadcastConfigResponse(RadioResponseInfo info, ArrayList<GsmBroadcastSmsConfigInfo> configs) {
        mResponse.getGsmBroadcastConfigResponse(info, configs);
    }

    public void setGsmBroadcastConfigResponse(RadioResponseInfo info) {
        mResponse.setGsmBroadcastConfigResponse(info);
    }

    public void setGsmBroadcastActivationResponse(RadioResponseInfo info) {
        mResponse.setGsmBroadcastActivationResponse(info);
    }

    public void getCdmaBroadcastConfigResponse(RadioResponseInfo info, ArrayList<CdmaBroadcastSmsConfigInfo> configs) {
        mResponse.getCdmaBroadcastConfigResponse(info, configs);
    }

    public void setCdmaBroadcastConfigResponse(RadioResponseInfo info) {
        mResponse.setCdmaBroadcastConfigResponse(info);
    }

    public void setCdmaBroadcastActivationResponse(RadioResponseInfo info) {
        mResponse.setCdmaBroadcastActivationResponse(info);
    }

    public void getCDMASubscriptionResponse(RadioResponseInfo info, String mdn, String hSid, String hNid, String min, String prl) {
        mResponse.getCDMASubscriptionResponse(info, mdn, hSid, hNid, min, prl);
    }

    public void writeSmsToRuimResponse(RadioResponseInfo info, int index) {
        mResponse.writeSmsToRuimResponse(info, index);
    }

    public void deleteSmsOnRuimResponse(RadioResponseInfo info) {
        mResponse.deleteSmsOnRuimResponse(info);
    }

    public void getDeviceIdentityResponse(RadioResponseInfo info, String imei, String imeisv, String esn, String meid) {
        mResponse.getDeviceIdentityResponse(info, imei, imeisv, esn, meid);
    }

    public void exitEmergencyCallbackModeResponse(RadioResponseInfo info) {
        mResponse.exitEmergencyCallbackModeResponse(info);
    }

    public void getSmscAddressResponse(RadioResponseInfo info, String smsc) {
        mResponse.getSmscAddressResponse(info, smsc);
    }

    public void setSmscAddressResponse(RadioResponseInfo info) {
        mResponse.setSmscAddressResponse(info);
    }

    public void reportSmsMemoryStatusResponse(RadioResponseInfo info) {
        mResponse.reportSmsMemoryStatusResponse(info);
    }

    public void reportStkServiceIsRunningResponse(RadioResponseInfo info) {
        mResponse.reportStkServiceIsRunningResponse(info);
    }

    public void getCdmaSubscriptionSourceResponse(RadioResponseInfo info, int source) {
        mResponse.getCdmaSubscriptionSourceResponse(info, source);
    }

    public void requestIsimAuthenticationResponse(RadioResponseInfo info, String response) {
        mResponse.requestIsimAuthenticationResponse(info, response);
    }

    public void acknowledgeIncomingGsmSmsWithPduResponse(RadioResponseInfo info) {
        mResponse.acknowledgeIncomingGsmSmsWithPduResponse(info);
    }

    public void sendEnvelopeWithStatusResponse(RadioResponseInfo info, IccIoResult iccIo) {
        mResponse.sendEnvelopeWithStatusResponse(info, iccIo);
    }

    public void getVoiceRadioTechnologyResponse(RadioResponseInfo info, int rat) {
        mResponse.getVoiceRadioTechnologyResponse(info, rat);
    }

    public void getCellInfoListResponse(RadioResponseInfo info, ArrayList<CellInfo> cellInfo) {
        mResponse.getCellInfoListResponse(info, cellInfo);
    }

    public void setCellInfoListRateResponse(RadioResponseInfo info) {
        mResponse.setCellInfoListRateResponse(info);
    }

    public void setInitialAttachApnResponse(RadioResponseInfo info) {
        mResponse.setInitialAttachApnResponse(info);
    }

    public void getImsRegistrationStateResponse(RadioResponseInfo info, boolean isRegistered, int ratFamily) {
        mResponse.getImsRegistrationStateResponse(info, isRegistered, ratFamily);
    }

    public void sendImsSmsResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendImsSmsResponse(info, sms);
    }

    public void iccTransmitApduBasicChannelResponse(RadioResponseInfo info, IccIoResult result) {
        mResponse.iccTransmitApduBasicChannelResponse(info, result);
    }

    public void iccOpenLogicalChannelResponse(RadioResponseInfo info, int channelId, ArrayList<Byte> selectResponse) {
        mResponse.iccOpenLogicalChannelResponse(info, channelId, selectResponse);
    }

    public void iccCloseLogicalChannelResponse(RadioResponseInfo info) {
        mResponse.iccCloseLogicalChannelResponse(info);
    }

    public void iccTransmitApduLogicalChannelResponse(RadioResponseInfo info, IccIoResult result) {
        mResponse.iccTransmitApduLogicalChannelResponse(info, result);
    }

    public void nvReadItemResponse(RadioResponseInfo info, String result) {
        mResponse.nvReadItemResponse(info, result);
    }

    public void nvWriteItemResponse(RadioResponseInfo info) {
        mResponse.nvWriteItemResponse(info);
    }

    public void nvWriteCdmaPrlResponse(RadioResponseInfo info) {
        mResponse.nvWriteCdmaPrlResponse(info);
    }

    public void nvResetConfigResponse(RadioResponseInfo info) {
        mResponse.nvResetConfigResponse(info);
    }

    public void setUiccSubscriptionResponse(RadioResponseInfo info) {
        mResponse.setUiccSubscriptionResponse(info);
    }

    public void setDataAllowedResponse(RadioResponseInfo info) {
        mResponse.setDataAllowedResponse(info);
    }

    public void getHardwareConfigResponse(RadioResponseInfo info, ArrayList<HardwareConfig> config) {
        mResponse.getHardwareConfigResponse(info, config);
    }

    public void requestIccSimAuthenticationResponse(RadioResponseInfo info, IccIoResult result) {
        mResponse.requestIccSimAuthenticationResponse(info, result);
    }

    public void setDataProfileResponse(RadioResponseInfo info) {
        mResponse.setDataProfileResponse(info);
    }

    public void requestShutdownResponse(RadioResponseInfo info) {
        mResponse.requestShutdownResponse(info);
    }

    public void getRadioCapabilityResponse(RadioResponseInfo info, RadioCapability rc) {
        mResponse.getRadioCapabilityResponse(info, rc);
    }

    public void setRadioCapabilityResponse(RadioResponseInfo info, RadioCapability rc) {
        mResponse.setRadioCapabilityResponse(info, rc);
    }

    public void startLceServiceResponse(RadioResponseInfo info, LceStatusInfo statusInfo) {
        mResponse.startLceServiceResponse(info, statusInfo);
    }

    public void stopLceServiceResponse(RadioResponseInfo info, LceStatusInfo statusInfo) {
        mResponse.stopLceServiceResponse(info, statusInfo);
    }

    public void pullLceDataResponse(RadioResponseInfo info, LceDataInfo lceInfo) {
        mResponse.pullLceDataResponse(info, lceInfo);
    }

    public void getModemActivityInfoResponse(RadioResponseInfo info, ActivityStatsInfo activityInfo) {
        mResponse.getModemActivityInfoResponse(info, activityInfo);
    }

    public void setAllowedCarriersResponse(RadioResponseInfo info, int numAllowed) {
        mResponse.setAllowedCarriersResponse(info, numAllowed);
    }

    public void getAllowedCarriersResponse(RadioResponseInfo info, boolean allAllowed, CarrierRestrictions carriers) {
        mResponse.getAllowedCarriersResponse(info, allAllowed, carriers);
    }

    public void sendDeviceStateResponse(RadioResponseInfo info) {
        mResponse.sendDeviceStateResponse(info);
    }

    public void setIndicationFilterResponse(RadioResponseInfo info) {
        mResponse.setIndicationFilterResponse(info);
    }

    public void setSimCardPowerResponse(RadioResponseInfo info) {
        mResponse.setSimCardPowerResponse(info);
    }

    public void acknowledgeRequest(int serial) {
        mResponse.acknowledgeRequest(serial);
    }
    //-- Radio V1_0

    //++ Radio V1_1
    public void setCarrierInfoForImsiEncryptionResponse(RadioResponseInfo info) {
        mResponse.setCarrierInfoForImsiEncryptionResponse(info);
    }

    public void setSimCardPowerResponse_1_1(RadioResponseInfo info) {
        mResponse.setSimCardPowerResponse_1_1(info);
    }

    public void startNetworkScanResponse(RadioResponseInfo info) {
        mResponse.startNetworkScanResponse(info);
    }

    public void stopNetworkScanResponse(RadioResponseInfo info) {
        mResponse.stopNetworkScanResponse(info);
    }

    public void startKeepaliveResponse(RadioResponseInfo info, KeepaliveStatus status) {
        mResponse.startKeepaliveResponse(info, status);
    }

    public void stopKeepaliveResponse(RadioResponseInfo info) {
        mResponse.stopKeepaliveResponse(info);
    }
    //-- Radio V1_1

    //++Radio V1_2
    public void getCellInfoListResponse_1_2(RadioResponseInfo info, ArrayList<android.hardware.radio.V1_2.CellInfo> cellInfo) {
        mResponse.getCellInfoListResponse_1_2(info, cellInfo);
    }
    public void getIccCardStatusResponse_1_2(RadioResponseInfo info, android.hardware.radio.V1_2.CardStatus cardStatus) {
        mResponse.getIccCardStatusResponse_1_2(info, cardStatus);
    }
    public void setSignalStrengthReportingCriteriaResponse(RadioResponseInfo info) {
        mResponse.setSignalStrengthReportingCriteriaResponse(info);
    }
    public void setLinkCapacityReportingCriteriaResponse(RadioResponseInfo info) {
        mResponse.setLinkCapacityReportingCriteriaResponse(info);
    }
    public void getCurrentCallsResponse_1_2(RadioResponseInfo info, ArrayList<android.hardware.radio.V1_2.Call> calls) {
        mResponse.getCurrentCallsResponse_1_2(info, calls);
    }
    public void getSignalStrengthResponse_1_2(RadioResponseInfo info, android.hardware.radio.V1_2.SignalStrength signalStrength) {
        mResponse.getSignalStrengthResponse_1_2(info, signalStrength);
    }
    public void getVoiceRegistrationStateResponse_1_2(RadioResponseInfo info, android.hardware.radio.V1_2.VoiceRegStateResult voiceRegResponse) {
        mResponse.getVoiceRegistrationStateResponse_1_2(info, voiceRegResponse);
    }
    public void getDataRegistrationStateResponse_1_2(RadioResponseInfo info, android.hardware.radio.V1_2.DataRegStateResult dataRegResponse) {
        mResponse.getDataRegistrationStateResponse_1_2(info, dataRegResponse);
    }
    //-- Radio V1_2
    public void secGetIccCardStatusReponse(RadioResponseInfo info, SecCardStatus cardStatus) {}
    public void secSupplyNetworkDepersonalizationResponse(RadioResponseInfo info, int remainingRetries) {}
    public void secAcceptCallResponse(RadioResponseInfo info) {}
    public void secDialResponse(RadioResponseInfo info) {}
    public void secGetCurrentCallsResponse(RadioResponseInfo info, ArrayList<SecCall> calls) {}
    public void secGetSignalStrengthResponse(RadioResponseInfo info, SecSignalStrength sigStrength) {}
    public void secGetVoiceRegistrationStateResponse(RadioResponseInfo info, SecVoiceRegStateResult voiceRegResponse) {}
    public void secGetDataRegistrationStateResponse(RadioResponseInfo info, SecDataRegStateResult dataRegResponse) {}
    public void secExplicitCallTransferResponse(RadioResponseInfo info) {}
    public void secGetOperatorRespnse(RadioResponseInfo info, String longName, String shortName, String plmn, String epdgname) {}
    public void oemSetBarringPasswordResponse(RadioResponseInfo info) {}
    public void secgetImsRegistrationStateReponse(RadioResponseInfo info, ArrayList<Integer> regState) {}
    public void secGetAvailableNetworkResponse(RadioResponseInfo info, ArrayList<SecOperatorInfo> networkInfo) {}
    public void oemDialEmergencyCallResponse(RadioResponseInfo info) {}
    public void oemCallDeflectionResponse(RadioResponseInfo info) {}
    public void oemModifyCallInitiateResponse(RadioResponseInfo info, LastCallFailCauseInfo failCauseInfo) {}
    public void oemSetImsCallListResponse(RadioResponseInfo info) {}
    public void oemGetPreferredNetworkListResponse(RadioResponseInfo info, ArrayList<OemPreferredNetworkInfo> infos) {}
    public void oemSetPreferredNetworkListResponse(RadioResponseInfo info) {}
    public void oemSendEncodedUSSDResponse(RadioResponseInfo info) {}
    public void oemHoldCallResponse(RadioResponseInfo info) {}
    public void oemGetDisable2gResponse(RadioResponseInfo info, int isDisable) {}
    public void oemSetDisable2gResponse(RadioResponseInfo info) {}
    public void oenGetAcbInfoResponse(RadioResponseInfo info, ArrayList<Integer> acbInfo) {}
    public void oemSetTransferCallResponse(RadioResponseInfo info) {}
    public void oemGetICBarringResponse(RadioResponseInfo info, String numberDateList) {}
    public void oemSetICBarringResponse(RadioResponseInfo info) {}
    public void oemQueryCnapResponse(RadioResponseInfo info, int queryCNAP) {}
    public void oemRefreshNitzTimeResponse(RadioResponseInfo info) {}
    public void oemEnableUnsolResponseResponse(RadioResponseInfo info) {}
    public void oemCancelTransferCallResponse(RadioResponseInfo info) {}
    public void oemAcknowledgeRilConnectedResponse(RadioResponseInfo info) {}
    public void oemGetPhoneBookStorageInfoResponse(RadioResponseInfo info, ArrayList<Integer> phoneBookInfo) {}
    public void oemUsimPbCapaResponse(RadioResponseInfo info, ArrayList<Integer> usimPbCapa) {}
    public void oemSetSimPowerResponse(RadioResponseInfo info, int power) {}
    public void oemSetSimOnOffResponse(RadioResponseInfo info) {}
    public void oemSetSimInitEventResponse(RadioResponseInfo info) {}
    public void oemGetSimLockInfoResponse(RadioResponseInfo info, ArrayList<Integer> simLockInfO) {}
    public void oemSupplyIccPersoResponse(RadioResponseInfo info) {}
    public void oemChangeIccPersoResponse(RadioResponseInfo info) {}
    public void oemGetPhoneBookEntryResponse(RadioResponseInfo info, OemSimPBResponse SimPBResponseInfo) {}
    public void oemAccessPhoneBookEntryResponse(RadioResponseInfo info, int SimPbAccessResp) {}
    public void oemGetCellBroadcastConfigResponse(RadioResponseInfo info, OemCbConfigArgs configs) {}
    public void oemEmergencySearchResponse(RadioResponseInfo info, int respEmergencySearch) {}
    public void oemEmergencyControlResponse(RadioResponseInfo info) {}
    public void oemGetAtrResponse(RadioResponseInfo info, String atr) {}
    public void oemSendCdmaSmsExpectMoreResponse(RadioResponseInfo info, SecSendSmsResult sms) {}
    public void secSendSmsResponse(RadioResponseInfo info, SecSendSmsResult sms) {}
    public void secSendSMSExpectMoreResponse(RadioResponseInfo info, SecSendSmsResult sms) {}
    public void secSendCdmaSmsResponse(RadioResponseInfo info, SecSendSmsResult sms) {}
    public void secSendImsSmsResponse(RadioResponseInfo info, SecSendSmsResult sms) {}
    public void secSetDataAllowedResponse(RadioResponseInfo info) {}
    public void secGetCdmaRoamingPreferenceResponse(RadioResponseInfo info, int n, int m) {}
    public void secEnable5gResponse(RadioResponseInfo info) {}
    public void secDisable5gResponse(RadioResponseInfo info) {}
    public void secQuery5gStatusResponse(RadioResponseInfo info) {}
    public void secQueryNrDcParamResponse(RadioResponseInfo info, DcParam endcDcnr) {}
    public void secQueryNrBearerAllocationResponse(RadioResponseInfo info, int bearerStatus) {}
    public void secQueryNrSignalStrengthResponse(RadioResponseInfo info, NrSignalStrength nrSignalStrength) {}
    public void oemQueryCsgListResponse(RadioResponseInfo info, ArrayList<OemCsgInfo> csgInfos) {}
    public void oemSelectCsgManualResponse(RadioResponseInfo info) {}
}
