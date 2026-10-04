package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.C1478e;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";

    @Nullable
    private C1478e backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @NonNull
    private final TimeInterpolator progressInterpolator;

    @NonNull
    protected final V view;

    public MaterialBackAnimationHelper(@NonNull V v10) {
        this.view = v10;
        Context context = v10.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f10) {
        return this.progressInterpolator.getInterpolation(f10);
    }

    @Nullable
    public C1478e onCancelBackProgress() {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C1478e c1478e = this.backEvent;
        this.backEvent = null;
        return c1478e;
    }

    @Nullable
    public C1478e onHandleBackInvoked() {
        C1478e c1478e = this.backEvent;
        this.backEvent = null;
        return c1478e;
    }

    public void onStartBackProgress(@NonNull C1478e c1478e) {
        this.backEvent = c1478e;
    }

    @Nullable
    public C1478e onUpdateBackProgress(@NonNull C1478e c1478e) {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() before updateBackProgress()");
        }
        C1478e c1478e2 = this.backEvent;
        this.backEvent = c1478e;
        return c1478e2;
    }
}
