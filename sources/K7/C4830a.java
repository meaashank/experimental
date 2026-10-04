package k7;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.com.android.internal.app.IAppOpsServiceCAG;

/* JADX INFO: renamed from: k7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(19)
public class C4830a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f217334e = "appops";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IAppOpsServiceCAG.f165979G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f217334e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C4831b(iInterface);
    }
}
