package kotlinx.coroutines.sync;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements q<MutexImpl, j<?>, Object, L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MutexImpl$onLock$1 f220756a = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void e(@NotNull MutexImpl mutexImpl, @NotNull j<?> jVar, @Nullable Object obj) {
        mutexImpl.T(jVar, obj);
    }

    @Override // ed.q
    public L0 invoke(MutexImpl mutexImpl, j<?> jVar, Object obj) {
        mutexImpl.T(jVar, obj);
        return L0.f217464a;
    }
}
