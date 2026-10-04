package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
public final class AwaitKt$joinAll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f218692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f218695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218696e;

    public AwaitKt$joinAll$1(kotlin.coroutines.e<? super AwaitKt$joinAll$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218695d = obj;
        this.f218696e |= Integer.MIN_VALUE;
        return AwaitKt.d(null, this);
    }
}
