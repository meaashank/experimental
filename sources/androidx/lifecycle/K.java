package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;
import n.C5232c;
import o.C5287b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f114008k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f114009l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f114010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5287b<Q<? super T>, K<T>.d> f114011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f114014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f114015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f114017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f114018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f114019j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (K.this.f114010a) {
                obj = K.this.f114015f;
                K.this.f114015f = K.f114009l;
            }
            K.this.r(obj);
        }
    }

    public class b extends K<T>.d {
        public b(Q<? super T> q10) {
            super(q10);
        }

        @Override // androidx.lifecycle.K.d
        public boolean d() {
            return true;
        }
    }

    public class c extends K<T>.d implements InterfaceC2611y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public final B f114022e;

        public c(@NonNull B b10, Q<? super T> q10) {
            super(q10);
            this.f114022e = b10;
        }

        @Override // androidx.lifecycle.K.d
        public void b() {
            this.f114022e.getLifecycle().g(this);
        }

        @Override // androidx.lifecycle.K.d
        public boolean c(B b10) {
            return this.f114022e == b10;
        }

        @Override // androidx.lifecycle.K.d
        public boolean d() {
            return this.f114022e.getLifecycle().d().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull B b10, @NonNull Lifecycle.Event event) {
            Lifecycle.State stateD = this.f114022e.getLifecycle().d();
            if (stateD == Lifecycle.State.DESTROYED) {
                K.this.p(this.f114024a);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateD) {
                a(d());
                state = stateD;
                stateD = this.f114022e.getLifecycle().d();
            }
        }
    }

    public abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q<? super T> f114024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f114025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f114026c = -1;

        public d(Q<? super T> q10) {
            this.f114024a = q10;
        }

        public void a(boolean z10) {
            if (z10 == this.f114025b) {
                return;
            }
            this.f114025b = z10;
            K.this.c(z10 ? 1 : -1);
            if (this.f114025b) {
                K.this.e(this);
            }
        }

        public void b() {
        }

        public boolean c(B b10) {
            return false;
        }

        public abstract boolean d();
    }

    public K(T t10) {
        this.f114010a = new Object();
        this.f114011b = new C5287b<>();
        this.f114012c = 0;
        this.f114015f = f114009l;
        this.f114019j = new a();
        this.f114014e = t10;
        this.f114016g = 0;
    }

    public static void b(String str) {
        if (!C5232c.h().c()) {
            throw new IllegalStateException(android.support.v4.media.i.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    @e.I
    public void c(int i10) {
        int i11 = this.f114012c;
        this.f114012c = i10 + i11;
        if (this.f114013d) {
            return;
        }
        this.f114013d = true;
        while (true) {
            try {
                int i12 = this.f114012c;
                if (i11 == i12) {
                    this.f114013d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    m();
                } else if (z11) {
                    n();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f114013d = false;
                throw th;
            }
        }
    }

    public final void d(K<T>.d dVar) {
        if (dVar.f114025b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f114026c;
            int i11 = this.f114016g;
            if (i10 >= i11) {
                return;
            }
            dVar.f114026c = i11;
            dVar.f114024a.a((Object) this.f114014e);
        }
    }

    public void e(@Nullable K<T>.d dVar) {
        if (this.f114017h) {
            this.f114018i = true;
            return;
        }
        this.f114017h = true;
        do {
            this.f114018i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                C5287b<Q<? super T>, K<T>.d>.d dVarG = this.f114011b.g();
                while (dVarG.hasNext()) {
                    d(dVarG.next().getValue());
                    if (this.f114018i) {
                        break;
                    }
                }
            }
        } while (this.f114018i);
        this.f114017h = false;
    }

    @Nullable
    public T f() {
        T t10 = (T) this.f114014e;
        if (t10 != f114009l) {
            return t10;
        }
        return null;
    }

    public int g() {
        return this.f114016g;
    }

    public boolean h() {
        return this.f114012c > 0;
    }

    public boolean i() {
        return this.f114011b.size() > 0;
    }

    public boolean j() {
        return this.f114014e != f114009l;
    }

    @e.I
    public void k(@NonNull B b10, @NonNull Q<? super T> q10) {
        b("observe");
        if (b10.getLifecycle().d() == Lifecycle.State.DESTROYED) {
            return;
        }
        c cVar = new c(b10, q10);
        K<T>.d dVarJ = this.f114011b.j(q10, cVar);
        if (dVarJ != null && !dVarJ.c(b10)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarJ != null) {
            return;
        }
        b10.getLifecycle().c(cVar);
    }

    @e.I
    public void l(@NonNull Q<? super T> q10) {
        b("observeForever");
        b bVar = new b(q10);
        K<T>.d dVarJ = this.f114011b.j(q10, bVar);
        if (dVarJ instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarJ != null) {
            return;
        }
        bVar.a(true);
    }

    public void m() {
    }

    public void n() {
    }

    public void o(T t10) {
        boolean z10;
        synchronized (this.f114010a) {
            z10 = this.f114015f == f114009l;
            this.f114015f = t10;
        }
        if (z10) {
            C5232c.h().d(this.f114019j);
        }
    }

    @e.I
    public void p(@NonNull Q<? super T> q10) {
        b("removeObserver");
        K<T>.d dVarK = this.f114011b.k(q10);
        if (dVarK == null) {
            return;
        }
        dVarK.b();
        dVarK.a(false);
    }

    @e.I
    public void q(@NonNull B b10) {
        b("removeObservers");
        Iterator<Map.Entry<Q<? super T>, K<T>.d>> it = this.f114011b.iterator();
        while (true) {
            C5287b.e eVar = (C5287b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            Map.Entry next = eVar.next();
            if (((d) next.getValue()).c(b10)) {
                p((Q) next.getKey());
            }
        }
    }

    @e.I
    public void r(T t10) {
        b("setValue");
        this.f114016g++;
        this.f114014e = t10;
        e(null);
    }

    public K() {
        this.f114010a = new Object();
        this.f114011b = new C5287b<>();
        this.f114012c = 0;
        Object obj = f114009l;
        this.f114015f = obj;
        this.f114019j = new a();
        this.f114014e = obj;
        this.f114016g = -1;
    }
}
