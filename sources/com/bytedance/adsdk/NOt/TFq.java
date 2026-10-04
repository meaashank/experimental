package com.bytedance.adsdk.NOt;

import android.content.Context;
import android.os.Trace;
import android.support.v4.media.e;
import androidx.activity.result.i;
import com.android.launcher3.IconCache;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TFq {
    private static int FA = 0;
    private static long[] Ht = null;
    private static int Mm = 0;
    private static boolean NOt = false;
    private static String[] TFq = null;
    private static com.bytedance.adsdk.NOt.uR.Ht Vor = null;
    private static volatile com.bytedance.adsdk.NOt.uR.FA ZH = null;
    public static boolean ZRu = false;
    private static com.bytedance.adsdk.NOt.uR.TFq aT = null;
    private static volatile com.bytedance.adsdk.NOt.uR.Mm lp = null;
    private static boolean mZ = true;
    private static boolean uR = true;

    public static float NOt(String str) {
        int i10 = FA;
        if (i10 > 0) {
            FA = i10 - 1;
            return 0.0f;
        }
        if (!NOt) {
            return 0.0f;
        }
        int i11 = Mm - 1;
        Mm = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(TFq[i11])) {
            throw new IllegalStateException(e.a(i.a("Unbalanced trace call ", str, ". Expected "), TFq[Mm], IconCache.EMPTY_CLASS_NAME));
        }
        Trace.endSection();
        return (System.nanoTime() - Ht[Mm]) / 1000000.0f;
    }

    public static void ZRu(String str) {
        if (NOt) {
            int i10 = Mm;
            if (i10 == 20) {
                FA++;
                return;
            }
            TFq[i10] = str;
            Ht[i10] = System.nanoTime();
            Trace.beginSection(str);
            Mm++;
        }
    }

    public static com.bytedance.adsdk.NOt.uR.FA ZRu(Context context) {
        com.bytedance.adsdk.NOt.uR.FA fa2;
        com.bytedance.adsdk.NOt.uR.FA fa3 = ZH;
        if (fa3 != null) {
            return fa3;
        }
        synchronized (com.bytedance.adsdk.NOt.uR.FA.class) {
            try {
                fa2 = ZH;
                if (fa2 == null) {
                    com.bytedance.adsdk.NOt.uR.Mm mmNOt = NOt(context);
                    com.bytedance.adsdk.NOt.uR.Ht nOt = Vor;
                    if (nOt == null) {
                        nOt = new com.bytedance.adsdk.NOt.uR.NOt();
                    }
                    fa2 = new com.bytedance.adsdk.NOt.uR.FA(mmNOt, nOt);
                    ZH = fa2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fa2;
    }

    public static boolean ZRu() {
        return uR;
    }

    public static com.bytedance.adsdk.NOt.uR.Mm NOt(Context context) {
        com.bytedance.adsdk.NOt.uR.Mm mm;
        if (!mZ) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.NOt.uR.Mm mm2 = lp;
        if (mm2 != null) {
            return mm2;
        }
        synchronized (com.bytedance.adsdk.NOt.uR.Mm.class) {
            try {
                mm = lp;
                if (mm == null) {
                    com.bytedance.adsdk.NOt.uR.TFq tFq = aT;
                    if (tFq == null) {
                        tFq = new com.bytedance.adsdk.NOt.uR.TFq() { // from class: com.bytedance.adsdk.NOt.TFq.1
                            @Override // com.bytedance.adsdk.NOt.uR.TFq
                            public File ZRu() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    mm = new com.bytedance.adsdk.NOt.uR.Mm(tFq);
                    lp = mm;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mm;
    }
}
