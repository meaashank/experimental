package Ec;

import io.reactivex.rxjava3.exceptions.CompositeException;
import zc.InterfaceC5888e;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements InterfaceC5888e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5888e f33871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33872b;

    public q(InterfaceC5888e downstream) {
        this.f33871a = downstream;
    }

    @Override // zc.InterfaceC5888e
    public void onComplete() {
        if (this.f33872b) {
            return;
        }
        try {
            this.f33871a.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // zc.InterfaceC5888e
    public void onError(@yc.e Throwable e10) {
        if (this.f33872b) {
            Ic.a.Y(e10);
            return;
        }
        try {
            this.f33871a.onError(e10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(e10, th));
        }
    }

    @Override // zc.InterfaceC5888e
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        try {
            this.f33871a.onSubscribe(d10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.f33872b = true;
            d10.dispose();
            Ic.a.Y(th);
        }
    }
}
