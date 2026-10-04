package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {203}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
public final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f102117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.e<? super NestedScrollDispatcher$dispatchPreFling$1> eVar) {
        super(eVar);
        this.f102117b = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f102116a = obj;
        this.f102118c |= Integer.MIN_VALUE;
        return this.f102117b.c(0L, this);
    }
}
