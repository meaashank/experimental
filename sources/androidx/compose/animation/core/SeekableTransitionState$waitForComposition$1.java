package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {566, 2186}, m = "waitForComposition", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class SeekableTransitionState$waitForComposition$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f87857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f87858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f87859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState<S> f87860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$waitForComposition$1(SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.e<? super SeekableTransitionState$waitForComposition$1> eVar) {
        super(eVar);
        this.f87860d = seekableTransitionState;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 for r1v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.f87859c = r2
            int r2 = r1.f87861e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f87861e = r2
            androidx.compose.animation.core.SeekableTransitionState<S> r2 = r1.f87860d
            java.lang.Object r2 = r2.Z(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
