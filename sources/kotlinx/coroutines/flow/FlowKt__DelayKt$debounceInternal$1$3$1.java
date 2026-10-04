package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements ed.l<kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f<T> f219443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Object> f219444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$1(f<? super T> fVar, Ref.ObjectRef<Object> objectRef, kotlin.coroutines.e<? super FlowKt__DelayKt$debounceInternal$1$3$1> eVar) {
        super(1, eVar);
        this.f219443b = fVar;
        this.f219444c = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@NotNull kotlin.coroutines.e<?> eVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f219443b, this.f219444c, eVar);
    }

    @Override // ed.l
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 for r5v1 'this'  kotlin.coroutines.e
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
            int r1 = r5.f219442a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto Le
            kotlin.C4885d0.n(r6)
            goto L2d
        Le:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L16:
            kotlin.C4885d0.n(r6)
            kotlinx.coroutines.flow.f<T> r6 = r5.f219443b
            kotlinx.coroutines.internal.Q r1 = kotlinx.coroutines.flow.internal.l.f220222a
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r5.f219444c
            T r4 = r4.f217904a
            if (r4 != r1) goto L24
            r4 = r2
        L24:
            r5.f219442a = r3
            java.lang.Object r6 = r6.emit(r4, r5)
            if (r6 != r0) goto L2d
            return r0
        L2d:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.f219444c
            r6.f217904a = r2
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
