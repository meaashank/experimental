package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class m<T> implements V<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f211984g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V<? super T> f211985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f211987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f211988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.util.a<Object> f211989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f211990f;

    public m(@yc.e V<? super T> downstream) {
        this(downstream, false);
    }

    public void a() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f211989e;
                    if (aVar == null) {
                        this.f211988d = false;
                        return;
                    }
                    this.f211989e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!aVar.b(this.f211985a));
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        this.f211990f = true;
        this.f211987c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f211987c.isDisposed();
    }

    @Override // zc.V
    public void onComplete() {
        if (this.f211990f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f211990f) {
                    return;
                }
                if (!this.f211988d) {
                    this.f211990f = true;
                    this.f211988d = true;
                    this.f211985a.onComplete();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f211989e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f211989e = aVar;
                    }
                    aVar.c(NotificationLite.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.V
    public void onError(@yc.e Throwable t10) {
        if (this.f211990f) {
            Ic.a.Y(t10);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f211990f) {
                    if (this.f211988d) {
                        this.f211990f = true;
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f211989e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                            this.f211989e = aVar;
                        }
                        Object objError = NotificationLite.error(t10);
                        if (this.f211986b) {
                            aVar.c(objError);
                        } else {
                            aVar.f(objError);
                        }
                        return;
                    }
                    this.f211990f = true;
                    this.f211988d = true;
                    z10 = false;
                }
                if (z10) {
                    Ic.a.Y(t10);
                } else {
                    this.f211985a.onError(t10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.V
    public void onNext(@yc.e T t10) {
        if (this.f211990f) {
            return;
        }
        if (t10 == null) {
            this.f211987c.dispose();
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f211990f) {
                    return;
                }
                if (!this.f211988d) {
                    this.f211988d = true;
                    this.f211985a.onNext(t10);
                    a();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f211989e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f211989e = aVar;
                    }
                    aVar.c(NotificationLite.next(t10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.V
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        if (DisposableHelper.validate(this.f211987c, d10)) {
            this.f211987c = d10;
            this.f211985a.onSubscribe(this);
        }
    }

    public m(@yc.e V<? super T> actual, boolean delayError) {
        this.f211985a = actual;
        this.f211986b = delayError;
    }
}
