package com.bytedance.adsdk.ugeno.Vor.Ht;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.NOt.mZ;
import com.google.common.base.Ascii;
import u4.g;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends mZ<ZRu> {
    private float AOL;
    private float CH;
    private int CTl;
    private float Ds;
    private float HZ;
    private float KIc;
    protected int NOt;
    private int RPV;
    protected String ZRu;

    @Deprecated
    private TextUtils.TruncateAt bDW;
    private int cA;
    private int fOq;
    private int jJC;
    private int pU;
    private float qZ;
    private TextUtils.TruncateAt wcb;

    public NOt(Context context) {
        super(context);
        this.NOt = -16777216;
        this.HZ = 12.0f;
        this.RPV = Integer.MAX_VALUE;
        this.fOq = 2;
        this.AOL = -1.0f;
        this.KIc = 400.0f;
    }

    private TextUtils.TruncateAt FA(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.bDW = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.bDW = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.bDW = TextUtils.TruncateAt.START;
                break;
            default:
                this.bDW = null;
                break;
        }
        return this.bDW;
    }

    private TextUtils.TruncateAt Vor(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int ZH(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int aT(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L2b
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L21
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L17
            goto L35
        L17:
            java.lang.String r0 = "bold"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r3
            goto L36
        L21:
            java.lang.String r0 = "normal"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r2
            goto L36
        L2b:
            java.lang.String r0 = "italic"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r4
            goto L36
        L35:
            r6 = -1
        L36:
            if (r6 == 0) goto L3c
            if (r6 == r4) goto L3b
            return r3
        L3b:
            return r2
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.Vor.Ht.NOt.aT(java.lang.String):int");
    }

    private int lp(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    public void Mm(String str) {
        this.ZRu = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.ZRu = "";
        }
        ((ZRu) this.Ht).setText(this.ZRu);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        if (TextUtils.equals("null", this.ZRu)) {
            this.ZRu = "";
        }
        Mm(this.ZRu);
        ((ZRu) this.Ht).setTextSize(1, this.HZ);
        ((ZRu) this.Ht).setTextColor(this.NOt);
        ((ZRu) this.Ht).setLines(this.CTl);
        ((ZRu) this.Ht).setMaxLines(this.RPV);
        ((ZRu) this.Ht).setGravity(this.fOq);
        ((ZRu) this.Ht).setIncludeFontPadding(false);
        ZRu(this.cA);
        if (Nb()) {
            ZRu(this.wcb);
        } else {
            ZRu(this.bDW);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            float f10 = this.AOL;
            if (f10 >= 0.0f) {
                ((ZRu) this.Ht).setLineSpacing(0.0f, f10);
            }
        }
        ((ZRu) this.Ht).setShadowLayer(this.CH, this.Ds, this.qZ, this.pU);
        int i11 = this.jJC;
        if (i11 == 1) {
            ((ZRu) this.Ht).setTypeface(Typeface.DEFAULT, i11);
        } else if (i10 >= 28) {
            ((ZRu) this.Ht).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.KIc, i11 == 2));
        } else if (this.KIc >= 500.0f) {
            ((ZRu) this.Ht).setTypeface(Typeface.DEFAULT, 1);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public ZRu uR() {
        ZRu zRu = new ZRu(this.mZ);
        zRu.ZRu(this);
        return zRu;
    }

    public void ZRu(int i10) {
        this.cA = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((ZRu) this.Ht).setPaintFlags(i10);
    }

    public void ZRu(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((ZRu) this.Ht).setEllipsize(truncateAt);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ZRu(str, str2);
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    b10 = 0;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b10 = 1;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    b10 = 2;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 3;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b10 = 4;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b10 = 5;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b10 = 6;
                }
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    b10 = 7;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    b10 = 8;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    b10 = 9;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b10 = 10;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b10 = 11;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b10 = 12;
                }
                break;
            case 102977279:
                if (str.equals(g.f239602z0)) {
                    b10 = 13;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b10 = Ascii.SO;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b10 = Ascii.SI;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 5:
                this.CH = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 1:
                this.pU = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case 2:
                this.fOq = ZH(str2);
                break;
            case 3:
                this.NOt = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case 4:
                this.jJC = aT(str2);
                break;
            case 6:
                this.HZ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 7:
                this.cA = lp(str2);
                break;
            case 8:
                this.Ds = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 9:
                this.qZ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 10:
                this.KIc = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, -1.0f);
                break;
            case 11:
                this.AOL = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 1.0f);
                break;
            case 12:
                this.ZRu = str2;
                break;
            case 13:
                this.CTl = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0);
                break;
            case 14:
                this.wcb = Vor(str2);
                break;
            case 15:
                this.RPV = Integer.parseInt(str2);
                break;
            case 16:
                this.bDW = FA(str2);
                break;
        }
    }
}
