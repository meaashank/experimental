package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {104, 105}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
public final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f102125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f102126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f102127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f102128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NestedScrollNode f102129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f102130f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, kotlin.coroutines.e<? super NestedScrollNode$onPostFling$1> eVar) {
        super(eVar);
        this.f102129e = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f102128d = obj;
        this.f102130f |= Integer.MIN_VALUE;
        return this.f102129e.s0(0L, 0L, this);
    }
}
