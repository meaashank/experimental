package androidx.compose.foundation.gestures;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0}, l = {558}, m = "processDragStop", n = {"this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1"})
public final class DragGestureNode$processDragStop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f89544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f89545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f89546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(DragGestureNode dragGestureNode, kotlin.coroutines.e<? super DragGestureNode$processDragStop$1> eVar) {
        super(eVar);
        this.f89546d = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89545c = obj;
        this.f89547e |= Integer.MIN_VALUE;
        return this.f89546d.H3(null, this);
    }
}
