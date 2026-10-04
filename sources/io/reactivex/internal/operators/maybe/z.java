package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class z<T, R> extends AbstractC4640a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.v<? extends R, ? super T> f205053b;

    public z(hc.w<T> wVar, hc.v<? extends R, ? super T> vVar) {
        super(wVar);
        this.f205053b = vVar;
    }

    @Override // hc.q
    public void o1(hc.t<? super R> tVar) {
        try {
            hc.t<? super Object> tVarA = this.f205053b.a(tVar);
            io.reactivex.internal.functions.a.g(tVarA, "The operator returned a null MaybeObserver");
            this.f204988a.b(tVarA);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, tVar);
        }
    }
}
