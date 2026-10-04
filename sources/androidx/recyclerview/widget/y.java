package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;

/* JADX INFO: loaded from: classes2.dex */
public class y extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116943c = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public x f116944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public x f116945b;

    public class a extends q {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.q
        public int calculateTimeForScrolling(int i10) {
            return Math.min(100, super.calculateTimeForScrolling(i10));
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.y
        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            y yVar = y.this;
            int[] iArrCalculateDistanceToFinalSnap = yVar.calculateDistanceToFinalSnap(yVar.mRecyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.l(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private int d(@NonNull View view, x xVar) {
        return ((xVar.e(view) / 2) + xVar.g(view)) - ((xVar.o() / 2) + xVar.n());
    }

    @Nullable
    private View e(RecyclerView.LayoutManager layoutManager, x xVar) {
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
    private x f(@NonNull RecyclerView.LayoutManager layoutManager) {
        x xVar = this.f116945b;
        if (xVar == null || xVar.f116940a != layoutManager) {
            this.f116945b = new x.a(layoutManager);
        }
        return this.f116945b;
    }

    @NonNull
    private x h(@NonNull RecyclerView.LayoutManager layoutManager) {
        x xVar = this.f116944a;
        if (xVar == null || xVar.f116940a != layoutManager) {
            this.f116944a = new x.b(layoutManager);
        }
        return this.f116944a;
    }

    @Override // androidx.recyclerview.widget.D
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = d(view, f(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = d(view, h(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.D
    @Nullable
    public RecyclerView.y createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.y.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.D
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return e(layoutManager, h(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return e(layoutManager, f(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.D
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        x xVarG;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (xVarG = g(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != null) {
                int iD = d(childAt, xVarG);
                if (iD <= 0 && iD > i13) {
                    view2 = childAt;
                    i13 = iD;
                }
                if (iD >= 0 && iD < i12) {
                    view = childAt;
                    i12 = iD;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(layoutManager, i10, i11);
        if (zIsForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    @Nullable
    public final x g(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return h(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return f(layoutManager);
        }
        return null;
    }

    public final boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        return layoutManager.canScrollHorizontally() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.y.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.y.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }
}
