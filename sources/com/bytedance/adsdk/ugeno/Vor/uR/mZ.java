package com.bytedance.adsdk.ugeno.Vor.uR;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.Mm.FA;
import com.bytedance.adsdk.ugeno.ZRu;
import com.bytedance.adsdk.ugeno.uR;
import o3.C5321a;
import o3.C5322b;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends com.bytedance.adsdk.ugeno.NOt.mZ<ZRu> {
    private float CTl;
    protected boolean HZ;
    protected ImageView.ScaleType NOt;
    private float RPV;
    protected String ZRu;
    private int jJC;

    public mZ(Context context) {
        super(context);
        this.NOt = ImageView.ScaleType.FIT_XY;
        this.jJC = -1;
        this.RPV = -1.0f;
        this.CTl = -1.0f;
    }

    private void nqR() {
        if (this.RPV > 0.0f) {
            uR.ZRu().NOt().ZRu(this.aT, this.ZRu, new ZRu.InterfaceC0392ZRu() { // from class: com.bytedance.adsdk.ugeno.Vor.uR.mZ.1
                @Override // com.bytedance.adsdk.ugeno.ZRu.InterfaceC0392ZRu
                public void ZRu(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapZRu = FA.ZRu(((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).mZ, bitmap, (int) mZ.this.RPV);
                    if (bitmapZRu != null) {
                        FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Vor.uR.mZ.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((ZRu) ((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).Ht).setImageBitmap(bitmapZRu);
                            }
                        });
                    }
                    mZ mZVar = mZ.this;
                    if (mZVar.HZ || mZVar.CTl > 0.0f) {
                        Bitmap bitmapZRu2 = FA.ZRu(((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).mZ, bitmap, mZ.this.CTl > 0.0f ? (int) mZ.this.CTl : 10);
                        if (bitmapZRu2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).mZ.getResources(), bitmapZRu2);
                            FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Vor.uR.mZ.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((ZRu) ((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).Ht).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.ZRu zRuNOt = uR.ZRu().NOt();
        com.bytedance.adsdk.ugeno.core.FA fa2 = this.aT;
        String str = this.ZRu;
        T t10 = this.Ht;
        zRuNOt.ZRu(fa2, str, (ImageView) t10, ((ZRu) t10).getWidth(), ((ZRu) this.Ht).getHeight());
        if (this.HZ || this.CTl > 0.0f) {
            uR.ZRu().NOt().ZRu(this.aT, this.ZRu, new ZRu.InterfaceC0392ZRu() { // from class: com.bytedance.adsdk.ugeno.Vor.uR.mZ.2
                @Override // com.bytedance.adsdk.ugeno.ZRu.InterfaceC0392ZRu
                public void ZRu(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapZRu = FA.ZRu(((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).mZ, bitmap, mZ.this.CTl > 0.0f ? (int) mZ.this.CTl : 10);
                    FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Vor.uR.mZ.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapZRu != null) {
                                ((ZRu) ((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).Ht).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).mZ.getResources(), bitmapZRu));
                            }
                        }
                    });
                }
            });
        }
    }

    private ImageView.ScaleType Mm(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void mZ() {
        if (TextUtils.isEmpty(this.ZRu)) {
            return;
        }
        ((ZRu) this.Ht).setImageDrawable(null);
        if (this.ZRu.startsWith("local://")) {
            try {
                ((ZRu) this.Ht).setImageResource(com.bytedance.adsdk.ugeno.Mm.uR.ZRu(this.mZ, this.ZRu.replace("local://", "")));
            } catch (Exception unused) {
            }
        } else if (!this.ZRu.startsWith("@")) {
            nqR();
        } else {
            ((ZRu) this.Ht).setImageResource(Integer.parseInt(this.ZRu.substring(1)));
        }
    }

    public void FA(String str) {
        this.ZRu = str;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        mZ();
        ((ZRu) this.Ht).setScaleType(this.NOt);
        ((ZRu) this.Ht).setBorderColor(this.HX);
        ((ZRu) this.Ht).setCornerRadius(this.Qg);
        ((ZRu) this.Ht).setBorderWidth(this.Np);
        int i10 = this.jJC;
        if (i10 != -1) {
            ((ZRu) this.Ht).setColorFilter(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public ZRu uR() {
        ZRu zRu = new ZRu(this.mZ);
        zRu.ZRu(this);
        return zRu;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ, com.bytedance.adsdk.ugeno.mZ
    public void FA() {
        super.FA();
        Drawable drawable = ((ZRu) this.Ht).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !C5321a.a(drawable)) {
            return;
        }
        C5322b.a(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ZRu(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.NOt = Mm(str2);
                break;
            case "imageBlur":
                this.RPV = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.HZ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, false);
                break;
            case "src":
                this.ZRu = str2;
                break;
            case "tintColor":
                this.jJC = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case "imageBgBlur":
                this.CTl = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, -1.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ, com.bytedance.adsdk.ugeno.mZ
    public void Mm() {
        super.Mm();
        ((ZRu) this.Ht).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Vor.uR.mZ.3
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((ZRu) ((com.bytedance.adsdk.ugeno.NOt.mZ) mZ.this).Ht).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !C5321a.a(drawable)) {
                    return;
                }
                C5322b.a(drawable).start();
            }
        });
    }
}
