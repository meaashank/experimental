package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            throw new NullPointerException(com.google.android.gms.auth.c.a(strValueOf.length() + 24, "null key in entry: null=", strValueOf));
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        throw new NullPointerException(com.google.android.gms.auth.b.a(strValueOf2.length() + 26, "null value in entry: ", strValueOf2, "=null"));
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.util.e.a(str, 40));
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void checkPositive(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.util.e.a(str, 38));
        sb2.append(str);
        sb2.append(" must be positive but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void checkRemove(boolean z10) {
        Preconditions.checkState(z10, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j10, String str) {
        if (j10 >= 0) {
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.util.e.a(str, 49));
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
