package ha;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;
import ha.x;
import java.util.Collections;
import java.util.Map;
import kotlin.text.X;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f202583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202584b;

    public interface a {
        void open(String str);
    }

    public v(Uri uri, String str) {
        this.f202583a = uri;
        this.f202584b = str;
    }

    public static void a(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append(X.f218302d);
        }
        sb2.append(str);
    }

    public static v b(x.a aVar) {
        if (aVar.f202596a.equals("google_play")) {
            Uri uriF = f(new Uri.Builder().scheme("https").authority(WebViewInterstitialActivity.f162277t).path(WebViewInterstitialActivity.f162278u).appendQueryParameter("id", aVar.f202600e).build(), aVar);
            return new v(uriF, uriF.toString());
        }
        if (!aVar.f202596a.equals("web") && !aVar.f202596a.equals(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
            return null;
        }
        Uri uri = Uri.parse(aVar.f202597b);
        boolean z10 = false;
        boolean z11 = "https".equalsIgnoreCase(uri.getScheme()) && WebViewInterstitialActivity.f162277t.equalsIgnoreCase(uri.getHost()) && (uri.getPort() == -1 || uri.getPort() == 443) && WebViewInterstitialActivity.f162278u.equals(uri.getPath());
        if (WebViewInterstitialActivity.f162279v.equalsIgnoreCase(uri.getScheme()) && WebViewInterstitialActivity.f162280w.equalsIgnoreCase(uri.getHost()) && uri.getPort() == -1 && (uri.getPath() == null || uri.getPath().isEmpty() || uri.getPath().equals(RemoteSettings.FORWARD_SLASH_STRING))) {
            z10 = true;
        }
        if ((!z11 && !z10) || uri.getUserInfo() != null || uri.getQueryParameters("id").size() != 1 || !x.a.a(uri.getQueryParameter("id"))) {
            return null;
        }
        Uri uriF2 = f(new Uri.Builder().scheme("https").authority(WebViewInterstitialActivity.f162277t).path(WebViewInterstitialActivity.f162278u).encodedQuery(uri.getEncodedQuery()).build(), aVar);
        String string = aVar.f202596a.equals(CampaignEx.JSON_KEY_DEEP_LINK_URL) ? aVar.f202598c : uriF2.toString();
        if (aVar.f202596a.equals(CampaignEx.JSON_KEY_DEEP_LINK_URL) && c(aVar)) {
            Uri uri2 = Uri.parse(string);
            if ("https".equalsIgnoreCase(uri2.getScheme()) && WebViewInterstitialActivity.f162277t.equalsIgnoreCase(uri2.getHost()) && uri2.getUserInfo() == null && ((uri2.getPort() == -1 || uri2.getPort() == 443) && WebViewInterstitialActivity.f162278u.equals(uri2.getPath()) && uri2.getQueryParameters("id").size() == 1 && uriF2.getQueryParameter("id").equals(uri2.getQueryParameter("id")))) {
                string = uri2.buildUpon().encodedQuery(e(uri2.getEncodedQuery(), Collections.singletonMap("referrer", uriF2.getQueryParameter("referrer")))).build().toString();
            }
        }
        return new v(uriF2, string);
    }

    public static boolean c(x.a aVar) {
        return (aVar.f202601f.isEmpty() && aVar.f202602g.isEmpty()) ? false : true;
    }

    public static String e(String str, Map<String, String> map) {
        if (map.isEmpty()) {
            return str == null ? "" : str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split("&")) {
                int iIndexOf = str2.indexOf(61);
                String strDecode = Uri.decode(iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf));
                if (!str2.isEmpty() && !map.containsKey(strDecode)) {
                    a(sb2, str2);
                }
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(sb2, new Uri.Builder().appendQueryParameter(entry.getKey(), entry.getValue()).build().getEncodedQuery());
        }
        return sb2.toString();
    }

    public static Uri f(Uri uri, x.a aVar) {
        if (c(aVar)) {
            return uri.buildUpon().encodedQuery(e(uri.getEncodedQuery(), Collections.singletonMap("referrer", e(aVar.f202601f.isEmpty() ? uri.getQueryParameter("referrer") : aVar.f202601f, aVar.f202602g)))).build();
        }
        return uri;
    }

    public void d(Context context, a aVar) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", this.f202583a).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException | SecurityException unused) {
            aVar.open(this.f202584b);
        }
    }
}
