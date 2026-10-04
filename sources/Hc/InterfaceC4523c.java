package hc;

import nc.InterfaceC5270f;

/* JADX INFO: renamed from: hc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4523c {
    boolean a(@lc.e Throwable th);

    void b(@lc.f InterfaceC5270f interfaceC5270f);

    void c(@lc.f io.reactivex.disposables.b bVar);

    boolean isDisposed();

    void onComplete();

    void onError(@lc.e Throwable th);
}
