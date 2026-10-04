package kotlinx.coroutines.flow.internal;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SafeCollectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q<kotlinx.coroutines.flow.f<Object>, Object, kotlin.coroutines.e<? super L0>, Object> f220199a;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.f220200a;
        G.n(safeCollectorKt$emitFun$1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        Y.q(safeCollectorKt$emitFun$1, 3);
        f220199a = safeCollectorKt$emitFun$1;
    }

    public static /* synthetic */ void b() {
    }
}
