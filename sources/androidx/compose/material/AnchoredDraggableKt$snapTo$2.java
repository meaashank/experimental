package androidx.compose.material;

import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AnchoredDraggableKt$snapTo$2<T> extends SuspendLambda implements ed.r<InterfaceC1850d, J<T>, T, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f95166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f95167d;

    public AnchoredDraggableKt$snapTo$2(kotlin.coroutines.e<? super AnchoredDraggableKt$snapTo$2> eVar) {
        super(4, eVar);
    }

    @Override // ed.r
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object x(@NotNull InterfaceC1850d interfaceC1850d, @NotNull J<T> j10, T t10, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(4, eVar);
        anchoredDraggableKt$snapTo$2.f95165b = interfaceC1850d;
        anchoredDraggableKt$snapTo$2.f95166c = j10;
        anchoredDraggableKt$snapTo$2.f95167d = t10;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(kotlin.L0.f217464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f95164a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        InterfaceC1850d interfaceC1850d = (InterfaceC1850d) this.f95165b;
        float fE = ((J) this.f95166c).e(this.f95167d);
        if (!Float.isNaN(fE)) {
            C1848c.a(interfaceC1850d, fE, 0.0f, 2, null);
        }
        return kotlin.L0.f217464a;
    }
}
