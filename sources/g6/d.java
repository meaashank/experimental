package g6;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f202257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f202258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicInteger f202259c = new AtomicInteger();

    public interface a {
        void onConnected();

        void onDisconnected();
    }

    public void c() {
        k(this.f202259c.incrementAndGet());
    }

    public void d() {
        final int iIncrementAndGet = this.f202259c.incrementAndGet();
        C4455a.b().a().execute(new Runnable() { // from class: g6.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f202253a.k(iIncrementAndGet);
            }
        });
    }

    public abstract boolean e();

    public void f() {
        l(this.f202259c.incrementAndGet());
    }

    public void g() {
        final int iIncrementAndGet = this.f202259c.incrementAndGet();
        C4455a.b().a().execute(new Runnable() { // from class: g6.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f202255a.l(iIncrementAndGet);
            }
        });
    }

    public abstract boolean h();

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void k(int i10) {
        if (this.f202257a) {
            return;
        }
        if (this.f202259c.get() > i10) {
            return;
        }
        e();
        this.f202257a = true;
        a aVar = this.f202258b;
        if (aVar != null) {
            aVar.onConnected();
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final synchronized void l(int i10) {
        if (this.f202257a) {
            if (this.f202259c.get() > i10) {
                return;
            }
            h();
            this.f202257a = false;
            a aVar = this.f202258b;
            if (aVar != null) {
                aVar.onDisconnected();
            }
        }
    }

    public void m(a aVar) {
        this.f202258b = aVar;
    }
}
