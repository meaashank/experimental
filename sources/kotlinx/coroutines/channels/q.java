package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlinx.coroutines.L;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface q<E> extends L, s<E> {

    public static final class a {
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@NotNull q<? super E> qVar, E e10) {
            return s.a.c(qVar, e10);
        }
    }

    @NotNull
    s<E> d();
}
