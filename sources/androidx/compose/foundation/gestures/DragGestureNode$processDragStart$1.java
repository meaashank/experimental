package androidx.compose.foundation.gestures;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {548, 551}, m = "processDragStart", n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "interaction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
public final class DragGestureNode$processDragStart$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f89538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f89539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f89540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f89541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(DragGestureNode dragGestureNode, kotlin.coroutines.e<? super DragGestureNode$processDragStart$1> eVar) {
        super(eVar);
        this.f89541e = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89540d = obj;
        this.f89542f |= Integer.MIN_VALUE;
        return this.f89541e.G3(null, this);
    }
}
