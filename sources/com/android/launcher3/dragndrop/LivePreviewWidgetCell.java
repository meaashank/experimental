package com.android.launcher3.dragndrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import com.android.launcher3.BaseActivity;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.widget.WidgetCell;

/* JADX INFO: loaded from: classes2.dex */
public class LivePreviewWidgetCell extends WidgetCell {
    private RemoteViews mPreview;

    public LivePreviewWidgetCell(Context context) {
        this(context, null);
    }

    public static Bitmap generateFromRemoteViews(BaseActivity baseActivity, RemoteViews remoteViews, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, int i10, int[] iArr) {
        float f10;
        DeviceProfile deviceProfile = baseActivity.getDeviceProfile();
        int i11 = deviceProfile.cellWidthPx * launcherAppWidgetProviderInfo.spanX;
        int i12 = deviceProfile.cellHeightPx * launcherAppWidgetProviderInfo.spanY;
        try {
            View viewApply = remoteViews.apply(baseActivity, new FrameLayout(baseActivity));
            viewApply.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            int measuredWidth = viewApply.getMeasuredWidth();
            int measuredHeight = viewApply.getMeasuredHeight();
            viewApply.layout(0, 0, measuredWidth, measuredHeight);
            iArr[0] = measuredWidth;
            if (measuredWidth > i10) {
                f10 = i10 / measuredWidth;
                measuredHeight = (int) (measuredHeight * f10);
            } else {
                f10 = 1.0f;
                i10 = measuredWidth;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f10, f10);
            viewApply.draw(canvas);
            canvas.setBitmap(null);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.android.launcher3.widget.WidgetCell
    public void ensurePreview() {
        Bitmap bitmapGenerateFromRemoteViews;
        RemoteViews remoteViews = this.mPreview;
        if (remoteViews == null || this.mActiveRequest != null || (bitmapGenerateFromRemoteViews = generateFromRemoteViews(this.mActivity, remoteViews, this.mItem.widgetInfo, this.mPresetPreviewSize, new int[1])) == null) {
            super.ensurePreview();
        } else {
            applyPreview(bitmapGenerateFromRemoteViews);
        }
    }

    public void setPreview(RemoteViews remoteViews) {
        this.mPreview = remoteViews;
    }

    public LivePreviewWidgetCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public LivePreviewWidgetCell(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
