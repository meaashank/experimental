package H2;

import I2.H0;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f45480A = "WEB_MESSAGE_PORT_CLOSE";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f45481B = "WEB_MESSAGE_ARRAY_BUFFER";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f45482C = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f45483D = "CREATE_WEB_MESSAGE_CHANNEL";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f45484E = "POST_WEB_MESSAGE";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f45485F = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f45486G = "GET_WEB_VIEW_CLIENT";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f45487H = "GET_WEB_CHROME_CLIENT";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f45488I = "GET_WEB_VIEW_RENDERER";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f45489J = "WEB_VIEW_RENDERER_TERMINATE";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f45490K = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f45491L = "PROXY_OVERRIDE";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f45492M = "MULTI_PROCESS";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f45493N = "FORCE_DARK";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f45494O = "FORCE_DARK_STRATEGY";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f45495P = "ALGORITHMIC_DARKENING";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f45496Q = "WEB_MESSAGE_LISTENER";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f45497R = "DOCUMENT_START_SCRIPT";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f45498S = "PROXY_OVERRIDE_REVERSE_BYPASS";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f45499T = "GET_VARIATIONS_HEADER";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f45500U = "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f45501V = "GET_COOKIE_INFO";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f45502W = "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f45503X = "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f45504Y = "REQUESTED_WITH_HEADER_ALLOW_LIST";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f45505Z = "USER_AGENT_METADATA";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45506a = "VISUAL_STATE_CALLBACK";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f45507a0 = "MULTI_PROFILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f45508b = "OFF_SCREEN_PRERASTER";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f45509b0 = "ATTRIBUTION_REGISTRATION_BEHAVIOR";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f45510c = "SAFE_BROWSING_ENABLE";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f45511c0 = "WEBVIEW_MEDIA_INTEGRITY_API_STATUS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"IntentName"})
    public static final String f45512d = "DISABLED_ACTION_MODE_MENU_ITEMS";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f45513d0 = "MUTE_AUDIO";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f45514e = "START_SAFE_BROWSING";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f45515e0 = "WEB_AUTHENTICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f45516f = "SAFE_BROWSING_ALLOWLIST";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f45517f0 = "SPECULATIVE_LOADING_STATUS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final String f45518g = "SAFE_BROWSING_WHITELIST";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f45519g0 = "BACK_FORWARD_CACHE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45520h = "SAFE_BROWSING_PRIVACY_POLICY_URL";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f45521i = "SERVICE_WORKER_BASIC_USAGE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f45522j = "SERVICE_WORKER_CACHE_MODE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f45523k = "SERVICE_WORKER_CONTENT_ACCESS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f45524l = "SERVICE_WORKER_FILE_ACCESS";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f45525m = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f45526n = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f45527o = "RECEIVE_WEB_RESOURCE_ERROR";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f45528p = "RECEIVE_HTTP_ERROR";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f45529q = "SHOULD_OVERRIDE_WITH_REDIRECTS";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f45530r = "SAFE_BROWSING_HIT";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f45531s = "TRACING_CONTROLLER_BASIC_USAGE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f45532t = "WEB_RESOURCE_REQUEST_IS_REDIRECT";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f45533u = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f45534v = "WEB_RESOURCE_ERROR_GET_CODE";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f45535w = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f45536x = "SAFE_BROWSING_RESPONSE_PROCEED";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f45537y = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f45538z = "WEB_MESSAGE_PORT_POST_MESSAGE";

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    public static boolean a(@NonNull String str) {
        return H0.d(str);
    }

    public static boolean b(@NonNull Context context, @NonNull String str) {
        return H0.b(str, context);
    }
}
