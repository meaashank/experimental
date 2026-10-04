package androidx.compose.runtime.internal;

import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12904#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
@r(parameters = 0)
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99942d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final long[] f99944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object[] f99945c;

    public s(int i10, @NotNull long[] jArr, @NotNull Object[] objArr) {
        this.f99943a = i10;
        this.f99944b = jArr;
        this.f99945c = objArr;
    }

    public final int a(long j10) {
        int i10 = this.f99943a - 1;
        if (i10 != -1) {
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j11 = this.f99944b[i12] - j10;
                    if (j11 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j11 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j12 = this.f99944b[0];
            if (j12 == j10) {
                return 0;
            }
            if (j12 > j10) {
                return -2;
            }
        }
        return -1;
    }

    @Nullable
    public final Object b(long j10) {
        int iA = a(j10);
        if (iA >= 0) {
            return this.f99945c[iA];
        }
        return null;
    }

    @NotNull
    public final s c(long j10, @Nullable Object obj) {
        int i10 = this.f99943a;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : this.f99945c) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = this.f99944b[i14];
                Object obj3 = this.f99945c[i14];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i11] = j11;
                    objArr[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = j10;
                objArr[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = this.f99944b[i14];
                    Object obj4 = this.f99945c[i14];
                    if (obj4 != null) {
                        jArr[i11] = j12;
                        objArr[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr[0] = obj;
        }
        return new s(i13, jArr, objArr);
    }

    public final boolean d(long j10, @Nullable Object obj) {
        int iA = a(j10);
        if (iA < 0) {
            return false;
        }
        this.f99945c[iA] = obj;
        return true;
    }
}
