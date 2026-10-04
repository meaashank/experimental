package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(29)
public final class Y implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Matrix f103768a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f103769b = new int[2];

    @Override // androidx.compose.ui.platform.V
    @InterfaceC4345t
    public void a(@NotNull View view, @NotNull float[] fArr) {
        this.f103768a.reset();
        view.transformMatrixToGlobal(this.f103768a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f103769b);
        int[] iArr = this.f103769b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f103769b;
        this.f103768a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        androidx.compose.ui.graphics.W.b(fArr, this.f103768a);
    }
}
