package io.reactivex.rxjava3.observers;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.F;
import zc.InterfaceC5888e;
import zc.V;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public class TestObserver<T> extends a<T, TestObserver<T>> implements V<T>, io.reactivex.rxjava3.disposables.d, F<T>, a0<T>, InterfaceC5888e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V<? super T> f211958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f211959j;

    public enum EmptyObserver implements V<Object> {
        INSTANCE;

        @Override // zc.V
        public void onComplete() {
        }

        @Override // zc.V
        public void onError(Throwable t10) {
        }

        @Override // zc.V
        public void onNext(Object t10) {
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    @yc.e
    public static <T> TestObserver<T> D() {
        return new TestObserver<>();
    }

    @yc.e
    public static <T> TestObserver<T> E(@yc.e V<? super T> delegate) {
        return new TestObserver<>(delegate);
    }

    @yc.e
    public final TestObserver<T> C() {
        if (this.f211959j.get() != null) {
            return this;
        }
        throw y("Not subscribed!");
    }

    public final boolean F() {
        return this.f211959j.get() != null;
    }

    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.dispose(this.f211959j);
    }

    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f211959j.get());
    }

    @Override // io.reactivex.rxjava3.observers.a
    @yc.e
    public /* bridge */ /* synthetic */ a l() {
        C();
        return this;
    }

    @Override // zc.V
    public void onComplete() {
        if (!this.f211965f) {
            this.f211965f = true;
            if (this.f211959j.get() == null) {
                this.f211962c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f211964e = Thread.currentThread();
            this.f211963d++;
            this.f211958i.onComplete();
        } finally {
            this.f211960a.countDown();
        }
    }

    @Override // zc.V
    public void onError(@yc.e Throwable t10) {
        if (!this.f211965f) {
            this.f211965f = true;
            if (this.f211959j.get() == null) {
                this.f211962c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f211964e = Thread.currentThread();
            if (t10 == null) {
                this.f211962c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f211962c.add(t10);
            }
            this.f211958i.onError(t10);
            this.f211960a.countDown();
        } catch (Throwable th) {
            this.f211960a.countDown();
            throw th;
        }
    }

    @Override // zc.V
    public void onNext(@yc.e T t10) {
        if (!this.f211965f) {
            this.f211965f = true;
            if (this.f211959j.get() == null) {
                this.f211962c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f211964e = Thread.currentThread();
        this.f211961b.add(t10);
        if (t10 == null) {
            this.f211962c.add(new NullPointerException("onNext received a null value"));
        }
        this.f211958i.onNext(t10);
    }

    @Override // zc.V
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        this.f211964e = Thread.currentThread();
        if (d10 == null) {
            this.f211962c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (C1598m0.a(this.f211959j, null, d10)) {
            this.f211958i.onSubscribe(d10);
            return;
        }
        d10.dispose();
        if (this.f211959j.get() != DisposableHelper.DISPOSED) {
            this.f211962c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + d10));
        }
    }

    @Override // zc.F, zc.a0
    public void onSuccess(@yc.e T value) {
        onNext(value);
        onComplete();
    }

    public TestObserver(@yc.e V<? super T> downstream) {
        this.f211959j = new AtomicReference<>();
        this.f211958i = downstream;
    }
}
