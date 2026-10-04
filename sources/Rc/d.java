package rc;

import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> extends c<T> {
    public d() {
        super(1);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f237553a == null) {
            this.f237554b = th;
        } else {
            C5666a.Y(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f237553a == null) {
            this.f237553a = t10;
            this.f237555c.cancel();
            countDown();
        }
    }
}
