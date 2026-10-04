package io.reactivex.rxjava3.internal.operators.parallel;

import Bc.o;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlattenIterable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class f<T, R> extends Hc.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hc.a<T> f211386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends Iterable<? extends R>> f211387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f211388c;

    public f(Hc.a<T> source, o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        this.f211386a = source;
        this.f211387b = mapper;
        this.f211388c = prefetch;
    }

    @Override // Hc.a
    public int M() {
        return this.f211386a.M();
    }

    @Override // Hc.a
    public void X(Subscriber<? super R>[] subscribers) {
        if (b0(subscribers)) {
            int length = subscribers.length;
            Subscriber<? super T>[] subscriberArr = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr[i10] = FlowableFlattenIterable.f9(subscribers[i10], this.f211387b, this.f211388c);
            }
            this.f211386a.X(subscriberArr);
        }
    }
}
