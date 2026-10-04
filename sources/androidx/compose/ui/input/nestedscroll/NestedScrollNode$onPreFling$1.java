package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {97, 98}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
public final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f102131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f102132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f102133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NestedScrollNode f102134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, kotlin.coroutines.e<? super NestedScrollNode$onPreFling$1> eVar) {
        super(eVar);
        this.f102134d = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f102133c = obj;
        this.f102135e |= Integer.MIN_VALUE;
        return this.f102134d.m1(0L, this);
    }
}
