package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.ZRu.yBV;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.sAl;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aT {
    View FA;
    FrameLayout Ht;
    View Mm;
    final Activity NOt;
    private int OCA;
    ImageView TFq;
    PAGLogoView Vor;
    RelativeLayout ZH;
    ImageView aT;
    yBV lp;
    protected final com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu mZ;
    public com.bytedance.sdk.openadsdk.core.model.yBV oK;
    private final String om;
    private final boolean qF;
    private boolean to;
    final qF uR;
    private mZ xY;
    com.bytedance.sdk.openadsdk.core.TFq.Ht yBV;
    int ZRu = 3;
    protected int sAl = 0;
    protected final AtomicBoolean edo = new AtomicBoolean(false);
    Runnable WMI = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.aT.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                qF qFVar = aT.this.uR;
                if ((qFVar == null || !qFVar.ACq()) && (imageView = aT.this.TFq) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    aT.this.mZ.Cox.ZRu(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public aT(com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu) {
        this.mZ = zRu;
        this.NOt = zRu.AK;
        this.uR = zRu.NOt;
        this.om = zRu.TFq;
        this.qF = zRu.uR;
    }

    private void qF() {
        RelativeLayout relativeLayout;
        mZ mZVar = (mZ) this.mZ.bO.findViewById(sAl.lp);
        this.xY = mZVar;
        mZVar.ZRu(this.mZ);
        this.Vor = (PAGLogoView) this.mZ.bO.findViewById(520093757);
        this.aT = (ImageView) this.mZ.bO.findViewById(sAl.ACq);
        this.TFq = (ImageView) this.mZ.bO.findViewById(520093708);
        this.Ht = (FrameLayout) this.mZ.bO.findViewById(sAl.ZH);
        this.Mm = this.mZ.bO.findViewById(sAl.WMI);
        this.FA = this.mZ.bO.findViewById(sAl.Pzo);
        this.ZH = (RelativeLayout) this.mZ.bO.findViewById(sAl.jYr);
        yBV ybv = this.lp;
        if (ybv == null || ybv.uR() == null || (relativeLayout = this.ZH) == null) {
            return;
        }
        relativeLayout.addView(this.lp.uR(), new LinearLayout.LayoutParams(-1, -1));
        this.lp.NOt();
    }

    public void FA() {
        mZ mZVar = this.xY;
        if (mZVar == null) {
            return;
        }
        mZVar.ZRu();
    }

    public FrameLayout Ht() {
        return this.Ht;
    }

    public void Mm() {
        if (this.aT.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.aT.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.aT.setLayoutParams(marginLayoutParams);
        }
    }

    public void NOt() {
        if (this.to) {
            return;
        }
        this.to = true;
        this.OCA = this.mZ.Gis;
        if (ZRu()) {
            yBV ybv = new yBV(this.mZ);
            this.lp = ybv;
            ybv.ZRu();
        }
        qF();
        Activity activity = this.NOt;
        qF qFVar = this.uR;
        String str = this.om;
        FrameLayout frameLayout = this.Ht;
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.mZ;
        com.bytedance.sdk.openadsdk.core.model.yBV ybv2 = new com.bytedance.sdk.openadsdk.core.model.yBV(activity, qFVar, str, frameLayout, zRu.Vr, zRu.bO);
        this.oK = ybv2;
        ybv2.ZRu();
    }

    public void TFq() {
        int iFWk = this.uR.fWk();
        this.ZRu = iFWk;
        if (iFWk == -200) {
            this.ZRu = WMI.uR().oK(String.valueOf(this.uR.GE()));
        }
        if (this.ZRu != -1 || ZRu() || (this.mZ.f140659Oc instanceof com.bytedance.sdk.openadsdk.component.reward.NOt.mZ)) {
            return;
        }
        NOt(0);
    }

    public boolean Vor() {
        ImageView imageView = this.TFq;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void WMI() {
        com.bytedance.sdk.openadsdk.core.NOt.TFq TFq = this.mZ.f140658Nb.TFq();
        View view = this.xY;
        if (view == null) {
            view = this.mZ.bO;
        }
        TFq.onClick(view);
    }

    public View ZH() {
        return this.xY;
    }

    public boolean ZRu() {
        return true;
    }

    public View aT() {
        return this.TFq;
    }

    public void edo() {
        com.bytedance.sdk.openadsdk.core.model.yBV ybv = this.oK;
        if (ybv != null) {
            ybv.TFq();
        }
        ImageView imageView = this.TFq;
        if (imageView != null) {
            imageView.removeCallbacks(this.WMI);
        }
    }

    public void lp() {
        try {
            yBV ybv = this.lp;
            if (ybv != null) {
                ybv.mZ();
            }
            RelativeLayout relativeLayout = this.ZH;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.ZH;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void mZ() {
        this.Ht.removeAllViews();
    }

    public void oK() {
        com.bytedance.sdk.openadsdk.core.model.yBV ybv = this.oK;
        if (ybv != null) {
            ybv.Ht();
        }
    }

    public void sAl() {
        try {
            Activity activity = this.mZ.AK;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, om.Vor(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.mZ.Ho.lp();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.aT.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        aT.this.mZ.Ho.lp();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.mZ.Ho.ZRu(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.mZ.Ho.lp();
        }
    }

    public void uR() {
        Cox.ZRu((View) this.Ht, 8);
        Cox.ZRu(this.Mm, 8);
        Cox.ZRu(this.FA, 8);
        NOt(8);
        Cox.ZRu((View) this.TFq, 8);
        Cox.ZRu((View) this.Vor, 8);
        Cox.ZRu((View) this.ZH, 8);
        Cox.ZRu((View) this.aT, 8);
    }

    public void yBV() {
        com.bytedance.sdk.openadsdk.core.model.yBV ybv = this.oK;
        if (ybv != null) {
            ybv.Mm();
        }
    }

    public void mZ(int i10) {
        Cox.ZRu((View) this.Vor, i10);
    }

    public void ZRu(boolean z10) {
        Cox.ZRu((View) this.Vor, xY.mZ(this.uR) ? 8 : 0);
        Cox.ZRu((View) this.aT, (this.uR.wcb() && this.uR.FA()) ? 0 : 8);
        NOt(z10);
        if (this.qF) {
            TFq();
        }
    }

    public void TFq(int i10) {
        Cox.ZRu((View) this.TFq, i10);
        if (i10 == 0 && !this.mZ.aT.get() && xY.Mm(this.mZ.NOt)) {
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.mZ;
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(zRu.NOt, zRu.TFq, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.mZ.gX);
        }
    }

    public void ZRu(int i10) {
        if (this.yBV == null) {
            this.yBV = new com.bytedance.sdk.openadsdk.core.TFq.Ht(this.mZ.AK);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.yBV.setLayoutParams(layoutParams);
            this.yBV.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(this.mZ.AK, "tt_video_loading_progress_bar"));
            this.mZ.Ho.Ht().addView(this.yBV);
        }
        this.yBV.setVisibility(i10);
    }

    public void uR(int i10) {
        int i11 = this.ZRu;
        if (i11 == -1 || i10 != i11 || this.edo.get()) {
            return;
        }
        NOt(0);
        this.edo.set(true);
        FA();
    }

    public void NOt(boolean z10) {
        ImageView imageView;
        int iZRu;
        if (this.OCA != 1 && (imageView = this.TFq) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iZRu = ZRu("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iZRu > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iZRu;
                }
            }
        }
        if (this.mZ.f140659Oc instanceof com.bytedance.sdk.openadsdk.component.reward.NOt.mZ) {
            return;
        }
        NOt(0);
    }

    public void ZRu(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.uR.VdW() == 1 && (frameLayout = this.Ht) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iMZ = Cox.mZ((Context) this.NOt);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Ht.getLayoutParams();
            layoutParams.width = iMZ;
            int i12 = (iMZ * 9) / 16;
            layoutParams.height = i12;
            this.Ht.setLayoutParams(layoutParams);
            this.sAl = (Cox.uR((Context) this.NOt) - i12) / 2;
            lp.ZRu("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.sAl);
        }
    }

    public void NOt(int i10) {
        qF qFVar = this.uR;
        if (qFVar != null && qFVar.wcb() && com.bytedance.sdk.openadsdk.core.model.sAl.ZRu(this.uR)) {
            Cox.ZRu((View) this.xY, 8);
        } else {
            Cox.ZRu((View) this.xY, i10);
        }
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.NOt.mZ mZVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        qF qFVar;
        if (this.Ht != null && (qFVar = this.uR) != null && qFVar.th() != null) {
            if (this.uR.th().Ht && !com.bytedance.sdk.openadsdk.core.model.yBV.NOt(this.uR)) {
                ZRu((View.OnClickListener) mZVar);
                ZRu(mZVar);
            } else {
                ZRu(onClickListener);
            }
        }
        qF qFVar2 = this.uR;
        if (qFVar2 != null && qFVar2.VdW() == 1) {
            if (this.uR.th() != null && (view2 = this.Mm) != null) {
                Cox.ZRu(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Mm.getLayoutParams();
                layoutParams.height = this.sAl;
                this.Mm.setLayoutParams(layoutParams);
                if (this.uR.th().NOt) {
                    this.Mm.setOnClickListener(mZVar);
                    this.Mm.setOnTouchListener(onTouchListener);
                } else {
                    this.Mm.setOnClickListener(onClickListener);
                }
            }
            if (this.uR.th() != null && (view = this.FA) != null) {
                Cox.ZRu(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.FA.getLayoutParams();
                layoutParams2.height = this.sAl;
                this.FA.setLayoutParams(layoutParams2);
                if (this.uR.th().uR) {
                    this.FA.setOnClickListener(mZVar);
                    this.FA.setOnTouchListener(onTouchListener);
                } else {
                    this.FA.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.Vor;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.aT.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        aT aTVar = aT.this;
                        TTWebsiteActivity.ZRu(aTVar.NOt, aTVar.uR, aTVar.om);
                    } catch (Throwable th) {
                        lp.ZRu("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.aT;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().ZRu((int) Cox.ZRu(WMI.ZRu(), 14.0f, true), this.aT, this.mZ.NOt);
        }
    }

    private int ZRu(String str) {
        Resources resources = this.NOt.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void ZRu(View.OnClickListener onClickListener) {
        Cox.ZRu(this.Ht, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void ZRu(com.bytedance.sdk.openadsdk.core.NOt.mZ mZVar) {
        Cox.ZRu((View) this.Ht, (View.OnTouchListener) mZVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void ZRu(float f10) {
        Cox.ZRu(this.TFq, f10);
    }

    public void ZRu(Animation animation) {
        RelativeLayout relativeLayout = this.ZH;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }
}
