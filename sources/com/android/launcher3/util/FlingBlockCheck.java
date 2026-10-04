package com.android.launcher3.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class FlingBlockCheck {
    private static final long UNBLOCK_FLING_PAUSE_DURATION = 200;
    private boolean mBlockFling;
    private long mBlockFlingTime;

    public void blockFling() {
        this.mBlockFling = true;
        this.mBlockFlingTime = SystemClock.uptimeMillis();
    }

    public boolean isBlocked() {
        return this.mBlockFling;
    }

    public void onEvent() {
        if (SystemClock.uptimeMillis() - this.mBlockFlingTime >= 200) {
            this.mBlockFling = false;
        }
    }

    public void unblockFling() {
        this.mBlockFling = false;
        this.mBlockFlingTime = 0L;
    }
}
