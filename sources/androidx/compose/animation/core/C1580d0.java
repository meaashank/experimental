package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,75:1\n33#2,7:76\n*S KotlinDebug\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n*L\n50#1:76,7\n*E\n"})
public final class C1580d0 {
    @dd.k
    public static final int a(@NotNull androidx.collection.I i10, int i11) {
        return d(i10, i11, 0, 0, 6, null);
    }

    @dd.k
    public static final int b(@NotNull androidx.collection.I i10, int i11, int i12) {
        return d(i10, i11, i12, 0, 4, null);
    }

    @dd.k
    public static final int c(@NotNull androidx.collection.I i10, int i11, int i12, int i13) {
        if (!(i12 <= i13)) {
            C1602o0.d("fromIndex(" + i12 + ") > toIndex(" + i13 + ')');
            throw null;
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(android.support.v4.media.c.a("Index out of range: ", i12));
        }
        if (i13 > i10.f86709b) {
            throw new IndexOutOfBoundsException(android.support.v4.media.c.a("Index out of range: ", i13));
        }
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int iS = i10.s(i15);
            if (iS < i11) {
                i12 = i15 + 1;
            } else {
                if (iS <= i11) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static int d(androidx.collection.I i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = i10.f86709b;
        }
        return c(i10, i11, i12, i13);
    }
}
