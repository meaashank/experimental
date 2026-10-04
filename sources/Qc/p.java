package qc;

import hc.InterfaceC4524d;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class p<T> implements InterfaceC4524d, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f227105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.disposables.b f227106b;

    public p(Subscriber<? super T> subscriber) {
        this.f227105a = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f227106b.dispose();
    }

    @Override // hc.InterfaceC4524d
    public void onComplete() {
        this.f227105a.onComplete();
    }

    @Override // hc.InterfaceC4524d
    public void onError(Throwable th) {
        this.f227105a.onError(th);
    }

    @Override // hc.InterfaceC4524d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f227106b, bVar)) {
            this.f227106b = bVar;
            this.f227105a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
