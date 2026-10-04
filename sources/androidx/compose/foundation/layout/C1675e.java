package androidx.compose.foundation.layout;

import androidx.collection.C1550p;
import i.C4541d;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,725:1\n63#2,3:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n700#1:726,3\n*E\n"})
public final class C1675e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90901b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1675e f90900a = new C1675e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final float[] f90902c = new float[101];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final float[] f90903d = new float[101];

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$a */
    @kotlin.jvm.internal.V({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,725:1\n72#2:726\n86#2:728\n22#3:727\n22#3:729\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n717#1:726\n722#1:728\n717#1:727\n722#1:729\n*E\n"})
    @dd.h
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f90904a;

        public /* synthetic */ a(long j10) {
            this.f90904a = j10;
        }

        public static final /* synthetic */ a a(long j10) {
            return new a(j10);
        }

        public static long b(long j10) {
            return j10;
        }

        public static boolean c(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).f90904a;
        }

        public static final boolean d(long j10, long j11) {
            return j10 == j11;
        }

        public static final float e(long j10) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        public static final float f(long j10) {
            return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
        }

        public static int g(long j10) {
            return C1550p.a(j10);
        }

        public static String h(long j10) {
            return "FlingResult(packedValue=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f90904a, obj);
        }

        public int hashCode() {
            return C1550p.a(this.f90904a);
        }

        public final /* synthetic */ long i() {
            return this.f90904a;
        }

        public String toString() {
            return h(this.f90904a);
        }
    }

    static {
        float fA;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float fA2;
        float f15;
        float f16;
        float f17;
        float f18 = 0.0f;
        int i10 = 0;
        float f19 = 0.0f;
        while (true) {
            float f20 = 1.0f;
            if (i10 >= 100) {
                f90903d[100] = 1.0f;
                f90902c[100] = 1.0f;
                return;
            }
            float f21 = i10 / 100;
            float f22 = 1.0f;
            while (true) {
                fA = androidx.compose.animation.W.a(f22, f18, 2.0f, f18);
                f10 = f20 - fA;
                f11 = fA * 3.0f * f10;
                f12 = fA * fA * fA;
                float fA3 = androidx.compose.animation.X.a(fA, 0.35000002f, f10 * 0.175f, f11) + f12;
                f13 = f20;
                f14 = f21;
                if (Math.abs(fA3 - f21) < 1.0E-5d) {
                    break;
                }
                if (fA3 > f14) {
                    f22 = fA;
                } else {
                    f18 = fA;
                }
                f20 = f13;
                f21 = f14;
            }
            f90902c[i10] = (((f10 * 0.5f) + fA) * f11) + f12;
            float f23 = f13;
            while (true) {
                fA2 = androidx.compose.animation.W.a(f23, f19, 2.0f, f19);
                f15 = f13 - fA2;
                f16 = fA2 * 3.0f * f15;
                f17 = fA2 * fA2 * fA2;
                float fA4 = androidx.compose.animation.X.a(f15, 0.5f, fA2, f16) + f17;
                if (Math.abs(fA4 - f14) >= 1.0E-5d) {
                    if (fA4 > f14) {
                        f23 = fA2;
                    } else {
                        f19 = fA2;
                    }
                }
            }
            f90903d[i10] = (((fA2 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
            i10++;
        }
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    public final long b(float f10) {
        float fA;
        float f11;
        float f12 = 100;
        int i10 = (int) (f12 * f10);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = f90902c;
            float f15 = fArr[i10];
            f11 = (fArr[i11] - f15) / (f14 - f13);
            fA = C4541d.a(f10, f13, f11, f15);
        } else {
            fA = 1.0f;
            f11 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(fA) << 32);
    }
}
