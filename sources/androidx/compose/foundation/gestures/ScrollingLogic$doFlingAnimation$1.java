package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {com.prism.gaia.helper.utils.apk.b.f165088h}, m = "doFlingAnimation-QWom1Mo", n = {R9.c.f67796d}, s = {"L$0"})
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f89796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, kotlin.coroutines.e<? super ScrollingLogic$doFlingAnimation$1> eVar) {
        super(eVar);
        this.f89796c = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89795b = obj;
        this.f89797d |= Integer.MIN_VALUE;
        return this.f89796c.n(0L, this);
    }
}
