package com.prism.gaia.server.pm;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.prism.gaia.server.pm.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C4172g {
    public static ReentrantReadWriteLock.ReadLock a(BinderC4171f binderC4171f) {
        ReentrantReadWriteLock.ReadLock lock = binderC4171f.k6().readLock();
        lock.lock();
        return lock;
    }
}
