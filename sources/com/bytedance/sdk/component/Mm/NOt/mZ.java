package com.bytedance.sdk.component.Mm.NOt;

import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mZ {
    int Ht;
    String TFq;
    protected ZH mZ;
    protected String uR = null;
    protected final Map<String, String> Mm = new HashMap();
    protected String FA = null;
    protected boolean Vor = false;

    public mZ(ZH zh) {
        this.mZ = zh;
        try {
            mZ(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void NOt(String str) {
        this.FA = str;
    }

    public void ZRu(String str) {
        this.TFq = str;
    }

    public void mZ(String str) {
        this.uR = str;
    }

    public void uR(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.Mm.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void NOt(String str, String str2) {
        this.Mm.put(str, str2);
    }

    public void ZRu(int i10) {
        this.Ht = i10;
    }

    public String mZ() {
        return this.uR;
    }

    public void NOt() {
        ZH zh;
        if (this.uR == null || (zh = this.mZ) == null) {
            return;
        }
        com.bytedance.sdk.component.NOt.ZRu.uR uRVarZRu = zh.ZRu();
        synchronized (uRVarZRu) {
            try {
                for (com.bytedance.sdk.component.NOt.ZRu.NOt nOt : uRVarZRu.mZ()) {
                    if (this.uR.equals(nOt.ZRu().ZRu())) {
                        nOt.mZ();
                    }
                }
                for (com.bytedance.sdk.component.NOt.ZRu.NOt nOt2 : uRVarZRu.uR()) {
                    if (this.uR.equals(nOt2.ZRu().ZRu())) {
                        nOt2.mZ();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ZRu(sAl.ZRu zRu) {
        if (zRu != null && this.Mm.size() > 0) {
            for (Map.Entry<String, String> entry : this.Mm.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    zRu.NOt(key, value);
                }
            }
        }
    }
}
