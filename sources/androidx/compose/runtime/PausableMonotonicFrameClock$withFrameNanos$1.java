package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f99179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f99180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f99181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PausableMonotonicFrameClock f99182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f99183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, kotlin.coroutines.e<? super PausableMonotonicFrameClock$withFrameNanos$1> eVar) {
        super(eVar);
        this.f99182d = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f99181c = obj;
        this.f99183e |= Integer.MIN_VALUE;
        return this.f99182d.B1(null, this);
    }
}
