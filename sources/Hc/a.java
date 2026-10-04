package Hc;

import Bc.o;
import Bc.q;
import Bc.r;
import Bc.s;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.jdk8.H;
import io.reactivex.rxjava3.internal.jdk8.I;
import io.reactivex.rxjava3.internal.jdk8.J;
import io.reactivex.rxjava3.internal.jdk8.ParallelCollector;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelCollect;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelReduce;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelReduceFull;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelRunOn;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelSortedJoin;
import io.reactivex.rxjava3.internal.operators.parallel.d;
import io.reactivex.rxjava3.internal.operators.parallel.f;
import io.reactivex.rxjava3.internal.operators.parallel.h;
import io.reactivex.rxjava3.internal.operators.parallel.i;
import io.reactivex.rxjava3.internal.operators.parallel.j;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ListAddBiConsumer;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import yc.InterfaceC5848a;
import yc.e;
import yc.g;
import zc.AbstractC5902t;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> {
    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public static <T> a<T> C(@e Publisher<? extends T> source) {
        return E(source, Runtime.getRuntime().availableProcessors(), AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public static <T> a<T> D(@e Publisher<? extends T> source, int parallelism) {
        return E(source, parallelism, AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public static <T> a<T> E(@e Publisher<? extends T> source, int parallelism, int prefetch) {
        Objects.requireNonNull(source, "source is null");
        io.reactivex.rxjava3.internal.functions.a.b(parallelism, "parallelism");
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.Q(new ParallelFromPublisher(source, parallelism, prefetch));
    }

    @e
    @g("none")
    @SafeVarargs
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public static <T> a<T> F(@e Publisher<T>... publishers) {
        Objects.requireNonNull(publishers, "publishers is null");
        if (publishers.length != 0) {
            return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.g(publishers));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> A(@e o<? super T, ? extends Stream<? extends R>> mapper) {
        return B(mapper, AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> B(@e o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.Q(new H(this, mapper, prefetch));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> a<R> G(@e o<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return Ic.a.Q(new h(this, mapper));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> a<R> H(@e o<? super T, ? extends R> mapper, @e Bc.c<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new i(this, mapper, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> a<R> I(@e o<? super T, ? extends R> mapper, @e ParallelFailureHandling errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new i(this, mapper, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> a<R> J(@e o<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return Ic.a.Q(new I(this, mapper));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> a<R> K(@e o<? super T, Optional<? extends R>> mapper, @e Bc.c<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new J(this, mapper, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> a<R> L(@e o<? super T, Optional<? extends R>> mapper, @e ParallelFailureHandling errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new J(this, mapper, errorHandler));
    }

    @yc.c
    public abstract int M();

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final <R> a<R> N(@e s<R> initialSupplier, @e Bc.c<R, ? super T, R> reducer) {
        Objects.requireNonNull(initialSupplier, "initialSupplier is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return Ic.a.Q(new ParallelReduce(this, initialSupplier, reducer));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final AbstractC5902t<T> O(@e Bc.c<T, T, T> reducer) {
        Objects.requireNonNull(reducer, "reducer is null");
        return Ic.a.S(new ParallelReduceFull(this, reducer));
    }

    @e
    @g("custom")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final a<T> P(@e W scheduler) {
        return Q(scheduler, AbstractC5902t.U());
    }

    @e
    @g("custom")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final a<T> Q(@e W scheduler, int prefetch) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.Q(new ParallelRunOn(this, scheduler, prefetch));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final AbstractC5902t<T> R() {
        return S(AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final AbstractC5902t<T> S(int prefetch) {
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.S(new ParallelJoin(this, prefetch, false));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final AbstractC5902t<T> T() {
        return U(AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final AbstractC5902t<T> U(int prefetch) {
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.S(new ParallelJoin(this, prefetch, true));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final AbstractC5902t<T> V(@e Comparator<? super T> comparator) {
        return W(comparator, 16);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final AbstractC5902t<T> W(@e Comparator<? super T> comparator, int capacityHint) {
        Objects.requireNonNull(comparator, "comparator is null");
        io.reactivex.rxjava3.internal.functions.a.b(capacityHint, "capacityHint");
        return Ic.a.S(new ParallelSortedJoin(N(new Functions.C4682j((capacityHint / M()) + 1), ListAddBiConsumer.instance()).G(new io.reactivex.rxjava3.internal.util.o(comparator)), comparator));
    }

    @InterfaceC5848a(BackpressureKind.SPECIAL)
    @g("none")
    public abstract void X(@e Subscriber<? super T>[] subscribers);

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <R> R Y(@e b<T, R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.a(this);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final AbstractC5902t<List<T>> Z(@e Comparator<? super T> comparator) {
        return a0(comparator, 16);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final <C> a<C> a(@e s<? extends C> collectionSupplier, @e Bc.b<? super C, ? super T> collector) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        Objects.requireNonNull(collector, "collector is null");
        return Ic.a.Q(new ParallelCollect(this, collectionSupplier, collector));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final AbstractC5902t<List<T>> a0(@e Comparator<? super T> comparator, int capacityHint) {
        Objects.requireNonNull(comparator, "comparator is null");
        io.reactivex.rxjava3.internal.functions.a.b(capacityHint, "capacityHint");
        return Ic.a.S(N(new Functions.C4682j((capacityHint / M()) + 1), ListAddBiConsumer.instance()).G(new io.reactivex.rxjava3.internal.util.o(comparator)).O(new io.reactivex.rxjava3.internal.util.i(comparator)));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.UNBOUNDED_IN)
    @yc.c
    public final <A, R> AbstractC5902t<R> b(@e Collector<T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return Ic.a.S(new ParallelCollector(this, collector));
    }

    public final boolean b0(@e Subscriber<?>[] subscribers) {
        Objects.requireNonNull(subscribers, "subscribers is null");
        int iM = M();
        if (subscribers.length == iM) {
            return true;
        }
        StringBuilder sbA = android.support.v4.media.a.a("parallelism = ", iM, ", subscribers = ");
        sbA.append(subscribers.length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbA.toString());
        for (Subscriber<?> subscriber : subscribers) {
            EmptySubscription.error(illegalArgumentException, subscriber);
        }
        return false;
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final <U> a<U> c(@e c<T, U> composer) {
        Objects.requireNonNull(composer, "composer is null");
        return Ic.a.Q(composer.a(this));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> d(@e o<? super T, ? extends Publisher<? extends R>> mapper) {
        return e(mapper, 2);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> e(@e o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.a(this, mapper, prefetch, ErrorMode.IMMEDIATE));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> f(@e o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, boolean tillTheEnd) {
        Objects.requireNonNull(mapper, "mapper is null");
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.a(this, mapper, prefetch, tillTheEnd ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> g(@e o<? super T, ? extends Publisher<? extends R>> mapper, boolean tillTheEnd) {
        return f(mapper, 2, tillTheEnd);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> h(@e Bc.g<? super T> onAfterNext) {
        Objects.requireNonNull(onAfterNext, "onAfterNext is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, onAfterNext, gVar, aVar, aVar, gVar, Functions.f207358g, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> i(@e Bc.a onAfterTerminate) {
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, gVar, gVar, aVar, onAfterTerminate, gVar, Functions.f207358g, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> j(@e Bc.a onCancel) {
        Objects.requireNonNull(onCancel, "onCancel is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, gVar, gVar, aVar, aVar, gVar, Functions.f207358g, onCancel));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> k(@e Bc.a onComplete) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, gVar, gVar, onComplete, aVar, gVar, Functions.f207358g, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> l(@e Bc.g<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, gVar, onError, aVar, aVar, gVar, Functions.f207358g, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> m(@e Bc.g<? super T> onNext) {
        Objects.requireNonNull(onNext, "onNext is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, onNext, gVar, gVar, aVar, aVar, gVar, Functions.f207358g, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> n(@e Bc.g<? super T> onNext, @e Bc.c<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.b(this, onNext, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> o(@e Bc.g<? super T> onNext, @e ParallelFailureHandling errorHandler) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.b(this, onNext, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> p(@e q onRequest) {
        Objects.requireNonNull(onRequest, "onRequest is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, gVar, gVar, aVar, aVar, gVar, onRequest, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> q(@e Bc.g<? super Subscription> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Bc.g<Object> gVar = Functions.f207355d;
        Bc.a aVar = Functions.f207354c;
        return Ic.a.Q(new j(this, gVar, gVar, gVar, aVar, aVar, onSubscribe, Functions.f207358g, aVar));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> r(@e r<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.c(this, predicate));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> s(@e r<? super T> predicate, @e Bc.c<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new d(this, predicate, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.PASS_THROUGH)
    @yc.c
    public final a<T> t(@e r<? super T> predicate, @e ParallelFailureHandling errorHandler) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return Ic.a.Q(new d(this, predicate, errorHandler));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> u(@e o<? super T, ? extends Publisher<? extends R>> mapper) {
        return x(mapper, false, AbstractC5902t.U(), AbstractC5902t.f241350a);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> v(@e o<? super T, ? extends Publisher<? extends R>> mapper, boolean delayError) {
        return x(mapper, delayError, AbstractC5902t.U(), AbstractC5902t.f241350a);
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> w(@e o<? super T, ? extends Publisher<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        return x(mapper, delayError, maxConcurrency, AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <R> a<R> x(@e o<? super T, ? extends Publisher<? extends R>> mapper, boolean delayError, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        io.reactivex.rxjava3.internal.functions.a.b(maxConcurrency, "maxConcurrency");
        io.reactivex.rxjava3.internal.functions.a.b(prefetch, "prefetch");
        return Ic.a.Q(new io.reactivex.rxjava3.internal.operators.parallel.e(this, mapper, delayError, maxConcurrency, prefetch));
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <U> a<U> y(@e o<? super T, ? extends Iterable<? extends U>> mapper) {
        return z(mapper, AbstractC5902t.U());
    }

    @e
    @g("none")
    @InterfaceC5848a(BackpressureKind.FULL)
    @yc.c
    public final <U> a<U> z(@e o<? super T, ? extends Iterable<? extends U>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        io.reactivex.rxjava3.internal.functions.a.b(bufferSize, "bufferSize");
        return Ic.a.Q(new f(this, mapper, bufferSize));
    }
}
