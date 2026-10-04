package com.android.launcher3.extension;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import com.android.launcher3.BubbleTextView;

/* JADX INFO: loaded from: classes2.dex */
public interface BubbleTextViewExtension {
    void afterApplyFromAppInfo(BubbleTextView bubbleTextView);

    void onDrawBadge(BubbleTextView bubbleTextView, Canvas canvas, Rect rect, Point point);
}
