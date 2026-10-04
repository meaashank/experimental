package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.config.component.animation.h;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BaitClickView extends ComponentRelativeLayout implements h {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f154925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f154926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f154927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f154928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f154931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f154932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f154933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f154934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f154935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f154936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f154937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Animation f154938n;

    public class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f154939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f154940b;

        public a(String str, int i10) {
            this.f154939a = str;
            this.f154940b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (BaitClickView.this.f154926b == null || !TextUtils.equals(this.f154939a, BaitClickView.this.f154929e)) {
                return;
            }
            BaitClickView.this.f154926b.setImageResource(this.f154940b);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaitClickView.this.f154926b == null || bitmap.isRecycled() || !TextUtils.equals(this.f154939a, BaitClickView.this.f154929e)) {
                return;
            }
            BaitClickView.this.f154926b.setImageBitmap(bitmap);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f154942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f154943b;

        public b(String str, int i10) {
            this.f154942a = str;
            this.f154943b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (BaitClickView.this.f154925a == null || !TextUtils.equals(this.f154942a, BaitClickView.this.f154928d)) {
                return;
            }
            BaitClickView.this.f154925a.setImageResource(this.f154943b);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaitClickView.this.f154925a == null || bitmap.isRecycled() || !TextUtils.equals(this.f154942a, BaitClickView.this.f154928d)) {
                return;
            }
            BaitClickView.this.f154925a.setImageBitmap(bitmap);
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f154926b != null) {
                BaitClickView.this.f154926b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f154926b != null) {
                BaitClickView.this.f154926b.setVisibility(0);
            }
        }
    }

    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f154946a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f154926b != null) {
                    BaitClickView.this.f154926b.startAnimation(d.this.f154946a);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f154925a != null) {
                    BaitClickView.this.f154925a.startAnimation(BaitClickView.this.f154935k);
                }
            }
        }

        public d(AnimationSet animationSet) {
            this.f154946a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    public class e implements Animation.AnimationListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f154925a != null) {
                    BaitClickView.this.f154925a.startAnimation(BaitClickView.this.f154935k);
                }
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154928d = "";
        this.f154929e = "";
        this.f154930f = "Click now for details";
        this.f154931g = 1;
        this.f154932h = 1342177280;
        this.f154933i = 0;
        this.f154934j = false;
    }

    private void f() {
        if (this.f154933i == 0) {
            setBackgroundColor(this.f154932h);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f154932h);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(v0.a(getContext(), this.f154933i));
        setBackground(gradientDrawable);
    }

    private void g() {
        if (this.f154926b == null) {
            return;
        }
        int iA = i0.a(getContext(), "mbridge_icon_click_circle", AppIntroBaseFragmentKt.ARG_DRAWABLE);
        if (TextUtils.isEmpty(this.f154929e)) {
            this.f154926b.setImageResource(iA);
        } else {
            String str = this.f154929e;
            com.mbridge.msdk.advanced.manager.e.a().a(str, new a(str, iA));
        }
    }

    private void h() {
        if (this.f154927c == null) {
            return;
        }
        String strM = m();
        this.f154930f = strM;
        this.f154927c.setText(strM);
    }

    private void i() {
        f();
        h();
        g();
        j();
    }

    private void j() {
        if (this.f154925a == null) {
            return;
        }
        int iA = i0.a(getContext(), "mbridge_icon_click_hand", AppIntroBaseFragmentKt.ARG_DRAWABLE);
        if (TextUtils.isEmpty(this.f154928d)) {
            this.f154925a.setImageResource(iA);
        } else {
            String str = this.f154928d;
            com.mbridge.msdk.advanced.manager.e.a().a(str, new b(str, iA));
        }
    }

    private void k() {
        if (!this.f154934j || this.f154925a == null || this.f154926b == null || this.f154927c == null) {
            init();
        }
    }

    private void l() {
        if (this.f154925a == null || this.f154926b == null || this.f154927c == null) {
            try {
                removeAllViews();
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                int iA = v0.a(getContext(), 55.0f);
                int iA2 = v0.a(getContext(), 33.0f);
                this.f154926b = new ImageView(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
                layoutParams.setMargins(iA2, iA2, 0, 0);
                this.f154926b.setLayoutParams(layoutParams);
                int iA3 = v0.a(getContext(), 108.0f);
                int iA4 = v0.a(getContext(), 35.0f);
                int iA5 = v0.a(getContext(), 43.0f);
                this.f154925a = new ImageView(getContext());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA3, iA3);
                layoutParams2.setMargins(iA4, iA5, 0, 0);
                this.f154925a.setLayoutParams(layoutParams2);
                relativeLayout.addView(this.f154926b);
                relativeLayout.addView(this.f154925a);
                LinearLayout linearLayout = new LinearLayout(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(13);
                linearLayout.setLayoutParams(layoutParams3);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.addView(relativeLayout);
                this.f154927c = new TextView(getContext());
                this.f154927c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                this.f154927c.setText(this.f154930f);
                this.f154927c.setTextColor(-1);
                this.f154927c.setGravity(14);
                linearLayout.addView(this.f154927c);
                addView(linearLayout);
            } catch (Throwable th) {
                q0.b("BaitClickView", th.getMessage());
            }
        }
    }

    private String m() {
        if (!TextUtils.isEmpty(this.f154930f)) {
            return this.f154930f;
        }
        try {
            return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            q0.b("BaitClickView", th.getMessage());
            return "Click now for details";
        }
    }

    public void init(int i10) {
        this.f154931g = i10;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f154935k;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f154936l;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f154937m;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f154938n;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.config.component.animation.h
    public View resolveAnimationTarget(String str) {
        k();
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.trim().toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "baithand":
                case "finger":
                case "hand":
                    ImageView imageView = this.f154925a;
                    if (imageView != null) {
                        return imageView;
                    }
                    break;
                case "baittext":
                case "text":
                case "label":
                    TextView textView = this.f154927c;
                    if (textView != null) {
                        return textView;
                    }
                    break;
                case "circle":
                case "ripple":
                case "baitripple":
                    ImageView imageView2 = this.f154926b;
                    if (imageView2 != null) {
                        return imageView2;
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

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f154933i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        k();
        int i10 = this.f154931g;
        if (i10 == 2) {
            this.f154926b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f154926b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f154935k = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f154935k.setRepeatCount(1);
        this.f154935k.setAnimationListener(new e());
        ImageView imageView = this.f154925a;
        if (imageView != null) {
            imageView.startAnimation(this.f154935k);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f154935k = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f154935k.setRepeatCount(-1);
        this.f154935k.setRepeatMode(2);
        ImageView imageView = this.f154925a;
        if (imageView != null) {
            imageView.startAnimation(this.f154935k);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f154936l = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f154936l.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f154937m = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f154937m.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f154936l);
        animationSet.addAnimation(this.f154937m);
        ImageView imageView2 = this.f154926b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f154938n = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f154938n.setRepeatMode(2);
        this.f154938n.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f154936l = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f154936l.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f154937m = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f154937m.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f154936l);
        animationSet.addAnimation(this.f154937m);
        ImageView imageView = this.f154925a;
        if (imageView != null) {
            imageView.startAnimation(this.f154938n);
        }
        ImageView imageView2 = this.f154926b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f154935k = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f154935k.setRepeatCount(-1);
        this.f154935k.setRepeatMode(2);
        ImageView imageView = this.f154925a;
        if (imageView != null) {
            imageView.startAnimation(this.f154935k);
        }
    }

    private void e() {
        ImageView imageView = this.f154926b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f154935k = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f154935k.setRepeatCount(1);
        this.f154935k.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f154936l = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f154936l.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f154937m = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f154937m.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f154936l);
        animationSet.addAnimation(this.f154937m);
        this.f154936l.setAnimationListener(new c());
        this.f154935k.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f154925a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f154935k);
        }
    }

    public void init(int i10, int i11) {
        this.f154932h = i10;
        this.f154931g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f154932h = i10;
        this.f154931g = i11;
        this.f154928d = str;
        this.f154929e = str2;
        this.f154930f = str3;
        init();
    }

    public void init() {
        try {
            l();
            i();
            this.f154934j = true;
        } catch (Throwable th) {
            q0.b("BaitClickView", th.getMessage());
        }
    }
}
