package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableDoFinally<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.a f210205b;

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements zc.V<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.a f210207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Dc.l<T> f210209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f210210e;

        public DoFinallyObserver(zc.V<? super T> actual, Bc.a onFinally) {
            this.f210206a = actual;
            this.f210207b = onFinally;
        }

        @Override // Dc.q
        public void clear() {
            this.f210209d.clear();
        }

        public void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f210207b.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    Ic.a.Y(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210208c.dispose();
            d();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210208c.isDisposed();
        }

        @Override // Dc.q
        public boolean isEmpty() {
            return this.f210209d.isEmpty();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210206a.onComplete();
            d();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210206a.onError(t10);
            d();
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f210206a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210208c, d10)) {
                this.f210208c = d10;
                if (d10 instanceof Dc.l) {
                    this.f210209d = (Dc.l) d10;
                }
                this.f210206a.onSubscribe(this);
            }
        }

        @Override // Dc.q
        @yc.f
        public T poll() throws Throwable {
            T tPoll = this.f210209d.poll();
            if (tPoll == null && this.f210210e) {
                d();
            }
            return tPoll;
        }

        @Override // Dc.m
        public int requestFusion(int mode) {
            Dc.l<T> lVar = this.f210209d;
            if (lVar == null || (mode & 4) != 0) {
                return 0;
            }
            int iRequestFusion = lVar.requestFusion(mode);
            if (iRequestFusion != 0) {
                this.f210210e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public ObservableDoFinally(zc.T<T> source, Bc.a onFinally) {
        super(source);
        this.f210205b = onFinally;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new DoFinallyObserver(observer, this.f210205b));
    }
}
