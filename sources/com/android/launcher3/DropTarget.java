package com.android.launcher3;

import android.graphics.Rect;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.android.launcher3.dragndrop.DragOptions;
import com.android.launcher3.dragndrop.DragView;

/* JADX INFO: loaded from: classes2.dex */
public interface DropTarget {

    public static class DragObject {
        public boolean accessibleDrag;
        public DragViewStateAnnouncer stateAnnouncer;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f136870x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f136871y = -1;
        public int xOffset = -1;
        public int yOffset = -1;
        public boolean dragComplete = false;
        public DragView dragView = null;
        public ItemInfo dragInfo = null;
        public ItemInfo originalDragInfo = null;
        public DragSource dragSource = null;
        public boolean cancelled = false;
        public boolean deferDragViewCleanupPostAnimation = true;

        public final float[] getVisualCenter(float[] fArr) {
            if (fArr == null) {
                fArr = new float[2];
            }
            int i10 = this.f136870x - this.xOffset;
            int i11 = this.f136871y - this.yOffset;
            fArr[0] = (this.dragView.getDragRegion().width() / 2) + i10;
            fArr[1] = (this.dragView.getDragRegion().height() / 2) + i11;
            return fArr;
        }
    }

    boolean acceptDrop(DragObject dragObject);

    void getHitRectRelativeToDragLayer(Rect rect);

    boolean isDropEnabled();

    void onDragEnter(DragObject dragObject);

    void onDragExit(DragObject dragObject);

    void onDragOver(DragObject dragObject);

    void onDrop(DragObject dragObject, DragOptions dragOptions);

    void prepareAccessibilityDrop();
}
