package androidx.compose.foundation.relocation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {116}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f92548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f92549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f92552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequesterImpl f92553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, kotlin.coroutines.e<? super BringIntoViewRequesterImpl$bringIntoView$1> eVar) {
        super(eVar);
        this.f92553f = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f92552e = obj;
        this.f92554g |= Integer.MIN_VALUE;
        return this.f92553f.a(null, this);
    }
}
