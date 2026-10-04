package com.google.android.gms.common.api.internal;

import e.g0;

/* JADX INFO: loaded from: classes3.dex */
abstract class zaav implements Runnable {
    final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    @g0
    public final void run() {
        this.zab.zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e10) {
                this.zab.zaa.zam(e10);
            }
        } finally {
            this.zab.zab.unlock();
        }
    }

    @g0
    public abstract void zaa();
}
