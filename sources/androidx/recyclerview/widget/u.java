package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.I;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class u<T> implements H<T> {

    public class a implements H.b<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116898f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116899g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116900h = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f116901a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f116902b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f116903c = new RunnableC0327a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ H.b f116904d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.u$a$a, reason: collision with other inner class name */
        public class RunnableC0327a implements Runnable {
            public RunnableC0327a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVarA = a.this.f116901a.a();
                while (dVarA != null) {
                    int i10 = dVarA.f116922b;
                    if (i10 == 1) {
                        a.this.f116904d.a(dVarA.f116923c, dVarA.f116924d);
                    } else if (i10 == 2) {
                        a.this.f116904d.c(dVarA.f116923c, (I.a) dVarA.f116928h);
                    } else if (i10 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + dVarA.f116922b);
                    } else {
                        a.this.f116904d.b(dVarA.f116923c, dVarA.f116924d);
                    }
                    dVarA = a.this.f116901a.a();
                }
            }
        }

        public a(H.b bVar) {
            this.f116904d = bVar;
        }

        @Override // androidx.recyclerview.widget.H.b
        public void a(int i10, int i11) {
            d(d.a(1, i10, i11));
        }

        @Override // androidx.recyclerview.widget.H.b
        public void b(int i10, int i11) {
            d(d.a(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.H.b
        public void c(int i10, I.a<T> aVar) {
            d(d.c(2, i10, aVar));
        }

        public final void d(d dVar) {
            this.f116901a.c(dVar);
            this.f116902b.post(this.f116903c);
        }
    }

    public class b implements H.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116907g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116908h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f116909i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f116910j = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f116911a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f116912b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AtomicBoolean f116913c = new AtomicBoolean(false);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f116914d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ H.a f116915e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d dVarA = b.this.f116911a.a();
                    if (dVarA == null) {
                        b.this.f116913c.set(false);
                        return;
                    }
                    int i10 = dVarA.f116922b;
                    if (i10 == 1) {
                        b.this.f116911a.b(1);
                        b.this.f116915e.c(dVarA.f116923c);
                    } else if (i10 == 2) {
                        b.this.f116911a.b(2);
                        b.this.f116911a.b(3);
                        b.this.f116915e.a(dVarA.f116923c, dVarA.f116924d, dVarA.f116925e, dVarA.f116926f, dVarA.f116927g);
                    } else if (i10 == 3) {
                        b.this.f116915e.b(dVarA.f116923c, dVarA.f116924d);
                    } else if (i10 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + dVarA.f116922b);
                    } else {
                        b.this.f116915e.d((I.a) dVarA.f116928h);
                    }
                }
            }
        }

        public b(H.a aVar) {
            this.f116915e = aVar;
        }

        @Override // androidx.recyclerview.widget.H.a
        public void a(int i10, int i11, int i12, int i13, int i14) {
            g(d.b(2, i10, i11, i12, i13, i14, null));
        }

        @Override // androidx.recyclerview.widget.H.a
        public void b(int i10, int i11) {
            f(d.a(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.H.a
        public void c(int i10) {
            g(d.c(1, i10, null));
        }

        @Override // androidx.recyclerview.widget.H.a
        public void d(I.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        public final void e() {
            if (this.f116913c.compareAndSet(false, true)) {
                this.f116912b.execute(this.f116914d);
            }
        }

        public final void f(d dVar) {
            this.f116911a.c(dVar);
            e();
        }

        public final void g(d dVar) {
            this.f116911a.d(dVar);
            e();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f116918a;

        public synchronized d a() {
            d dVar = this.f116918a;
            if (dVar == null) {
                return null;
            }
            this.f116918a = dVar.f116921a;
            return dVar;
        }

        public synchronized void b(int i10) {
            d dVar;
            while (true) {
                try {
                    dVar = this.f116918a;
                    if (dVar == null || dVar.f116922b != i10) {
                        break;
                    }
                    this.f116918a = dVar.f116921a;
                    dVar.d();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (dVar != null) {
                d dVar2 = dVar.f116921a;
                while (dVar2 != null) {
                    d dVar3 = dVar2.f116921a;
                    if (dVar2.f116922b == i10) {
                        dVar.f116921a = dVar3;
                        dVar2.d();
                    } else {
                        dVar = dVar2;
                    }
                    dVar2 = dVar3;
                }
            }
        }

        public synchronized void c(d dVar) {
            d dVar2 = this.f116918a;
            if (dVar2 == null) {
                this.f116918a = dVar;
                return;
            }
            while (true) {
                d dVar3 = dVar2.f116921a;
                if (dVar3 == null) {
                    dVar2.f116921a = dVar;
                    return;
                }
                dVar2 = dVar3;
            }
        }

        public synchronized void d(d dVar) {
            dVar.f116921a = this.f116918a;
            this.f116918a = dVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static d f116919i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Object f116920j = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f116921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f116926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f116927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f116928h;

        public static d a(int i10, int i11, int i12) {
            return b(i10, i11, i12, 0, 0, 0, null);
        }

        public static d b(int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            d dVar;
            synchronized (f116920j) {
                try {
                    dVar = f116919i;
                    if (dVar == null) {
                        dVar = new d();
                    } else {
                        f116919i = dVar.f116921a;
                        dVar.f116921a = null;
                    }
                    dVar.f116922b = i10;
                    dVar.f116923c = i11;
                    dVar.f116924d = i12;
                    dVar.f116925e = i13;
                    dVar.f116926f = i14;
                    dVar.f116927g = i15;
                    dVar.f116928h = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }

        public static d c(int i10, int i11, Object obj) {
            return b(i10, i11, 0, 0, 0, 0, obj);
        }

        public void d() {
            this.f116921a = null;
            this.f116927g = 0;
            this.f116926f = 0;
            this.f116925e = 0;
            this.f116924d = 0;
            this.f116923c = 0;
            this.f116922b = 0;
            this.f116928h = null;
            synchronized (f116920j) {
                try {
                    d dVar = f116919i;
                    if (dVar != null) {
                        this.f116921a = dVar;
                    }
                    f116919i = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.H
    public H.b<T> a(H.b<T> bVar) {
        return new a(bVar);
    }

    @Override // androidx.recyclerview.widget.H
    public H.a<T> b(H.a<T> aVar) {
        return new b(aVar);
    }
}
