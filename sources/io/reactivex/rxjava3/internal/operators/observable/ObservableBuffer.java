package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractC4740a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f210023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.s<U> f210024d;

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8223395059921494546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super U> f210025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f210026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f210027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bc.s<U> f210028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayDeque<U> f210030f = new ArrayDeque<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f210031g;

        public BufferSkipObserver(zc.V<? super U> actual, int count, int skip, Bc.s<U> bufferSupplier) {
            this.f210025a = actual;
            this.f210026b = count;
            this.f210027c = skip;
            this.f210028d = bufferSupplier;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210029e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210029e.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            while (!this.f210030f.isEmpty()) {
                this.f210025a.onNext(this.f210030f.poll());
            }
            this.f210025a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210030f.clear();
            this.f210025a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            long j10 = this.f210031g;
            this.f210031g = 1 + j10;
            if (j10 % ((long) this.f210027c) == 0) {
                try {
                    U u10 = this.f210028d.get();
                    ExceptionHelper.d(u10, "The bufferSupplier returned a null Collection.");
                    this.f210030f.offer(u10);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.f210030f.clear();
                    this.f210029e.dispose();
                    this.f210025a.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f210030f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f210026b <= next.size()) {
                    it.remove();
                    this.f210025a.onNext(next);
                }
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210029e, d10)) {
                this.f210029e = d10;
                this.f210025a.onSubscribe(this);
            }
        }
    }

    public static final class a<T, U extends Collection<? super T>> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super U> f210032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f210033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.s<U> f210034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f210035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f210036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210037f;

        public a(zc.V<? super U> actual, int count, Bc.s<U> bufferSupplier) {
            this.f210032a = actual;
            this.f210033b = count;
            this.f210034c = bufferSupplier;
        }

        public boolean a() {
            try {
                U u10 = this.f210034c.get();
                Objects.requireNonNull(u10, "Empty buffer supplied");
                this.f210035d = u10;
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f210035d = null;
                io.reactivex.rxjava3.disposables.d dVar = this.f210037f;
                if (dVar == null) {
                    EmptyDisposable.error(th, this.f210032a);
                    return false;
                }
                dVar.dispose();
                this.f210032a.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210037f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210037f.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            U u10 = this.f210035d;
            if (u10 != null) {
                this.f210035d = null;
                if (!u10.isEmpty()) {
                    this.f210032a.onNext(u10);
                }
                this.f210032a.onComplete();
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210035d = null;
            this.f210032a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            U u10 = this.f210035d;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f210036e + 1;
                this.f210036e = i10;
                if (i10 >= this.f210033b) {
                    this.f210032a.onNext(u10);
                    this.f210036e = 0;
                    a();
                }
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210037f, d10)) {
                this.f210037f = d10;
                this.f210032a.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(zc.T<T> source, int count, int skip, Bc.s<U> bufferSupplier) {
        super(source);
        this.f210022b = count;
        this.f210023c = skip;
        this.f210024d = bufferSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super U> t10) {
        int i10 = this.f210023c;
        int i11 = this.f210022b;
        if (i10 != i11) {
            this.f210954a.a(new BufferSkipObserver(t10, this.f210022b, this.f210023c, this.f210024d));
            return;
        }
        a aVar = new a(t10, i11, this.f210024d);
        if (aVar.a()) {
            this.f210954a.a(aVar);
        }
    }
}
