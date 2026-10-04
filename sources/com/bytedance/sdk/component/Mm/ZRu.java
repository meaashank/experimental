package com.bytedance.sdk.component.Mm;

import Jb.d;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.LruCacheKt;
import androidx.compose.runtime.changelist.j;
import com.bytedance.sdk.component.Mm.NOt.uR;
import com.bytedance.sdk.component.Mm.mZ.Mm;
import com.bytedance.sdk.component.Mm.uR.mZ;
import com.bytedance.sdk.component.NOt.ZRu.FA;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.utils.WMI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private Mm NOt;
    private ZH ZRu;
    private int mZ;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Mm.ZRu$ZRu, reason: collision with other inner class name */
    public static final class C0406ZRu {
        private Set<String> Ht;
        private Bundle Mm;
        boolean uR = true;
        final List<FA> TFq = new ArrayList();
        int ZRu = 10000;
        int NOt = 10000;
        int mZ = 10000;

        public C0406ZRu mZ(long j10, TimeUnit timeUnit) {
            this.mZ = ZRu(d.f58184l, j10, timeUnit);
            return this;
        }

        public C0406ZRu NOt(long j10, TimeUnit timeUnit) {
            this.NOt = ZRu(d.f58184l, j10, timeUnit);
            return this;
        }

        public C0406ZRu ZRu(long j10, TimeUnit timeUnit) {
            this.ZRu = ZRu(d.f58184l, j10, timeUnit);
            return this;
        }

        public C0406ZRu ZRu(boolean z10) {
            this.uR = z10;
            return this;
        }

        private static int ZRu(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.a(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis > LruCacheKt.f86729a) {
                    throw new IllegalArgumentException(j.a(str, " too large."));
                }
                if (millis != 0 || j10 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(j.a(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public ZRu ZRu() {
            return new ZRu(this);
        }
    }

    public uR NOt() {
        return new uR(this.ZRu);
    }

    public ZH TFq() {
        return this.ZRu;
    }

    public void ZRu(Context context, boolean z10, com.bytedance.sdk.component.Mm.mZ.NOt nOt) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (nOt == null) {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
        int iZRu = nOt.ZRu();
        this.mZ = iZRu;
        Mm mm = this.NOt;
        if (mm != null) {
            mm.ZRu(iZRu);
        }
        com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ).ZRu(z10);
        com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ).ZRu(nOt);
        com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ).ZRu(context, WMI.ZRu(context));
    }

    public com.bytedance.sdk.component.Mm.NOt.NOt mZ() {
        return new com.bytedance.sdk.component.Mm.NOt.NOt(this.ZRu);
    }

    public com.bytedance.sdk.component.Mm.NOt.ZRu uR() {
        return new com.bytedance.sdk.component.Mm.NOt.ZRu(this.ZRu);
    }

    private ZRu(C0406ZRu c0406ZRu) {
        ZH.ZRu zRu = new ZH.ZRu();
        long j10 = c0406ZRu.ZRu;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ZH.ZRu zRuNOt = zRu.ZRu(j10, timeUnit).mZ(c0406ZRu.mZ, timeUnit).NOt(c0406ZRu.NOt, timeUnit);
        if (c0406ZRu.uR) {
            Mm mm = new Mm();
            this.NOt = mm;
            zRuNOt.ZRu(mm);
        }
        List<FA> list = c0406ZRu.TFq;
        if (list != null && list.size() > 0) {
            Iterator<FA> it = c0406ZRu.TFq.iterator();
            while (it.hasNext()) {
                zRuNOt.ZRu(it.next());
            }
        }
        if (c0406ZRu.Mm != null) {
            Bundle unused = c0406ZRu.Mm;
        }
        Set unused2 = c0406ZRu.Ht;
        this.ZRu = zRuNOt.ZRu();
    }

    public void ZRu(Context context, boolean z10) {
        com.bytedance.sdk.component.Mm.mZ.ZRu.NOt(true);
        if (ZRu(context) || (!WMI.ZRu(context) && z10)) {
            com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ, context).uR();
            com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ, context).ZRu();
        }
        if (WMI.ZRu(context)) {
            com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ, context).uR();
            com.bytedance.sdk.component.Mm.mZ.FA.ZRu().ZRu(this.mZ, context).ZRu();
        }
    }

    public static void ZRu() {
        mZ.ZRu(mZ.ZRu.DEBUG);
    }

    private static boolean ZRu(Context context) {
        String strNOt = WMI.NOt(context);
        if (strNOt != null) {
            return strNOt.endsWith(":push") || strNOt.endsWith(":pushservice");
        }
        return false;
    }
}
