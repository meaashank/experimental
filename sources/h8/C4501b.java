package h8;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.C;
import c7.D;
import c7.G;
import c7.x;

/* JADX INFO: renamed from: h8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4501b extends AbstractC2950b<IInterface> {
    public C4501b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new C("showInCallScreen"));
        f(new D("getDefaultOutgoingPhoneAccount", 2));
        f(new C("getUserSelectedOutgoingPhoneAccount"));
        f(new C("getCallCapablePhoneAccounts"));
        f(new C("getSelfManagedPhoneAccounts"));
        f(new C("getOwnSelfManagedPhoneAccounts"));
        f(new G("getPhoneAccountsSupportingScheme"));
        f(new C("getPhoneAccountsForPackage"));
        f(new C("getPhoneAccount"));
        f(new C("getSimCallManager"));
        f(new C("getSimCallManagerForUser"));
        f(new C("registerPhoneAccount"));
        f(new C("unregisterPhoneAccount"));
        f(new C("clearAccounts"));
        f(new D("isVoiceMailNumber", 2));
        f(new C("getVoiceMailNumber"));
        f(new C("getLine1Number"));
        f(new C("getDefaultDialerPackage"));
        f(new C("getSystemDialerPackage"));
        f(new C("silenceRinger"));
        f(new C("isInCall"));
        f(new C("hasManageOngoingCallsPermission"));
        f(new C("isInManagedCall"));
        f(new C("isRinging"));
        f(new C("getCallStateUsingPackage"));
        f(new C("endCall"));
        f(new C("acceptRingingCall"));
        f(new C("acceptRingingCallWithVideoState"));
        f(new C("cancelMissedCallsNotification"));
        f(new G("handlePinMmi"));
        f(new G("handlePinMmiForPhoneAccount"));
        f(new G("getAdnUriForPhoneAccount"));
        f(new C("isTtySupported"));
        f(new C("getCurrentTtyMode"));
        f(new C("addNewIncomingCall"));
        f(new C("addNewIncomingConference"));
        f(new C("startConference"));
        f(new C("placeCall"));
        f(new C("createManageBlockedNumbersIntent"));
        f(new C("isIncomingCallPermitted"));
        f(new C("isOutgoingCallPermitted"));
        f(new C("acceptHandover"));
        f(new G("isInSelfManagedCall"));
        f(new G("addCall"));
    }
}
