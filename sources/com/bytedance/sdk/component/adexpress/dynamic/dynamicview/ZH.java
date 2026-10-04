package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.ref.WeakReference;
import java.util.Map;
import o3.C5321a;
import o3.C5322b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZH extends Ht {
    private String ZRu;

    public static class NOt implements com.bytedance.sdk.component.TFq.yBV<Bitmap> {
        private Resources NOt;
        private WeakReference<View> ZRu;

        public NOt(View view, Resources resources) {
            this.ZRu = new WeakReference<>(view);
            this.NOt = resources;
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(int i10, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(com.bytedance.sdk.component.TFq.ZH<Bitmap> zh) {
            Bitmap bitmapNOt;
            View view = this.ZRu.get();
            if (view == null || (bitmapNOt = zh.NOt()) == null || zh.mZ() == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(this.NOt, bitmapNOt));
        }
    }

    public static class ZRu implements com.bytedance.sdk.component.TFq.FA {
        private final WeakReference<Context> ZRu;

        public ZRu(Context context) {
            this.ZRu = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.TFq.FA
        public Bitmap ZRu(Bitmap bitmap) {
            Context context = this.ZRu.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.uR.ZRu.ZRu(context, bitmap, 25);
            }
            return null;
        }
    }

    public ZH(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        if (!TextUtils.isEmpty(this.lp.IOC()) && fa2.om()) {
            com.bytedance.sdk.component.adexpress.Ht.aT aTVar = new com.bytedance.sdk.component.adexpress.Ht.aT(context);
            aTVar.setAnimationsLoop(this.lp.Wo());
            aTVar.setImageLottieTosPath(this.lp.IOC());
            aTVar.setLottieAppNameMaxLength(this.lp.CXy());
            aTVar.setLottieAdTitleMaxLength(this.lp.MO());
            aTVar.setLottieAdDescMaxLength(this.lp.wZ());
            aTVar.setData(fa2.OCA());
            this.oK = aTVar;
        } else if (this.lp.oK() > 0.0f) {
            com.bytedance.sdk.component.adexpress.Ht.le leVar = new com.bytedance.sdk.component.adexpress.Ht.le(context);
            this.oK = leVar;
            leVar.setXRound((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, this.lp.oK()));
            ((com.bytedance.sdk.component.adexpress.Ht.le) this.oK).setYRound((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, this.lp.oK()));
        } else if (!FA() && "arrowButton".equals(fa2.aT().NOt())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.NOt nOt = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.NOt(context);
            nOt.setBrickNativeValue(this.lp);
            this.oK = nOt;
        } else if (com.bytedance.sdk.component.adexpress.uR.aT.NOt(this.lp.ZH())) {
            this.oK = new com.bytedance.sdk.component.adexpress.Ht.sAl(context);
        } else {
            this.oK = new ImageView(context);
        }
        this.ZRu = getImageKey();
        this.oK.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(fa2.aT().NOt())) {
            if (this.lp.NOt() > 0 || this.lp.ZRu() > 0) {
                int iMin = Math.min(this.Mm, this.FA);
                this.Mm = iMin;
                this.FA = Math.min(iMin, this.FA);
                this.Vor = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, (this.lp.ZRu() / 2) + this.lp.NOt() + 0.5f) + this.Vor);
            } else {
                int iMax = Math.max(this.Mm, this.FA);
                this.Mm = iMax;
                this.FA = Math.max(iMax, this.FA);
            }
            this.lp.ZRu(this.Mm / 2);
        }
        addView(this.oK, new FrameLayout.LayoutParams(this.Mm, this.FA));
    }

    private boolean ZRu() {
        String strLp = this.lp.lp();
        if (this.lp.OCA()) {
            return true;
        }
        if (TextUtils.isEmpty(strLp)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strLp);
            return Math.abs((((float) this.Mm) / (((float) this.FA) * 1.0f)) - (((float) jSONObject.optInt(InMobiNetworkValues.WIDTH)) / (((float) jSONObject.optInt(InMobiNetworkValues.HEIGHT)) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> mapZH = this.edo.getRenderRequest().ZH();
        if (mapZH == null || mapZH.size() <= 0) {
            return null;
        }
        return mapZH.get(this.lp.ZH());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        int iYBV;
        super.Vor();
        if (!TextUtils.isEmpty(this.lp.IOC())) {
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iOK = 0;
        if ("arrowButton".equals(this.sAl.aT().NOt())) {
            ((ImageView) this.oK).setImageResource(com.bytedance.sdk.component.utils.om.uR(this.ZH, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.oK).getDrawable() != null) {
                ((ImageView) this.oK).getDrawable().setAutoMirrored(true);
            }
            this.oK.setPadding(0, 0, 0, 0);
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.oK.setBackgroundColor(this.lp.Nb());
        String strMZ = this.sAl.aT().mZ();
        if ("user".equals(strMZ)) {
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.oK).setColorFilter(this.lp.Mm());
            ((ImageView) this.oK).setImageDrawable(com.bytedance.sdk.component.utils.om.mZ(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.oK;
            int i10 = this.Mm;
            imageView.setPadding(i10 / 10, this.FA / 5, i10 / 10, 0);
        } else if (strMZ != null && strMZ.startsWith("@")) {
            try {
                ((ImageView) this.oK).setImageResource(Integer.parseInt(strMZ.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.TFq.oK oKVarTFq = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().TFq();
        String strZH = this.lp.ZH();
        if (!TextUtils.isEmpty(strZH) && !strZH.startsWith("http:") && !strZH.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.edo;
            strZH = com.bytedance.sdk.component.adexpress.dynamic.TFq.Vor.NOt(strZH, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.edo.getRenderRequest().ru());
        }
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
        if (mZVarMZ != null) {
            iOK = mZVarMZ.oK();
            iYBV = mZVarMZ.yBV();
        } else {
            iYBV = 0;
        }
        com.bytedance.sdk.component.TFq.aT aTVarTFq = oKVarTFq.ZRu(strZH).ZRu(this.ZRu).ZRu(this.Mm).NOt(this.FA).uR(iOK).TFq(iYBV);
        String strEdo = this.edo.getRenderRequest().edo();
        if (!TextUtils.isEmpty(strEdo)) {
            aTVarTFq.NOt(strEdo);
        }
        if (ZRu()) {
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.FIT_CENTER);
            aTVarTFq.ZRu(Bitmap.Config.ARGB_4444).mZ(2).ZRu(new ZRu(this.ZH)).ZRu(new NOt(this.oK, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                aTVarTFq.ZRu((ImageView) this.oK);
            }
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.oK instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.uR.NOt()) {
            ZRu(aTVarTFq);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.oK).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !C5321a.a(drawable)) {
            return;
        }
        C5322b.a(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.oK).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !C5321a.a(drawable)) {
            return;
        }
        C5322b.a(drawable).stop();
    }

    private void ZRu(com.bytedance.sdk.component.TFq.aT aTVar) {
        aTVar.mZ(3).ZRu(new com.bytedance.sdk.component.TFq.yBV() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZH.1
            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(int i10, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(com.bytedance.sdk.component.TFq.ZH zh) {
                Object objNOt = zh.NOt();
                if (objNOt instanceof byte[]) {
                    ZH zh2 = ZH.this;
                    View view = zh2.oK;
                    if (view instanceof ImageView) {
                        com.bytedance.sdk.component.adexpress.uR.Ht.NOt((ImageView) view, (byte[]) objNOt, zh2.Mm, zh2.FA);
                    }
                }
            }
        });
    }
}
