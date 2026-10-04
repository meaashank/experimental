package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import nc.InterfaceC5265a;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableDoFinally<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5265a f205510b;

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements hc.G<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5265a f205512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public pc.j<T> f205514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f205515e;

        public DoFinallyObserver(hc.G<? super T> g10, InterfaceC5265a interfaceC5265a) {
            this.f205511a = g10;
            this.f205512b = interfaceC5265a;
        }

        @Override // pc.o
        public void clear() {
            this.f205514d.clear();
        }

        public void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f205512b.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    C5666a.Y(th);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205513c.dispose();
            d();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205513c.isDisposed();
        }

        @Override // pc.o
        public boolean isEmpty() {
            return this.f205514d.isEmpty();
        }

        @Override // hc.G
        public void onComplete() {
            this.f205511a.onComplete();
            d();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205511a.onError(th);
            d();
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f205511a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205513c, bVar)) {
                this.f205513c = bVar;
                if (bVar instanceof pc.j) {
                    this.f205514d = (pc.j) bVar;
                }
                this.f205511a.onSubscribe(this);
            }
        }

        @Override // pc.o
        @lc.f
        public T poll() throws Exception {
            T tPoll = this.f205514d.poll();
            if (tPoll == null && this.f205515e) {
                d();
            }
            return tPoll;
        }

        @Override // pc.k
        public int requestFusion(int i10) {
            pc.j<T> jVar = this.f205514d;
            if (jVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = jVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f205515e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public ObservableDoFinally(hc.E<T> e10, InterfaceC5265a interfaceC5265a) {
        super(e10);
        this.f205510b = interfaceC5265a;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new DoFinallyObserver(g10, this.f205510b));
    }
}
