package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
public final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f218697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f218698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218699c;

    public AwaitKt$joinAll$3(kotlin.coroutines.e<? super AwaitKt$joinAll$3> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218698b = obj;
        this.f218699c |= Integer.MIN_VALUE;
        return AwaitKt.c(null, this);
    }
}
