package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends TFq {
    private static String OCA = "";
    private Runnable NOt;
    private Runnable ZRu;
    protected com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor om;
    private volatile boolean to;
    private ImageView xY;

    public static class NOt implements com.bytedance.sdk.component.TFq.yBV<Bitmap> {
        private final WeakReference<TFq> NOt;
        private final WeakReference<View> ZRu;

        public NOt(View view, TFq tFq) {
            this.ZRu = new WeakReference<>(view);
            this.NOt = new WeakReference<>(tFq);
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(int i10, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(com.bytedance.sdk.component.TFq.ZH<Bitmap> zh) {
            Bitmap bitmapNOt;
            TFq tFq;
            View view = this.ZRu.get();
            if (view == null || (bitmapNOt = zh.NOt()) == null || zh.mZ() == null || (tFq = this.NOt.get()) == null) {
                return;
            }
            view.setBackground(tFq.ZRu(bitmapNOt));
        }
    }

    public static class ZRu implements com.bytedance.sdk.component.TFq.yBV<Bitmap> {
        private final WeakReference<DynamicRootView> NOt;
        private final WeakReference<View> ZRu;
        private final com.bytedance.sdk.component.adexpress.dynamic.uR.FA mZ;

        public ZRu(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
            this.ZRu = new WeakReference<>(view);
            this.NOt = new WeakReference<>(dynamicRootView);
            this.mZ = fa2;
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(int i10, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(com.bytedance.sdk.component.TFq.ZH<Bitmap> zh) {
            View view = this.ZRu.get();
            if (!com.bytedance.sdk.component.adexpress.uR.NOt()) {
                DynamicRootView dynamicRootView = this.NOt.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().uR()) || "splash_ad".equals(dynamicRootView.getRenderRequest().uR())) {
                    view.setBackground(new BitmapDrawable(zh.NOt()));
                    return;
                } else {
                    view.setBackground(new BitmapDrawable(zh.NOt()));
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(zh.NOt()));
            com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 = this.mZ;
            if (fa2 == null || fa2.aT() == null || 6 != this.mZ.aT().ZRu() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    public static class mZ implements com.bytedance.sdk.component.TFq.FA {
        private final int NOt;
        private final WeakReference<Context> ZRu;

        public mZ(Context context, int i10) {
            this.ZRu = new WeakReference<>(context);
            this.NOt = i10;
        }

        @Override // com.bytedance.sdk.component.TFq.FA
        public Bitmap ZRu(Bitmap bitmap) {
            Context context = this.ZRu.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.uR.ZRu.ZRu(context, bitmap, this.NOt);
            }
            return null;
        }
    }

    public Ht(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        this.to = true;
        setTag(Integer.valueOf(getClickArea()));
        String strNOt = fa2.aT().NOt();
        if ("logo-union".equals(strNOt)) {
            dynamicRootView.setLogoUnionHeight(this.FA - ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, this.lp.ZRu() + this.lp.NOt())));
        } else if ("scoreCountWithIcon".equals(strNOt)) {
            dynamicRootView.setScoreCountWithIcon(this.FA - ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, this.lp.ZRu() + this.lp.NOt())));
        }
    }

    private String NOt(String str) {
        try {
            Map<String, String> mapZH = this.edo.getRenderRequest().ZH();
            if (mapZH != null && mapZH.size() > 0) {
                return mapZH.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String getBuildModel() {
        try {
            OCA = com.bytedance.sdk.component.utils.to.ZRu();
        } catch (Throwable unused) {
            OCA = Build.MODEL;
        }
        if (TextUtils.isEmpty(OCA)) {
            OCA = Build.MODEL;
        }
        return OCA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable mZ(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i10));
                } else if (jSONArray.getString(i10).endsWith("deg")) {
                    string = jSONArray.getString(i10);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.uR.Mm.ZRu(((String) arrayList.get(i11)).substring(0, 7));
            }
            GradientDrawable gradientDrawableZRu = ZRu(ZRu(string), iArr);
            gradientDrawableZRu.setShape(0);
            gradientDrawableZRu.setCornerRadius(com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.oK()));
            return gradientDrawableZRu;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        int iOK;
        int iYBV;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        View view = this.oK;
        final View view2 = view;
        if (view == null) {
            view2 = this;
        }
        setContentDescription(this.sAl.ZRu(this.lp.fcs()));
        String strFFX = this.lp.FFX();
        String strRu = null;
        String strZRu = (TextUtils.isEmpty(strFFX) || (dynamicRootView = this.edo) == null || dynamicRootView.getRenderRequest() == null || this.edo.getRenderRequest().mZ() == null || (jSONObjectOptJSONObject = this.edo.getRenderRequest().mZ().optJSONObject("creative")) == null) ? null : ZRu(jSONObjectOptJSONObject.opt(strFFX));
        if (TextUtils.isEmpty(strZRu)) {
            strZRu = this.lp.to();
        }
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
        if (mZVarMZ != null) {
            iOK = mZVarMZ.oK();
            iYBV = mZVarMZ.yBV();
        } else {
            iOK = 0;
            iYBV = 0;
        }
        if (this.lp.OCA()) {
            int iOm = this.lp.om();
            String str = this.lp.NOt;
            com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().TFq().ZRu(str).ZRu(this.Mm).NOt(this.FA).uR(iOK).TFq(iYBV).ZRu(NOt(str)).mZ(2).ZRu(new mZ(this.ZH, iOm)).ZRu(new NOt(view2, this));
        } else if (!TextUtils.isEmpty(strZRu)) {
            if (!strZRu.startsWith("http:") && !strZRu.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.edo;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strRu = this.edo.getRenderRequest().ru();
                }
                strZRu = com.bytedance.sdk.component.adexpress.dynamic.TFq.Vor.NOt(strZRu, strRu);
            }
            com.bytedance.sdk.component.TFq.aT aTVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().TFq().ZRu(strZRu).ZRu(this.Mm).NOt(this.FA).uR(iOK).TFq(iYBV).ZRu(NOt(strZRu)).mZ(2);
            ZRu(aTVarMZ);
            if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                aTVarMZ.ZRu(new ZRu(view2, this.edo, this.sAl));
            } else if ((view2 instanceof FrameLayout) && a.a(this.sAl, "vessel")) {
                if (com.bytedance.sdk.component.adexpress.uR.aT.NOt(strZRu)) {
                    this.xY = new com.bytedance.sdk.component.adexpress.Ht.sAl(this.ZH);
                } else {
                    this.xY = new ImageView(this.ZH);
                }
                ((FrameLayout) view2).addView(this.xY, new FrameLayout.LayoutParams(-1, -1));
                aTVarMZ.mZ(3).ZRu(new com.bytedance.sdk.component.TFq.yBV() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.1
                    @Override // com.bytedance.sdk.component.TFq.yBV
                    public void ZRu(int i10, String str2, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.TFq.yBV
                    public void ZRu(com.bytedance.sdk.component.TFq.ZH zh) {
                        Object objNOt = zh.NOt();
                        if (objNOt instanceof byte[]) {
                            Ht ht = Ht.this;
                            com.bytedance.sdk.component.adexpress.uR.Ht.NOt(Ht.this.xY, (byte[]) objNOt, ht.Mm, ht.FA);
                        }
                    }
                });
            } else {
                ZRu(aTVarMZ, view2);
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view2.setBackground(backgroundDrawable);
        }
        if (this.lp.VdW() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (Ht.this.lp.Cox() > 0) {
                            Ht ht = Ht.this;
                            Drawable drawableMZ = ht.mZ(ht.edo.getBgMaterialCenterCalcColor().get(Integer.valueOf(Ht.this.lp.Cox())));
                            if (drawableMZ == null) {
                                Ht ht2 = Ht.this;
                                drawableMZ = ht2.ZRu(true, ht2.edo.getBgMaterialCenterCalcColor().get(Integer.valueOf(Ht.this.lp.Cox())));
                            }
                            if (drawableMZ != null) {
                                view2.setBackground(drawableMZ);
                                return;
                            }
                            View view3 = view2;
                            Ht ht3 = Ht.this;
                            view3.setBackground(ht3.ZRu(true, ht3.edo.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.lp.VdW() * 1000.0d));
        }
        View view3 = this.oK;
        if (view3 != null) {
            view3.setPadding((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.mZ()), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.NOt()), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.uR()), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.ZRu()));
        }
        if (this.yBV || this.lp.edo() > 0.0d) {
            setShouldInvisible(true);
            view2.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.Mm, this.FA);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.oK;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        double dOCA = this.sAl.aT().TFq().OCA();
        if (dOCA < 90.0d && dOCA > 0.0d) {
            com.bytedance.sdk.component.utils.Mm.NOt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.4
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.setVisibility(8);
                }
            }, (long) (dOCA * 1000.0d));
        }
        ZRu(this.sAl.aT().TFq().om(), view2);
        if (!TextUtils.isEmpty(this.lp.Qg())) {
            ZRu();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.ZRu);
            removeCallbacks(this.NOt);
        } catch (Exception unused) {
        }
    }

    private String ZRu(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return ZRu(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return ZRu((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private void ZRu(com.bytedance.sdk.component.TFq.aT aTVar, final View view) {
        aTVar.ZRu(new com.bytedance.sdk.component.TFq.yBV<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.3
            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(int i10, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(com.bytedance.sdk.component.TFq.ZH<Bitmap> zh) {
                DynamicRootView dynamicRootView = Ht.this.edo;
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().uR()) && !"splash_ad".equals(Ht.this.edo.getRenderRequest().uR())) {
                    view.setBackground(new BitmapDrawable(zh.NOt()));
                } else {
                    if (!com.bytedance.sdk.component.adexpress.uR.NOt()) {
                        view.setBackground(new BitmapDrawable(zh.NOt()));
                        return;
                    }
                    view.setBackground(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZRu(zh.NOt(), ((qF) Ht.this.edo.getChildAt(0)).ZRu));
                }
            }
        });
    }

    private static void ZRu(com.bytedance.sdk.component.TFq.aT aTVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            aTVar.ZRu(Bitmap.Config.ARGB_8888);
        }
    }

    private void ZRu(double d10, final View view) {
        if (d10 > 0.0d) {
            com.bytedance.sdk.component.utils.Mm.NOt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.5
                @Override // java.lang.Runnable
                public void run() {
                    if (Ht.this.sAl.aT().TFq().KIc() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    Ht.this.setVisibility(0);
                }
            }, (long) (d10 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) instanceof com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor) {
                viewGroup.removeViewAt(i10);
            }
        }
    }

    private void ZRu() {
        if (this.to) {
            int iNl = this.lp.Nl();
            int iYz = this.lp.yz();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.6
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = Ht.this.edo;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        Ht ht = Ht.this;
                        Ht ht2 = Ht.this;
                        ht.om = new com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor(ht2.ZH, ht2, ht2.lp);
                    } else {
                        com.bytedance.sdk.component.adexpress.NOt.sAl renderRequest = Ht.this.edo.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.uR.aT aTVar = new com.bytedance.sdk.component.adexpress.dynamic.uR.aT();
                        aTVar.ZRu(renderRequest.oK());
                        aTVar.NOt(renderRequest.yBV());
                        aTVar.mZ(renderRequest.WMI());
                        aTVar.ZRu(renderRequest.qF());
                        aTVar.NOt(renderRequest.om());
                        aTVar.mZ(renderRequest.OCA());
                        aTVar.uR(renderRequest.to());
                        aTVar.TFq(renderRequest.xY());
                        Ht ht3 = Ht.this;
                        Ht ht4 = Ht.this;
                        ht3.om = new com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor(ht4.ZH, ht4, ht4.lp, aTVar, renderRequest);
                    }
                    Ht ht5 = Ht.this;
                    ht5.NOt(ht5.om);
                    if (Ht.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) Ht.this.getParent()).setClipChildren(false);
                    }
                    Ht.this.setClipChildren(false);
                    Ht.this.om.setTag(2);
                    Ht ht6 = Ht.this;
                    ht6.ZRu((ViewGroup) ht6);
                    Ht ht7 = Ht.this;
                    ht7.addView(ht7.om, new FrameLayout.LayoutParams(-1, -1));
                    Ht.this.om.mZ();
                }
            };
            this.ZRu = runnable;
            postDelayed(runnable, ((long) iNl) * 1000);
            if (this.lp.Jem() || iYz >= Integer.MAX_VALUE || iNl >= iYz) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht.7
                @Override // java.lang.Runnable
                public void run() {
                    Ht ht = Ht.this;
                    if (ht.om != null) {
                        ht.to = false;
                        Ht.this.om.uR();
                        Ht.this.om.setVisibility(4);
                        Ht ht2 = Ht.this;
                        ht2.removeView(ht2.om);
                    }
                }
            };
            this.NOt = runnable2;
            postDelayed(runnable2, ((long) iYz) * 1000);
        }
    }
}
