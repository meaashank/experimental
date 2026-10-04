package com.bytedance.sdk.openadsdk.uR.ZRu;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements com.bytedance.sdk.openadsdk.multipro.ZRu {
    private final com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt ZRu;

    public TFq(com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt) {
        this.ZRu = nOt;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public String ZRu() {
        com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.mZ();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public String ZRu(Uri uri) {
        com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.ZRu(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Cursor ZRu(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.ZRu(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Uri ZRu(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.ZRu(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.ZRu(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.ZRu(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
