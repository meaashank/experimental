package com.bytedance.sdk.openadsdk.yBV.mZ;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private final SharedPreferences ZRu;

    public ZRu(Context context) {
        this.ZRu = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long ZRu() {
        return this.ZRu.getLong("last_upload_time", 0L);
    }

    public void ZRu(long j10) {
        SharedPreferences.Editor editorEdit = this.ZRu.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
