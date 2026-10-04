package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import android.webkit.URLUtil;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class U5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f152481i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V5 f152483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q1 f152484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3739ta f152485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3502ca f152486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3470a6 f152487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N4 f152488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f152489h;

    public U5(Context context, V5 landingPageState, Q1 q12, C3739ta c3739ta, InterfaceC3502ca redirectionValidator, C3470a6 c3470a6, N4 n42) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(landingPageState, "landingPageState");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        this.f152482a = context;
        this.f152483b = landingPageState;
        this.f152484c = q12;
        this.f152485d = c3739ta;
        this.f152486e = redirectionValidator;
        this.f152487f = c3470a6;
        this.f152488g = n42;
    }

    public final void a(N5 n52, Z5 z52, Integer num) {
        R5.a(n52, z52, num, Q5.a(n52, "funnelState", this));
    }

    public final S5 b(String str, String str2, String str3, Z5 z52) {
        N4 n42 = this.f152488g;
        if (n42 != null) {
            ((O4) n42).c("U5", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            C3739ta c3739ta = this.f152485d;
            if (c3739ta != null) {
                c3739ta.f153403a.a(str2, "Invalid URL", str);
            }
            N4 n43 = this.f152488g;
            if (n43 != null) {
                ((O4) n43).c("U5", "InMobiNativeBrowserScheme url is Empty or null");
            }
            N5 n52 = N5.f152288e;
            R5.a(n52, z52, (Integer) 8001, (ed.p) Q5.a(n52, "funnelState", this));
            return new S5(3, 8001);
        }
        int iA = AbstractC3523e3.a(this.f152482a, queryParameter, this.f152486e, str, this.f152488g);
        if (z52 != null) {
            z52.f152653g = "EX_NATIVE";
        }
        if (iA == 0 || iA == 1) {
            N5 n53 = N5.f152289f;
            R5.a(n53, z52, (Integer) null, Q5.a(n53, "funnelState", this));
            c(str, str2, str3);
            N4 n44 = this.f152488g;
            if (n44 != null) {
                ((O4) n44).c("U5", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new S5(1);
        }
        C3739ta c3739ta2 = this.f152485d;
        if (c3739ta2 != null) {
            c3739ta2.f153403a.a(str2, "Invalid URL", str);
        }
        N4 n45 = this.f152488g;
        if (n45 != null) {
            ((O4) n45).c("U5", "InmobiNativeBrowser scheme url handling failed");
        }
        N5 n54 = N5.f152290g;
        R5.a(n54, z52, Integer.valueOf(iA), Q5.a(n54, "funnelState", this));
        return new S5(2, Integer.valueOf(iA));
    }

    public final int c(String str, String str2, String str3, Z5 z52) {
        N4 n42 = this.f152488g;
        if (n42 != null) {
            ((O4) n42).a("U5", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, z52);
        } catch (Exception e10) {
            C3739ta c3739ta = this.f152485d;
            if (c3739ta != null) {
                c3739ta.f153403a.a(str2, "Unexpected error", "open");
            }
            AbstractC3666o6.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            N4 n43 = this.f152488g;
            if (n43 == null) {
                return 9;
            }
            ((O4) n43).b("U5", jd.a(e10, O5.a("U5", "TAG", "SDK encountered unexpected error in handling open() request from creative ")));
            return 9;
        }
    }

    public final int d(String api, String str, String str2, Z5 z52) {
        String strA;
        kotlin.jvm.internal.G.p(api, "api");
        N4 n42 = this.f152488g;
        if (n42 != null) {
            ((O4) n42).c("U5", P5.a("U5", "TAG", "processOpenCCTRequest - url - ", str2));
        }
        if (z52 != null) {
            z52.f152653g = "IN_NATIVE";
        }
        if (str2 == null || (kotlin.text.F.L2(str2, "http", false, 2, null) && !URLUtil.isValidUrl(str2))) {
            N4 n43 = this.f152488g;
            if (n43 != null) {
                ((O4) n43).c("U5", api + " called with invalid url (" + str2 + ')');
            }
            C3739ta c3739ta = this.f152485d;
            if (c3739ta != null) {
                c3739ta.f153403a.a(str, "Invalid URL", api);
            }
            N5 n52 = N5.f152288e;
            R5.a(n52, z52, (Integer) 3, (ed.p) Q5.a(n52, "funnelState", this));
            return 3;
        }
        String strA2 = Z2.a(this.f152482a);
        try {
            try {
                boolean z10 = this.f152483b.f152519c;
                if (strA2 != null && z10) {
                    U1 u12 = new U1(str2, this.f152482a, this.f152484c, this.f152486e, z52, api);
                    X2 x22 = u12.f152477f;
                    Context context = u12.f152478g;
                    if (x22.f152581a == null && context != null && (strA = Z2.a(context)) != null) {
                        V2 v22 = new V2(x22);
                        x22.f152582b = v22;
                        androidx.browser.customtabs.a.b(context, strA, v22);
                    }
                    N4 n44 = this.f152488g;
                    if (n44 != null) {
                        ((O4) n44).c("U5", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                N4 n45 = this.f152488g;
                if (n45 != null) {
                    ((O4) n45).a("U5", "ChromeCustomTab fallback to Embedded");
                }
                return b(str2, api, z52);
            } catch (Exception unused) {
                int iA = AbstractC3592j2.a(this.f152482a, str2, this.f152486e, api);
                if (iA != 0 && iA != 1) {
                    return iA;
                }
                C3739ta c3739ta2 = this.f152485d;
                if (c3739ta2 != null) {
                    GestureDetectorOnGestureListenerC3809ya.a(c3739ta2.f153403a, api, str, str2);
                }
                C3739ta c3739ta3 = this.f152485d;
                if (c3739ta3 != null) {
                    c3739ta3.f153403a.getListener().a();
                }
                if (z52 != null) {
                    z52.f152653g = "EX_NATIVE";
                }
                N5 funnelState = N5.f152289f;
                kotlin.jvm.internal.G.p(funnelState, "funnelState");
                R5.a(funnelState, z52, (Integer) null, new T5(this));
                return iA;
            }
        } catch (Exception e10) {
            N4 n46 = this.f152488g;
            if (n46 != null) {
                ((O4) n46).a("U5", "Exception occurred while opening External ", e10);
            }
            return 9;
        }
    }

    public final void e(String str, String str2, String str3, Z5 z52) {
        String str4;
        String str5;
        String str6;
        Z5 z53;
        U5 u52;
        String str7;
        String str8;
        String str9;
        Z5 z54;
        U5 u53;
        try {
            try {
            } catch (ActivityNotFoundException e10) {
                e = e10;
                str7 = str;
                str8 = str2;
                str9 = str3;
                z54 = z52;
                u53 = this;
            } catch (URISyntaxException e11) {
                e = e11;
                str4 = str;
                str5 = str2;
                str6 = str3;
                z53 = z52;
                u52 = this;
            }
            try {
                AbstractC3592j2.a(this.f152482a, str2, this.f152486e, "openExternal");
                a(N5.f152289f, z52, (Integer) null);
                c("openExternal", str, str2);
            } catch (ActivityNotFoundException e12) {
                e = e12;
                u53 = this;
                str7 = str;
                str8 = str2;
                str9 = str3;
                z54 = z52;
                a(u53, str7, str8, str9, z54, e);
            } catch (URISyntaxException e13) {
                e = e13;
                u52 = this;
                str4 = str;
                str5 = str2;
                str6 = str3;
                z53 = z52;
                a(u52, str4, str5, str6, z53, e);
            }
        } catch (NullPointerException e14) {
            a(this, str, str2, str3, z52, e14);
        } catch (Exception e15) {
            N5 n52 = N5.f152290g;
            R5.a(n52, z52, (Integer) 9, (ed.p) Q5.a(n52, "funnelState", this));
            C3739ta c3739ta = this.f152485d;
            if (c3739ta != null) {
                c3739ta.f153403a.a(str, "Unexpected error", "openExternal");
            }
            AbstractC3666o6.a((byte) 1, "U5", "Could not open URL SDK encountered an unexpected error");
            N4 n42 = this.f152488g;
            if (n42 != null) {
                ((O4) n42).b("U5", jd.a(e15, O5.a("U5", "TAG", "SDK encountered unexpected error in handling openExternal() request from creative ")));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.S5 a(com.inmobi.media.U5 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.inmobi.media.Z5 r13, boolean r14, int r15) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U5.a(com.inmobi.media.U5, java.lang.String, java.lang.String, java.lang.String, com.inmobi.media.Z5, boolean, int):com.inmobi.media.S5");
    }

    public final void c(String str, String str2, String str3) {
        C3739ta c3739ta = this.f152485d;
        if (c3739ta != null) {
            c3739ta.f153403a.getListener().a();
        }
        C3739ta c3739ta2 = this.f152485d;
        if (c3739ta2 != null) {
            GestureDetectorOnGestureListenerC3809ya.a(c3739ta2.f153403a, str, str2, str3);
        }
    }

    public final int b(String url, String api, Z5 z52) {
        Z5 z53;
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(api, "api");
        if (z52 != null) {
            z52.f152653g = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            N4 n42 = this.f152488g;
            if (n42 != null) {
                ((O4) n42).b("U5", "processOpenEmbeddedRequest failed due to empty URL");
            }
            N5 n52 = N5.f152288e;
            R5.a(n52, z52, (Integer) null, Q5.a(n52, "funnelState", this));
            return 2;
        }
        if (X0.a(this.f152482a, url, this.f152486e, api, this.f152488g)) {
            return 0;
        }
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.G.o(uri, "parse(...)");
        if (AbstractC3592j2.a(uri)) {
            Intent intent = new Intent(this.f152482a, (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.f152486e.getViewTouchTimestamp());
            if (z52 != null) {
                C3470a6 landingPageTelemetryMetaData = z52.f152647a;
                String urlType = z52.f152648b;
                int i10 = z52.f152649c;
                long j10 = z52.f152650d;
                kotlin.jvm.internal.G.p(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
                kotlin.jvm.internal.G.p(urlType, "urlType");
                z53 = new Z5(landingPageTelemetryMetaData, urlType, i10, j10);
                N5 n53 = N5.f152287d;
                z53.f152652f = 2;
            } else {
                z53 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", z53);
            N4 n43 = this.f152488g;
            if (n43 != null) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.G.o(string, "toString(...)");
                HashMap map = B4.f151768a;
                String key = string.toString();
                kotlin.jvm.internal.G.p(key, "key");
                map.put(key, new WeakReference(n43));
                intent.putExtra("loggerCacheKey", string);
            }
            C3739ta c3739ta = this.f152485d;
            if (c3739ta != null) {
                intent.putExtra("creativeId", c3739ta.f153403a.getCreativeId());
                intent.putExtra("impressionId", c3739ta.f153403a.getImpressionId());
                intent.putExtra("placementId", c3739ta.f153403a.getPlacementId());
                SparseArray sparseArray = InMobiAdActivity.f151717j;
                GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = c3739ta.f153403a;
                InMobiAdActivity.f151718k = gestureDetectorOnGestureListenerC3809ya;
                C3657nb.f153207a.a(gestureDetectorOnGestureListenerC3809ya.getContainerContext(), intent);
            }
            N5 n54 = N5.f152289f;
            R5.a(n54, z52, (Integer) null, Q5.a(n54, "funnelState", this));
            C3739ta c3739ta2 = this.f152485d;
            if (c3739ta2 == null) {
                return 1;
            }
            GestureDetectorOnGestureListenerC3809ya.a(c3739ta2.f153403a, null, null, url);
            return 1;
        }
        N4 n44 = this.f152488g;
        if (n44 == null) {
            return 10;
        }
        ((O4) n44).b("U5", "Embedded request unable to handle ".concat(url));
        return 10;
    }

    public final void b(String str, String str2, String str3) {
        N4 n42 = this.f152488g;
        if (n42 != null) {
            ((O4) n42).c("U5", str + " called with invalid url (" + str3 + ')');
        }
        C3739ta c3739ta = this.f152485d;
        if (c3739ta != null) {
            c3739ta.f153403a.a(str2, "Invalid URL", str);
        }
    }

    public final int a(String str, String str2, Z5 z52) {
        if (str2 != null && str2.length() != 0) {
            Uri uri = Uri.parse(str2);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (kotlin.jvm.internal.G.g(uri.getScheme(), "inmobinativebrowser")) {
                    b("customExpand", str, str2, z52);
                    return 2;
                }
                if (kotlin.jvm.internal.G.g(uri.getScheme(), "inmobideeplink")) {
                    return a("customExpand", str, str2, z52).f152433a == 1 ? 2 : 4;
                }
                if (X0.a(this.f152482a, str2, this.f152486e, "customExpand", this.f152488g)) {
                    c("customExpand", str, str2);
                    if (z52 != null) {
                        z52.f152653g = "EX_NATIVE";
                    }
                    N5 n52 = N5.f152289f;
                    R5.a(n52, z52, (Integer) null, Q5.a(n52, "funnelState", this));
                } else {
                    if (AbstractC3592j2.a(uri)) {
                        return 3;
                    }
                    int iA = AbstractC3523e3.a(this.f152482a, str2, this.f152486e, "customExpand", this.f152488g);
                    if (z52 != null) {
                        z52.f152653g = "EX_NATIVE";
                    }
                    if (iA != 0 && iA != 1) {
                        N4 n42 = this.f152488g;
                        if (n42 != null) {
                            ((O4) n42).b("U5", "CustomExpand handling failed");
                        }
                        N5 n53 = N5.f152293j;
                        R5.a(n53, z52, (Integer) null, Q5.a(n53, "funnelState", this));
                    }
                    c("customExpand", str, str2);
                    N5 n54 = N5.f152289f;
                    R5.a(n54, z52, (Integer) null, Q5.a(n54, "funnelState", this));
                    N4 n43 = this.f152488g;
                    if (n43 != null) {
                        ((O4) n43).c("U5", "Deeplink url handled successfully");
                    }
                }
            }
            b("customExpand", str, str2);
            N5 n55 = N5.f152288e;
            R5.a(n55, z52, (Integer) 4, (ed.p) Q5.a(n55, "funnelState", this));
            return 1;
        }
        b("customExpand", str, str2);
        N5 n56 = N5.f152288e;
        R5.a(n56, z52, (Integer) 2, (ed.p) Q5.a(n56, "funnelState", this));
        return 1;
    }

    public final S5 a(String str, String str2, String str3, Z5 z52) {
        N4 n42 = this.f152488g;
        if (n42 != null) {
            ((O4) n42).a("U5", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        if (iA != 0 && iA != 1) {
            int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
            if (z52 != null) {
                z52.f152653g = "EX_NATIVE";
            }
            if (iA2 != 0 && iA2 != 1) {
                C3739ta c3739ta = this.f152485d;
                if (c3739ta != null) {
                    c3739ta.f153403a.a(str2, "Invalid URL", str);
                }
                N4 n43 = this.f152488g;
                if (n43 != null) {
                    ((O4) n43).c("U5", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                N5 n52 = N5.f152290g;
                R5.a(n52, z52, Integer.valueOf(iA2), Q5.a(n52, "funnelState", this));
                return new S5(2, Integer.valueOf(iA2));
            }
            N4 n44 = this.f152488g;
            if (n44 != null) {
                ((O4) n44).c("U5", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            N5 n53 = N5.f152289f;
            R5.a(n53, z52, (Integer) null, Q5.a(n53, "funnelState", this));
            c(str, str2, str3);
            return new S5(1);
        }
        N4 n45 = this.f152488g;
        if (n45 != null) {
            ((O4) n45).c("U5", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (z52 != null) {
            z52.f152653g = "EX_NATIVE";
        }
        N5 n54 = N5.f152289f;
        R5.a(n54, z52, (Integer) null, Q5.a(n54, "funnelState", this));
        c(str, str2, str3);
        return new S5(1);
    }

    public final int a(String str, String str2, String str3) {
        N4 n42 = this.f152488g;
        if (n42 != null) {
            ((O4) n42).c("U5", androidx.fragment.app.G.a("inMobiDeepLinkSchemeUrlHandled - url - ", str2, " trackingUrl ", str3));
        }
        if (str2 != null && str2.length() != 0) {
            int iA = AbstractC3523e3.a(this.f152482a, str2, this.f152486e, str, this.f152488g);
            if (iA != 0 && iA != 1) {
                N4 n43 = this.f152488g;
                if (n43 != null) {
                    ((O4) n43).c("U5", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return iA;
            }
            if (AbstractC3620l2.a(str3)) {
                C3564h2 c3564h2 = C3564h2.f152957a;
                kotlin.jvm.internal.G.m(str3);
                c3564h2.a(str3, true, this.f152488g);
            } else {
                N4 n44 = this.f152488g;
                if (n44 != null) {
                    ((O4) n44).b("U5", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            N4 n45 = this.f152488g;
            if (n45 == null) {
                return 0;
            }
            ((O4) n45).c("U5", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            return 0;
        }
        N4 n46 = this.f152488g;
        if (n46 == null) {
            return 2;
        }
        ((O4) n46).b("U5", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public static final void a(U5 u52, String str, String str2, String str3, Z5 z52, Exception exc) {
        N4 n42 = u52.f152488g;
        if (n42 != null) {
            ((O4) n42).b("U5", jd.a(exc, O5.a("U5", "TAG", "Error message in processing openExternal: ")));
        }
        C3739ta c3739ta = u52.f152485d;
        if (c3739ta != null) {
            StringBuilder sb2 = new StringBuilder("Cannot resolve URI (");
            try {
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                kotlin.jvm.internal.G.m(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            sb2.append(str2);
            sb2.append(')');
            String message = sb2.toString();
            kotlin.jvm.internal.G.p(message, "message");
            c3739ta.f153403a.a(str, message, "openExternal");
        }
        if (str3 != null) {
            u52.e(str, str3, null, z52);
        }
    }
}
