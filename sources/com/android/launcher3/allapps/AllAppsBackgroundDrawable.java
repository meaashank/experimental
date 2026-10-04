package com.android.launcher3.allapps;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.ContextThemeWrapper;
import com.android.launcher3.LauncherAnimUtils;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class AllAppsBackgroundDrawable extends Drawable {
    private ObjectAnimator mBackgroundAnim;
    protected final TransformedImageDrawable mHand;
    private final int mHeight;
    protected final TransformedImageDrawable[] mIcons;
    private final int mWidth;

    public static class TransformedImageDrawable {
        private int mAlpha;
        private int mGravity;
        private Drawable mImage;
        private float mXPercent;
        private float mYPercent;

        public TransformedImageDrawable(Context context, int i10, float f10, float f11, int i11) {
            this.mImage = context.getDrawable(i10);
            this.mXPercent = f10;
            this.mYPercent = f11;
            this.mGravity = i11;
        }

        public void draw(Canvas canvas) {
            this.mImage.draw(canvas);
        }

        public int getAlpha() {
            return this.mAlpha;
        }

        public Rect getBounds() {
            return this.mImage.getBounds();
        }

        public void setAlpha(int i10) {
            this.mImage.setAlpha(i10);
            this.mAlpha = i10;
        }

        public void updateBounds(Rect rect) {
            int intrinsicWidth = this.mImage.getIntrinsicWidth();
            int intrinsicHeight = this.mImage.getIntrinsicHeight();
            int iWidth = rect.left + ((int) (this.mXPercent * rect.width()));
            int iHeight = rect.top + ((int) (this.mYPercent * rect.height()));
            int i10 = this.mGravity;
            if ((i10 & 1) == 1) {
                iWidth -= intrinsicWidth / 2;
            }
            if ((i10 & 16) == 16) {
                iHeight -= intrinsicHeight / 2;
            }
            this.mImage.setBounds(iWidth, iHeight, intrinsicWidth + iWidth, intrinsicHeight + iHeight);
        }
    }

    public AllAppsBackgroundDrawable(Context context) {
        Resources resources = context.getResources();
        this.mWidth = resources.getDimensionPixelSize(R.dimen.all_apps_background_canvas_width);
        this.mHeight = resources.getDimensionPixelSize(R.dimen.all_apps_background_canvas_height);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, Themes.getAttrBoolean(context, R.attr.isMainColorDark) ? 2132082697 : R.style.AllAppsEmptySearchBackground);
        this.mHand = new TransformedImageDrawable(contextThemeWrapper, R.drawable.ic_all_apps_bg_hand, 0.575f, 0.0f, 1);
        this.mIcons = new TransformedImageDrawable[]{new TransformedImageDrawable(contextThemeWrapper, R.drawable.ic_all_apps_bg_icon_1, 0.375f, 0.0f, 1), new TransformedImageDrawable(contextThemeWrapper, R.drawable.ic_all_apps_bg_icon_2, 0.3125f, 0.2f, 1), new TransformedImageDrawable(contextThemeWrapper, R.drawable.ic_all_apps_bg_icon_3, 0.475f, 0.26f, 1), new TransformedImageDrawable(contextThemeWrapper, R.drawable.ic_all_apps_bg_icon_4, 0.7f, 0.125f, 1)};
    }

    private ObjectAnimator cancelAnimator(ObjectAnimator objectAnimator) {
        if (objectAnimator == null) {
            return null;
        }
        objectAnimator.cancel();
        return null;
    }

    public void animateBgAlpha(float f10, int i10) {
        int i11 = (int) (f10 * 255.0f);
        if (getAlpha() != i11) {
            this.mBackgroundAnim = cancelAnimator(this.mBackgroundAnim);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, (Property<AllAppsBackgroundDrawable, Integer>) LauncherAnimUtils.DRAWABLE_ALPHA, i11);
            this.mBackgroundAnim = objectAnimatorOfInt;
            objectAnimatorOfInt.setDuration(i10);
            this.mBackgroundAnim.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mHand.draw(canvas);
        int i10 = 0;
        while (true) {
            TransformedImageDrawable[] transformedImageDrawableArr = this.mIcons;
            if (i10 >= transformedImageDrawableArr.length) {
                return;
            }
            transformedImageDrawableArr[i10].draw(canvas);
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mHand.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mHand.updateBounds(rect);
        int i10 = 0;
        while (true) {
            TransformedImageDrawable[] transformedImageDrawableArr = this.mIcons;
            if (i10 >= transformedImageDrawableArr.length) {
                invalidateSelf();
                return;
            } else {
                transformedImageDrawableArr[i10].updateBounds(rect);
                i10++;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.mHand.setAlpha(i10);
        int i11 = 0;
        while (true) {
            TransformedImageDrawable[] transformedImageDrawableArr = this.mIcons;
            if (i11 >= transformedImageDrawableArr.length) {
                invalidateSelf();
                return;
            } else {
                transformedImageDrawableArr[i11].setAlpha(i10);
                i11++;
            }
        }
    }

    public void setBgAlpha(float f10) {
        int i10 = (int) (f10 * 255.0f);
        if (getAlpha() != i10) {
            this.mBackgroundAnim = cancelAnimator(this.mBackgroundAnim);
            setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
