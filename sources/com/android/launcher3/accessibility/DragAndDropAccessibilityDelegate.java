package com.android.launcher3.accessibility;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.a;
import com.android.launcher3.CellLayout;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.app.hider.master.promax.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DragAndDropAccessibilityDelegate extends a implements View.OnClickListener {
    protected static final int INVALID_POSITION = -1;
    private static final int[] sTempArray = new int[2];
    protected final Context mContext;
    protected final LauncherAccessibilityDelegate mDelegate;
    private final Rect mTempRect;
    protected final CellLayout mView;

    public DragAndDropAccessibilityDelegate(CellLayout cellLayout) {
        super(cellLayout);
        this.mTempRect = new Rect();
        this.mView = cellLayout;
        Context context = cellLayout.getContext();
        this.mContext = context;
        this.mDelegate = Launcher.getLauncher(context).getAccessibilityDelegate();
    }

    private Rect getItemBounds(int i10) {
        int countX = i10 % this.mView.getCountX();
        int countX2 = i10 / this.mView.getCountX();
        LauncherAccessibilityDelegate.DragInfo dragInfo = this.mDelegate.getDragInfo();
        CellLayout cellLayout = this.mView;
        ItemInfo itemInfo = dragInfo.info;
        cellLayout.cellToRect(countX, countX2, itemInfo.spanX, itemInfo.spanY, this.mTempRect);
        return this.mTempRect;
    }

    public abstract String getConfirmationForIconDrop(int i10);

    public abstract String getLocationDescriptionForIconDrop(int i10);

    @Override // androidx.customview.widget.a
    public int getVirtualViewAt(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f || f10 > this.mView.getMeasuredWidth() || f11 > this.mView.getMeasuredHeight()) {
            return Integer.MIN_VALUE;
        }
        int[] iArr = sTempArray;
        this.mView.pointToCellExact((int) f10, (int) f11, iArr);
        return intersectsValidDropTarget((this.mView.getCountX() * iArr[1]) + iArr[0]);
    }

    @Override // androidx.customview.widget.a
    public void getVisibleVirtualViews(List<Integer> list) {
        int countY = this.mView.getCountY() * this.mView.getCountX();
        for (int i10 = 0; i10 < countY; i10++) {
            if (intersectsValidDropTarget(i10) == i10) {
                list.add(Integer.valueOf(i10));
            }
        }
    }

    public abstract int intersectsValidDropTarget(int i10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        onPerformActionForVirtualView(getFocusedVirtualView(), 16, null);
    }

    @Override // androidx.customview.widget.a
    public boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
        if (i11 != 16 || i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.mDelegate.handleAccessibleDrop(this.mView, getItemBounds(i10), getConfirmationForIconDrop(i10));
        return true;
    }

    @Override // androidx.customview.widget.a
    public void onPopulateEventForVirtualView(int i10, AccessibilityEvent accessibilityEvent) {
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityEvent.setContentDescription(this.mContext.getString(R.string.action_move_here));
    }

    @Override // androidx.customview.widget.a
    public void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityNodeInfoCompat.o1(getLocationDescriptionForIconDrop(i10));
        accessibilityNodeInfoCompat.d1(getItemBounds(i10));
        accessibilityNodeInfoCompat.a(16);
        accessibilityNodeInfoCompat.k1(true);
        accessibilityNodeInfoCompat.w1(true);
    }
}
