package com.android.launcher3.uioverrides;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes2.dex */
public class DisplayRotationListener extends OrientationEventListener {
    private final Runnable mCallback;

    public DisplayRotationListener(Context context, Runnable runnable) {
        super(context);
        this.mCallback = runnable;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        this.mCallback.run();
    }
}
