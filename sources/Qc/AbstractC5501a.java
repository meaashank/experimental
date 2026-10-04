package qc;

import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;
import uc.C5666a;

/* JADX INFO: renamed from: qc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5501a<T, R> implements G<T>, pc.j<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G<? super R> f227044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.disposables.b f227045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pc.j<T> f227046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f227047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f227048e;

    public AbstractC5501a(G<? super R> g10) {
        this.f227044a = g10;
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        io.reactivex.exceptions.a.b(th);
        this.f227045b.dispose();
        onError(th);
    }

    public void clear() {
        this.f227046c.clear();
    }

    public final int d(int i10) {
        pc.j<T> jVar = this.f227046c;
        if (jVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = jVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f227048e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f227045b.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f227045b.isDisposed();
    }

    @Override // pc.o
    public boolean isEmpty() {
        return this.f227046c.isEmpty();
    }

    @Override // pc.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // hc.G
    public void onComplete() {
        if (this.f227047d) {
            return;
        }
        this.f227047d = true;
        this.f227044a.onComplete();
    }

    @Override // hc.G
    public void onError(Throwable th) {
        if (this.f227047d) {
            C5666a.Y(th);
        } else {
            this.f227047d = true;
            this.f227044a.onError(th);
        }
    }

    @Override // hc.G
    public final void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f227045b, bVar)) {
            this.f227045b = bVar;
            if (bVar instanceof pc.j) {
                this.f227046c = (pc.j) bVar;
            }
            this.f227044a.onSubscribe(this);
        }
    }

    @Override // pc.o
    public final boolean offer(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void a() {
    }
}
