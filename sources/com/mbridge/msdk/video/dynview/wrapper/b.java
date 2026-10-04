package com.mbridge.msdk.video.dynview.wrapper;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f160677a = "mbridge_top_play_bg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f160678b = "mbridge_top_finger_bg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f160679c = "mbridge_bottom_play_bg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f160680d = "mbridge_bottom_finger_bg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f160681e = "mbridge_tv_count";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f160682f = "mbridge_sound_switch";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f160683g = "mbridge_top_control";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f160684h = "mbridge_tv_title";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f160685i = "mbridge_tv_desc";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f160686j = "mbridge_tv_install";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f160687k = "mbridge_sv_starlevel";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f160688l = "mbridge_sv_heat_count_level";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f160689m = "mbridge_tv_cta";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f160690n = "mbridge_native_ec_controller";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f160691o = "mbridge_reward_shape_choice_rl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f160692p = "#FFFFFF";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f160693q = "#FF000000";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f160694r = "#40000000";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f160695s = "#CAEF79";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f160696t = "#2196F3";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f160697u = "#402196F3";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f160698v = "#8FC31F";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f160699w = "#03A9F4";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f160700x = "#FF89C120";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f160701y = "#FF2BAE5D";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f160702z = false;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public void a(View view, com.mbridge.msdk.video.dynview.c cVar) {
    }

    public void b(View view, com.mbridge.msdk.video.dynview.c cVar) {
        Context context;
        int iA;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.h() == 1) {
            view.setBackground(context.getResources().getDrawable(i0.a(context, this.f160691o, AppIntroBaseFragmentKt.ARG_DRAWABLE)));
            TextView textView = (TextView) view.findViewById(b(this.f160684h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f160693q));
            }
            TextView textView2 = (TextView) view.findViewById(b(this.f160685i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f160693q));
            }
            iA = v0.a(context, 2.0f);
        } else {
            iA = v0.a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int iA2 = v0.a(context, 8.0f);
        View viewFindViewById = view.findViewById(b(this.f160686j));
        if (viewFindViewById != null) {
            if (cVar.i() != null && (cVar.i() instanceof MBridgeClickCTAView)) {
                ((MBridgeClickCTAView) cVar.i()).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(viewFindViewById));
            }
            if (viewFindViewById instanceof TextView) {
                TextView textView3 = (TextView) viewFindViewById;
                textView3.setTextColor(Color.parseColor(this.f160692p));
                textView3.setTextSize(15.0f);
                String str = this.f160698v;
                String str2 = this.f160695s;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iA, iA, iA, iA2);
            layoutParams.height = v0.a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    public void a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view == null || !(view instanceof MBridgeFramLayout)) {
            return;
        }
        MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f160702z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f160702z) {
                imageView = (ImageView) view.findViewById(a(this.f160677a));
                imageView2 = (ImageView) view.findViewById(a(this.f160678b));
                imageView3 = (ImageView) view.findViewById(a(this.f160679c));
                imageView4 = (ImageView) view.findViewById(a(this.f160680d));
            } else {
                imageView = (ImageView) view.findViewById(b(this.f160677a));
                imageView2 = (ImageView) view.findViewById(b(this.f160678b));
                imageView3 = (ImageView) view.findViewById(b(this.f160679c));
                imageView4 = (ImageView) view.findViewById(b(this.f160680d));
            }
            ObjectAnimator objectAnimatorB = imageView != null ? new com.mbridge.msdk.video.dynview.ui.b().b(imageView) : null;
            ObjectAnimator objectAnimatorC = imageView2 != null ? new com.mbridge.msdk.video.dynview.ui.b().c(imageView2) : null;
            ObjectAnimator objectAnimatorB2 = imageView3 != null ? new com.mbridge.msdk.video.dynview.ui.b().b(imageView3) : null;
            ObjectAnimator objectAnimatorC2 = imageView4 != null ? new com.mbridge.msdk.video.dynview.ui.b().c(imageView4) : null;
            if (objectAnimatorB == null || objectAnimatorB2 == null || objectAnimatorC == null || objectAnimatorC2 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimatorB, objectAnimatorB2, objectAnimatorC, objectAnimatorC2);
            mBridgeFramLayout.setAnimatorSet(animatorSet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r9, com.mbridge.msdk.video.dynview.c r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.wrapper.b.a(android.view.View, com.mbridge.msdk.video.dynview.c, java.util.Map):void");
    }

    public void b(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        LinearLayout linearLayout;
        View viewFindViewById;
        if (view == null || cVar == null) {
            return;
        }
        Context context = view.getContext();
        if (context != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f160702z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f160702z) {
                linearLayout = (LinearLayout) view.findViewById(a(this.f160687k));
                viewFindViewById = view.findViewById(a(this.f160689m));
            } else {
                linearLayout = (LinearLayout) view.findViewById(b(this.f160687k));
                viewFindViewById = view.findViewById(b(this.f160689m));
            }
            if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                if (cVar.h() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                linearLayout.setOrientation(0);
            }
            a(context, view, cVar);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById;
                    textView.setTextColor(Color.parseColor(this.f160692p));
                    textView.setTextSize(22.0f);
                    com.mbridge.msdk.video.dynview.util.drawable.a.a(viewFindViewById, 1.0f, cVar.l() == 1302 ? 25 : 5, this.f160695s, new String[]{this.f160700x, this.f160701y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                try {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new com.mbridge.msdk.video.dynview.ui.b().a(viewFindViewById));
                    animatorSet.addListener(new a());
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(view, 500L);
    }

    public int b(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }

    private void a(View view) {
        RelativeLayout relativeLayout;
        if (this.f160702z) {
            relativeLayout = (RelativeLayout) view.findViewById(a(this.f160683g));
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(b(this.f160683g));
        }
        if (relativeLayout != null) {
            if (com.mbridge.msdk.video.dynview.constant.a.f160482a == 0 && com.mbridge.msdk.video.dynview.constant.a.f160483b == 0 && com.mbridge.msdk.video.dynview.constant.a.f160484c == 0 && com.mbridge.msdk.video.dynview.constant.a.f160485d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private void a(Context context, View view, com.mbridge.msdk.video.dynview.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(b(this.f160690n));
        if (relativeLayout != null) {
            if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin + com.mbridge.msdk.video.dynview.constant.a.f160482a, layoutParams.topMargin + com.mbridge.msdk.video.dynview.constant.a.f160484c, layoutParams.rightMargin + com.mbridge.msdk.video.dynview.constant.a.f160483b, layoutParams.bottomMargin + com.mbridge.msdk.video.dynview.constant.a.f160485d);
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (relativeLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams2.setMargins(layoutParams2.leftMargin + com.mbridge.msdk.video.dynview.constant.a.f160482a, layoutParams2.topMargin + com.mbridge.msdk.video.dynview.constant.a.f160484c, layoutParams2.rightMargin + com.mbridge.msdk.video.dynview.constant.a.f160483b, layoutParams2.bottomMargin + com.mbridge.msdk.video.dynview.constant.a.f160485d);
                relativeLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    public int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }
}
