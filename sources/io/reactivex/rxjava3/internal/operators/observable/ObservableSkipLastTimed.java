package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSkipLastTimed<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f210635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f210636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.W f210637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f210638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f210639f;

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f210641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f210642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final zc.W f210643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<Object> f210644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f210645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f210647h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f210648i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Throwable f210649j;

        public SkipLastTimedObserver(zc.V<? super T> actual, long time, TimeUnit unit, zc.W scheduler, int bufferSize, boolean delayError) {
            this.f210640a = actual;
            this.f210641b = time;
            this.f210642c = unit;
            this.f210643d = scheduler;
            this.f210644e = new io.reactivex.rxjava3.internal.queue.a<>(bufferSize);
            this.f210645f = delayError;
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            zc.V<? super T> v10 = this.f210640a;
            io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.f210644e;
            boolean z10 = this.f210645f;
            TimeUnit timeUnit = this.f210642c;
            zc.W w10 = this.f210643d;
            long j10 = this.f210641b;
            int iAddAndGet = 1;
            while (!this.f210647h) {
                boolean z11 = this.f210648i;
                Long l10 = (Long) aVar.peek();
                boolean z12 = l10 == null;
                long jD = w10.d(timeUnit);
                if (!z12 && l10.longValue() > jD - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th = this.f210649j;
                        if (th != null) {
                            this.f210644e.clear();
                            v10.onError(th);
                            return;
                        } else if (z12) {
                            v10.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th2 = this.f210649j;
                        if (th2 != null) {
                            v10.onError(th2);
                            return;
                        } else {
                            v10.onComplete();
                            return;
                        }
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    aVar.poll();
                    v10.onNext(aVar.poll());
                }
            }
            this.f210644e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f210647h) {
                return;
            }
            this.f210647h = true;
            this.f210646g.dispose();
            if (getAndIncrement() == 0) {
                this.f210644e.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210647h;
        }

        @Override // zc.V
        public void onComplete() {
            this.f210648i = true;
            d();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210649j = t10;
            this.f210648i = true;
            d();
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f210644e.offer(Long.valueOf(this.f210643d.d(this.f210642c)), t10);
            d();
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210646g, d10)) {
                this.f210646g = d10;
                this.f210640a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(zc.T<T> source, long time, TimeUnit unit, zc.W scheduler, int bufferSize, boolean delayError) {
        super(source);
        this.f210635b = time;
        this.f210636c = unit;
        this.f210637d = scheduler;
        this.f210638e = bufferSize;
        this.f210639f = delayError;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new SkipLastTimedObserver(t10, this.f210635b, this.f210636c, this.f210637d, this.f210638e, this.f210639f));
    }
}
