package H2;

import I2.AbstractC1164a;
import I2.G0;
import I2.H0;
import I2.I0;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f45463a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f45464b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f45465c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f45466d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f45467e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f45468f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45469g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45470h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f45471i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f45472j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f45473k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45474l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45475m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @b
    public static final int f45476n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @b
    public static final int f45477o = 1;

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
    @RequiresOptIn(level = RequiresOptIn.Level.ERROR)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
    @RequiresOptIn(level = RequiresOptIn.Level.ERROR)
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface d {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    public static void A(@NonNull WebSettings webSettings, @NonNull UserAgentMetadata userAgentMetadata) {
        if (!H0.f50952b0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).z(userAgentMetadata);
    }

    public static void B(@NonNull WebSettings webSettings, int i10) {
        if (!H0.f50962g0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).A(i10);
    }

    public static void C(@NonNull WebSettings webSettings, @NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        if (!H0.f50958e0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).B(webViewMediaIntegrityApiStatusConfig);
    }

    public static G0 a(WebSettings webSettings) {
        return I0.a.f50987a.f(webSettings);
    }

    public static int b(@NonNull WebSettings webSettings) {
        if (H0.f50956d0.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getAttributionBehavior();
        }
        throw H0.a();
    }

    @a
    public static boolean c(@NonNull WebSettings webSettings) {
        if (H0.f50966i0.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getBackForwardCacheEnabled();
        }
        throw H0.a();
    }

    public static int d(@NonNull WebSettings webSettings) {
        AbstractC1164a.c cVar = H0.f50955d;
        if (cVar.c()) {
            return webSettings.getDisabledActionModeMenuItems();
        }
        if (cVar.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getDisabledActionModeMenuItems();
        }
        throw H0.a();
    }

    public static boolean e(@NonNull WebSettings webSettings) {
        if (H0.f50947Y.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
        }
        throw H0.a();
    }

    @Deprecated
    public static int f(@NonNull WebSettings webSettings) {
        AbstractC1164a.h hVar = H0.f50941S;
        if (hVar.c()) {
            return webSettings.getForceDark();
        }
        if (hVar.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getForceDark();
        }
        throw H0.a();
    }

    @Deprecated
    public static int g(@NonNull WebSettings webSettings) {
        if (H0.f50942T.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getForceDark();
        }
        throw H0.a();
    }

    public static boolean h(@NonNull WebSettings webSettings) {
        H0.f50951b.getClass();
        return webSettings.getOffscreenPreRaster();
    }

    @NonNull
    public static Set<String> i(@NonNull WebSettings webSettings) {
        if (H0.f50950a0.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getRequestedWithHeaderOriginAllowList();
        }
        throw H0.a();
    }

    public static boolean j(@NonNull WebSettings webSettings) {
        AbstractC1164a.e eVar = H0.f50953c;
        if (eVar.c()) {
            return webSettings.getSafeBrowsingEnabled();
        }
        if (eVar.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getSafeBrowsingEnabled();
        }
        throw H0.a();
    }

    @b
    public static int k(@NonNull WebSettings webSettings) {
        if (H0.f50964h0.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getSpeculativeLoadingStatus();
        }
        throw H0.a();
    }

    @NonNull
    public static UserAgentMetadata l(@NonNull WebSettings webSettings) {
        if (H0.f50952b0.d()) {
            return I0.a.f50987a.f(webSettings).k();
        }
        throw H0.a();
    }

    public static int m(@NonNull WebSettings webSettings) {
        if (H0.f50962g0.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.getWebauthnSupport();
        }
        throw H0.a();
    }

    @NonNull
    public static WebViewMediaIntegrityApiStatusConfig n(@NonNull WebSettings webSettings) {
        if (H0.f50958e0.d()) {
            return I0.a.f50987a.f(webSettings).m();
        }
        throw H0.a();
    }

    public static boolean o(@NonNull WebSettings webSettings) {
        if (H0.f50938P.d()) {
            return I0.a.f50987a.f(webSettings).f50922a.isAlgorithmicDarkeningAllowed();
        }
        throw H0.a();
    }

    public static void p(@NonNull WebSettings webSettings, boolean z10) {
        if (!H0.f50938P.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).o(z10);
    }

    public static void q(@NonNull WebSettings webSettings, int i10) {
        if (!H0.f50956d0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).p(i10);
    }

    @a
    public static void r(@NonNull WebSettings webSettings, boolean z10) {
        if (!H0.f50966i0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).q(z10);
    }

    public static void s(@NonNull WebSettings webSettings, int i10) {
        AbstractC1164a.c cVar = H0.f50955d;
        if (cVar.c()) {
            webSettings.setDisabledActionModeMenuItems(i10);
        } else {
            if (!cVar.d()) {
                throw H0.a();
            }
            I0.a.f50987a.f(webSettings).r(i10);
        }
    }

    public static void t(@NonNull WebSettings webSettings, boolean z10) {
        if (!H0.f50947Y.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).s(z10);
    }

    @Deprecated
    public static void u(@NonNull WebSettings webSettings, int i10) {
        AbstractC1164a.h hVar = H0.f50941S;
        if (hVar.c()) {
            webSettings.setForceDark(i10);
        } else {
            if (!hVar.d()) {
                throw H0.a();
            }
            I0.a.f50987a.f(webSettings).t(i10);
        }
    }

    @Deprecated
    public static void v(@NonNull WebSettings webSettings, int i10) {
        if (!H0.f50942T.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).u(i10);
    }

    public static void w(@NonNull WebSettings webSettings, boolean z10) {
        H0.f50951b.getClass();
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void x(@NonNull WebSettings webSettings, @NonNull Set<String> set) {
        if (!H0.f50950a0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).w(set);
    }

    public static void y(@NonNull WebSettings webSettings, boolean z10) {
        AbstractC1164a.e eVar = H0.f50953c;
        if (eVar.c()) {
            webSettings.setSafeBrowsingEnabled(z10);
        } else {
            if (!eVar.d()) {
                throw H0.a();
            }
            I0.a.f50987a.f(webSettings).x(z10);
        }
    }

    @b
    public static void z(@NonNull WebSettings webSettings, int i10) {
        if (!H0.f50964h0.d()) {
            throw H0.a();
        }
        I0.a.f50987a.f(webSettings).y(i10);
    }
}
