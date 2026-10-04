package com.bytedance.sdk.openadsdk.Zf.ZRu;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import com.bytedance.sdk.openadsdk.utils.Yx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TFq {
    private static final Map<Integer, NOt> ZRu = new ConcurrentHashMap();

    public static class ZRu {
        public int NOt = -1;
        public int ZRu;

        public ZRu(int i10) {
            this.ZRu = i10;
        }
    }

    public static void NOt(Integer num) {
        ZRu.remove(num);
    }

    public static void ZRu(View view, qF qFVar, ZRu zRu) {
        if (view == null || qFVar == null || qFVar.kkl()) {
            return;
        }
        boolean zMZ = mZ(qFVar);
        if (xY.NOt(qFVar) && zRu != null) {
            zRu.ZRu = -1;
        }
        ZRu(ZRu(view, qFVar, zMZ, zRu));
    }

    private static boolean mZ(qF qFVar) {
        if (qFVar == null) {
            return false;
        }
        String strZRu = Yx.ZRu(qFVar);
        return ((!"open_ad".equals(strZRu) && !"fullscreen_interstitial_ad".equals(strZRu) && !"rewarded_video".equals(strZRu)) || xY.NOt(qFVar) || qFVar.yBV() == 5 || qFVar.yBV() == 33 || !qF.TFq(qFVar) || qFVar.Qg() == null) ? false : true;
    }

    public static Integer NOt(qF qFVar) {
        return Integer.valueOf((qFVar.jYr() + qFVar.vE()).hashCode());
    }

    private static NOt ZRu(View view, qF qFVar, boolean z10, ZRu zRu) {
        if (view == null || qFVar == null || qFVar.vE() == null) {
            return null;
        }
        Integer numNOt = NOt(qFVar);
        Map<Integer, NOt> map = ZRu;
        if (map.containsKey(numNOt)) {
            NOt nOt = map.get(numNOt);
            if (nOt != null) {
                nOt.ZRu(view);
            }
            return nOt;
        }
        NOt nOtZRu = NOt.ZRu(z10, numNOt, view, qFVar, zRu);
        map.put(numNOt, nOtZRu);
        return nOtZRu;
    }

    private static void ZRu(NOt nOt) {
        if (nOt == null) {
            return;
        }
        nOt.ZRu();
    }

    public static void ZRu(qF qFVar, int i10) {
        if (qFVar == null || qFVar.vE() == null) {
            return;
        }
        ZRu(ZRu.get(NOt(qFVar)), i10);
    }

    public static void ZRu(NOt nOt, int i10) {
        if (nOt == null) {
            return;
        }
        nOt.ZRu(i10);
    }

    public static void ZRu(qF qFVar) {
        if (qFVar == null || qFVar.vE() == null) {
            return;
        }
        Integer numNOt = NOt(qFVar);
        Map<Integer, NOt> map = ZRu;
        NOt nOt = map.get(numNOt);
        if (nOt != null) {
            nOt.aT();
        }
        NOt(numNOt);
        if (map.size() <= 0) {
            Mm.ZRu();
        }
    }

    public static NOt ZRu(Integer num) {
        return ZRu.get(num);
    }
}
