package com.android.launcher3;

import android.appwidget.AppWidgetHostView;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.compose.ui.graphics.J2;
import com.android.launcher3.badge.BadgeRenderer;
import com.android.launcher3.graphics.IconNormalizer;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceProfile {
    private static final float MAX_HORIZONTAL_PADDING_PERCENT = 0.14f;
    private static final float MAX_WORKSPACE_PITCH_FACTOR = 2.0f;
    private static final float TALL_DEVICE_ASPECT_RATIO_THRESHOLD = 2.0f;
    public int allAppsCellHeightPx;
    public int allAppsIconDrawablePaddingPx;
    public int allAppsIconSizePx;
    public float allAppsIconTextSizePx;
    public final int availableHeightPx;
    public final int availableWidthPx;
    public int cellHeightPx;
    public final int cellLayoutBottomPaddingPx;
    public final int cellLayoutPaddingLeftRightPx;
    public int cellWidthPx;
    public final int defaultPageSpacingPx;
    public final Rect defaultWidgetPadding;
    public final int desiredWorkspaceLeftRightMarginPx;
    public int dropTargetBarSizePx;
    public final int edgeMarginPx;
    public int folderCellHeightPx;
    public int folderCellWidthPx;
    public int folderChildDrawablePaddingPx;
    public int folderChildIconSizePx;
    public int folderChildTextSizePx;
    public int folderIconOffsetYPx;
    public int folderIconSizePx;
    public final int heightPx;
    public final int hotseatBarBottomPaddingPx;
    public final int hotseatBarSidePaddingPx;
    public int hotseatBarSizePx;
    public final int hotseatBarTopPaddingPx;
    public int hotseatCellHeightPx;
    public int iconDrawablePaddingOriginalPx;
    public int iconDrawablePaddingPx;
    public int iconSizePx;
    public int iconTextSizePx;
    public final InvariantDeviceProfile inv;
    public final boolean isLandscape;
    public final boolean isLargeTablet;
    public final boolean isMultiWindowMode;
    public final boolean isPhone;
    public final boolean isTablet;
    public BadgeRenderer mBadgeRenderer;
    private boolean mIsSeascape;
    private final int topWorkspacePadding;
    public final boolean transposeLayoutWithOrientation;
    public final int verticalDragHandleSizePx;
    public final int widthPx;
    public int workspaceCellPaddingXPx;
    public float workspaceSpringLoadShrinkFactor;
    public final int workspaceSpringLoadedBottomSpace;
    public final PointF appWidgetScale = new PointF(1.0f, 1.0f);
    private final Rect mInsets = new Rect();
    public final Rect workspacePadding = new Rect();
    private final Rect mHotseatPadding = new Rect();

    public interface OnDeviceProfileChangeListener {
        void onDeviceProfileChanged(DeviceProfile deviceProfile);
    }

    public DeviceProfile(Context context, InvariantDeviceProfile invariantDeviceProfile, Point point, Point point2, int i10, int i11, boolean z10, boolean z11) {
        this.inv = invariantDeviceProfile;
        this.isLandscape = z10;
        this.isMultiWindowMode = z11;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        boolean z12 = resources.getBoolean(com.app.hider.master.promax.R.bool.is_tablet);
        this.isTablet = z12;
        boolean z13 = resources.getBoolean(com.app.hider.master.promax.R.bool.is_large_tablet);
        this.isLargeTablet = z13;
        boolean z14 = (z12 || z13) ? false : true;
        this.isPhone = z14;
        this.transposeLayoutWithOrientation = resources.getBoolean(com.app.hider.master.promax.R.bool.hotseat_transpose_layout_with_orientation);
        Context context2 = getContext(context, isVerticalBarLayout() ? 2 : 1);
        Resources resources2 = context2.getResources();
        this.defaultWidgetPadding = AppWidgetHostView.getDefaultPaddingForWidget(context2, new ComponentName(context2.getPackageName(), getClass().getName()), null);
        int dimensionPixelSize = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_edge_margin);
        this.edgeMarginPx = dimensionPixelSize;
        this.desiredWorkspaceLeftRightMarginPx = isVerticalBarLayout() ? 0 : dimensionPixelSize;
        this.cellLayoutPaddingLeftRightPx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_cell_layout_padding);
        this.cellLayoutBottomPaddingPx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_cell_layout_bottom_padding);
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.vertical_drag_handle_size);
        this.verticalDragHandleSizePx = dimensionPixelSize2;
        this.defaultPageSpacingPx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_workspace_page_spacing);
        this.topWorkspacePadding = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_workspace_top_padding);
        this.iconDrawablePaddingOriginalPx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_icon_drawable_padding);
        this.dropTargetBarSizePx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_drop_target_size);
        this.workspaceSpringLoadedBottomSpace = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_min_spring_loaded_space);
        this.workspaceCellPaddingXPx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_cell_padding_x);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_hotseat_top_padding);
        this.hotseatBarTopPaddingPx = dimensionPixelSize3;
        int dimensionPixelSize4 = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_hotseat_bottom_padding);
        this.hotseatBarBottomPaddingPx = dimensionPixelSize4;
        this.hotseatBarSidePaddingPx = resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_hotseat_side_padding);
        this.hotseatBarSizePx = isVerticalBarLayout() ? Utilities.pxFromDp(invariantDeviceProfile.iconSize, displayMetrics) : resources2.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.dynamic_grid_hotseat_size) + dimensionPixelSize3 + dimensionPixelSize4;
        this.widthPx = i10;
        this.heightPx = i11;
        if (z10) {
            this.availableWidthPx = point2.x;
            this.availableHeightPx = point.y;
        } else {
            this.availableWidthPx = point.x;
            this.availableHeightPx = point2.y;
        }
        updateAvailableDimensions(displayMetrics, resources2);
        boolean z15 = Float.compare(((float) Math.max(i10, i11)) / ((float) Math.min(i10, i11)), 2.0f) >= 0;
        if (!isVerticalBarLayout() && z14 && z15) {
            this.hotseatBarSizePx = (((getCellSize().y - this.iconSizePx) - this.iconDrawablePaddingPx) - dimensionPixelSize2) + this.hotseatBarSizePx;
            updateAvailableDimensions(displayMetrics, resources2);
        }
        updateWorkspacePadding();
        this.mBadgeRenderer = new BadgeRenderer(this.iconSizePx);
    }

    private void adjustToHideWorkspaceLabels() {
        this.iconTextSizePx = 0;
        this.iconDrawablePaddingPx = 0;
        this.cellHeightPx = this.iconSizePx;
        this.allAppsCellHeightPx = (this.allAppsIconDrawablePaddingPx * (isVerticalBarLayout() ? 2 : 1) * 2) + Utilities.calculateTextHeight(this.allAppsIconTextSizePx) + this.allAppsIconSizePx + this.allAppsIconDrawablePaddingPx;
    }

    public static int calculateCellHeight(int i10, int i11) {
        return i10 / i11;
    }

    public static int calculateCellWidth(int i10, int i11) {
        return i10 / i11;
    }

    private static Context getContext(Context context, int i10) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.orientation = i10;
        return context.createConfigurationContext(configuration);
    }

    private void updateAvailableDimensions(DisplayMetrics displayMetrics, Resources resources) {
        updateIconSize(1.0f, resources, displayMetrics);
        float f10 = this.cellHeightPx * this.inv.numRows;
        float f11 = this.availableHeightPx - getTotalWorkspacePadding().y;
        if (f10 > f11) {
            updateIconSize(f11 / f10, resources, displayMetrics);
        }
        updateAvailableFolderCellDimensions(displayMetrics, resources);
    }

    private void updateAvailableFolderCellDimensions(DisplayMetrics displayMetrics, Resources resources) {
        int iCalculateTextHeight = Utilities.calculateTextHeight(resources.getDimension(com.app.hider.master.promax.R.dimen.folder_label_text_size)) + resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.folder_label_padding_bottom) + resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.folder_label_padding_top);
        updateFolderCellSize(1.0f, displayMetrics, resources);
        int i10 = this.edgeMarginPx;
        Point totalWorkspacePadding = getTotalWorkspacePadding();
        int i11 = this.folderCellHeightPx;
        InvariantDeviceProfile invariantDeviceProfile = this.inv;
        float fMin = Math.min(((this.availableWidthPx - totalWorkspacePadding.x) - i10) / (this.folderCellWidthPx * invariantDeviceProfile.numFolderColumns), ((this.availableHeightPx - totalWorkspacePadding.y) - i10) / ((i11 * invariantDeviceProfile.numFolderRows) + iCalculateTextHeight));
        if (fMin < 1.0f) {
            updateFolderCellSize(fMin, displayMetrics, resources);
        }
    }

    private void updateFolderCellSize(float f10, DisplayMetrics displayMetrics, Resources resources) {
        this.folderChildIconSizePx = (int) (Utilities.pxFromDp(this.inv.iconSize, displayMetrics) * f10);
        int dimensionPixelSize = (int) (resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.folder_child_text_size) * f10);
        this.folderChildTextSizePx = dimensionPixelSize;
        int iCalculateTextHeight = Utilities.calculateTextHeight(dimensionPixelSize);
        int dimensionPixelSize2 = (int) (resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.folder_cell_x_padding) * f10);
        int dimensionPixelSize3 = (int) (resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.folder_cell_y_padding) * f10);
        int i10 = this.folderChildIconSizePx;
        this.folderCellWidthPx = (dimensionPixelSize2 * 2) + i10;
        int iA = J2.a(dimensionPixelSize3, 2, i10, iCalculateTextHeight);
        this.folderCellHeightPx = iA;
        this.folderChildDrawablePaddingPx = Math.max(0, ((iA - i10) - iCalculateTextHeight) / 3);
    }

    private void updateIconSize(float f10, Resources resources, DisplayMetrics displayMetrics) {
        boolean zIsVerticalBarLayout = isVerticalBarLayout();
        InvariantDeviceProfile invariantDeviceProfile = this.inv;
        this.iconSizePx = (int) (Utilities.pxFromDp(zIsVerticalBarLayout ? invariantDeviceProfile.landscapeIconSize : invariantDeviceProfile.iconSize, displayMetrics) * f10);
        int iPxFromSp = (int) (Utilities.pxFromSp(this.inv.iconTextSize, displayMetrics) * f10);
        this.iconTextSizePx = iPxFromSp;
        int i10 = (int) (this.iconDrawablePaddingOriginalPx * f10);
        this.iconDrawablePaddingPx = i10;
        this.cellHeightPx = Utilities.calculateTextHeight(iPxFromSp) + this.iconSizePx + i10;
        int i11 = getCellSize().y;
        int i12 = this.cellHeightPx;
        int i13 = (i11 - i12) / 2;
        int i14 = this.iconDrawablePaddingPx;
        if (i14 > i13 && !zIsVerticalBarLayout && !this.isMultiWindowMode) {
            this.cellHeightPx = i12 - (i14 - i13);
            this.iconDrawablePaddingPx = i13;
        }
        int i15 = this.iconSizePx;
        int i16 = this.iconDrawablePaddingPx;
        this.cellWidthPx = i15 + i16;
        this.allAppsIconTextSizePx = this.iconTextSizePx;
        this.allAppsIconSizePx = i15;
        this.allAppsIconDrawablePaddingPx = i16;
        this.allAppsCellHeightPx = getCellSize().y;
        if (zIsVerticalBarLayout) {
            adjustToHideWorkspaceLabels();
        }
        if (zIsVerticalBarLayout) {
            this.hotseatBarSizePx = this.iconSizePx;
        }
        this.hotseatCellHeightPx = this.iconSizePx;
        if (zIsVerticalBarLayout) {
            this.workspaceSpringLoadShrinkFactor = resources.getInteger(com.app.hider.master.promax.R.integer.config_workspaceSpringLoadShrinkPercentage) / 100.0f;
        } else {
            this.workspaceSpringLoadShrinkFactor = Math.min(resources.getInteger(com.app.hider.master.promax.R.integer.config_workspaceSpringLoadShrinkPercentage) / 100.0f, 1.0f - ((this.dropTargetBarSizePx + this.workspaceSpringLoadedBottomSpace) / (((this.availableHeightPx - this.hotseatBarSizePx) - this.verticalDragHandleSizePx) - this.topWorkspacePadding)));
        }
        int normalizedCircleSize = IconNormalizer.getNormalizedCircleSize(this.iconSizePx);
        this.folderIconSizePx = normalizedCircleSize;
        this.folderIconOffsetYPx = (this.iconSizePx - normalizedCircleSize) / 2;
    }

    private void updateWorkspacePadding() {
        Rect rect = this.workspacePadding;
        if (isVerticalBarLayout()) {
            rect.top = 0;
            rect.bottom = this.edgeMarginPx;
            int i10 = this.hotseatBarSidePaddingPx;
            rect.left = i10;
            rect.right = i10;
            if (isSeascape()) {
                rect.left += this.hotseatBarSizePx;
                rect.right += this.verticalDragHandleSizePx;
                return;
            } else {
                rect.left += this.verticalDragHandleSizePx;
                rect.right += this.hotseatBarSizePx;
                return;
            }
        }
        int i11 = this.hotseatBarSizePx + this.verticalDragHandleSizePx;
        if (this.isTablet) {
            int i12 = this.widthPx;
            int i13 = this.inv.numColumns;
            int i14 = this.cellWidthPx;
            int iMin = ((int) Math.min(Math.max(0, i12 - (((i13 - 1) * i14) + (i13 * i14))), this.widthPx * MAX_HORIZONTAL_PADDING_PERCENT)) / 2;
            int iMax = Math.max(0, ((((this.heightPx - this.topWorkspacePadding) - i11) - ((this.inv.numRows * 2) * this.cellHeightPx)) - this.hotseatBarTopPaddingPx) - this.hotseatBarBottomPaddingPx) / 2;
            rect.set(iMin, this.topWorkspacePadding + iMax, iMin, i11 + iMax);
        } else {
            int i15 = this.desiredWorkspaceLeftRightMarginPx;
            rect.set(i15, this.topWorkspacePadding, i15, i11);
        }
        int i16 = this.availableWidthPx;
        int i17 = rect.left;
        int i18 = rect.right;
        int i19 = (i16 - i17) - i18;
        int i20 = (int) (this.inv.numColumns * this.cellWidthPx * 2.0f);
        if (i20 <= 0 || i19 <= i20) {
            return;
        }
        int i21 = (i19 - i20) / 2;
        rect.left = i17 + i21;
        rect.right = i18 + i21;
    }

    public DeviceProfile copy(Context context) {
        Point point = new Point(this.availableWidthPx, this.availableHeightPx);
        return new DeviceProfile(context, this.inv, point, point, this.widthPx, this.heightPx, this.isLandscape, this.isMultiWindowMode);
    }

    public Rect getAbsoluteOpenFolderBounds() {
        if (!isVerticalBarLayout()) {
            Rect rect = this.mInsets;
            int i10 = rect.left;
            int i11 = this.edgeMarginPx;
            int i12 = rect.top;
            return new Rect(i10 + i11, this.dropTargetBarSizePx + i12 + i11, (i10 + this.availableWidthPx) - i11, (((i12 + this.availableHeightPx) - this.hotseatBarSizePx) - this.verticalDragHandleSizePx) - i11);
        }
        Rect rect2 = this.mInsets;
        int i13 = rect2.left;
        int i14 = this.dropTargetBarSizePx + i13;
        int i15 = this.edgeMarginPx;
        int i16 = rect2.top;
        return new Rect(i14 + i15, i16, ((i13 + this.availableWidthPx) - this.hotseatBarSizePx) - i15, this.availableHeightPx + i16);
    }

    public int getCellHeight(int i10) {
        if (i10 == 0) {
            return this.cellHeightPx;
        }
        if (i10 == 1) {
            return this.hotseatCellHeightPx;
        }
        if (i10 != 2) {
            return 0;
        }
        return this.folderCellHeightPx;
    }

    public Point getCellSize() {
        Point point = new Point();
        Point totalWorkspacePadding = getTotalWorkspacePadding();
        int i10 = (this.availableWidthPx - totalWorkspacePadding.x) - (this.cellLayoutPaddingLeftRightPx * 2);
        InvariantDeviceProfile invariantDeviceProfile = this.inv;
        point.x = i10 / invariantDeviceProfile.numColumns;
        point.y = ((this.availableHeightPx - totalWorkspacePadding.y) - this.cellLayoutBottomPaddingPx) / invariantDeviceProfile.numRows;
        return point;
    }

    public DeviceProfile getFullScreenProfile() {
        return this.isLandscape ? this.inv.landscapeProfile : this.inv.portraitProfile;
    }

    public Rect getHotseatLayoutPadding() {
        if (!isVerticalBarLayout()) {
            float f10 = this.widthPx;
            InvariantDeviceProfile invariantDeviceProfile = this.inv;
            int iRound = Math.round(((f10 / invariantDeviceProfile.numColumns) - (f10 / invariantDeviceProfile.numHotseatIcons)) / 2.0f);
            Rect rect = this.mHotseatPadding;
            Rect rect2 = this.workspacePadding;
            int i10 = rect2.left + iRound;
            int i11 = this.cellLayoutPaddingLeftRightPx;
            rect.set(i10 + i11, this.hotseatBarTopPaddingPx, iRound + rect2.right + i11, this.hotseatBarBottomPaddingPx + this.mInsets.bottom + this.cellLayoutBottomPaddingPx);
        } else if (isSeascape()) {
            Rect rect3 = this.mHotseatPadding;
            Rect rect4 = this.mInsets;
            rect3.set(rect4.left, rect4.top, this.hotseatBarSidePaddingPx, rect4.bottom);
        } else {
            Rect rect5 = this.mHotseatPadding;
            int i12 = this.hotseatBarSidePaddingPx;
            Rect rect6 = this.mInsets;
            rect5.set(i12, rect6.top, rect6.right, rect6.bottom);
        }
        return this.mHotseatPadding;
    }

    public Rect getInsets() {
        return this.mInsets;
    }

    public DeviceProfile getMultiWindowProfile(Context context, Point point) {
        point.set(Math.min(this.availableWidthPx, point.x), Math.min(this.availableHeightPx, point.y));
        DeviceProfile deviceProfile = new DeviceProfile(context, this.inv, point, point, point.x, point.y, this.isLandscape, true);
        if (((deviceProfile.getCellSize().y - deviceProfile.iconSizePx) - this.iconDrawablePaddingPx) - deviceProfile.iconTextSizePx < deviceProfile.iconDrawablePaddingPx * 2) {
            deviceProfile.adjustToHideWorkspaceLabels();
        }
        deviceProfile.appWidgetScale.set(deviceProfile.getCellSize().x / getCellSize().x, deviceProfile.getCellSize().y / getCellSize().y);
        deviceProfile.updateWorkspacePadding();
        return deviceProfile;
    }

    public Point getTotalWorkspacePadding() {
        updateWorkspacePadding();
        Rect rect = this.workspacePadding;
        return new Point(rect.left + rect.right, rect.top + rect.bottom);
    }

    public boolean isSeascape() {
        return isVerticalBarLayout() && this.mIsSeascape;
    }

    public boolean isVerticalBarLayout() {
        return this.isLandscape && this.transposeLayoutWithOrientation;
    }

    public boolean shouldFadeAdjacentWorkspaceScreens() {
        return isVerticalBarLayout() || this.isLargeTablet;
    }

    public void updateInsets(Rect rect) {
        this.mInsets.set(rect);
        updateWorkspacePadding();
    }

    public boolean updateIsSeascape(WindowManager windowManager) {
        if (isVerticalBarLayout()) {
            boolean z10 = windowManager.getDefaultDisplay().getRotation() == 3;
            if (this.mIsSeascape != z10) {
                this.mIsSeascape = z10;
                return true;
            }
        }
        return false;
    }
}
