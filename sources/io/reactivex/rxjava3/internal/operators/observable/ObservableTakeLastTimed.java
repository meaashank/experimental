package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTakeLastTimed<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f210679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f210680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f210681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zc.W f210682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f210683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f210684g;

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f210686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f210687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f210688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final zc.W f210689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<Object> f210690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f210691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210692h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f210693i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Throwable f210694j;

        public TakeLastTimedObserver(zc.V<? super T> actual, long count, long time, TimeUnit unit, zc.W scheduler, int bufferSize, boolean delayError) {
            this.f210685a = actual;
            this.f210686b = count;
            this.f210687c = time;
            this.f210688d = unit;
            this.f210689e = scheduler;
            this.f210690f = new io.reactivex.rxjava3.internal.queue.a<>(bufferSize);
            this.f210691g = delayError;
        }

        public void d() {
            Throwable th;
            if (compareAndSet(false, true)) {
                zc.V<? super T> v10 = this.f210685a;
                io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.f210690f;
                boolean z10 = this.f210691g;
                long jD = this.f210689e.d(this.f210688d) - this.f210687c;
                while (!this.f210693i) {
                    if (!z10 && (th = this.f210694j) != null) {
                        aVar.clear();
                        v10.onError(th);
                        return;
                    }
                    Object objPoll = aVar.poll();
                    if (objPoll == null) {
                        Throwable th2 = this.f210694j;
                        if (th2 != null) {
                            v10.onError(th2);
                            return;
                        } else {
                            v10.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = aVar.poll();
                    if (((Long) objPoll).longValue() >= jD) {
                        v10.onNext(objPoll2);
                    }
                }
                aVar.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f210693i) {
                return;
            }
            this.f210693i = true;
            this.f210692h.dispose();
            if (compareAndSet(false, true)) {
                this.f210690f.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210693i;
        }

        @Override // zc.V
        public void onComplete() {
            d();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210694j = t10;
            d();
        }

        @Override // zc.V
        public void onNext(T t10) {
            io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.f210690f;
            long jD = this.f210689e.d(this.f210688d);
            long j10 = this.f210687c;
            long j11 = this.f210686b;
            boolean z10 = j11 == Long.MAX_VALUE;
            aVar.offer(Long.valueOf(jD), t10);
            while (!aVar.isEmpty()) {
                if (((Long) aVar.peek()).longValue() > jD - j10 && (z10 || (aVar.p() >> 1) <= j11)) {
                    return;
                }
                aVar.poll();
                aVar.poll();
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210692h, d10)) {
                this.f210692h = d10;
                this.f210685a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(zc.T<T> source, long count, long time, TimeUnit unit, zc.W scheduler, int bufferSize, boolean delayError) {
        super(source);
        this.f210679b = count;
        this.f210680c = time;
        this.f210681d = unit;
        this.f210682e = scheduler;
        this.f210683f = bufferSize;
        this.f210684g = delayError;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new TakeLastTimedObserver(t10, this.f210679b, this.f210680c, this.f210681d, this.f210682e, this.f210683f, this.f210684g));
    }
}
