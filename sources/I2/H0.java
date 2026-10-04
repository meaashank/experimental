package I2;

import I2.AbstractC1164a;
import I2.AbstractC1204u0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: loaded from: classes2.dex */
public class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1164a.b f50949a = new AbstractC1164a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1164a.b f50951b = new AbstractC1164a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1164a.e f50953c = new AbstractC1164a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1164a.c f50955d = new AbstractC1164a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1164a.f f50957e = new AbstractC1164a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1164a.f f50959f = new AbstractC1164a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1164a.f f50961g = new AbstractC1164a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1164a.f f50963h = new AbstractC1164a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1164a.f f50965i = new AbstractC1164a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AbstractC1164a.f f50967j = new AbstractC1164a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC1164a.c f50968k = new AbstractC1164a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1164a.c f50969l = new AbstractC1164a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AbstractC1164a.c f50970m = new AbstractC1164a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC1164a.c f50971n = new AbstractC1164a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC1164a.c f50972o = new AbstractC1164a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC1164a.c f50973p = new AbstractC1164a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AbstractC1164a.b f50974q = new AbstractC1164a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC1164a.b f50975r = new AbstractC1164a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AbstractC1164a.c f50976s = new AbstractC1164a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC1164a.f f50977t = new AbstractC1164a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC1164a.c f50978u = new AbstractC1164a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbstractC1164a.b f50979v = new AbstractC1164a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC1164a.b f50980w = new AbstractC1164a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AbstractC1164a.f f50981x = new AbstractC1164a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AbstractC1164a.f f50982y = new AbstractC1164a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AbstractC1164a.f f50983z = new AbstractC1164a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AbstractC1164a.b f50923A = new AbstractC1164a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AbstractC1164a.b f50924B = new AbstractC1164a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final AbstractC1164a.d f50925C = new AbstractC1164a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final AbstractC1164a.b f50926D = new AbstractC1164a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final AbstractC1164a.b f50927E = new AbstractC1164a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final AbstractC1164a.b f50928F = new AbstractC1164a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final AbstractC1164a.b f50929G = new AbstractC1164a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final AbstractC1164a.e f50930H = new AbstractC1164a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final AbstractC1164a.e f50931I = new AbstractC1164a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final AbstractC1164a.h f50932J = new AbstractC1164a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final AbstractC1164a.h f50933K = new AbstractC1164a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final AbstractC1164a.g f50934L = new AbstractC1164a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final AbstractC1204u0.b f50935M = new AbstractC1204u0.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final AbstractC1204u0.a f50936N = new AbstractC1204u0.a(H2.u.f45503X, C1206v0.f51040b);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final AbstractC1164a.h f50937O = new AbstractC1164a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final AbstractC1164a.i f50938P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final AbstractC1164a.d f50939Q = new AbstractC1164a.d(H2.u.f45491L, Features.PROXY_OVERRIDE);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final AbstractC1164a.d f50940R = new AbstractC1164a.d(H2.u.f45492M, Features.MULTI_PROCESS_QUERY);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final AbstractC1164a.h f50941S = new AbstractC1164a.h("FORCE_DARK", "FORCE_DARK");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final AbstractC1164a.d f50942T = new AbstractC1164a.d(H2.u.f45494O, Features.FORCE_DARK_BEHAVIOR);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final AbstractC1164a.d f50943U = new AbstractC1164a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final AbstractC1164a.d f50944V = new AbstractC1164a.d(H2.u.f45497R, Features.DOCUMENT_START_SCRIPT);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final AbstractC1164a.d f50945W = new AbstractC1164a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final AbstractC1164a.d f50946X = new AbstractC1164a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AbstractC1164a.d f50947Y = new AbstractC1164a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final AbstractC1164a.d f50948Z = new AbstractC1164a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final AbstractC1164a.d f50950a0 = new AbstractC1164a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final AbstractC1164a.d f50952b0 = new AbstractC1164a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final AbstractC1164a.d f50954c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final AbstractC1164a.d f50956d0 = new AbstractC1164a.d(H2.u.f45509b0, Features.ATTRIBUTION_BEHAVIOR);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final AbstractC1164a.d f50958e0 = new AbstractC1164a.d(H2.u.f45511c0, Features.WEBVIEW_MEDIA_INTEGRITY_API_STATUS);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final AbstractC1164a.d f50960f0 = new AbstractC1164a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final AbstractC1164a.d f50962g0 = new AbstractC1164a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final AbstractC1164a.d f50964h0 = new AbstractC1164a.d(H2.u.f45517f0, Features.SPECULATIVE_LOADING);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final AbstractC1164a.d f50966i0 = new AbstractC1164a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    public class a extends AbstractC1164a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Pattern f50984d;

        public a(String str, String str2) {
            super(str, str2);
            this.f50984d = Pattern.compile("\\A\\d+");
        }

        @Override // I2.AbstractC1164a
        public boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            PackageInfo packageInfoF = H2.t.f();
            if (packageInfoF == null) {
                return false;
            }
            Matcher matcher = this.f50984d.matcher(packageInfoF.versionName);
            return matcher.find() && Integer.parseInt(packageInfoF.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends AbstractC1164a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public boolean d() {
            if (super.d() && H0.d(H2.u.f45492M)) {
                return H2.t.t();
            }
            return false;
        }
    }

    @NonNull
    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(@NonNull String str, @NonNull Context context) {
        return c(str, AbstractC1204u0.g(), context);
    }

    @e.f0
    public static boolean c(@NonNull String str, @NonNull Collection<AbstractC1204u0> collection, @NonNull Context context) {
        HashSet hashSet = new HashSet();
        for (AbstractC1204u0 abstractC1204u0 : collection) {
            if (abstractC1204u0.b().equals(str)) {
                hashSet.add(abstractC1204u0);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(w.y.a("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((AbstractC1204u0) it.next()).d(context)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(@NonNull String str) {
        return e(str, AbstractC1164a.e());
    }

    @e.f0
    public static <T extends InterfaceC1175f0> boolean e(@NonNull String str, @NonNull Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(w.y.a("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1175f0) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
