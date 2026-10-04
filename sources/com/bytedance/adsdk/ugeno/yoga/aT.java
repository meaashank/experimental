package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum aT {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int uR;

    aT(int i10) {
        this.uR = i10;
    }

    public static aT ZRu(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }
}
