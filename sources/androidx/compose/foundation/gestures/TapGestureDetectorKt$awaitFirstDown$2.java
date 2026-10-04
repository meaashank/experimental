package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {279}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
public final class TapGestureDetectorKt$awaitFirstDown$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f89820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f89822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89823e;

    public TapGestureDetectorKt$awaitFirstDown$2(kotlin.coroutines.e<? super TapGestureDetectorKt$awaitFirstDown$2> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89822d = obj;
        this.f89823e |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.d(null, false, null, this);
    }
}
