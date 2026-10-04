package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import nc.o;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import tc.AbstractC5629a;

/* JADX INFO: loaded from: classes7.dex */
public final class e<T, R> extends AbstractC5629a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5629a<T> f206697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends Publisher<? extends R>> f206698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f206699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f206700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f206701e;

    public e(AbstractC5629a<T> abstractC5629a, o<? super T, ? extends Publisher<? extends R>> oVar, boolean z10, int i10, int i11) {
        this.f206697a = abstractC5629a;
        this.f206698b = oVar;
        this.f206699c = z10;
        this.f206700d = i10;
        this.f206701e = i11;
    }

    @Override // tc.AbstractC5629a
    public int F() {
        return this.f206697a.F();
    }

    @Override // tc.AbstractC5629a
    public void Q(Subscriber<? super R>[] subscriberArr) {
        if (U(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableFlatMap.F8(subscriberArr[i10], this.f206698b, this.f206699c, this.f206700d, this.f206701e);
            }
            this.f206697a.Q(subscriberArr2);
        }
    }
}
