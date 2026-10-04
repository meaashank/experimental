package io.reactivex.internal.operators.parallel;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import tc.AbstractC5629a;

/* JADX INFO: loaded from: classes7.dex */
public final class f<T> extends AbstractC5629a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher<T>[] f206702a;

    public f(Publisher<T>[] publisherArr) {
        this.f206702a = publisherArr;
    }

    @Override // tc.AbstractC5629a
    public int F() {
        return this.f206702a.length;
    }

    @Override // tc.AbstractC5629a
    public void Q(Subscriber<? super T>[] subscriberArr) {
        if (U(subscriberArr)) {
            int length = subscriberArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f206702a[i10].subscribe(subscriberArr[i10]);
            }
        }
    }
}
