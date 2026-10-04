package io.reactivex.internal.operators.observable;

import hc.H;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableThrottleFirstTimed<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f206002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f206003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.H f206004d;

    public static final class DebounceTimedObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.G<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f206006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f206007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H.c f206008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f206009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f206010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f206011g;

        public DebounceTimedObserver(hc.G<? super T> g10, long j10, TimeUnit timeUnit, H.c cVar) {
            this.f206005a = g10;
            this.f206006b = j10;
            this.f206007c = timeUnit;
            this.f206008d = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206009e.dispose();
            this.f206008d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206008d.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206011g) {
                return;
            }
            this.f206011g = true;
            this.f206005a.onComplete();
            this.f206008d.dispose();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206011g) {
                C5666a.Y(th);
                return;
            }
            this.f206011g = true;
            this.f206005a.onError(th);
            this.f206008d.dispose();
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206010f || this.f206011g) {
                return;
            }
            this.f206010f = true;
            this.f206005a.onNext(t10);
            io.reactivex.disposables.b bVar = get();
            if (bVar != null) {
                bVar.dispose();
            }
            DisposableHelper.replace(this, this.f206008d.c(this, this.f206006b, this.f206007c));
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206009e, bVar)) {
                this.f206009e = bVar;
                this.f206005a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f206010f = false;
        }
    }

    public ObservableThrottleFirstTimed(hc.E<T> e10, long j10, TimeUnit timeUnit, hc.H h10) {
        super(e10);
        this.f206002b = j10;
        this.f206003c = timeUnit;
        this.f206004d = h10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new DebounceTimedObserver(new io.reactivex.observers.l(g10, false), this.f206002b, this.f206003c, this.f206004d.c()));
    }
}
