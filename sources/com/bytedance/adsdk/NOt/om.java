package com.bytedance.adsdk.NOt;

/* JADX INFO: loaded from: classes2.dex */
public enum om {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.NOt.om$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[om.values().length];
            ZRu = iArr;
            try {
                iArr[om.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[om.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[om.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean ZRu(int i10, boolean z10, int i11) {
        int i12 = AnonymousClass1.ZRu[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
