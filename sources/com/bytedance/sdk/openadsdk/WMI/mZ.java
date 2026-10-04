package com.bytedance.sdk.openadsdk.WMI;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.Mm.ZRu;
import com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.Vor;
import com.bytedance.sdk.component.NOt.ZRu.uR;
import com.bytedance.sdk.component.TFq.FA;
import com.bytedance.sdk.component.TFq.ZH;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.oK;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.settings.yBV;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile mZ ZRu;
    private final com.bytedance.sdk.component.Mm.ZRu NOt;
    private com.bytedance.sdk.openadsdk.WMI.ZRu.mZ mZ;

    private mZ(Context context) {
        ZRu.C0406ZRu c0406ZRu = new ZRu.C0406ZRu();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.Mm.ZRu ZRu2 = c0406ZRu.ZRu(10000L, timeUnit).NOt(10000L, timeUnit).mZ(10000L, timeUnit).ZRu(true).ZRu();
        this.NOt = ZRu2;
        com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.ZRu.ZRu(new Vor() { // from class: com.bytedance.sdk.openadsdk.WMI.mZ.1
            @Override // com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.Vor
            public boolean NOt() {
                return yBV.CH().KIc();
            }

            @Override // com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.Vor
            public ExecutorService ZRu() {
                if (yBV.CH().KIc()) {
                    return WD.aT();
                }
                return null;
            }
        });
        uR uRVarZRu = ZRu2.TFq().ZRu();
        if (uRVarZRu != null) {
            uRVarZRu.ZRu(32);
        }
    }

    public static mZ ZRu() {
        if (ZRu == null) {
            synchronized (mZ.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new mZ(WMI.ZRu());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    private void uR() {
        if (this.mZ == null) {
            this.mZ = new com.bytedance.sdk.openadsdk.WMI.ZRu.mZ();
        }
    }

    public com.bytedance.sdk.component.Mm.ZRu NOt() {
        return this.NOt;
    }

    public com.bytedance.sdk.openadsdk.WMI.ZRu.mZ mZ() {
        uR();
        return this.mZ;
    }

    public void ZRu(String str, int i10, int i11, ImageView imageView, qF qFVar) {
        com.bytedance.sdk.openadsdk.Vor.uR.ZRu(str).ZRu(i10).NOt(i11).TFq(Cox.uR(WMI.ZRu())).uR(Cox.mZ(WMI.ZRu())).mZ(2).ZRu(com.bytedance.sdk.openadsdk.Vor.mZ.ZRu(qFVar, str, imageView));
    }

    public void ZRu(int i10, final ImageView imageView, final qF qFVar) {
        com.bytedance.sdk.openadsdk.Vor.uR.ZRu(qFVar.Ht()).ZRu(i10).NOt(i10).TFq(Cox.uR(WMI.ZRu())).uR(Cox.mZ(WMI.ZRu())).mZ(2).ZRu(com.bytedance.sdk.openadsdk.Vor.mZ.ZRu(qFVar, qFVar.Ht(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.WMI.mZ.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String strMm = qFVar.Mm();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(strMm));
                        try {
                            com.bytedance.sdk.component.utils.NOt.ZRu(WMI.ZRu(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void ZRu(oK oKVar, ImageView imageView, qF qFVar) {
        if (oKVar == null || TextUtils.isEmpty(oKVar.ZRu()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.Vor.uR.ZRu(oKVar).mZ(2).ZRu(com.bytedance.sdk.openadsdk.Vor.mZ.ZRu(qFVar, oKVar.ZRu(), imageView));
    }

    public void ZRu(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.Vor.uR.ZRu(str).mZ(2).ZRu(new FA() { // from class: com.bytedance.sdk.openadsdk.WMI.mZ.4
            @Override // com.bytedance.sdk.component.TFq.FA
            public Bitmap ZRu(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.uR.ZRu.ZRu(view2.getContext(), bitmap, 10);
            }
        }).ZRu(new com.bytedance.sdk.component.TFq.yBV<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.WMI.mZ.3
            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(int i10, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(ZH<Bitmap> zh) {
                final View view2;
                if (zh == null) {
                    return;
                }
                final Bitmap bitmapNOt = zh.NOt();
                if (!(bitmapNOt instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!WD.TFq()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.WMI.mZ.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) bitmapNOt));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) bitmapNOt));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), bitmapNOt));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), bitmapNOt));
                }
            }
        });
    }
}
