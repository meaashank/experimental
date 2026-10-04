package com.android.launcher3.widget;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.launcher3.DropTarget;
import com.android.launcher3.Insettable;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.Utilities;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.model.WidgetItem;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.util.PackageUserKey;
import com.android.launcher3.views.AbstractSlideInView;
import com.app.hider.master.promax.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetsBottomSheet extends BaseWidgetSheet implements Insettable {
    private static final int DEFAULT_CLOSE_DURATION = 200;
    private Rect mInsets;
    private ItemInfo mOriginalItemInfo;

    public WidgetsBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void addDivider(ViewGroup viewGroup) {
        LayoutInflater.from(getContext()).inflate(R.layout.widget_list_divider, viewGroup, true);
    }

    private WidgetCell addItemCell(ViewGroup viewGroup) {
        WidgetCell widgetCell = (WidgetCell) LayoutInflater.from(getContext()).inflate(R.layout.widget_cell, viewGroup, false);
        widgetCell.setOnClickListener(this);
        widgetCell.setOnLongClickListener(this);
        widgetCell.setAnimatePreview(false);
        viewGroup.addView(widgetCell);
        return widgetCell;
    }

    private void animateOpen() {
        if (this.mIsOpen || this.mOpenCloseAnimator.isRunning()) {
            return;
        }
        this.mIsOpen = true;
        setupNavBarColor();
        this.mOpenCloseAnimator.setValues(PropertyValuesHolder.ofFloat(AbstractSlideInView.TRANSLATION_SHIFT, 0.0f));
        this.mOpenCloseAnimator.setInterpolator(Interpolators.FAST_OUT_SLOW_IN);
        this.mOpenCloseAnimator.start();
    }

    @Override // com.android.launcher3.widget.BaseWidgetSheet, com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public /* bridge */ /* synthetic */ void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        super.fillInLogContainerData(view, itemInfo, target, target2);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public Pair<View, String> getAccessibilityTarget() {
        return Pair.create(findViewById(R.id.title), getContext().getString(this.mIsOpen ? R.string.widgets_list : R.string.widgets_list_closed));
    }

    @Override // com.android.launcher3.widget.BaseWidgetSheet
    public int getElementsRowCount() {
        return 1;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void handleClose(boolean z10) {
        handleClose(z10, 200L);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public boolean isOfType(int i10) {
        return (i10 & 4) != 0;
    }

    @Override // com.android.launcher3.widget.BaseWidgetSheet, com.android.launcher3.DragSource
    public /* bridge */ /* synthetic */ void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z10) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationShift(this.mTranslationShift);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void onWidgetsBound() {
        ArrayList arrayList;
        List<WidgetItem> widgetsForPackageUser = this.mLauncher.getPopupDataProvider().getWidgetsForPackageUser(new PackageUserKey(this.mOriginalItemInfo.getTargetComponent().getPackageName(), this.mOriginalItemInfo.user));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.widgets);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.widgets_cell_list);
        viewGroup2.removeAllViews();
        int i10 = 0;
        while (true) {
            arrayList = (ArrayList) widgetsForPackageUser;
            if (i10 >= arrayList.size()) {
                break;
            }
            WidgetCell widgetCellAddItemCell = addItemCell(viewGroup2);
            widgetCellAddItemCell.applyFromCellItem((WidgetItem) arrayList.get(i10), LauncherAppState.getInstance(this.mLauncher).getWidgetCache());
            widgetCellAddItemCell.ensurePreview();
            widgetCellAddItemCell.setVisibility(0);
            if (i10 < arrayList.size() - 1) {
                addDivider(viewGroup2);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).gravity = 1;
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.widget_list_divider, viewGroup, false);
        viewInflate.getLayoutParams().width = Utilities.pxFromDp(16.0f, getResources().getDisplayMetrics());
        viewGroup2.addView(viewInflate, 0);
    }

    public void populateAndShow(ItemInfo itemInfo) {
        this.mOriginalItemInfo = itemInfo;
        ((TextView) findViewById(R.id.title)).setText(getContext().getString(R.string.widgets_bottom_sheet_title, this.mOriginalItemInfo.title));
        onWidgetsBound();
        this.mLauncher.getDragLayer().addView(this);
        this.mIsOpen = false;
        animateOpen();
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.mInsets;
        int i11 = i10 - rect2.left;
        int i12 = rect.right - rect2.right;
        int i13 = rect.bottom - rect2.bottom;
        rect2.set(rect);
        setPadding(getPaddingLeft() + i11, getPaddingTop(), getPaddingRight() + i12, getPaddingBottom() + i13);
    }

    public WidgetsBottomSheet(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setWillNotDraw(false);
        this.mInsets = new Rect();
        this.mContent = this;
    }
}
