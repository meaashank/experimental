package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {195}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
public final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89830c;

    public TapGestureDetectorKt$consumeUntilUp$1(kotlin.coroutines.e<? super TapGestureDetectorKt$consumeUntilUp$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89829b = obj;
        this.f89830c |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.i(null, this);
    }
}
