package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {539}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
public final class AnchoredDraggableState$anchoredDrag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f95193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState<T> f95195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$1(AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.e<? super AnchoredDraggableState$anchoredDrag$1> eVar) {
        super(eVar);
        this.f95195c = anchoredDraggableState;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f95194b = r2
            int r2 = r1.f95196d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f95196d = r2
            androidx.compose.material.AnchoredDraggableState<T> r2 = r1.f95195c
            r0 = 0
            java.lang.Object r2 = r2.i(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState$anchoredDrag$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
