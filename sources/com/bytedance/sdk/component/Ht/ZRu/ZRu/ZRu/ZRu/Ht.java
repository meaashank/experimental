package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu;

import android.content.Context;
import android.support.v4.media.i;
import com.bytedance.sdk.component.Ht.ZRu.FA;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends Mm {
    public Ht(Context context, com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        super(context, zRu);
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Mm, com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.mZ
    public String NOt() {
        return FA.Mm().uR().TFq();
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Mm
    public byte ZRu() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Mm
    public byte mZ() {
        return (byte) 3;
    }

    public static String ZRu(String str) {
        return i.a("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
