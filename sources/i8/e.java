package i8;

import android.os.IInterface;
import androidx.core.app.NotificationCompat;
import c7.AbstractC2950b;
import c7.C;
import c7.G;
import c7.InterfaceC2949a;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2949a(c.class)
public class e extends AbstractC2950b<IInterface> {
    public e(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new C("isOffhook"));
        f(new G("isOffhookForSubscriber"));
        f(new G("isRingingForSubscriber"));
        f(new C(NotificationCompat.CATEGORY_CALL));
        f(new C("isRinging"));
        f(new C("isIdle"));
        f(new G("isIdleForSubscriber"));
        f(new C("isRadioOn"));
        f(new C("isRadioOnWithFeature"));
        f(new C("isRadioOnForSubscriber"));
        f(new C("isRadioOnForSubscriberWithFeature"));
        f(new C("enableDataConnectivity"));
        f(new C("disableDataConnectivity"));
        f(new C("getCallStateForSubscription"));
        f(new G("isSimPinEnabled"));
        f(new C("getCdmaEriIconIndex"));
        f(new C("getCdmaEriIconIndexForSubscriber"));
        f(new C("getCdmaEriIconMode"));
        f(new C("getCdmaEriIconModeForSubscriber"));
        f(new C("getCdmaEriText"));
        f(new C("getCdmaEriTextForSubscriber"));
        f(new C("getVoiceActivationState"));
        f(new C("getDataActivationState"));
        f(new C("getVoiceMessageCountForSubscriber"));
        f(new C("getVisualVoicemailSettings"));
        f(new C("getVisualVoicemailPackageName"));
        f(new C("enableVisualVoicemailSmsFilter"));
        f(new C("disableVisualVoicemailSmsFilter"));
        f(new C("getVisualVoicemailSmsFilterSettings"));
        f(new C("sendVisualVoicemailSmsForSubscriber"));
        f(new C("sendDialerSpecialCode"));
        f(new C("getNetworkTypeForSubscriber"));
        f(new C("getDataNetworkType"));
        f(new C("getDataNetworkTypeForSubscriber"));
        f(new C("getVoiceNetworkTypeForSubscriber"));
        f(new C("getLteOnCdmaMode"));
        f(new C("getLteOnCdmaModeForSubscriber"));
        f(new C("iccTransmitApduBasicChannelByPort"));
        f(new C("iccTransmitApduBasicChannel"));
        f(new C("getCellNetworkScanResults"));
        f(new C("requestNetworkScan"));
        f(new C("setDataEnabledForReason"));
        f(new C("requestNumberVerification"));
        f(new C("getMergedSubscriberIds"));
        f(new C("getMergedImsisFromGroup"));
        f(new C("getRadioAccessFamily"));
        f(new C("uploadCallComposerPicture"));
        f(new C("isVideoCallingEnabled"));
        f(new C("canChangeDtmfToneLength"));
        f(new C("isWorldPhone"));
        f(new C("getDeviceSoftwareVersionForSlot"));
        f(new C("getSubIdForPhoneAccountHandle"));
        f(new C("factoryReset"));
        f(new C("getServiceStateForSubscriber"));
        f(new C("setVoicemailRingtoneUri"));
        f(new C("setVoicemailVibrationEnabled"));
        f(new C("getClientRequestStats"));
        f(new C("getForbiddenPlmns"));
        f(new C("setForbiddenPlmns"));
        f(new C("getCardIdForDefaultEuicc"));
        f(new C("getUiccCardsInfo"));
        f(new C("getUiccSlotsInfo"));
        f(new C("getNumberOfModemsWithSimultaneousDataConnections"));
        f(new C("getRadioPowerState"));
        f(new C("getEmergencyNumberList"));
        f(new C("isMultiSimSupported"));
        f(new C("doesSwitchMultiSimConfigTriggerReboot"));
        f(new C("getSlotsMapping"));
        f(new C("isModemEnabledForSlot"));
        f(new C("isDataEnabledForApn"));
        f(new C("enqueueSmsPickResult"));
        f(new C("getEquivalentHomePlmns"));
        f(new C("sendThermalMitigationRequest"));
        f(new C("setSignalStrengthUpdateRequest"));
        f(new C("clearSignalStrengthUpdateRequest"));
        f(new C("registerImsStateCallback"));
        f(new C("getLastKnownCellIdentity"));
        f(new C("setVoiceServiceStateOverride"));
        f(new C("setRemovableEsimAsDefaultEuicc"));
        f(new C("isRemovableEsimDefaultEuicc"));
        f(new G("getCalculatedPreferredNetworkType"));
        f(new G("getPcscfAddress"));
        f(new C("updateServiceLocationWithPackageName"));
        f(new C("getCellLocation"));
        f(new C("getNeighboringCellInfo"));
        f(new C("getAllCellInfo"));
        f(new C("requestCellInfoUpdate"));
        f(new C("requestCellInfoUpdateWithWorkSource"));
        f(new C("checkCarrierPrivilegesForPackage"));
        f(new C("checkCarrierPrivilegesForPackageAnyPhone"));
    }
}
