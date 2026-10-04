package c8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.I;
import e.T;
import java.util.ArrayList;

/* JADX INFO: renamed from: c8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@T(36)
public class C2960a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f131281e = "asdf-".concat(C2960a.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f131282f = "advanced_protection";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new I("isAdvancedProtectionEnabled", Boolean.FALSE));
        c2953e.f(new I("getAdvancedProtectionFeatures", new ArrayList()));
        c2953e.f(new I("registerAdvancedProtectionCallback", null));
        c2953e.f(new I("setAdvancedProtectionEnabled", null));
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            return (IInterface) Class.forName("android.security.advancedprotection.IAdvancedProtectionService$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.E
    public String l() {
        return f131282f;
    }
}
