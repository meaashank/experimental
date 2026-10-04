package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import zc.InterfaceC5888e;
import zc.InterfaceC5891h;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends InterfaceC5891h> f210237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f210238c;

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements zc.V<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210239a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.o<? super T, ? extends InterfaceC5891h> f210241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f210242d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f210245g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicThrowable f210240b = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.a f210243e = new io.reactivex.rxjava3.disposables.a();

        public final class InnerObserver extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC5888e, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // zc.InterfaceC5888e
            public void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f210243e.b(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // zc.InterfaceC5888e
            public void onError(Throwable e10) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f210243e.b(this);
                flatMapCompletableMainObserver.onError(e10);
            }

            @Override // zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(this, d10);
            }
        }

        public FlatMapCompletableMainObserver(zc.V<? super T> observer, Bc.o<? super T, ? extends InterfaceC5891h> mapper, boolean delayErrors) {
            this.f210239a = observer;
            this.f210241c = mapper;
            this.f210242d = delayErrors;
            lazySet(1);
        }

        public void a(FlatMapCompletableMainObserver<T>.InnerObserver inner) {
            this.f210243e.b(inner);
            onComplete();
        }

        public void b(FlatMapCompletableMainObserver<T>.InnerObserver inner, Throwable e10) {
            this.f210243e.b(inner);
            onError(e10);
        }

        @Override // Dc.q
        public void clear() {
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210245g = true;
            this.f210244f.dispose();
            this.f210243e.dispose();
            this.f210240b.j();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210244f.isDisposed();
        }

        @Override // Dc.q
        public boolean isEmpty() {
            return true;
        }

        @Override // zc.V
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f210240b.o(this.f210239a);
            }
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            if (this.f210240b.i(e10)) {
                if (this.f210242d) {
                    if (decrementAndGet() == 0) {
                        this.f210240b.o(this.f210239a);
                    }
                } else {
                    this.f210245g = true;
                    this.f210244f.dispose();
                    this.f210243e.dispose();
                    this.f210240b.o(this.f210239a);
                }
            }
        }

        @Override // zc.V
        public void onNext(T value) {
            try {
                InterfaceC5891h interfaceC5891hApply = this.f210241c.apply(value);
                Objects.requireNonNull(interfaceC5891hApply, "The mapper returned a null CompletableSource");
                InterfaceC5891h interfaceC5891h = interfaceC5891hApply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f210245g || !this.f210243e.a(innerObserver)) {
                    return;
                }
                interfaceC5891h.d(innerObserver);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f210244f.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210244f, d10)) {
                this.f210244f = d10;
                this.f210239a.onSubscribe(this);
            }
        }

        @Override // Dc.q
        @yc.f
        public T poll() {
            return null;
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            return mode & 2;
        }
    }

    public ObservableFlatMapCompletable(zc.T<T> source, Bc.o<? super T, ? extends InterfaceC5891h> mapper, boolean delayErrors) {
        super(source);
        this.f210237b = mapper;
        this.f210238c = delayErrors;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new FlatMapCompletableMainObserver(observer, this.f210237b, this.f210238c));
    }
}
