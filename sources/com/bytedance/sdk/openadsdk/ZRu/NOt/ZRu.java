package com.bytedance.sdk.openadsdk.ZRu.NOt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.FA.Vor;
import com.bytedance.sdk.openadsdk.core.FA.om;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.oK;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.settings.yBV;
import com.bytedance.sdk.openadsdk.utils.Cox;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private PAGMediaView FA;
    private NOt Ht;
    private com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.mZ Mm;
    private final Context NOt;
    private WeakReference<com.bytedance.sdk.openadsdk.core.sAl.NOt.Ht> TFq;
    private om Vor;
    private com.bytedance.sdk.openadsdk.core.NOt.ZRu ZH;
    protected final qF ZRu;
    private PAGMediaView aT;
    private WeakReference<com.bytedance.sdk.openadsdk.core.lp.Ht> edo;
    private com.bytedance.sdk.openadsdk.core.NOt.NOt lp;
    private final String mZ;
    private boolean sAl = false;
    private boolean uR;

    public ZRu(Context context, qF qFVar, String str) {
        this.NOt = context;
        this.ZRu = qFVar;
        this.mZ = str;
    }

    private PAGMediaView edo() {
        if (!qF.TFq(this.ZRu)) {
            com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.mZ mZVar = this.Mm;
            if (mZVar == null) {
                return null;
            }
            om omVarUR = mZVar.uR();
            omVarUR.setTag(520093762, Boolean.TRUE);
            if (!this.sAl) {
                this.Mm.TFq();
            }
            this.sAl = true;
            return ZRu(omVarUR);
        }
        com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.mZ mZVar2 = this.Mm;
        if (mZVar2 == null || !(mZVar2 instanceof com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.NOt)) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.FA.qF qFVar = (com.bytedance.sdk.openadsdk.core.FA.qF) mZVar2.uR();
        qFVar.setTag(520093762, Boolean.TRUE);
        if (!this.sAl) {
            this.Mm.TFq();
        }
        this.sAl = true;
        return ZRu(qFVar);
    }

    public PAGMediaView FA() {
        return this.aT;
    }

    public String Ht() {
        qF qFVar = this.ZRu;
        if (qFVar != null) {
            return qFVar.GC();
        }
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView Mm() {
        PAGMediaView pAGMediaViewVor;
        com.bytedance.sdk.openadsdk.utils.NOt.ZRu(this.ZRu);
        if (this.ZRu.xY() == 2) {
            pAGMediaViewVor = edo();
            ZRu(pAGMediaViewVor);
        } else {
            pAGMediaViewVor = Vor();
        }
        if (pAGMediaViewVor != null) {
            pAGMediaViewVor.setMrcTrackerKey(com.bytedance.sdk.openadsdk.Zf.ZRu.TFq.NOt(this.ZRu));
        } else {
            pAGMediaViewVor = new PAGMediaView(this.NOt) { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.mZ.ZRu(this, ZRu.this.ZRu);
                }
            };
        }
        if (pAGMediaViewVor instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewVor).setMaterialMeta(this.ZRu);
        }
        this.aT = pAGMediaViewVor;
        return pAGMediaViewVor;
    }

    public om NOt() {
        return this.Vor;
    }

    public String TFq() {
        qF qFVar = this.ZRu;
        if (qFVar != null) {
            return NOt(qFVar);
        }
        return null;
    }

    public PAGMediaView Vor() {
        if (!qF.TFq(this.ZRu)) {
            List<oK> listNp = this.ZRu.Np();
            if (listNp == null || listNp.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.NOt);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            oK oKVar = listNp.get(0);
            if (oKVar != null) {
                com.bytedance.sdk.openadsdk.Vor.uR.ZRu(oKVar).mZ(2).ZRu(com.bytedance.sdk.openadsdk.Vor.mZ.ZRu(this.ZRu, oKVar.ZRu(), imageView));
            }
            PAGMediaView pAGMediaViewZRu = ZRu(imageView);
            if (this.ZH == null || !yBV.CH().uR(String.valueOf(this.ZRu.GE()))) {
                pAGMediaViewZRu.setOnClickListener(null);
                pAGMediaViewZRu.setOnTouchListener(null);
            } else {
                pAGMediaViewZRu.setOnClickListener(this.ZH);
                pAGMediaViewZRu.setOnTouchListener(this.ZH);
            }
            pAGMediaViewZRu.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.FA;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.FA.setOnTouchListener(null);
            }
            this.FA = pAGMediaViewZRu;
            return pAGMediaViewZRu;
        }
        NOt nOt = this.Ht;
        if (nOt == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewTFq = nOt.TFq();
        if (viewTFq == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewTFq.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewTFq.getParent()).removeView(viewTFq);
        }
        PAGMediaView pAGMediaView2 = this.FA;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.FA.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.NOt, viewTFq, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.ZH == null || !yBV.CH().uR(String.valueOf(this.ZRu.GE()))) {
            com.bytedance.sdk.openadsdk.core.NOt.mZ mZVar = new com.bytedance.sdk.openadsdk.core.NOt.mZ() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.2
                @Override // com.bytedance.sdk.openadsdk.core.NOt.mZ
                public void ZRu(View view, float f10, float f11, float f12, float f13, SparseArray<mZ.ZRu> sparseArray, boolean z10) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(mZVar);
            pAGVideoMediaView.setOnTouchListener(mZVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.ZH);
            pAGVideoMediaView.setOnTouchListener(this.ZH);
        }
        this.FA = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public View ZH() {
        qF qFVar;
        if (WMI.ZRu() == null || (qFVar = this.ZRu) == null) {
            lp.ZRu("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!qFVar.wcb() || !this.ZRu.FA()) {
            return null;
        }
        ImageView imageView = new ImageView(WMI.ZRu());
        com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().ZRu((int) Cox.ZRu(WMI.ZRu(), 14.0f, true), imageView, this.ZRu);
        return imageView;
    }

    public void ZRu(NOt nOt) {
        this.Ht = nOt;
    }

    public View aT() {
        if (WMI.ZRu() == null) {
            lp.ZRu("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(WMI.ZRu());
        imageView.setImageResource(com.bytedance.sdk.component.utils.om.uR(WMI.ZRu(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ZRu.this.lp();
            }
        });
        return imageView;
    }

    public void lp() {
        Context context = this.NOt;
        if (context != null) {
            TTWebsiteActivity.ZRu(context, this.ZRu, this.mZ);
        }
    }

    public PAGImageItem mZ() {
        qF qFVar = this.ZRu;
        if (qFVar == null || qFVar.yz() == null) {
            return null;
        }
        return new PAGImageItem(this.ZRu.yz().mZ(), this.ZRu.yz().NOt(), this.ZRu.yz().ZRu(), (float) this.ZRu.yz().uR());
    }

    public void sAl() {
        com.bytedance.sdk.openadsdk.core.lp.Ht ht;
        WeakReference<com.bytedance.sdk.openadsdk.core.lp.Ht> weakReference = this.edo;
        if (weakReference == null || (ht = weakReference.get()) == null) {
            return;
        }
        ht.ZRu(13);
    }

    public String uR() {
        qF qFVar = this.ZRu;
        if (qFVar != null) {
            return ZRu(qFVar);
        }
        return null;
    }

    private String NOt(qF qFVar) {
        return !TextUtils.isEmpty(qFVar.yM()) ? qFVar.yM() : !TextUtils.isEmpty(qFVar.gX()) ? qFVar.gX() : "";
    }

    public void ZRu(com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.mZ mZVar) {
        this.Mm = mZVar;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.sAl.NOt.Ht ht) {
        this.TFq = new WeakReference<>(ht);
    }

    public void ZRu(boolean z10) {
        this.uR = z10;
    }

    public PAGMediaView ZRu() {
        return this.FA;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.NOt.ZRu zRu) {
        this.ZH = zRu;
    }

    private mZ NOt(final PAGVideoAdListener pAGVideoAdListener) {
        return new mZ() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.5
            @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.mZ
            public void NOt(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.mZ
            public void ZRu(int i10, int i11) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.mZ
            public void mZ(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.mZ
            public void ZRu(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    private String ZRu(qF qFVar) {
        if (qFVar.gaw() != null && !TextUtils.isEmpty(qFVar.gaw().NOt())) {
            return qFVar.gaw().NOt();
        }
        if (!TextUtils.isEmpty(qFVar.Hvv())) {
            return qFVar.Hvv();
        }
        if (!TextUtils.isEmpty(qFVar.yM())) {
            return qFVar.yM();
        }
        return "";
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.NOt.NOt nOt) {
        this.lp = nOt;
    }

    private void ZRu(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView ZRu(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        om omVar = this.Vor;
        if (omVar != null) {
            omVar.setClickListener(null);
            this.Vor.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.NOt.NOt nOt = this.lp;
        if (nOt != null && (nOt instanceof Vor) && (view instanceof om)) {
            ((om) view).setClickListener((Vor) nOt);
        }
        com.bytedance.sdk.openadsdk.core.NOt.ZRu zRu = this.ZH;
        if (zRu != null && (zRu instanceof com.bytedance.sdk.openadsdk.core.FA.FA) && (view instanceof om)) {
            ((om) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.FA.FA) zRu);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.NOt) { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.3
            private void ZRu(boolean z10) {
                Integer num = this.ZRu;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.Zf.ZRu.TFq.ZRu(com.bytedance.sdk.openadsdk.Zf.ZRu.TFq.ZRu(num), z10 ? 4 : 8);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.mZ.ZRu(this, ZRu.this.ZRu);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (view instanceof om) {
                    return;
                }
                ZRu(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                ZRu.this.ZRu(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof om) {
            this.Vor = (om) view;
        }
        return pAGMediaView;
    }

    public void ZRu(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.mZ mZVar;
        if (this.ZRu.xY() == 2 && qF.TFq(this.ZRu) && (mZVar = this.Mm) != null && (mZVar instanceof com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.NOt)) {
            com.bytedance.sdk.openadsdk.core.FA.qF qFVar = (com.bytedance.sdk.openadsdk.core.FA.qF) mZVar.uR();
            if (qFVar != null) {
                qFVar.setVideoAdListener(NOt(pAGVideoAdListener));
                return;
            }
            return;
        }
        NOt nOt = this.Ht;
        if (nOt != null) {
            nOt.ZRu(NOt(pAGVideoAdListener));
        }
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.lp.Ht ht) {
        this.edo = new WeakReference<>(ht);
    }
}
