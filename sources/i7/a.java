package I7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C;
import c7.C2953e;
import c7.E;
import c7.F;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.ISmsCAG;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52953e = "isms";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new F("getAllMessagesFromIccEfForSubscriber", 1));
        c2953e.f(new F("updateMessageOnIccEfForSubscriber", 1));
        c2953e.f(new F("copyMessageToIccEfForSubscriber", 1));
        c2953e.f(new F("sendDataForSubscriber", 1));
        c2953e.f(new F("sendDataForSubscriberWithSelfPermissions", 1));
        c2953e.f(new F("sendTextForSubscriber", 1));
        c2953e.f(new F("sendTextForSubscriberWithSelfPermissions", 1));
        c2953e.f(new F("sendMultipartTextForSubscriber", 1));
        c2953e.f(new F("sendStoredText", 1));
        c2953e.f(new F("sendStoredMultipartText", 1));
        c2953e.f(new C("createAppSpecificSmsToken"));
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return ISmsCAG.f165993G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f52953e;
    }
}
