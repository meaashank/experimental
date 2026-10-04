package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3523e3 {
    public static int a(Context context, String url, InterfaceC3502ca redirectionValidator, String api, N4 n42) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.G.p(api, "api");
        if (n42 != null) {
            ((O4) n42).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (n42 == null) {
                return 2;
            }
            ((O4) n42).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            ArrayList arrayListB = AbstractC3592j2.b(context, url);
            if (!arrayListB.isEmpty()) {
                if (n42 != null) {
                    ((O4) n42).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) arrayListB.get(0)).activityInfo.name);
                }
                return a(context, url, (ResolveInfo) arrayListB.get(0), redirectionValidator, api, n42);
            }
            if (n42 != null) {
                ((O4) n42).c("DeeplinkHandler", " Resolve Info Empty");
            }
            try {
                return AbstractC3592j2.a(context, url, redirectionValidator, api);
            } catch (ActivityNotFoundException unused) {
                return a(context, url, null, redirectionValidator, api, n42);
            } catch (NullPointerException unused2) {
                return a(context, url, null, redirectionValidator, api, n42);
            } catch (SecurityException unused3) {
                if (n42 != null) {
                    ((O4) n42).b("DeeplinkHandler", "SecurityException");
                }
                return 12;
            } catch (URISyntaxException unused4) {
                if (n42 != null) {
                    ((O4) n42).b("DeeplinkHandler", "uriSyntaxException");
                }
                return 5;
            } catch (Exception e10) {
                if (n42 != null) {
                    ((O4) n42).b("DeeplinkHandler", "Exception: " + e10);
                }
                return 9;
            }
        } catch (URISyntaxException unused5) {
            if (n42 != null) {
                ((O4) n42).b("DeeplinkHandler", "URISyntaxException for url: ".concat(url));
            }
            return 5;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3502ca interfaceC3502ca, String str2, N4 n42) {
        try {
            return AbstractC3592j2.a(context, str, resolveInfo, interfaceC3502ca, str2);
        } catch (ActivityNotFoundException unused) {
            if (n42 != null) {
                ((O4) n42).b("DeeplinkHandler", T.a("ActivityNotFoundException for url: ", str));
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (n42 != null) {
                ((O4) n42).b("DeeplinkHandler", T.a("NullPointerException for url: ", str));
            }
            return 13;
        } catch (SecurityException unused3) {
            if (n42 != null) {
                ((O4) n42).b("DeeplinkHandler", T.a("SecurityException for url: ", str));
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (n42 != null) {
                ((O4) n42).b("DeeplinkHandler", T.a("URISyntaxException for url: ", str));
            }
            return 5;
        } catch (Exception e10) {
            if (n42 != null) {
                ((O4) n42).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }
}
