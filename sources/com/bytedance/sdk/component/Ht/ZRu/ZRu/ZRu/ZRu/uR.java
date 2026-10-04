package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu;

import android.content.Context;
import android.support.v4.media.i;
import com.bytedance.sdk.component.Ht.ZRu.FA;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    public uR(Context context, com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        super(context, zRu);
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu, com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.mZ
    public String NOt() {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq tFqUR = FA.Mm().uR();
        if (tFqUR != null) {
            return tFqUR.ZRu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu
    public byte mZ() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu
    public byte uR() {
        return (byte) 0;
    }

    public static String mZ(String str) {
        return i.a("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
