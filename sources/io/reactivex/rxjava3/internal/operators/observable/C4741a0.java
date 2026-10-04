package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4741a0<R, T> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.S<? extends R, ? super T> f210955b;

    public C4741a0(zc.T<T> source, zc.S<? extends R, ? super T> operator) {
        super(source);
        this.f210955b = operator;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> observer) {
        try {
            zc.V<? super Object> vA = this.f210955b.a(observer);
            Objects.requireNonNull(vA, "Operator " + this.f210955b + " returned a null Observer");
            this.f210954a.a(vA);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
