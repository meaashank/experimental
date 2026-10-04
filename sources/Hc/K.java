package hc;

import nc.InterfaceC5270f;

/* JADX INFO: loaded from: classes7.dex */
public interface K<T> {
    boolean a(@lc.e Throwable th);

    void b(@lc.f InterfaceC5270f interfaceC5270f);

    void c(@lc.f io.reactivex.disposables.b bVar);

    boolean isDisposed();

    void onError(@lc.e Throwable th);

    void onSuccess(@lc.e T t10);
}
