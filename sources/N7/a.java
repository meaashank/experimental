package N7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.app.ILocaleManagerCAG;
import e.T;

/* JADX INFO: loaded from: classes6.dex */
@T(33)
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64751e = "locale";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new C("setApplicationLocales"));
        c2953e.f(new C("getApplicationLocales"));
        c2953e.f(new C("setOverrideLocaleConfig"));
        c2953e.f(new C("getOverrideLocaleConfig"));
    }

    @Override // c7.E
    @Nullable
    @org.jetbrains.annotations.Nullable
    public IInterface i(@Nullable @org.jetbrains.annotations.Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return ILocaleManagerCAG.f165327G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f64751e;
    }
}
