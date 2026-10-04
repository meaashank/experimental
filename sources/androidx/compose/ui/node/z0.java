package androidx.compose.ui.node;

import androidx.compose.animation.C1636p;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f103111a;

    public /* synthetic */ z0(int[] iArr) {
        this.f103111a = iArr;
    }

    public static final void a(int[] iArr, @NotNull C2216u c2216u) {
        if (!j(iArr)) {
            int i10 = iArr[0];
            c2216u.g(i10, iArr[1], iArr[2] - i10);
        } else if (iArr[4] != 0) {
            c2216u.g(iArr[0], iArr[1], g(iArr));
        } else if (o(iArr)) {
            c2216u.g(iArr[0], iArr[1] + 1, g(iArr));
        } else {
            c2216u.g(iArr[0] + 1, iArr[1], g(iArr));
        }
    }

    public static final /* synthetic */ z0 b(int[] iArr) {
        return new z0(iArr);
    }

    @NotNull
    public static int[] c(@NotNull int[] iArr) {
        return iArr;
    }

    public static boolean d(int[] iArr, Object obj) {
        return (obj instanceof z0) && kotlin.jvm.internal.G.g(iArr, ((z0) obj).f103111a);
    }

    public static final boolean e(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.G.g(iArr, iArr2);
    }

    public static final int g(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final int h(int[] iArr) {
        return iArr[2];
    }

    public static final int i(int[] iArr) {
        return iArr[3];
    }

    public static final boolean j(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    public static final boolean k(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int l(int[] iArr) {
        return iArr[0];
    }

    public static final int m(int[] iArr) {
        return iArr[1];
    }

    public static int n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final boolean o(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    @NotNull
    public static String p(int[] iArr) {
        StringBuilder sb2 = new StringBuilder("Snake(");
        sb2.append(iArr[0]);
        sb2.append(',');
        sb2.append(iArr[1]);
        sb2.append(',');
        sb2.append(iArr[2]);
        sb2.append(',');
        sb2.append(iArr[3]);
        sb2.append(',');
        return C1636p.a(sb2, iArr[4] != 0, ')');
    }

    public boolean equals(Object obj) {
        return d(this.f103111a, obj);
    }

    @NotNull
    public final int[] f() {
        return this.f103111a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f103111a);
    }

    public final /* synthetic */ int[] q() {
        return this.f103111a;
    }

    @NotNull
    public String toString() {
        return p(this.f103111a);
    }
}
