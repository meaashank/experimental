package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
public final class MonotonicFrameClockKt {
    @NotNull
    public static final InterfaceC1981y0 a(@NotNull kotlin.coroutines.i iVar) {
        InterfaceC1981y0 interfaceC1981y0 = (InterfaceC1981y0) iVar.get(InterfaceC1981y0.f100320J2);
        if (interfaceC1981y0 != null) {
            return interfaceC1981y0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @Z
    public static /* synthetic */ void b(kotlin.coroutines.i iVar) {
    }

    @Nullable
    public static final <R> Object c(@NotNull InterfaceC1981y0 interfaceC1981y0, @NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        return interfaceC1981y0.B1(new MonotonicFrameClockKt$withFrameMillis$2(lVar), eVar);
    }

    @Nullable
    public static final <R> Object d(@NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        return a(eVar.getContext()).B1(new MonotonicFrameClockKt$withFrameMillis$2(lVar), eVar);
    }

    public static final <R> Object e(InterfaceC1981y0 interfaceC1981y0, ed.l<? super Long, ? extends R> lVar, kotlin.coroutines.e<? super R> eVar) {
        return interfaceC1981y0.B1(new MonotonicFrameClockKt$withFrameMillis$2(lVar), eVar);
    }

    @Nullable
    public static final <R> Object f(@NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        return a(eVar.getContext()).B1(lVar, eVar);
    }
}
