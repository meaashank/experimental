package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {737}, m = "restartable", n = {}, s = {})
public final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f95145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95146b;

    public AnchoredDraggableKt$restartable$1(kotlin.coroutines.e<? super AnchoredDraggableKt$restartable$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f95145a = obj;
        this.f95146b |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.j(null, null, this);
    }
}
