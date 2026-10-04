package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import nc.o;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import tc.AbstractC5629a;

/* JADX INFO: loaded from: classes7.dex */
public final class a<T, R> extends AbstractC5629a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5629a<T> f206662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends Publisher<? extends R>> f206663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f206664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ErrorMode f206665d;

    public a(AbstractC5629a<T> abstractC5629a, o<? super T, ? extends Publisher<? extends R>> oVar, int i10, ErrorMode errorMode) {
        this.f206662a = abstractC5629a;
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        this.f206663b = oVar;
        this.f206664c = i10;
        io.reactivex.internal.functions.a.g(errorMode, "errorMode");
        this.f206665d = errorMode;
    }

    @Override // tc.AbstractC5629a
    public int F() {
        return this.f206662a.F();
    }

    @Override // tc.AbstractC5629a
    public void Q(Subscriber<? super R>[] subscriberArr) {
        if (U(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = FlowableConcatMap.F8(subscriberArr[i10], this.f206663b, this.f206664c, this.f206665d);
            }
            this.f206662a.Q(subscriberArr2);
        }
    }
}
