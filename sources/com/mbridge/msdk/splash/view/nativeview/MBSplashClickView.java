package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.foundation.tools.v0;
import e.T;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f159024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f159025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f159026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f159027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f159028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f159029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f159030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f159031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f159032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f159033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f159034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f159035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f159036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f159037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f159038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f159039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f159040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f159041r;

    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f159042a;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        public class RunnableC0628a implements Runnable {
            public RunnableC0628a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f159038o.startAnimation(a.this.f159042a);
            }
        }

        public a(ScaleAnimation scaleAnimation) {
            this.f159042a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f159038o.setVisibility(4);
            MBSplashClickView.this.f159038o.postDelayed(new RunnableC0628a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f159038o.setVisibility(0);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f159045a;

        public b(ScaleAnimation scaleAnimation) {
            this.f159045a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f159038o.startAnimation(this.f159045a);
        }
    }

    public class c implements Animation.AnimationListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation f159048a;

            public a(Animation animation) {
                this.f159048a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f159037n.startAnimation(this.f159048a);
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f159037n.setVisibility(4);
            MBSplashClickView.this.f159037n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f159037n.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f159024a = "浏览第三方应用";
        this.f159025b = "View";
        this.f159026c = "打开第三方应用";
        this.f159027d = "Open";
        this.f159028e = "下载第三方应用";
        this.f159029f = "Install";
        this.f159030g = "mbridge_splash_btn_arrow_right";
        this.f159031h = "mbridge_splash_btn_circle";
        this.f159032i = "mbridge_splash_btn_finger";
        this.f159033j = "mbridge_splash_btn_go";
        this.f159034k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f159039p = new RectF();
        this.f159040q = new Paint();
        this.f159041r = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f159038o.setVisibility(4);
        this.f159037n.startAnimation(scaleAnimation);
        this.f159038o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f159037n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f159037n.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f159039p, this.f159041r, 31);
        canvas.drawRoundRect(this.f159039p, 200.0f, 200.0f, this.f159041r);
        canvas.saveLayer(this.f159039p, this.f159040q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f159035l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f159036m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f159039p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f159040q.setAntiAlias(true);
        this.f159040q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f159041r.setAntiAlias(true);
        this.f159041r.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!a(this.f159035l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f159035l)) {
                this.f159035l = zContains ? "浏览第三方应用" : "View";
            }
            this.f159036m = 2;
        }
        setBgDrawable(this.f159036m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f159035l);
        this.f159037n = new ImageView(getContext());
        int i10 = this.f159036m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams.topMargin = v0.a(getContext(), 18.0f);
            this.f159038o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f159038o.setLayoutParams(layoutParams4);
            this.f159038o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
            addView(this.f159038o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f159037n.setLayoutParams(layoutParams);
        this.f159037n.setImageResource(identifier);
        addView(textView);
        addView(this.f159037n);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f159036m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f159036m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f159036m = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159024a = "浏览第三方应用";
        this.f159025b = "View";
        this.f159026c = "打开第三方应用";
        this.f159027d = "Open";
        this.f159028e = "下载第三方应用";
        this.f159029f = "Install";
        this.f159030g = "mbridge_splash_btn_arrow_right";
        this.f159031h = "mbridge_splash_btn_circle";
        this.f159032i = "mbridge_splash_btn_finger";
        this.f159033j = "mbridge_splash_btn_go";
        this.f159034k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f159039p = new RectF();
        this.f159040q = new Paint();
        this.f159041r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f159024a = "浏览第三方应用";
        this.f159025b = "View";
        this.f159026c = "打开第三方应用";
        this.f159027d = "Open";
        this.f159028e = "下载第三方应用";
        this.f159029f = "Install";
        this.f159030g = "mbridge_splash_btn_arrow_right";
        this.f159031h = "mbridge_splash_btn_circle";
        this.f159032i = "mbridge_splash_btn_finger";
        this.f159033j = "mbridge_splash_btn_go";
        this.f159034k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f159039p = new RectF();
        this.f159040q = new Paint();
        this.f159041r = new Paint();
        a();
    }

    @T(api = 21)
    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f159024a = "浏览第三方应用";
        this.f159025b = "View";
        this.f159026c = "打开第三方应用";
        this.f159027d = "Open";
        this.f159028e = "下载第三方应用";
        this.f159029f = "Install";
        this.f159030g = "mbridge_splash_btn_arrow_right";
        this.f159031h = "mbridge_splash_btn_circle";
        this.f159032i = "mbridge_splash_btn_finger";
        this.f159033j = "mbridge_splash_btn_go";
        this.f159034k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f159039p = new RectF();
        this.f159040q = new Paint();
        this.f159041r = new Paint();
    }
}
