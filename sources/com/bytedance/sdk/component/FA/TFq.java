package com.bytedance.sdk.component.FA;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private static aT ZRu = new aT() { // from class: com.bytedance.sdk.component.FA.TFq.1
        @Override // com.bytedance.sdk.component.FA.aT
        public Vor createThreadFactory(int i10, String str) {
            return new Vor(i10, str);
        }
    };

    public static void ZRu(aT aTVar) {
        ZRu = aTVar;
    }

    public static aT ZRu() {
        return ZRu;
    }
}
