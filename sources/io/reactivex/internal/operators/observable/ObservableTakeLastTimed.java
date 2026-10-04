package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTakeLastTimed<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f205980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f205981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f205982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hc.H f205983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f205984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f205985g;

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f205988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f205989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final hc.H f205990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final io.reactivex.internal.queue.a<Object> f205991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f205992g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public io.reactivex.disposables.b f205993h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f205994i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Throwable f205995j;

        public TakeLastTimedObserver(hc.G<? super T> g10, long j10, long j11, TimeUnit timeUnit, hc.H h10, int i10, boolean z10) {
            this.f205986a = g10;
            this.f205987b = j10;
            this.f205988c = j11;
            this.f205989d = timeUnit;
            this.f205990e = h10;
            this.f205991f = new io.reactivex.internal.queue.a<>(i10);
            this.f205992g = z10;
        }

        public void d() {
            Throwable th;
            if (compareAndSet(false, true)) {
                hc.G<? super T> g10 = this.f205986a;
                io.reactivex.internal.queue.a<Object> aVar = this.f205991f;
                boolean z10 = this.f205992g;
                while (!this.f205994i) {
                    if (!z10 && (th = this.f205995j) != null) {
                        aVar.clear();
                        g10.onError(th);
                        return;
                    }
                    Object objPoll = aVar.poll();
                    if (objPoll == null) {
                        Throwable th2 = this.f205995j;
                        if (th2 != null) {
                            g10.onError(th2);
                            return;
                        } else {
                            g10.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = aVar.poll();
                    if (((Long) objPoll).longValue() >= this.f205990e.d(this.f205989d) - this.f205988c) {
                        g10.onNext(objPoll2);
                    }
                }
                aVar.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f205994i) {
                return;
            }
            this.f205994i = true;
            this.f205993h.dispose();
            if (compareAndSet(false, true)) {
                this.f205991f.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205994i;
        }

        @Override // hc.G
        public void onComplete() {
            d();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205995j = th;
            d();
        }

        @Override // hc.G
        public void onNext(T t10) {
            io.reactivex.internal.queue.a<Object> aVar = this.f205991f;
            long jD = this.f205990e.d(this.f205989d);
            long j10 = this.f205988c;
            long j11 = this.f205987b;
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

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205993h, bVar)) {
                this.f205993h = bVar;
                this.f205986a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(hc.E<T> e10, long j10, long j11, TimeUnit timeUnit, hc.H h10, int i10, boolean z10) {
        super(e10);
        this.f205980b = j10;
        this.f205981c = j11;
        this.f205982d = timeUnit;
        this.f205983e = h10;
        this.f205984f = i10;
        this.f205985g = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new TakeLastTimedObserver(g10, this.f205980b, this.f205981c, this.f205982d, this.f205983e, this.f205984f, this.f205985g));
    }
}
