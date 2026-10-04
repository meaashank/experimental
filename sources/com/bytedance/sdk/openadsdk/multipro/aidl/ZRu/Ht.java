package com.bytedance.sdk.openadsdk.multipro.aidl.ZRu;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.Ht.ZRu.Ht;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.settings.lp;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Ht extends Ht.ZRu {
    private static volatile Ht ZRu;

    public static Ht NOt() {
        if (ZRu == null) {
            synchronized (Ht.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new Ht();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
    public Map ZRu(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!lp.ZRu()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(com.bytedance.sdk.openadsdk.multipro.TFq.ZRu(WMI.ZRu()).ZRu(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
    public String ZRu(Uri uri) {
        if (lp.ZRu()) {
            return com.bytedance.sdk.openadsdk.multipro.TFq.ZRu(WMI.ZRu()).ZRu(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
    public String ZRu(Uri uri, ContentValues contentValues) {
        Uri uriZRu;
        if (lp.ZRu() && (uriZRu = com.bytedance.sdk.openadsdk.multipro.TFq.ZRu(WMI.ZRu()).ZRu(uri, contentValues)) != null) {
            return uriZRu.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
    public int ZRu(Uri uri, String str, String[] strArr) {
        if (lp.ZRu()) {
            return com.bytedance.sdk.openadsdk.multipro.TFq.ZRu(WMI.ZRu()).ZRu(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
    public int ZRu(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (lp.ZRu()) {
            return com.bytedance.sdk.openadsdk.multipro.TFq.ZRu(WMI.ZRu()).ZRu(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
