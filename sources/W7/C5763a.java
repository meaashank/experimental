package w7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.client.GaiaContext;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: w7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5763a extends E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f240111f = "GAIA-Cred";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f240112g = "credential";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f240113h = "android.credentials.ICredentialManager$Stub";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IInterface f240114e = null;

    @Override // c7.E
    public boolean f(IInterface iInterface, IBinder iBinder) {
        boolean zF = super.f(iInterface, iBinder);
        try {
            Object systemService = GaiaContext.j().n().getSystemService(f240112g);
            if (systemService != null) {
                Field declaredField = systemService.getClass().getDeclaredField("mService");
                declaredField.setAccessible(true);
                declaredField.set(systemService, iInterface);
            }
        } catch (Throwable unused) {
        }
        return zF;
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        IInterface iInterface = this.f240114e;
        if (iInterface != null) {
            return iInterface;
        }
        if (iBinder == null) {
            return null;
        }
        try {
            IInterface iInterface2 = (IInterface) Class.forName(f240113h).getMethod("asInterface", IBinder.class).invoke(null, iBinder);
            this.f240114e = iInterface2;
            return iInterface2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.E
    public String l() {
        return f240112g;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5766d(iInterface);
    }
}
