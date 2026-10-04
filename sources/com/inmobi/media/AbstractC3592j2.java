package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3592j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f153032a = 0;

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context != null) {
            try {
                return new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(context.getPackageManager()) != null;
            } catch (Exception unused) {
                return false;
            }
        }
        Uri uri = Uri.parse(str);
        kotlin.jvm.internal.G.o(uri, "parse(...)");
        return a(uri);
    }

    public static final String b(Context context, C3471a7 c3471a7, String str, String str2) {
        String stringExtra;
        if (AbstractC3620l2.a(str)) {
            kotlin.jvm.internal.G.m(str);
            return a(context, c3471a7, str, (String) null);
        }
        try {
            Uri uri = Uri.parse(str2);
            try {
                stringExtra = Intent.parseUri(str2, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
                stringExtra = null;
            }
            if ("intent".equals(uri.getScheme()) && AbstractC3620l2.a(stringExtra)) {
                String strDecode = URLDecoder.decode(stringExtra, "UTF-8");
                kotlin.jvm.internal.G.o(strDecode, "decode(...)");
                return a(context, c3471a7, strDecode, (String) null);
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static int a(Context context, String url, ResolveInfo resolveInfo, InterfaceC3502ca redirectionValidator, String api) throws URISyntaxException {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.G.p(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_".concat(api));
            return 8;
        }
        Intent uri = Intent.parseUri(url, 3);
        kotlin.jvm.internal.G.o(uri, "parseUri(...)");
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    uri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        uri.setFlags(268435456);
        context.startActivity(uri);
        return 0;
    }

    public static ArrayList b(Context context, String url) throws URISyntaxException {
        kotlin.jvm.internal.G.p(url, "url");
        ArrayList arrayList = new ArrayList();
        if (url.length() != 0 && context != null) {
            Intent uri = Intent.parseUri(url, 3);
            kotlin.jvm.internal.G.o(uri, "parseUri(...)");
            List<ResolveInfo> listQueryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, uri, 0);
            kotlin.jvm.internal.G.o(listQueryIntentActivityOptions, "queryIntentActivityOptions(...)");
            for (ResolveInfo resolveInfo : listQueryIntentActivityOptions) {
                if (resolveInfo.activityInfo.exported) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        return arrayList;
    }

    public static int a(Context context, String url, InterfaceC3502ca redirectionValidator, String api) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.G.p(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_".concat(api));
            return 8;
        }
        String stringExtra = null;
        try {
            Intent uri = Intent.parseUri(url, 0);
            uri.setFlags(268435456);
            context.startActivity(uri);
            return 0;
        } catch (ActivityNotFoundException e10) {
            Uri uri2 = Uri.parse(url);
            try {
                stringExtra = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
            }
            if ("intent".equals(uri2.getScheme()) && stringExtra != null && stringExtra.length() != 0) {
                return a(context, stringExtra, redirectionValidator, api);
            }
            throw e10;
        } catch (NullPointerException e11) {
            Uri uri3 = Uri.parse(url);
            try {
                stringExtra = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused2) {
            }
            if ("intent".equals(uri3.getScheme()) && stringExtra != null && stringExtra.length() != 0) {
                return a(context, stringExtra, redirectionValidator, api);
            }
            throw e11;
        }
    }

    public static String a(Context context, C3471a7 redirectionValidator, String url, String str) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        if (context == null) {
            return null;
        }
        try {
            Intent uri = Intent.parseUri(url, 0);
            if (uri.resolveActivity(context.getPackageManager()) != null) {
                uri.setFlags(268435456);
                context.startActivity(uri);
                return url;
            }
            return b(context, redirectionValidator, str, url);
        } catch (Exception unused) {
            return b(context, redirectionValidator, str, url);
        }
    }

    public static boolean a(Uri uri) {
        kotlin.jvm.internal.G.p(uri, "uri");
        return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
    }

    public static boolean a(String url) {
        kotlin.jvm.internal.G.p(url, "url");
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.G.m(uri);
        return (!a(uri) || WebViewInterstitialActivity.f162277t.equals(uri.getHost()) || "market.android.com".equals(uri.getHost()) || WebViewInterstitialActivity.f162279v.equals(uri.getScheme())) ? false : true;
    }
}
