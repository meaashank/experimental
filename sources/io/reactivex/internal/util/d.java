package io.reactivex.internal.util;

import java.util.concurrent.CountDownLatch;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends CountDownLatch implements InterfaceC5271g<Throwable>, InterfaceC5265a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f207192a;

    public d() {
        super(1);
    }

    @Override // nc.InterfaceC5271g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        this.f207192a = th;
        countDown();
    }

    @Override // nc.InterfaceC5265a
    public void run() {
        countDown();
    }
}
