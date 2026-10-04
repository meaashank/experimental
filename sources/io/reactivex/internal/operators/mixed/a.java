package io.reactivex.internal.operators.mixed;

import A0.a;
import hc.G;
import hc.InterfaceC4524d;
import hc.InterfaceC4527g;
import hc.O;
import hc.w;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;
import nc.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> boolean a(Object obj, o<? super T, ? extends InterfaceC4527g> oVar, InterfaceC4524d interfaceC4524d) {
        InterfaceC4527g interfaceC4527g;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            a.b bVar = (Object) ((Callable) obj).call();
            if (bVar != null) {
                InterfaceC4527g interfaceC4527gApply = oVar.apply(bVar);
                io.reactivex.internal.functions.a.g(interfaceC4527gApply, "The mapper returned a null CompletableSource");
                interfaceC4527g = interfaceC4527gApply;
            } else {
                interfaceC4527g = null;
            }
            if (interfaceC4527g == null) {
                EmptyDisposable.complete(interfaceC4524d);
                return true;
            }
            interfaceC4527g.d(interfaceC4524d);
            return true;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, interfaceC4524d);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, o<? super T, ? extends w<? extends R>> oVar, G<? super R> g10) {
        w<? extends R> wVar;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            a.b bVar = (Object) ((Callable) obj).call();
            if (bVar != null) {
                w<? extends R> wVarApply = oVar.apply(bVar);
                io.reactivex.internal.functions.a.g(wVarApply, "The mapper returned a null MaybeSource");
                wVar = wVarApply;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                EmptyDisposable.complete(g10);
                return true;
            }
            wVar.b(MaybeToObservable.c8(g10));
            return true;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, g10);
            return true;
        }
    }

    public static <T, R> boolean c(Object obj, o<? super T, ? extends O<? extends R>> oVar, G<? super R> g10) {
        O<? extends R> o10;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            a.b bVar = (Object) ((Callable) obj).call();
            if (bVar != null) {
                O<? extends R> oApply = oVar.apply(bVar);
                io.reactivex.internal.functions.a.g(oApply, "The mapper returned a null SingleSource");
                o10 = oApply;
            } else {
                o10 = null;
            }
            if (o10 == null) {
                EmptyDisposable.complete(g10);
                return true;
            }
            o10.d(SingleToObservable.c8(g10));
            return true;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, g10);
            return true;
        }
    }
}
