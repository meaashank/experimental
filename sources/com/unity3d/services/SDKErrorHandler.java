package com.unity3d.services;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import ed.p;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.H;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class SDKErrorHandler implements H {
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final H.b key;

    public SDKErrorHandler(@NotNull ISDKDispatchers dispatchers) {
        G.p(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.key = H.f218728z3;
    }

    private final void sendMetric(Metric metric) {
        SDKMetrics.getInstance().sendMetric(metric);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull p<? super R, ? super i.b, ? extends R> operation) {
        G.p(operation, "operation");
        return (R) i.b.a.a(this, r10, operation);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> key) {
        G.p(key, "key");
        return (E) i.b.a.b(this, key);
    }

    @Override // kotlinx.coroutines.H
    public void handleException(@NotNull i context, @NotNull Throwable exception) {
        G.p(context, "context");
        G.p(exception, "exception");
        StackTraceElement stackTraceElement = exception.getStackTrace()[0];
        G.o(stackTraceElement, "exception.stackTrace[0]");
        String fileName = stackTraceElement.getFileName();
        G.o(fileName, "exception.stackTrace[0].fileName");
        StackTraceElement stackTraceElement2 = exception.getStackTrace()[0];
        G.o(stackTraceElement2, "exception.stackTrace[0]");
        int lineNumber = stackTraceElement2.getLineNumber();
        sendMetric(new Metric(exception instanceof NullPointerException ? "native_exception_npe" : exception instanceof OutOfMemoryError ? "native_exception_oom" : exception instanceof IllegalStateException ? "native_exception_ise" : exception instanceof RuntimeException ? "native_exception_re" : exception instanceof SecurityException ? "native_exception_se" : "native_exception", "{" + fileName + "}_" + lineNumber, null));
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public i minusKey(@NotNull i.c<?> key) {
        G.p(key, "key");
        return i.b.a.c(this, key);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public i plus(@NotNull i context) {
        G.p(context, "context");
        return i.b.a.d(this, context);
    }

    @Override // kotlin.coroutines.i.b
    @NotNull
    public H.b getKey() {
        return this.key;
    }
}
