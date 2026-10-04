package I2;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@e.T(28)
public class S {
    @NonNull
    public static TracingController a() {
        return TracingController.getInstance();
    }

    @NonNull
    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    @NonNull
    public static Looper c(@NonNull WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(@NonNull TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(@NonNull TracingController tracingController, @NonNull TracingConfig tracingConfig) {
        tracingController.start(H.a().addCategories(tracingConfig.b()).addCategories((Collection<String>) tracingConfig.a()).setTracingMode(tracingConfig.c()).build());
    }

    public static boolean g(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
