package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3821z8 extends TextView {
    public C3821z8(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int lineHeight = getLineHeight() > 0 ? i11 / getLineHeight() : 0;
        if (lineHeight > 0) {
            setSingleLine(false);
            setLines(lineHeight);
        }
        if (lineHeight == 1) {
            setSingleLine();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
