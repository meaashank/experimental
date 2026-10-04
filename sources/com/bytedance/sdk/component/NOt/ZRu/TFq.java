package com.bytedance.sdk.component.NOt.ZRu;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TFq extends edo {
    List<String> NOt;
    List<String> ZRu;

    public TFq(List<String> list, List<String> list2) {
        this.ZRu = list;
        this.NOt = list2;
    }

    public static final class ZRu {
        private final List<String> ZRu = new ArrayList();
        private final List<String> NOt = new ArrayList();

        public ZRu ZRu(String str, String str2) {
            this.ZRu.add(str);
            this.NOt.add(str2);
            return this;
        }

        public TFq ZRu() {
            return new TFq(this.ZRu, this.NOt);
        }
    }
}
