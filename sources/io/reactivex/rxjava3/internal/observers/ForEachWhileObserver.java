package io.reactivex.rxjava3.internal.observers;

import Bc.a;
import Bc.g;
import Bc.r;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<d> implements V<T>, d {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<? super T> f207593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<? super Throwable> f207594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f207595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f207596d;

    public ForEachWhileObserver(r<? super T> onNext, g<? super Throwable> onError, a onComplete) {
        this.f207593a = onNext;
        this.f207594b = onError;
        this.f207595c = onComplete;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // zc.V
    public void onComplete() {
        if (this.f207596d) {
            return;
        }
        this.f207596d = true;
        try {
            this.f207595c.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        if (this.f207596d) {
            Ic.a.Y(t10);
            return;
        }
        this.f207596d = true;
        try {
            this.f207594b.accept(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(t10, th));
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        if (this.f207596d) {
            return;
        }
        try {
            if (this.f207593a.test(t10)) {
                return;
            }
            DisposableHelper.dispose(this);
            onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            DisposableHelper.dispose(this);
            onError(th);
        }
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        DisposableHelper.setOnce(this, d10);
    }
}
