package I2;

import I2.AbstractC1164a;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class S0 extends H2.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<WebViewRenderProcess, S0> f51002c = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f51003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<WebViewRenderProcess> f51004b;

    public S0(@NonNull WebViewRenderProcess webViewRenderProcess) {
        this.f51004b = new WeakReference<>(webViewRenderProcess);
    }

    public static /* synthetic */ Object b(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        return new S0(webViewRendererBoundaryInterface);
    }

    @NonNull
    public static S0 c(@NonNull WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, S0> weakHashMap = f51002c;
        S0 s02 = weakHashMap.get(webViewRenderProcess);
        if (s02 != null) {
            return s02;
        }
        S0 s03 = new S0(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, s03);
        return s03;
    }

    @NonNull
    public static S0 d(@NonNull InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (S0) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable() { // from class: I2.R0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return S0.b(webViewRendererBoundaryInterface);
            }
        });
    }

    @Override // H2.v
    public boolean a() {
        AbstractC1164a.h hVar = H0.f50933K;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcessA = Q0.a(this.f51004b.get());
            return webViewRenderProcessA != null && webViewRenderProcessA.terminate();
        }
        if (hVar.d()) {
            return this.f51003a.terminate();
        }
        throw H0.a();
    }

    public S0(@NonNull WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f51003a = webViewRendererBoundaryInterface;
    }
}
