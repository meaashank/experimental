package kotlinx.coroutines.rx3;

import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import zc.I;
import zc.T;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRxChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxChannel.kt\nkotlinx/coroutines/rx3/RxChannelKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,87:1\n81#2:88\n58#2,6:89\n82#2,2:95\n68#2:97\n64#2,3:98\n58#2,6:101\n82#2,2:107\n68#2:109\n64#2,3:110\n81#2:113\n58#2,6:114\n82#2,2:120\n68#2:122\n64#2,3:123\n81#2:126\n58#2,6:127\n82#2,2:133\n68#2:135\n64#2,3:136\n*S KotlinDebug\n*F\n+ 1 RxChannel.kt\nkotlinx/coroutines/rx3/RxChannelKt\n*L\n44#1:88\n44#1:89,6\n44#1:95,2\n44#1:97\n44#1:98,3\n44#1:101,6\n44#1:107,2\n44#1:109\n44#1:110,3\n52#1:113\n52#1:114,6\n52#1:120,2\n52#1:122\n52#1:123,3\n52#1:126\n52#1:127,6\n52#1:133,2\n52#1:135\n52#1:136,3\n*E\n"})
public final class RxChannelKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #2 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d), top: B:46:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:14:0x0035). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull zc.I<T> r5, @org.jetbrains.annotations.NotNull ed.l<? super T, kotlin.L0> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx3.RxChannelKt$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx3.RxChannelKt$collect$1 r0 = (kotlinx.coroutines.rx3.RxChannelKt$collect$1) r0
            int r1 = r0.f220568e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220568e = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxChannelKt$collect$1 r0 = new kotlinx.coroutines.rx3.RxChannelKt$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f220567d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220568e
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f220566c
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.f220565b
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.f220564a
            ed.l r2 = (ed.l) r2
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L37
            r4 = r0
            r0 = r6
            r6 = r2
        L35:
            r2 = r4
            goto L65
        L37:
            r5 = move-exception
            goto L88
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.C4885d0.n(r7)
            kotlinx.coroutines.channels.ReceiveChannel r5 = e(r5)
            r7 = r5
            kotlinx.coroutines.channels.BufferedChannel r7 = (kotlinx.coroutines.channels.BufferedChannel) r7     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.channels.BufferedChannel$a r2 = new kotlinx.coroutines.channels.BufferedChannel$a     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            r7 = r5
            r5 = r2
        L52:
            r0.f220564a = r6     // Catch: java.lang.Throwable -> L81
            r0.f220565b = r7     // Catch: java.lang.Throwable -> L81
            r0.f220566c = r5     // Catch: java.lang.Throwable -> L81
            r0.f220568e = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L81
            if (r2 != r1) goto L61
            return r1
        L61:
            r4 = r0
            r0 = r7
            r7 = r2
            goto L35
        L65:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L77
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L77
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L77
            r7 = r0
            r0 = r2
            goto L52
        L77:
            r5 = move-exception
            r6 = r0
            goto L88
        L7a:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r0, r5)
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L81:
            r5 = move-exception
            r6 = r7
            goto L88
        L84:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L88:
            throw r5     // Catch: java.lang.Throwable -> L89
        L89:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxChannelKt.a(zc.I, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #2 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d), top: B:46:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:14:0x0035). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull zc.T<T> r5, @org.jetbrains.annotations.NotNull ed.l<? super T, kotlin.L0> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx3.RxChannelKt$collect$2
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx3.RxChannelKt$collect$2 r0 = (kotlinx.coroutines.rx3.RxChannelKt$collect$2) r0
            int r1 = r0.f220573e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220573e = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxChannelKt$collect$2 r0 = new kotlinx.coroutines.rx3.RxChannelKt$collect$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f220572d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220573e
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f220571c
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.f220570b
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.f220569a
            ed.l r2 = (ed.l) r2
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L37
            r4 = r0
            r0 = r6
            r6 = r2
        L35:
            r2 = r4
            goto L65
        L37:
            r5 = move-exception
            goto L88
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.C4885d0.n(r7)
            kotlinx.coroutines.channels.ReceiveChannel r5 = f(r5)
            r7 = r5
            kotlinx.coroutines.channels.BufferedChannel r7 = (kotlinx.coroutines.channels.BufferedChannel) r7     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.channels.BufferedChannel$a r2 = new kotlinx.coroutines.channels.BufferedChannel$a     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            r7 = r5
            r5 = r2
        L52:
            r0.f220569a = r6     // Catch: java.lang.Throwable -> L81
            r0.f220570b = r7     // Catch: java.lang.Throwable -> L81
            r0.f220571c = r5     // Catch: java.lang.Throwable -> L81
            r0.f220573e = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L81
            if (r2 != r1) goto L61
            return r1
        L61:
            r4 = r0
            r0 = r7
            r7 = r2
            goto L35
        L65:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L77
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L77
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L77
            r7 = r0
            r0 = r2
            goto L52
        L77:
            r5 = move-exception
            r6 = r0
            goto L88
        L7a:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r0, r5)
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L81:
            r5 = move-exception
            r6 = r7
            goto L88
        L84:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L88:
            throw r5     // Catch: java.lang.Throwable -> L89
        L89:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxChannelKt.b(zc.T, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public static final <T> Object c(I<T> i10, ed.l<? super T, L0> lVar, kotlin.coroutines.e<? super L0> eVar) {
        ReceiveChannel receiveChannelE = e(i10);
        try {
            ChannelIterator it = receiveChannelE.iterator();
            while (((Boolean) it.c(null)).booleanValue()) {
                lVar.invoke((Object) it.next());
            }
            ChannelsKt__Channels_commonKt.a(receiveChannelE, null);
            return L0.f217464a;
        } finally {
        }
    }

    public static final <T> Object d(T<T> t10, ed.l<? super T, L0> lVar, kotlin.coroutines.e<? super L0> eVar) {
        ReceiveChannel receiveChannelF = f(t10);
        try {
            ChannelIterator it = receiveChannelF.iterator();
            while (((Boolean) it.c(null)).booleanValue()) {
                lVar.invoke((Object) it.next());
            }
            ChannelsKt__Channels_commonKt.a(receiveChannelF, null);
            return L0.f217464a;
        } finally {
        }
    }

    @InterfaceC4850b0
    @NotNull
    public static final <T> ReceiveChannel<T> e(@NotNull I<T> i10) {
        s sVar = new s();
        i10.b(sVar);
        return sVar;
    }

    @InterfaceC4850b0
    @NotNull
    public static final <T> ReceiveChannel<T> f(@NotNull T<T> t10) {
        s sVar = new s();
        t10.a(sVar);
        return sVar;
    }
}
