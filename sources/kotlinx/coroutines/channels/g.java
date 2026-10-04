package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.internal.W;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface g<E> extends s<E>, ReceiveChannel<E> {

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    @NotNull
    public static final b f219178B3 = b.f219185a;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public static final int f219179C3 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public static final int f219180D3 = 0;

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public static final int f219181E3 = -1;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public static final int f219182F3 = -2;

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public static final int f219183G3 = -3;

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    @NotNull
    public static final String f219184H3 = "kotlinx.coroutines.channels.defaultBuffer";

    public static final class a {
        @NotNull
        public static <E> kotlinx.coroutines.selects.e<E> b(@NotNull g<E> gVar) {
            return ReceiveChannel.DefaultImpls.d(gVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull g<E> gVar, E e10) {
            return s.a.c(gVar, e10);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC4852c0(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E d(@NotNull g<E> gVar) {
            return (E) ReceiveChannel.DefaultImpls.h(gVar);
        }

        @Xc.i
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC4852c0(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object e(@NotNull g<E> gVar, @NotNull kotlin.coroutines.e<? super E> eVar) {
            return ReceiveChannel.DefaultImpls.i(gVar, eVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f219186b = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f219187c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f219188d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f219189e = -2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f219190f = -3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f219191g = "kotlinx.coroutines.channels.defaultBuffer";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f219185a = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f219192h = W.a("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return f219192h;
        }
    }
}
