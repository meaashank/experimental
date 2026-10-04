package Ec;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> extends CountDownLatch implements V<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f33812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f33814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f33815d;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.i(e10);
            }
        }
        Throwable th = this.f33813b;
        if (th == null) {
            return this.f33812a;
        }
        throw ExceptionHelper.i(th);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f33815d = true;
        io.reactivex.rxjava3.disposables.d dVar = this.f33814c;
        if (dVar != null) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f33815d;
    }

    @Override // zc.V
    public final void onComplete() {
        countDown();
    }

    @Override // zc.V
    public final void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        this.f33814c = d10;
        if (this.f33815d) {
            d10.dispose();
        }
    }
}
