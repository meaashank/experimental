package com.bytedance.adsdk.ugeno.yoga;

import kotlinx.coroutines.N;

/* JADX INFO: loaded from: classes2.dex */
public enum NOt {
    AUTO(0, N.f218775c),
    FLEX_START(1, "flex_start"),
    CENTER(2, "center"),
    FLEX_END(3, "flex_end"),
    STRETCH(4, "stretch"),
    BASELINE(5, "baseline"),
    SPACE_BETWEEN(6, "space_between"),
    SPACE_AROUND(7, "space_around");

    private final int Vor;
    private final String aT;

    NOt(int i10, String str) {
        this.Vor = i10;
        this.aT = str;
    }

    public int ZRu() {
        return this.Vor;
    }

    public static NOt ZRu(int i10) {
        switch (i10) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
        }
    }

    public static NOt ZRu(String str) {
        str.getClass();
        switch (str) {
            case "stretch":
                return STRETCH;
            case "baseline":
                return BASELINE;
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "auto":
                return AUTO;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
