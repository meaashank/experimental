package zc;

/* JADX INFO: loaded from: classes7.dex */
public interface F<T> {
    void onComplete();

    void onError(@yc.e Throwable e10);

    void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10);

    void onSuccess(@yc.e T t10);
}
