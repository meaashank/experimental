package io.reactivex.internal.operators.observable;

import hc.InterfaceC4524d;
import hc.InterfaceC4527g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends InterfaceC4527g> f205543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f205544c;

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements hc.G<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205545a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nc.o<? super T, ? extends InterfaceC4527g> f205547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f205548d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.disposables.b f205550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f205551g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicThrowable f205546b = new AtomicThrowable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final io.reactivex.disposables.a f205549e = new io.reactivex.disposables.a();

        public final class InnerObserver extends AtomicReference<io.reactivex.disposables.b> implements InterfaceC4524d, io.reactivex.disposables.b {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerObserver() {
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // hc.InterfaceC4524d
            public void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f205549e.b(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // hc.InterfaceC4524d
            public void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f205549e.b(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // hc.InterfaceC4524d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public FlatMapCompletableMainObserver(hc.G<? super T> g10, nc.o<? super T, ? extends InterfaceC4527g> oVar, boolean z10) {
            this.f205545a = g10;
            this.f205547c = oVar;
            this.f205548d = z10;
            lazySet(1);
        }

        public void a(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.f205549e.b(innerObserver);
            onComplete();
        }

        public void b(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th) {
            this.f205549e.b(innerObserver);
            onError(th);
        }

        @Override // pc.o
        public void clear() {
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205551g = true;
            this.f205550f.dispose();
            this.f205549e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205550f.isDisposed();
        }

        @Override // pc.o
        public boolean isEmpty() {
            return true;
        }

        @Override // hc.G
        public void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.f205546b;
                atomicThrowable.getClass();
                Throwable thC = ExceptionHelper.c(atomicThrowable);
                if (thC != null) {
                    this.f205545a.onError(thC);
                } else {
                    this.f205545a.onComplete();
                }
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f205546b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
                return;
            }
            if (this.f205548d) {
                if (decrementAndGet() == 0) {
                    AtomicThrowable atomicThrowable2 = this.f205546b;
                    atomicThrowable2.getClass();
                    this.f205545a.onError(ExceptionHelper.c(atomicThrowable2));
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                AtomicThrowable atomicThrowable3 = this.f205546b;
                atomicThrowable3.getClass();
                this.f205545a.onError(ExceptionHelper.c(atomicThrowable3));
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            try {
                InterfaceC4527g interfaceC4527gApply = this.f205547c.apply(t10);
                io.reactivex.internal.functions.a.g(interfaceC4527gApply, "The mapper returned a null CompletableSource");
                InterfaceC4527g interfaceC4527g = interfaceC4527gApply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f205551g || !this.f205549e.c(innerObserver)) {
                    return;
                }
                interfaceC4527g.d(innerObserver);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f205550f.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205550f, bVar)) {
                this.f205550f = bVar;
                this.f205545a.onSubscribe(this);
            }
        }

        @Override // pc.o
        @lc.f
        public T poll() throws Exception {
            return null;
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public ObservableFlatMapCompletable(hc.E<T> e10, nc.o<? super T, ? extends InterfaceC4527g> oVar, boolean z10) {
        super(e10);
        this.f205543b = oVar;
        this.f205544c = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new FlatMapCompletableMainObserver(g10, this.f205543b, this.f205544c));
    }
}
