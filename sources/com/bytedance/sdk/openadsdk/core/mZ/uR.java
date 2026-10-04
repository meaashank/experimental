package com.bytedance.sdk.openadsdk.core.mZ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.FA.Vor;
import com.bytedance.sdk.openadsdk.core.FA.om;
import com.bytedance.sdk.openadsdk.core.Mm;
import com.bytedance.sdk.openadsdk.core.NOt.NOt;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.bytedance.sdk.openadsdk.utils.fcs;
import com.bytedance.sdk.openadsdk.utils.gI;
import com.bytedance.sdk.openadsdk.utils.xY;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends PAGBannerAd {
    private PAGBannerAdWrapperListener FA;
    private final boolean Mm;
    protected final Context NOt;
    TTDislikeDialogAbstract TFq;
    private com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Ht Vor;
    private boolean ZH;
    protected mZ ZRu;
    private om edo;
    private boolean lp;
    protected qF mZ;
    protected AdSlot uR;
    private boolean yBV;
    private final Queue<Long> aT = new LinkedList();
    private String sAl = "banner_ad";
    private final AtomicBoolean oK = new AtomicBoolean(false);
    protected final View.OnAttachStateChangeListener Ht = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (uR.this.yBV) {
                return;
            }
            uR uRVar = uR.this;
            uRVar.ZRu(uRVar.ZRu.getCurView(), uR.this.mZ);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            uR.this.ZRu.mZ();
        }
    };

    public static class NOt extends FA {
        qF NOt;
        boolean ZRu;
        WeakReference<uR> mZ;

        public NOt(boolean z10, qF qFVar, uR uRVar) {
            super("ReportWindowFocusChangedAdShow");
            this.ZRu = z10;
            this.NOt = qFVar;
            this.mZ = new WeakReference<>(uRVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<uR> weakReference = this.mZ;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.mZ.get().NOt(this.ZRu, this.NOt);
        }
    }

    public interface ZRu {
        void ZRu();
    }

    public uR(Context context, qF qFVar, AdSlot adSlot) {
        this.NOt = context;
        this.mZ = qFVar;
        this.uR = adSlot;
        ZRu(context, qFVar, adSlot);
        this.Mm = false;
        this.yBV = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            try {
                mZVar.mZ();
                this.ZRu.removeOnAttachStateChangeListener(this.Ht);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.NOt.ZRu(this.mZ);
        IPMiBroadcastReceiver.ZRu(this.NOt, this.mZ);
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        qF qFVar = this.mZ;
        if (qFVar == null || qFVar.zkn() == null) {
            return null;
        }
        try {
            return this.mZ.zkn().get(str);
        } catch (Throwable th) {
            lp.ZRu("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        qF qFVar = this.mZ;
        if (qFVar != null) {
            return qFVar.zkn();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.lp) {
            return;
        }
        fcs.ZRu(this.mZ, d10, str, str2);
        this.lp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        TFq tFq = new TFq(pAGBannerAdInteractionCallback);
        this.FA = tFq;
        this.ZRu.setExpressInteractionListener(tFq);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        TFq tFq = new TFq(pAGBannerAdInteractionListener);
        this.FA = tFq;
        this.ZRu.setExpressInteractionListener(tFq);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.ZH) {
            return;
        }
        fcs.ZRu(this.mZ, d10);
        this.ZH = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ() {
        NOt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(boolean z10, qF qFVar) {
        Long lPoll;
        try {
            if (z10) {
                this.aT.offer(Long.valueOf(System.currentTimeMillis()));
            } else {
                if (this.aT.size() <= 0 || this.edo == null || (lPoll = this.aT.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.uR.mZ.ZRu(String.valueOf(System.currentTimeMillis() - lPoll.longValue()), qFVar, this.sAl, this.edo.getAdShowTime());
            }
        } catch (Exception e10) {
            lp.ZRu("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void ZRu(Context context, qF qFVar, AdSlot adSlot) {
        mZ mZVar = new mZ(context, qFVar, adSlot);
        this.ZRu = mZVar;
        mZVar.addOnAttachStateChangeListener(this.Ht);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ZRu(@NonNull final om omVar, @NonNull qF qFVar) {
        final qF qFVar2;
        uR uRVar;
        final om omVar2;
        final com.bytedance.sdk.openadsdk.core.Mm mm;
        if (omVar == null || qFVar == null) {
            return;
        }
        this.mZ = qFVar;
        this.Vor = ZRu(qFVar);
        this.edo = omVar;
        final String strZRu = xY.ZRu();
        final ZRu ZRu2 = ZRu();
        omVar.setClosedListenerKey(strZRu);
        omVar.setBannerClickClosedListener(ZRu2);
        omVar.setBackupListener(new com.bytedance.sdk.component.adexpress.NOt.mZ() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.2
            @Override // com.bytedance.sdk.component.adexpress.NOt.mZ
            public boolean ZRu(ViewGroup viewGroup, int i10) {
                try {
                    omVar.lp();
                    if (!uR.this.mZ.wcb()) {
                        com.bytedance.sdk.openadsdk.core.mZ.ZRu zRu = new com.bytedance.sdk.openadsdk.core.mZ.ZRu(omVar.getContext());
                        zRu.setClosedListenerKey(strZRu);
                        uR uRVar2 = uR.this;
                        zRu.ZRu(uRVar2.mZ, omVar, uRVar2.Vor);
                        zRu.setDislikeOuter(uR.this.TFq);
                        zRu.setAdInteractionListener(uR.this.FA);
                        return true;
                    }
                    Mm mm2 = new Mm(omVar.getContext());
                    mm2.setClosedListenerKey(strZRu);
                    uR uRVar3 = uR.this;
                    mm2.ZRu(uRVar3.mZ, omVar, uRVar3.Vor);
                    mm2.setDislikeOuter(uR.this.TFq);
                    mm2.setAdInteractionListener(uR.this.FA);
                    omVar.setVastVideoHelper(mm2);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.Mm) {
            com.bytedance.sdk.openadsdk.core.Mm mmZRu = ZRu(omVar);
            if (mmZRu == null) {
                mmZRu = new com.bytedance.sdk.openadsdk.core.Mm(this.NOt, omVar);
                omVar.addView(mmZRu);
            }
            mm = mmZRu;
            uRVar = this;
            qFVar2 = qFVar;
            omVar2 = omVar;
            mm.setCallback(new Mm.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.3
                @Override // com.bytedance.sdk.openadsdk.core.Mm.ZRu
                public void NOt() {
                    uR.this.ZRu(mm, false, qFVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.Mm.ZRu
                public void ZRu(boolean z10) {
                    uR.this.ZRu(z10, qFVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.Mm.ZRu
                public void ZRu() {
                    uR.this.mZ();
                }

                @Override // com.bytedance.sdk.openadsdk.core.Mm.ZRu
                public void ZRu(View view) {
                    if (uR.this.oK.compareAndSet(false, true)) {
                        uR.this.ZRu(view, omVar2, qFVar2, strZRu, ZRu2);
                    }
                }
            });
        } else {
            qFVar2 = qFVar;
            uRVar = this;
            gI.NOt nOt = new gI.NOt() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.4
                @Override // com.bytedance.sdk.openadsdk.utils.gI.NOt
                public void NOt() {
                    uR.this.ZRu((com.bytedance.sdk.openadsdk.core.Mm) null, true, qFVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.gI.NOt
                public void ZRu(boolean z10) {
                    uR.this.ZRu(z10, qFVar2);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.gI.NOt
                public void ZRu() {
                    uR.this.mZ();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.gI.NOt
                public void ZRu(View view, boolean z10) {
                    if (z10 && uR.this.oK.compareAndSet(false, true)) {
                        uR.this.ZRu(view, omVar, qFVar2, strZRu, ZRu2);
                    }
                }
            };
            omVar2 = omVar;
            mm = null;
            gI.ZRu(omVar2, true, 1, nOt, null);
        }
        Context contextZRu = com.bytedance.sdk.component.utils.NOt.ZRu(omVar2);
        if (contextZRu == null) {
            contextZRu = uRVar.NOt;
        }
        Vor vor = new Vor(contextZRu, qFVar2, uRVar.sAl, 2);
        vor.ZRu(omVar2);
        vor.ZRu(this);
        vor.ZRu(uRVar.Vor);
        vor.ZRu(new NOt.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.5
            @Override // com.bytedance.sdk.openadsdk.core.NOt.NOt.ZRu
            public void ZRu(View view, int i10) {
                if (uR.this.FA != null) {
                    uR.this.FA.onAdClicked();
                }
            }
        });
        omVar2.setClickListener(vor);
        com.bytedance.sdk.openadsdk.core.FA.FA fa2 = new com.bytedance.sdk.openadsdk.core.FA.FA(uRVar.NOt, qFVar2, uRVar.sAl, 2);
        fa2.ZRu((View) omVar2);
        fa2.ZRu(this);
        fa2.ZRu(new NOt.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.6
            @Override // com.bytedance.sdk.openadsdk.core.NOt.NOt.ZRu
            public void ZRu(View view, int i10) {
                if (uR.this.FA != null) {
                    uR.this.FA.onAdClicked();
                }
            }
        });
        om omVar3 = uRVar.edo;
        if (omVar3 instanceof com.bytedance.sdk.openadsdk.core.FA.qF) {
            fa2.ZRu(((com.bytedance.sdk.openadsdk.core.FA.qF) omVar3).getVideoController());
        }
        fa2.ZRu(uRVar.Vor);
        omVar2.setClickCreativeListener(fa2);
        if (uRVar.Mm) {
            return;
        }
        mm.setNeedCheckingShow(true);
    }

    private void NOt(qF qFVar) {
        Queue<Long> queue = this.aT;
        if (queue == null || queue.size() <= 0 || qFVar == null) {
            return;
        }
        try {
            long jLongValue = this.aT.poll().longValue();
            if (jLongValue <= 0 || this.edo == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(String.valueOf(System.currentTimeMillis() - jLongValue), qFVar, this.sAl, this.edo.getAdShowTime());
        } catch (Exception e10) {
            lp.ZRu("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void NOt() {
        this.mZ.ZRu(SystemClock.elapsedRealtime());
        this.ZRu.NOt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(boolean z10, qF qFVar) {
        if (z10 && this.mZ.QbX() && !this.mZ.MEE()) {
            this.mZ.Mm(true);
            qF qFVar2 = this.mZ;
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(qFVar2, this.sAl, qFVar2.cr());
        }
        WD.NOt(new NOt(z10, qFVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bytedance.sdk.openadsdk.core.Mm mm, boolean z10, qF qFVar) {
        NOt(qFVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(View view, om omVar, qF qFVar, String str, ZRu zRu) {
        com.bytedance.sdk.openadsdk.core.Vor.NOt().ZRu(str, zRu);
        Queue<Long> queue = this.aT;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (omVar != null) {
                jSONObject.put("dynamic_show_type", omVar.getDynamicShowType());
                omVar.ZRu(jSONObject, qFVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(InMobiNetworkValues.WIDTH, view.getWidth());
                    jSONObject2.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(qFVar, this.sAl, jSONObject);
        } catch (JSONException unused2) {
            lp.ZRu("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.FA;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, qFVar.IZ());
        }
        if (qFVar.FFX()) {
            Yx.ZRu(qFVar, view);
        }
        mZ mZVar = this.ZRu;
        if (mZVar == null || mZVar.getCurView() == null) {
            return;
        }
        this.ZRu.getCurView().aT();
        this.ZRu.getCurView().FA();
    }

    private com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Ht ZRu(qF qFVar) {
        if (qFVar.IZ() == 4) {
            return com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Mm.ZRu(this.NOt, qFVar, this.sAl);
        }
        return null;
    }

    private com.bytedance.sdk.openadsdk.core.Mm ZRu(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.Mm) {
                    return (com.bytedance.sdk.openadsdk.core.Mm) childAt;
                }
            } catch (Exception unused) {
            }
            return null;
        }
        return null;
    }

    public ZRu ZRu() {
        return new ZRu() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.7
            @Override // com.bytedance.sdk.openadsdk.core.mZ.uR.ZRu
            public void ZRu() {
                int width = uR.this.edo.getWidth();
                int height = uR.this.edo.getHeight();
                View viewZRu = ZRu(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                uR.this.edo.edo();
                uR.this.edo.removeAllViews();
                uR.this.edo.addView(viewZRu, new ViewGroup.LayoutParams(width, height));
                uR.this.edo.setClickCreativeListener(null);
                uR.this.edo.setClickListener(null);
                if (uR.this.FA != null) {
                    uR.this.FA.onAdDismissed();
                }
                uR.this.yBV = true;
            }

            private View ZRu(boolean z10) {
                com.bytedance.sdk.openadsdk.core.TFq.mZ mZVar = new com.bytedance.sdk.openadsdk.core.TFq.mZ(uR.this.NOt);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                mZVar.setBackgroundColor(-1);
                mZVar.setLayoutParams(layoutParams);
                View view = new View(uR.this.NOt);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                mZVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.TFq.mZ mZVar2 = new com.bytedance.sdk.openadsdk.core.TFq.mZ(uR.this.NOt);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    mZVar2.setBackground(com.bytedance.sdk.component.utils.om.mZ(uR.this.NOt, "tt_ad_closed_background_300_250"));
                } else {
                    mZVar2.setBackground(com.bytedance.sdk.component.utils.om.mZ(uR.this.NOt, "tt_ad_closed_background_320_50"));
                }
                mZVar.addView(mZVar2, layoutParams3);
                com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(uR.this.NOt);
                uRVar.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z10) {
                    int iMZ = Cox.mZ(uR.this.NOt, 16.0f);
                    layoutParams4.width = Cox.mZ(uR.this.NOt, 77.0f);
                    layoutParams4.height = Cox.mZ(uR.this.NOt, 14.0f);
                    layoutParams4.leftMargin = iMZ;
                    layoutParams4.topMargin = iMZ;
                } else {
                    int iMZ2 = Cox.mZ(uR.this.NOt, 8.0f);
                    layoutParams4.width = Cox.mZ(uR.this.NOt, 45.0f);
                    layoutParams4.height = Cox.mZ(uR.this.NOt, 8.18f);
                    layoutParams4.leftMargin = iMZ2;
                    layoutParams4.topMargin = iMZ2;
                }
                uRVar.setImageResource(com.bytedance.sdk.component.utils.om.uR(uR.this.NOt, "tt_ad_closed_logo_red"));
                mZVar2.addView(uRVar, layoutParams4);
                com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(uR.this.NOt);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                fa2.setAlpha(0.5f);
                fa2.setLines(1);
                fa2.setText(com.bytedance.sdk.component.utils.om.ZRu(uR.this.NOt, "tt_ad_is_closed"));
                if (z10) {
                    fa2.setTextSize(18.0f);
                } else {
                    fa2.setTextSize(12.0f);
                }
                mZVar2.addView(fa2, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mZ.uR.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        uR uRVar2 = uR.this;
                        TTWebsiteActivity.ZRu(uRVar2.NOt, uRVar2.mZ, uRVar2.sAl);
                    }
                };
                uRVar.setOnClickListener(onClickListener);
                fa2.setOnClickListener(onClickListener);
                return mZVar;
            }
        };
    }
}
