package com.android.launcher3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.logging.UserEventDispatcher;
import com.android.launcher3.userevent.nano.LauncherLogProto;

/* JADX INFO: loaded from: classes2.dex */
public class Hotseat extends FrameLayout implements UserEventDispatcher.LogContainerProvider, Insettable {
    private static final String TAG = "Hotseat";
    private TextView allAppsButton;
    private CellLayout mContent;

    @ViewDebug.ExportedProperty(category = "launcher")
    private boolean mHasVerticalHotseat;
    private final Launcher mLauncher;

    public Hotseat(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetLayout$0(View view) {
        Launcher launcher = this.mLauncher;
        LauncherState launcherState = LauncherState.ALL_APPS;
        if (launcher.isInState(launcherState)) {
            return;
        }
        this.mLauncher.getUserEventDispatcher().logActionOnControl(0, 1);
        this.mLauncher.getStateManager().goToState(launcherState);
    }

    @Override // com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        target.gridX = itemInfo.cellX;
        target.gridY = itemInfo.cellY;
        target2.containerType = 2;
    }

    public TextView getAllAppsButton() {
        return this.allAppsButton;
    }

    public int getCellXFromOrder(int i10) {
        if (this.mHasVerticalHotseat) {
            return 0;
        }
        return i10;
    }

    public int getCellYFromOrder(int i10) {
        if (this.mHasVerticalHotseat) {
            return this.mContent.getCountY() - (i10 + 1);
        }
        return 0;
    }

    public CellLayout getLayout() {
        return this.mContent;
    }

    public int getOrderInHotseat(int i10, int i11) {
        return this.mHasVerticalHotseat ? (this.mContent.getCountY() - i11) - 1 : i10;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mContent = (CellLayout) findViewById(com.app.hider.master.promax.R.id.layout);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (this.mLauncher.getWorkspace().workspaceIconsCanBeDragged() || this.mLauncher.getAccessibilityDelegate().isInAccessibleDrag()) ? false : true;
    }

    public void resetLayout(boolean z10) {
        this.mContent.removeAllViewsInLayout();
        this.mHasVerticalHotseat = z10;
        InvariantDeviceProfile invariantDeviceProfile = this.mLauncher.getDeviceProfile().inv;
        if (z10) {
            this.mContent.setGridSize(1, invariantDeviceProfile.numHotseatIcons);
        } else {
            this.mContent.setGridSize(invariantDeviceProfile.numHotseatIcons, 1);
        }
        Context context = getContext();
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        int allAppsButtonRank = deviceProfile.inv.getAllAppsButtonRank();
        this.allAppsButton = (TextView) LayoutInflater.from(context).inflate(com.app.hider.master.promax.R.layout.all_apps_button, (ViewGroup) this.mContent, false);
        Log.d(TAG, "create all apps button");
        Drawable drawable = context.getResources().getDrawable(com.app.hider.master.promax.R.drawable.all_apps_button_icon);
        int i10 = deviceProfile.iconSizePx;
        drawable.setBounds(0, 0, i10, i10);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.app.hider.master.promax.R.dimen.all_apps_button_scale_down);
        Rect bounds = drawable.getBounds();
        int i11 = dimensionPixelSize / 2;
        drawable.setBounds(bounds.left, bounds.top + i11, bounds.right - dimensionPixelSize, bounds.bottom - i11);
        this.allAppsButton.setCompoundDrawables(null, drawable, null, null);
        this.allAppsButton.setContentDescription(context.getString(com.app.hider.master.promax.R.string.all_apps_button_label));
        if (this.mLauncher != null) {
            this.allAppsButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.launcher3.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136924a.lambda$resetLayout$0(view);
                }
            });
            this.allAppsButton.setOnFocusChangeListener(this.mLauncher.mFocusHandler);
        }
        CellLayout.LayoutParams layoutParams = new CellLayout.LayoutParams(getCellXFromOrder(allAppsButtonRank), getCellYFromOrder(allAppsButtonRank), 1, 1);
        layoutParams.canReorder = false;
        CellLayout cellLayout = this.mContent;
        TextView textView = this.allAppsButton;
        cellLayout.addViewToCellLayout(textView, -1, textView.getId(), layoutParams, true);
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        if (deviceProfile.isVerticalBarLayout()) {
            layoutParams.height = -1;
            if (deviceProfile.isSeascape()) {
                layoutParams.gravity = 3;
                layoutParams.width = deviceProfile.hotseatBarSizePx + rect.left + deviceProfile.hotseatBarSidePaddingPx;
            } else {
                layoutParams.gravity = 5;
                layoutParams.width = deviceProfile.hotseatBarSizePx + rect.right + deviceProfile.hotseatBarSidePaddingPx;
            }
        } else {
            layoutParams.gravity = 80;
            layoutParams.width = -1;
            layoutParams.height = deviceProfile.hotseatBarSizePx + rect.bottom;
        }
        Rect hotseatLayoutPadding = deviceProfile.getHotseatLayoutPadding();
        getLayout().setPadding(hotseatLayoutPadding.left, hotseatLayoutPadding.top, hotseatLayoutPadding.right, hotseatLayoutPadding.bottom);
        setLayoutParams(layoutParams);
        InsettableFrameLayout.dispatchInsets(this, rect);
    }

    public Hotseat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Hotseat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mLauncher = Launcher.getLauncher(context);
    }
}
