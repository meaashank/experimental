package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C2086n2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2770:1\n42#2,2:2771\n42#2,2:2773\n42#2,2:2775\n42#2,2:2777\n42#2,2:2779\n42#2,2:2781\n42#2,2:2783\n42#2,2:2785\n42#2,2:2787\n42#2,2:2789\n42#2,2:2791\n42#2,2:2793\n42#2,2:2795\n42#2,2:2797\n42#2,2:2799\n42#2,2:2801\n39#2:2803\n39#2:2804\n39#2:2805\n39#2:2806\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2528#1:2771,2\n2529#1:2773,2\n2530#1:2775,2\n2531#1:2777,2\n2532#1:2779,2\n2533#1:2781,2\n2534#1:2783,2\n2535#1:2785,2\n2536#1:2787,2\n2537#1:2789,2\n2538#1:2791,2\n2539#1:2793,2\n2540#1:2795,2\n2541#1:2797,2\n2542#1:2799,2\n2543#1:2801,2\n2557#1:2803\n2558#1:2804\n2559#1:2805\n2560#1:2806\n*E\n"})
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static ed.l<? super androidx.compose.ui.text.input.Q, ? extends androidx.compose.ui.text.input.Q> f103339a = new ed.l<androidx.compose.ui.text.input.Q, androidx.compose.ui.text.input.Q>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @NotNull
        public final androidx.compose.ui.text.input.Q e(@NotNull androidx.compose.ui.text.input.Q q10) {
            return q10;
        }

        @Override // ed.l
        public androidx.compose.ui.text.input.Q invoke(androidx.compose.ui.text.input.Q q10) {
            return q10;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f103340b = 8;

    public static final boolean e(View view, View view2) {
        if (kotlin.jvm.internal.G.g(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final Y.d g(View view) {
        Y.e.c(view, 1);
        return Y.e.b(view);
    }

    @NotNull
    public static final ed.l<androidx.compose.ui.text.input.Q, androidx.compose.ui.text.input.Q> h() {
        return f103339a;
    }

    public static final void i(float[] fArr, float[] fArr2) {
        float f10 = f(fArr2, 0, fArr, 0);
        float f11 = f(fArr2, 0, fArr, 1);
        float f12 = f(fArr2, 0, fArr, 2);
        float f13 = f(fArr2, 0, fArr, 3);
        float f14 = f(fArr2, 1, fArr, 0);
        float f15 = f(fArr2, 1, fArr, 1);
        float f16 = f(fArr2, 1, fArr, 2);
        float f17 = f(fArr2, 1, fArr, 3);
        float f18 = f(fArr2, 2, fArr, 0);
        float f19 = f(fArr2, 2, fArr, 1);
        float f20 = f(fArr2, 2, fArr, 2);
        float f21 = f(fArr2, 2, fArr, 3);
        float f22 = f(fArr2, 3, fArr, 0);
        float f23 = f(fArr2, 3, fArr, 1);
        float f24 = f(fArr2, 3, fArr, 2);
        float f25 = f(fArr2, 3, fArr, 3);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        fArr[9] = f19;
        fArr[10] = f20;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f23;
        fArr[14] = f24;
        fArr[15] = f25;
    }

    public static final void j(float[] fArr, float f10, float f11, float[] fArr2) {
        C2086n2.m(fArr2);
        C2086n2.x(fArr2, f10, f11, 0.0f, 4, null);
        i(fArr, fArr2);
    }

    public static final void k(@NotNull ed.l<? super androidx.compose.ui.text.input.Q, ? extends androidx.compose.ui.text.input.Q> lVar) {
        f103339a = lVar;
    }
}
