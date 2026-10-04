package I2;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: I2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(26)
public class C1209x {
    @NonNull
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean b(@NonNull WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    @Nullable
    public static WebChromeClient c(@NonNull WebView webView) {
        return webView.getWebChromeClient();
    }

    @Nullable
    public static WebViewClient d(@NonNull WebView webView) {
        return webView.getWebViewClient();
    }

    public static void e(@NonNull WebSettings webSettings, boolean z10) {
        webSettings.setSafeBrowsingEnabled(z10);
    }
}
