package androidx.compose.runtime;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1927l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99949c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f99950a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f99951b;

    public final void a() {
        this.f99951b = 0;
    }

    public final int b() {
        return this.f99951b;
    }

    public final int c(int i10) {
        int i11 = this.f99951b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f99950a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f99951b == 0;
    }

    public final boolean e() {
        return this.f99951b != 0;
    }

    public final int f() {
        return this.f99950a[this.f99951b - 1];
    }

    public final int g(int i10) {
        return this.f99950a[i10];
    }

    public final int h() {
        return this.f99950a[this.f99951b - 2];
    }

    public final int i(int i10) {
        return this.f99951b > 0 ? f() : i10;
    }

    public final int j() {
        int[] iArr = this.f99950a;
        int i10 = this.f99951b - 1;
        this.f99951b = i10;
        return iArr[i10];
    }

    public final void k(int i10) {
        int i11 = this.f99951b;
        int[] iArr = this.f99950a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f99950a = iArrCopyOf;
        }
        int[] iArr2 = this.f99950a;
        int i12 = this.f99951b;
        this.f99951b = i12 + 1;
        iArr2[i12] = i10;
    }
}
