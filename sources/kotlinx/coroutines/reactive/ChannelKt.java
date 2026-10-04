package kotlinx.coroutines.reactive;

import ed.l;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,107:1\n81#2:108\n58#2,6:109\n82#2,2:115\n68#2:117\n64#2,3:118\n58#2,6:121\n82#2,2:127\n68#2:129\n64#2,3:130\n*S KotlinDebug\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt\n*L\n15#1:108\n15#1:109,6\n15#1:115,2\n15#1:117\n15#1:118,3\n15#1:121,6\n15#1:127,2\n15#1:129\n15#1:130,3\n*E\n"})
public final class ChannelKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #3 {all -> 0x0079, blocks: (B:26:0x0067, B:28:0x006f), top: B:48:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0063 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull org.reactivestreams.Publisher<T> r6, @org.jetbrains.annotations.NotNull ed.l<? super T, kotlin.L0> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.reactive.ChannelKt$collect$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = (kotlinx.coroutines.reactive.ChannelKt$collect$1) r0
            int r1 = r0.f220459e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220459e = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = new kotlinx.coroutines.reactive.ChannelKt$collect$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f220458d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220459e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.f220457c
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f220456b
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f220455a
            ed.l r2 = (ed.l) r2
            kotlin.C4885d0.n(r8)     // Catch: java.lang.Throwable -> L38
            r5 = r0
            r0 = r7
            r7 = r2
        L36:
            r2 = r5
            goto L67
        L38:
            r6 = move-exception
            goto L89
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            kotlin.C4885d0.n(r8)
            r8 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = f(r6, r8, r3, r4)
            r8 = r6
            kotlinx.coroutines.channels.BufferedChannel r8 = (kotlinx.coroutines.channels.BufferedChannel) r8     // Catch: java.lang.Throwable -> L85
            kotlinx.coroutines.channels.BufferedChannel$a r2 = new kotlinx.coroutines.channels.BufferedChannel$a     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            r8 = r6
            r6 = r2
        L54:
            r0.f220455a = r7     // Catch: java.lang.Throwable -> L82
            r0.f220456b = r8     // Catch: java.lang.Throwable -> L82
            r0.f220457c = r6     // Catch: java.lang.Throwable -> L82
            r0.f220459e = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto L63
            return r1
        L63:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L36
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L79
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L79
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L79
            r8 = r0
            r0 = r2
            goto L54
        L79:
            r6 = move-exception
            r7 = r0
            goto L89
        L7c:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r0, r4)
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L82:
            r6 = move-exception
            r7 = r8
            goto L89
        L85:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L89:
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ChannelKt.a(org.reactivestreams.Publisher, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public static final <T> Object b(Publisher<T> publisher, l<? super T, L0> lVar, kotlin.coroutines.e<? super L0> eVar) {
        ReceiveChannel receiveChannelF = f(publisher, 0, 1, null);
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

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Transforming publisher to channel is deprecated, use asFlow() instead")
    public static final /* synthetic */ ReceiveChannel c(Publisher publisher, int i10) {
        g gVar = new g(i10);
        publisher.subscribe(gVar);
        return gVar;
    }

    public static /* synthetic */ ReceiveChannel d(Publisher publisher, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return c(publisher, i10);
    }

    @InterfaceC4850b0
    @NotNull
    public static final <T> ReceiveChannel<T> e(@NotNull Publisher<T> publisher, int i10) {
        g gVar = new g(i10);
        publisher.subscribe(gVar);
        return gVar;
    }

    public static /* synthetic */ ReceiveChannel f(Publisher publisher, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return e(publisher, i10);
    }
}
