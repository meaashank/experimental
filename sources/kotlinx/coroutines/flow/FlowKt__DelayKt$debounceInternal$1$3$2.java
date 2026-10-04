package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n522#2,6:408\n538#2,4:414\n542#2:420\n1#3:418\n14#4:419\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,6\n233#1:414,4\n233#1:420\n236#1:419\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements ed.p<kotlinx.coroutines.channels.j<? extends Object>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f219446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Object> f219448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f<T> f219449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, f<? super T> fVar, kotlin.coroutines.e<? super FlowKt__DelayKt$debounceInternal$1$3$2> eVar) {
        super(2, eVar);
        this.f219448d = objectRef;
        this.f219449e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f219448d, this.f219449e, eVar);
        flowKt__DelayKt$debounceInternal$1$3$2.f219447c = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Nullable
    public final Object e(@NotNull Object obj, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new kotlinx.coroutines.channels.j(obj), eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // ed.p
    public /* synthetic */ Object invoke(kotlinx.coroutines.channels.j<? extends Object> jVar, kotlin.coroutines.e<? super L0> eVar) {
        return e(jVar.f219196a, eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 for r6v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.f219446b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r6.f219445a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.C4885d0.n(r7)
            goto L4b
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.C4885d0.n(r7)
            java.lang.Object r7 = r6.f219447c
            kotlinx.coroutines.channels.j r7 = (kotlinx.coroutines.channels.j) r7
            java.lang.Object r7 = r7.f219196a
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.f219448d
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.j.c
            if (r3 != 0) goto L2a
            r1.f217904a = r7
        L2a:
            kotlinx.coroutines.flow.f<T> r4 = r6.f219449e
            if (r3 == 0) goto L52
            java.lang.Throwable r3 = kotlinx.coroutines.channels.j.f(r7)
            if (r3 != 0) goto L51
            T r3 = r1.f217904a
            if (r3 == 0) goto L4c
            kotlinx.coroutines.internal.Q r5 = kotlinx.coroutines.flow.internal.l.f220222a
            if (r3 != r5) goto L3d
            r3 = 0
        L3d:
            r6.f219447c = r7
            r6.f219445a = r1
            r6.f219446b = r2
            java.lang.Object r7 = r4.emit(r3, r6)
            if (r7 != r0) goto L4a
            return r0
        L4a:
            r0 = r1
        L4b:
            r1 = r0
        L4c:
            kotlinx.coroutines.internal.Q r7 = kotlinx.coroutines.flow.internal.l.f220224c
            r1.f217904a = r7
            goto L52
        L51:
            throw r3
        L52:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
