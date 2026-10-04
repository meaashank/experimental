package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class l<T> implements V<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V<? super T> f211981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f211982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f211983c;

    public l(@yc.e V<? super T> downstream) {
        this.f211981a = downstream;
    }

    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f211981a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f211981a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            Ic.a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    public void b() {
        this.f211983c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f211981a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f211981a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            Ic.a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        this.f211982b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f211982b.isDisposed();
    }

    @Override // zc.V
    public void onComplete() {
        if (this.f211983c) {
            return;
        }
        this.f211983c = true;
        if (this.f211982b == null) {
            a();
            return;
        }
        try {
            this.f211981a.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // zc.V
    public void onError(@yc.e Throwable t10) {
        if (this.f211983c) {
            Ic.a.Y(t10);
            return;
        }
        this.f211983c = true;
        if (this.f211982b != null) {
            if (t10 == null) {
                t10 = ExceptionHelper.b("onError called with a null Throwable.");
            }
            try {
                this.f211981a.onError(t10);
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(new CompositeException(t10, th));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f211981a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f211981a.onError(new CompositeException(t10, nullPointerException));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                Ic.a.Y(new CompositeException(t10, nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.b(th3);
            Ic.a.Y(new CompositeException(t10, nullPointerException, th3));
        }
    }

    @Override // zc.V
    public void onNext(@yc.e T t10) {
        if (this.f211983c) {
            return;
        }
        if (this.f211982b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerExceptionB = ExceptionHelper.b("onNext called with a null value.");
            try {
                this.f211982b.dispose();
                onError(nullPointerExceptionB);
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                onError(new CompositeException(nullPointerExceptionB, th));
                return;
            }
        }
        try {
            this.f211981a.onNext(t10);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            try {
                this.f211982b.dispose();
                onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                onError(new CompositeException(th2, th3));
            }
        }
    }

    @Override // zc.V
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        if (DisposableHelper.validate(this.f211982b, d10)) {
            this.f211982b = d10;
            try {
                this.f211981a.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211983c = true;
                try {
                    d10.dispose();
                    Ic.a.Y(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    Ic.a.Y(new CompositeException(th, th2));
                }
            }
        }
    }
}
