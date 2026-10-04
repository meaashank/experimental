package com.android.launcher3;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class CheckLongPressHelper {
    public static final int DEFAULT_LONG_PRESS_TIMEOUT = 300;
    boolean mHasPerformedLongPress;
    View.OnLongClickListener mListener;
    private int mLongPressTimeout = 300;
    private CheckForLongPress mPendingCheckForLongPress;
    View mView;

    public class CheckForLongPress implements Runnable {
        public CheckForLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CheckLongPressHelper.this.mView.getParent() == null || !CheckLongPressHelper.this.mView.hasWindowFocus()) {
                return;
            }
            CheckLongPressHelper checkLongPressHelper = CheckLongPressHelper.this;
            if (checkLongPressHelper.mHasPerformedLongPress) {
                return;
            }
            View.OnLongClickListener onLongClickListener = checkLongPressHelper.mListener;
            if (onLongClickListener != null ? onLongClickListener.onLongClick(checkLongPressHelper.mView) : checkLongPressHelper.mView.performLongClick()) {
                CheckLongPressHelper.this.mView.setPressed(false);
                CheckLongPressHelper.this.mHasPerformedLongPress = true;
            }
        }
    }

    public CheckLongPressHelper(View view) {
        this.mView = view;
    }

    public void cancelLongPress() {
        this.mHasPerformedLongPress = false;
        CheckForLongPress checkForLongPress = this.mPendingCheckForLongPress;
        if (checkForLongPress != null) {
            this.mView.removeCallbacks(checkForLongPress);
            this.mPendingCheckForLongPress = null;
        }
    }

    public boolean hasPerformedLongPress() {
        return this.mHasPerformedLongPress;
    }

    public void postCheckForLongPress() {
        this.mHasPerformedLongPress = false;
        if (this.mPendingCheckForLongPress == null) {
            this.mPendingCheckForLongPress = new CheckForLongPress();
        }
        this.mView.postDelayed(this.mPendingCheckForLongPress, this.mLongPressTimeout);
    }

    public void setLongPressTimeout(int i10) {
        this.mLongPressTimeout = i10;
    }

    public CheckLongPressHelper(View view, View.OnLongClickListener onLongClickListener) {
        this.mView = view;
        this.mListener = onLongClickListener;
    }
}
