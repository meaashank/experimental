package kotlinx.coroutines.sync;

import ed.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements q<MutexImpl, Object, Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MutexImpl$onLock$2 f220757a = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Nullable
    public final Object e(@NotNull MutexImpl mutexImpl, @Nullable Object obj, @Nullable Object obj2) {
        return mutexImpl.S(obj, obj2);
    }

    @Override // ed.q
    public Object invoke(MutexImpl mutexImpl, Object obj, Object obj2) {
        return mutexImpl.S(obj, obj2);
    }
}
