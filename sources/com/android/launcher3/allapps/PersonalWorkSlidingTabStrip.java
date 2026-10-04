package com.android.launcher3.allapps;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.Launcher;
import com.android.launcher3.Utilities;
import com.android.launcher3.pageindicators.PageIndicator;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class PersonalWorkSlidingTabStrip extends LinearLayout implements PageIndicator {
    private static final String KEY_SHOWED_PEEK_WORK_TAB = "showed_peek_work_tab";
    private static final int POSITION_PERSONAL = 0;
    private static final int POSITION_WORK = 1;
    private AllAppsContainerView mContainerView;
    private final Paint mDividerPaint;
    private int mIndicatorLeft;
    private int mIndicatorRight;
    private boolean mIsRtl;
    private int mLastActivePage;
    private float mScrollOffset;
    private int mSelectedIndicatorHeight;
    private final Paint mSelectedIndicatorPaint;
    private int mSelectedPosition;
    private final SharedPreferences mSharedPreferences;

    public PersonalWorkSlidingTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIndicatorLeft = -1;
        this.mIndicatorRight = -1;
        this.mSelectedPosition = 0;
        this.mLastActivePage = 0;
        setOrientation(0);
        setWillNotDraw(false);
        this.mSelectedIndicatorHeight = getResources().getDimensionPixelSize(R.dimen.all_apps_tabs_indicator_height);
        Paint paint = new Paint();
        this.mSelectedIndicatorPaint = paint;
        paint.setColor(Themes.getAttrColor(context, android.R.attr.colorAccent));
        Paint paint2 = new Paint();
        this.mDividerPaint = paint2;
        paint2.setColor(Themes.getAttrColor(context, android.R.attr.colorControlHighlight));
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.all_apps_divider_height));
        this.mSharedPreferences = Launcher.getLauncher(getContext()).getSharedPrefs();
        this.mIsRtl = Utilities.isRtl(getResources());
    }

    public static /* synthetic */ void a(View view) {
        view.setPressed(true);
        view.setPressed(false);
    }

    private View getLeftTab() {
        return getChildAt(this.mIsRtl ? 1 : 0);
    }

    private void highlightWorkTab() {
        final View childAt = getChildAt(1);
        childAt.post(new Runnable() { // from class: com.android.launcher3.allapps.m
            @Override // java.lang.Runnable
            public final void run() {
                PersonalWorkSlidingTabStrip.a(childAt);
            }
        });
    }

    private void setIndicatorPosition(int i10, int i11) {
        if (i10 == this.mIndicatorLeft && i11 == this.mIndicatorRight) {
            return;
        }
        this.mIndicatorLeft = i10;
        this.mIndicatorRight = i11;
        invalidate();
    }

    private void updateIndicatorPosition(float f10) {
        this.mScrollOffset = f10;
        updateIndicatorPosition();
    }

    private void updateTabTextColor(int i10) {
        this.mSelectedPosition = i10;
        int i11 = 0;
        while (i11 < getChildCount()) {
            ((Button) getChildAt(i11)).setSelected(i11 == i10);
            i11++;
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void highlightWorkTabIfNecessary() {
        if (!this.mSharedPreferences.getBoolean(KEY_SHOWED_PEEK_WORK_TAB, false) && this.mLastActivePage == 0) {
            highlightWorkTab();
            this.mSharedPreferences.edit().putBoolean(KEY_SHOWED_PEEK_WORK_TAB, true).apply();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() - this.mDividerPaint.getStrokeWidth();
        canvas.drawLine(getPaddingLeft(), height, getWidth() - getPaddingRight(), height, this.mDividerPaint);
        canvas.drawRect(this.mIndicatorLeft, getHeight() - this.mSelectedIndicatorHeight, this.mIndicatorRight, getHeight(), this.mSelectedIndicatorPaint);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        updateTabTextColor(this.mSelectedPosition);
        updateIndicatorPosition(this.mScrollOffset);
    }

    @Override // com.android.launcher3.pageindicators.PageIndicator
    public void setActiveMarker(int i10) {
        updateTabTextColor(i10);
        AllAppsContainerView allAppsContainerView = this.mContainerView;
        if (allAppsContainerView != null && this.mLastActivePage != i10) {
            allAppsContainerView.onTabChanged(i10);
        }
        this.mLastActivePage = i10;
    }

    public void setContainerView(AllAppsContainerView allAppsContainerView) {
        this.mContainerView = allAppsContainerView;
    }

    @Override // com.android.launcher3.pageindicators.PageIndicator
    public void setMarkersCount(int i10) {
    }

    @Override // com.android.launcher3.pageindicators.PageIndicator
    public void setScroll(int i10, int i11) {
        updateIndicatorPosition(i10 / i11);
    }

    private void updateIndicatorPosition() {
        int width;
        int width2;
        View leftTab = getLeftTab();
        if (leftTab != null) {
            width = (int) ((leftTab.getWidth() * this.mScrollOffset) + leftTab.getLeft());
            width2 = leftTab.getWidth() + width;
        } else {
            width = -1;
            width2 = -1;
        }
        setIndicatorPosition(width, width2);
    }
}
