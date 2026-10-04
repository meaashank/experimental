package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0}, l = {865}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
public final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f89734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollableNestedScrollConnection f89736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, kotlin.coroutines.e<? super ScrollableNestedScrollConnection$onPostFling$1> eVar) {
        super(eVar);
        this.f89736c = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89735b = obj;
        this.f89737d |= Integer.MIN_VALUE;
        return this.f89736c.s0(0L, 0L, this);
    }
}
