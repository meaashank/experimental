package com.bytedance.sdk.component.Ht.ZRu.Ht;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements NOt {
    private final TFq NOt;
    private final Context ZRu;

    @SuppressLint({"StaticFieldLeak"})
    public class ZRu extends com.bytedance.sdk.component.Ht.ZRu.TFq.TFq {
        private final uR NOt;
        private final String mZ;
        private final Map<String, String> uR;

        private String mZ(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.mZ)) ? str.replace("{UID}", this.mZ).replace("__UID__", this.mZ) : str;
        }

        public String NOt(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(mZ.mZ().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        public boolean ZRu(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith(R3.a.f67725c) || str.startsWith(R3.a.f67726d);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.Ht.ZRu.TFq.uR uRVarZRu;
            com.bytedance.sdk.component.Ht.ZRu.TFq tFqYBV = FA.Mm().yBV();
            if (tFqYBV == null || FA.Mm().Ht() == null || !tFqYBV.mZ() || !ZRu(this.NOt.NOt())) {
                return;
            }
            if (this.NOt.uR() >= tFqYBV.mZ(this.NOt.Ht())) {
                mZ.this.NOt.mZ(this.NOt);
                return;
            }
            try {
                tFqYBV.sAl();
                if (this.NOt.ZH()) {
                    mZ.this.NOt.ZRu(this.NOt);
                }
                if (tFqYBV.ZRu(mZ.this.ZRu())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strNOt = this.NOt.NOt();
                    if (tFqYBV.Ht() == 0) {
                        strNOt = mZ(this.NOt.NOt());
                        if (this.NOt.mZ()) {
                            strNOt = NOt(strNOt);
                        }
                    }
                    com.bytedance.sdk.component.Ht.ZRu.TFq.mZ mZVarAT = tFqYBV.aT();
                    if (mZVarAT == null) {
                        return;
                    }
                    mZVarAT.ZRu("User-Agent", tFqYBV.Vor());
                    mZVarAT.ZRu("csj_client_source_from", "1");
                    if (this.uR != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.uR.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        mZVarAT.ZRu("csj_extra_info", jSONObject.toString());
                    }
                    mZVarAT.ZRu(strNOt);
                    try {
                        uRVarZRu = mZVarAT.ZRu();
                        try {
                            tFqYBV.ZRu(uRVarZRu.ZRu());
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        uRVarZRu = null;
                    }
                    uR uRVar = this.NOt;
                    uRVar.ZRu(uRVar.uR() + 1);
                    if (uRVarZRu != null && uRVarZRu.ZRu()) {
                        mZ.this.NOt.mZ(this.NOt);
                        this.NOt.NOt();
                        tFqYBV.ZRu(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.NOt);
                        return;
                    }
                    if (uRVarZRu != null) {
                        this.NOt.NOt(uRVarZRu.NOt());
                        this.NOt.mZ(uRVarZRu.mZ());
                    }
                    if (uRVarZRu == null || uRVarZRu.NOt() != 8848) {
                        this.NOt.NOt();
                        if (this.NOt.uR() >= tFqYBV.mZ(this.NOt.Ht())) {
                            mZ.this.NOt.mZ(this.NOt);
                            this.NOt.NOt();
                        } else {
                            mZ.this.NOt.NOt(this.NOt);
                        }
                    } else {
                        uRVarZRu.mZ();
                        mZ.this.NOt.mZ(this.NOt);
                    }
                    tFqYBV.ZRu(false, this.NOt.FA(), System.currentTimeMillis() - jCurrentTimeMillis, this.NOt);
                }
            } catch (Throwable unused3) {
            }
        }

        private ZRu(uR uRVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.NOt = uRVar;
            this.mZ = str;
            this.uR = map;
        }
    }

    public mZ(Context context, TFq tFq) {
        this.ZRu = context;
        this.NOt = tFq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random mZ() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context ZRu() {
        Context context = this.ZRu;
        return context == null ? FA.Mm().Ht() : context;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.NOt
    public void ZRu(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.Ht.ZRu.TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || FA.Mm().Ht() == null || tFqYBV.uR() == null || !tFqYBV.mZ() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            tFqYBV.uR().execute(new ZRu(new uR(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.NOt
    public Runnable ZRu(final uR uRVar, final String str, final Map<String, String> map) {
        if (uRVar == null || TextUtils.isEmpty(uRVar.ZRu())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.Ht.ZRu.Ht.mZ.1
            @Override // java.lang.Runnable
            public void run() {
                if (mZ.this.NOt.ZRu(uRVar.ZRu()) != null) {
                    new ZRu(uRVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.Ht.NOt
    public void ZRu(final String str, final boolean z10) {
        com.bytedance.sdk.component.Ht.ZRu.TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || FA.Mm().Ht() == null || !tFqYBV.mZ()) {
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.TFq.TFq tFq = new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("trackFailedUrls") { // from class: com.bytedance.sdk.component.Ht.ZRu.Ht.mZ.2
            @Override // java.lang.Runnable
            public void run() {
                mZ.this.ZRu(mZ.this.NOt.ZRu(), str, z10);
            }
        };
        tFq.ZRu(1);
        if (tFqYBV.uR() != null) {
            tFqYBV.uR().execute(tFq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(List<uR> list, String str, boolean z10) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.TFq tFqYBV = FA.Mm().yBV();
        for (uR uRVar : list) {
            if (tFqYBV == null || tFqYBV.uR() == null) {
                str2 = str;
            } else {
                uRVar.ZRu(z10);
                str2 = str;
                tFqYBV.uR().execute(new ZRu(uRVar, str2, null));
            }
            str = str2;
        }
    }
}
