package com.bytedance.sdk.openadsdk.to;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private NOt NOt;
    private uR mZ;
    private ZRu uR;
    private final String ZRu = "StrategyCenter";
    private int TFq = 0;
    private Runnable Ht = new Runnable() { // from class: com.bytedance.sdk.openadsdk.to.mZ.2
        @Override // java.lang.Runnable
        public void run() {
            mZ.this.NOt();
        }
    };

    public mZ(uR uRVar) {
        this.NOt = null;
        TFq tFq = new TFq(uRVar);
        this.mZ = tFq;
        String strMZ = tFq.mZ();
        if (!TextUtils.isEmpty(strMZ) && !strMZ.startsWith("pag")) {
            strMZ = "pag_".concat(strMZ);
        }
        this.NOt = new NOt(this.mZ.NOt(), strMZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt() {
        uR uRVar = this.mZ;
        if (uRVar == null || uRVar.TFq() == null || this.mZ.Ht() == null) {
            return;
        }
        this.mZ.ZRu().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.to.mZ.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                mZ.this.TFq++;
                try {
                    if (mZ.this.uR != null) {
                        mZ.this.uR.ZRu();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(mZ.this.mZ.TFq()).openConnection();
                    if (mZ.this.mZ.Mm() != null && mZ.this.mZ.Mm().size() > 0) {
                        for (Map.Entry<String, String> entry : mZ.this.mZ.Mm().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(mZ.this.mZ.Ht().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectZRu = mZ.this.mZ.ZRu(new JSONObject(stringBuffer.toString()));
                                mZ.this.NOt.ZRu();
                                mZ.this.NOt.ZRu(jSONObjectZRu);
                                if (mZ.this.uR != null) {
                                    mZ.this.uR.NOt();
                                }
                            } else if (mZ.this.uR != null) {
                                mZ.this.uR.ZRu(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (mZ.this.uR != null) {
                        mZ.this.uR.ZRu(-1, th3.getMessage());
                    }
                }
                mZ.this.NOt.ZRu("local_last_update_time", System.currentTimeMillis());
                mZ.this.ZRu();
            }
        });
    }

    public void ZRu(ZRu zRu) {
        this.uR = zRu;
    }

    public void ZRu() {
        if (this.mZ != null) {
            int i10 = 3600000;
            int iZRu = this.NOt.ZRu("req_interval", 3600000);
            long j10 = 0;
            long jNOt = this.NOt.NOt("local_last_update_time", 0L);
            if (iZRu >= 600000 && iZRu <= 86400000) {
                i10 = iZRu;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jNOt;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.mZ.uR().removeCallbacks(this.Ht);
            if (this.TFq > 24) {
                return;
            }
            this.mZ.uR().postDelayed(this.Ht, j10);
        }
    }

    public int ZRu(String str, int i10) {
        NOt nOt = this.NOt;
        return nOt == null ? i10 : nOt.ZRu(str, i10);
    }

    public String ZRu(String str, String str2) {
        NOt nOt = this.NOt;
        return nOt == null ? str2 : nOt.ZRu(str, str2);
    }

    public boolean ZRu(String str, boolean z10) {
        NOt nOt = this.NOt;
        return nOt == null ? z10 : nOt.ZRu(str, z10);
    }
}
