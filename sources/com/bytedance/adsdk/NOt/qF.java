package com.bytedance.adsdk.NOt;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class qF {
    private boolean ZRu = false;
    private final Set<Object> NOt = new ZRu();
    private final Map<String, com.bytedance.adsdk.NOt.Ht.uR> mZ = new HashMap();
    private final Comparator<Pair<String, Float>> uR = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.NOt.qF.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void ZRu(boolean z10) {
        this.ZRu = z10;
    }

    public void ZRu(String str, float f10) {
        if (this.ZRu) {
            com.bytedance.adsdk.NOt.Ht.uR uRVar = this.mZ.get(str);
            if (uRVar == null) {
                uRVar = new com.bytedance.adsdk.NOt.Ht.uR();
                this.mZ.put(str, uRVar);
            }
            uRVar.ZRu(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.NOt.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
