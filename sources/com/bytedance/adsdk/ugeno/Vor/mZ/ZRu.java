package com.bytedance.adsdk.ugeno.Vor.mZ;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.Vor.uR.mZ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu extends mZ {
    private int jJC;

    public ZRu(Context context) {
        super(context);
        this.jJC = -16777216;
    }

    private String Vor(String str) {
        String strMm = Mm(str);
        return TextUtils.isEmpty(strMm) ? "" : "local://".concat(String.valueOf(strMm));
    }

    public abstract String Mm(String str);

    @Override // com.bytedance.adsdk.ugeno.Vor.uR.mZ, com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        ((mZ) this).ZRu = Vor(((mZ) this).ZRu);
        super.NOt();
        ((com.bytedance.adsdk.ugeno.Vor.uR.ZRu) this.Ht).setColorFilter(this.jJC);
        ((com.bytedance.adsdk.ugeno.Vor.uR.ZRu) this.Ht).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.Vor.uR.mZ, com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        super.ZRu(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.jJC = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
        }
    }
}
