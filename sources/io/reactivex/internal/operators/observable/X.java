package io.reactivex.internal.operators.observable;

import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class X<R, T> extends AbstractC4648a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.D<? extends R, ? super T> f206203b;

    public X(hc.E<T> e10, hc.D<? extends R, ? super T> d10) {
        super(e10);
        this.f206203b = d10;
    }

    @Override // hc.z
    public void C5(hc.G<? super R> g10) {
        try {
            hc.G<? super Object> gA = this.f206203b.a(g10);
            io.reactivex.internal.functions.a.g(gA, "Operator " + this.f206203b + " returned a null Observer");
            this.f206214a.a(gA);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
