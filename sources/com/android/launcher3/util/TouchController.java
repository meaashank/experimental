package com.android.launcher3.util;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface TouchController {
    boolean onControllerInterceptTouchEvent(MotionEvent motionEvent);

    boolean onControllerTouchEvent(MotionEvent motionEvent);
}
