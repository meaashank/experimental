package Pc;

import Xc.f;
import dd.j;
import ed.InterfaceC4376a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
@j(name = "LocksKt")
public final class a {
    @C
    @f
    public static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, InterfaceC4376a<? extends T> action) {
        G.p(reentrantReadWriteLock, "<this>");
        G.p(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return action.invoke();
        } finally {
            lock.unlock();
        }
    }

    @C
    @f
    public static final <T> T b(Lock lock, InterfaceC4376a<? extends T> action) {
        G.p(lock, "<this>");
        G.p(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            lock.unlock();
        }
    }

    @C
    @f
    public static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, InterfaceC4376a<? extends T> action) {
        G.p(reentrantReadWriteLock, "<this>");
        G.p(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        }
    }
}
