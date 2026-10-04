package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.compose.runtime.changelist.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class aT extends com.bytedance.adsdk.NOt.Ht {
    private String NOt;
    private Map<String, Bitmap> ZRu;

    public static class ZRu implements com.bytedance.sdk.component.TFq.yBV<Bitmap> {
        private final com.bytedance.adsdk.NOt.aT NOt;
        private final WeakReference<aT> ZRu;
        private final String mZ;
        private final Map<String, Bitmap> uR;

        public ZRu(aT aTVar, com.bytedance.adsdk.NOt.aT aTVar2, String str, Map<String, Bitmap> map) {
            this.ZRu = new WeakReference<>(aTVar);
            this.NOt = aTVar2;
            this.mZ = str;
            this.uR = map;
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(com.bytedance.sdk.component.TFq.ZH<Bitmap> zh) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(zh.NOt(), this.NOt.ZRu(), this.NOt.NOt(), false);
            this.uR.put(this.mZ, bitmapCreateScaledBitmap);
            aT aTVar = this.ZRu.get();
            if (aTVar != null) {
                aTVar.ZRu(this.NOt.Mm(), bitmapCreateScaledBitmap);
            }
        }
    }

    public aT(Context context) {
        super(context);
        this.ZRu = new HashMap();
    }

    public void FA() {
        if (TextUtils.isEmpty(this.NOt)) {
            return;
        }
        setProgress(0.0f);
        ZRu(true);
        setAnimationFromUrl(this.NOt);
        setImageAssetDelegate(new com.bytedance.adsdk.NOt.uR() { // from class: com.bytedance.sdk.component.adexpress.Ht.aT.1
            @Override // com.bytedance.adsdk.NOt.uR
            public Bitmap ZRu(final com.bytedance.adsdk.NOt.aT aTVar) {
                final String strMm = aTVar.Mm();
                String strVor = aTVar.Vor();
                String strFA = aTVar.FA();
                if (TextUtils.equals(strMm, "image_0") && TextUtils.equals(strFA, "Lark20201123-180048_2.png")) {
                    strFA = "hand.png";
                }
                Bitmap bitmap = (Bitmap) aT.this.ZRu.get(strMm);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strVor) || !TextUtils.isEmpty(strFA)) {
                    strVor = (TextUtils.isEmpty(strFA) || !TextUtils.isEmpty(strVor)) ? (TextUtils.isEmpty(strFA) || TextUtils.isEmpty(strVor)) ? "" : j.a(strVor, strFA) : strFA;
                }
                if (TextUtils.isEmpty(strVor)) {
                    return null;
                }
                com.bytedance.sdk.component.TFq.aT aTVarZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().TFq().ZRu(strVor).ZRu(new com.bytedance.sdk.component.TFq.FA() { // from class: com.bytedance.sdk.component.adexpress.Ht.aT.1.1
                    @Override // com.bytedance.sdk.component.TFq.FA
                    public Bitmap ZRu(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, aTVar.ZRu(), aTVar.NOt(), false);
                        aT.this.ZRu.put(strMm, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                aT aTVar2 = aT.this;
                aTVarZRu.ZRu(new ZRu(aTVar2, aTVar, strMm, aTVar2.ZRu));
                return (Bitmap) aT.this.ZRu.get(strMm);
            }
        });
        ZRu();
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.NOt = str;
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }
}
