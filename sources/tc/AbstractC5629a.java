package tc;

import hc.AbstractC4530j;
import hc.H;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.parallel.ParallelCollect;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.internal.operators.parallel.ParallelJoin;
import io.reactivex.internal.operators.parallel.ParallelReduce;
import io.reactivex.internal.operators.parallel.ParallelReduceFull;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import io.reactivex.internal.operators.parallel.ParallelSortedJoin;
import io.reactivex.internal.operators.parallel.d;
import io.reactivex.internal.operators.parallel.f;
import io.reactivex.internal.operators.parallel.g;
import io.reactivex.internal.operators.parallel.h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.ListAddBiConsumer;
import io.reactivex.internal.util.i;
import io.reactivex.parallel.ParallelFailureHandling;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import lc.InterfaceC5188a;
import lc.InterfaceC5190c;
import lc.e;
import nc.InterfaceC5265a;
import nc.InterfaceC5266b;
import nc.InterfaceC5267c;
import nc.InterfaceC5271g;
import nc.o;
import nc.q;
import nc.r;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: renamed from: tc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5629a<T> {
    @e
    @InterfaceC5190c
    public static <T> AbstractC5629a<T> A(@e Publisher<? extends T> publisher, int i10, int i11) {
        io.reactivex.internal.functions.a.g(publisher, "source");
        io.reactivex.internal.functions.a.h(i10, "parallelism");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return C5666a.V(new ParallelFromPublisher(publisher, i10, i11));
    }

    @e
    @InterfaceC5190c
    public static <T> AbstractC5629a<T> B(@e Publisher<T>... publisherArr) {
        if (publisherArr.length != 0) {
            return C5666a.V(new f(publisherArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @InterfaceC5190c
    public static <T> AbstractC5629a<T> y(@e Publisher<? extends T> publisher) {
        return A(publisher, Runtime.getRuntime().availableProcessors(), AbstractC4530j.U());
    }

    @InterfaceC5190c
    public static <T> AbstractC5629a<T> z(@e Publisher<? extends T> publisher, int i10) {
        return A(publisher, i10, AbstractC4530j.U());
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> C(@e o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        return C5666a.V(new g(this, oVar));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> D(@e o<? super T, ? extends R> oVar, @e ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        io.reactivex.internal.functions.a.g(parallelFailureHandling, "errorHandler is null");
        return C5666a.V(new h(this, oVar, parallelFailureHandling));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> E(@e o<? super T, ? extends R> oVar, @e InterfaceC5267c<? super Long, ? super Throwable, ParallelFailureHandling> interfaceC5267c) {
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        io.reactivex.internal.functions.a.g(interfaceC5267c, "errorHandler is null");
        return C5666a.V(new h(this, oVar, interfaceC5267c));
    }

    public abstract int F();

    @e
    @InterfaceC5190c
    public final AbstractC4530j<T> G(@e InterfaceC5267c<T, T, T> interfaceC5267c) {
        io.reactivex.internal.functions.a.g(interfaceC5267c, "reducer");
        return C5666a.P(new ParallelReduceFull(this, interfaceC5267c));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> H(@e Callable<R> callable, @e InterfaceC5267c<R, ? super T, R> interfaceC5267c) {
        io.reactivex.internal.functions.a.g(callable, "initialSupplier");
        io.reactivex.internal.functions.a.g(interfaceC5267c, "reducer");
        return C5666a.V(new ParallelReduce(this, callable, interfaceC5267c));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> I(@e H h10) {
        return J(h10, AbstractC4530j.U());
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> J(@e H h10, int i10) {
        io.reactivex.internal.functions.a.g(h10, "scheduler");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return C5666a.V(new ParallelRunOn(this, h10, i10));
    }

    @InterfaceC5188a(BackpressureKind.FULL)
    @InterfaceC5190c
    @lc.g("none")
    public final AbstractC4530j<T> K() {
        return L(AbstractC4530j.U());
    }

    @InterfaceC5188a(BackpressureKind.FULL)
    @InterfaceC5190c
    @e
    @lc.g("none")
    public final AbstractC4530j<T> L(int i10) {
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return C5666a.P(new ParallelJoin(this, i10, false));
    }

    @InterfaceC5188a(BackpressureKind.FULL)
    @InterfaceC5190c
    @e
    @lc.g("none")
    public final AbstractC4530j<T> M() {
        return N(AbstractC4530j.U());
    }

    @InterfaceC5188a(BackpressureKind.FULL)
    @InterfaceC5190c
    @e
    @lc.g("none")
    public final AbstractC4530j<T> N(int i10) {
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return C5666a.P(new ParallelJoin(this, i10, true));
    }

    @e
    @InterfaceC5190c
    public final AbstractC4530j<T> O(@e Comparator<? super T> comparator) {
        return P(comparator, 16);
    }

    @e
    @InterfaceC5190c
    public final AbstractC4530j<T> P(@e Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return C5666a.P(new ParallelSortedJoin(H(new Functions.CallableC4612j((i10 / F()) + 1), ListAddBiConsumer.instance()).C(new io.reactivex.internal.util.o(comparator)), comparator));
    }

    public abstract void Q(@e Subscriber<? super T>[] subscriberArr);

    @e
    @InterfaceC5190c
    public final <U> U R(@e o<? super AbstractC5629a<T>, U> oVar) {
        try {
            io.reactivex.internal.functions.a.g(oVar, "converter is null");
            return oVar.apply(this);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            throw ExceptionHelper.e(th);
        }
    }

    @e
    @InterfaceC5190c
    public final AbstractC4530j<List<T>> S(@e Comparator<? super T> comparator) {
        return T(comparator, 16);
    }

    @e
    @InterfaceC5190c
    public final AbstractC4530j<List<T>> T(@e Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return C5666a.P(H(new Functions.CallableC4612j((i10 / F()) + 1), ListAddBiConsumer.instance()).C(new io.reactivex.internal.util.o(comparator)).G(new i(comparator)));
    }

    public final boolean U(@e Subscriber<?>[] subscriberArr) {
        int iF = F();
        if (subscriberArr.length == iF) {
            return true;
        }
        StringBuilder sbA = android.support.v4.media.a.a("parallelism = ", iF, ", subscribers = ");
        sbA.append(subscriberArr.length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbA.toString());
        for (Subscriber<?> subscriber : subscriberArr) {
            EmptySubscription.error(illegalArgumentException, subscriber);
        }
        return false;
    }

    @e
    @InterfaceC5190c
    public final <R> R a(@e b<T, R> bVar) {
        io.reactivex.internal.functions.a.g(bVar, "converter is null");
        return bVar.a(this);
    }

    @e
    @InterfaceC5190c
    public final <C> AbstractC5629a<C> b(@e Callable<? extends C> callable, @e InterfaceC5266b<? super C, ? super T> interfaceC5266b) {
        io.reactivex.internal.functions.a.g(callable, "collectionSupplier is null");
        io.reactivex.internal.functions.a.g(interfaceC5266b, "collector is null");
        return C5666a.V(new ParallelCollect(this, callable, interfaceC5266b));
    }

    @e
    @InterfaceC5190c
    public final <U> AbstractC5629a<U> c(@e c<T, U> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "composer is null");
        return C5666a.V(cVar.a(this));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> d(@e o<? super T, ? extends Publisher<? extends R>> oVar) {
        return e(oVar, 2);
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> e(@e o<? super T, ? extends Publisher<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return C5666a.V(new io.reactivex.internal.operators.parallel.a(this, oVar, i10, ErrorMode.IMMEDIATE));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> f(@e o<? super T, ? extends Publisher<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return C5666a.V(new io.reactivex.internal.operators.parallel.a(this, oVar, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> g(@e o<? super T, ? extends Publisher<? extends R>> oVar, boolean z10) {
        return f(oVar, 2, z10);
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> h(@e InterfaceC5271g<? super T> interfaceC5271g) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onAfterNext is null");
        InterfaceC5271g<Object> interfaceC5271g2 = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g2, interfaceC5271g, interfaceC5271g2, interfaceC5265a, interfaceC5265a, interfaceC5271g2, Functions.f202953g, interfaceC5265a));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> i(@e InterfaceC5265a interfaceC5265a) {
        io.reactivex.internal.functions.a.g(interfaceC5265a, "onAfterTerminate is null");
        InterfaceC5271g<Object> interfaceC5271g = Functions.f202950d;
        InterfaceC5265a interfaceC5265a2 = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g, interfaceC5271g, interfaceC5271g, interfaceC5265a2, interfaceC5265a, interfaceC5271g, Functions.f202953g, interfaceC5265a2));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> j(@e InterfaceC5265a interfaceC5265a) {
        io.reactivex.internal.functions.a.g(interfaceC5265a, "onCancel is null");
        InterfaceC5271g<Object> interfaceC5271g = Functions.f202950d;
        InterfaceC5265a interfaceC5265a2 = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g, interfaceC5271g, interfaceC5271g, interfaceC5265a2, interfaceC5265a2, interfaceC5271g, Functions.f202953g, interfaceC5265a));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> k(@e InterfaceC5265a interfaceC5265a) {
        io.reactivex.internal.functions.a.g(interfaceC5265a, "onComplete is null");
        InterfaceC5271g<Object> interfaceC5271g = Functions.f202950d;
        InterfaceC5265a interfaceC5265a2 = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g, interfaceC5271g, interfaceC5271g, interfaceC5265a, interfaceC5265a2, interfaceC5271g, Functions.f202953g, interfaceC5265a2));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> l(@e InterfaceC5271g<Throwable> interfaceC5271g) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onError is null");
        InterfaceC5271g<Object> interfaceC5271g2 = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g2, interfaceC5271g2, interfaceC5271g, interfaceC5265a, interfaceC5265a, interfaceC5271g2, Functions.f202953g, interfaceC5265a));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> m(@e InterfaceC5271g<? super T> interfaceC5271g) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onNext is null");
        InterfaceC5271g<Object> interfaceC5271g2 = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g, interfaceC5271g2, interfaceC5271g2, interfaceC5265a, interfaceC5265a, interfaceC5271g2, Functions.f202953g, interfaceC5265a));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> n(@e InterfaceC5271g<? super T> interfaceC5271g, @e ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onNext is null");
        io.reactivex.internal.functions.a.g(parallelFailureHandling, "errorHandler is null");
        return C5666a.V(new io.reactivex.internal.operators.parallel.b(this, interfaceC5271g, parallelFailureHandling));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> o(@e InterfaceC5271g<? super T> interfaceC5271g, @e InterfaceC5267c<? super Long, ? super Throwable, ParallelFailureHandling> interfaceC5267c) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onNext is null");
        io.reactivex.internal.functions.a.g(interfaceC5267c, "errorHandler is null");
        return C5666a.V(new io.reactivex.internal.operators.parallel.b(this, interfaceC5271g, interfaceC5267c));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> p(@e q qVar) {
        io.reactivex.internal.functions.a.g(qVar, "onRequest is null");
        InterfaceC5271g<Object> interfaceC5271g = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g, interfaceC5271g, interfaceC5271g, interfaceC5265a, interfaceC5265a, interfaceC5271g, qVar, interfaceC5265a));
    }

    @e
    @InterfaceC5190c
    public final AbstractC5629a<T> q(@e InterfaceC5271g<? super Subscription> interfaceC5271g) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onSubscribe is null");
        InterfaceC5271g<Object> interfaceC5271g2 = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        return C5666a.V(new io.reactivex.internal.operators.parallel.i(this, interfaceC5271g2, interfaceC5271g2, interfaceC5271g2, interfaceC5265a, interfaceC5265a, interfaceC5271g, Functions.f202953g, interfaceC5265a));
    }

    @InterfaceC5190c
    public final AbstractC5629a<T> r(@e r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate");
        return C5666a.V(new io.reactivex.internal.operators.parallel.c(this, rVar));
    }

    @InterfaceC5190c
    public final AbstractC5629a<T> s(@e r<? super T> rVar, @e ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.a.g(rVar, "predicate");
        io.reactivex.internal.functions.a.g(parallelFailureHandling, "errorHandler is null");
        return C5666a.V(new d(this, rVar, parallelFailureHandling));
    }

    @InterfaceC5190c
    public final AbstractC5629a<T> t(@e r<? super T> rVar, @e InterfaceC5267c<? super Long, ? super Throwable, ParallelFailureHandling> interfaceC5267c) {
        io.reactivex.internal.functions.a.g(rVar, "predicate");
        io.reactivex.internal.functions.a.g(interfaceC5267c, "errorHandler is null");
        return C5666a.V(new d(this, rVar, interfaceC5267c));
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> u(@e o<? super T, ? extends Publisher<? extends R>> oVar) {
        return x(oVar, false, Integer.MAX_VALUE, AbstractC4530j.U());
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> v(@e o<? super T, ? extends Publisher<? extends R>> oVar, boolean z10) {
        return x(oVar, z10, Integer.MAX_VALUE, AbstractC4530j.U());
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> w(@e o<? super T, ? extends Publisher<? extends R>> oVar, boolean z10, int i10) {
        return x(oVar, z10, i10, AbstractC4530j.U());
    }

    @e
    @InterfaceC5190c
    public final <R> AbstractC5629a<R> x(@e o<? super T, ? extends Publisher<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return C5666a.V(new io.reactivex.internal.operators.parallel.e(this, oVar, z10, i10, i11));
    }
}
