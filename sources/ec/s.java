package Ec;

import io.reactivex.rxjava3.exceptions.CompositeException;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class s<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0<? super T> f33875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33876b;

    public s(a0<? super T> downstream) {
        this.f33875a = downstream;
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onError(@yc.e Throwable e10) {
        if (this.f33876b) {
            Ic.a.Y(e10);
            return;
        }
        try {
            this.f33875a.onError(e10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(e10, th));
        }
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        try {
            this.f33875a.onSubscribe(d10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.f33876b = true;
            d10.dispose();
            Ic.a.Y(th);
        }
    }

    @Override // zc.a0
    public void onSuccess(@yc.e T t10) {
        if (this.f33876b) {
            return;
        }
        try {
            this.f33875a.onSuccess(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }
}
