package com.bytedance.adsdk.ugeno.NOt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.Mm.FA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu<E extends ViewGroup> extends mZ {
    protected List<mZ<View>> ZRu;

    public ZRu(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
    }

    public void ZRu(mZ mZVar) {
        if (mZVar == null) {
            return;
        }
        this.ZRu.add(mZVar);
        View viewVor = mZVar.Vor();
        if (viewVor != null) {
            ((ViewGroup) this.Ht).addView(viewVor);
        }
    }

    public C0389ZRu mZ() {
        return new C0389ZRu();
    }

    public ZRu(Context context, ZRu zRu) {
        super(context, zRu);
        this.ZRu = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public mZ NOt(String str) {
        mZ<T> mZVarUR;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.sAl)) {
            return this;
        }
        for (mZ<View> mZVar : this.ZRu) {
            if (mZVar != null && (mZVarUR = mZVar.uR(str)) != 0) {
                return mZVarUR;
            }
        }
        return null;
    }

    public void ZRu(mZ mZVar, ViewGroup.LayoutParams layoutParams) {
        if (mZVar == null) {
            return;
        }
        this.ZRu.add(mZVar);
        View viewVor = mZVar.Vor();
        if (viewVor != null) {
            ((ViewGroup) this.Ht).addView(viewVor, layoutParams);
        }
    }

    public List<mZ<View>> ZRu() {
        return this.ZRu;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public mZ ZRu(String str) {
        mZ<T> mZVarMZ;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.lp)) {
            return this;
        }
        for (mZ<View> mZVar : this.ZRu) {
            if (mZVar != null && (mZVarMZ = mZVar.mZ(str)) != 0) {
                return mZVarMZ;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0389ZRu {
        protected float FA;
        protected float Ht;
        protected float Mm;
        protected boolean OCA;
        protected float TFq;
        protected float Vor;
        protected boolean WMI;
        protected float ZH;
        protected float aT;
        protected boolean edo;
        protected float lp;
        protected float mZ;
        protected boolean oK;
        protected boolean om;
        protected boolean qF;
        protected boolean sAl;
        protected ViewGroup.LayoutParams to;
        protected float uR;
        protected boolean yBV;
        protected float ZRu = -2.0f;
        protected float NOt = -2.0f;

        public void ZRu(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.Vor = FA.ZRu(context, str2);
                    this.sAl = true;
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.NOt = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.NOt = FA.ZRu(context, str2);
                        } else {
                            this.NOt = -2.0f;
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.mZ = FA.ZRu(context, str2);
                    break;
                case "marginTop":
                    this.Ht = FA.ZRu(context, str2);
                    this.om = true;
                    break;
                case "padding":
                    this.FA = FA.ZRu(context, str2);
                    break;
                case "marginBottom":
                    this.Mm = FA.ZRu(context, str2);
                    this.OCA = true;
                    break;
                case "paddingTop":
                    this.aT = FA.ZRu(context, str2);
                    this.oK = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.ZRu = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.ZRu = FA.ZRu(context, str2);
                        } else {
                            this.ZRu = -2.0f;
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.lp = FA.ZRu(context, str2);
                    this.yBV = true;
                    break;
                case "paddingRight":
                    this.ZH = FA.ZRu(context, str2);
                    this.edo = true;
                    break;
                case "marginRight":
                    this.TFq = FA.ZRu(context, str2);
                    this.qF = true;
                    break;
                case "marginLeft":
                    this.uR = FA.ZRu(context, str2);
                    this.WMI = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.ZRu + ", mHeight=" + this.NOt + ", mMargin=" + this.mZ + ", mMarginLeft=" + this.uR + ", mMarginRight=" + this.TFq + ", mMarginTop=" + this.Ht + ", mMarginBottom=" + this.Mm + ", mParams=" + this.to + '}';
        }

        public ViewGroup.LayoutParams ZRu() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.ZRu, (int) this.NOt);
            marginLayoutParams.leftMargin = (int) (this.WMI ? this.uR : this.mZ);
            marginLayoutParams.rightMargin = (int) (this.qF ? this.TFq : this.mZ);
            marginLayoutParams.topMargin = (int) (this.om ? this.Ht : this.mZ);
            marginLayoutParams.bottomMargin = (int) (this.OCA ? this.Mm : this.mZ);
            return marginLayoutParams;
        }
    }
}
