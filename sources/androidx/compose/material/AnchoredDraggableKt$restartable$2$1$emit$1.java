package androidx.compose.material;

import androidx.compose.material.AnchoredDraggableKt$restartable$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {e6.v.f200280a}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
public final class AnchoredDraggableKt$restartable$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f95158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f95159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f95160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f95161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1<T> f95162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f95163f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt$restartable$2.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.e<? super AnchoredDraggableKt$restartable$2$1$emit$1> eVar) {
        super(eVar);
        this.f95162e = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f95161d = r2
            int r2 = r1.f95163f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f95163f = r2
            androidx.compose.material.AnchoredDraggableKt$restartable$2$1<T> r2 = r1.f95162e
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
