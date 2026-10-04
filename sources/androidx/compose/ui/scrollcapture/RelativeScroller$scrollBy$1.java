package androidx.compose.ui.scrollcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {306}, m = "scrollBy", n = {"this"}, s = {"L$0"})
public final class RelativeScroller$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f104002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RelativeScroller f104004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScroller$scrollBy$1(RelativeScroller relativeScroller, kotlin.coroutines.e<? super RelativeScroller$scrollBy$1> eVar) {
        super(eVar);
        this.f104004c = relativeScroller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104003b = obj;
        this.f104005d |= Integer.MIN_VALUE;
        return this.f104004c.e(0.0f, this);
    }
}
