package io.reactivex.rxjava3.internal.operators.parallel;

import Bc.o;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class a<T, R> extends Hc.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hc.a<T> f211346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends Publisher<? extends R>> f211347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f211348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ErrorMode f211349d;

    public a(Hc.a<T> source, o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, ErrorMode errorMode) {
        this.f211346a = source;
        Objects.requireNonNull(mapper, "mapper");
        this.f211347b = mapper;
        this.f211348c = prefetch;
        Objects.requireNonNull(errorMode, "errorMode");
        this.f211349d = errorMode;
    }

    @Override // Hc.a
    public int M() {
        return this.f211346a.M();
    }

    @Override // Hc.a
    public void X(Subscriber<? super R>[] subscribers) {
        if (b0(subscribers)) {
            int length = subscribers.length;
            Subscriber<? super T>[] subscriberArr = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr[i10] = FlowableConcatMap.f9(subscribers[i10], this.f211347b, this.f211348c, this.f211349d);
            }
            this.f211346a.X(subscriberArr);
        }
    }
}
