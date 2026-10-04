package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlinx.coroutines.L;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@O0
public interface c<E> extends L, ReceiveChannel<E> {

    public static final class a {
        @NotNull
        public static <E> kotlinx.coroutines.selects.e<E> b(@NotNull c<E> cVar) {
            return ReceiveChannel.DefaultImpls.d(cVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC4852c0(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E c(@NotNull c<E> cVar) {
            return (E) ReceiveChannel.DefaultImpls.h(cVar);
        }

        @Xc.i
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC4852c0(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object d(@NotNull c<E> cVar, @NotNull kotlin.coroutines.e<? super E> eVar) {
            return ReceiveChannel.DefaultImpls.i(cVar, eVar);
        }
    }

    @NotNull
    g<E> d();
}
