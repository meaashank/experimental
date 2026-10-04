package Ec;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T, R> implements V<T>, Dc.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V<? super R> f33807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f33808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dc.l<T> f33809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33811e;

    public a(V<? super R> downstream) {
        this.f33807a = downstream;
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable t10) {
        io.reactivex.rxjava3.exceptions.a.b(t10);
        this.f33808b.dispose();
        onError(t10);
    }

    @Override // Dc.q
    public void clear() {
        this.f33809c.clear();
    }

    public final int d(int mode) {
        Dc.l<T> lVar = this.f33809c;
        if (lVar == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.f33811e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        this.f33808b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f33808b.isDisposed();
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return this.f33809c.isEmpty();
    }

    @Override // Dc.q
    public final boolean offer(R e10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // zc.V
    public void onComplete() {
        if (this.f33810d) {
            return;
        }
        this.f33810d = true;
        this.f33807a.onComplete();
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        if (this.f33810d) {
            Ic.a.Y(t10);
        } else {
            this.f33810d = true;
            this.f33807a.onError(t10);
        }
    }

    @Override // zc.V
    public final void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        if (DisposableHelper.validate(this.f33808b, d10)) {
            this.f33808b = d10;
            if (d10 instanceof Dc.l) {
                this.f33809c = (Dc.l) d10;
            }
            this.f33807a.onSubscribe(this);
        }
    }

    @Override // Dc.q
    public final boolean offer(R v12, R v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void a() {
    }
}
