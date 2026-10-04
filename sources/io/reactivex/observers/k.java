package io.reactivex.observers;

import hc.G;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class k<T> implements G<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G<? super T> f207235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.disposables.b f207236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207237c;

    public k(@lc.e G<? super T> g10) {
        this.f207235a = g10;
    }

    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f207235a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f207235a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            C5666a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    public void b() {
        this.f207237c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f207235a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f207235a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            C5666a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f207236b.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f207236b.isDisposed();
    }

    @Override // hc.G
    public void onComplete() {
        if (this.f207237c) {
            return;
        }
        this.f207237c = true;
        if (this.f207236b == null) {
            a();
            return;
        }
        try {
            this.f207235a.onComplete();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // hc.G
    public void onError(@lc.e Throwable th) {
        if (this.f207237c) {
            C5666a.Y(th);
            return;
        }
        this.f207237c = true;
        if (this.f207236b != null) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f207235a.onError(th);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                C5666a.Y(new CompositeException(th, th2));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f207235a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f207235a.onError(new CompositeException(th, nullPointerException));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                C5666a.Y(new CompositeException(th, nullPointerException, th3));
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            C5666a.Y(new CompositeException(th, nullPointerException, th4));
        }
    }

    @Override // hc.G
    public void onNext(@lc.e T t10) {
        if (this.f207237c) {
            return;
        }
        if (this.f207236b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f207236b.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                onError(new CompositeException(nullPointerException, th));
                return;
            }
        }
        try {
            this.f207235a.onNext(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            try {
                this.f207236b.dispose();
                onError(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                onError(new CompositeException(th2, th3));
            }
        }
    }

    @Override // hc.G
    public void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f207236b, bVar)) {
            this.f207236b = bVar;
            try {
                this.f207235a.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f207237c = true;
                try {
                    bVar.dispose();
                    C5666a.Y(th);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    C5666a.Y(new CompositeException(th, th2));
                }
            }
        }
    }
}
