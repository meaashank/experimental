package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class d0 extends AbstractC5078l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f220334a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ReentrantReadWriteLock f220335b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final WeakHashMap<Class<? extends Throwable>, ed.l<Throwable, Throwable>> f220336c = new WeakHashMap<>();

    @Override // kotlinx.coroutines.internal.AbstractC5078l
    @NotNull
    public ed.l<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f220335b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            ed.l<Throwable, Throwable> lVar = f220336c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, ed.l<Throwable, Throwable>> weakHashMap = f220336c;
                ed.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                ed.l<Throwable, Throwable> lVarB = ExceptionsConstructorKt.b(cls);
                weakHashMap.put(cls, lVarB);
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return lVarB;
            } finally {
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
