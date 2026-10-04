package com.android.launcher3;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.states.SpringLoadedState;
import com.android.launcher3.uioverrides.AllAppsState;
import com.android.launcher3.uioverrides.FastOverviewState;
import com.android.launcher3.uioverrides.OverviewState;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class LauncherState {
    public static final int ALL_APPS_CONTENT = 16;
    public static final int ALL_APPS_HEADER = 4;
    public static final int ALL_APPS_HEADER_EXTRA = 8;
    protected static final int FLAG_DISABLE_ACCESSIBILITY = 2;
    protected static final int FLAG_DISABLE_INTERACTION = 64;
    protected static final int FLAG_DISABLE_PAGE_CLIPPING = 16;
    protected static final int FLAG_DISABLE_RESTORE = 4;
    protected static final int FLAG_HAS_SYS_UI_SCRIM = 512;
    protected static final int FLAG_HIDE_BACK_BUTTON = 256;
    protected static final int FLAG_MULTI_PAGE = 1;
    protected static final int FLAG_OVERVIEW_UI = 128;
    protected static final int FLAG_PAGE_BACKGROUNDS = 32;
    protected static final int FLAG_WORKSPACE_ICONS_CAN_BE_DRAGGED = 8;
    public static final int HOTSEAT_ICONS = 1;
    public static final int HOTSEAT_SEARCH_BOX = 2;
    public static final int NONE = 0;
    public static final int VERTICAL_SWIPE_INDICATOR = 32;
    public final int containerType;
    public final boolean disableInteraction;
    public final boolean disablePageClipping;
    public final boolean disableRestore;
    public final boolean hasMultipleVisiblePages;
    public final boolean hasSysUiScrim;
    public final boolean hasWorkspacePageBackground;
    public final boolean hideBackButton;
    public final int ordinal;
    public final boolean overviewUi;
    public final int transitionDuration;
    public final int workspaceAccessibilityFlag;
    public final boolean workspaceIconsCanBeDragged;
    protected static final PageAlphaProvider DEFAULT_ALPHA_PROVIDER = new AnonymousClass1(Interpolators.ACCEL_2);
    private static final LauncherState[] sAllStates = new LauncherState[5];
    public static final LauncherState NORMAL = new LauncherState(0, 1, 0, 780);
    public static final LauncherState SPRING_LOADED = new SpringLoadedState(1);
    public static final LauncherState OVERVIEW = new OverviewState(2);
    public static final LauncherState FAST_OVERVIEW = new FastOverviewState(3);
    public static final LauncherState ALL_APPS = new AllAppsState(4);
    protected static final Rect sTempRect = new Rect();

    /* JADX INFO: renamed from: com.android.launcher3.LauncherState$1, reason: invalid class name */
    public class AnonymousClass1 extends PageAlphaProvider {
        public AnonymousClass1(Interpolator interpolator) {
            super(interpolator);
        }

        @Override // com.android.launcher3.LauncherState.PageAlphaProvider
        public float getPageAlpha(int i10) {
            return 1.0f;
        }
    }

    public static abstract class PageAlphaProvider {
        public final Interpolator interpolator;

        public PageAlphaProvider(Interpolator interpolator) {
            this.interpolator = interpolator;
        }

        public abstract float getPageAlpha(int i10);
    }

    public LauncherState(int i10, int i11, int i12, int i13) {
        this.containerType = i11;
        this.transitionDuration = i12;
        this.hasWorkspacePageBackground = (i13 & 32) != 0;
        this.hasMultipleVisiblePages = (i13 & 1) != 0;
        this.workspaceAccessibilityFlag = (i13 & 2) != 0 ? 4 : 0;
        this.disableRestore = (i13 & 4) != 0;
        this.workspaceIconsCanBeDragged = (i13 & 8) != 0;
        this.disablePageClipping = (i13 & 16) != 0;
        this.disableInteraction = (i13 & 64) != 0;
        this.overviewUi = (i13 & 128) != 0;
        this.hideBackButton = (i13 & 256) != 0;
        this.hasSysUiScrim = (i13 & 512) != 0;
        this.ordinal = i10;
        sAllStates[i10] = this;
    }

    public static void dispatchWindowStateChanged(Launcher launcher) {
        launcher.getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    public static LauncherState[] values() {
        LauncherState[] launcherStateArr = sAllStates;
        return (LauncherState[]) Arrays.copyOf(launcherStateArr, launcherStateArr.length);
    }

    public String getDescription(Launcher launcher) {
        return launcher.getWorkspace().getCurrentPageDescription();
    }

    public LauncherState getHistoryForState(LauncherState launcherState) {
        return BuildConfig.LAUNCHER_INITIAL_STATE;
    }

    public float[] getOverviewScaleAndTranslationYFactor(Launcher launcher) {
        return new float[]{1.1f, 0.0f};
    }

    public float getVerticalProgress(Launcher launcher) {
        return 1.0f;
    }

    public int getVisibleElements(Launcher launcher) {
        return launcher.getDeviceProfile().isVerticalBarLayout() ? 33 : 35;
    }

    public PageAlphaProvider getWorkspacePageAlphaProvider(Launcher launcher) {
        if (this != NORMAL || !launcher.getDeviceProfile().shouldFadeAdjacentWorkspaceScreens()) {
            return DEFAULT_ALPHA_PROVIDER;
        }
        final int nextPage = launcher.getWorkspace().getNextPage();
        return new PageAlphaProvider(Interpolators.ACCEL_2) { // from class: com.android.launcher3.LauncherState.2
            @Override // com.android.launcher3.LauncherState.PageAlphaProvider
            public float getPageAlpha(int i10) {
                return i10 != nextPage ? 0.0f : 1.0f;
            }
        };
    }

    public float[] getWorkspaceScaleAndTranslation(Launcher launcher) {
        return new float[]{1.0f, 0.0f, 0.0f};
    }

    public float getWorkspaceScrimAlpha(Launcher launcher) {
        return 0.0f;
    }

    public void onStateDisabled(Launcher launcher) {
    }

    public void onStateEnabled(Launcher launcher) {
        dispatchWindowStateChanged(launcher);
    }

    public void onStateTransitionEnd(Launcher launcher) {
        if (this == NORMAL) {
            launcher.getRotationHelper().setCurrentStateRequest(0);
        }
    }
}
