package com.bytedance.sdk.openadsdk.oK;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lp;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements Comparable<ZRu> {
    private int Mm;
    private final String NOt;
    private int TFq;
    private long edo;
    private int mZ;
    private final ArrayList<Long> ZRu = new ArrayList<>();
    private final ArrayList<Long> uR = new ArrayList<>();
    private final ArrayList<Long> Ht = new ArrayList<>();
    private final ArrayList<Long> FA = new ArrayList<>();
    private final HashMap<String, NOt> Vor = new HashMap<>();
    private int aT = 0;
    private int ZH = 0;
    private final HashMap<String, NOt> lp = new HashMap<>();
    private int sAl = 0;
    private final ArrayList<String> oK = new ArrayList<>();

    public ZRu(String str) {
        this.NOt = str;
    }

    private void NOt(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrLp = com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().lp();
        if (iArrLp != null) {
            int i13 = 0;
            while (i13 < iArrLp.length) {
                int i14 = iArrLp[i13];
                long j10 = 60000;
                long j11 = jElapsedRealtime - (((long) i14) * 60000);
                Iterator<String> it = this.lp.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    NOt nOt = this.lp.get(next);
                    if (nOt != null) {
                        long jZRu = nOt.ZRu(j11, jElapsedRealtime);
                        j12 += jZRu;
                        if (jZRu <= 0 && i13 == iArrLp.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    iArr = iArrLp;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14)))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrLp;
                }
                i13++;
                iArrLp = iArr;
            }
        }
        int[] iArrSAl = com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().sAl();
        if (iArrSAl != null) {
            int i15 = 0;
            while (i15 < iArrSAl.length) {
                int i16 = iArrSAl[i15];
                long j14 = jElapsedRealtime - (((long) i16) * 60000);
                long j15 = 0;
                int i17 = 0;
                for (String str : this.Vor.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    NOt nOt2 = this.Vor.get(str);
                    if (nOt2 != null) {
                        long jZRu2 = nOt2.ZRu(j14, jElapsedRealtime);
                        j15 += jZRu2;
                        if (jZRu2 > 20000) {
                            i17++;
                        }
                        if (jZRu2 <= 0 && i15 == iArrSAl.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19)))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.lp.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.Vor.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().oK() && (i12 = this.aT) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.aT;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().edo() && (i11 = this.sAl) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.sAl;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().WMI() || (i10 = this.ZH) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.ZH;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void ZRu(@NonNull String str, @Nullable String str2) {
        NOt nOt;
        NOt nOt2;
        NOt nOt3;
        NOt nOt4;
        NOt nOt5;
        NOt nOt6;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    b10 = 0;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    b10 = 1;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    b10 = 2;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    b10 = 3;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    b10 = 4;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    b10 = 5;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b10 = 6;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    b10 = 7;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    b10 = 8;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    b10 = 9;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    b10 = 10;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    b10 = 11;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    b10 = 12;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    b10 = 13;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    b10 = Ascii.SO;
                }
                break;
        }
        switch (b10) {
            case 0:
                if (!TextUtils.isEmpty(str2) && (nOt = this.lp.get(str2)) != null) {
                    nOt.uR(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 1:
                if (!TextUtils.isEmpty(str2) && (nOt2 = this.lp.get(str2)) != null) {
                    nOt2.mZ(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(str2) && this.lp.get(str2) == null) {
                    NOt nOt7 = new NOt();
                    this.lp.put(str2, nOt7);
                    nOt7.ZRu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 3:
            case 8:
            case 12:
            case 14:
                if (!TextUtils.isEmpty(str2) && (nOt3 = this.Vor.get(str2)) != null && nOt3.ZRu() != NOt.TFq) {
                    nOt3.NOt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().oK()) {
                        this.aT = (int) (nOt3.ZRu(this.edo, SystemClock.elapsedRealtime()) + ((long) this.aT));
                    }
                    break;
                }
                break;
            case 4:
                this.Ht.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().FA()) {
                    this.Mm++;
                }
                if (!TextUtils.isEmpty(str2) && this.Vor.get(str2) == null) {
                    NOt nOt8 = new NOt();
                    this.Vor.put(str2, nOt8);
                    nOt8.ZRu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 5:
                this.ZRu.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().Ht()) {
                    this.mZ++;
                }
                break;
            case 6:
                if (!this.oK.contains(str2)) {
                    if (this.oK.size() > 50) {
                        this.oK.subList(0, 25).clear();
                    }
                    this.oK.add(str2);
                    this.uR.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().Mm()) {
                        this.TFq++;
                    }
                    break;
                }
                break;
            case 7:
                if (!TextUtils.isEmpty(str2) && (nOt4 = this.Vor.get(str2)) != null) {
                    nOt4.uR(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 9:
                if (!TextUtils.isEmpty(str2) && (nOt5 = this.Vor.get(str2)) != null) {
                    nOt5.mZ(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 10:
                if (!TextUtils.isEmpty(str2) && (nOt6 = this.lp.get(str2)) != null && nOt6.ZRu() != NOt.TFq) {
                    nOt6.NOt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().edo()) {
                        this.sAl = (int) (nOt6.ZRu(this.edo, SystemClock.elapsedRealtime()) + ((long) this.sAl));
                    }
                    break;
                }
                break;
            case 11:
                if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().WMI()) {
                    this.ZH++;
                }
                break;
            case 13:
                this.FA.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String NOt() {
        return this.NOt;
    }

    public JSONObject ZRu(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            ZRu(jSONObject2, jSONObject);
            NOt(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            lp.NOt(th.getMessage());
            return jSONObject2;
        }
    }

    private void ZRu(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void ZRu(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ZRu("show_c_", jSONObject, this.ZRu, com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().Vor(), jElapsedRealtime, jSONObject2);
        ZRu("click_c_", jSONObject, this.uR, com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().aT(), jElapsedRealtime, jSONObject2);
        ZRu("v_play_c_", jSONObject, this.Ht, com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().ZH(), jElapsedRealtime, jSONObject2);
        ZRu("dislike_c_", jSONObject, this.FA, com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().yBV(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().Ht() && (i12 = this.mZ) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.mZ;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().Mm() && (i11 = this.TFq) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.TFq;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.Ht.ZRu.ZRu().FA() || (i10 = this.Mm) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.Mm;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void ZRu() {
        this.edo = SystemClock.elapsedRealtime();
        this.ZH = 0;
        this.TFq = 0;
        this.mZ = 0;
        this.sAl = 0;
        this.aT = 0;
        this.Mm = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(ZRu zRu) {
        return zRu.mZ - this.mZ;
    }
}
