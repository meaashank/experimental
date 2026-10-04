package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends CountDownLatch implements Bc.g<Throwable>, Bc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f211941a;

    public d() {
        super(1);
    }

    @Override // Bc.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable e10) {
        this.f211941a = e10;
        countDown();
    }

    @Override // Bc.a
    public void run() {
        countDown();
    }
}
