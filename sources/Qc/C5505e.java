package qc;

/* JADX INFO: renamed from: qc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5505e<T> extends AbstractC5503c<T> {
    public C5505e() {
        super(1);
    }

    @Override // hc.G
    public void onError(Throwable th) {
        this.f227049a = null;
        this.f227050b = th;
        countDown();
    }

    @Override // hc.G
    public void onNext(T t10) {
        this.f227049a = t10;
    }
}
