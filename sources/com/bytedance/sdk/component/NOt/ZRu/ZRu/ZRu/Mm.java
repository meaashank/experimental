package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.aT;
import com.bytedance.sdk.component.NOt.ZRu.lp;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.bytedance.sdk.component.NOt.ZRu.yBV;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends oK {
    public static int ZRu = -1;
    HttpURLConnection NOt;
    String TFq;
    sAl mZ;
    int uR;

    public Mm(HttpURLConnection httpURLConnection, sAl sal) {
        this.uR = ZRu;
        this.NOt = httpURLConnection;
        this.mZ = sal;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public lp FA() {
        return lp.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public yBV Ht() {
        FA fa2;
        com.bytedance.sdk.component.mZ.ZRu.ZRu zRu;
        com.bytedance.sdk.component.mZ.ZRu.ZRu zRu2;
        sAl sal = this.mZ;
        if (sal != null && (zRu2 = sal.NOt) != null) {
            zRu2.ZH();
        }
        try {
            try {
                fa2 = new FA(this.NOt);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.NOt;
                fa2 = new FA(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
            fa2 = null;
        }
        sAl sal2 = this.mZ;
        if (sal2 != null && (zRu = sal2.NOt) != null) {
            zRu.sAl();
        }
        return fa2;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public com.bytedance.sdk.component.NOt.ZRu.Ht Mm() {
        if (this.NOt == null) {
            return new com.bytedance.sdk.component.NOt.ZRu.Ht(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.NOt.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || mZ() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.NOt.ZRu.Ht((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public long NOt() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public String TFq() throws IOException {
        return !TextUtils.isEmpty(this.TFq) ? this.TFq : this.NOt.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public aT Vor() {
        if (aT() == null || aT().NOt == null) {
            return null;
        }
        return new aT(aT().NOt);
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public long ZRu() {
        return 0L;
    }

    public sAl aT() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            Ht().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public int mZ() {
        try {
            return this.NOt.getResponseCode();
        } catch (Exception unused) {
            return this.uR;
        }
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public boolean uR() {
        return mZ() >= 200 && mZ() < 300;
    }

    public String ZRu(String str) {
        HttpURLConnection httpURLConnection = this.NOt;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    public Mm(int i10, String str, sAl sal) {
        this.TFq = str;
        this.mZ = sal;
        this.uR = i10;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.oK
    public String ZRu(String str, String str2) {
        return !TextUtils.isEmpty(ZRu(str)) ? ZRu(str) : str2;
    }
}
