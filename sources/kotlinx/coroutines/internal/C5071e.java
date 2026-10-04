package kotlinx.coroutines.internal;

import ed.InterfaceC4376a;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5071e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final Method f220337a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f220337a = method;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @NotNull
    public static final <E> Set<E> c(int i10) {
        return Collections.newSetFromMap(new IdentityHashMap(i10));
    }

    public static final boolean d(@NotNull Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f220337a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final <T> T e(@NotNull ReentrantLock reentrantLock, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        reentrantLock.lock();
        try {
            return interfaceC4376a.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
