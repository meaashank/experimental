package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.C2086n2;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class W implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f103708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f103709b;

    public /* synthetic */ W(float[] fArr, C4969v c4969v) {
        this(fArr);
    }

    @Override // androidx.compose.ui.platform.V
    public void a(@NotNull View view, @NotNull float[] fArr) {
        C2086n2.m(fArr);
        d(view, fArr);
    }

    public final void b(float[] fArr, Matrix matrix) {
        androidx.compose.ui.graphics.W.b(this.f103708a, matrix);
        AndroidComposeView_androidKt.i(fArr, this.f103708a);
    }

    public final void c(float[] fArr, float f10, float f11) {
        AndroidComposeView_androidKt.j(fArr, f10, f11, this.f103708a);
    }

    public final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f103709b);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    public W(float[] fArr) {
        this.f103708a = fArr;
        this.f103709b = new int[2];
    }
}
