package io.reactivex.rxjava3.parallel;

import Bc.c;

/* JADX INFO: loaded from: classes7.dex */
public enum ParallelFailureHandling implements c<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // Bc.c
    public ParallelFailureHandling apply(Long t12, Throwable t22) {
        return this;
    }
}
