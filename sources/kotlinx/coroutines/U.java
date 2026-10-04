package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public interface U {

    @kotlin.jvm.internal.V({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n318#2,11:160\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n27#1:160,11\n*E\n"})
    public static final class a {
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull U u10, long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
            if (j10 <= 0) {
                return kotlin.L0.f217464a;
            }
            C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
            c5102o.n0();
            u10.T0(j10, c5102o);
            Object objZ = c5102o.z();
            return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : kotlin.L0.f217464a;
        }

        @NotNull
        public static InterfaceC5058e0 b(@NotNull U u10, long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar) {
            return Q.a().h1(j10, runnable, iVar);
        }
    }

    void T0(long j10, @NotNull InterfaceC5100n<? super kotlin.L0> interfaceC5100n);

    @NotNull
    InterfaceC5058e0 h1(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar);

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object p2(long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar);
}
