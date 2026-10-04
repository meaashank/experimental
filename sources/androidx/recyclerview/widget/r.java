package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;

/* JADX INFO: loaded from: classes2.dex */
public class r extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f116892c = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public x f116893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public x f116894b;

    @Override // androidx.recyclerview.widget.D
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = e(view, h(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = e(view, i(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final float d(RecyclerView.LayoutManager layoutManager, x xVar) {
        int childCount = layoutManager.getChildCount();
        if (childCount != 0) {
            View view = null;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = layoutManager.getChildAt(i12);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i11) {
                        view = childAt;
                        i11 = position;
                    }
                    if (position > i10) {
                        view2 = childAt;
                        i10 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(xVar.d(view), xVar.d(view2)) - Math.min(xVar.g(view), xVar.g(view2));
                if (iMax != 0) {
                    return (iMax * 1.0f) / ((i10 - i11) + 1);
                }
            }
        }
        return 1.0f;
    }

    public final int e(@NonNull View view, x xVar) {
        return ((xVar.e(view) / 2) + xVar.g(view)) - ((xVar.o() / 2) + xVar.n());
    }

    public final int f(RecyclerView.LayoutManager layoutManager, x xVar, int i10, int i11) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i10, i11);
        float fD = d(layoutManager, xVar);
        if (fD <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / fD);
    }

    @Override // androidx.recyclerview.widget.D
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return g(layoutManager, i(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return g(layoutManager, h(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.D
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i12;
        PointF pointFComputeScrollVectorForPosition;
        int iF;
        int iF2;
        if ((layoutManager instanceof RecyclerView.y.b) && (itemCount = layoutManager.getItemCount()) != 0 && (viewFindSnapView = findSnapView(layoutManager)) != null && (position = layoutManager.getPosition(viewFindSnapView)) != -1 && (pointFComputeScrollVectorForPosition = ((RecyclerView.y.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) != null) {
            if (layoutManager.canScrollHorizontally()) {
                iF = f(layoutManager, h(layoutManager), i10, 0);
                if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                    iF = -iF;
                }
            } else {
                iF = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iF2 = f(layoutManager, i(layoutManager), 0, i11);
                if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                    iF2 = -iF2;
                }
            } else {
                iF2 = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iF = iF2;
            }
            if (iF != 0) {
                int i13 = position + iF;
                int i14 = i13 >= 0 ? i13 : 0;
                return i14 >= itemCount ? i12 : i14;
            }
        }
        return -1;
    }

    @Nullable
    public final View g(RecyclerView.LayoutManager layoutManager, x xVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iO = (xVar.o() / 2) + xVar.n();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = layoutManager.getChildAt(i11);
            int iAbs = Math.abs(((xVar.e(childAt) / 2) + xVar.g(childAt)) - iO);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @NonNull
    public final x h(@NonNull RecyclerView.LayoutManager layoutManager) {
        x xVar = this.f116894b;
        if (xVar == null || xVar.f116940a != layoutManager) {
            this.f116894b = new x.a(layoutManager);
        }
        return this.f116894b;
    }

    @NonNull
    public final x i(@NonNull RecyclerView.LayoutManager layoutManager) {
        x xVar = this.f116893a;
        if (xVar == null || xVar.f116940a != layoutManager) {
            this.f116893a = new x.b(layoutManager);
        }
        return this.f116893a;
    }
}
