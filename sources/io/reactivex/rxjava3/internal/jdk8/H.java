package io.reactivex.rxjava3.internal.jdk8;

import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class H<T, R> extends Hc.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hc.a<T> f207435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends Stream<? extends R>> f207436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207437c;

    public H(Hc.a<T> source, Bc.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        this.f207435a = source;
        this.f207436b = mapper;
        this.f207437c = prefetch;
    }

    @Override // Hc.a
    public int M() {
        return this.f207435a.M();
    }

    @Override // Hc.a
    public void X(Subscriber<? super R>[] subscribers) {
        if (b0(subscribers)) {
            int length = subscribers.length;
            Subscriber<? super T>[] subscriberArr = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr[i10] = FlowableFlatMapStream.f9(subscribers[i10], this.f207436b, this.f207437c);
            }
            this.f207435a.X(subscriberArr);
        }
    }
}
