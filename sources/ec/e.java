package Ec;

/* JADX INFO: loaded from: classes7.dex */
public final class e<T> extends c<T> {
    public e() {
        super(1);
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        if (this.f33812a == null) {
            this.f33813b = t10;
        }
        countDown();
    }

    @Override // zc.V
    public void onNext(T t10) {
        if (this.f33812a == null) {
            this.f33812a = t10;
            this.f33814c.dispose();
            countDown();
        }
    }
}
