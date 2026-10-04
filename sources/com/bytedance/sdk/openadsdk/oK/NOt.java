package com.bytedance.sdk.openadsdk.oK;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public static int NOt = 0;
    public static int TFq = 3;
    public static int ZRu = -1;
    public static int mZ = 1;
    public static int uR = 2;
    private int Ht = ZRu;
    private long Mm = 0;
    private long FA = 0;
    private final List<mZ> Vor = new ArrayList();
    private long aT = 0;

    public void NOt(long j10) {
        int i10;
        int i11 = this.Ht;
        if (i11 == ZRu || i11 == (i10 = TFq)) {
            return;
        }
        this.Ht = i10;
        this.FA = j10;
    }

    public void ZRu(long j10) {
        this.Ht = NOt;
        this.Mm = j10;
    }

    public void mZ(long j10) {
        int i10;
        int i11 = this.Ht;
        if (i11 == ZRu || i11 == (i10 = uR) || i11 == TFq) {
            return;
        }
        this.Ht = i10;
        this.aT = j10;
    }

    public void uR(long j10) {
        int i10 = this.Ht;
        if (i10 == ZRu || i10 != uR) {
            return;
        }
        this.Ht = mZ;
        this.Vor.add(new mZ(this.aT, j10));
        this.aT = 0L;
    }

    public long ZRu(long j10, long j11) {
        long j12;
        long j13;
        long jNOt;
        long j14 = this.FA;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (mZ mZVar : this.Vor) {
            if (mZVar.NOt() > j10) {
                if (j10 < mZVar.ZRu()) {
                    j13 = i10;
                    jNOt = mZVar.NOt() - mZVar.ZRu();
                } else {
                    j13 = i10;
                    jNOt = mZVar.NOt() - j10;
                }
                i10 = (int) (jNOt + j13);
            }
        }
        long j15 = this.Mm;
        if (j15 < j10) {
            long j16 = this.aT;
            if (j16 == 0) {
                j16 = this.FA;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - ((long) i10);
        }
        long j17 = this.aT;
        if (j17 == 0) {
            j17 = this.FA;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - ((long) i10);
        return j12 - ((long) i10);
    }

    public int ZRu() {
        return this.Ht;
    }
}
