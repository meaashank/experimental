package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlinx.coroutines.W;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.internal.P;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface s<E> {

    public static final class a {
        public static /* synthetic */ boolean a(s sVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return sVar.G(th);
        }

        @W
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull s<? super E> sVar, E e10) throws Throwable {
            Object objT = sVar.t(e10);
            if (!(objT instanceof j.c)) {
                return true;
            }
            Throwable thF = j.f(objT);
            if (thF == null) {
                return false;
            }
            P.o(thF);
            throw thF;
        }
    }

    boolean C();

    boolean G(@Nullable Throwable th);

    void H(@NotNull ed.l<? super Throwable, L0> lVar);

    @Nullable
    Object I(E e10, @NotNull kotlin.coroutines.e<? super L0> eVar);

    @NotNull
    kotlinx.coroutines.selects.g<E, s<E>> h();

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e10);

    @NotNull
    Object t(E e10);
}
