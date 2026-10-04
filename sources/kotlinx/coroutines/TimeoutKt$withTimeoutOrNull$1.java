package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {101}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f218799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f218802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218803e;

    public TimeoutKt$withTimeoutOrNull$1(kotlin.coroutines.e<? super TimeoutKt$withTimeoutOrNull$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218802d = obj;
        this.f218803e |= Integer.MIN_VALUE;
        return TimeoutKt.e(0L, null, this);
    }
}
