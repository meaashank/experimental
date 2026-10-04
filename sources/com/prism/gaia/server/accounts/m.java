package com.prism.gaia.server.accounts;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return RegisteredServicesCache.a(runnable);
    }
}
