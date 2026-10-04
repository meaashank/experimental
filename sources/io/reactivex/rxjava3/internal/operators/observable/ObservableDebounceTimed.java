package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableDebounceTimed<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f210190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f210191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.W f210192d;

    public static final class DebounceEmitter<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements Runnable, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f210193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f210194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f210195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f210196d = new AtomicBoolean();

        public DebounceEmitter(T value, long idx, a<T> parent) {
            this.f210193a = value;
            this.f210194b = idx;
            this.f210195c = parent;
        }

        public void a(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.replace(this, d10);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f210196d.compareAndSet(false, true)) {
                this.f210195c.a(this.f210194b, this.f210193a, this);
            }
        }
    }

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f210198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f210199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final W.c f210200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile long f210203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f210204h;

        public a(zc.V<? super T> actual, long timeout, TimeUnit unit, W.c worker) {
            this.f210197a = actual;
            this.f210198b = timeout;
            this.f210199c = unit;
            this.f210200d = worker;
        }

        public void a(long idx, T t10, DebounceEmitter<T> emitter) {
            if (idx == this.f210203g) {
                this.f210197a.onNext(t10);
                emitter.getClass();
                DisposableHelper.dispose(emitter);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210201e.dispose();
            this.f210200d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210200d.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f210204h) {
                return;
            }
            this.f210204h = true;
            io.reactivex.rxjava3.disposables.d dVar = this.f210202f;
            if (dVar != null) {
                dVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) dVar;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f210197a.onComplete();
            this.f210200d.dispose();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f210204h) {
                Ic.a.Y(t10);
                return;
            }
            io.reactivex.rxjava3.disposables.d dVar = this.f210202f;
            if (dVar != null) {
                dVar.dispose();
            }
            this.f210204h = true;
            this.f210197a.onError(t10);
            this.f210200d.dispose();
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f210204h) {
                return;
            }
            long j10 = this.f210203g + 1;
            this.f210203g = j10;
            io.reactivex.rxjava3.disposables.d dVar = this.f210202f;
            if (dVar != null) {
                dVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t10, j10, this);
            this.f210202f = debounceEmitter;
            DisposableHelper.replace(debounceEmitter, this.f210200d.c(debounceEmitter, this.f210198b, this.f210199c));
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210201e, d10)) {
                this.f210201e = d10;
                this.f210197a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(zc.T<T> source, long timeout, TimeUnit unit, zc.W scheduler) {
        super(source);
        this.f210190b = timeout;
        this.f210191c = unit;
        this.f210192d = scheduler;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(new io.reactivex.rxjava3.observers.m(t10, false), this.f210190b, this.f210191c, this.f210192d.c()));
    }
}
