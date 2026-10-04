package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4659l<T, U extends Collection<? super T>, B> extends AbstractC4648a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.E<B> f206319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<U> f206320c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.l$a */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T, U, B> f206321b;

        public a(b<T, U, B> bVar) {
            this.f206321b = bVar;
        }

        @Override // hc.G
        public void onComplete() {
            this.f206321b.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206321b.onError(th);
        }

        @Override // hc.G
        public void onNext(B b10) {
            this.f206321b.j();
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.l$b */
    public static final class b<T, U extends Collection<? super T>, B> extends qc.k<T, U, U> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public final Callable<U> f206322K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public final hc.E<B> f206323L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public io.reactivex.disposables.b f206324M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public io.reactivex.disposables.b f206325N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public U f206326O;

        public b(hc.G<? super U> g10, Callable<U> callable, hc.E<B> e10) {
            super(g10, new MpscLinkedQueue());
            this.f206322K = callable;
            this.f206323L = e10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f227069H) {
                return;
            }
            this.f227069H = true;
            this.f206325N.dispose();
            this.f206324M.dispose();
            if (c()) {
                this.f227068G.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // qc.k, io.reactivex.internal.util.j
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(hc.G<? super U> g10, U u10) {
            this.f227067F.onNext((Object) u10);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f227069H;
        }

        public void j() {
            try {
                U uCall = this.f206322K.call();
                io.reactivex.internal.functions.a.g(uCall, "The buffer supplied is null");
                U u10 = uCall;
                synchronized (this) {
                    try {
                        U u11 = this.f206326O;
                        if (u11 == null) {
                            return;
                        }
                        this.f206326O = u10;
                        g(u11, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                dispose();
                this.f227067F.onError(th2);
            }
        }

        @Override // hc.G
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f206326O;
                    if (u10 == null) {
                        return;
                    }
                    this.f206326O = null;
                    this.f227068G.offer(u10);
                    this.f227070I = true;
                    if (c()) {
                        io.reactivex.internal.util.n.d(this.f227068G, this.f227067F, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            dispose();
            this.f227067F.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f206326O;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206324M, bVar)) {
                this.f206324M = bVar;
                try {
                    U uCall = this.f206322K.call();
                    io.reactivex.internal.functions.a.g(uCall, "The buffer supplied is null");
                    this.f206326O = uCall;
                    a aVar = new a(this);
                    this.f206325N = aVar;
                    this.f227067F.onSubscribe(this);
                    if (this.f227069H) {
                        return;
                    }
                    this.f206323L.a(aVar);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f227069H = true;
                    bVar.dispose();
                    EmptyDisposable.error(th, this.f227067F);
                }
            }
        }
    }

    public C4659l(hc.E<T> e10, hc.E<B> e11, Callable<U> callable) {
        super(e10);
        this.f206319b = e11;
        this.f206320c = callable;
    }

    @Override // hc.z
    public void C5(hc.G<? super U> g10) {
        this.f206214a.a(new b(new io.reactivex.observers.l(g10, false), this.f206320c, this.f206319b));
    }
}
