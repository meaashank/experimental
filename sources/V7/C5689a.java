package v7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.hardware.location.IContextHubServiceCAG;

/* JADX INFO: renamed from: v7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5689a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f239860e;

    static {
        f239860e = C3841e.s() ? "contexthub" : "contexthub_service";
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IContextHubServiceCAG.f165817C.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f239860e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5690b(iInterface);
    }
}
