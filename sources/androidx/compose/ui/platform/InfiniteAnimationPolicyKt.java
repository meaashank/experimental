package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    @Nullable
    public static final <R> Object a(@NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        InterfaceC2267o0 interfaceC2267o0 = (InterfaceC2267o0) eVar.getContext().get(InterfaceC2267o0.f103904T2);
        return interfaceC2267o0 == null ? MonotonicFrameClockKt.a(eVar.getContext()).B1(lVar, eVar) : interfaceC2267o0.n2(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), eVar);
    }
}
