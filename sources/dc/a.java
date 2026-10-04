package Dc;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements n<T>, l<T> {
    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return false;
    }

    @Override // Dc.q
    public final boolean isEmpty() {
        return true;
    }

    @Override // Dc.q
    public final boolean offer(@yc.e T value) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dc.q
    public final T poll() throws Throwable {
        return null;
    }

    @Override // Dc.m
    public final int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // Dc.q
    public final boolean offer(@yc.e T v12, @yc.e T v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long n10) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // Dc.q
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
    }
}
