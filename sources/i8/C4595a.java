package i8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.IHwTelephonyCAG;

/* JADX INFO: renamed from: i8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4595a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f202905e = "phone_huawei";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IHwTelephonyCAG.f165990G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f202905e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new b(iInterface);
    }
}
