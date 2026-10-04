package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.M0;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,82:1\n79#1:83\n79#1:100\n79#1:117\n79#1:134\n79#1:154\n79#1:171\n79#1:188\n79#1:205\n79#1:222\n71#2,16:84\n71#2,16:101\n71#2,16:118\n71#2,16:135\n71#2,16:155\n71#2,16:172\n71#2,16:189\n71#2,16:206\n71#2,16:223\n71#2,16:239\n63#3,3:151\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n46#1:83\n47#1:100\n48#1:117\n53#1:134\n57#1:154\n67#1:171\n71#1:188\n72#1:205\n73#1:222\n46#1:84,16\n47#1:101,16\n48#1:118,16\n53#1:135,16\n57#1:155,16\n67#1:172,16\n71#1:189,16\n72#1:206,16\n73#1:223,16\n79#1:239,16\n53#1:151,3\n*E\n"})
public final class E extends AbstractC2015c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(@NotNull String str, int i10) {
        super(str, C2014b.f100981d, i10);
        C2014b.f100979b.getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    @NotNull
    public float[] b(@NotNull float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float e(int i10) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float f(int i10) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public boolean j() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public long k(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & ZipKt.f225990j);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    @NotNull
    public float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float n(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public long o(float f10, float f11, float f12, float f13, @NotNull AbstractC2015c abstractC2015c) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return M0.a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC2015c);
    }

    public final float p(float f10) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            return 2.0f;
        }
        return f10;
    }
}
