package Ec;

import io.reactivex.rxjava3.exceptions.CompositeException;
import zc.F;

/* JADX INFO: loaded from: classes7.dex */
public final class r<T> implements F<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F<? super T> f33873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33874b;

    public r(F<? super T> downstream) {
        this.f33873a = downstream;
    }

    @Override // zc.F, zc.InterfaceC5888e
    public void onComplete() {
        if (this.f33874b) {
            return;
        }
        try {
            this.f33873a.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onError(@yc.e Throwable e10) {
        if (this.f33874b) {
            Ic.a.Y(e10);
            return;
        }
        try {
            this.f33873a.onError(e10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(e10, th));
        }
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        try {
            this.f33873a.onSubscribe(d10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.f33874b = true;
            d10.dispose();
            Ic.a.Y(th);
        }
    }

    @Override // zc.F, zc.a0
    public void onSuccess(@yc.e T t10) {
        if (this.f33874b) {
            return;
        }
        try {
            this.f33873a.onSuccess(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }
}
