package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.W;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.internal.P;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface ReceiveChannel<E> {

    public static final class DefaultImpls {
        public static /* synthetic */ void b(ReceiveChannel receiveChannel, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.a(cancellationException);
        }

        public static /* synthetic */ boolean c(ReceiveChannel receiveChannel, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return receiveChannel.g(th);
        }

        @NotNull
        public static <E> kotlinx.coroutines.selects.e<E> d(@NotNull ReceiveChannel<? extends E> receiveChannel) {
            G.n(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel) receiveChannel).w();
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @InterfaceC4852c0(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @W
        public static /* synthetic */ void f() {
        }

        @InterfaceC5107q0
        public static /* synthetic */ void g() {
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC4852c0(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E h(@NotNull ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            E e10 = (E) receiveChannel.x();
            if (!(e10 instanceof j.c)) {
                j.i(e10);
                return e10;
            }
            Throwable thF = j.f(e10);
            if (thF == null) {
                return null;
            }
            P.o(thF);
            throw thF;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Xc.i
        @kotlin.InterfaceC4982o(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.InterfaceC4852c0(expression = "receiveCatching().getOrNull()", imports = {}))
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <E> java.lang.Object i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r5) throws java.lang.Throwable {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = (kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1) r0
                int r1 = r0.f219160b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f219160b = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f219159a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f219160b
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                kotlin.C4885d0.n(r5)
                kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.j) r5
                java.lang.Object r4 = r5.f219196a
                goto L3f
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L33:
                kotlin.C4885d0.n(r5)
                r0.f219160b = r3
                java.lang.Object r4 = r4.B(r0)
                if (r4 != r1) goto L3f
                return r1
            L3f:
                java.lang.Object r4 = kotlinx.coroutines.channels.j.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.i(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.e):java.lang.Object");
        }
    }

    @Nullable
    Object B(@NotNull kotlin.coroutines.e<? super j<? extends E>> eVar);

    boolean D();

    @NotNull
    kotlinx.coroutines.selects.e<E> E();

    @Nullable
    Object F(@NotNull kotlin.coroutines.e<? super E> eVar);

    void a(@Nullable CancellationException cancellationException);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean g(Throwable th);

    boolean isEmpty();

    @NotNull
    ChannelIterator<E> iterator();

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC4852c0(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E poll();

    @NotNull
    kotlinx.coroutines.selects.e<j<E>> v();

    @NotNull
    kotlinx.coroutines.selects.e<E> w();

    @NotNull
    Object x();

    @Xc.i
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC4852c0(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    Object z(@NotNull kotlin.coroutines.e<? super E> eVar);
}
