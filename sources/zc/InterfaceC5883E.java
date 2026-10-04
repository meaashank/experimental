package zc;

/* JADX INFO: renamed from: zc.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC5883E<T> {
    boolean a(@yc.e Throwable t10);

    void b(@yc.f Bc.f c10);

    void c(@yc.f io.reactivex.rxjava3.disposables.d d10);

    boolean isDisposed();

    void onComplete();

    void onError(@yc.e Throwable t10);

    void onSuccess(@yc.e T t10);
}
