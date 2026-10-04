package com.bytedance.sdk.component.ZRu;

import U6.j;
import android.support.v4.media.e;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class yBV {
    public final String FA;
    public final String Ht;
    public final String Mm;
    public final String NOt;
    public final String TFq;
    public final int ZRu;
    public final String mZ;
    public final String uR;

    public static final class ZRu {
        private String Ht;
        private String Mm;
        private String NOt;
        private String TFq;
        private String ZRu;
        private String mZ;
        private String uR;

        private ZRu() {
        }

        public ZRu Ht(String str) {
            this.Ht = str;
            return this;
        }

        public ZRu Mm(String str) {
            this.Mm = str;
            return this;
        }

        public ZRu NOt(String str) {
            this.NOt = str;
            return this;
        }

        public ZRu TFq(String str) {
            this.TFq = str;
            return this;
        }

        public ZRu ZRu(String str) {
            this.ZRu = str;
            return this;
        }

        public ZRu mZ(String str) {
            this.mZ = str;
            return this;
        }

        public ZRu uR(String str) {
            this.uR = str;
            return this;
        }

        public yBV ZRu() {
            return new yBV(this);
        }
    }

    public static ZRu ZRu() {
        return new ZRu();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("methodName: ");
        sb2.append(this.uR);
        sb2.append(", params: ");
        sb2.append(this.TFq);
        sb2.append(", callbackId: ");
        sb2.append(this.Ht);
        sb2.append(", type: ");
        sb2.append(this.mZ);
        sb2.append(", version: ");
        return e.a(sb2, this.NOt, j.f68738d);
    }

    private yBV(String str, int i10) {
        this.NOt = null;
        this.mZ = null;
        this.uR = null;
        this.TFq = null;
        this.Ht = str;
        this.Mm = null;
        this.ZRu = i10;
        this.FA = null;
    }

    public static yBV ZRu(String str, int i10) {
        return new yBV(str, i10);
    }

    public static boolean ZRu(yBV ybv) {
        return ybv == null || ybv.ZRu != 1 || TextUtils.isEmpty(ybv.uR) || TextUtils.isEmpty(ybv.TFq);
    }

    private yBV(ZRu zRu) {
        this.NOt = zRu.ZRu;
        this.mZ = zRu.NOt;
        this.uR = zRu.mZ;
        this.TFq = zRu.uR;
        this.Ht = zRu.TFq;
        this.Mm = zRu.Ht;
        this.ZRu = 1;
        this.FA = zRu.Mm;
    }
}
