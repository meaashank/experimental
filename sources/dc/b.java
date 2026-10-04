package Dc;

/* JADX INFO: loaded from: classes7.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f28039a;

    @Override // Dc.a, org.reactivestreams.Subscription
    public void cancel() {
        this.f28039a = true;
    }

    @Override // Dc.a, io.reactivex.rxjava3.disposables.d
    public void dispose() {
        this.f28039a = true;
    }

    @Override // Dc.a, io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f28039a;
    }
}
