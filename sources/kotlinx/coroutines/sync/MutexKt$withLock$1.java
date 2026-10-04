package kotlinx.coroutines.sync;

import Vc.d;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexKt$withLock$1\n*L\n1#1,305:1\n*E\n"})
@d(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {120}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
public final class MutexKt$withLock$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f220771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f220772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220773e;

    public MutexKt$withLock$1(e<? super MutexKt$withLock$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220772d = obj;
        this.f220773e |= Integer.MIN_VALUE;
        return MutexKt.e(null, null, null, this);
    }
}
