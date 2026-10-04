package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", i = {}, l = {804}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$scroll$2 extends SuspendLambda implements ed.p<w, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f89815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<s, kotlin.coroutines.e<? super L0>, Object> f89816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollingLogic$scroll$2(ScrollingLogic scrollingLogic, ed.p<? super s, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super ScrollingLogic$scroll$2> eVar) {
        super(2, eVar);
        this.f89815c = scrollingLogic;
        this.f89816d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(this.f89815c, this.f89816d, eVar);
        scrollingLogic$scroll$2.f89814b = obj;
        return scrollingLogic$scroll$2;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull w wVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((ScrollingLogic$scroll$2) create(wVar, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f89813a;
        if (i10 == 0) {
            C4885d0.n(obj);
            w wVar = (w) this.f89814b;
            ScrollingLogic scrollingLogic = this.f89815c;
            scrollingLogic.f89790h = wVar;
            ed.p<s, kotlin.coroutines.e<? super L0>, Object> pVar = this.f89816d;
            ScrollingLogic.a aVar = scrollingLogic.f89791i;
            this.f89813a = 1;
            if (pVar.invoke(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }
}
