package io.reactivex.rxjava3.internal.operators.parallel;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class g<T> extends Hc.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher<T>[] f211389a;

    public g(Publisher<T>[] sources) {
        this.f211389a = sources;
    }

    @Override // Hc.a
    public int M() {
        return this.f211389a.length;
    }

    @Override // Hc.a
    public void X(Subscriber<? super T>[] subscribers) {
        if (b0(subscribers)) {
            int length = subscribers.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f211389a[i10].subscribe(subscribers[i10]);
            }
        }
    }
}
