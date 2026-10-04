package com.android.launcher3;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class HotseatIconKeyEventListener implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return FocusHelper.handleHotseatButtonKeyEvent(view, i10, keyEvent);
    }
}
