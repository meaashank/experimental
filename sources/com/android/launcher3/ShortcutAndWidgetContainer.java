package com.android.launcher3;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.CellLayout;
import com.android.launcher3.widget.LauncherAppWidgetHostView;

/* JADX INFO: loaded from: classes2.dex */
public class ShortcutAndWidgetContainer extends ViewGroup {
    static final String TAG = "ShortcutAndWidgetContainer";
    private int mCellHeight;
    private int mCellWidth;
    private final int mContainerType;
    private int mCountX;
    private boolean mInvertIfRtl;
    private Launcher mLauncher;
    private final int[] mTmpCellXY;
    private final WallpaperManager mWallpaperManager;

    public ShortcutAndWidgetContainer(Context context, int i10) {
        super(context);
        this.mTmpCellXY = new int[2];
        this.mInvertIfRtl = false;
        this.mLauncher = Launcher.getLauncher(context);
        this.mWallpaperManager = WallpaperManager.getInstance(context);
        this.mContainerType = i10;
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).cancelLongPress();
        }
    }

    public int getCellContentHeight() {
        return Math.min(getMeasuredHeight(), this.mLauncher.getDeviceProfile().getCellHeight(this.mContainerType));
    }

    public View getChildAt(int i10, int i11) {
        int i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) childAt.getLayoutParams();
            int i14 = layoutParams.cellX;
            if (i14 <= i10 && i10 < i14 + layoutParams.cellHSpan && (i12 = layoutParams.cellY) <= i11 && i11 < i12 + layoutParams.cellVSpan) {
                return childAt;
            }
        }
        return null;
    }

    public boolean invertLayoutHorizontally() {
        return this.mInvertIfRtl && Utilities.isRtl(getResources());
    }

    public void measureChild(View view) {
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        if (view instanceof LauncherAppWidgetHostView) {
            int i10 = this.mCellWidth;
            int i11 = this.mCellHeight;
            boolean zInvertLayoutHorizontally = invertLayoutHorizontally();
            int i12 = this.mCountX;
            PointF pointF = deviceProfile.appWidgetScale;
            layoutParams.setup(i10, i11, zInvertLayoutHorizontally, i12, pointF.x, pointF.y);
        } else {
            layoutParams.setup(this.mCellWidth, this.mCellHeight, invertLayoutHorizontally(), this.mCountX);
            int iMax = (int) Math.max(0.0f, (((ViewGroup.MarginLayoutParams) layoutParams).height - getCellContentHeight()) / 2.0f);
            int i13 = this.mContainerType == 0 ? deviceProfile.workspaceCellPaddingXPx : (int) (deviceProfile.edgeMarginPx / 2.0f);
            view.setPadding(i13, iMax, i13, 0);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).width, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).height, 1073741824));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() == 0.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt instanceof LauncherAppWidgetHostView) {
                    LauncherAppWidgetHostView launcherAppWidgetHostView = (LauncherAppWidgetHostView) childAt;
                    PointF pointF = this.mLauncher.getDeviceProfile().appWidgetScale;
                    float f10 = pointF.x;
                    float f11 = pointF.y;
                    launcherAppWidgetHostView.setScaleToFit(Math.min(f10, f11));
                    float f12 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    float f13 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    launcherAppWidgetHostView.setTranslationForCentering((-(f12 - (f10 * f12))) / 2.0f, (-(f13 - (f11 * f13))) / 2.0f);
                }
                int i15 = layoutParams.f136867x;
                int i16 = layoutParams.f136868y;
                childAt.layout(i15, i16, ((ViewGroup.MarginLayoutParams) layoutParams).width + i15, ((ViewGroup.MarginLayoutParams) layoutParams).height + i16);
                if (layoutParams.dropped) {
                    layoutParams.dropped = false;
                    int[] iArr = this.mTmpCellXY;
                    getLocationOnScreen(iArr);
                    this.mWallpaperManager.sendWallpaperCommand(getWindowToken(), "android.home.drop", (((ViewGroup.MarginLayoutParams) layoutParams).width / 2) + iArr[0] + i15, (((ViewGroup.MarginLayoutParams) layoutParams).height / 2) + iArr[1] + i16, 0, null);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (view != null) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            requestRectangleOnScreen(rect);
        }
    }

    public void setCellDimensions(int i10, int i11, int i12, int i13) {
        this.mCellWidth = i10;
        this.mCellHeight = i11;
        this.mCountX = i12;
    }

    public void setInvertIfRtl(boolean z10) {
        this.mInvertIfRtl = z10;
    }

    public void setupLp(View view) {
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        if (!(view instanceof LauncherAppWidgetHostView)) {
            layoutParams.setup(this.mCellWidth, this.mCellHeight, invertLayoutHorizontally(), this.mCountX);
            return;
        }
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        int i10 = this.mCellWidth;
        int i11 = this.mCellHeight;
        boolean zInvertLayoutHorizontally = invertLayoutHorizontally();
        int i12 = this.mCountX;
        PointF pointF = deviceProfile.appWidgetScale;
        layoutParams.setup(i10, i11, zInvertLayoutHorizontally, i12, pointF.x, pointF.y);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
