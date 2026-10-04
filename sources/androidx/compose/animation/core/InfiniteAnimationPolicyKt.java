package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InterfaceC2267o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    @Nullable
    public static final <R> Object a(@NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        return c(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar), eVar);
    }

    public static final <R> Object b(ed.l<? super Long, ? extends R> lVar, kotlin.coroutines.e<? super R> eVar) {
        return c(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar), eVar);
    }

    @Nullable
    public static final <R> Object c(@NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        InterfaceC2267o0 interfaceC2267o0 = (InterfaceC2267o0) eVar.getContext().get(InterfaceC2267o0.f103904T2);
        return interfaceC2267o0 == null ? MonotonicFrameClockKt.a(eVar.getContext()).B1(lVar, eVar) : interfaceC2267o0.n2(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), eVar);
    }
}
