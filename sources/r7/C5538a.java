package r7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.bluetooth.IBluetoothManagerCAG;

/* JADX INFO: renamed from: r7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5538a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f227261e = "bluetooth_manager";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IBluetoothManagerCAG.f165579G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f227261e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5539b(iInterface);
    }
}
