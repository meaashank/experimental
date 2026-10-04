package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSubscribeOn<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.H f205951b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f205953b = new AtomicReference<>();

        public SubscribeOnObserver(hc.G<? super T> g10) {
            this.f205952a = g10;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f205953b);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.G
        public void onComplete() {
            this.f205952a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205952a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f205952a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f205953b, bVar);
        }
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscribeOnObserver<T> f205954a;

        public a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.f205954a = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.f206214a.a(this.f205954a);
        }
    }

    public ObservableSubscribeOn(hc.E<T> e10, hc.H h10) {
        super(e10);
        this.f205951b = h10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(g10);
        g10.onSubscribe(subscribeOnObserver);
        DisposableHelper.setOnce(subscribeOnObserver, this.f205951b.e(new a(subscribeOnObserver)));
    }
}
