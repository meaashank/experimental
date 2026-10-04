package androidx.compose.foundation.gestures;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AnchoredDraggableKt$snapTo$2<T> extends SuspendLambda implements ed.r<InterfaceC1654b, m<T>, T, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f89174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f89175d;

    public AnchoredDraggableKt$snapTo$2(kotlin.coroutines.e<? super AnchoredDraggableKt$snapTo$2> eVar) {
        super(4, eVar);
    }

    @Override // ed.r
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object x(@NotNull InterfaceC1654b interfaceC1654b, @NotNull m<T> mVar, T t10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(4, eVar);
        anchoredDraggableKt$snapTo$2.f89173b = interfaceC1654b;
        anchoredDraggableKt$snapTo$2.f89174c = mVar;
        anchoredDraggableKt$snapTo$2.f89175d = t10;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f89172a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        InterfaceC1654b interfaceC1654b = (InterfaceC1654b) this.f89173b;
        float fE = ((m) this.f89174c).e(this.f89175d);
        if (!Float.isNaN(fE)) {
            C1653a.a(interfaceC1654b, fE, 0.0f, 2, null);
        }
        return L0.f217464a;
    }
}
