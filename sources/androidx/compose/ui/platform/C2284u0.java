package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.C2082m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,78:1\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n39#2:94\n42#2,2:95\n42#2,2:97\n42#2,2:99\n42#2,2:101\n42#2,2:103\n42#2,2:105\n42#2,2:107\n42#2,2:109\n42#2,2:111\n42#2,2:113\n42#2,2:115\n42#2,2:117\n42#2,2:119\n42#2,2:121\n42#2,2:123\n42#2,2:125\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:79\n27#1:80\n28#1:81\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n60#1:95,2\n61#1:97,2\n62#1:99,2\n63#1:101,2\n64#1:103,2\n65#1:105,2\n66#1:107,2\n67#1:109,2\n68#1:111,2\n69#1:113,2\n70#1:115,2\n71#1:117,2\n72#1:119,2\n73#1:121,2\n74#1:123,2\n75#1:125,2\n*E\n"})
public final class C2284u0 {
    public static final boolean a(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr2[0] = androidx.compose.animation.X.a(f17, f35, (f15 * f37) - (f16 * f36), f39);
        fArr2[1] = C2082m2.a(f13, f35, (f12 * f36) + ((-f11) * f37), f39);
        fArr2[2] = androidx.compose.animation.X.a(f25, f29, (f23 * f31) - (f24 * f30), f39);
        fArr2[3] = C2082m2.a(f21, f29, (f20 * f30) + ((-f19) * f31), f39);
        float f40 = -f14;
        fArr2[4] = C2082m2.a(f17, f33, (f16 * f34) + (f40 * f37), f39);
        fArr2[5] = androidx.compose.animation.X.a(f13, f33, (f37 * f10) - (f12 * f34), f39);
        float f41 = -f22;
        fArr2[6] = C2082m2.a(f25, f27, (f24 * f28) + (f41 * f31), f39);
        fArr2[7] = androidx.compose.animation.X.a(f21, f27, (f18 * f31) - (f20 * f28), f39);
        fArr2[8] = androidx.compose.animation.X.a(f17, f32, (f14 * f36) - (f15 * f34), f39);
        fArr2[9] = C2082m2.a(f13, f32, (f34 * f11) + ((-f10) * f36), f39);
        fArr2[10] = androidx.compose.animation.X.a(f25, f26, (f22 * f30) - (f23 * f28), f39);
        fArr2[11] = C2082m2.a(f21, f26, (f19 * f28) + ((-f18) * f30), f39);
        fArr2[12] = C2082m2.a(f16, f32, (f15 * f33) + (f40 * f35), f39);
        fArr2[13] = androidx.compose.animation.X.a(f12, f32, (f10 * f35) - (f11 * f33), f39);
        fArr2[14] = C2082m2.a(f24, f26, (f23 * f27) + (f41 * f29), f39);
        fArr2[15] = androidx.compose.animation.X.a(f20, f26, (f18 * f29) - (f19 * f27), f39);
        return true;
    }
}
