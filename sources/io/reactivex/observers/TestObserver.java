package io.reactivex.observers;

import androidx.collection.N0;
import androidx.compose.animation.core.C1598m0;
import hc.G;
import hc.InterfaceC4524d;
import hc.L;
import hc.t;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5271g;

/* JADX INFO: loaded from: classes7.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements G<T>, io.reactivex.disposables.b, t<T>, L<T>, InterfaceC4524d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G<? super T> f207219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f207220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pc.j<T> f207221m;

    public enum EmptyObserver implements G<Object> {
        INSTANCE;

        @Override // hc.G
        public void onComplete() {
        }

        @Override // hc.G
        public void onError(Throwable th) {
        }

        @Override // hc.G
        public void onNext(Object obj) {
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public static <T> TestObserver<T> i0() {
        return new TestObserver<>();
    }

    public static <T> TestObserver<T> j0(G<? super T> g10) {
        return new TestObserver<>(g10);
    }

    public static String k0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? N0.a("Unknown(", i10, ")") : "ASYNC" : "SYNC" : "NONE";
    }

    public final TestObserver<T> c0() {
        if (this.f207221m != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final void cancel() {
        dispose();
    }

    public final TestObserver<T> d0(int i10) {
        int i11 = this.f207216h;
        if (i11 == i10) {
            return this;
        }
        if (this.f207221m == null) {
            throw T("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + k0(i10) + ", actual: " + k0(i11));
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f207220l);
    }

    public final TestObserver<T> e0() {
        if (this.f207221m == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestObserver<T> f0() {
        if (this.f207220l.get() != null) {
            throw T("Subscribed!");
        }
        if (this.f207211c.isEmpty()) {
            return this;
        }
        throw T("Not subscribed but errors found");
    }

    public final TestObserver<T> g0(InterfaceC5271g<? super TestObserver<T>> interfaceC5271g) {
        try {
            interfaceC5271g.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    public final TestObserver<T> h0() {
        if (this.f207220l.get() != null) {
            return this;
        }
        throw T("Not subscribed!");
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f207220l.get());
    }

    public final boolean l0() {
        return this.f207220l.get() != null;
    }

    public final boolean m0() {
        return isDisposed();
    }

    public final TestObserver<T> n0(int i10) {
        this.f207215g = i10;
        return this;
    }

    @Override // hc.G
    public void onComplete() {
        if (!this.f207214f) {
            this.f207214f = true;
            if (this.f207220l.get() == null) {
                this.f207211c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f207213e = Thread.currentThread();
            this.f207212d++;
            this.f207219k.onComplete();
        } finally {
            this.f207209a.countDown();
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        if (!this.f207214f) {
            this.f207214f = true;
            if (this.f207220l.get() == null) {
                this.f207211c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f207213e = Thread.currentThread();
            if (th == null) {
                this.f207211c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f207211c.add(th);
            }
            this.f207219k.onError(th);
            this.f207209a.countDown();
        } catch (Throwable th2) {
            this.f207209a.countDown();
            throw th2;
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        if (!this.f207214f) {
            this.f207214f = true;
            if (this.f207220l.get() == null) {
                this.f207211c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f207213e = Thread.currentThread();
        if (this.f207216h != 2) {
            this.f207210b.add(t10);
            if (t10 == null) {
                this.f207211c.add(new NullPointerException("onNext received a null value"));
            }
            this.f207219k.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f207221m.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f207210b.add(tPoll);
                }
            } catch (Throwable th) {
                this.f207211c.add(th);
                this.f207221m.dispose();
                return;
            }
        }
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        this.f207213e = Thread.currentThread();
        if (bVar == null) {
            this.f207211c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!C1598m0.a(this.f207220l, null, bVar)) {
            bVar.dispose();
            if (this.f207220l.get() != DisposableHelper.DISPOSED) {
                this.f207211c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
                return;
            }
            return;
        }
        int i10 = this.f207215g;
        if (i10 != 0 && (bVar instanceof pc.j)) {
            pc.j<T> jVar = (pc.j) bVar;
            this.f207221m = jVar;
            int iRequestFusion = jVar.requestFusion(i10);
            this.f207216h = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f207214f = true;
                this.f207213e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f207221m.poll();
                        if (tPoll == null) {
                            this.f207212d++;
                            this.f207220l.lazySet(DisposableHelper.DISPOSED);
                            return;
                        }
                        this.f207210b.add(tPoll);
                    } catch (Throwable th) {
                        this.f207211c.add(th);
                        return;
                    }
                }
            }
        }
        this.f207219k.onSubscribe(bVar);
    }

    @Override // hc.t
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ BaseTestConsumer q() {
        f0();
        return this;
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ BaseTestConsumer t() {
        h0();
        return this;
    }

    public TestObserver(G<? super T> g10) {
        this.f207220l = new AtomicReference<>();
        this.f207219k = g10;
    }
}
