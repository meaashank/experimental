package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import com.bytedance.sdk.openadsdk.core.model.qF;

/* JADX INFO: loaded from: classes3.dex */
public class oK {
    private String NOt;
    private qF TFq;
    private long ZRu;
    private int mZ;
    private com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ uR;

    public static class ZRu {
        private int FA;
        private int Ht;
        private int Mm;
        private int TFq;
        private int Vor;
        private com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu ZH;
        private long ZRu = 0;
        private long NOt = 0;
        private long mZ = 0;
        private boolean uR = false;
        private boolean aT = false;

        private void sAl() {
            long j10 = this.mZ;
            if (j10 > 0) {
                long j11 = this.ZRu;
                if (j11 > j10) {
                    this.ZRu = j11 % j10;
                }
            }
        }

        public int FA() {
            return this.FA;
        }

        public int Ht() {
            long j10 = this.mZ;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.ZRu * 100) / j10), 100);
        }

        public int Mm() {
            return this.Mm;
        }

        public long NOt() {
            return this.NOt;
        }

        public int TFq() {
            return this.Ht;
        }

        public int Vor() {
            return this.Vor;
        }

        public boolean ZH() {
            return this.uR;
        }

        public long ZRu() {
            return this.ZRu;
        }

        public boolean aT() {
            return this.aT;
        }

        public com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu lp() {
            return this.ZH;
        }

        public long mZ() {
            return this.mZ;
        }

        public int uR() {
            return this.TFq;
        }

        public void NOt(long j10) {
            this.NOt = j10;
        }

        public void ZRu(long j10) {
            this.ZRu = j10;
            sAl();
        }

        public void mZ(long j10) {
            this.mZ = j10;
            sAl();
        }

        public void uR(int i10) {
            this.Vor = i10;
        }

        public void NOt(int i10) {
            this.Ht = i10;
        }

        public void ZRu(int i10) {
            this.TFq = i10;
        }

        public void mZ(int i10) {
            this.Mm = i10;
        }

        public void ZRu(boolean z10) {
            this.uR = z10;
        }

        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu zRu) {
            this.ZH = zRu;
        }
    }

    public oK(long j10, String str, int i10, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar, qF qFVar) {
        this.ZRu = j10;
        this.NOt = str;
        this.mZ = i10;
        this.uR = mZVar;
        this.TFq = qFVar;
    }

    public String NOt() {
        return this.NOt;
    }

    public qF TFq() {
        return this.TFq;
    }

    public long ZRu() {
        return this.ZRu;
    }

    public int mZ() {
        return this.mZ;
    }

    public com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ uR() {
        return this.uR;
    }
}
