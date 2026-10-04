package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements V<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f207592h;

    public DeferredScalarObserver(V<? super R> downstream) {
        super(downstream);
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.d
    public void dispose() {
        super.dispose();
        this.f207592h.dispose();
    }

    @Override // zc.V
    public void onComplete() {
        T t10 = this.f207591b;
        if (t10 == null) {
            d();
        } else {
            this.f207591b = null;
            e(t10);
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        this.f207591b = null;
        f(t10);
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (DisposableHelper.validate(this.f207592h, d10)) {
            this.f207592h = d10;
            this.f207590a.onSubscribe(this);
        }
    }
}
