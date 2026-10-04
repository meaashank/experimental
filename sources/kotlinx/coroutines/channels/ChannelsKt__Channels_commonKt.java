package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5101n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,104:1\n58#1,11:105\n81#1:116\n58#1,6:117\n82#1,2:123\n68#1:125\n64#1,3:126\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n81#1:105,11\n92#1:116\n92#1:117,6\n92#1:123,2\n92#1:125\n92#1:126,3\n*E\n"})
public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @InterfaceC4850b0
    public static final void a(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = C5101n0.a("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.a(cancellationExceptionA);
    }

    public static final <E, R> R b(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull ed.l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        try {
            R rInvoke = lVar.invoke(receiveChannel);
            a(receiveChannel, null);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a(receiveChannel, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0062, B:21:0x0048), top: B:39:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:25:0x005a). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, @org.jetbrains.annotations.NotNull ed.l<? super E, kotlin.L0> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) r0
            int r1 = r0.f218948e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218948e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f218947d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f218948e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f218946c
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.f218945b
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.f218944a
            ed.l r2 = (ed.l) r2
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r5 = move-exception
            goto L76
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.C4885d0.n(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L48:
            r0.f218944a = r7     // Catch: java.lang.Throwable -> L33
            r0.f218945b = r6     // Catch: java.lang.Throwable -> L33
            r0.f218946c = r5     // Catch: java.lang.Throwable -> L33
            r0.f218948e = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r4 = r2
            r2 = r7
            r7 = r4
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L33
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L48
        L6b:
            r5 = 0
            a(r6, r5)
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L72:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L76:
            throw r5     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.c(kotlinx.coroutines.channels.ReceiveChannel, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public static final <E> Object d(ReceiveChannel<? extends E> receiveChannel, ed.l<? super E, L0> lVar, kotlin.coroutines.e<? super L0> eVar) {
        try {
            ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (((Boolean) it.c(null)).booleanValue()) {
                lVar.invoke(it.next());
            }
            a(receiveChannel, null);
            return L0.f217464a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a(receiveChannel, th);
                throw th2;
            }
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.e e(ReceiveChannel receiveChannel) {
        G.n(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return receiveChannel.w();
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @InterfaceC4852c0(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object f(ReceiveChannel receiveChannel, kotlin.coroutines.e eVar) {
        G.n(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return receiveChannel.z(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0065, B:27:0x006d), top: B:43:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:25:0x0065). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends E>> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) r0
            int r1 = r0.f218954f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218954f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f218953e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f218954f
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f218952d
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.f218951c
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.f218950b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f218949a
            java.util.List r5 = (java.util.List) r5
            kotlin.C4885d0.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L65
        L37:
            r7 = move-exception
            r8 = r2
            goto L85
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.C4885d0.n(r8)
            java.util.List r8 = kotlin.collections.H.j()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L81
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L51:
            r0.f218949a = r5     // Catch: java.lang.Throwable -> L7f
            r0.f218950b = r4     // Catch: java.lang.Throwable -> L7f
            r0.f218951c = r8     // Catch: java.lang.Throwable -> L7f
            r0.f218952d = r7     // Catch: java.lang.Throwable -> L7f
            r0.f218954f = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L62
            return r1
        L62:
            r6 = r2
            r2 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L76
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L37
            r4.add(r8)     // Catch: java.lang.Throwable -> L37
            r8 = r2
            goto L51
        L76:
            r7 = 0
            a(r2, r7)
            java.util.List r7 = kotlin.collections.H.b(r5)
            return r7
        L7f:
            r7 = move-exception
            goto L85
        L81:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L85:
            throw r7     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            a(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.g(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.e):java.lang.Object");
    }
}
