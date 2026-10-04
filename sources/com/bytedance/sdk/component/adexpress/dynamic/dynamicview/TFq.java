package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import U6.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.a;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import e.InterfaceC4337k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TFq extends FrameLayout implements IAnimation, Cox, Yx {
    protected int FA;
    protected float Ht;
    protected int Mm;
    private float NOt;
    private float OCA;
    protected float TFq;
    protected int Vor;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.NOt WMI;
    protected Context ZH;
    private float ZRu;
    protected int aT;
    protected DynamicRootView edo;
    protected com.bytedance.sdk.component.adexpress.dynamic.uR.Mm lp;
    protected float mZ;
    protected View oK;
    private float om;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.mZ qF;
    protected com.bytedance.sdk.component.adexpress.dynamic.uR.FA sAl;
    private com.bytedance.sdk.component.utils.OCA to;
    protected float uR;
    protected boolean yBV;
    private static final View.OnTouchListener xY = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener Zf = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public TFq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context);
        this.ZH = context;
        this.edo = dynamicRootView;
        this.sAl = fa2;
        this.mZ = fa2.Ht();
        this.uR = fa2.Mm();
        this.TFq = fa2.FA();
        this.Ht = fa2.Vor();
        this.Vor = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.mZ);
        this.aT = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.uR);
        this.Mm = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.TFq);
        this.FA = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.Ht);
        com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm = new com.bytedance.sdk.component.adexpress.dynamic.uR.Mm(fa2.aT());
        this.lp = mm;
        if (mm.qF() > 0) {
            this.Mm = (this.lp.qF() * 2) + this.Mm;
            this.FA = (this.lp.qF() * 2) + this.FA;
            this.Vor -= this.lp.qF();
            this.aT -= this.lp.qF();
            List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> listZH = fa2.ZH();
            if (listZH != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa3 : listZH) {
                    fa3.mZ(fa3.Ht() + com.bytedance.sdk.component.adexpress.uR.FA.NOt(this.ZH, this.lp.qF()));
                    fa3.uR(fa3.Mm() + com.bytedance.sdk.component.adexpress.uR.FA.NOt(this.ZH, this.lp.qF()));
                    fa3.ZRu(com.bytedance.sdk.component.adexpress.uR.FA.NOt(this.ZH, this.lp.qF()));
                    fa3.NOt(com.bytedance.sdk.component.adexpress.uR.FA.NOt(this.ZH, this.lp.qF()));
                }
            }
        }
        this.yBV = this.lp.edo() > 0.0d;
        this.qF = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.mZ();
    }

    public boolean FA() {
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 = this.sAl;
        return fa2 == null || fa2.aT() == null || this.sAl.aT().TFq() == null || this.sAl.aT().TFq().KIc() == null;
    }

    public void Ht() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.Mm, this.FA);
        layoutParams.topMargin = this.aT;
        int i10 = this.Vor;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public void Mm() {
        if (FA()) {
            return;
        }
        View view = this.oK;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.NOt nOt = new com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.NOt(view, this.sAl.aT().TFq().KIc());
        this.WMI = nOt;
        nOt.ZRu();
    }

    public void NOt(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq;
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 = this.sAl;
        if (fa2 == null || (htTFq = fa2.aT().TFq()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(htTFq.Guy()));
    }

    public boolean TFq() {
        com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm = this.lp;
        return (mm == null || mm.fcs() == 0) ? false : true;
    }

    public void ZRu(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm = this.lp;
        if (mm != null && mm.ZRu(i10)) {
            Vor();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof TFq)) {
                    ((TFq) childAt).ZRu(i10);
                }
            }
        }
    }

    public Drawable getBackgroundDrawable() {
        return ZRu(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.yBV;
    }

    public int getClickArea() {
        return this.lp.fcs();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu getDynamicClickListener() {
        return this.edo.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.FA;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uR.Ht getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.uR.TFq tFqAT;
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 = this.sAl;
        if (fa2 == null || (tFqAT = fa2.aT()) == null) {
            return null;
        }
        return tFqAT.TFq();
    }

    public int getDynamicWidth() {
        return this.Mm;
    }

    public String getImageObjectFit() {
        return this.lp.Np();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.om;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(ZRu(NOt(this.lp.gI().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.OCA;
    }

    public boolean mZ() {
        Vor();
        Ht();
        uR();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Mm();
        ZRu();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        NOt();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.qF.ZRu(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.mZ mZVar = this.qF;
        View view = this.oK;
        if (view == null) {
            view = this;
        }
        mZVar.ZRu(view, i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.om = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.ZRu = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.NOt = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.yBV = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.OCA = f10;
        this.qF.ZRu(this, f10);
    }

    public boolean uR() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.oK;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (TFq()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = xY;
            onClickListener = Zf;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iZRu = com.bytedance.sdk.component.adexpress.dynamic.NOt.ZRu.ZRu(this.lp);
            if (iZRu == 2 || iZRu == 3) {
                view2.setOnClickListener(Zf);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        ZRu(view2);
        NOt(view2);
        return true;
    }

    private List<String> NOt(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && i10 - 1 == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    public void ZRu(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InMobiNetworkValues.WIDTH, this.sAl.FA());
            jSONObject.put(InMobiNetworkValues.HEIGHT, this.sAl.Vor());
            if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ZRu.OCA, this.lp.Ho());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ZRu.to, this.sAl.aT().NOt());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ZRu.xY, this.sAl.mZ());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ZRu.Zf, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.lp.Ho());
            view.setTag(2097610715, this.sAl.aT().NOt());
            view.setTag(2097610714, this.sAl.mZ());
            view.setTag(2097610713, jSONObject.toString());
            int iZRu = com.bytedance.sdk.component.adexpress.dynamic.NOt.ZRu.ZRu(this.lp);
            if (iZRu == 1) {
                view.setTag(2097610707, new Pair(this.lp.le(), Long.valueOf(this.lp.MR())));
                view.setTag(2097610708, Integer.valueOf(iZRu));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox
    public void NOt() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.NOt nOt = this.WMI;
        if (nOt != null) {
            nOt.NOt();
        }
    }

    public Drawable ZRu(boolean z10, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iNb;
        if (!TextUtils.isEmpty(this.lp.gI())) {
            try {
                String strGI = this.lp.gI();
                String strSubstring = strGI.substring(strGI.indexOf("(") + 1, strGI.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(j.f68738d);
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableZRu = ZRu(ZRu(strArrSplit[0]), iArr);
                gradientDrawableZRu.setShape(0);
                gradientDrawableZRu.setCornerRadius(com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.oK()));
                return gradientDrawableZRu;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fZRu = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.oK());
        drawable.setCornerRadius(fZRu);
        if (fZRu < 1.0f) {
            float fZRu2 = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.th());
            float fZRu3 = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.WD());
            float fZRu4 = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.fWk());
            float fZRu5 = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.Yx());
            float[] fArr = new float[8];
            if (fZRu2 > 0.0f) {
                fArr[0] = fZRu2;
                fArr[1] = fZRu2;
            }
            if (fZRu3 > 0.0f) {
                fArr[2] = fZRu3;
                fArr[3] = fZRu3;
            }
            if (fZRu4 > 0.0f) {
                fArr[4] = fZRu4;
                fArr[5] = fZRu4;
            }
            if (fZRu5 > 0.0f) {
                fArr[6] = fZRu5;
                fArr[7] = fZRu5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            iNb = Color.parseColor(str);
        } else {
            iNb = this.lp.Nb();
        }
        drawable.setColor(iNb);
        if (this.lp.WMI() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.WMI()), this.lp.yBV());
        } else if (this.lp.qF() > 0) {
            drawable.setStroke(this.lp.qF(), this.lp.yBV());
            drawable.setAlpha(50);
            if (a.a(this.sAl, "video-vd")) {
                setLayerType(1, null);
                return new om((int) fZRu, this.lp.qF());
            }
        }
        return drawable;
    }

    public NOt ZRu(Bitmap bitmap) {
        return new ZRu(bitmap, null);
    }

    private Drawable[] ZRu(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(j.f68738d);
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableZRu = ZRu(ZRu(strArrSplit[0]), iArr);
                gradientDrawableZRu.setShape(0);
                gradientDrawableZRu.setCornerRadius(com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.oK()));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableZRu;
            }
        }
        return drawableArr;
    }

    public GradientDrawable ZRu(GradientDrawable.Orientation orientation, @InterfaceC4337k int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation ZRu(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void ZRu() {
        if (isShown()) {
            int iZRu = com.bytedance.sdk.component.adexpress.dynamic.NOt.ZRu.ZRu(this.lp);
            if (iZRu == 2) {
                if (this.to == null) {
                    this.to = new com.bytedance.sdk.component.utils.OCA(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq.3
                };
                com.bytedance.sdk.component.adexpress.NOt.sAl renderRequest = this.edo.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.oK();
                    renderRequest.to();
                    renderRequest.om();
                    return;
                }
                return;
            }
            if (iZRu == 3) {
                if (this.to == null) {
                    this.to = new com.bytedance.sdk.component.utils.OCA(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq.4
                };
                com.bytedance.sdk.component.adexpress.NOt.sAl renderRequest2 = this.edo.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.WMI();
                    renderRequest2.xY();
                    renderRequest2.qF();
                    renderRequest2.OCA();
                }
            }
        }
    }
}
