package com.bytedance.sdk.component.Mm.mZ;

import R3.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.Mm.ZRu;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.WMI;
import com.bytedance.sdk.component.utils.ru;
import com.prism.gaia.server.accounts.i;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import u4.g;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements ru.ZRu {
    private static boolean FA;
    private static mZ Vor;
    private static ThreadPoolExecutor aT;
    private final boolean NOt;
    private com.bytedance.sdk.component.Mm.ZRu edo;
    private final Context lp;
    private int oK;
    private volatile boolean mZ = false;
    private boolean uR = true;
    private boolean TFq = false;
    private long Ht = 0;
    private long Mm = 0;
    private AtomicBoolean ZH = new AtomicBoolean(false);
    private volatile boolean sAl = false;
    final ru ZRu = com.bytedance.sdk.component.FA.ZRu.ZRu.ZRu().ZRu(this, "tt-net");

    public ZRu(Context context, int i10) {
        this.lp = context;
        this.NOt = WMI.ZRu(context);
        this.oK = i10;
    }

    private boolean FA() {
        String[] strArrHt = Ht();
        if (strArrHt != null && strArrHt.length != 0) {
            ZRu(0);
        }
        return false;
    }

    public static ExecutorService Mm() {
        mZ mZVar = Vor;
        ExecutorService threadPool = mZVar != null ? mZVar.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (aT == null) {
            synchronized (ZRu.class) {
                try {
                    if (aT == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        aT = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aT;
    }

    private com.bytedance.sdk.component.Mm.ZRu Vor() {
        if (this.edo == null) {
            ZRu.C0406ZRu c0406ZRu = new ZRu.C0406ZRu();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.edo = c0406ZRu.ZRu(10L, timeUnit).NOt(10L, timeUnit).mZ(10L, timeUnit).ZRu();
        }
        return this.edo;
    }

    private void uR(boolean z10) {
        if (this.TFq) {
            return;
        }
        if (this.uR) {
            this.uR = false;
            this.Ht = 0L;
            this.Mm = 0L;
        }
        long j10 = z10 ? 360000L : i.f166487l0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.Ht > j10) {
            if (jCurrentTimeMillis - this.Mm > 120000 || !this.sAl) {
                mZ();
            }
        }
    }

    public String[] Ht() {
        String[] strArrHt = FA.ZRu().ZRu(this.oK).uR() != null ? FA.ZRu().ZRu(this.oK).uR().Ht() : null;
        return (strArrHt == null || strArrHt.length <= 0) ? new String[0] : strArrHt;
    }

    public void TFq() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.NOt) {
                uR();
            } else {
                NOt();
            }
        } catch (Throwable unused) {
        }
    }

    public boolean mZ() {
        this.ZH.get();
        Mm().execute(new Runnable() { // from class: com.bytedance.sdk.component.Mm.mZ.ZRu.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zZRu = com.bytedance.sdk.component.Mm.uR.TFq.ZRu(ZRu.this.lp);
                if (zZRu) {
                    ZRu.this.Mm = System.currentTimeMillis();
                    if (ZRu.this.ZH.compareAndSet(false, true)) {
                        ZRu.this.mZ(zZRu);
                    }
                }
            }
        });
        return true;
    }

    public static void NOt(boolean z10) {
        FA = z10;
    }

    public void mZ(boolean z10) {
        uR();
        this.TFq = true;
        if (!z10) {
            this.ZRu.sendEmptyMessage(102);
            return;
        }
        try {
            FA();
        } catch (Exception unused) {
            this.ZH.set(false);
        }
    }

    public synchronized void NOt() {
        if (System.currentTimeMillis() - this.Ht > 3600000) {
            this.Ht = System.currentTimeMillis();
            try {
                if (FA.ZRu().ZRu(this.oK).FA() != null) {
                    FA.ZRu().ZRu(this.oK).FA().NOt();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void ZRu() {
        ZRu(false);
    }

    public synchronized void ZRu(boolean z10) {
        if (this.NOt) {
            uR(z10);
            return;
        }
        if (this.Ht <= 0) {
            try {
                Mm().execute(new Runnable() { // from class: com.bytedance.sdk.component.Mm.mZ.ZRu.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ZRu.this.NOt();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void uR() {
        if (this.sAl) {
            return;
        }
        this.sAl = true;
        long j10 = this.lp.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j10 > jCurrentTimeMillis) {
            j10 = jCurrentTimeMillis;
        }
        this.Ht = j10;
        try {
            if (FA.ZRu().ZRu(this.oK).FA() != null) {
                FA.ZRu().ZRu(this.oK).FA().ZRu();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(int i10) {
        ru ruVar = this.ZRu;
        if (ruVar != null) {
            ruVar.sendEmptyMessage(i10);
        }
    }

    @Override // com.bytedance.sdk.component.utils.ru.ZRu
    public void ZRu(Message message) {
        int i10 = message.what;
        if (i10 == 101) {
            this.TFq = false;
            this.Ht = System.currentTimeMillis();
            if (this.uR) {
                ZRu();
            }
            this.ZH.set(false);
            return;
        }
        if (i10 != 102) {
            return;
        }
        this.TFq = false;
        if (this.uR) {
            ZRu();
        }
        this.ZH.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ZRu(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString(PglCryptUtils.KEY_MESSAGE))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor editorEdit = this.lp.getSharedPreferences("ss_app_config", 0).edit();
            editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
            editorEdit.apply();
        }
        if (FA.ZRu().ZRu(this.oK).FA() == null) {
            return true;
        }
        FA.ZRu().ZRu(this.oK).FA().ZRu(jSONObject2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(final int i10) {
        String[] strArrHt = Ht();
        if (strArrHt != null && strArrHt.length > i10) {
            String str = strArrHt[i10];
            if (TextUtils.isEmpty(str)) {
                NOt(102);
                return;
            }
            try {
                String strZRu = ZRu(str);
                if (TextUtils.isEmpty(strZRu)) {
                    NOt(102);
                    return;
                }
                com.bytedance.sdk.component.Mm.NOt.NOt nOtMZ = Vor().mZ();
                nOtMZ.NOt(strZRu);
                ZRu(nOtMZ);
                nOtMZ.ZRu(new com.bytedance.sdk.component.Mm.ZRu.ZRu() { // from class: com.bytedance.sdk.component.Mm.mZ.ZRu.3
                    @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
                    public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, com.bytedance.sdk.component.Mm.NOt nOt) {
                        JSONObject jSONObject;
                        if (nOt == null || !nOt.Ht()) {
                            ZRu.this.ZRu(i10 + 1);
                            return;
                        }
                        String string = null;
                        try {
                            jSONObject = new JSONObject(nOt.uR());
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                        if (jSONObject == null) {
                            ZRu.this.ZRu(i10 + 1);
                            return;
                        }
                        try {
                            string = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
                        } catch (Exception unused2) {
                        }
                        if (!"success".equals(string)) {
                            ZRu.this.ZRu(i10 + 1);
                            return;
                        }
                        try {
                            if (ZRu.this.ZRu(jSONObject)) {
                                ZRu.this.NOt(101);
                            } else {
                                ZRu.this.ZRu(i10 + 1);
                            }
                        } catch (Exception unused3) {
                        }
                    }

                    @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
                    public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, IOException iOException) {
                        ZRu.this.ZRu(i10 + 1);
                    }
                });
                return;
            } catch (Throwable th) {
                th.toString();
                return;
            }
        }
        NOt(102);
    }

    private String ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return android.support.v4.media.i.a(a.f67726d, str, "/get_domains/v4/");
    }

    private void ZRu(com.bytedance.sdk.component.Mm.NOt.NOt nOt) {
        if (nOt == null) {
            return;
        }
        Address addressZRu = FA.ZRu().ZRu(this.oK).uR() != null ? FA.ZRu().ZRu(this.oK).uR().ZRu(this.lp) : null;
        if (addressZRu != null && addressZRu.hasLatitude() && addressZRu.hasLongitude()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(addressZRu.getLatitude());
            nOt.ZRu("latitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(addressZRu.getLongitude());
            nOt.ZRu("longitude", sb3.toString());
            String locality = addressZRu.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                nOt.ZRu("city", Uri.encode(locality));
            }
        }
        if (this.mZ) {
            nOt.ZRu(g.f239555d, "1");
        }
        try {
            nOt.ZRu("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (FA.ZRu().ZRu(this.oK).uR() != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(FA.ZRu().ZRu(this.oK).uR().ZRu());
            nOt.ZRu("aid", sb4.toString());
            nOt.ZRu("device_platform", FA.ZRu().ZRu(this.oK).uR().mZ());
            nOt.ZRu("channel", FA.ZRu().ZRu(this.oK).uR().NOt());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(FA.ZRu().ZRu(this.oK).uR().uR());
            nOt.ZRu("version_code", sb5.toString());
            nOt.ZRu("custom_info_1", FA.ZRu().ZRu(this.oK).uR().TFq());
        }
    }

    public static void ZRu(mZ mZVar) {
        Vor = mZVar;
    }
}
