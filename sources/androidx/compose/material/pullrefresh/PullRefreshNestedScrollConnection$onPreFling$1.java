package androidx.compose.material.pullrefresh;

import Vc.d;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@d(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {107}, m = "onPreFling-QWom1Mo", n = {}, s = {})
public final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f98707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f98708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PullRefreshNestedScrollConnection f98709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, e<? super PullRefreshNestedScrollConnection$onPreFling$1> eVar) {
        super(eVar);
        this.f98709c = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98708b = obj;
        this.f98710d |= Integer.MIN_VALUE;
        return this.f98709c.m1(0L, this);
    }
}
