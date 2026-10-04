package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class B {
    public static int a(RecyclerView.z zVar, x xVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z10) {
        if (layoutManager.getChildCount() == 0 || zVar.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(xVar.o(), xVar.d(view2) - xVar.g(view));
    }

    public static int b(RecyclerView.z zVar, x xVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z10, boolean z11) {
        if (layoutManager.getChildCount() == 0 || zVar.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (zVar.d() - Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2))) - 1) : Math.max(0, Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(xVar.d(view2) - xVar.g(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (xVar.n() - xVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.z zVar, x xVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z10) {
        if (layoutManager.getChildCount() == 0 || zVar.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return zVar.d();
        }
        return (int) (((xVar.d(view2) - xVar.g(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * zVar.d());
    }
}
