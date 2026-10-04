package hc;

/* JADX INFO: loaded from: classes7.dex */
public interface t<T> {
    void onComplete();

    void onError(@lc.e Throwable th);

    void onSubscribe(@lc.e io.reactivex.disposables.b bVar);

    void onSuccess(@lc.e T t10);
}
