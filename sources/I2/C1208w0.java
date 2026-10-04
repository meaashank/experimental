package I2;

import I2.AbstractC1164a;
import I2.I0;
import android.webkit.TracingController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: renamed from: I2.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1208w0 extends H2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TracingController f51041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TracingControllerBoundaryInterface f51042b;

    public C1208w0() {
        AbstractC1164a.g gVar = H0.f50934L;
        if (gVar.c()) {
            this.f51041a = TracingController.getInstance();
            this.f51042b = null;
        } else {
            if (!gVar.d()) {
                throw H0.a();
            }
            this.f51041a = null;
            this.f51042b = I0.b.f50988a.getTracingController();
        }
    }

    @Override // H2.m
    public boolean b() {
        AbstractC1164a.g gVar = H0.f50934L;
        if (gVar.c()) {
            return f().isTracing();
        }
        if (gVar.d()) {
            return e().isTracing();
        }
        throw H0.a();
    }

    @Override // H2.m
    public void c(@NonNull TracingConfig tracingConfig) {
        if (tracingConfig == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        AbstractC1164a.g gVar = H0.f50934L;
        if (gVar.c()) {
            S.f(f(), tracingConfig);
        } else {
            if (!gVar.d()) {
                throw H0.a();
            }
            e().start(tracingConfig.b(), tracingConfig.a(), tracingConfig.c());
        }
    }

    @Override // H2.m
    public boolean d(@Nullable OutputStream outputStream, @NonNull Executor executor) {
        AbstractC1164a.g gVar = H0.f50934L;
        if (gVar.c()) {
            return f().stop(outputStream, executor);
        }
        if (gVar.d()) {
            return e().stop(outputStream, executor);
        }
        throw H0.a();
    }

    public final TracingControllerBoundaryInterface e() {
        if (this.f51042b == null) {
            this.f51042b = I0.b.f50988a.getTracingController();
        }
        return this.f51042b;
    }

    @e.T(28)
    public final TracingController f() {
        if (this.f51041a == null) {
            this.f51041a = TracingController.getInstance();
        }
        return this.f51041a;
    }
}
