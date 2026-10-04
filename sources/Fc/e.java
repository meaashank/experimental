package Fc;

/* JADX INFO: loaded from: classes7.dex */
public final class e<T> extends c<T> {
    public e() {
        super(1);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        this.f39915a = null;
        this.f39916b = t10;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f39915a = t10;
    }
}
