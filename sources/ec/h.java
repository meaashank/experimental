package Ec;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class h<T> implements V<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V<? super T> f33823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super io.reactivex.rxjava3.disposables.d> f33824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.a f33825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f33826d;

    public h(V<? super T> actual, Bc.g<? super io.reactivex.rxjava3.disposables.d> onSubscribe, Bc.a onDispose) {
        this.f33823a = actual;
        this.f33824b = onSubscribe;
        this.f33825c = onDispose;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        io.reactivex.rxjava3.disposables.d dVar = this.f33826d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (dVar != disposableHelper) {
            this.f33826d = disposableHelper;
            try {
                this.f33825c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(th);
            }
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f33826d.isDisposed();
    }

    @Override // zc.V
    public void onComplete() {
        io.reactivex.rxjava3.disposables.d dVar = this.f33826d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (dVar != disposableHelper) {
            this.f33826d = disposableHelper;
            this.f33823a.onComplete();
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        io.reactivex.rxjava3.disposables.d dVar = this.f33826d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (dVar == disposableHelper) {
            Ic.a.Y(t10);
        } else {
            this.f33826d = disposableHelper;
            this.f33823a.onError(t10);
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        this.f33823a.onNext(t10);
    }

    @Override // zc.V
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        try {
            this.f33824b.accept(d10);
            if (DisposableHelper.validate(this.f33826d, d10)) {
                this.f33826d = d10;
                this.f33823a.onSubscribe(this);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            d10.dispose();
            this.f33826d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.f33823a);
        }
    }
}
