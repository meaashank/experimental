package io.reactivex.internal.operators.observable;

import hc.H;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableDebounceTimed<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f205495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f205496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.H f205497d;

    public static final class DebounceEmitter<T> extends AtomicReference<io.reactivex.disposables.b> implements Runnable, io.reactivex.disposables.b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f205498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f205500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f205501d = new AtomicBoolean();

        public DebounceEmitter(T t10, long j10, a<T> aVar) {
            this.f205498a = t10;
            this.f205499b = j10;
            this.f205500c = aVar;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f205501d.compareAndSet(false, true)) {
                this.f205500c.a(this.f205499b, this.f205498a, this);
            }
        }
    }

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f205504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H.c f205505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f205506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.disposables.b f205507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile long f205508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f205509h;

        public a(hc.G<? super T> g10, long j10, TimeUnit timeUnit, H.c cVar) {
            this.f205502a = g10;
            this.f205503b = j10;
            this.f205504c = timeUnit;
            this.f205505d = cVar;
        }

        public void a(long j10, T t10, DebounceEmitter<T> debounceEmitter) {
            if (j10 == this.f205508g) {
                this.f205502a.onNext(t10);
                debounceEmitter.getClass();
                DisposableHelper.dispose(debounceEmitter);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205506e.dispose();
            this.f205505d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205505d.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f205509h) {
                return;
            }
            this.f205509h = true;
            io.reactivex.disposables.b bVar = this.f205507f;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f205502a.onComplete();
            this.f205505d.dispose();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f205509h) {
                C5666a.Y(th);
                return;
            }
            io.reactivex.disposables.b bVar = this.f205507f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f205509h = true;
            this.f205502a.onError(th);
            this.f205505d.dispose();
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f205509h) {
                return;
            }
            long j10 = this.f205508g + 1;
            this.f205508g = j10;
            io.reactivex.disposables.b bVar = this.f205507f;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t10, j10, this);
            this.f205507f = debounceEmitter;
            DisposableHelper.replace(debounceEmitter, this.f205505d.c(debounceEmitter, this.f205503b, this.f205504c));
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205506e, bVar)) {
                this.f205506e = bVar;
                this.f205502a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(hc.E<T> e10, long j10, TimeUnit timeUnit, hc.H h10) {
        super(e10);
        this.f205495b = j10;
        this.f205496c = timeUnit;
        this.f205497d = h10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(new io.reactivex.observers.l(g10, false), this.f205495b, this.f205496c, this.f205497d.c()));
    }
}
