package com.bytedance.sdk.component.Mm.mZ;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.concurrent.futures.a;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private TFq FA;
    private Context Mm;
    private NOt TFq;
    private ZRu mZ;
    private int om;
    private boolean uR;
    private long NOt = 0;
    private boolean Ht = false;
    private int Vor = 0;
    private long aT = 19700101000L;
    private int ZH = 0;
    private HashMap<String, Integer> lp = new HashMap<>();
    private HashMap<String, Integer> sAl = new HashMap<>();
    private int edo = 0;
    private HashMap<String, Integer> oK = new HashMap<>();
    private HashMap<String, Integer> yBV = new HashMap<>();
    private boolean WMI = true;
    private Map<String, Integer> qF = new HashMap();
    Handler ZRu = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.Mm.mZ.Ht.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            Ht.this.NOt(message.arg1 != 0);
        }
    };

    private Ht() {
    }

    private void Vor() {
        SharedPreferences sharedPreferences = this.Mm.getSharedPreferences(ZRu(), 0);
        this.Vor = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.aT = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    private boolean ZRu(int i10) {
        return i10 >= 200 && i10 < 400;
    }

    private void aT() {
        this.ZH = 0;
        this.lp.clear();
        this.sAl.clear();
        this.edo = 0;
        this.oK.clear();
        this.yBV.clear();
    }

    public TFq FA() {
        return this.FA;
    }

    public uR Ht() {
        TFq tFq = this.FA;
        if (tFq != null) {
            return tFq.mZ();
        }
        return null;
    }

    public Map<String, String> Mm() {
        uR uRVarHt = Ht();
        if (uRVarHt != null) {
            return uRVarHt.uR;
        }
        return null;
    }

    public ZRu NOt() {
        return this.mZ;
    }

    public void TFq() {
        this.qF.clear();
    }

    public boolean mZ() {
        return this.uR;
    }

    public NOt uR() {
        return this.TFq;
    }

    private void NOt(String str) {
        Map<String, String> mapMm;
        if (TextUtils.isEmpty(str) || (mapMm = Mm()) == null || !mapMm.containsValue(str)) {
            return;
        }
        if (this.qF.get(str) == null) {
            this.qF.put(str, 1);
        } else {
            this.qF.put(str, Integer.valueOf(this.qF.get(str).intValue() + 1));
        }
    }

    private void mZ(String str) {
        if (!TextUtils.isEmpty(str) && this.qF.containsKey(str)) {
            this.qF.put(str, 0);
        }
    }

    private boolean uR(String str) {
        Map<String, String> mapMm = Mm();
        if (mapMm == null) {
            return false;
        }
        String str2 = mapMm.get(str);
        return (TextUtils.isEmpty(str2) || this.qF.get(str2) == null || this.qF.get(str2).intValue() < 3) ? false : true;
    }

    public String ZRu() {
        return "ttnet_tnc_config" + this.om;
    }

    public void ZRu(boolean z10) {
        this.uR = z10;
    }

    public void ZRu(NOt nOt) {
        this.TFq = nOt;
    }

    public synchronized void ZRu(Context context, boolean z10) {
        try {
            if (!this.Ht) {
                this.Mm = context;
                this.WMI = z10;
                this.FA = new TFq(context, z10, this.om);
                if (z10) {
                    Vor();
                }
                this.mZ = FA.ZRu().ZRu(this.om, this.Mm);
                this.Ht = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(boolean z10) {
        uR uRVarHt = Ht();
        if (uRVarHt == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!z10) {
            if ((((long) uRVarHt.ZH) * 1000) + this.NOt > jElapsedRealtime) {
                return;
            }
        }
        this.NOt = jElapsedRealtime;
        FA.ZRu().ZRu(this.om, this.Mm).mZ();
    }

    private boolean NOt(int i10) {
        if (i10 < 100 || i10 >= 1000) {
            return true;
        }
        uR uRVarHt = Ht();
        return (uRVarHt == null || TextUtils.isEmpty(uRVarHt.sAl) || !uRVarHt.sAl.contains(String.valueOf(i10))) ? false : true;
    }

    public String ZRu(String str) {
        String protocol;
        Map<String, String> mapMm;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String host = null;
        try {
            URL url = new URL(str);
            protocol = url.getProtocol();
            try {
                host = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            protocol = null;
        }
        if (TextUtils.isEmpty(protocol)) {
            return str;
        }
        if ((!"http".equals(protocol) && !"https".equals(protocol)) || TextUtils.isEmpty(host) || uR(host) || (mapMm = Mm()) == null || !mapMm.containsKey(host)) {
            return str;
        }
        String str2 = mapMm.get(host);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String strA = a.a(protocol, "://", host);
        return str.startsWith(strA) ? str.replaceFirst(strA, a.a(protocol, "://", str2)) : str;
    }

    public Ht(int i10) {
        this.om = i10;
    }

    public synchronized void ZRu(sAl sal, oK oKVar) {
        URL urlZRu;
        if (sal == null || oKVar == null) {
            return;
        }
        if (this.WMI) {
            if (com.bytedance.sdk.component.Mm.uR.TFq.ZRu(this.Mm)) {
                try {
                    urlZRu = sal.NOt().ZRu();
                } catch (Exception unused) {
                    urlZRu = null;
                }
                if (urlZRu == null) {
                    return;
                }
                String protocol = urlZRu.getProtocol();
                String host = urlZRu.getHost();
                String path = urlZRu.getPath();
                String strZRu = ZRu(sal);
                int iMZ = oKVar.mZ();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    if (TextUtils.isEmpty(strZRu)) {
                        return;
                    }
                    uR uRVarHt = Ht();
                    if (uRVarHt != null && uRVarHt.NOt) {
                        ZRu(oKVar, host);
                    }
                    if (uRVarHt == null) {
                        return;
                    }
                    this.lp.size();
                    this.sAl.size();
                    this.oK.size();
                    this.yBV.size();
                    if (iMZ > 0) {
                        if (ZRu(iMZ)) {
                            if (this.ZH > 0 || this.edo > 0) {
                                aT();
                            }
                            mZ(host);
                            return;
                        }
                        if (!NOt(iMZ)) {
                            this.edo++;
                            this.oK.put(path, 0);
                            this.yBV.put(strZRu, 0);
                            if (this.edo >= uRVarHt.FA && this.oK.size() >= uRVarHt.Vor && this.yBV.size() >= uRVarHt.aT) {
                                ZRu(false, 0L);
                                aT();
                            }
                            NOt(host);
                        }
                    }
                }
            }
        }
    }

    private String ZRu(sAl sal) {
        if (sal != null && sal.NOt() != null && sal.NOt().ZRu() != null) {
            try {
                return InetAddress.getByName(sal.NOt().ZRu().getHost()).getHostAddress();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public synchronized void ZRu(sAl sal, Exception exc) {
        URL urlZRu;
        if (sal != null) {
            if (sal.NOt() != null && exc != null) {
                if (this.WMI) {
                    if (com.bytedance.sdk.component.Mm.uR.TFq.ZRu(this.Mm)) {
                        try {
                            urlZRu = sal.NOt().ZRu();
                        } catch (Exception unused) {
                            urlZRu = null;
                        }
                        if (urlZRu == null) {
                            return;
                        }
                        String protocol = urlZRu.getProtocol();
                        String host = urlZRu.getHost();
                        String path = urlZRu.getPath();
                        String strZRu = ZRu(sal);
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            uR uRVarHt = Ht();
                            if (uRVarHt == null) {
                                return;
                            }
                            this.lp.size();
                            this.sAl.size();
                            this.oK.size();
                            this.yBV.size();
                            this.ZH++;
                            this.lp.put(path, 0);
                            this.sAl.put(strZRu, 0);
                            if (this.ZH >= uRVarHt.TFq && this.lp.size() >= uRVarHt.Ht && this.sAl.size() >= uRVarHt.Mm) {
                                ZRu(false, 0L);
                                aT();
                            }
                            NOt(host);
                        }
                    }
                }
            }
        }
    }

    private void ZRu(oK oKVar, String str) {
        String[] strArrSplit;
        int i10;
        long j10;
        uR uRVarHt;
        if (oKVar != null && this.WMI) {
            String strZRu = oKVar.ZRu("tnc-cmd", null);
            if (TextUtils.isEmpty(strZRu) || (strArrSplit = strZRu.split("@")) == null || strArrSplit.length != 2) {
                return;
            }
            try {
                i10 = Integer.parseInt(strArrSplit[0]);
            } catch (Throwable unused) {
                i10 = 0;
            }
            try {
                j10 = Long.parseLong(strArrSplit[1]);
            } catch (Throwable unused2) {
                j10 = 0;
            }
            if (j10 <= this.aT) {
                return;
            }
            this.Vor = i10;
            this.aT = j10;
            this.Mm.getSharedPreferences(ZRu(), 0).edit().putInt("tnc_probe_cmd", i10).putLong("tnc_probe_version", j10).apply();
            if (this.Vor != 10000 || (uRVarHt = Ht()) == null) {
                return;
            }
            Random random = new Random(System.currentTimeMillis());
            int i11 = uRVarHt.lp;
            ZRu(true, i11 > 0 ? ((long) random.nextInt(i11)) * 1000 : 0L);
        }
    }

    private void ZRu(boolean z10, long j10) {
        if (this.ZRu.hasMessages(10000)) {
            return;
        }
        Message messageObtainMessage = this.ZRu.obtainMessage();
        messageObtainMessage.what = 10000;
        messageObtainMessage.arg1 = z10 ? 1 : 0;
        if (j10 > 0) {
            this.ZRu.sendMessageDelayed(messageObtainMessage, j10);
        } else {
            this.ZRu.sendMessage(messageObtainMessage);
        }
    }
}
