package com.android.launcher3.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlagOp {
    public static FlagOp NO_OP = new AnonymousClass1();

    /* JADX INFO: renamed from: com.android.launcher3.util.FlagOp$1, reason: invalid class name */
    public class AnonymousClass1 extends FlagOp {
    }

    private FlagOp() {
    }

    public static FlagOp addFlag(final int i10) {
        return new FlagOp() { // from class: com.android.launcher3.util.FlagOp.2
            @Override // com.android.launcher3.util.FlagOp
            public int apply(int i11) {
                return i11 | i10;
            }
        };
    }

    public static FlagOp removeFlag(final int i10) {
        return new FlagOp() { // from class: com.android.launcher3.util.FlagOp.3
            @Override // com.android.launcher3.util.FlagOp
            public int apply(int i11) {
                return i11 & (~i10);
            }
        };
    }

    public int apply(int i10) {
        return i10;
    }

    public FlagOp(b bVar) {
    }
}
