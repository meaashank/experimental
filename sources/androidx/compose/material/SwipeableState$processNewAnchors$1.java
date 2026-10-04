package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {165, 189, 192}, m = "processNewAnchors$material_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f97767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f97768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f97769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f97770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<T> f97771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, kotlin.coroutines.e<? super SwipeableState$processNewAnchors$1> eVar) {
        super(eVar);
        this.f97771e = swipeableState;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.compose.material.SwipeableState$processNewAnchors$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f97770d = r2
            int r2 = r1.f97772f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f97772f = r2
            androidx.compose.material.SwipeableState<T> r2 = r1.f97771e
            r0 = 0
            java.lang.Object r2 = r2.H(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$processNewAnchors$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
