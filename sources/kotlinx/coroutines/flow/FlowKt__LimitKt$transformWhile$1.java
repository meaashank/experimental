package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,138:1\n123#2,15:139\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n116#1:139,15\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {Opcodes.FCMPL}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
public final class FlowKt__LimitKt$transformWhile$1<R> extends SuspendLambda implements ed.p<f<? super R>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e<T> f219635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.q<f<? super R>, T, kotlin.coroutines.e<? super Boolean>, Object> f219636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(e<? extends T> eVar, ed.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.e<? super FlowKt__LimitKt$transformWhile$1> eVar2) {
        super(2, eVar2);
        this.f219635c = eVar;
        this.f219636d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f219635c, this.f219636d, eVar);
        flowKt__LimitKt$transformWhile$1.f219634b = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull f<? super R> fVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((FlowKt__LimitKt$transformWhile$1) create(fVar, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1<R> for r5v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.f219633a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f219634b
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
            kotlin.C4885d0.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L11
            goto L3c
        L11:
            r6 = move-exception
            goto L38
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.C4885d0.n(r6)
            java.lang.Object r6 = r5.f219634b
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.f) r6
            kotlinx.coroutines.flow.e<T> r1 = r5.f219635c
            ed.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f219636d
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
            r4.<init>(r3, r6)
            r5.f219634b = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            r5.f219633a = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            java.lang.Object r6 = r1.collect(r4, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            if (r6 != r0) goto L3c
            return r0
        L36:
            r6 = move-exception
            r0 = r4
        L38:
            java.lang.Object r1 = r6.f220073a
            if (r1 != r0) goto L3f
        L3c:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L3f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
