package io.reactivex.rxjava3.internal.util;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public l() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(final int value) {
        return (value & (value + (-1))) == 0;
    }

    public static int b(final int value) {
        return 1 << (32 - Integer.numberOfLeadingZeros(value - 1));
    }
}
