package y7;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.os.IDeviceIdentifiersPolicyServiceCAG;

/* JADX INFO: renamed from: y7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(26)
public class C5840a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f241110e = "device_identifiers";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IDeviceIdentifiersPolicyServiceCAG.O26.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f241110e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5841b(iInterface);
    }
}
