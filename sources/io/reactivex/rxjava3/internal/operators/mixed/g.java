package io.reactivex.rxjava3.internal.operators.mixed;

import A0.a;
import Bc.o;
import Bc.s;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import java.util.Objects;
import zc.I;
import zc.InterfaceC5888e;
import zc.InterfaceC5891h;
import zc.V;
import zc.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public g() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> boolean a(Object obj, o<? super T, ? extends InterfaceC5891h> oVar, InterfaceC5888e interfaceC5888e) {
        InterfaceC5891h interfaceC5891h;
        if (!(obj instanceof s)) {
            return false;
        }
        try {
            a.b bVar = (Object) ((s) obj).get();
            if (bVar != null) {
                InterfaceC5891h interfaceC5891hApply = oVar.apply(bVar);
                Objects.requireNonNull(interfaceC5891hApply, "The mapper returned a null CompletableSource");
                interfaceC5891h = interfaceC5891hApply;
            } else {
                interfaceC5891h = null;
            }
            if (interfaceC5891h == null) {
                EmptyDisposable.complete(interfaceC5888e);
                return true;
            }
            interfaceC5891h.d(interfaceC5888e);
            return true;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, interfaceC5888e);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, o<? super T, ? extends I<? extends R>> oVar, V<? super R> v10) {
        I<? extends R> i10;
        if (!(obj instanceof s)) {
            return false;
        }
        try {
            a.b bVar = (Object) ((s) obj).get();
            if (bVar != null) {
                I<? extends R> iApply = oVar.apply(bVar);
                Objects.requireNonNull(iApply, "The mapper returned a null MaybeSource");
                i10 = iApply;
            } else {
                i10 = null;
            }
            if (i10 == null) {
                EmptyDisposable.complete(v10);
                return true;
            }
            i10.b(MaybeToObservable.A8(v10));
            return true;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, v10);
            return true;
        }
    }

    public static <T, R> boolean c(Object obj, o<? super T, ? extends d0<? extends R>> oVar, V<? super R> v10) {
        d0<? extends R> d0Var;
        if (!(obj instanceof s)) {
            return false;
        }
        try {
            a.b bVar = (Object) ((s) obj).get();
            if (bVar != null) {
                d0<? extends R> d0VarApply = oVar.apply(bVar);
                Objects.requireNonNull(d0VarApply, "The mapper returned a null SingleSource");
                d0Var = d0VarApply;
            } else {
                d0Var = null;
            }
            if (d0Var == null) {
                EmptyDisposable.complete(v10);
                return true;
            }
            d0Var.d(SingleToObservable.A8(v10));
            return true;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, v10);
            return true;
        }
    }
}
