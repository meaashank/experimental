package androidx.compose.foundation.lazy.layout;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {35}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
public final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f91529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f91530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f91531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AwaitFirstLayoutModifier f91532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, kotlin.coroutines.e<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> eVar) {
        super(eVar);
        this.f91532d = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f91531c = obj;
        this.f91533e |= Integer.MIN_VALUE;
        return this.f91532d.a(this);
    }
}
