package com.bytedance.sdk.component.NOt.ZRu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sAl {
    public com.bytedance.sdk.component.mZ.ZRu.ZRu NOt = new com.bytedance.sdk.component.mZ.ZRu.ZRu();
    public ZH ZRu;

    public static class ZRu {
        String FA;
        edo Ht;
        int Mm;
        Map<String, List<String>> NOt;
        Object TFq;
        com.bytedance.sdk.component.NOt.ZRu.ZRu ZRu;
        Mm mZ;
        String uR;

        public ZRu() {
            this.NOt = new HashMap();
        }

        public ZRu NOt(String str) {
            return ZRu(Mm.mZ(str));
        }

        public ZRu ZRu(com.bytedance.sdk.component.NOt.ZRu.ZRu zRu) {
            this.ZRu = zRu;
            return this;
        }

        public ZRu NOt(String str, String str2) {
            if (!this.NOt.containsKey(str)) {
                this.NOt.put(str, new ArrayList());
            }
            this.NOt.get(str).add(str2);
            return this;
        }

        public ZRu ZRu(String str) {
            this.FA = str;
            return this;
        }

        public ZRu(sAl sal) {
            this.mZ = sal.NOt();
            this.uR = sal.mZ();
            this.NOt = sal.uR();
            this.TFq = sal.ZRu();
            this.Ht = sal.FA();
            this.ZRu = sal.TFq();
            this.Mm = sal.Mm();
            this.FA = sal.Ht();
        }

        public ZRu ZRu(int i10) {
            this.Mm = i10;
            return this;
        }

        public ZRu ZRu(Object obj) {
            this.TFq = obj;
            return this;
        }

        public sAl NOt() {
            return new sAl() { // from class: com.bytedance.sdk.component.NOt.ZRu.sAl.ZRu.1
                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public edo FA() {
                    return ZRu.this.Ht;
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public String Ht() {
                    return ZRu.this.FA;
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public int Mm() {
                    return ZRu.this.Mm;
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public Mm NOt() {
                    return ZRu.this.mZ;
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public com.bytedance.sdk.component.NOt.ZRu.ZRu TFq() {
                    return ZRu.this.ZRu;
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public Object ZRu() {
                    return ZRu.this.TFq;
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public String mZ() {
                    return ZRu.this.uR;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.sAl
                public Map uR() {
                    return ZRu.this.NOt;
                }
            };
        }

        public ZRu ZRu(Mm mm) {
            this.mZ = mm;
            return this;
        }

        public ZRu ZRu(String str, String str2) {
            return NOt(str, str2);
        }

        public ZRu ZRu() {
            return ZRu("GET", (edo) null);
        }

        private ZRu ZRu(String str, edo edoVar) {
            this.uR = str;
            this.Ht = edoVar;
            return this;
        }

        public ZRu ZRu(edo edoVar) {
            return ZRu("POST", edoVar);
        }
    }

    public edo FA() {
        return null;
    }

    public abstract String Ht();

    public abstract int Mm();

    public abstract Mm NOt();

    public abstract com.bytedance.sdk.component.NOt.ZRu.ZRu TFq();

    public ZRu Vor() {
        return new ZRu(this);
    }

    public abstract Object ZRu();

    public void ZRu(ZH zh) {
        this.ZRu = zh;
    }

    public abstract String mZ();

    public abstract Map<String, List<String>> uR();
}
