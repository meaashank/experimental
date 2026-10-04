package zc;

/* JADX INFO: loaded from: classes7.dex */
public interface Z<T> {
    boolean a(@yc.e Throwable t10);

    void b(@yc.f Bc.f c10);

    void c(@yc.f io.reactivex.rxjava3.disposables.d d10);

    boolean isDisposed();

    void onError(@yc.e Throwable t10);

    void onSuccess(@yc.e T t10);
}
