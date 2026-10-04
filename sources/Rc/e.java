package rc;

/* JADX INFO: loaded from: classes7.dex */
public final class e<T> extends c<T> {
    public e() {
        super(1);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f237553a = null;
        this.f237554b = th;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f237553a = t10;
    }
}
