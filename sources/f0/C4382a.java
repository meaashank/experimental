package f0;

import dd.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4382a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    @NotNull
    public static final int[] f200360a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    @NotNull
    public static final Object[] f200361b = new Object[0];

    public static final int a(@NotNull int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
