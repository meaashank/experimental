package androidx.compose.material;

import androidx.compose.material.AnchoredDraggableState$draggableState$1;
import com.prism.gaia.helper.utils.l;
import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,897:1\n1#2:898\n*E\n"})
@Vc.d(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {l.b.f165184r}, m = "invokeSuspend", n = {}, s = {})
public final class AnchoredDraggableState$draggableState$1$drag$2<T> extends SuspendLambda implements ed.q<InterfaceC1850d, J<T>, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState$draggableState$1 f95223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed.p<androidx.compose.foundation.gestures.j, kotlin.coroutines.e<? super kotlin.L0>, Object> f95224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, ed.p<? super androidx.compose.foundation.gestures.j, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends Object> pVar, kotlin.coroutines.e<? super AnchoredDraggableState$draggableState$1$drag$2> eVar) {
        super(3, eVar);
        this.f95223b = anchoredDraggableState$draggableState$1;
        this.f95224c = pVar;
    }

    @Override // ed.q
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull InterfaceC1850d interfaceC1850d, @NotNull J<T> j10, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.f95223b, this.f95224c, eVar).invokeSuspend(kotlin.L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f95222a;
        if (i10 == 0) {
            C4885d0.n(obj);
            AnchoredDraggableState$draggableState$1.a aVar = this.f95223b.f95219a;
            ed.p<androidx.compose.foundation.gestures.j, kotlin.coroutines.e<? super kotlin.L0>, Object> pVar = this.f95224c;
            this.f95222a = 1;
            if (pVar.invoke(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return kotlin.L0.f217464a;
    }
}
