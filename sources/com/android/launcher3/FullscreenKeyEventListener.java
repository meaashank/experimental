package com.android.launcher3;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class FullscreenKeyEventListener implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (i10 == 21 || i10 == 22 || i10 == 93 || i10 == 92) {
            return FocusHelper.handleIconKeyEvent(view, i10, keyEvent);
        }
        return false;
    }
}
