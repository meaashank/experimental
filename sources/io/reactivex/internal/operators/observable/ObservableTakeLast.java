package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTakeLast<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205975b;

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f205979d;

        public TakeLastObserver(hc.G<? super T> g10, int i10) {
            this.f205976a = g10;
            this.f205977b = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f205979d) {
                return;
            }
            this.f205979d = true;
            this.f205978c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205979d;
        }

        @Override // hc.G
        public void onComplete() {
            hc.G<? super T> g10 = this.f205976a;
            while (!this.f205979d) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f205979d) {
                        return;
                    }
                    g10.onComplete();
                    return;
                }
                g10.onNext(tPoll);
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205976a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f205977b == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205978c, bVar)) {
                this.f205978c = bVar;
                this.f205976a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLast(hc.E<T> e10, int i10) {
        super(e10);
        this.f205975b = i10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new TakeLastObserver(g10, this.f205975b));
    }
}
