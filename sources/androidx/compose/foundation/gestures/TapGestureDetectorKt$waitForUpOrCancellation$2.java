package androidx.compose.foundation.gestures;

import com.android.launcher3.LauncherAnimUtils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {305, LauncherAnimUtils.ALL_APPS_TRANSITION_MS}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f89906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f89907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89908d;

    public TapGestureDetectorKt$waitForUpOrCancellation$2(kotlin.coroutines.e<? super TapGestureDetectorKt$waitForUpOrCancellation$2> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89907c = obj;
        this.f89908d |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.n(null, null, this);
    }
}
