package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {Opcodes.LCMP}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlowOperator$collectWithContextUndispatched$2<T> extends SuspendLambda implements p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChannelFlowOperator<S, T> f220102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator<S, T> channelFlowOperator, kotlin.coroutines.e<? super ChannelFlowOperator$collectWithContextUndispatched$2> eVar) {
        super(2, eVar);
        this.f220102c = channelFlowOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f220102c, eVar);
        channelFlowOperator$collectWithContextUndispatched$2.f220101b = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(fVar, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2<T> for r3v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r3.f220100a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.C4885d0.n(r4)
            goto L27
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            kotlin.C4885d0.n(r4)
            java.lang.Object r4 = r3.f220101b
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.f) r4
            kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r3.f220102c
            r3.f220100a = r2
            java.lang.Object r4 = r1.r(r4, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
