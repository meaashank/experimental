package zc;

/* JADX INFO: loaded from: classes7.dex */
public interface V<T> {
    void onComplete();

    void onError(@yc.e Throwable e10);

    void onNext(@yc.e T t10);

    void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10);
}
