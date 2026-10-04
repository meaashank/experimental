package kotlinx.coroutines.channels;

import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.internal.W;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedChannelKt {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f218899B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f218900C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f218901D = 2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f218902E = 3;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f218903F = 60;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final long f218904G = 1152921504606846975L;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final long f218905H = 4611686018427387904L;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final long f218906I = 4611686018427387903L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f218910d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f218911e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f218924r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f218925s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f218926t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f218927u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f218928v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f218929w = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k<Object> f218907a = new k<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public static final int f218908b = W.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218909c = W.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Q f218912f = new Q("BUFFERED");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Q f218913g = new Q("SHOULD_BUFFER");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Q f218914h = new Q("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Q f218915i = new Q("RESUMING_BY_EB");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Q f218916j = new Q("POISONED");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Q f218917k = new Q("DONE_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Q f218918l = new Q("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Q f218919m = new Q("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Q f218920n = new Q("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Q f218921o = new Q("SUSPEND");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Q f218922p = new Q("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Q f218923q = new Q("FAILED");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final Q f218930x = new Q("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final Q f218931y = new Q("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final Q f218932z = new Q("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public static final Q f218898A = new Q("NO_CLOSE_CAUSE");

    public static final long A(long j10) {
        return j10 & 4611686018427387903L;
    }

    public static final boolean B(long j10) {
        return (j10 & 4611686018427387904L) != 0;
    }

    public static final int C(long j10) {
        return (int) (j10 >> 60);
    }

    public static final long D(long j10) {
        return j10 & f218904G;
    }

    public static final long E(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean F(InterfaceC5100n<? super T> interfaceC5100n, T t10, ed.l<? super Throwable, L0> lVar) {
        Object objH0 = interfaceC5100n.h0(t10, null, lVar);
        if (objH0 == null) {
            return false;
        }
        interfaceC5100n.c0(objH0);
        return true;
    }

    public static /* synthetic */ boolean G(InterfaceC5100n interfaceC5100n, Object obj, ed.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return F(interfaceC5100n, obj, lVar);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    public static final <E> k<E> x(long j10, k<E> kVar) {
        BufferedChannel<E> bufferedChannel = kVar.f219198e;
        G.m(bufferedChannel);
        return new k<>(j10, kVar, bufferedChannel, 0);
    }

    @NotNull
    public static final <E> kotlin.reflect.i<k<E>> y() {
        return BufferedChannelKt$createSegmentFunction$1.f218933a;
    }

    @NotNull
    public static final Q z() {
        return f218920n;
    }
}
