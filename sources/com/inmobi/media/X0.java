package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X0 {
    public static boolean a(Context context, String url, InterfaceC3502ca redirectionValidator, String api, N4 n42) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.G.p(api, "api");
        if (n42 != null) {
            ((O4) n42).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        if (url.length() != 0) {
            Uri uri = Uri.parse(url);
            if (WebViewInterstitialActivity.f162279v.equals(uri.getScheme()) || WebViewInterstitialActivity.f162277t.equals(uri.getHost()) || "market.android.com".equals(uri.getHost())) {
                Uri uri2 = Uri.parse(url);
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    if (!redirectionValidator.d()) {
                        redirectionValidator.a("EX_".concat(api));
                        return false;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.setPackage("com.android.vending");
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                        if (n42 != null) {
                            ((O4) n42).c("AppstoreLinkHandler", "Playstore link handled successfully");
                        }
                        return true;
                    } catch (Exception e10) {
                        if (n42 != null) {
                            ((O4) n42).c("AppstoreLinkHandler", jd.a(e10, new StringBuilder("Error message in processing appStoreLinkHandling: ")));
                        }
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    e11.printStackTrace();
                    int iA = AbstractC3523e3.a(context, url, redirectionValidator, api, n42);
                    if (iA != 0 && iA != 1) {
                        return false;
                    }
                    if (n42 != null) {
                        ((O4) n42).c("AppstoreLinkHandler", "Playstore link handled successfully");
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
