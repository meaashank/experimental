package b8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.app.ISearchManagerCAG;

/* JADX INFO: renamed from: b8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C2838a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f125931e = "search";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return ISearchManagerCAG.f165329G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return "search";
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C2839b(iInterface);
    }
}
