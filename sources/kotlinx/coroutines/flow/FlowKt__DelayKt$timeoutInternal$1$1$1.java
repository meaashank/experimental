package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n522#2,6:408\n556#2,4:414\n560#2:419\n1#3:418\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,6\n396#1:414,4\n396#1:419\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
public final class FlowKt__DelayKt$timeoutInternal$1$1$1<T> extends SuspendLambda implements ed.p<kotlinx.coroutines.channels.j<? extends T>, kotlin.coroutines.e<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<T> f219489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(f<? super T> fVar, kotlin.coroutines.e<? super FlowKt__DelayKt$timeoutInternal$1$1$1> eVar) {
        super(2, eVar);
        this.f219489c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.f219489c, eVar);
        flowKt__DelayKt$timeoutInternal$1$1$1.f219488b = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Nullable
    public final Object e(@NotNull Object obj, @Nullable kotlin.coroutines.e<? super Boolean> eVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new kotlinx.coroutines.channels.j(obj), eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // ed.p
    public /* synthetic */ Object invoke(Object obj, kotlin.coroutines.e<? super Boolean> eVar) {
        return e(((kotlinx.coroutines.channels.j) obj).f219196a, eVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1<T> for r4v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f219487a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            java.lang.Object r0 = r4.f219488b
            kotlin.C4885d0.n(r5)
            goto L32
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.C4885d0.n(r5)
            java.lang.Object r5 = r4.f219488b
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.j) r5
            java.lang.Object r5 = r5.f219196a
            kotlinx.coroutines.flow.f<T> r1 = r4.f219489c
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.j.c
            if (r3 != 0) goto L33
            r4.f219488b = r5
            r4.f219487a = r2
            java.lang.Object r1 = r1.emit(r5, r4)
            if (r1 != r0) goto L31
            return r0
        L31:
            r0 = r5
        L32:
            r5 = r0
        L33:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.j.a
            if (r0 == 0) goto L42
            java.lang.Throwable r5 = kotlinx.coroutines.channels.j.f(r5)
            if (r5 != 0) goto L41
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L41:
            throw r5
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
