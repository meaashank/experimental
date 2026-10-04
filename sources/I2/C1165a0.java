package I2;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: I2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(29)
public class C1165a0 {
    @Deprecated
    public static int a(@NonNull WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    @Nullable
    public static WebViewRenderProcess b(@NonNull WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    @Nullable
    public static WebViewRenderProcessClient c(@NonNull WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void d(@NonNull WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    public static void e(@NonNull WebView webView, @Nullable H2.w wVar) {
        webView.setWebViewRenderProcessClient(wVar != null ? new P0(wVar) : null);
    }

    public static void f(@NonNull WebView webView, @NonNull Executor executor, @Nullable H2.w wVar) {
        webView.setWebViewRenderProcessClient(executor, wVar != null ? new P0(wVar) : null);
    }

    public static boolean g(@NonNull WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
