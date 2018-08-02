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

import android.content.Context;
import android.hardware.radio.V1_0.ActivityStatsInfo;
import android.hardware.radio.V1_0.AppStatus;
import android.hardware.radio.V1_0.CardStatus;
import android.hardware.radio.V1_0.CarrierRestrictions;
import android.hardware.radio.V1_0.CdmaBroadcastSmsConfigInfo;
import android.hardware.radio.V1_0.DataRegStateResult;
import android.hardware.radio.V1_0.GsmBroadcastSmsConfigInfo;
import android.hardware.radio.V1_0.LastCallFailCauseInfo;
import android.hardware.radio.V1_0.LceDataInfo;
import android.hardware.radio.V1_0.LceStatusInfo;
import android.hardware.radio.V1_0.NeighboringCell;
import android.hardware.radio.V1_0.RadioError;
import android.hardware.radio.V1_0.RadioResponseInfo;
import android.hardware.radio.V1_0.SendSmsResult;
import android.hardware.radio.V1_0.SetupDataCallResult;
import android.hardware.radio.V1_0.VoiceRegStateResult;
import android.hardware.radio.V1_1.KeepaliveStatus;
import android.os.AsyncResult;
import android.os.Message;
import android.os.SystemClock;
import android.service.carrier.CarrierIdentifier;
import android.telephony.CellInfo;
import android.telephony.ModemActivityInfo;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneNumberUtils;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import vendor.mediatek.hardware.radio.V2_0.CallForwardInfoEx;
import vendor.mediatek.hardware.radio.V2_0.IRadioResponse;
import vendor.mediatek.hardware.radio.V2_0.MtkSetupDataCallResult;
import vendor.mediatek.hardware.radio.V2_0.OperatorInfoWithAct;
import vendor.mediatek.hardware.radio.V2_0.PhbEntryExt;
import vendor.mediatek.hardware.radio.V2_0.PhbEntryStructure;
import vendor.mediatek.hardware.radio.V2_0.PhbMemStorageResponse;
import vendor.mediatek.hardware.radio.V2_0.SmsMemStatus;
import vendor.mediatek.hardware.radio.V2_0.SmsParams;
import vendor.mediatek.hardware.radio.V2_0.VsimEvent;
import android.hardware.radio.V1_0.IccIoResult;

import com.android.internal.telephony.dataconnection.DataCallResponse;
import com.android.internal.telephony.gsm.SmsBroadcastConfigInfo;
import com.android.internal.telephony.uicc.IccCardApplicationStatus;
import com.android.internal.telephony.uicc.IccCardStatus;
//import com.android.internal.telephony.uicc.IccIoResult;
import com.android.internal.telephony.uicc.IccUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MtkRadioResponse extends IRadioResponse.Stub {
    RIL mRil;
    RadioResponse mResp;

    public MtkRadioResponse(RIL ril, RadioResponse resp) {
        mRil = ril;
        mResp = resp;
    }

    public void setNetworkSelectionModeManualWithActResponse(RadioResponseInfo p0) {
    }
    public void setSimPowerResponse(RadioResponseInfo p0) {
    }
    public void deleteUPBEntryResponse(RadioResponseInfo p0) {
    }
    public void setColrResponse(RadioResponseInfo p0) {
    }
    public void getPhoneBookStringsLengthResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void writePhbEntryResponse(RadioResponseInfo p0) {
    }
    public void setRoamingEnableResponse(RadioResponseInfo p0) {
    }
    public void writePhoneBookEntryExtResponse(RadioResponseInfo p0) {
    }
    public void eccPreferredRatResponse(RadioResponseInfo p0) {
    }
    public void replaceVtCallResponse(RadioResponseInfo p0) {
    }
    public void readUPBEmailEntryResponse(RadioResponseInfo p0, String p1) {
    }
    public void getFemtocellListResponse(RadioResponseInfo p0, ArrayList<String> p1) {
    }
    public void triggerModeSwitchByEccResponse(RadioResponseInfo p0) {
    }
    public void getGsmBroadcastLangsResponse(RadioResponseInfo p0, String p1) {
    }
    public void selectFemtocellResponse(RadioResponseInfo p0) {
    }
    public void getPOLCapabilityResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void readPhoneBookEntryExtResponse(RadioResponseInfo p0, ArrayList<PhbEntryExt> p1) {
    }
    public void setEccServiceCategoryResponse(RadioResponseInfo p0) {
    }
    public void removeCbMsgResponse(RadioResponseInfo p0) {
    }
    public void setWifiIpAddressResponse(RadioResponseInfo p0) {
    }
    public void setEtwsResponse(RadioResponseInfo p0) {
    }
    public void setLteAccessStratumReportResponse(RadioResponseInfo p0) {
    }
    public void setE911StateResponse(RadioResponseInfo p0) {
    }
    public void setApcModeResponse(RadioResponseInfo p0) {
    }
    public void setModemPowerResponse(RadioResponseInfo p0) {
    }
    public void setRxTestConfigResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void writeUPBGrpEntryResponse(RadioResponseInfo p0) {
    }
    public void readUPBAnrEntryResponse(RadioResponseInfo p0, ArrayList<PhbEntryStructure> p1) {
    }
    public void readPhbEntryResponse(RadioResponseInfo p0, ArrayList<PhbEntryStructure> p1) {
    }
    public void voiceAcceptResponse(RadioResponseInfo p0) {
    }
    public void vsimNotificationResponse(RadioResponseInfo p0, VsimEvent p1) {
    }
    public void setGsmBroadcastLangsResponse(RadioResponseInfo p0) {
    }
    public void syncDataSettingsToMdResponse(RadioResponseInfo p0) {
    }
    public void sendCnapResponse(RadioResponseInfo p0, int p1, int p2) {
    }
    public void queryPhbStorageInfoResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void setResumeRegistrationResponse(RadioResponseInfo p0) {
    }
    public void setFemtoCellSystemSelectionModeResponse(RadioResponseInfo p0) {
    }
    public void sendRequestRawResponse(RadioResponseInfo p0, ArrayList<Byte> p1) {
    }
    public void sendEmbmsAtCommandResponse(RadioResponseInfo p0, String p1) {
    }
    public void setPhoneBookMemStorageResponse(RadioResponseInfo p0) {
    }
    public void readUPBGasListResponse(RadioResponseInfo p0, ArrayList<String> p1) {
    }
    public void readUPBAasListResponse(RadioResponseInfo p0, ArrayList<String> p1) {
    }
    public void getSmsParametersResponse(RadioResponseInfo p0, SmsParams p1) {
    }
    public void currentStatusResponse(RadioResponseInfo p0) {
    }
    public void setClipResponse(RadioResponseInfo p0) {
    }
    public void getPhoneBookMemStorageResponse(RadioResponseInfo p0, PhbMemStorageResponse p1) {
    }
    public void readUPBGrpEntryResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void getRxTestResultResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void getApcInfoResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void setCallIndicationResponse(RadioResponseInfo p0) {
    }
    public void queryCallForwardInTimeSlotStatusResponse(RadioResponseInfo p0, ArrayList<CallForwardInfoEx> p1) {
    }
    public void getColrResponse(RadioResponseInfo p0, int p2) {
    }
    public void setWifiSignalLevelResponse(RadioResponseInfo p0) {
    }
    public void cancelAvailableNetworksResponse(RadioResponseInfo p0) {
    }
    public void setLocationInfoResponse(RadioResponseInfo p0) {
    }
    public void setEmergencyAddressIdResponse(RadioResponseInfo p0) {
    }
    public void setNetworkLockResponse(RadioResponseInfo p0) {
    }
    public void editUPBEntryResponse(RadioResponseInfo p0) {
    }
    public void getSmsMemStatusResponse(RadioResponseInfo p0, SmsMemStatus p1) {
    }
    public void getDataCallListResponseEx(RadioResponseInfo p0, ArrayList<MtkSetupDataCallResult> p1) {
    }
    public void resetMdDataRetryCountResponse(RadioResponseInfo p0) {
    }
    public void setLteUplinkDataTransferResponse(RadioResponseInfo p0) {
    }
    public void setEccListResponse(RadioResponseInfo p0) {
    }
    public void vsimOperationResponse(RadioResponseInfo p0) {
    }
    public void hangupAllResponse(RadioResponseInfo p0) {
    }
    public void setSmsParametersResponse(RadioResponseInfo p0) {
    }
    public void getCurrentPOLListResponse(RadioResponseInfo p0, ArrayList<String> p1) {
    }
    public void runGbaAuthenticationResponse(RadioResponseInfo p0, ArrayList<String> p1) {
    }
    public void readUPBSneEntryResponse(RadioResponseInfo p0, String p1) {
    }
    public void getGsmBroadcastActivationRsp(RadioResponseInfo p0, int p1) {
    }
    public void queryNetworkLockResponse(RadioResponseInfo p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {
    }
    public void getRoamingEnableResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void setFdModeResponse(RadioResponseInfo p0) {
    }
    public void emergencyDialResponse(RadioResponseInfo p0) {
    }
    public void getSmsRuimMemoryStatusResponse(RadioResponseInfo p0, SmsMemStatus p1) {
    }
    public void getAvailableNetworksWithActResponse(RadioResponseInfo p0, ArrayList<OperatorInfoWithAct> p1) {
    }
    public void setCallForwardInTimeSlotResponse(RadioResponseInfo p0) {
    }
    public void vtDialResponse(RadioResponseInfo p0) {
    }
    public void sendRequestStringsResponse(RadioResponseInfo p0, ArrayList<String> p1) {
    }
    public void getATRResponse(RadioResponseInfo p0, String p1) {
    }
    public void handleStkCallSetupRequestFromSimWithResCodeResponse(RadioResponseInfo p0) {
    }
    public void setWifiAssociatedResponse(RadioResponseInfo p0) {
    }
    public void reloadModemTypeResponse(RadioResponseInfo p0) {
    }
    public void setNattKeepAliveStatusResponse(RadioResponseInfo p0) {
    }
    public void setPOLEntryResponse(RadioResponseInfo p0) {
    }
    public void setTrmResponse(RadioResponseInfo p0) {
    }
    public void queryFemtoCellSystemSelectionModeResponse(RadioResponseInfo p0, int p1) {
    }
    public void setColpResponse(RadioResponseInfo p0) {
    }
    public void setRemoveRestrictEutranModeResponse(RadioResponseInfo p0) {
    }
    public void getColpResponse(RadioResponseInfo p0, int p1, int p2) {
    }
    public void queryUPBCapabilityResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void queryUPBAvailableResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
    }
    public void storeModemTypeResponse(RadioResponseInfo p0) {
    }
    public void setupDataCallResponseEx(RadioResponseInfo p0, MtkSetupDataCallResult p1) {
    }
    public void abortFemtocellListResponse(RadioResponseInfo p0) {
    }
    public void setWifiEnabledResponse(RadioResponseInfo p0) {
    }
    public void resetRadioResponse(RadioResponseInfo p0) {
    }
    public void setServiceStateToModemResponse(RadioResponseInfo p0) {
    }


    /*
     * sed -nE 's/([^(]*)\(([^ ]*)\)/public void \1\(\2 p0\) {\n\tmResp.\1\(p0\);\n}/p'
     */
    public void setGsmBroadcastActivationResponse(RadioResponseInfo p0) {
        mResp.setGsmBroadcastActivationResponse(p0);
    }
    public void setDataProfileResponse(RadioResponseInfo p0) {
        mResp.setDataProfileResponse(p0);
    }
    public void setInitialAttachApnResponse(RadioResponseInfo p0) {
        mResp.setInitialAttachApnResponse(p0);
    }
    public void setCdmaSubscriptionSourceResponse(RadioResponseInfo p0) {
        mResp.setCdmaSubscriptionSourceResponse(p0);
    }
    public void nvWriteCdmaPrlResponse(RadioResponseInfo p0) {
        mResp.nvWriteCdmaPrlResponse(p0);
    }
    public void setSimCardPowerResponse_1_1(RadioResponseInfo p0) {
        mResp.setSimCardPowerResponse_1_1(p0);
    }
    public void sendBurstDtmfResponse(RadioResponseInfo p0) {
        mResp.sendBurstDtmfResponse(p0);
    }
    public void setLocationUpdatesResponse(RadioResponseInfo p0) {
        mResp.setLocationUpdatesResponse(p0);
    }
    public void requestShutdownResponse(RadioResponseInfo p0) {
        mResp.requestShutdownResponse(p0);
    }
    public void setGsmBroadcastConfigResponse(RadioResponseInfo p0) {
        mResp.setGsmBroadcastConfigResponse(p0);
    }
    public void setCellInfoListRateResponse(RadioResponseInfo p0) {
        mResp.setCellInfoListRateResponse(p0);
    }
    public void stopKeepaliveResponse(RadioResponseInfo p0) {
        mResp.stopKeepaliveResponse(p0);
    }
    public void setUiccSubscriptionResponse(RadioResponseInfo p0) {
        mResp.setUiccSubscriptionResponse(p0);
    }
    public void reportSmsMemoryStatusResponse(RadioResponseInfo p0) {
        mResp.reportSmsMemoryStatusResponse(p0);
    }
    public void setDataAllowedResponse(RadioResponseInfo p0) {
        mResp.setDataAllowedResponse(p0);
    }
    public void iccCloseLogicalChannelResponse(RadioResponseInfo p0) {
        mResp.iccCloseLogicalChannelResponse(p0);
    }
    public void nvResetConfigResponse(RadioResponseInfo p0) {
        mResp.nvResetConfigResponse(p0);
    }
    public void explicitCallTransferResponse(RadioResponseInfo p0) {
        mResp.explicitCallTransferResponse(p0);
    }
    public void setCdmaBroadcastConfigResponse(RadioResponseInfo p0) {
        mResp.setCdmaBroadcastConfigResponse(p0);
    }
    public void setCdmaRoamingPreferenceResponse(RadioResponseInfo p0) {
        mResp.setCdmaRoamingPreferenceResponse(p0);
    }
    public void reportStkServiceIsRunningResponse(RadioResponseInfo p0) {
        mResp.reportStkServiceIsRunningResponse(p0);
    }
    public void setCarrierInfoForImsiEncryptionResponse(RadioResponseInfo p0) {
        mResp.setCarrierInfoForImsiEncryptionResponse(p0);
    }
    public void sendCDMAFeatureCodeResponse(RadioResponseInfo p0) {
        mResp.sendCDMAFeatureCodeResponse(p0);
    }
    public void setTTYModeResponse(RadioResponseInfo p0) {
        mResp.setTTYModeResponse(p0);
    }
    public void acknowledgeLastIncomingCdmaSmsResponse(RadioResponseInfo p0) {
        mResp.acknowledgeLastIncomingCdmaSmsResponse(p0);
    }
    public void deleteSmsOnRuimResponse(RadioResponseInfo p0) {
        mResp.deleteSmsOnRuimResponse(p0);
    }
    public void sendDeviceStateResponse(RadioResponseInfo p0) {
        mResp.sendDeviceStateResponse(p0);
    }
    public void setCdmaBroadcastActivationResponse(RadioResponseInfo p0) {
        mResp.setCdmaBroadcastActivationResponse(p0);
    }
    public void setPreferredNetworkTypeResponse(RadioResponseInfo p0) {
        mResp.setPreferredNetworkTypeResponse(p0);
    }
    public void handleStkCallSetupRequestFromSimResponse(RadioResponseInfo p0) {
        mResp.handleStkCallSetupRequestFromSimResponse(p0);
    }
    public void setSimCardPowerResponse(RadioResponseInfo p0) {
        mResp.setSimCardPowerResponse(p0);
    }
    public void setSmscAddressResponse(RadioResponseInfo p0) {
        mResp.setSmscAddressResponse(p0);
    }
    public void nvWriteItemResponse(RadioResponseInfo p0) {
        mResp.nvWriteItemResponse(p0);
    }
    public void setIndicationFilterResponse(RadioResponseInfo p0) {
        mResp.setIndicationFilterResponse(p0);
    }
    public void setPreferredVoicePrivacyResponse(RadioResponseInfo p0) {
        mResp.setPreferredVoicePrivacyResponse(p0);
    }
    public void acknowledgeIncomingGsmSmsWithPduResponse(RadioResponseInfo p0) {
        mResp.acknowledgeIncomingGsmSmsWithPduResponse(p0);
    }
    public void exitEmergencyCallbackModeResponse(RadioResponseInfo p0) {
        mResp.exitEmergencyCallbackModeResponse(p0);
    }
    public void acknowledgeRequest(int p0) {
        mResp.acknowledgeRequest(p0);
    }
    public void hangupWaitingOrBackgroundResponse(RadioResponseInfo p0) {
        mResp.hangupWaitingOrBackgroundResponse(p0);
    }
    public void hangupForegroundResumeBackgroundResponse(RadioResponseInfo p0) {
        mResp.hangupForegroundResumeBackgroundResponse(p0);
    }
    public void setSuppServiceNotificationsResponse(RadioResponseInfo p0) {
        mResp.setSuppServiceNotificationsResponse(p0);
    }
    public void setNetworkSelectionModeAutomaticResponse(RadioResponseInfo p0) {
        mResp.setNetworkSelectionModeAutomaticResponse(p0);
    }
    public void deleteSmsOnSimResponse(RadioResponseInfo p0) {
        mResp.deleteSmsOnSimResponse(p0);
    }
    public void setCallWaitingResponse(RadioResponseInfo p0) {
        mResp.setCallWaitingResponse(p0);
    }
    public void cancelPendingUssdResponse(RadioResponseInfo p0) {
        mResp.cancelPendingUssdResponse(p0);
    }
    public void stopDtmfResponse(RadioResponseInfo p0) {
        mResp.stopDtmfResponse(p0);
    }
    public void switchWaitingOrHoldingAndActiveResponse(RadioResponseInfo p0) {
        mResp.switchWaitingOrHoldingAndActiveResponse(p0);
    }
    public void setClirResponse(RadioResponseInfo p0) {
        mResp.setClirResponse(p0);
    }
    public void setCallForwardResponse(RadioResponseInfo p0) {
        mResp.setCallForwardResponse(p0);
    }
    public void conferenceResponse(RadioResponseInfo p0) {
        mResp.conferenceResponse(p0);
    }
    public void hangupConnectionResponse(RadioResponseInfo p0) {
        mResp.hangupConnectionResponse(p0);
    }
    public void sendTerminalResponseToSimResponse(RadioResponseInfo p0) {
        mResp.sendTerminalResponseToSimResponse(p0);
    }
    public void setBandModeResponse(RadioResponseInfo p0) {
        mResp.setBandModeResponse(p0);
    }
    public void acceptCallResponse(RadioResponseInfo p0) {
        mResp.acceptCallResponse(p0);
    }
    public void stopNetworkScanResponse(RadioResponseInfo p0) {
        mResp.stopNetworkScanResponse(p0);
    }
    public void setMuteResponse(RadioResponseInfo p0) {
        mResp.setMuteResponse(p0);
    }
    public void dialResponse(RadioResponseInfo p0) {
        mResp.dialResponse(p0);
    }
    public void setBarringPasswordResponse(RadioResponseInfo p0) {
        mResp.setBarringPasswordResponse(p0);
    }
    public void setNetworkSelectionModeManualResponse(RadioResponseInfo p0) {
        mResp.setNetworkSelectionModeManualResponse(p0);
    }
    public void sendUssdResponse(RadioResponseInfo p0) {
        mResp.sendUssdResponse(p0);
    }
    public void sendDtmfResponse(RadioResponseInfo p0) {
        mResp.sendDtmfResponse(p0);
    }
    public void acknowledgeLastIncomingGsmSmsResponse(RadioResponseInfo p0) {
        mResp.acknowledgeLastIncomingGsmSmsResponse(p0);
    }
    public void setRadioPowerResponse(RadioResponseInfo p0) {
        mResp.setRadioPowerResponse(p0);
    }
    public void startNetworkScanResponse(RadioResponseInfo p0) {
        mResp.startNetworkScanResponse(p0);
    }
    public void separateConnectionResponse(RadioResponseInfo p0) {
        mResp.separateConnectionResponse(p0);
    }
    public void startDtmfResponse(RadioResponseInfo p0) {
        mResp.startDtmfResponse(p0);
    }
    public void rejectCallResponse(RadioResponseInfo p0) {
        mResp.rejectCallResponse(p0);
    }
    public void deactivateDataCallResponse(RadioResponseInfo p0) {
        mResp.deactivateDataCallResponse(p0);
    }


    /*
     * sed -nE 's/([^(]*)\(([^ ]*), ([^ ]*)\)/public void \1\(\2 p0, \3 p1\) {\n\tmResp.\1\(p0, p1\);\n}/p'
     */
    public void getIMSIForAppResponse(RadioResponseInfo p0, String p1) {
        mResp.getIMSIForAppResponse(p0, p1);
    }
    public void getDataCallListResponse(RadioResponseInfo p0, ArrayList<SetupDataCallResult> p1) {
        mResp.getDataCallListResponse(p0, p1);
    }
    public void getCurrentCallsResponse(RadioResponseInfo p0, ArrayList<android.hardware.radio.V1_0.Call> p1) {
        mResp.getCurrentCallsResponse(p0, p1);
    }
    public void supplyIccPukForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.supplyIccPukForAppResponse(p0, p1);
    }
    public void getFacilityLockForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.getFacilityLockForAppResponse(p0, p1);
    }
    public void writeSmsToSimResponse(RadioResponseInfo p0, int p1) {
        mResp.writeSmsToSimResponse(p0, p1);
    }
    public void changeIccPin2ForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.changeIccPin2ForAppResponse(p0, p1);
    }
    public void supplyIccPuk2ForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.supplyIccPuk2ForAppResponse(p0, p1);
    }
    public void supplyIccPinForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.supplyIccPinForAppResponse(p0, p1);
    }
    public void getLastCallFailCauseResponse(RadioResponseInfo p0, LastCallFailCauseInfo p1) {
        mResp.getLastCallFailCauseResponse(p0, p1);
    }
    public void supplyNetworkDepersonalizationResponse(RadioResponseInfo p0, int p1) {
        mResp.supplyNetworkDepersonalizationResponse(p0, p1);
    }
    public void getMuteResponse(RadioResponseInfo p0, boolean p1) {
        mResp.getMuteResponse(p0, p1);
    }
    public void sendEnvelopeResponse(RadioResponseInfo p0, String p1) {
        mResp.sendEnvelopeResponse(p0, p1);
    }
    public void getClipResponse(RadioResponseInfo p0, int p1) {
        mResp.getClipResponse(p0, p1);
    }
    public void sendSMSExpectMoreResponse(RadioResponseInfo p0, SendSmsResult p1) {
        mResp.sendSMSExpectMoreResponse(p0, p1);
    }
    public void getAvailableBandModesResponse(RadioResponseInfo p0, ArrayList<Integer> p1) {
        mResp.getAvailableBandModesResponse(p0, p1);
    }
    public void getBasebandVersionResponse(RadioResponseInfo p0, String p1) {
        mResp.getBasebandVersionResponse(p0, p1);
    }
    public void supplyIccPin2ForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.supplyIccPin2ForAppResponse(p0, p1);
    }
    public void iccIOForAppResponse(RadioResponseInfo p0, IccIoResult p1) {
        mResp.iccIOForAppResponse(p0, p1);
    }
    public void setFacilityLockForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.setFacilityLockForAppResponse(p0, p1);
    }
    public void getCallForwardStatusResponse(RadioResponseInfo p0, ArrayList<android.hardware.radio.V1_0.CallForwardInfo> p1) {
        mResp.getCallForwardStatusResponse(p0, p1);
    }
    public void sendSmsResponse(RadioResponseInfo p0, SendSmsResult p1) {
        mResp.sendSmsResponse(p0, p1);
    }
    public void setupDataCallResponse(RadioResponseInfo p0, SetupDataCallResult p1) {
        mResp.setupDataCallResponse(p0, p1);
    }
    public void getSignalStrengthResponse(RadioResponseInfo p0, android.hardware.radio.V1_0.SignalStrength p1) {
        mResp.getSignalStrengthResponse(p0, p1);
    }
    public void getDataRegistrationStateResponse(RadioResponseInfo p0, DataRegStateResult p1) {
        mResp.getDataRegistrationStateResponse(p0, p1);
    }
    public void changeIccPinForAppResponse(RadioResponseInfo p0, int p1) {
        mResp.changeIccPinForAppResponse(p0, p1);
    }
    public void getNetworkSelectionModeResponse(RadioResponseInfo p0, boolean p1) {
        mResp.getNetworkSelectionModeResponse(p0, p1);
    }
    public void getIccCardStatusResponse(RadioResponseInfo p0, CardStatus p1) {
        mResp.getIccCardStatusResponse(p0, p1);
    }
    public void getAvailableNetworksResponse(RadioResponseInfo p0, ArrayList<android.hardware.radio.V1_0.OperatorInfo> p1) {
        mResp.getAvailableNetworksResponse(p0, p1);
    }
    public void getVoiceRegistrationStateResponse(RadioResponseInfo p0, VoiceRegStateResult p1) {
        mResp.getVoiceRegistrationStateResponse(p0, p1);
    }
    public void stopLceServiceResponse(RadioResponseInfo p0, LceStatusInfo p1) {
        mResp.stopLceServiceResponse(p0, p1);
    }
    public void setRadioCapabilityResponse(RadioResponseInfo p0, android.hardware.radio.V1_0.RadioCapability p1) {
        mResp.setRadioCapabilityResponse(p0, p1);
    }
    public void getCdmaRoamingPreferenceResponse(RadioResponseInfo p0, int p1) {
        mResp.getCdmaRoamingPreferenceResponse(p0, p1);
    }
    public void getSmscAddressResponse(RadioResponseInfo p0, String p1) {
        mResp.getSmscAddressResponse(p0, p1);
    }
    public void getRadioCapabilityResponse(RadioResponseInfo p0, android.hardware.radio.V1_0.RadioCapability p1) {
        mResp.getRadioCapabilityResponse(p0, p1);
    }
    public void getVoiceRadioTechnologyResponse(RadioResponseInfo p0, int p1) {
        mResp.getVoiceRadioTechnologyResponse(p0, p1);
    }
    public void sendEnvelopeWithStatusResponse(RadioResponseInfo p0, IccIoResult p1) {
        mResp.sendEnvelopeWithStatusResponse(p0, p1);
    }
    public void requestIsimAuthenticationResponse(RadioResponseInfo p0, String p1) {
        mResp.requestIsimAuthenticationResponse(p0, p1);
    }
    public void sendImsSmsResponse(RadioResponseInfo p0, SendSmsResult p1) {
        mResp.sendImsSmsResponse(p0, p1);
    }
    public void requestIccSimAuthenticationResponse(RadioResponseInfo p0, IccIoResult p1) {
        mResp.requestIccSimAuthenticationResponse(p0, p1);
    }
    public void setAllowedCarriersResponse(RadioResponseInfo p0, int p1) {
        mResp.setAllowedCarriersResponse(p0, p1);
    }
    public void iccTransmitApduLogicalChannelResponse(RadioResponseInfo p0, IccIoResult p1) {
        mResp.iccTransmitApduLogicalChannelResponse(p0, p1);
    }
    public void nvReadItemResponse(RadioResponseInfo p0, String p1) {
        mResp.nvReadItemResponse(p0, p1);
    }
    public void writeSmsToRuimResponse(RadioResponseInfo p0, int p1) {
        mResp.writeSmsToRuimResponse(p0, p1);
    }
    public void pullLceDataResponse(RadioResponseInfo p0, LceDataInfo p1) {
        mResp.pullLceDataResponse(p0, p1);
    }
    public void getPreferredVoicePrivacyResponse(RadioResponseInfo p0, boolean p1) {
        mResp.getPreferredVoicePrivacyResponse(p0, p1);
    }
    public void getCdmaBroadcastConfigResponse(RadioResponseInfo p0, ArrayList<CdmaBroadcastSmsConfigInfo> p1) {
        mResp.getCdmaBroadcastConfigResponse(p0, p1);
    }
    public void getModemActivityInfoResponse(RadioResponseInfo p0, ActivityStatsInfo p1) {
        mResp.getModemActivityInfoResponse(p0, p1);
    }
    public void getNeighboringCidsResponse(RadioResponseInfo p0, ArrayList<NeighboringCell> p1) {
        mResp.getNeighboringCidsResponse(p0, p1);
    }
    public void getHardwareConfigResponse(RadioResponseInfo p0, ArrayList<android.hardware.radio.V1_0.HardwareConfig> p1) {
        mResp.getHardwareConfigResponse(p0, p1);
    }
    public void getTTYModeResponse(RadioResponseInfo p0, int p1) {
        mResp.getTTYModeResponse(p0, p1);
    }
    public void getGsmBroadcastConfigResponse(RadioResponseInfo p0, ArrayList<GsmBroadcastSmsConfigInfo> p1) {
        mResp.getGsmBroadcastConfigResponse(p0, p1);
    }
    public void iccTransmitApduBasicChannelResponse(RadioResponseInfo p0, IccIoResult p1) {
        mResp.iccTransmitApduBasicChannelResponse(p0, p1);
    }
    public void sendCdmaSmsResponse(RadioResponseInfo p0, SendSmsResult p1) {
        mResp.sendCdmaSmsResponse(p0, p1);
    }
    public void startLceServiceResponse(RadioResponseInfo p0, LceStatusInfo p1) {
        mResp.startLceServiceResponse(p0, p1);
    }
    public void startKeepaliveResponse(RadioResponseInfo p0, KeepaliveStatus p1) {
        mResp.startKeepaliveResponse(p0, p1);
    }
    public void getCdmaSubscriptionSourceResponse(RadioResponseInfo p0, int p1) {
        mResp.getCdmaSubscriptionSourceResponse(p0, p1);
    }
    public void getPreferredNetworkTypeResponse(RadioResponseInfo p0, int p1) {
        mResp.getPreferredNetworkTypeResponse(p0, p1);
    }
    public void getCellInfoListResponse(RadioResponseInfo p0, ArrayList<android.hardware.radio.V1_0.CellInfo> p1) {
        mResp.getCellInfoListResponse(p0, p1);
    }

    /* Manual
     */
    public void getClirResponse(RadioResponseInfo p0, int p1, int p2) {
        mResp.getClirResponse(p0, p1, p2);
    }
    public void getDeviceIdentityResponse(RadioResponseInfo p0, String p1, String p2, String p3, String p4) {
        mResp.getDeviceIdentityResponse(p0, p1, p2, p3, p4);
    }
    public void getCDMASubscriptionResponse(RadioResponseInfo p0, String p1, String p2, String p3, String p4, String p5) {
        mResp.getCDMASubscriptionResponse(p0, p1, p2, p3, p4, p5);
    }
    public void getCallWaitingResponse(RadioResponseInfo p0, boolean p1, int p2) {
        mResp.getCallWaitingResponse(p0, p1, p2);
    }
    public void getImsRegistrationStateResponse(RadioResponseInfo p0, boolean p1, int p2) {
        mResp.getImsRegistrationStateResponse(p0, p1, p2);
    }
    public void getOperatorResponse(RadioResponseInfo p0, String p1, String p2, String p3) {
        mResp.getOperatorResponse(p0, p1, p2, p3);
    }
    public void iccOpenLogicalChannelResponse(RadioResponseInfo p0, int p1, ArrayList<Byte> p2) {
        mResp.iccOpenLogicalChannelResponse(p0, p1, p2);
    }
    public void getAllowedCarriersResponse(RadioResponseInfo p0, boolean p1, CarrierRestrictions p2) {
        mResp.getAllowedCarriersResponse(p0, p1, p2);
    }
}
