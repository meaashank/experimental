package androidx.webkit;

import H2.h;
import H2.q;
import I2.C1195p0;
import I2.E0;
import I2.H0;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;
import e.e0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f120046a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @e0
    public void a(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull q qVar) {
        if (H0.d("WEB_RESOURCE_ERROR_GET_CODE") && H0.d("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, qVar.b(), qVar.a().toString(), webResourceRequest.getUrl().toString());
        }
    }

    @e0
    public void b(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i10, @NonNull h hVar) {
        if (!H0.d("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw H0.a();
        }
        hVar.c(true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(@NonNull WebView webView, @NonNull PendingIntent pendingIntent, @NonNull InvocationHandler invocationHandler) {
        return false;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String[] getSupportedFeatures() {
        return f120046a;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @e0
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull InvocationHandler invocationHandler) {
        a(webView, webResourceRequest, new E0(invocationHandler));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @e0
    public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i10, @NonNull InvocationHandler invocationHandler) {
        b(webView, webResourceRequest, i10, new C1195p0(invocationHandler));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @e0
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @T(23)
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
        a(webView, webResourceRequest, new E0(webResourceError));
    }

    @Override // android.webkit.WebViewClient
    @T(27)
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i10, @NonNull SafeBrowsingResponse safeBrowsingResponse) {
        b(webView, webResourceRequest, i10, new C1195p0(safeBrowsingResponse));
    }
}
