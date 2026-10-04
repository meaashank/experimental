package com.bytedance.adsdk.ugeno.Vor.ZRu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Mm.FA;
import com.bytedance.adsdk.ugeno.Mm.ZRu;
import com.bytedance.adsdk.ugeno.NOt.mZ;
import com.bytedance.adsdk.ugeno.Vor.Ht.NOt;
import com.bytedance.adsdk.ugeno.ZRu;
import com.bytedance.adsdk.ugeno.uR;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends NOt {
    private boolean AOL;
    private String CTl;
    private String HZ;
    private String RPV;
    private int bDW;
    private ZRu.C0388ZRu cA;
    private int fOq;
    private String jJC;
    private boolean wcb;

    public ZRu(Context context) {
        super(context);
        this.jJC = "row";
    }

    private void mZ() {
        if (TextUtils.isEmpty(this.HZ)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) this.Ht).setCompoundDrawables(null, null, null, null);
        if (!this.HZ.startsWith("local://")) {
            uR.ZRu().NOt().ZRu(this.aT, this.HZ, new ZRu.InterfaceC0392ZRu() { // from class: com.bytedance.adsdk.ugeno.Vor.ZRu.ZRu.1
                @Override // com.bytedance.adsdk.ugeno.ZRu.InterfaceC0392ZRu
                public void ZRu(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Vor.ZRu.ZRu.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ZRu.this.NOt(new BitmapDrawable(((mZ) ZRu.this).mZ.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.HZ.replace("local://", "");
            Context context = this.mZ;
            NOt(FA.ZRu(context, com.bytedance.adsdk.ugeno.Mm.uR.ZRu(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void AK() {
        super.AK();
        if (this.wcb) {
            ((com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) this.Ht).setTextColor(((NOt) this).NOt);
        }
        if (this.AOL) {
            if (this.Pzo) {
                ZRu(this.hNL);
            } else {
                uR(this.Cox);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Vor.Ht.NOt, com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        mZ();
        ((com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) this.Ht).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void bO() {
        super.bO();
        if (this.wcb) {
            ((com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) this.Ht).setTextColor(this.bDW);
        }
        if (this.AOL) {
            if (this.Pzo) {
                ZRu(this.cA);
            } else {
                uR(this.fOq);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Vor.Ht.NOt, com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        super.ZRu(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.jJC = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.bDW = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                this.wcb = true;
                break;
            case "image":
                this.HZ = str2;
                break;
            case "highlightImage":
                this.RPV = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.Mm.ZRu.mZ(str2)) {
                    this.Pzo = true;
                    this.cA = com.bytedance.adsdk.ugeno.Mm.ZRu.NOt(str2);
                } else {
                    this.fOq = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                    this.Pzo = false;
                }
                this.AOL = true;
                break;
            case "highlightBackgroundImage":
                this.CTl = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void NOt(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.jJC
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case -1781065991: goto L2d;
                case -1354837162: goto L23;
                case -207799939: goto L19;
                case 113114: goto Lf;
                default: goto Le;
            }
        Le:
            goto L37
        Lf:
            java.lang.String r1 = "row"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = 3
            goto L38
        L19:
            java.lang.String r1 = "row_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = 0
            goto L38
        L23:
            java.lang.String r1 = "column"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r3
            goto L38
        L2d:
            java.lang.String r1 = "column_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r2
            goto L38
        L37:
            r0 = -1
        L38:
            r1 = 0
            if (r0 == 0) goto L57
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L47
            T extends android.view.View r0 = r4.Ht
            com.bytedance.adsdk.ugeno.Vor.Ht.ZRu r0 = (com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r1, r1, r1)
            return
        L47:
            T extends android.view.View r0 = r4.Ht
            com.bytedance.adsdk.ugeno.Vor.Ht.ZRu r0 = (com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r5)
            return
        L4f:
            T extends android.view.View r0 = r4.Ht
            com.bytedance.adsdk.ugeno.Vor.Ht.ZRu r0 = (com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r1, r1)
            return
        L57:
            T extends android.view.View r0 = r4.Ht
            com.bytedance.adsdk.ugeno.Vor.Ht.ZRu r0 = (com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.Vor.ZRu.ZRu.NOt(android.graphics.drawable.Drawable):void");
    }
}
