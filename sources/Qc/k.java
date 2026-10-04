package qc;

import hc.G;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k<T, U, V> extends m implements G<T>, io.reactivex.internal.util.j<U, V> {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final G<? super V> f227067F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final pc.n<U> f227068G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile boolean f227069H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile boolean f227070I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Throwable f227071J;

    public k(G<? super V> g10, pc.n<U> nVar) {
        this.f227067F = g10;
        this.f227068G = nVar;
    }

    @Override // io.reactivex.internal.util.j
    public final Throwable a() {
        return this.f227071J;
    }

    @Override // io.reactivex.internal.util.j
    public final int b(int i10) {
        return this.f227102p.addAndGet(i10);
    }

    @Override // io.reactivex.internal.util.j
    public final boolean c() {
        return this.f227102p.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.j
    public final boolean cancelled() {
        return this.f227069H;
    }

    @Override // io.reactivex.internal.util.j
    public final boolean d() {
        return this.f227070I;
    }

    public final boolean f() {
        return this.f227102p.get() == 0 && this.f227102p.compareAndSet(0, 1);
    }

    public final void g(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        G<? super V> g10 = this.f227067F;
        pc.n<U> nVar = this.f227068G;
        if (this.f227102p.get() == 0 && this.f227102p.compareAndSet(0, 1)) {
            e(g10, u10);
            if (this.f227102p.addAndGet(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u10);
            if (!c()) {
                return;
            }
        }
        io.reactivex.internal.util.n.d(nVar, g10, z10, bVar, this);
    }

    public final void h(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        G<? super V> g10 = this.f227067F;
        pc.n<U> nVar = this.f227068G;
        if (this.f227102p.get() != 0 || !this.f227102p.compareAndSet(0, 1)) {
            nVar.offer(u10);
            if (!c()) {
                return;
            }
        } else if (nVar.isEmpty()) {
            e(g10, u10);
            if (this.f227102p.addAndGet(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u10);
        }
        io.reactivex.internal.util.n.d(nVar, g10, z10, bVar, this);
    }

    public void e(G<? super V> g10, U u10) {
    }
}
