package com.android.launcher3.allapps.search;

import android.content.Context;
import android.graphics.Rect;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.ExtendedEditText;
import com.android.launcher3.Insettable;
import com.android.launcher3.Launcher;
import com.android.launcher3.allapps.AllAppsContainerView;
import com.android.launcher3.allapps.AllAppsStore;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import com.android.launcher3.allapps.SearchUiManager;
import com.android.launcher3.allapps.search.AllAppsSearchBarController;
import com.android.launcher3.graphics.TintedDrawableSpan;
import com.android.launcher3.util.ComponentKey;
import com.app.hider.master.promax.R;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AppsSearchContainerLayout extends ExtendedEditText implements SearchUiManager, AllAppsSearchBarController.Callbacks, AllAppsStore.OnUpdateListener, Insettable {
    private AlphabeticalAppsList mApps;
    private AllAppsContainerView mAppsView;
    private final float mFixedTranslationY;
    private final Launcher mLauncher;
    private final float mMarginTopAdjusting;
    private final AllAppsSearchBarController mSearchBarController;
    private final SpannableStringBuilder mSearchQueryBuilder;

    public AppsSearchContainerLayout(Context context) {
        this(context, null);
    }

    private void notifyResultChanged() {
        this.mAppsView.onSearchResultsChanged();
    }

    @Override // com.android.launcher3.allapps.search.AllAppsSearchBarController.Callbacks
    public void clearSearchResult() {
        if (this.mApps.setOrderedFilter(null)) {
            notifyResultChanged();
        }
        this.mSearchQueryBuilder.clear();
        this.mSearchQueryBuilder.clearSpans();
        Selection.setSelection(this.mSearchQueryBuilder, 0);
        this.mAppsView.onClearSearchResult();
    }

    @Override // com.android.launcher3.allapps.SearchUiManager
    public void initialize(AllAppsContainerView allAppsContainerView) {
        AlphabeticalAppsList apps = allAppsContainerView.getApps();
        this.mApps = apps;
        this.mAppsView = allAppsContainerView;
        this.mSearchBarController.initialize(new DefaultAppSearchAlgorithm(apps.getApps()), this, this.mLauncher, this);
    }

    @Override // com.android.launcher3.allapps.AllAppsStore.OnUpdateListener
    public void onAppsUpdated() {
        this.mSearchBarController.refreshSearchResult();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLauncher.getAppsView().getAppsStore().addUpdateListener(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mLauncher.getAppsView().getAppsStore().removeUpdateListener(this);
    }

    @Override // com.android.launcher3.ExtendedEditText, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = (View) getParent();
        setTranslationX((((((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) - (i12 - i10)) / 2) + view.getPaddingLeft()) - i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        int size = (View.MeasureSpec.getSize(i10) - this.mAppsView.getActiveRecyclerView().getPaddingLeft()) - this.mAppsView.getActiveRecyclerView().getPaddingRight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + (size - ((size / deviceProfile.inv.numHotseatIcons) - Math.round(deviceProfile.iconSizePx * 0.92f))), 1073741824), i11);
    }

    @Override // com.android.launcher3.allapps.search.AllAppsSearchBarController.Callbacks
    public void onSearchResult(String str, ArrayList<ComponentKey> arrayList) {
        if (arrayList != null) {
            this.mApps.setOrderedFilter(arrayList);
            notifyResultChanged();
            this.mAppsView.setLastSearchQuery(str);
        }
    }

    @Override // com.android.launcher3.allapps.SearchUiManager
    public void preDispatchKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        if (this.mSearchBarController.isSearchFieldFocused() || keyEvent.getAction() != 0 || (unicodeChar = keyEvent.getUnicodeChar()) <= 0 || Character.isWhitespace(unicodeChar) || Character.isSpaceChar(unicodeChar) || !TextKeyListener.getInstance().onKeyDown(this, this.mSearchQueryBuilder, keyEvent.getKeyCode(), keyEvent) || this.mSearchQueryBuilder.length() <= 0) {
            return;
        }
        this.mSearchBarController.focusSearchField();
    }

    @Override // com.android.launcher3.allapps.SearchUiManager
    public void resetSearch() {
        this.mSearchBarController.reset();
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = Math.round(Math.max(-this.mFixedTranslationY, rect.top - this.mMarginTopAdjusting));
        requestLayout();
        if (this.mLauncher.getDeviceProfile().isVerticalBarLayout()) {
            this.mLauncher.getAllAppsController().setScrollRangeDelta(0.0f);
        } else {
            this.mLauncher.getAllAppsController().setScrollRangeDelta(rect.bottom + r0.topMargin + this.mFixedTranslationY);
        }
    }

    public AppsSearchContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppsSearchContainerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mLauncher = Launcher.getLauncher(context);
        this.mSearchBarController = new AllAppsSearchBarController();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.mSearchQueryBuilder = spannableStringBuilder;
        Selection.setSelection(spannableStringBuilder, 0);
        float translationY = getTranslationY();
        this.mFixedTranslationY = translationY;
        this.mMarginTopAdjusting = translationY - getPaddingTop();
        SpannableString spannableString = new SpannableString(GlideException.a.f139488d + ((Object) getHint()));
        spannableString.setSpan(new TintedDrawableSpan(getContext(), R.drawable.ic_allapps_search), 0, 1, 34);
        setHint(spannableString);
    }
}
