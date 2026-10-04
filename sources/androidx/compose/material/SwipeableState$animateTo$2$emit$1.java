package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {341}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
public final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f97760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f97761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f97762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeableState$animateTo$2<T> f97763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2<? super T> swipeableState$animateTo$2, kotlin.coroutines.e<? super SwipeableState$animateTo$2$emit$1> eVar) {
        super(eVar);
        this.f97763d = swipeableState$animateTo$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.compose.material.SwipeableState$animateTo$2$emit$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f97762c = r2
            int r2 = r1.f97764e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f97764e = r2
            androidx.compose.material.SwipeableState$animateTo$2<T> r2 = r1.f97763d
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$animateTo$2$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
