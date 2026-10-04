package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes5.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f155619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f155622e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f155618a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155619b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155620c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155621d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f155621d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f155622e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f155618a, this.f155619b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f155620c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f155622e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f155618a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155619b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155620c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155621d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f155618a = gradientAndShadowParameters.gradientStartColor;
            this.f155619b = gradientAndShadowParameters.gradientEndColor;
            this.f155620c = gradientAndShadowParameters.shadowColor;
            this.f155621d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155618a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155619b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155620c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155621d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155618a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155619b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155620c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155621d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @T(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f155618a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155619b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155620c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155621d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
