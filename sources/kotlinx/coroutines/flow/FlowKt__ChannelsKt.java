package kotlinx.coroutines.flow;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.L;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,172:1\n105#2:173\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n149#1:173\n*E\n"})
public final /* synthetic */ class FlowKt__ChannelsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n1#1,111:1\n150#2,2:112\n*E\n"})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.channels.d f219398a;

        public a(kotlinx.coroutines.channels.d dVar) {
            this.f219398a = dVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
            Object objD = FlowKt__ChannelsKt.d(fVar, this.f219398a.i(), eVar);
            return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : L0.f217464a;
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> e<T> b(@NotNull kotlinx.coroutines.channels.d<T> dVar) {
        return new a(dVar);
    }

    @NotNull
    public static final <T> e<T> c(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return new b(receiveChannel, true, null, 0, null, 28, null);
    }

    @Nullable
    public static final <T> Object d(@NotNull f<? super T> fVar, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        Object objE = e(fVar, receiveChannel, true, eVar);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : L0.f217464a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0034, B:24:0x0060, B:28:0x0075, B:30:0x007d, B:20:0x0052, B:23:0x005c), top: B:42:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008f -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.f<? super T> r6, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r7, boolean r8, kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.f219404f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219404f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f219403e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219404f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r8 = r0.f219402d
            java.lang.Object r6 = r0.f219401c
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f219400b
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f219399a
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.f) r2
            kotlin.C4885d0.n(r9)     // Catch: java.lang.Throwable -> L3a
        L37:
            r9 = r6
            r6 = r2
            goto L60
        L3a:
            r6 = move-exception
            goto L9b
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            boolean r8 = r0.f219402d
            java.lang.Object r6 = r0.f219401c
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f219400b
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f219399a
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.f) r2
            kotlin.C4885d0.n(r9)     // Catch: java.lang.Throwable -> L3a
            goto L75
        L56:
            kotlin.C4885d0.n(r9)
            kotlinx.coroutines.flow.FlowKt__EmittersKt.b(r6)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3a
        L60:
            r0.f219399a = r6     // Catch: java.lang.Throwable -> L3a
            r0.f219400b = r7     // Catch: java.lang.Throwable -> L3a
            r0.f219401c = r9     // Catch: java.lang.Throwable -> L3a
            r0.f219402d = r8     // Catch: java.lang.Throwable -> L3a
            r0.f219404f = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> L3a
            if (r2 != r1) goto L71
            goto L91
        L71:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L92
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3a
            r0.f219399a = r2     // Catch: java.lang.Throwable -> L3a
            r0.f219400b = r7     // Catch: java.lang.Throwable -> L3a
            r0.f219401c = r6     // Catch: java.lang.Throwable -> L3a
            r0.f219402d = r8     // Catch: java.lang.Throwable -> L3a
            r0.f219404f = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 != r1) goto L37
        L91:
            return r1
        L92:
            if (r8 == 0) goto L98
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r7, r6)
        L98:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L9b:
            throw r6     // Catch: java.lang.Throwable -> L9c
        L9c:
            r9 = move-exception
            if (r8 == 0) goto La2
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.a(r7, r6)
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.e(kotlinx.coroutines.flow.f, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public static final <T> ReceiveChannel<T> f(@NotNull e<? extends T> eVar, @NotNull L l10) {
        return kotlinx.coroutines.flow.internal.d.b(eVar).m(l10);
    }

    @NotNull
    public static final <T> e<T> g(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return new b(receiveChannel, false, null, 0, null, 28, null);
    }
}
