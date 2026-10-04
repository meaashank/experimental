package com.bytedance.sdk.component.TFq.mZ;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.TFq.aT;
import com.bytedance.sdk.component.TFq.mZ.mZ;
import com.bytedance.sdk.component.TFq.oK;
import com.bytedance.sdk.component.TFq.om;
import com.bytedance.sdk.component.TFq.sAl;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements oK {
    private volatile Ht ZRu;

    private NOt() {
    }

    private void NOt(Context context, sAl sal) {
        if (this.ZRu != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (sal == null) {
            sal = TFq.ZRu(context);
        }
        this.ZRu = new Ht(context, sal);
    }

    public static oK ZRu(Context context, sAl sal) {
        NOt nOt = new NOt();
        nOt.NOt(context, sal);
        return nOt;
    }

    @Override // com.bytedance.sdk.component.TFq.oK
    public aT ZRu(String str) {
        return new mZ.NOt(this.ZRu).mZ(str);
    }

    @Override // com.bytedance.sdk.component.TFq.oK
    public InputStream ZRu(String str, String str2) {
        if (this.ZRu != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.TFq.mZ.mZ.mZ.ZRu(str);
            }
            Collection<om> collectionNOt = this.ZRu.NOt();
            if (collectionNOt != null) {
                Iterator<om> it = collectionNOt.iterator();
                while (it.hasNext()) {
                    byte[] bArrZRu = it.next().ZRu(str2);
                    if (bArrZRu != null) {
                        return new ByteArrayInputStream(bArrZRu);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.TFq.mZ> collectionMZ = this.ZRu.mZ();
            if (collectionMZ != null) {
                Iterator<com.bytedance.sdk.component.TFq.mZ> it2 = collectionMZ.iterator();
                while (it2.hasNext()) {
                    InputStream inputStreamZRu = it2.next().ZRu(str2);
                    if (inputStreamZRu != null) {
                        return inputStreamZRu;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.TFq.oK
    public boolean ZRu(String str, String str2, String str3) {
        if (this.ZRu == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.TFq.mZ.mZ.mZ.ZRu(str);
        }
        com.bytedance.sdk.component.TFq.mZ mZVarZRu = this.ZRu.ZRu(str3);
        if (mZVarZRu != null) {
            return mZVarZRu.NOt(str2);
        }
        return false;
    }
}
