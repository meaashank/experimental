package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.launcher3.IconCache;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class SegmentsProgressBar extends ComponentLinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f154997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f155001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f155002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f155004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<ProgressBar> f155005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f155006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f155007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f155008l;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public SegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154997a = "MBridgeSegmentsProgressBar";
        this.f154999c = 1;
        this.f155000d = 20;
        this.f155001e = 10;
        this.f155002f = 1;
        this.f155003g = -1711276033;
        this.f155004h = -1;
        this.f155005i = new ArrayList();
        this.f155008l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f155008l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        int i10 = this.f154999c;
        if (i10 == 1) {
            setOrientation(1);
            if (TextUtils.isEmpty(this.f155007k)) {
                this.f155007k = this.f155008l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
            }
        } else if (i10 == 2) {
            setOrientation(0);
            if (TextUtils.isEmpty(this.f155007k)) {
                this.f155007k = this.f155008l ? "广告 %s/%s" : "ADS %s/%s";
            }
        }
        this.f155005i.clear();
        removeAllViews();
        setBackground(getBackgroundDrawable());
        TextView textView = new TextView(getContext());
        this.f155006j = textView;
        textView.setTextColor(-1);
        this.f155006j.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f155006j.setLayoutParams(layoutParams);
        int i11 = this.f154999c;
        if (i11 == 1) {
            layoutParams.gravity = 5;
            TextView textView2 = this.f155006j;
            int i12 = this.f155000d / 2;
            textView2.setPadding(i12, 15, i12, 5);
        } else if (i11 == 2) {
            this.f155006j.setGravity(16);
            TextView textView3 = this.f155006j;
            int i13 = this.f155000d / 2;
            textView3.setPadding(i13, 0, i13, 0);
        }
        try {
            int iA = i0.a(getContext(), "mbridge_reward_video_icon", AppIntroBaseFragmentKt.ARG_DRAWABLE);
            if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f155006j.setCompoundDrawables(drawable, null, null, null);
                this.f155006j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i14 = 0; i14 < this.f154998b; i14++) {
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(getSegmentLayerDrawable());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            int i15 = this.f155000d / 2;
            layoutParams3.leftMargin = i15;
            layoutParams3.rightMargin = i15;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.f155005i.add(progressBar);
        }
        int i16 = this.f154999c;
        if (i16 == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.f155006j);
            addView(linearLayout);
        } else {
            if (i16 != 2) {
                addView(linearLayout);
                return;
            }
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.f155006j);
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f155001e);
        gradientDrawable.setColor(this.f155003g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f155001e);
        gradientDrawable2.setColor(this.f155004h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new a());
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f154998b = i10;
        this.f154999c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f155007k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f155005i.isEmpty()) {
                return;
            }
            if (i11 < this.f155005i.size()) {
                this.f155005i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f155002f) {
                this.f155002f = i12;
                TextView textView = this.f155006j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            this.f154998b = Integer.parseInt(String.valueOf(map.get("count")));
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
            this.f154998b = 1;
        }
        try {
            this.f154999c = Integer.parseInt(String.valueOf(map.get("style")));
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            this.f154999c = 0;
        }
        init(this.f154998b, this.f154999c);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String lowerCase = str.toLowerCase();
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
            return;
        }
        int i11 = 0;
        try {
            i10 = (lowerCase.contains("percent") || lowerCase.contains("progress")) ? strValueOf.contains(IconCache.EMPTY_CLASS_NAME) ? (int) (Double.parseDouble(strValueOf) * 100.0d) : Integer.parseInt(strValueOf) : 0;
        } catch (Throwable th) {
            th = th;
            i10 = 0;
        }
        try {
            if (lowerCase.contains(FirebaseAnalytics.Param.INDEX)) {
                i11 = Integer.parseInt(strValueOf);
            }
        } catch (Throwable th2) {
            th = th2;
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        setProgress(i10, i11);
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f154998b = i10;
        this.f154999c = i11;
        this.f155004h = i12;
        this.f155003g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f154998b = i10;
        this.f154999c = i11;
        this.f155004h = i12;
        this.f155003g = i13;
        this.f155000d = i14;
        this.f155001e = i15;
        a();
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f155007k, Integer.valueOf(i10), Integer.valueOf(this.f154998b)));
            return sb2;
        } catch (Throwable th) {
            androidx.viewpager.widget.a.a(sb2, this.f154998b, "videos, the", i10, " is playing.");
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
            return sb2;
        }
    }
}
