package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
public final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f218713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218714b;

    public DelayKt$awaitCancellation$1(kotlin.coroutines.e<? super DelayKt$awaitCancellation$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218713a = obj;
        this.f218714b |= Integer.MIN_VALUE;
        return DelayKt.a(this);
    }
}
