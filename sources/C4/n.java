package C4;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import com.cookiegames.smartcookie.browser.ProxyChoice;
import com.cookiegames.smartcookie.p;
import d4.C4297a;
import gc.C4470a;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.i2p.android.ui.I2PAndroidHelper;
import u4.C5645a;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17566d = "ProxyUtils";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f17567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f17568f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.e f17569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5645a f17570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I2PAndroidHelper f17571c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17572a;

        static {
            int[] iArr = new int[ProxyChoice.values().length];
            f17572a = iArr;
            try {
                iArr[ProxyChoice.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17572a[ProxyChoice.ORBOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17572a[ProxyChoice.I2P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17572a[ProxyChoice.MANUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public n(u4.e eVar, C5645a c5645a, I2PAndroidHelper i2PAndroidHelper) {
        this.f17569a = eVar;
        this.f17570b = c5645a;
        this.f17571c = i2PAndroidHelper;
    }

    public static ProxyChoice h(ProxyChoice proxyChoice, @NonNull Activity activity) {
        if (a.f17572a[proxyChoice.ordinal()] != 3) {
            return proxyChoice;
        }
        I2PAndroidHelper i2PAndroidHelper = new I2PAndroidHelper(activity.getApplication());
        if (i2PAndroidHelper.isI2PAndroidInstalled()) {
            return proxyChoice;
        }
        ProxyChoice proxyChoice2 = ProxyChoice.NONE;
        i2PAndroidHelper.promptToInstall(activity);
        return proxyChoice2;
    }

    public final void c(@NonNull Activity activity) {
        int iZ0;
        int i10 = a.f17572a[this.f17569a.x0().ordinal()];
        if (i10 != 1) {
            String strY0 = "localhost";
            if (i10 == 2) {
                iZ0 = C4470a.f202368b;
            } else if (i10 != 3) {
                strY0 = this.f17569a.y0();
                iZ0 = this.f17569a.z0();
            } else {
                f17568f = true;
                if (f17567e && !this.f17571c.isI2PAndroidRunning()) {
                    this.f17571c.requestI2PAndroidStart(activity);
                }
                iZ0 = 4444;
            }
            try {
                com.cookiegames.smartcookie.i.f141335i.getClass();
                C4470a.q(com.cookiegames.smartcookie.i.f141338l.l(), activity.getApplicationContext(), null, strY0, iZ0);
            } catch (Exception e10) {
                Log.d(f17566d, "error enabling web proxying", e10);
            }
        }
    }

    public boolean d(@NonNull Activity activity) {
        if (this.f17569a.x0() != ProxyChoice.I2P) {
            return true;
        }
        if (!this.f17571c.isI2PAndroidRunning()) {
            C4297a.a(activity, p.s.f145821g7);
            return false;
        }
        if (this.f17571c.areTunnelsActive()) {
            return true;
        }
        C4297a.a(activity, p.s.f145836h7);
        return false;
    }

    public final /* synthetic */ void e(Activity activity) {
        f17567e = true;
        if (!f17568f || this.f17571c.isI2PAndroidRunning()) {
            return;
        }
        this.f17571c.requestI2PAndroidStart(activity);
    }

    public void f(final Activity activity) {
        if (this.f17569a.x0() == ProxyChoice.I2P) {
            this.f17571c.bind(new I2PAndroidHelper.Callback() { // from class: C4.m
                @Override // net.i2p.android.ui.I2PAndroidHelper.Callback
                public final void onI2PAndroidBound() {
                    this.f17564a.e(activity);
                }
            });
        }
    }

    public void g() {
        this.f17571c.unbind();
        f17567e = false;
    }

    public void i(@NonNull Activity activity) {
        if (this.f17569a.x0() != ProxyChoice.NONE) {
            c(activity);
            return;
        }
        try {
            com.cookiegames.smartcookie.i.f141335i.getClass();
            C4470a.j(com.cookiegames.smartcookie.i.f141338l.l(), activity.getApplicationContext());
        } catch (Exception e10) {
            Log.e(f17566d, "Unable to reset proxy", e10);
        }
        f17568f = false;
    }

    public void b(@NonNull Activity activity) {
    }
}
