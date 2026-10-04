package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTakeLast<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210674b;

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f210676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f210678d;

        public TakeLastObserver(zc.V<? super T> actual, int count) {
            this.f210675a = actual;
            this.f210676b = count;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f210678d) {
                return;
            }
            this.f210678d = true;
            this.f210677c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210678d;
        }

        @Override // zc.V
        public void onComplete() {
            zc.V<? super T> v10 = this.f210675a;
            while (!this.f210678d) {
                T tPoll = poll();
                if (tPoll == null) {
                    v10.onComplete();
                    return;
                }
                v10.onNext(tPoll);
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210675a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f210676b == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210677c, d10)) {
                this.f210677c = d10;
                this.f210675a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLast(zc.T<T> source, int count) {
        super(source);
        this.f210674b = count;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new TakeLastObserver(t10, this.f210674b));
    }
}
