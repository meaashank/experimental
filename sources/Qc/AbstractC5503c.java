package qc;

import hc.G;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: qc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5503c<T> extends CountDownLatch implements G<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f227049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f227050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.reactivex.disposables.b f227051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f227052d;

    public AbstractC5503c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.e(e10);
            }
        }
        Throwable th = this.f227050b;
        if (th == null) {
            return this.f227049a;
        }
        throw ExceptionHelper.e(th);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        this.f227052d = true;
        io.reactivex.disposables.b bVar = this.f227051c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f227052d;
    }

    @Override // hc.G
    public final void onComplete() {
        countDown();
    }

    @Override // hc.G
    public final void onSubscribe(io.reactivex.disposables.b bVar) {
        this.f227051c = bVar;
        if (this.f227052d) {
            bVar.dispose();
        }
    }
}
