package com.prism.fusionadsdk.internal.activity;

import J6.g;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC1486c;
import com.prism.fusionadsdkbase.widget.CircleProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public class NativeInterstitialBaseActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f162259h = "765-NativeInterstitialBaseActivity";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f162260i = "extra_ad_show_param";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeIntersitialActivityParams f162263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f162264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CircleProgressBar f162265e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public T6.a f162267g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f162261a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f162262b = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f162266f = null;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String unused = NativeInterstitialBaseActivity.f162259h;
            new StringBuilder("mNavigationKeyEventReceiver.onReceive intent:").append(intent);
            if (intent == null || !"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction())) {
                return;
            }
            NativeInterstitialBaseActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeInterstitialBaseActivity.this.f162267g.b();
            NativeInterstitialBaseActivity.this.finish();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            String unused = NativeInterstitialBaseActivity.f162259h;
            NativeInterstitialBaseActivity.this.f162265e.q(iIntValue);
        }
    }

    public class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NativeInterstitialBaseActivity.this.f162265e.setVisibility(8);
            NativeInterstitialBaseActivity.this.f162266f.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public int W0() {
        return this.f162263c.f162255c;
    }

    public String X0() {
        return this.f162263c.f162253a;
    }

    public int Y0() {
        return g.k.f56293C;
    }

    public final boolean Z0() {
        TextView textView = (TextView) findViewById(g.h.f55831H0);
        if (textView != null) {
            textView.setText(X0());
        }
        ImageView imageView = (ImageView) findViewById(g.h.f55823G0);
        if (imageView != null) {
            imageView.setImageResource(W0());
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(g.h.f56082l0);
        Object obj = this.f162264d;
        if (obj != null && ((J6.c) obj).f53198a != null) {
            ((J6.c) obj).f53198a.show(frameLayout);
            return true;
        }
        T6.a aVar = this.f162267g;
        if (aVar != null) {
            aVar.b();
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Y0());
        NativeIntersitialActivityParams nativeIntersitialActivityParams = (NativeIntersitialActivityParams) getIntent().getSerializableExtra(f162260i);
        this.f162263c = nativeIntersitialActivityParams;
        this.f162264d = L6.a.c(nativeIntersitialActivityParams.f162254b);
        this.f162267g = L6.a.b(this.f162263c.f162254b);
        Z0();
        if (this.f162264d != null) {
            findViewById(g.h.f55815F0).setVisibility(this.f162263c.f162258f ? 0 : 8);
            if (this.f162263c.f162257e) {
                this.f162266f = findViewById(g.h.f55996b4);
            }
            if (this.f162266f == null) {
                this.f162266f = findViewById(g.h.f55987a4);
            }
            this.f162266f.setOnClickListener(new b());
            CircleProgressBar circleProgressBar = (CircleProgressBar) findViewById(g.h.f56056i1);
            this.f162265e = circleProgressBar;
            if (circleProgressBar != null) {
                circleProgressBar.p(8000);
                this.f162265e.setVisibility(0);
                this.f162266f.setVisibility(8);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 8000);
                valueAnimatorOfInt.setDuration(8000L);
                valueAnimatorOfInt.addUpdateListener(new c());
                valueAnimatorOfInt.addListener(new d());
                valueAnimatorOfInt.start();
            }
        } else {
            T6.a aVar = this.f162267g;
            if (aVar != null) {
                aVar.b();
            }
            finish();
        }
        this.f162261a = false;
    }

    @Override // androidx.appcompat.app.ActivityC1486c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f162267g.b();
            finish();
        }
        return i10 == 4 || super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f162261a) {
            finish();
        } else {
            this.f162261a = true;
        }
    }
}
