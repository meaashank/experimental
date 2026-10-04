package t7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.net.IConnectivityManagerCAG;

/* JADX INFO: renamed from: t7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5617a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f239212e = "connectivity";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IConnectivityManagerCAG.f165831G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f239212e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5618b(iInterface);
    }
}
