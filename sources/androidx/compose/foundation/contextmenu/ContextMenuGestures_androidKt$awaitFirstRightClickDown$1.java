package androidx.compose.foundation.contextmenu;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", i = {0}, l = {66}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
public final class ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f88981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f88982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88983c;

    public ContextMenuGestures_androidKt$awaitFirstRightClickDown$1(kotlin.coroutines.e<? super ContextMenuGestures_androidKt$awaitFirstRightClickDown$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88982b = obj;
        this.f88983c |= Integer.MIN_VALUE;
        return ContextMenuGestures_androidKt.b(null, this);
    }
}
