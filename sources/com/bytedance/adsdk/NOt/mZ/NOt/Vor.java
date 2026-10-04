package com.bytedance.adsdk.NOt.mZ.NOt;

/* JADX INFO: loaded from: classes2.dex */
public class Vor implements mZ {
    private final ZRu NOt;
    private final String ZRu;
    private final boolean mZ;

    public enum ZRu {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static ZRu ZRu(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public Vor(String str, ZRu zRu, boolean z10) {
        this.ZRu = str;
        this.NOt = zRu;
        this.mZ = z10;
    }

    public ZRu NOt() {
        return this.NOt;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public boolean mZ() {
        return this.mZ;
    }

    public String toString() {
        return "MergePaths{mode=" + this.NOt + '}';
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.lp(this);
    }
}
