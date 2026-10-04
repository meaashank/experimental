package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractC4648a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f205364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<U> f205365d;

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8223395059921494546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super U> f205366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f205368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<U> f205369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f205370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayDeque<U> f205371f = new ArrayDeque<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f205372g;

        public BufferSkipObserver(hc.G<? super U> g10, int i10, int i11, Callable<U> callable) {
            this.f205366a = g10;
            this.f205367b = i10;
            this.f205368c = i11;
            this.f205369d = callable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205370e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205370e.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            while (!this.f205371f.isEmpty()) {
                this.f205366a.onNext(this.f205371f.poll());
            }
            this.f205366a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205371f.clear();
            this.f205366a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            long j10 = this.f205372g;
            this.f205372g = 1 + j10;
            if (j10 % ((long) this.f205368c) == 0) {
                try {
                    U uCall = this.f205369d.call();
                    io.reactivex.internal.functions.a.g(uCall, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f205371f.offer(uCall);
                } catch (Throwable th) {
                    this.f205371f.clear();
                    this.f205370e.dispose();
                    this.f205366a.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f205371f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f205367b <= next.size()) {
                    it.remove();
                    this.f205366a.onNext(next);
                }
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205370e, bVar)) {
                this.f205370e = bVar;
                this.f205366a.onSubscribe(this);
            }
        }
    }

    public static final class a<T, U extends Collection<? super T>> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super U> f205373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable<U> f205375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f205376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f205377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.disposables.b f205378f;

        public a(hc.G<? super U> g10, int i10, Callable<U> callable) {
            this.f205373a = g10;
            this.f205374b = i10;
            this.f205375c = callable;
        }

        public boolean a() {
            try {
                U uCall = this.f205375c.call();
                io.reactivex.internal.functions.a.g(uCall, "Empty buffer supplied");
                this.f205376d = uCall;
                return true;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f205376d = null;
                io.reactivex.disposables.b bVar = this.f205378f;
                if (bVar == null) {
                    EmptyDisposable.error(th, this.f205373a);
                    return false;
                }
                bVar.dispose();
                this.f205373a.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205378f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205378f.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            U u10 = this.f205376d;
            if (u10 != null) {
                this.f205376d = null;
                if (!u10.isEmpty()) {
                    this.f205373a.onNext(u10);
                }
                this.f205373a.onComplete();
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205376d = null;
            this.f205373a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            U u10 = this.f205376d;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f205377e + 1;
                this.f205377e = i10;
                if (i10 >= this.f205374b) {
                    this.f205373a.onNext(u10);
                    this.f205377e = 0;
                    a();
                }
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205378f, bVar)) {
                this.f205378f = bVar;
                this.f205373a.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(hc.E<T> e10, int i10, int i11, Callable<U> callable) {
        super(e10);
        this.f205363b = i10;
        this.f205364c = i11;
        this.f205365d = callable;
    }

    @Override // hc.z
    public void C5(hc.G<? super U> g10) {
        int i10 = this.f205364c;
        int i11 = this.f205363b;
        if (i10 != i11) {
            this.f206214a.a(new BufferSkipObserver(g10, this.f205363b, this.f205364c, this.f205365d));
            return;
        }
        a aVar = new a(g10, i11, this.f205365d);
        if (aVar.a()) {
            this.f206214a.a(aVar);
        }
    }
}
