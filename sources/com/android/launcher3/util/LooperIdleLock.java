package com.android.launcher3.util;

import android.os.Looper;
import android.os.MessageQueue;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public class LooperIdleLock implements MessageQueue.IdleHandler, Runnable {
    private boolean mIsLocked = true;
    private final Object mLock;

    public LooperIdleLock(Object obj, Looper looper) {
        this.mLock = obj;
        if (Utilities.ATLEAST_MARSHMALLOW) {
            looper.getQueue().addIdleHandler(this);
        } else {
            new LooperExecutor(looper).execute(this);
        }
    }

    public boolean awaitLocked(long j10) {
        if (this.mIsLocked) {
            try {
                this.mLock.wait(j10);
            } catch (InterruptedException unused) {
            }
        }
        return this.mIsLocked;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        synchronized (this.mLock) {
            this.mIsLocked = false;
            this.mLock.notify();
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.myQueue().addIdleHandler(this);
    }
}
