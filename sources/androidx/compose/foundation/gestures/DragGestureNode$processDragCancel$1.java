package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {566}, m = "processDragCancel", n = {"this"}, s = {"L$0"})
public final class DragGestureNode$processDragCancel$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f89535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragCancel$1(DragGestureNode dragGestureNode, kotlin.coroutines.e<? super DragGestureNode$processDragCancel$1> eVar) {
        super(eVar);
        this.f89535c = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89534b = obj;
        this.f89536d |= Integer.MIN_VALUE;
        return this.f89535c.F3(this);
    }
}
