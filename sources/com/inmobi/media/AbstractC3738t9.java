package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3738t9 {
    public static final EnumC3724s9 a(byte b10) {
        return b10 == 1 ? EnumC3724s9.f153349a : b10 == 2 ? EnumC3724s9.f153351c : b10 == 3 ? EnumC3724s9.f153350b : b10 == 4 ? EnumC3724s9.f153352d : EnumC3724s9.f153349a;
    }

    public static final boolean b(EnumC3724s9 enumC3724s9) {
        kotlin.jvm.internal.G.p(enumC3724s9, "<this>");
        return enumC3724s9 == EnumC3724s9.f153350b || enumC3724s9 == EnumC3724s9.f153352d;
    }

    public static final int a(EnumC3724s9 enumC3724s9) {
        kotlin.jvm.internal.G.p(enumC3724s9, "<this>");
        int iOrdinal = enumC3724s9.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return Opcodes.GETFIELD;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
