package com.bytedance.sdk.openadsdk.core.Mm;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.settings.Ht;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private static volatile boolean NOt;
    private static volatile ZRu ZRu;
    private static volatile long mZ;
    private Handler TFq;
    private final Queue<C0441ZRu> uR = new LinkedList();
    private final Ht Ht = WMI.uR();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.Mm.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0441ZRu {
        private final String NOt;
        private final long ZRu;

        private C0441ZRu(long j10, String str) {
            this.ZRu = j10;
            this.NOt = str;
        }
    }

    private ZRu() {
    }

    private synchronized boolean NOt(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRu = this.Ht.ru();
        long jZf = this.Ht.Zf();
        if (this.uR.size() <= 0 || this.uR.size() < iRu) {
            this.uR.offer(new C0441ZRu(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.uR.peek().ZRu);
            if (jAbs <= jZf) {
                NOt(jZf - jAbs);
                return true;
            }
            this.uR.poll();
            this.uR.offer(new C0441ZRu(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String mZ() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0441ZRu c0441ZRu : this.uR) {
                if (map.containsKey(c0441ZRu.NOt)) {
                    map.put(c0441ZRu.NOt, Integer.valueOf(((Integer) map.get(c0441ZRu.NOt)).intValue() + 1));
                } else {
                    map.put(c0441ZRu.NOt, 1);
                }
            }
            str = "";
            int i10 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static ZRu ZRu() {
        if (ZRu == null) {
            synchronized (ZRu.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public synchronized boolean ZRu(String str) {
        try {
            if (NOt(str)) {
                ZRu(true);
                ZRu(mZ);
            } else {
                ZRu(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return NOt;
    }

    private synchronized void ZRu(long j10) {
        try {
            if (this.TFq == null) {
                this.TFq = new Handler(Looper.getMainLooper());
            }
            this.TFq.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Mm.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ZRu.this.ZRu(false);
                }
            }, j10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean NOt() {
        return NOt;
    }

    private synchronized void NOt(long j10) {
        mZ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ZRu(boolean z10) {
        NOt = z10;
    }
}
