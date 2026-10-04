package io.reactivex.observers;

import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class l<T> implements G<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f207238g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G<? super T> f207239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.reactivex.disposables.b f207241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f207242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.reactivex.internal.util.a<Object> f207243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f207244f;

    public l(@lc.e G<? super T> g10) {
        this(g10, false);
    }

    public void a() {
        io.reactivex.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f207243e;
                    if (aVar == null) {
                        this.f207242d = false;
                        return;
                    }
                    this.f207243e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!aVar.a(this.f207239a));
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f207241c.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f207241c.isDisposed();
    }

    @Override // hc.G
    public void onComplete() {
        if (this.f207244f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f207244f) {
                    return;
                }
                if (!this.f207242d) {
                    this.f207244f = true;
                    this.f207242d = true;
                    this.f207239a.onComplete();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f207243e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f207243e = aVar;
                    }
                    aVar.c(NotificationLite.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // hc.G
    public void onError(@lc.e Throwable th) {
        if (this.f207244f) {
            C5666a.Y(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f207244f) {
                    if (this.f207242d) {
                        this.f207244f = true;
                        io.reactivex.internal.util.a<Object> aVar = this.f207243e;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f207243e = aVar;
                        }
                        Object objError = NotificationLite.error(th);
                        if (this.f207240b) {
                            aVar.c(objError);
                        } else {
                            aVar.f(objError);
                        }
                        return;
                    }
                    this.f207244f = true;
                    this.f207242d = true;
                    z10 = false;
                }
                if (z10) {
                    C5666a.Y(th);
                } else {
                    this.f207239a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hc.G
    public void onNext(@lc.e T t10) {
        if (this.f207244f) {
            return;
        }
        if (t10 == null) {
            this.f207241c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f207244f) {
                    return;
                }
                if (!this.f207242d) {
                    this.f207242d = true;
                    this.f207239a.onNext(t10);
                    a();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f207243e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f207243e = aVar;
                    }
                    aVar.c(NotificationLite.next(t10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // hc.G
    public void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f207241c, bVar)) {
            this.f207241c = bVar;
            this.f207239a.onSubscribe(this);
        }
    }

    public l(@lc.e G<? super T> g10, boolean z10) {
        this.f207239a = g10;
        this.f207240b = z10;
    }
}
