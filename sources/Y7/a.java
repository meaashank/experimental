package Y7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.os.IPowerManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f79330e = "power";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IPowerManagerCAG.f165874G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f79330e;
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
