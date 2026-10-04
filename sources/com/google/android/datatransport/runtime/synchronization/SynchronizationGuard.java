package com.google.android.datatransport.runtime.synchronization;

import e.g0;

/* JADX INFO: loaded from: classes3.dex */
@g0
public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        T execute();
    }

    <T> T runCriticalSection(CriticalSection<T> criticalSection);
}
