package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CallbackFlowBuilder<T> extends c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.p<kotlinx.coroutines.channels.q<? super T>, kotlin.coroutines.e<? super L0>, Object> f219310e;

    public /* synthetic */ CallbackFlowBuilder(ed.p pVar, kotlin.coroutines.i iVar, int i10, BufferOverflow bufferOverflow, int i11, C4969v c4969v) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f217673a : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.q<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.f219314d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219314d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f219312b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219314d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f219311a
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.q) r5
            kotlin.C4885d0.n(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C4885d0.n(r6)
            r0.f219311a = r5
            r0.f219314d = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.c.n(r4, r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            boolean r5 = r5.C()
            if (r5 == 0) goto L4a
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.e(kotlinx.coroutines.channels.q, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f219310e, iVar, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(@NotNull ed.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(pVar, iVar, i10, bufferOverflow);
        this.f219310e = pVar;
    }
}
