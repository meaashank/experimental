package I2;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class O0 implements WebViewRendererClientBoundaryInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f50997c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f50998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H2.w f50999b;

    @SuppressLint({"LambdaLast"})
    public O0(@Nullable Executor executor, @Nullable H2.w wVar) {
        this.f50998a = executor;
        this.f50999b = wVar;
    }

    @Nullable
    public H2.w c() {
        return this.f50999b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return f50997c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(@NonNull final WebView webView, @NonNull InvocationHandler invocationHandler) {
        final S0 s0D = S0.d(invocationHandler);
        final H2.w wVar = this.f50999b;
        Executor executor = this.f50998a;
        if (executor == null) {
            wVar.a(webView, s0D);
        } else {
            executor.execute(new Runnable() { // from class: I2.M0
                @Override // java.lang.Runnable
                public final void run() {
                    wVar.a(webView, s0D);
                }
            });
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(@NonNull final WebView webView, @NonNull InvocationHandler invocationHandler) {
        final S0 s0D = S0.d(invocationHandler);
        final H2.w wVar = this.f50999b;
        Executor executor = this.f50998a;
        if (executor == null) {
            wVar.b(webView, s0D);
        } else {
            executor.execute(new Runnable() { // from class: I2.N0
                @Override // java.lang.Runnable
                public final void run() {
                    wVar.b(webView, s0D);
                }
            });
        }
    }
}
