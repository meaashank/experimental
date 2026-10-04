package com.bytedance.sdk.component.FA;

import android.os.Looper;
import android.support.v4.media.a;
import android.support.v4.media.e;
import android.support.v4.media.f;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.lp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private static AtomicInteger mZ = new AtomicInteger(0);
    public static final String[] ZRu = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] NOt = {"tt_pangle", "bd_tracker"};
    private static int uR = 0;
    private static int TFq = 0;

    public static class ZRu {
        public String NOt;
        public int ZRu;
        public String mZ;
        public String uR;

        public ZRu(String str, int i10, String str2, String str3) {
            this.mZ = str;
            this.ZRu = i10;
            this.uR = str2;
            this.NOt = str3;
        }

        public void ZRu(int i10) {
            this.ZRu = i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ThreadModel{times=");
            sb2.append(this.ZRu);
            sb2.append(", name='");
            sb2.append(this.NOt);
            sb2.append("', lastStackStack='");
            return e.a(sb2, this.mZ, "'}");
        }

        public int ZRu() {
            return this.ZRu;
        }
    }

    private static void NOt() {
        int i10;
        String str;
        mZ mZVarVor = Ht.Vor();
        if (mZVarVor == null) {
            return;
        }
        int i11 = 1;
        int iAddAndGet = mZ.addAndGet(1);
        int i12 = Ht.mZ;
        if (i12 < 0 || iAddAndGet % i12 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zZRu = lp.ZRu();
        int size = allStackTraces.size();
        if (size > TFq) {
            TFq = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i14 += i11;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb2 = new StringBuilder("\n");
            if (zZRu) {
                sb2.append("Thread Name is : " + key.getName());
                sb2.append("\n");
            }
            int length = value.length;
            String str2 = null;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i11;
                String string = value[i15].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zZRu) {
                    sb2.append(string + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (ZRu(string, ZRu)) {
                        str = string;
                    } else {
                        str = string;
                        if (ZRu(key.getName(), NOt)) {
                        }
                    }
                    i13++;
                    str2 = str;
                }
                i15++;
                it = it2;
                i11 = i16;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i17 = i11;
            if (zZRu) {
                if (TextUtils.isEmpty(str2)) {
                    i10 = i17;
                } else {
                    StringBuilder sbA = f.a(str2, "&");
                    sbA.append(key.getName());
                    String string2 = sbA.toString();
                    ZRu zRu = (ZRu) map.get(string2);
                    if (zRu != null) {
                        zRu.ZRu(zRu.ZRu() + 1);
                        i10 = i17;
                    } else {
                        String string3 = sb2.toString();
                        String name = key.getName();
                        i10 = i17;
                        zRu = new ZRu(string2, i10, string3, name);
                    }
                    map.put(string2, zRu);
                }
                if (!TextUtils.isEmpty(sb2.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb2.toString());
                }
            } else {
                i10 = i17;
            }
            i11 = i10;
            it = it3;
        }
        if (i13 > uR) {
            uR = i13;
        }
        if (zZRu) {
            StringBuilder sbA2 = a.a("SDK current threads=", i13, ", SDK Max threads=");
            androidx.viewpager.widget.a.a(sbA2, uR, ", Application threads = ", size, ", Application max threads = ");
            sbA2.append(TFq);
            Log.e("PoolTaskStatistics", sbA2.toString());
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((ZRu) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        mZVarVor.ZRu(new com.bytedance.sdk.component.FA.NOt.ZRu(i13, uR, size, TFq));
    }

    public static void ZRu() {
        try {
            NOt();
        } catch (Throwable unused) {
        }
    }

    private static boolean ZRu(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
