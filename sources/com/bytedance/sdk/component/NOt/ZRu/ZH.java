package com.bytedance.sdk.component.NOt.ZRu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZH implements Cloneable {
    public long Ht;
    public TimeUnit Mm;
    public long NOt;
    public TimeUnit TFq;
    public List<FA> ZRu;
    public TimeUnit mZ;
    public long uR;

    public ZH(ZRu zRu) {
        this.NOt = zRu.NOt;
        this.uR = zRu.uR;
        this.Ht = zRu.Ht;
        List<FA> list = zRu.ZRu;
        this.mZ = zRu.mZ;
        this.TFq = zRu.TFq;
        this.Mm = zRu.Mm;
        this.ZRu = list;
    }

    public ZRu NOt() {
        return new ZRu(this);
    }

    public abstract NOt ZRu(sAl sal);

    public abstract uR ZRu();

    public static final class ZRu {
        public long Ht;
        public TimeUnit Mm;
        public long NOt;
        public TimeUnit TFq;
        public final List<FA> ZRu;
        public TimeUnit mZ;
        public long uR;

        public ZRu() {
            this.ZRu = new ArrayList();
            this.NOt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.mZ = timeUnit;
            this.uR = 10000L;
            this.TFq = timeUnit;
            this.Ht = 10000L;
            this.Mm = timeUnit;
        }

        public ZRu NOt(long j10, TimeUnit timeUnit) {
            this.uR = j10;
            this.TFq = timeUnit;
            return this;
        }

        public ZRu ZRu(long j10, TimeUnit timeUnit) {
            this.NOt = j10;
            this.mZ = timeUnit;
            return this;
        }

        public ZRu mZ(long j10, TimeUnit timeUnit) {
            this.Ht = j10;
            this.Mm = timeUnit;
            return this;
        }

        public ZRu ZRu(FA fa2) {
            this.ZRu.add(fa2);
            return this;
        }

        public ZH ZRu() {
            return com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.ZRu(this);
        }

        public ZRu(String str) {
            this.ZRu = new ArrayList();
            this.NOt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.mZ = timeUnit;
            this.uR = 10000L;
            this.TFq = timeUnit;
            this.Ht = 10000L;
            this.Mm = timeUnit;
        }

        public ZRu(ZH zh) {
            this.ZRu = new ArrayList();
            this.NOt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.mZ = timeUnit;
            this.uR = 10000L;
            this.TFq = timeUnit;
            this.Ht = 10000L;
            this.Mm = timeUnit;
            this.NOt = zh.NOt;
            this.mZ = zh.mZ;
            this.uR = zh.uR;
            this.TFq = zh.TFq;
            this.Ht = zh.Ht;
            this.Mm = zh.Mm;
        }
    }
}
