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

import vendor.mediatek.hardware.radio.V2_0.IRadioResponse;
import vendor.mediatek.hardware.radio.V2_0.MtkSetupDataCallResult;

public class MtkRadioResponse extends IRadioResponse.Stub {
    RIL mRil;
    RadioResponse mResponse;

    MtkRadioResponse(RIL ril, RadioResponse response) {
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

    //++ MTK Radio V2_0
    public void setTrmResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setTrmResponse not implemented");
    }

    public void getATRResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getATRResponse not implemented");
    }

    public void setSimPowerResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setSimPowerResponse not implemented");
    }

    public void setModemPowerResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setModemPowerResponse not implemented");
    }

    public void hangupAllResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< hangupAllResponse not implemented");
    }

    public void setCallIndicationResponse(RadioResponseInfo info) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setCallIndicationResponse");
      mResponse.responseVoid(info);
    }

    public void emergencyDialResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< emergencyDialResponse not implemented");
    }

    public void setEccServiceCategoryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setEccServiceCategoryResponse not implemented");
    }

    public void setEccListResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setEccListResponse not implemented");
    }

    public void vtDialResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< vtDialResponse not implemented");
    }

    public void voiceAcceptResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< voiceAcceptResponse not implemented");
    }

    public void replaceVtCallResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< replaceVtCallResponse not implemented");
    }

    public void setNetworkSelectionModeManualWithActResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setNetworkSelectionModeManualWithActResponse not implemented");
    }

    public void getAvailableNetworksWithActResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getAvailableNetworksWithActResponse not implemented");
    }

    public void cancelAvailableNetworksResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< cancelAvailableNetworksResponse not implemented");
    }

    public void currentStatusResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< currentStatusResponse not implemented");
    }

    public void eccPreferredRatResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< eccPreferredRatResponse not implemented");
    }

    public void getSmsParametersResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getSmsParametersResponse not implemented");
    }

    public void setSmsParametersResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setSmsParametersResponse not implemented");
    }

    public void getSmsMemStatusResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getSmsMemStatusResponse not implemented");
    }

    public void setEtwsResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setEtwsResponse not implemented");
    }

    public void removeCbMsgResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< removeCbMsgResponse not implemented");
    }

    public void setGsmBroadcastLangsResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setGsmBroadcastLangsResponse not implemented");
    }

    public void getGsmBroadcastLangsResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getGsmBroadcastLangsResponse not implemented");
    }

    public void getGsmBroadcastActivationRsp() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getGsmBroadcastActivationRsp not implemented");
    }

    public void sendEmbmsAtCommandResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< sendEmbmsAtCommandResponse not implemented");
    }

    public void setupDataCallResponseEx(RadioResponseInfo responseInfo,
        MtkSetupDataCallResult setupDataCallResult) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setupDataCallResponse");
        mResponse.setupDataCallResponse(responseInfo, setupDataCallResult.dcr);
    }

    public void getDataCallListResponseEx(RadioResponseInfo info,
        ArrayList<MtkSetupDataCallResult> mtkDcList) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getDataCallListResponseEx");
        ArrayList<SetupDataCallResult> dcList = new ArrayList<SetupDataCallResult>();
        mtkDcList.forEach(entry -> dcList.add(entry.dcr));
        mResponse.getDataCallListResponse(info, dcList);
    }

    public void setApcModeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setApcModeResponse not implemented");
    }

    public void getApcInfoResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getApcInfoResponse not implemented");
    }

    public void triggerModeSwitchByEccResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< triggerModeSwitchByEccResponse not implemented");
    }

    public void getSmsRuimMemoryStatusResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getSmsRuimMemoryStatusResponse not implemented");
    }

    public void setFdModeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setFdModeResponse not implemented");
    }

    public void setResumeRegistrationResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setResumeRegistrationResponse not implemented");
    }

    public void storeModemTypeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< storeModemTypeResponse not implemented");
    }

    public void reloadModemTypeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< reloadModemTypeResponse not implemented");
    }

    public void handleStkCallSetupRequestFromSimWithResCodeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< handleStkCallSetupRequestFromSimWithResCodeResponse not implemented");
    }

    public void getFemtocellListResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getFemtocellListResponse not implemented");
    }

    public void abortFemtocellListResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< abortFemtocellListResponse not implemented");
    }

    public void selectFemtocellResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< selectFemtocellResponse not implemented");
    }

    public void queryFemtoCellSystemSelectionModeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< queryFemtoCellSystemSelectionModeResponse not implemented");
    }

    public void setFemtoCellSystemSelectionModeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setFemtoCellSystemSelectionModeResponse not implemented");
    }

    public void setClipResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setClipResponse not implemented");
    }

    public void getColpResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getColpResponse not implemented");
    }

    public void getColrResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getColrResponse not implemented");
    }

    public void sendCnapResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< sendCnapResponse not implemented");
    }

    public void setColpResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setColpResponse not implemented");
    }

    public void setColrResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setColrResponse not implemented");
    }

    public void queryCallForwardInTimeSlotStatusResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< queryCallForwardInTimeSlotStatusResponse not implemented");
    }

    public void setCallForwardInTimeSlotResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setCallForwardInTimeSlotResponse not implemented");
    }

    public void runGbaAuthenticationResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< runGbaAuthenticationResponse not implemented");
    }

    public void queryPhbStorageInfoResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< queryPhbStorageInfoResponse not implemented");
    }

    public void writePhbEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< writePhbEntryResponse not implemented");
    }

    public void readPhbEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readPhbEntryResponse not implemented");
    }

    public void queryUPBCapabilityResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< queryUPBCapabilityResponse not implemented");
    }

    public void editUPBEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< editUPBEntryResponse not implemented");
    }

    public void deleteUPBEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< deleteUPBEntryResponse not implemented");
    }

    public void readUPBGasListResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readUPBGasListResponse not implemented");
    }

    public void readUPBGrpEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readUPBGrpEntryResponse not implemented");
    }

    public void writeUPBGrpEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< writeUPBGrpEntryResponse not implemented");
    }

    public void getPhoneBookStringsLengthResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getPhoneBookStringsLengthResponse not implemented");
    }

    public void getPhoneBookMemStorageResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getPhoneBookMemStorageResponse not implemented");
    }

    public void setPhoneBookMemStorageResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setPhoneBookMemStorageResponse not implemented");
    }

    public void readPhoneBookEntryExtResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readPhoneBookEntryExtResponse not implemented");
    }

    public void writePhoneBookEntryExtResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< writePhoneBookEntryExtResponse not implemented");
    }

    public void queryUPBAvailableResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< queryUPBAvailableResponse not implemented");
    }

    public void readUPBEmailEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readUPBEmailEntryResponse not implemented");
    }

    public void readUPBSneEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readUPBSneEntryResponse not implemented");
    }

    public void readUPBAnrEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readUPBAnrEntryResponse not implemented");
    }

    public void readUPBAasListResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< readUPBAasListResponse not implemented");
    }

    public void queryNetworkLockResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< queryNetworkLockResponse not implemented");
    }

    public void setNetworkLockResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setNetworkLockResponse not implemented");
    }

    public void resetRadioResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< resetRadioResponse not implemented");
    }

    public void syncDataSettingsToMdResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< syncDataSettingsToMdResponse not implemented");
    }

    public void resetMdDataRetryCountResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< resetMdDataRetryCountResponse not implemented");
    }

    public void setRemoveRestrictEutranModeResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setRemoveRestrictEutranModeResponse not implemented");
    }

    public void setLteAccessStratumReportResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setLteAccessStratumReportResponse not implemented");
    }

    public void setLteUplinkDataTransferResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setLteUplinkDataTransferResponse not implemented");
    }

    public void setRxTestConfigResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setRxTestConfigResponse not implemented");
    }

    public void getRxTestResultResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getRxTestResultResponse not implemented");
    }

    public void getPOLCapabilityResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getPOLCapabilityResponse not implemented");
    }

    public void getCurrentPOLListResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getCurrentPOLListResponse not implemented");
    }

    public void setPOLEntryResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setPOLEntryResponse not implemented");
    }

    public void setRoamingEnableResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setRoamingEnableResponse not implemented");
    }

    public void getRoamingEnableResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< getRoamingEnableResponse not implemented");
    }

    public void vsimNotificationResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< vsimNotificationResponse not implemented");
    }

    public void vsimOperationResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< vsimOperationResponse not implemented");
    }

    public void setWifiEnabledResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setWifiEnabledResponse not implemented");
    }

    public void setWifiAssociatedResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setWifiAssociatedResponse not implemented");
    }

    public void setWifiSignalLevelResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setWifiSignalLevelResponse not implemented");
    }

    public void setWifiIpAddressResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setWifiIpAddressResponse not implemented");
    }

    public void setLocationInfoResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setLocationInfoResponse not implemented");
    }

    public void setEmergencyAddressIdResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setEmergencyAddressIdResponse not implemented");
    }

    public void setNattKeepAliveStatusResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setNattKeepAliveStatusResponse not implemented");
    }

    public void setE911StateResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setE911StateResponse not implemented");
    }

    public void setServiceStateToModemResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< setServiceStateToModemResponse not implemented");
    }

    public void sendRequestRawResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< sendRequestRawResponse not implemented");
    }

    public void sendRequestStringsResponse() {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< sendRequestStringsResponse not implemented");
    }
    //-- MTK Radio V2_0
}
