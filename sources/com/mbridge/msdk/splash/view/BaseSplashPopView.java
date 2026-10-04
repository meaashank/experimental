package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import e.T;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f158957v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f158958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f158959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f158960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CampaignEx f158961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f158962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f158963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f158964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f158965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f158966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f158967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f158968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f158969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f158970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Handler f158971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f158972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f158973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f158974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f158975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f158976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View.OnClickListener f158977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    View.OnClickListener f158978u;

    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iA;
            int iA2;
            if (BaseSplashPopView.this.f158960c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA3 = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iA = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA3;
                iA2 = v0.a(BaseSplashPopView.this.getContext(), 10.0f) + iA3;
            } else {
                iA = 0;
                iA2 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, iA, iA2);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f158980a;

        public b(boolean z10) {
            this.f158980a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f158980a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f158963f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f158965h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f158964g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f158969l != null) {
                if (BaseSplashPopView.this.f158970m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f158969l.setText(String.valueOf(BaseSplashPopView.this.f158970m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f158971n.postDelayed(baseSplashPopView.f158975r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f158970m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f158971n.removeCallbacks(baseSplashPopView2.f158975r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f158962e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f158958a, baseSplashPopView3.f158959b), 5);
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f158962e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f158958a, baseSplashPopView.f158959b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f158960c);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f158962e != null) {
                baseSplashPopView.b(baseSplashPopView.f158961d);
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f158970m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f158962e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f158958a, baseSplashPopView.f158959b), 4);
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f158988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f158989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f158990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CampaignEx f158991d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f158988a = str;
            this.f158989b = str2;
            this.f158990c = i10;
            this.f158991d = campaignEx;
        }

        public CampaignEx a() {
            return this.f158991d;
        }

        public String b() {
            return this.f158988a;
        }

        public String c() {
            return this.f158989b;
        }

        public int d() {
            return this.f158990c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f158960c = 1;
        this.f158970m = -1;
        this.f158971n = new Handler();
        this.f158972o = false;
        this.f158974q = new a();
        this.f158975r = new e();
        this.f158976s = new f();
        this.f158977t = new g();
        this.f158978u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f158959b = iVar.c();
        this.f158958a = iVar.b();
        this.f158960c = iVar.d();
        this.f158961d = iVar.a();
        this.f158962e = dVar;
        a();
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.advanced.manager.e.a().a(str, new b(z10));
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f158970m;
        baseSplashPopView.f158970m = i10 - 1;
        return i10;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f158957v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.advanced.manager.e.a().a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.advanced.manager.e.a().a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f158962e != null) {
            postDelayed(this.f158976s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f158972o = true;
        if (this.f158969l != null) {
            this.f158971n.removeCallbacks(this.f158975r);
        }
    }

    public void reStartCountDown() {
        if (this.f158972o) {
            this.f158972o = false;
            int i10 = this.f158970m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f158969l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f158971n.postDelayed(this.f158975r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f158971n.removeCallbacks(this.f158976s);
            this.f158971n.removeCallbacks(this.f158975r);
            this.f158975r = null;
            detachAllViewsFromParent();
            this.f158961d = null;
            this.f158962e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f158959b = iVar.c();
        this.f158958a = iVar.b();
        this.f158960c = iVar.d();
        this.f158961d = iVar.a();
        this.f158962e = dVar;
        a();
    }

    public void startCountDown() {
        this.f158971n.removeCallbacks(this.f158975r);
        CampaignEx campaignEx = this.f158961d;
        if (campaignEx == null || this.f158960c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f158970m = flbSkipTime;
        TextView textView = this.f158969l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f158971n.postDelayed(this.f158975r, 1000L);
        }
    }

    private void b() {
        String language;
        this.f158966i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f158963f.getId());
        this.f158966i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            q0.b("MBSplashPopView", th.getMessage());
            language = "ZH";
        }
        this.f158966i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f158966i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f158963f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f158963f.setId(generateViewId());
        this.f158963f.setLayoutParams(layoutParams2);
        this.f158963f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f158961d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f158961d.getIconUrl(), true);
        }
        this.f158969l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.f158969l.setId(generateViewId());
        this.f158969l.setTextSize(10.0f);
        this.f158969l.setTextColor(-1);
        this.f158969l.setGravity(17);
        this.f158969l.setMinWidth(v0.a(getContext(), 16.0f));
        this.f158969l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.f158969l.setLayoutParams(layoutParams3);
        this.f158969l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.f158969l);
        addView(this.f158963f);
        CampaignEx campaignEx2 = this.f158961d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f158961d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f158961d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f158977t);
        this.f158969l.setOnClickListener(this.f158978u);
    }

    private void d() {
        this.f158965h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f158965h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f158965h.setId(generateViewId());
        this.f158965h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f158961d.getImageUrl());
        this.f158964g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f158964g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f158964g.setId(generateViewId());
        this.f158964g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f158961d.getImageUrl());
        this.f158963f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f158965h.getId());
        layoutParams3.topMargin = 20;
        this.f158963f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f158963f.setId(generateViewId());
        this.f158963f.setLayoutParams(layoutParams3);
        a(this.f158961d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f158963f.getId());
        layoutParams4.addRule(6, this.f158963f.getId());
        layoutParams4.addRule(8, this.f158963f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f158967j = textView;
        textView.setId(generateViewId());
        this.f158967j.setGravity(16);
        this.f158967j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f158967j.setTextSize(12.0f);
        this.f158967j.setTextColor(-16777216);
        TextView textView2 = this.f158967j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f158967j.setMarqueeRepeatLimit(-1);
        this.f158967j.setSelected(true);
        this.f158967j.setSingleLine(true);
        this.f158967j.setText(this.f158961d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f158968k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f158967j.getId());
        layoutParams5.addRule(3, this.f158967j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f158968k.setGravity(16);
        this.f158968k.setLayoutParams(layoutParams5);
        this.f158968k.setTextSize(8.0f);
        this.f158968k.setTextColor(-10066330);
        this.f158968k.setEllipsize(truncateAt);
        this.f158968k.setMarqueeRepeatLimit(-1);
        this.f158968k.setSelected(true);
        this.f158968k.setSingleLine(true);
        this.f158968k.setText(this.f158961d.getAppDesc());
        relativeLayout.addView(this.f158967j);
        relativeLayout.addView(this.f158968k);
        addView(this.f158965h);
        addView(this.f158964g);
        addView(this.f158963f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f158961d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f158961d.getBidToken(), eVar, this.f158961d, this.f158959b).t(), this.f158961d.getLocalAllowTrackClick());
        setOnClickListener(this.f158977t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f158963f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f158963f.setId(generateViewId());
        this.f158963f.setLayoutParams(layoutParams);
        this.f158963f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f158963f.setPadding(iA, iA, iA, iA);
        a(this.f158961d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f158963f.getId());
        layoutParams2.addRule(6, this.f158963f.getId());
        layoutParams2.addRule(8, this.f158963f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f158967j = textView;
        textView.setId(generateViewId());
        this.f158967j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f158967j.setGravity(16);
        this.f158967j.setTextSize(12.0f);
        this.f158967j.setSelected(true);
        TextView textView2 = this.f158967j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f158967j.setMarqueeRepeatLimit(-1);
        this.f158967j.setSingleLine(true);
        this.f158967j.setTextColor(-16777216);
        this.f158967j.setText(this.f158961d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f158968k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f158967j.getId());
        layoutParams3.addRule(3, this.f158967j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f158968k.setGravity(16);
        this.f158968k.setLayoutParams(layoutParams3);
        this.f158968k.setTextSize(8.0f);
        this.f158968k.setTextColor(-10066330);
        this.f158968k.setEllipsize(truncateAt);
        this.f158968k.setMarqueeRepeatLimit(-1);
        this.f158968k.setSelected(true);
        this.f158968k.setSingleLine(true);
        this.f158968k.setText(this.f158961d.getAppDesc());
        relativeLayout.addView(this.f158967j);
        relativeLayout.addView(this.f158968k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f158963f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f158961d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f158961d.getBidToken(), eVar, this.f158961d, this.f158959b).t(), this.f158961d.getLocalAllowTrackClick());
        setOnClickListener(this.f158977t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f158963f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f158963f.setId(generateViewId());
        this.f158963f.setLayoutParams(layoutParams);
        this.f158963f.setPadding(iA, iA, iA, iA);
        this.f158963f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f158961d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f158967j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f158963f.getId());
        layoutParams2.addRule(6, this.f158963f.getId());
        layoutParams2.addRule(8, this.f158963f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f158967j.setLayoutParams(layoutParams2);
        this.f158967j.setGravity(16);
        this.f158967j.setTextSize(10.0f);
        this.f158967j.setSelected(true);
        this.f158967j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f158967j.setMarqueeRepeatLimit(-1);
        this.f158967j.setSingleLine(true);
        this.f158967j.setTextColor(-16777216);
        this.f158967j.setText(this.f158961d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f158963f);
        addView(this.f158967j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f158961d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f158961d.getBidToken(), eVar, this.f158961d, this.f158959b).t(), this.f158961d.getLocalAllowTrackClick());
        setOnClickListener(this.f158977t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f158969l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.f158969l.setLayoutParams(layoutParams);
            this.f158969l.setText("");
            this.f158969l.setSelected(true);
            this.f158969l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    private void a() {
        if (this.f158961d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f158960c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    public void a(CampaignEx campaignEx) {
        if (this.f158973p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f158959b);
            this.f158973p = aVar;
            aVar.a(this.f158974q);
        }
        campaignEx.setCampaignUnitId(this.f158959b);
        this.f158973p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f158962e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f158958a, this.f158959b));
            this.f158962e.a(new MBridgeIds(this.f158958a, this.f158959b), 6);
        }
    }

    public void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f158959b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f158960c = 1;
        this.f158970m = -1;
        this.f158971n = new Handler();
        this.f158972o = false;
        this.f158974q = new a();
        this.f158975r = new e();
        this.f158976s = new f();
        this.f158977t = new g();
        this.f158978u = new h();
        this.f158960c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f158960c = 1;
        this.f158970m = -1;
        this.f158971n = new Handler();
        this.f158972o = false;
        this.f158974q = new a();
        this.f158975r = new e();
        this.f158976s = new f();
        this.f158977t = new g();
        this.f158978u = new h();
        this.f158960c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f158960c = 1;
        this.f158970m = -1;
        this.f158971n = new Handler();
        this.f158972o = false;
        this.f158974q = new a();
        this.f158975r = new e();
        this.f158976s = new f();
        this.f158977t = new g();
        this.f158978u = new h();
        this.f158960c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    @T(api = 21)
    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f158960c = 1;
        this.f158970m = -1;
        this.f158971n = new Handler();
        this.f158972o = false;
        this.f158974q = new a();
        this.f158975r = new e();
        this.f158976s = new f();
        this.f158977t = new g();
        this.f158978u = new h();
        this.f158960c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
