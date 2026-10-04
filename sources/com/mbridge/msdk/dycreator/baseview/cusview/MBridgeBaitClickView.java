package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.advanced.manager.e;
import com.mbridge.msdk.config.component.animation.h;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import e.T;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeBaitClickView extends RelativeLayout implements h {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f155489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f155490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f155491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f155492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f155493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f155494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f155496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f155497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f155498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f155499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f155500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f155501m;

    public MBridgeBaitClickView(@NonNull Context context) {
        super(context);
        this.f155492d = "";
        this.f155493e = "";
        this.f155494f = "Click now for details";
        this.f155495g = 1;
        this.f155496h = 1342177280;
        this.f155497i = false;
    }

    private void f() {
        if (this.f155490b == null) {
            return;
        }
        final int iA = i0.a(getContext(), "mbridge_icon_click_circle", AppIntroBaseFragmentKt.ARG_DRAWABLE);
        if (TextUtils.isEmpty(this.f155493e)) {
            this.f155490b.setImageResource(iA);
        } else {
            final String str = this.f155493e;
            e.a().a(str, new c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    if (MBridgeBaitClickView.this.f155490b == null || !TextUtils.equals(str, MBridgeBaitClickView.this.f155493e)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f155490b.setImageResource(iA);
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (MBridgeBaitClickView.this.f155490b == null || bitmap.isRecycled() || !TextUtils.equals(str, MBridgeBaitClickView.this.f155493e)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f155490b.setImageBitmap(bitmap);
                }
            });
        }
    }

    private void g() {
        if (this.f155491c == null) {
            return;
        }
        String strL = l();
        this.f155494f = strL;
        this.f155491c.setText(strL);
    }

    private void h() {
        setBackgroundColor(this.f155496h);
        g();
        f();
        i();
    }

    private void i() {
        if (this.f155489a == null) {
            return;
        }
        final int iA = i0.a(getContext(), "mbridge_icon_click_hand", AppIntroBaseFragmentKt.ARG_DRAWABLE);
        if (TextUtils.isEmpty(this.f155492d)) {
            this.f155489a.setImageResource(iA);
        } else {
            final String str = this.f155492d;
            e.a().a(str, new c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    if (MBridgeBaitClickView.this.f155489a == null || !TextUtils.equals(str, MBridgeBaitClickView.this.f155492d)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f155489a.setImageResource(iA);
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (MBridgeBaitClickView.this.f155489a == null || bitmap.isRecycled() || !TextUtils.equals(str, MBridgeBaitClickView.this.f155492d)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f155489a.setImageBitmap(bitmap);
                }
            });
        }
    }

    private void j() {
        if (!this.f155497i || this.f155489a == null || this.f155490b == null || this.f155491c == null) {
            init();
        }
    }

    private void k() {
        if (this.f155489a == null || this.f155490b == null || this.f155491c == null) {
            try {
                removeAllViews();
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                int iA = v0.a(getContext(), 55.0f);
                int iA2 = v0.a(getContext(), 33.0f);
                this.f155490b = new MBridgeDyImageView(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
                layoutParams.setMargins(iA2, iA2, 0, 0);
                this.f155490b.setLayoutParams(layoutParams);
                int iA3 = v0.a(getContext(), 108.0f);
                int iA4 = v0.a(getContext(), 35.0f);
                int iA5 = v0.a(getContext(), 43.0f);
                this.f155489a = new MBridgeDyImageView(getContext());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA3, iA3);
                layoutParams2.setMargins(iA4, iA5, 0, 0);
                this.f155489a.setLayoutParams(layoutParams2);
                relativeLayout.addView(this.f155490b);
                relativeLayout.addView(this.f155489a);
                LinearLayout linearLayout = new LinearLayout(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(13);
                linearLayout.setLayoutParams(layoutParams3);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.addView(relativeLayout);
                this.f155491c = new TextView(getContext());
                this.f155491c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                this.f155491c.setText(this.f155494f);
                this.f155491c.setTextColor(-1);
                this.f155491c.setGravity(14);
                linearLayout.addView(this.f155491c);
                addView(linearLayout);
            } catch (Throwable th) {
                q0.b("MBridgeAnimationClickView", th.getMessage());
            }
        }
    }

    private String l() {
        if (!TextUtils.isEmpty(this.f155494f)) {
            return this.f155494f;
        }
        try {
            return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            q0.b("MBridgeAnimationClickView", th.getMessage());
            return "Click now for details";
        }
    }

    public void init(int i10) {
        this.f155495g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f155498j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f155499k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f155500l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f155501m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.config.component.animation.h
    public View resolveAnimationTarget(String str) {
        j();
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.trim().toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "baithand":
                case "finger":
                case "hand":
                    MBridgeDyImageView mBridgeDyImageView = this.f155489a;
                    if (mBridgeDyImageView != null) {
                        return mBridgeDyImageView;
                    }
                    break;
                case "baittext":
                case "text":
                case "label":
                    TextView textView = this.f155491c;
                    if (textView != null) {
                        return textView;
                    }
                    break;
                case "circle":
                case "ripple":
                case "baitripple":
                    MBridgeDyImageView mBridgeDyImageView2 = this.f155490b;
                    if (mBridgeDyImageView2 != null) {
                        return mBridgeDyImageView2;
                    }
                    break;
                case "container":
                case "self":
                    break;
                default:
                    View viewFindViewWithTag = findViewWithTag(str);
                    if (viewFindViewWithTag != null) {
                        return viewFindViewWithTag;
                    }
                    break;
            }
        }
        return this;
    }

    public void startAnimation() {
        j();
        int i10 = this.f155495g;
        if (i10 == 2) {
            this.f155490b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f155490b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f155498j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f155498j.setRepeatCount(1);
        this.f155498j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f155489a != null) {
                            MBridgeBaitClickView.this.f155489a.startAnimation(MBridgeBaitClickView.this.f155498j);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f155489a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f155498j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f155498j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f155498j.setRepeatCount(-1);
        this.f155498j.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f155489a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f155498j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f155499k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f155499k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f155500l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f155500l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f155499k);
        animationSet.addAnimation(this.f155500l);
        MBridgeDyImageView mBridgeDyImageView2 = this.f155490b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f155501m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f155501m.setRepeatMode(2);
        this.f155501m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f155499k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f155499k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f155500l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f155500l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f155499k);
        animationSet.addAnimation(this.f155500l);
        MBridgeDyImageView mBridgeDyImageView = this.f155489a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f155501m);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f155490b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f155498j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f155498j.setRepeatCount(-1);
        this.f155498j.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f155489a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f155498j);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.f155490b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f155498j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f155498j.setRepeatCount(1);
        this.f155498j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f155499k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f155499k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f155500l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f155500l.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f155499k);
        animationSet.addAnimation(this.f155500l);
        this.f155499k.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f155490b != null) {
                    MBridgeBaitClickView.this.f155490b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f155490b != null) {
                    MBridgeBaitClickView.this.f155490b.setVisibility(0);
                }
            }
        });
        this.f155498j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f155489a != null) {
                            MBridgeBaitClickView.this.f155489a.startAnimation(MBridgeBaitClickView.this.f155498j);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f155490b != null) {
                            MBridgeBaitClickView.this.f155490b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f155489a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f155498j);
        }
    }

    public void init(int i10, int i11) {
        this.f155496h = i10;
        this.f155495g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f155496h = i10;
        this.f155495g = i11;
        this.f155492d = str;
        this.f155493e = str2;
        this.f155494f = str3;
        init();
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155492d = "";
        this.f155493e = "";
        this.f155494f = "Click now for details";
        this.f155495g = 1;
        this.f155496h = 1342177280;
        this.f155497i = false;
    }

    public void init() {
        try {
            k();
            h();
            this.f155497i = true;
        } catch (Throwable th) {
            q0.b("MBridgeAnimationClickView", th.getMessage());
        }
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155492d = "";
        this.f155493e = "";
        this.f155494f = "Click now for details";
        this.f155495g = 1;
        this.f155496h = 1342177280;
        this.f155497i = false;
    }

    @T(api = 21)
    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f155492d = "";
        this.f155493e = "";
        this.f155494f = "Click now for details";
        this.f155495g = 1;
        this.f155496h = 1342177280;
        this.f155497i = false;
    }
}
