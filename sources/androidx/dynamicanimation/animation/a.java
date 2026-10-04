package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.U0;
import e.T;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f113162g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f113163h = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f113167d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0<b, Long> f113164a = new U0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f113165b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0293a f113166c = new C0293a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f113168e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113169f = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    public class C0293a {
        public C0293a() {
        }

        public void a() {
            a.this.f113168e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f113168e);
            if (a.this.f113165b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    public interface b {
        boolean a(long j10);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0293a f113171a;

        public c(C0293a c0293a) {
            this.f113171a = c0293a;
        }

        public abstract void a();
    }

    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f113172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f113173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f113174d;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        public class RunnableC0294a implements Runnable {
            public RunnableC0294a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f113174d = SystemClock.uptimeMillis();
                d.this.f113171a.a();
            }
        }

        public d(C0293a c0293a) {
            super(c0293a);
            this.f113174d = -1L;
            this.f113172b = new RunnableC0294a();
            this.f113173c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        public void a() {
            this.f113173c.postDelayed(this.f113172b, Math.max(10 - (SystemClock.uptimeMillis() - this.f113174d), 0L));
        }
    }

    @T(16)
    public static class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f113176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f113177c;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0295a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0295a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                e.this.f113171a.a();
            }
        }

        public e(C0293a c0293a) {
            super(c0293a);
            this.f113176b = Choreographer.getInstance();
            this.f113177c = new ChoreographerFrameCallbackC0295a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        public void a() {
            this.f113176b.postFrameCallback(this.f113177c);
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f113163h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f113168e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f113163h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j10) {
        if (this.f113165b.size() == 0) {
            f().a();
        }
        if (!this.f113165b.contains(bVar)) {
            this.f113165b.add(bVar);
        }
        if (j10 > 0) {
            this.f113164a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f113169f) {
            for (int size = this.f113165b.size() - 1; size >= 0; size--) {
                if (this.f113165b.get(size) == null) {
                    this.f113165b.remove(size);
                }
            }
            this.f113169f = false;
        }
    }

    public void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f113165b.size(); i10++) {
            b bVar = this.f113165b.get(i10);
            if (bVar != null && g(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    public c f() {
        if (this.f113167d == null) {
            this.f113167d = new e(this.f113166c);
        }
        return this.f113167d;
    }

    public final boolean g(b bVar, long j10) {
        Long l10 = this.f113164a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f113164a.remove(bVar);
        return true;
    }

    public void h(b bVar) {
        this.f113164a.remove(bVar);
        int iIndexOf = this.f113165b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f113165b.set(iIndexOf, null);
            this.f113169f = true;
        }
    }

    public void i(c cVar) {
        this.f113167d = cVar;
    }
}
