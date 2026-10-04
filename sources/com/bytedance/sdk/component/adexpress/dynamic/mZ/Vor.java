package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.a;
import com.bytedance.sdk.component.adexpress.Ht.MR;
import com.google.common.base.Ascii;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends FrameLayout implements FA {
    private View.OnTouchListener FA;
    private String Ht;
    private com.bytedance.sdk.component.adexpress.Ht.qF Mm;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq NOt;
    private Mm TFq;
    private int Vor;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.aT ZH;
    private Context ZRu;
    private boolean aT;
    private com.bytedance.sdk.component.adexpress.NOt.sAl lp;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mZ;
    private View uR;

    public Vor(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        super(context);
        this.ZRu = context;
        this.NOt = tFq;
        this.mZ = mm;
        Mm();
    }

    private boolean FA() {
        return (this.mZ.gmt() || TextUtils.equals("9", this.Ht) || TextUtils.equals("16", this.Ht) || TextUtils.equals("17", this.Ht) || TextUtils.equals("18", this.Ht) || TextUtils.equals("20", this.Ht) || TextUtils.equals("29", this.Ht) || TextUtils.equals("10", this.Ht)) ? false : true;
    }

    private void Mm() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.Ht = this.mZ.Qg();
        this.Vor = this.mZ.nqR();
        this.aT = this.mZ.gmt();
        Mm mmZRu = aT.ZRu(this.ZRu, this.NOt, this.mZ, this.ZH, this.lp);
        this.TFq = mmZRu;
        if (mmZRu != null) {
            this.uR = mmZRu.mZ();
            if (this.mZ.Hvv()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.Ht, "6")) {
                if (!this.mZ.ZRJ() || TextUtils.isEmpty(this.mZ.MU())) {
                    this.Mm = new com.bytedance.sdk.component.adexpress.Ht.qF(this.ZRu, Color.parseColor("#99000000"));
                } else {
                    this.Mm = new com.bytedance.sdk.component.adexpress.Ht.qF(this.ZRu, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(this.mZ.MU()));
                }
                FrameLayout frameLayout = new FrameLayout(this.ZRu);
                frameLayout.addView(this.Mm, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Vor.this.Mm.NOt();
                    }
                });
            }
            if (ZRu(this.Ht) && com.bytedance.sdk.component.adexpress.uR.NOt()) {
                int color = Color.parseColor("#99000000");
                if (this.mZ.ZRJ() && !TextUtils.isEmpty(this.mZ.MU())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(this.mZ.MU());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.ZRu);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.TFq.mZ());
            ZRu(this.TFq.mZ());
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vor() {
        if (this.FA != null) {
            setOnClickListener((View.OnClickListener) this.NOt.getDynamicClickListener());
            performClick();
            if (this.mZ.pDA()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void Ht() {
        if (this.uR != null && TextUtils.equals(this.Ht, "2")) {
            View view = this.uR;
            if (view instanceof com.bytedance.sdk.component.adexpress.Ht.mZ) {
                ((com.bytedance.sdk.component.adexpress.Ht.mZ) view).uR();
            }
        }
    }

    public void TFq() {
        if (this.uR != null && TextUtils.equals(this.Ht, "2")) {
            View view = this.uR;
            if (view instanceof com.bytedance.sdk.component.adexpress.Ht.mZ) {
                ((com.bytedance.sdk.component.adexpress.Ht.mZ) view).mZ();
            }
        }
    }

    public void mZ() {
        Mm mm = this.TFq;
        if (mm != null) {
            mm.ZRu();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            Mm mm = this.TFq;
            if (mm != null) {
                mm.NOt();
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.FA instanceof com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.mZ) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void uR() {
        Mm mm = this.TFq;
        if (mm != null) {
            mm.NOt();
        }
    }

    private boolean ZRu(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.FA
    public void NOt() {
        if (FA()) {
            setOnClickListener((View.OnClickListener) this.NOt.getDynamicClickListener());
            performClick();
            if (this.mZ.pDA()) {
                return;
            }
            setVisibility(8);
        }
    }

    public Vor(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm, com.bytedance.sdk.component.adexpress.dynamic.uR.aT aTVar, com.bytedance.sdk.component.adexpress.NOt.sAl sal) {
        super(context);
        this.ZRu = context;
        this.NOt = tFq;
        this.mZ = mm;
        this.ZH = aTVar;
        this.lp = sal;
        Mm();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void ZRu(ViewGroup viewGroup) {
        byte b10 = 2;
        if (this.uR == null) {
            return;
        }
        String str = this.Ht;
        str.getClass();
        switch (str.hashCode()) {
            case 48:
                b10 = !str.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL) ? (byte) -1 : (byte) 0;
                break;
            case 49:
                b10 = !str.equals("1") ? (byte) -1 : (byte) 1;
                break;
            case 50:
                if (!str.equals("2")) {
                    b10 = -1;
                }
                break;
            case 53:
                b10 = !str.equals(CampaignEx.CLICKMODE_ON) ? (byte) -1 : (byte) 3;
                break;
            case 54:
                b10 = !str.equals("6") ? (byte) -1 : (byte) 4;
                break;
            case 55:
                b10 = !str.equals("7") ? (byte) -1 : (byte) 5;
                break;
            case 56:
                b10 = !str.equals("8") ? (byte) -1 : (byte) 6;
                break;
            case 57:
                b10 = !str.equals("9") ? (byte) -1 : (byte) 7;
                break;
            case 1567:
                b10 = !str.equals("10") ? (byte) -1 : (byte) 8;
                break;
            case 1568:
                b10 = !str.equals("11") ? (byte) -1 : (byte) 9;
                break;
            case 1569:
                b10 = !str.equals("12") ? (byte) -1 : (byte) 10;
                break;
            case 1570:
                b10 = !str.equals("13") ? (byte) -1 : (byte) 11;
                break;
            case 1571:
                b10 = !str.equals("14") ? (byte) -1 : (byte) 12;
                break;
            case 1573:
                b10 = !str.equals("16") ? (byte) -1 : (byte) 13;
                break;
            case 1574:
                b10 = !str.equals("17") ? (byte) -1 : Ascii.SO;
                break;
            case a.f112096B /* 1575 */:
                b10 = !str.equals("18") ? (byte) -1 : Ascii.SI;
                break;
            case 1598:
                b10 = !str.equals("20") ? (byte) -1 : (byte) 16;
                break;
            case 1600:
                b10 = !str.equals("22") ? (byte) -1 : (byte) 17;
                break;
            case 1601:
                b10 = !str.equals("23") ? (byte) -1 : Ascii.DC2;
                break;
            case 1602:
                b10 = !str.equals("24") ? (byte) -1 : (byte) 19;
                break;
            case 1603:
                b10 = !str.equals("25") ? (byte) -1 : Ascii.DC4;
                break;
            case 1607:
                b10 = !str.equals("29") ? (byte) -1 : Ascii.NAK;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.TFq(this, this.Vor);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.mZ.ZRJ() || TextUtils.isEmpty(this.mZ.MU())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.Ht(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.NOt(this, this);
                break;
            case 3:
                if (this.mZ.ZRJ() && !TextUtils.isEmpty(this.mZ.MU())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(this.mZ.MU()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.mZ(this);
                this.uR.setTag(2);
                break;
            case 6:
            case 9:
                this.NOt.setClipChildren(false);
                this.NOt.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.NOt.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.Ht(this);
                break;
            case 7:
            case 14:
                this.uR.setTag(2);
                break;
            case 8:
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.uR(this, this.Vor, this.aT);
                break;
            case 10:
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.mZ(this);
                this.uR.setTag(2);
                break;
            case 11:
            case 19:
                if (this.Ht.equals("24") && com.bytedance.sdk.component.adexpress.uR.NOt()) {
                    this.NOt.setClipChildren(false);
                    this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.Ht(this);
                } else {
                    this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.TFq(this, this.Vor);
                }
                break;
            case 12:
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.NOt(this, this);
                break;
            case 13:
                View view = this.uR;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.Ht.om) && ((com.bytedance.sdk.component.adexpress.Ht.om) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.Ht.om) this.uR).getShakeLayout().setTag(2);
                }
                this.uR.setTag(2);
                break;
            case 15:
                View view2 = this.uR;
                if (view2 != null && (view2 instanceof MR) && ((MR) view2).getWriggleLayout() != null) {
                    ((MR) this.uR).getWriggleLayout().setTag(2);
                }
                this.uR.setTag(2);
                break;
            case 16:
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.ZRu(this, this.Vor, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                    this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.FA(this, this.aT);
                } else {
                    this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.Mm(this, this.Vor, viewGroup);
                }
                break;
            case 18:
                if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                    this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.Ht(this);
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                    this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.FA(this, this.aT);
                }
                break;
            case 21:
                View view3 = this.uR;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.Ht.Ht) && ((com.bytedance.sdk.component.adexpress.Ht.Ht) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.Ht.Ht) this.uR).getShakeView().setTag(2);
                }
                this.FA = new com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.TFq(this, this.Vor);
                break;
        }
        View.OnTouchListener onTouchListener = this.FA;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (FA()) {
            this.uR.setTag(2);
            setOnClickListener((View.OnClickListener) this.NOt.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.FA
    public void ZRu() {
        if (TextUtils.equals(this.Ht, "6")) {
            com.bytedance.sdk.component.adexpress.Ht.qF qFVar = this.Mm;
            if (qFVar != null) {
                qFVar.mZ();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Vor.this.Vor();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.Ht, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor.3
                @Override // java.lang.Runnable
                public void run() {
                    Vor.this.Vor();
                }
            }, 400L);
        } else {
            Vor();
        }
    }
}
