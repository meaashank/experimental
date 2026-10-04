package com.bytedance.adsdk.ugeno.Vor.NOt;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.NOt.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends com.bytedance.adsdk.ugeno.NOt.ZRu<com.bytedance.adsdk.ugeno.Vor.NOt.ZRu> {
    private com.bytedance.adsdk.ugeno.Vor.NOt.ZRu NOt;

    public static class ZRu extends ZRu.C0389ZRu {
        protected int xY = -1;

        private int NOt(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.NOt.ZRu.C0389ZRu
        /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams ZRu() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.ZRu, (int) this.NOt);
            layoutParams.leftMargin = (int) this.uR;
            layoutParams.rightMargin = (int) this.TFq;
            layoutParams.topMargin = (int) this.Ht;
            layoutParams.bottomMargin = (int) this.Mm;
            layoutParams.gravity = this.xY;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.NOt.ZRu.C0389ZRu
        public void ZRu(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ZRu(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.xY = ZRu(str2);
            }
        }

        private int ZRu(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iNOt = 0;
            for (String str2 : strArrSplit) {
                iNOt |= NOt(str2);
            }
            return iNOt;
        }
    }

    public NOt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu, com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        this.NOt.setEventMap(this.cvm);
        super.NOt();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu
    public ZRu.C0389ZRu mZ() {
        return new ZRu();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: nqR, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.Vor.NOt.ZRu uR() {
        com.bytedance.adsdk.ugeno.Vor.NOt.ZRu zRu = new com.bytedance.adsdk.ugeno.Vor.NOt.ZRu(this.mZ);
        this.NOt = zRu;
        zRu.ZRu(this);
        return this.NOt;
    }
}
