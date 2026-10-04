package kotlinx.coroutines;

import kotlin.C4885d0;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,63:1\n57#2,2:64\n57#2,2:66\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n17#1:64,2\n23#1:66,2\n*E\n"})
public final class E {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return obj instanceof B ? C4885d0.a(((B) obj).f218701a) : obj;
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj, @Nullable ed.l<? super Throwable, kotlin.L0> lVar) {
        Throwable thE = Result.e(obj);
        return thE == null ? lVar != null ? new C(obj, lVar) : obj : new B(thE, false, 2, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @NotNull InterfaceC5100n<?> interfaceC5100n) {
        Throwable thE = Result.e(obj);
        return thE == null ? obj : new B(thE, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, ed.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
