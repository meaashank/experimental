package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq {
    public static final TFq ZRu = new TFq();
    private volatile SQLiteDatabase NOt;

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public String Ht() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public String NOt() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public String TFq() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public SQLiteDatabase ZRu(Context context) {
        if (this.NOt == null) {
            synchronized (this) {
                try {
                    if (this.NOt == null) {
                        this.NOt = new uR(context).getWritableDatabase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public String mZ() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public String uR() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq
    public String ZRu() {
        return "loghighpriority";
    }
}
