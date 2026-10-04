package hc;

/* JADX INFO: loaded from: classes7.dex */
public interface L<T> {
    void onError(@lc.e Throwable th);

    void onSubscribe(@lc.e io.reactivex.disposables.b bVar);

    void onSuccess(@lc.e T t10);
}
