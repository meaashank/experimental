package com.bytedance.adsdk.mZ;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.NOt.Ht;
import com.bytedance.adsdk.NOt.aT;
import com.bytedance.adsdk.NOt.uR;
import com.bytedance.adsdk.ugeno.Mm.FA;
import com.bytedance.adsdk.ugeno.NOt.mZ;
import com.bytedance.adsdk.ugeno.ZRu;
import com.bytedance.adsdk.ugeno.mZ.NOt;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends mZ<Ht> {
    private HashMap<String, Bitmap> AOL;

    @Deprecated
    private boolean CTl;
    private String HZ;
    protected ImageView.ScaleType NOt;
    private boolean RPV;
    protected ImageView.ScaleType ZRu;
    private float bDW;
    private boolean cA;
    private int fOq;
    private String jJC;
    private float wcb;

    /* JADX INFO: renamed from: com.bytedance.adsdk.mZ.ZRu$1, reason: invalid class name */
    public class AnonymousClass1 implements uR {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.NOt.uR
        public Bitmap ZRu(final aT aTVar) {
            final String strZRu;
            if (aTVar == null) {
                return null;
            }
            String strVor = aTVar.Vor();
            String strFA = aTVar.FA();
            if (!TextUtils.isEmpty(strVor) && TextUtils.isEmpty(strFA)) {
                strZRu = NOt.ZRu(strVor, ((mZ) ZRu.this).TFq);
            } else if (!TextUtils.isEmpty(strFA) && TextUtils.isEmpty(strVor)) {
                strZRu = NOt.ZRu(strFA, ((mZ) ZRu.this).TFq);
            } else if (TextUtils.isEmpty(strFA) || TextUtils.isEmpty(strVor)) {
                strZRu = null;
            } else {
                strZRu = NOt.ZRu(strVor, ((mZ) ZRu.this).TFq) + NOt.ZRu(strFA, ((mZ) ZRu.this).TFq);
            }
            if (TextUtils.isEmpty(strZRu)) {
                return null;
            }
            Bitmap bitmap = (Bitmap) ZRu.this.AOL.get(strZRu);
            if (bitmap != null) {
                return bitmap;
            }
            com.bytedance.adsdk.ugeno.uR.ZRu().NOt().ZRu(((mZ) ZRu.this).aT, strZRu, new ZRu.InterfaceC0392ZRu() { // from class: com.bytedance.adsdk.mZ.ZRu.1.1
                @Override // com.bytedance.adsdk.ugeno.ZRu.InterfaceC0392ZRu
                public void ZRu(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, aTVar.ZRu(), aTVar.NOt(), false);
                        ZRu.this.AOL.put(strZRu, bitmapCreateScaledBitmap);
                        FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.mZ.ZRu.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((Ht) ((mZ) ZRu.this).Ht).ZRu(aTVar.Mm(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return (Bitmap) ZRu.this.AOL.get(strZRu);
        }
    }

    public ZRu(Context context) {
        super(context);
        this.jJC = "images";
        this.wcb = 1.0f;
        this.ZRu = ImageView.ScaleType.FIT_CENTER;
        this.NOt = ImageView.ScaleType.FIT_XY;
        this.AOL = new HashMap<>();
    }

    private ImageView.ScaleType FA(String str) {
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
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType Vor(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        return !str.equals("fit") ? !str.equals("crop") ? scaleType : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER;
    }

    private String Mm(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(ImagesContract.LOCAL)) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        ((Ht) this.Ht).setProgress(this.bDW);
        if (this.wcb <= 0.0f) {
            this.wcb = 1.0f;
        }
        ((Ht) this.Ht).setSpeed(this.wcb);
        if (this.HZ.startsWith(ImagesContract.LOCAL)) {
            ((Ht) this.Ht).setAnimation(Mm(this.HZ));
            ((Ht) this.Ht).setImageAssetsFolder(this.jJC);
        } else {
            ((Ht) this.Ht).setAnimationFromUrl(this.HZ);
        }
        ((Ht) this.Ht).setImageAssetDelegate(new AnonymousClass1());
        if (Nb()) {
            ((Ht) this.Ht).setScaleType(this.NOt);
        } else {
            ((Ht) this.Ht).setScaleType(this.ZRu);
        }
        if (Nb()) {
            ((Ht) this.Ht).setRepeatCount(this.fOq);
        } else {
            ((Ht) this.Ht).ZRu(this.CTl);
        }
        mZ();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public Ht uR() {
        Ht ht = new Ht(this.mZ);
        ht.ZRu(this);
        return ht;
    }

    public void mZ() {
        ((Ht) this.Ht).ZRu();
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
                this.NOt = Vor(str2);
                break;
            case "scaleType":
                this.ZRu = FA(str2);
                break;
            case "progress":
                this.bDW = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case "imagePath":
                this.jJC = str2;
                break;
            case "autoReverse":
                this.RPV = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, false);
                break;
            case "src":
                this.HZ = str2;
                break;
            case "loop":
                if (Nb()) {
                    this.fOq = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0);
                    break;
                } else {
                    this.CTl = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, false);
                    break;
                }
                break;
            case "speed":
                this.wcb = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 1.0f);
                break;
            case "autoPlay":
                this.cA = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, false);
                break;
            case "autoplay":
                this.cA = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, true);
                break;
        }
    }
}
