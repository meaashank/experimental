package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.FA;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.edo;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements com.bytedance.sdk.component.NOt.ZRu.NOt {
    com.bytedance.sdk.component.NOt.ZRu.uR NOt;
    sAl ZRu;
    private AtomicBoolean mZ = new AtomicBoolean(false);

    public NOt(sAl sal, com.bytedance.sdk.component.NOt.ZRu.uR uRVar) {
        this.ZRu = sal;
        this.NOt = uRVar;
    }

    private boolean TFq() {
        if (this.ZRu.uR() == null) {
            return false;
        }
        return this.ZRu.uR().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt
    public oK NOt() throws IOException {
        List<com.bytedance.sdk.component.NOt.ZRu.FA> list;
        com.bytedance.sdk.component.mZ.ZRu.ZRu zRu;
        sAl sal = this.ZRu;
        if (sal != null && (zRu = sal.NOt) != null) {
            if (zRu.edo() == 0) {
                this.ZRu.NOt.oK();
            }
            this.ZRu.NOt.ZRu();
        }
        this.NOt.mZ().remove(this);
        this.NOt.uR().add(this);
        com.bytedance.sdk.component.NOt.ZRu.uR uRVar = this.NOt;
        if (uRVar instanceof TFq) {
            if (this.NOt.uR().size() + uRVar.mZ().size() > this.NOt.ZRu() || this.mZ.get()) {
                this.NOt.uR().remove(this);
                return new Mm(Mm.ZRu, "Maximum number of requests exceeded", this.ZRu);
            }
        }
        try {
            ZH zh = this.ZRu.ZRu;
            if (zh == null || (list = zh.ZRu) == null || list.size() <= 0) {
                return ZRu(this.ZRu);
            }
            ArrayList arrayList = new ArrayList(this.ZRu.ZRu.ZRu);
            arrayList.add(new com.bytedance.sdk.component.NOt.ZRu.FA() { // from class: com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.NOt.1
                @Override // com.bytedance.sdk.component.NOt.ZRu.FA
                public oK ZRu(FA.ZRu zRu2) throws IOException {
                    return NOt.this.ZRu(zRu2.ZRu());
                }
            });
            return ((com.bytedance.sdk.component.NOt.ZRu.FA) arrayList.get(0)).ZRu(new mZ(arrayList, this.ZRu));
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt
    public sAl ZRu() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt
    public void mZ() {
        this.mZ.set(true);
    }

    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.NOt.ZRu.NOt clone() {
        return new NOt(this.ZRu, this.NOt);
    }

    private boolean ZRu(edo edoVar) {
        sAl sal;
        byte[] bArr;
        return edoVar != null && (sal = this.ZRu) != null && "POST".equalsIgnoreCase(sal.mZ()) && edoVar.Ht == edo.ZRu.BYTE_ARRAY_TYPE && (bArr = edoVar.TFq) != null && bArr.length > 0;
    }

    public oK ZRu(sAl sal) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception e10;
        String message;
        int responseCode = Mm.ZRu;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(sal.NOt().ZRu().toString()).openConnection();
                try {
                    if (sal.uR() != null && sal.uR().size() > 0) {
                        for (Map.Entry<String, List<String>> entry : sal.uR().entrySet()) {
                            String key = entry.getKey();
                            for (String str : entry.getValue()) {
                                if ("_disable_retry".equals(key) && "1".equals(str)) {
                                    ZRu(httpURLConnection);
                                } else {
                                    httpURLConnection.addRequestProperty(key, str);
                                }
                            }
                        }
                    }
                    ZH zh = sal.ZRu;
                    if (zh != null) {
                        TimeUnit timeUnit = zh.mZ;
                        if (timeUnit != null) {
                            httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(zh.NOt));
                        }
                        ZH zh2 = sal.ZRu;
                        if (zh2.mZ != null) {
                            httpURLConnection.setReadTimeout((int) zh2.TFq.toMillis(zh2.uR));
                        }
                    }
                    if (sal.FA() == null) {
                        httpURLConnection.setRequestMethod("GET");
                    } else {
                        if (!TFq() && sal.FA().mZ != null) {
                            httpURLConnection.addRequestProperty("Content-Type", sal.FA().mZ.ZRu());
                        }
                        httpURLConnection.setRequestMethod(sal.mZ());
                        if ("POST".equalsIgnoreCase(sal.mZ())) {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            if (ZRu(sal.FA())) {
                                outputStream.write(sal.FA().TFq);
                            } else if (NOt(sal.FA())) {
                                outputStream.write(sal.FA().uR.getBytes());
                            }
                            outputStream.flush();
                            outputStream.close();
                        }
                    }
                    com.bytedance.sdk.component.mZ.ZRu.ZRu zRu = sal.NOt;
                    if (zRu != null) {
                        zRu.NOt();
                    }
                    httpURLConnection.connect();
                    com.bytedance.sdk.component.mZ.ZRu.ZRu zRu2 = sal.NOt;
                    if (zRu2 != null) {
                        zRu2.mZ();
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    com.bytedance.sdk.component.mZ.ZRu.ZRu zRu3 = sal.NOt;
                    if (zRu3 != null) {
                        zRu3.TFq();
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    try {
                        message = httpURLConnection.getErrorStream().toString();
                    } catch (Throwable unused) {
                        message = e10.getMessage();
                    }
                    this.NOt.uR().remove(this);
                }
            } catch (Throwable th) {
                this.NOt.uR().remove(this);
                throw th;
            }
        } catch (Exception e12) {
            httpURLConnection = null;
            e10 = e12;
        }
        if (this.mZ.get()) {
            httpURLConnection.disconnect();
            this.NOt.uR().remove(this);
            message = "internal error";
            return new Mm(responseCode, message, sal);
        }
        Mm mm = new Mm(httpURLConnection, sal);
        this.NOt.uR().remove(this);
        return mm;
    }

    private boolean NOt(edo edoVar) {
        sAl sal;
        return (edoVar == null || (sal = this.ZRu) == null || !"POST".equalsIgnoreCase(sal.mZ()) || edoVar.Ht != edo.ZRu.STRING_TYPE || TextUtils.isEmpty(edoVar.uR)) ? false : true;
    }

    private static void ZRu(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt
    public void ZRu(final com.bytedance.sdk.component.NOt.ZRu.mZ mZVar) {
        com.bytedance.sdk.component.mZ.ZRu.ZRu zRu;
        sAl sal = this.ZRu;
        if (sal != null && (zRu = sal.NOt) != null) {
            zRu.oK();
        }
        this.NOt.NOt().submit(new com.bytedance.sdk.component.FA.mZ.NOt(this.ZRu.Mm(), this.ZRu.Ht()) { // from class: com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.NOt.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    oK oKVarNOt = NOt.this.NOt();
                    if (oKVarNOt == null) {
                        mZVar.ZRu(NOt.this, new IOException("response is null"));
                    } else {
                        mZVar.ZRu(NOt.this, oKVarNOt);
                    }
                } catch (IOException e10) {
                    mZVar.ZRu(NOt.this, e10);
                }
            }
        });
    }
}
