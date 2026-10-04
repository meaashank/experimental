package kotlinx.coroutines.channels;

import androidx.compose.ui.input.pointer.C2151s;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.C5110s0;
import kotlinx.coroutines.O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class TickerChannelsKt {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r6, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007b -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.s<? super kotlin.L0> r10, kotlin.coroutines.e<? super kotlin.L0> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.f219164d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219164d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f219163c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219164d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            long r6 = r0.f219161a
            java.lang.Object r8 = r0.f219162b
            kotlinx.coroutines.channels.s r8 = (kotlinx.coroutines.channels.s) r8
            kotlin.C4885d0.n(r11)
        L32:
            r10 = r8
            goto L61
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            long r6 = r0.f219161a
            java.lang.Object r8 = r0.f219162b
            kotlinx.coroutines.channels.s r8 = (kotlinx.coroutines.channels.s) r8
            kotlin.C4885d0.n(r11)
            goto L71
        L46:
            long r6 = r0.f219161a
            java.lang.Object r8 = r0.f219162b
            r10 = r8
            kotlinx.coroutines.channels.s r10 = (kotlinx.coroutines.channels.s) r10
            kotlin.C4885d0.n(r11)
            goto L61
        L51:
            kotlin.C4885d0.n(r11)
            r0.f219162b = r10
            r0.f219161a = r6
            r0.f219164d = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r8, r0)
            if (r8 != r1) goto L61
            goto L7d
        L61:
            kotlin.L0 r8 = kotlin.L0.f217464a
            r0.f219162b = r10
            r0.f219161a = r6
            r0.f219164d = r4
            java.lang.Object r8 = r10.I(r8, r0)
            if (r8 != r1) goto L70
            goto L7d
        L70:
            r8 = r10
        L71:
            r0.f219162b = r8
            r0.f219161a = r6
            r0.f219164d = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r0)
            if (r9 != r1) goto L32
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.c(long, long, kotlinx.coroutines.channels.s, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r13 / 1000000, r1) != r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e3 -> B:19:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f5 -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r21, long r23, kotlinx.coroutines.channels.s<? super kotlin.L0> r25, kotlin.coroutines.e<? super kotlin.L0> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.d(long, long, kotlinx.coroutines.channels.s, kotlin.coroutines.e):java.lang.Object");
    }

    @O0
    @NotNull
    public static final ReceiveChannel<L0> e(long j10, long j11, @NotNull kotlin.coroutines.i iVar, @NotNull TickerMode tickerMode) {
        if (j10 < 0) {
            throw new IllegalArgumentException(C2151s.a("Expected non-negative delay, but has ", j10, " ms").toString());
        }
        if (j11 >= 0) {
            return ProduceKt.c(C5110s0.f220641a, C5052b0.g().plus(iVar), 0, new TickerChannelsKt$ticker$3(tickerMode, j10, j11, null));
        }
        throw new IllegalArgumentException(C2151s.a("Expected non-negative initial delay, but has ", j11, " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel f(long j10, long j11, kotlin.coroutines.i iVar, TickerMode tickerMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        if ((i10 & 4) != 0) {
            iVar = EmptyCoroutineContext.f217673a;
        }
        if ((i10 & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return e(j10, j11, iVar, tickerMode);
    }
}
