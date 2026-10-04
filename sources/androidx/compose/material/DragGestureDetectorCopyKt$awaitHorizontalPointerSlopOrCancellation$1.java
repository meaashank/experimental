package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {124, Opcodes.IF_ICMPGE}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
public final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f96022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f96023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f96024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f96025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f96026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f96027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f96028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f96029h;

    public DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(kotlin.coroutines.e<? super DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f96028g = obj;
        this.f96029h |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.a(null, 0L, 0, null, this);
    }
}
