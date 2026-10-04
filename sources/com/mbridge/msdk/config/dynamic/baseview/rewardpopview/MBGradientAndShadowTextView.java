package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;
import e.T;

/* JADX INFO: loaded from: classes5.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f155042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f155045e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f155047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f155048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f155049d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f155050e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f155051f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f155052g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f155041a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155042b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155043c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155044d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f155044d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f155045e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f155041a, this.f155042b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f155043c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f155045e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f155041a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155042b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155043c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155044d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f155041a = aVar.f155046a;
            this.f155042b = aVar.f155047b;
            this.f155043c = aVar.f155048c;
            this.f155044d = aVar.f155049d;
            this.mShadowRadius = aVar.f155050e;
            this.mShadowDx = aVar.f155051f;
            this.mShadowDy = aVar.f155052g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155041a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155042b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155043c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155044d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155041a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155042b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155043c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155044d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @T(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f155041a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f155042b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f155043c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f155044d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
