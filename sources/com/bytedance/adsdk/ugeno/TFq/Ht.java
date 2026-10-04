package com.bytedance.adsdk.ugeno.TFq;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.NOt.ZRu;
import com.bytedance.adsdk.ugeno.TFq.TFq;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends com.bytedance.adsdk.ugeno.NOt.ZRu<TFq> {
    private int CTl;
    private int HZ;
    private int NOt;
    private int RPV;
    private int jJC;

    public static class ZRu extends ZRu.C0389ZRu {
        public int xY = 1;
        public float Zf = 0.0f;
        public float ru = 0.0f;
        public int le = -1;
        public float MR = -1.0f;
        public int fcs = -1;

        /* JADX INFO: renamed from: Nb, reason: collision with root package name */
        public int f140641Nb = -1;
        public int VdW = 16777215;
        public int th = 16777215;

        private float NOt(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private int TFq(String str) {
            str.getClass();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        private float mZ(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float uR(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.NOt.ZRu.C0389ZRu
        public String toString() {
            return "LayoutParams{mWidth=" + this.ZRu + ", mHeight=" + this.NOt + ", mMargin=" + this.mZ + ", mMarginLeft=" + this.uR + ", mMarginRight=" + this.TFq + ", mMarginTop=" + this.Ht + ", mMarginBottom=" + this.Mm + ", mParams=" + this.to + ", mOrder=" + this.xY + ", mFlexGrow=" + this.Zf + ", mFlexShrink=" + this.ru + ", mAlignSelf=" + this.le + ", mFlexBasisPercent=" + this.MR + ", mMinWidth=" + this.fcs + ", mMinHeight=" + this.f140641Nb + ", mMaxWidth=" + this.VdW + ", mMaxHeight=" + this.th + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.NOt.ZRu.C0389ZRu
        /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
        public TFq.ZRu ZRu() {
            TFq.ZRu zRu = new TFq.ZRu((int) this.ZRu, (int) this.NOt);
            ((ViewGroup.MarginLayoutParams) zRu).leftMargin = (int) this.uR;
            ((ViewGroup.MarginLayoutParams) zRu).rightMargin = (int) this.TFq;
            ((ViewGroup.MarginLayoutParams) zRu).topMargin = (int) this.Ht;
            ((ViewGroup.MarginLayoutParams) zRu).bottomMargin = (int) this.Mm;
            zRu.mZ(this.xY);
            zRu.uR(this.le);
            zRu.ZRu(this.Zf);
            zRu.NOt(this.ru);
            zRu.mZ(this.MR);
            return zRu;
        }

        @Override // com.bytedance.adsdk.ugeno.NOt.ZRu.C0389ZRu
        public void ZRu(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ZRu(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.MR = uR(str2);
                    break;
                case "order":
                    this.xY = ZRu(str2);
                    break;
                case "flexShrink":
                    this.ru = mZ(str2);
                    break;
                case "flexGrow":
                    this.Zf = NOt(str2);
                    break;
                case "alignSelf":
                    this.le = TFq(str2);
                    break;
            }
        }

        private int ZRu(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public Ht(Context context) {
        super(context);
    }

    private int FA(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int Vor(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int ZH(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 5
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 4
            r6 = 1
            switch(r0) {
                case -1881872635: goto L40;
                case -1364013995: goto L36;
                case -932331738: goto L2c;
                case 1384876188: goto L22;
                case 1682480591: goto L18;
                case 1744442261: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L4a
        Le:
            java.lang.String r0 = "flex_end"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r6
            goto L4b
        L18:
            java.lang.String r0 = "space_between"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r5
            goto L4b
        L22:
            java.lang.String r0 = "flex_start"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r2
            goto L4b
        L2c:
            java.lang.String r0 = "space_around"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r4
            goto L4b
        L36:
            java.lang.String r0 = "center"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r3
            goto L4b
        L40:
            java.lang.String r0 = "stretch"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r1
            goto L4b
        L4a:
            r8 = -1
        L4b:
            if (r8 == 0) goto L5a
            if (r8 == r6) goto L59
            if (r8 == r3) goto L58
            if (r8 == r4) goto L57
            if (r8 == r5) goto L56
            return r1
        L56:
            return r4
        L57:
            return r5
        L58:
            return r3
        L59:
            return r6
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.TFq.Ht.ZH(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int aT(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1881872635: goto L35;
                case -1720785339: goto L2b;
                case -1364013995: goto L21;
                case 1384876188: goto L17;
                case 1744442261: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "flex_end"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r5
            goto L40
        L17:
            java.lang.String r0 = "flex_start"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r2
            goto L40
        L21:
            java.lang.String r0 = "center"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r4
            goto L40
        L2b:
            java.lang.String r0 = "baseline"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r3
            goto L40
        L35:
            java.lang.String r0 = "stretch"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r1
            goto L40
        L3f:
            r7 = -1
        L40:
            if (r7 == 0) goto L4c
            if (r7 == r5) goto L4b
            if (r7 == r4) goto L4a
            if (r7 == r3) goto L49
            return r1
        L49:
            return r3
        L4a:
            return r4
        L4b:
            return r5
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.TFq.Ht.aT(java.lang.String):int");
    }

    public int Mm(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu, com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        ((TFq) this.Ht).setFlexDirection(this.NOt);
        ((TFq) this.Ht).setFlexWrap(this.HZ);
        ((TFq) this.Ht).setJustifyContent(this.jJC);
        ((TFq) this.Ht).setAlignItems(this.RPV);
        ((TFq) this.Ht).setAlignContent(this.CTl);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ZRu(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.RPV = aT(str2);
                break;
            case "flexDirection":
                this.NOt = Mm(str2);
                break;
            case "alignContent":
                this.CTl = ZH(str2);
                break;
            case "flexWrap":
                this.HZ = FA(str2);
                break;
            case "justifyContent":
                this.jJC = Vor(str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu
    public ZRu.C0389ZRu mZ() {
        return new ZRu();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: nqR, reason: merged with bridge method [inline-methods] */
    public TFq uR() {
        TFq tFq = new TFq(this.mZ);
        tFq.ZRu(this);
        return tFq;
    }
}
