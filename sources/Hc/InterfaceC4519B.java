package hc;

import nc.InterfaceC5270f;

/* JADX INFO: renamed from: hc.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4519B<T> extends InterfaceC4529i<T> {
    boolean a(@lc.e Throwable th);

    void b(@lc.f InterfaceC5270f interfaceC5270f);

    void c(@lc.f io.reactivex.disposables.b bVar);

    boolean isDisposed();

    @lc.e
    InterfaceC4519B<T> serialize();
}
