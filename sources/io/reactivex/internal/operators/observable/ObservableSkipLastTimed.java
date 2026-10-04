package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSkipLastTimed<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f205936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f205937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.H f205938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f205939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f205940f;

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f205943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hc.H f205944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final io.reactivex.internal.queue.a<Object> f205945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f205946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public io.reactivex.disposables.b f205947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f205948h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f205949i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Throwable f205950j;

        public SkipLastTimedObserver(hc.G<? super T> g10, long j10, TimeUnit timeUnit, hc.H h10, int i10, boolean z10) {
            this.f205941a = g10;
            this.f205942b = j10;
            this.f205943c = timeUnit;
            this.f205944d = h10;
            this.f205945e = new io.reactivex.internal.queue.a<>(i10);
            this.f205946f = z10;
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            hc.G<? super T> g10 = this.f205941a;
            io.reactivex.internal.queue.a<Object> aVar = this.f205945e;
            boolean z10 = this.f205946f;
            TimeUnit timeUnit = this.f205943c;
            hc.H h10 = this.f205944d;
            long j10 = this.f205942b;
            int iAddAndGet = 1;
            while (!this.f205948h) {
                boolean z11 = this.f205949i;
                Long l10 = (Long) aVar.peek();
                boolean z12 = l10 == null;
                long jD = h10.d(timeUnit);
                if (!z12 && l10.longValue() > jD - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th = this.f205950j;
                        if (th != null) {
                            this.f205945e.clear();
                            g10.onError(th);
                            return;
                        } else if (z12) {
                            g10.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th2 = this.f205950j;
                        if (th2 != null) {
                            g10.onError(th2);
                            return;
                        } else {
                            g10.onComplete();
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
                    g10.onNext(aVar.poll());
                }
            }
            this.f205945e.clear();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f205948h) {
                return;
            }
            this.f205948h = true;
            this.f205947g.dispose();
            if (getAndIncrement() == 0) {
                this.f205945e.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205948h;
        }

        @Override // hc.G
        public void onComplete() {
            this.f205949i = true;
            d();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205950j = th;
            this.f205949i = true;
            d();
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f205945e.offer(Long.valueOf(this.f205944d.d(this.f205943c)), t10);
            d();
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205947g, bVar)) {
                this.f205947g = bVar;
                this.f205941a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(hc.E<T> e10, long j10, TimeUnit timeUnit, hc.H h10, int i10, boolean z10) {
        super(e10);
        this.f205936b = j10;
        this.f205937c = timeUnit;
        this.f205938d = h10;
        this.f205939e = i10;
        this.f205940f = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new SkipLastTimedObserver(g10, this.f205936b, this.f205937c, this.f205938d, this.f205939e, this.f205940f));
    }
}
