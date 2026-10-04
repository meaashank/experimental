package androidx.lifecycle;

import androidx.compose.animation.core.C1598m0;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.i;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.Y0;
import kotlinx.coroutines.flow.FlowKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleKt {
    @NotNull
    public static final LifecycleCoroutineScope a(@NotNull Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.G.p(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.f114029a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, i.b.a.d((JobSupport) Y0.c(null, 1, null), C5052b0.e().Z2()));
        } while (!C1598m0.a(lifecycle.f114029a, null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.f();
        return lifecycleCoroutineScopeImpl;
    }

    @NotNull
    public static final kotlinx.coroutines.flow.e<Lifecycle.Event> b(@NotNull Lifecycle lifecycle) {
        kotlin.jvm.internal.G.p(lifecycle, "<this>");
        return kotlinx.coroutines.flow.h.h(FlowKt__BuildersKt.k(new LifecycleKt$eventFlow$1(lifecycle, null)), C5052b0.e().Z2());
    }
}
