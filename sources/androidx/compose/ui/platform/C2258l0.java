package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public class C2258l0 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103894b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f103895a;

    public C2258l0(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        setTag(u.b.f105453J, Boolean.TRUE);
    }

    public final void a(@NotNull androidx.compose.ui.graphics.C0 c02, @NotNull View view, long j10) {
        super.drawChild(androidx.compose.ui.graphics.H.d(c02), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            kotlin.jvm.internal.G.n(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).f103698h) {
                this.f103895a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f103895a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f103895a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
