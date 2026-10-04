package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.Paint;
import com.bytedance.adsdk.NOt.ZRu.ZRu.OCA;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qF implements mZ {
    private final NOt FA;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt Ht;
    private final ZRu Mm;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt NOt;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.uR TFq;
    private final float Vor;
    private final String ZRu;
    private final boolean aT;
    private final List<com.bytedance.adsdk.NOt.mZ.ZRu.NOt> mZ;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.ZRu uR;

    /* JADX INFO: renamed from: com.bytedance.adsdk.NOt.mZ.NOt.qF$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] NOt;
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[NOt.values().length];
            NOt = iArr;
            try {
                iArr[NOt.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NOt[NOt.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                NOt[NOt.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ZRu.values().length];
            ZRu = iArr2;
            try {
                iArr2[ZRu.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ZRu[ZRu.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ZRu[ZRu.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum NOt {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join ZRu() {
            int i10 = AnonymousClass1.NOt[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public enum ZRu {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap ZRu() {
            int i10 = AnonymousClass1.ZRu[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public qF(String str, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt, List<com.bytedance.adsdk.NOt.mZ.ZRu.NOt> list, com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRu, com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt2, ZRu zRu2, NOt nOt3, float f10, boolean z10) {
        this.ZRu = str;
        this.NOt = nOt;
        this.mZ = list;
        this.uR = zRu;
        this.TFq = uRVar;
        this.Ht = nOt2;
        this.Mm = zRu2;
        this.FA = nOt3;
        this.Vor = f10;
        this.aT = z10;
    }

    public NOt FA() {
        return this.FA;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt Ht() {
        return this.NOt;
    }

    public ZRu Mm() {
        return this.Mm;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.ZRu NOt() {
        return this.uR;
    }

    public List<com.bytedance.adsdk.NOt.mZ.ZRu.NOt> TFq() {
        return this.mZ;
    }

    public float Vor() {
        return this.Vor;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new OCA(vor, zRu, this);
    }

    public boolean aT() {
        return this.aT;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.uR mZ() {
        return this.TFq;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt uR() {
        return this.Ht;
    }

    public String ZRu() {
        return this.ZRu;
    }
}
