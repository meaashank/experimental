package I2;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@e.T(29)
public class P0 extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.w f51000a;

    public P0(@NonNull H2.w wVar) {
        this.f51000a = wVar;
    }

    @Nullable
    public H2.w a() {
        return this.f51000a;
    }

    public void onRenderProcessResponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        this.f51000a.a(webView, S0.c(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        this.f51000a.b(webView, S0.c(webViewRenderProcess));
    }
}
