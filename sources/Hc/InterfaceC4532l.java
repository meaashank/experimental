package hc;

import nc.InterfaceC5270f;

/* JADX INFO: renamed from: hc.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4532l<T> extends InterfaceC4529i<T> {
    boolean a(@lc.e Throwable th);

    void b(@lc.f InterfaceC5270f interfaceC5270f);

    void c(@lc.f io.reactivex.disposables.b bVar);

    long g();

    boolean isCancelled();

    @lc.e
    InterfaceC4532l<T> serialize();
}
