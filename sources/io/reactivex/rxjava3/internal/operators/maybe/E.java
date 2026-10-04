package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class E<T, R> extends AbstractC4725a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.H<? extends R, ? super T> f209358b;

    public E(zc.I<T> source, zc.H<? extends R, ? super T> operator) {
        super(source);
        this.f209358b = operator;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super R> observer) {
        try {
            zc.F<? super Object> fA = this.f209358b.a(observer);
            Objects.requireNonNull(fA, "The operator returned a null MaybeObserver");
            this.f209610a.b(fA);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, observer);
        }
    }
}
