package com.android.launcher3.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.launcher3.BaseActivity;
import com.android.launcher3.SimpleOnStylusPressListener;
import com.android.launcher3.StylusEventHelper;
import com.android.launcher3.WidgetPreviewLoader;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.graphics.DrawableFactory;
import com.android.launcher3.model.WidgetItem;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetCell extends LinearLayout implements View.OnLayoutChangeListener {
    private static final boolean DEBUG = false;
    private static final int FADE_IN_DURATION_MS = 90;
    private static final float PREVIEW_SCALE = 0.8f;
    private static final String TAG = "WidgetCell";
    private static final float WIDTH_SCALE = 2.6f;
    protected CancellationSignal mActiveRequest;
    protected final BaseActivity mActivity;
    private boolean mAnimatePreview;
    private boolean mApplyBitmapDeferred;
    private int mCellSize;
    private Bitmap mDeferredBitmap;
    protected WidgetItem mItem;
    protected int mPresetPreviewSize;
    private StylusEventHelper mStylusEventHelper;
    private TextView mWidgetDims;
    private WidgetImageView mWidgetImage;
    private TextView mWidgetName;
    private WidgetPreviewLoader mWidgetPreviewLoader;

    public WidgetCell(Context context) {
        this(context, null);
    }

    private String getTagToString() {
        return ((getTag() instanceof PendingAddWidgetInfo) || (getTag() instanceof PendingAddShortcutInfo)) ? getTag().toString() : "";
    }

    private void setContainerWidth() {
        int i10 = (int) (this.mActivity.getDeviceProfile().cellWidthPx * WIDTH_SCALE);
        this.mCellSize = i10;
        this.mPresetPreviewSize = (int) (i10 * 0.8f);
    }

    public void applyFromCellItem(WidgetItem widgetItem, WidgetPreviewLoader widgetPreviewLoader) {
        this.mItem = widgetItem;
        this.mWidgetName.setText(widgetItem.label);
        this.mWidgetDims.setText(getContext().getString(R.string.widget_dims_format, Integer.valueOf(this.mItem.spanX), Integer.valueOf(this.mItem.spanY)));
        this.mWidgetDims.setContentDescription(getContext().getString(R.string.widget_accessible_dims_format, Integer.valueOf(this.mItem.spanX), Integer.valueOf(this.mItem.spanY)));
        this.mWidgetPreviewLoader = widgetPreviewLoader;
        ShortcutConfigActivityInfo shortcutConfigActivityInfo = widgetItem.activityInfo;
        if (shortcutConfigActivityInfo != null) {
            setTag(new PendingAddShortcutInfo(shortcutConfigActivityInfo));
        } else {
            setTag(new PendingAddWidgetInfo(widgetItem.widgetInfo));
        }
    }

    public void applyPreview(Bitmap bitmap) {
        if (this.mApplyBitmapDeferred) {
            this.mDeferredBitmap = bitmap;
            return;
        }
        if (bitmap != null) {
            this.mWidgetImage.setBitmap(bitmap, DrawableFactory.get(getContext()).getBadgeForUser(this.mItem.user, getContext()));
            if (!this.mAnimatePreview) {
                this.mWidgetImage.setAlpha(1.0f);
            } else {
                this.mWidgetImage.setAlpha(0.0f);
                this.mWidgetImage.animate().alpha(1.0f).setDuration(90L);
            }
        }
    }

    public void clear() {
        this.mWidgetImage.animate().cancel();
        this.mWidgetImage.setBitmap(null, null);
        this.mWidgetName.setText((CharSequence) null);
        this.mWidgetDims.setText((CharSequence) null);
        CancellationSignal cancellationSignal = this.mActiveRequest;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.mActiveRequest = null;
        }
    }

    public void ensurePreview() {
        if (this.mActiveRequest != null) {
            return;
        }
        WidgetPreviewLoader widgetPreviewLoader = this.mWidgetPreviewLoader;
        WidgetItem widgetItem = this.mItem;
        int i10 = this.mPresetPreviewSize;
        this.mActiveRequest = widgetPreviewLoader.getPreview(widgetItem, i10, i10, this);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return WidgetCell.class.getName();
    }

    public WidgetImageView getWidgetView() {
        return this.mWidgetImage;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mWidgetImage = (WidgetImageView) findViewById(R.id.widget_preview);
        this.mWidgetName = (TextView) findViewById(R.id.widget_name);
        this.mWidgetDims = (TextView) findViewById(R.id.widget_dims);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        removeOnLayoutChangeListener(this);
        ensurePreview();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.mStylusEventHelper.onMotionEvent(motionEvent)) {
            return true;
        }
        return zOnTouchEvent;
    }

    public void setAnimatePreview(boolean z10) {
        this.mAnimatePreview = z10;
    }

    public void setApplyBitmapDeferred(boolean z10) {
        Bitmap bitmap;
        if (this.mApplyBitmapDeferred != z10) {
            this.mApplyBitmapDeferred = z10;
            if (z10 || (bitmap = this.mDeferredBitmap) == null) {
                return;
            }
            applyPreview(bitmap);
            this.mDeferredBitmap = null;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        int i10 = this.mCellSize;
        layoutParams.height = i10;
        layoutParams.width = i10;
        super.setLayoutParams(layoutParams);
    }

    public WidgetCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetCell(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mAnimatePreview = true;
        this.mApplyBitmapDeferred = false;
        BaseActivity baseActivityFromContext = BaseActivity.fromContext(context);
        this.mActivity = baseActivityFromContext;
        this.mStylusEventHelper = new StylusEventHelper(new SimpleOnStylusPressListener(this), this);
        setContainerWidth();
        setWillNotDraw(false);
        setClipToPadding(false);
        setAccessibilityDelegate(baseActivityFromContext.getAccessibilityDelegate());
    }
}
