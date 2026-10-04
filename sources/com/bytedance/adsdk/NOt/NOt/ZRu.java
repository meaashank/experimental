package com.bytedance.adsdk.NOt.NOt;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.NOt.mZ;
import com.bytedance.adsdk.NOt.mZ.Mm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private mZ TFq;
    private final AssetManager uR;
    private final Mm<String> ZRu = new Mm<>();
    private final Map<Mm<String>, Typeface> NOt = new HashMap();
    private final Map<String, Typeface> mZ = new HashMap();
    private String Ht = ".ttf";

    public ZRu(Drawable.Callback callback, mZ mZVar) {
        this.TFq = mZVar;
        if (callback instanceof View) {
            this.uR = ((View) callback).getContext().getAssets();
        } else {
            this.uR = null;
        }
    }

    private Typeface NOt(com.bytedance.adsdk.NOt.mZ.mZ mZVar) {
        Typeface typefaceCreateFromAsset;
        String strZRu = mZVar.ZRu();
        Typeface typeface = this.mZ.get(strZRu);
        if (typeface != null) {
            return typeface;
        }
        String strMZ = mZVar.mZ();
        String strNOt = mZVar.NOt();
        mZ mZVar2 = this.TFq;
        if (mZVar2 != null) {
            typefaceCreateFromAsset = mZVar2.ZRu(strZRu, strMZ, strNOt);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.TFq.ZRu(strZRu);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        mZ mZVar3 = this.TFq;
        if (mZVar3 != null && typefaceCreateFromAsset == null) {
            String strNOt2 = mZVar3.NOt(strZRu, strMZ, strNOt);
            if (strNOt2 == null) {
                strNOt2 = this.TFq.NOt(strZRu);
            }
            if (strNOt2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.uR, strNOt2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (mZVar.uR() != null) {
            return mZVar.uR();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.uR, "fonts/" + strZRu + this.Ht);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.mZ.put(strZRu, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void ZRu(mZ mZVar) {
        this.TFq = mZVar;
    }

    public void ZRu(String str) {
        this.Ht = str;
    }

    public Typeface ZRu(com.bytedance.adsdk.NOt.mZ.mZ mZVar) {
        this.ZRu.ZRu(mZVar.ZRu(), mZVar.mZ());
        Typeface typeface = this.NOt.get(this.ZRu);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceZRu = ZRu(NOt(mZVar), mZVar.mZ());
        this.NOt.put(this.ZRu, typefaceZRu);
        return typefaceZRu;
    }

    private Typeface ZRu(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
