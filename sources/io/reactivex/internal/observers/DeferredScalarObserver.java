package io.reactivex.internal.observers;

import hc.G;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements G<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f203003h;

    public DeferredScalarObserver(G<? super R> g10) {
        super(g10);
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
    public void dispose() {
        super.dispose();
        this.f203003h.dispose();
    }

    @Override // hc.G
    public void onComplete() {
        T t10 = this.f203002b;
        if (t10 == null) {
            d();
        } else {
            this.f203002b = null;
            e(t10);
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        this.f203002b = null;
        f(th);
    }

    @Override // hc.G
    public void onSubscribe(b bVar) {
        if (DisposableHelper.validate(this.f203003h, bVar)) {
            this.f203003h = bVar;
            this.f203001a.onSubscribe(this);
        }
    }
}
