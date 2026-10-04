package Q0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RestrictTo;
import e.InterfaceC4326A;
import e.f0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f65790i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f65791j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC4326A("mLock")
    public HandlerThread f65793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("mLock")
    public Handler f65794c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f65797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f65798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65799h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f65792a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler.Callback f65796e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4326A("mLock")
    public int f65795d = 0;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                n.this.c();
                return true;
            }
            if (i10 != 1) {
                return true;
            }
            n.this.d((Runnable) message.obj);
            return true;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f65801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Handler f65802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f65803c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f65805a;

            public a(Object obj) {
                this.f65805a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f65803c.a(this.f65805a);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.f65801a = callable;
            this.f65802b = handler;
            this.f65803c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f65801a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f65802b.post(new a(objCall));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f65807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f65808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f65809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f65810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Condition f65811e;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f65807a = atomicReference;
            this.f65808b = callable;
            this.f65809c = reentrantLock;
            this.f65810d = atomicBoolean;
            this.f65811e = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f65807a.set(this.f65808b.call());
            } catch (Exception unused) {
            }
            this.f65809c.lock();
            try {
                this.f65810d.set(false);
                this.f65811e.signal();
            } finally {
                this.f65809c.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t10);
    }

    public n(String str, int i10, int i11) {
        this.f65799h = str;
        this.f65798g = i10;
        this.f65797f = i11;
    }

    @f0
    public int a() {
        int i10;
        synchronized (this.f65792a) {
            i10 = this.f65795d;
        }
        return i10;
    }

    @f0
    public boolean b() {
        boolean z10;
        synchronized (this.f65792a) {
            z10 = this.f65793b != null;
        }
        return z10;
    }

    public void c() {
        synchronized (this.f65792a) {
            try {
                if (this.f65794c.hasMessages(1)) {
                    return;
                }
                this.f65793b.quit();
                this.f65793b = null;
                this.f65794c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f65792a) {
            this.f65794c.removeMessages(0);
            Handler handler = this.f65794c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f65797f);
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.f65792a) {
            try {
                if (this.f65793b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f65799h, this.f65798g);
                    this.f65793b = handlerThread;
                    handlerThread.start();
                    this.f65794c = new Handler(this.f65793b.getLooper(), this.f65796e);
                    this.f65795d++;
                }
                this.f65794c.removeMessages(0);
                Handler handler = this.f65794c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, Q0.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i10) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t10 = (T) atomicReference.get();
                reentrantLock.unlock();
                return t10;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t11 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t11;
                }
            } while (nanos > 0);
            throw new InterruptedException(Jb.d.f58184l);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
