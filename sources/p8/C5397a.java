package p8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.net.wifi.IWifiManagerCAG;

/* JADX INFO: renamed from: p8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5397a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f226370e = "wifi";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IWifiManagerCAG.f165848G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f226370e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5398b(iInterface);
    }
}
