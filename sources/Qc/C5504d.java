package qc;

/* JADX INFO: renamed from: qc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5504d<T> extends AbstractC5503c<T> {
    public C5504d() {
        super(1);
    }

    @Override // hc.G
    public void onError(Throwable th) {
        if (this.f227049a == null) {
            this.f227050b = th;
        }
        countDown();
    }

    @Override // hc.G
    public void onNext(T t10) {
        if (this.f227049a == null) {
            this.f227049a = t10;
            this.f227051c.dispose();
            countDown();
        }
    }
}
