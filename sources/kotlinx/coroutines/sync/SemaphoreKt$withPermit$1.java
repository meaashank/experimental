package kotlinx.coroutines.sync;

import Vc.d;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt$withPermit$1\n*L\n1#1,392:1\n*E\n"})
@d(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
public final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f220792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f220793d;

    public SemaphoreKt$withPermit$1(e<? super SemaphoreKt$withPermit$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220792c = obj;
        this.f220793d |= Integer.MIN_VALUE;
        return SemaphoreKt.k(null, null, this);
    }
}
