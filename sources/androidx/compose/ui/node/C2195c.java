package androidx.compose.ui.node;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.node.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2195c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f103050a;

    public /* synthetic */ C2195c(int[] iArr) {
        this.f103050a = iArr;
    }

    public static final /* synthetic */ C2195c a(int[] iArr) {
        return new C2195c(iArr);
    }

    @NotNull
    public static int[] b(@NotNull int[] iArr) {
        return iArr;
    }

    public static boolean c(int[] iArr, Object obj) {
        return (obj instanceof C2195c) && kotlin.jvm.internal.G.g(iArr, ((C2195c) obj).f103050a);
    }

    public static final boolean d(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.G.g(iArr, iArr2);
    }

    public static final int e(int[] iArr, int i10) {
        return iArr[(iArr.length / 2) + i10];
    }

    public static final int f(int[] iArr) {
        return iArr.length / 2;
    }

    public static int g(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void h(int[] iArr, int i10, int i11) {
        iArr[(iArr.length / 2) + i10] = i11;
    }

    public static String i(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f103050a, obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f103050a);
    }

    public final /* synthetic */ int[] j() {
        return this.f103050a;
    }

    public String toString() {
        return i(this.f103050a);
    }
}
