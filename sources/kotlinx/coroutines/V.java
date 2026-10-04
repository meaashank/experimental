package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public interface V extends U {

    public static final class a {
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull V v10, long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
            Object objA = U.a.a(v10, j10, eVar);
            return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : kotlin.L0.f217464a;
        }

        @NotNull
        public static InterfaceC5058e0 b(@NotNull V v10, long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar) {
            return U.a.b(v10, j10, runnable, iVar);
        }
    }

    @NotNull
    String m(long j10);
}
