package hc;

/* JADX INFO: loaded from: classes7.dex */
public interface G<T> {
    void onComplete();

    void onError(@lc.e Throwable th);

    void onNext(@lc.e T t10);

    void onSubscribe(@lc.e io.reactivex.disposables.b bVar);
}
