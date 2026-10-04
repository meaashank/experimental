package io.reactivex.parallel;

import nc.InterfaceC5267c;

/* JADX INFO: loaded from: classes7.dex */
public enum ParallelFailureHandling implements InterfaceC5267c<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // nc.InterfaceC5267c
    public ParallelFailureHandling apply(Long l10, Throwable th) {
        return this;
    }
}
