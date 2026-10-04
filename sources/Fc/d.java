package Fc;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> extends c<T> {
    public d() {
        super(1);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        if (this.f39915a == null) {
            this.f39916b = t10;
        } else {
            Ic.a.Y(t10);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f39915a == null) {
            this.f39915a = t10;
            this.f39917c.cancel();
            countDown();
        }
    }
}
