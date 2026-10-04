package io.reactivex.rxjava3.internal.operators.observable;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservablePublish<T> extends Gc.a<T> implements Dc.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.T<T> f210445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<PublishConnection<T>> f210446b = new AtomicReference<>();

    public static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 7463222674719692880L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210447a;

        public InnerDisposable(zc.V<? super T> downstream, PublishConnection<T> parent) {
            this.f210447a = downstream;
            lazySet(parent);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            PublishConnection<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InnerDisposable[] f210448e = new InnerDisposable[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final InnerDisposable[] f210449f = new InnerDisposable[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<PublishConnection<T>> f210451b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f210453d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f210450a = new AtomicBoolean();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210452c = new AtomicReference<>();

        public PublishConnection(AtomicReference<PublishConnection<T>> current) {
            this.f210451b = current;
            lazySet(f210448e);
        }

        public boolean a(InnerDisposable<T> inner) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = get();
                if (innerDisposableArr == f210449f) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = inner;
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
            return true;
        }

        public void b(InnerDisposable<T> inner) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerDisposableArr[i10] == inner) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                innerDisposableArr2 = f210448e;
                if (length != 1) {
                    innerDisposableArr2 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr2, i10, (length - i10) - 1);
                }
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            getAndSet(f210449f);
            C1598m0.a(this.f210451b, this, null);
            DisposableHelper.dispose(this.f210452c);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return get() == f210449f;
        }

        @Override // zc.V
        public void onComplete() {
            this.f210452c.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable<T> innerDisposable : getAndSet(f210449f)) {
                innerDisposable.f210447a.onComplete();
            }
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            io.reactivex.rxjava3.disposables.d dVar = this.f210452c.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (dVar == disposableHelper) {
                Ic.a.Y(e10);
                return;
            }
            this.f210453d = e10;
            this.f210452c.lazySet(disposableHelper);
            for (InnerDisposable<T> innerDisposable : getAndSet(f210449f)) {
                innerDisposable.f210447a.onError(e10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            for (InnerDisposable<T> innerDisposable : get()) {
                innerDisposable.f210447a.onNext(t10);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this.f210452c, d10);
        }
    }

    public ObservablePublish(zc.T<T> source) {
        this.f210445a = source;
    }

    @Override // Gc.a
    public void E8(Bc.g<? super io.reactivex.rxjava3.disposables.d> connection) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.f210446b.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.f210446b);
            if (C1598m0.a(this.f210446b, publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z10 = false;
        if (!publishConnection.f210450a.get() && publishConnection.f210450a.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            connection.accept(publishConnection);
            if (z10) {
                this.f210445a.a(publishConnection);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            throw ExceptionHelper.i(th);
        }
    }

    @Override // Gc.a
    public void L8() {
        PublishConnection<T> publishConnection = this.f210446b.get();
        if (publishConnection == null || !publishConnection.isDisposed()) {
            return;
        }
        C1598m0.a(this.f210446b, publishConnection, null);
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.f210446b.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.f210446b);
            if (C1598m0.a(this.f210446b, publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerDisposable<T> innerDisposable = new InnerDisposable<>(observer, publishConnection);
        observer.onSubscribe(innerDisposable);
        if (publishConnection.a(innerDisposable)) {
            if (innerDisposable.isDisposed()) {
                publishConnection.b(innerDisposable);
            }
        } else {
            Throwable th = publishConnection.f210453d;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }

    @Override // Dc.i
    public zc.T<T> source() {
        return this.f210445a;
    }
}
