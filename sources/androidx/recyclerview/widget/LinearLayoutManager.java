package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.C1636p;
import androidx.fragment.app.U;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.android.launcher3.LauncherAnimUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements m.j, RecyclerView.y.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    x mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x f116365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f116368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f116369e;

        public a() {
            e();
        }

        public void a() {
            this.f116367c = this.f116368d ? this.f116365a.i() : this.f116365a.n();
        }

        public void b(View view, int i10) {
            if (this.f116368d) {
                this.f116367c = this.f116365a.p() + this.f116365a.d(view);
            } else {
                this.f116367c = this.f116365a.g(view);
            }
            this.f116366b = i10;
        }

        public void c(View view, int i10) {
            int iP = this.f116365a.p();
            if (iP >= 0) {
                b(view, i10);
                return;
            }
            this.f116366b = i10;
            if (!this.f116368d) {
                int iG = this.f116365a.g(view);
                int iN = iG - this.f116365a.n();
                this.f116367c = iG;
                if (iN > 0) {
                    int i11 = (this.f116365a.i() - Math.min(0, (this.f116365a.i() - iP) - this.f116365a.d(view))) - (this.f116365a.e(view) + iG);
                    if (i11 < 0) {
                        this.f116367c -= Math.min(iN, -i11);
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = (this.f116365a.i() - iP) - this.f116365a.d(view);
            this.f116367c = this.f116365a.i() - i12;
            if (i12 > 0) {
                int iE = this.f116367c - this.f116365a.e(view);
                int iN2 = this.f116365a.n();
                int iMin = iE - (Math.min(this.f116365a.g(view) - iN2, 0) + iN2);
                if (iMin < 0) {
                    this.f116367c = Math.min(i12, -iMin) + this.f116367c;
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.g() && layoutParams.d() >= 0 && layoutParams.d() < zVar.d();
        }

        public void e() {
            this.f116366b = -1;
            this.f116367c = Integer.MIN_VALUE;
            this.f116368d = false;
            this.f116369e = false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f116366b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f116367c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f116368d);
            sb2.append(", mValid=");
            return C1636p.a(sb2, this.f116369e, '}');
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f116371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f116372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f116373d;

        public void a() {
            this.f116370a = 0;
            this.f116371b = false;
            this.f116372c = false;
            this.f116373d = false;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f116374n = "LLM#LayoutState";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f116375o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f116376p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f116377q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f116378r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f116379s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f116380t = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f116386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f116387g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f116391k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f116393m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f116381a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f116388h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f116389i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f116390j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<RecyclerView.C> f116392l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewG = g(view);
            if (viewG == null) {
                this.f116384d = -1;
            } else {
                this.f116384d = ((RecyclerView.LayoutParams) viewG.getLayoutParams()).d();
            }
        }

        public boolean c(RecyclerView.z zVar) {
            int i10 = this.f116384d;
            return i10 >= 0 && i10 < zVar.d();
        }

        public void d() {
            Log.d(f116374n, "avail:" + this.f116383c + ", ind:" + this.f116384d + ", dir:" + this.f116385e + ", offset:" + this.f116382b + ", layoutDir:" + this.f116386f);
        }

        public View e(RecyclerView.u uVar) {
            if (this.f116392l != null) {
                return f();
            }
            View viewQ = uVar.q(this.f116384d, false);
            this.f116384d += this.f116385e;
            return viewQ;
        }

        public final View f() {
            int size = this.f116392l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f116392l.get(i10).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.g() && this.f116384d == layoutParams.d()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View g(View view) {
            int iD;
            int size = this.f116392l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f116392l.get(i11).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.g() && (iD = (layoutParams.d() - this.f116384d) * this.f116385e) >= 0 && iD < i10) {
                    if (iD == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iD;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public final void A(int i10, int i11) {
        this.mLayoutState.f116383c = this.mOrientationHelper.i() - i11;
        c cVar = this.mLayoutState;
        cVar.f116385e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f116384d = i10;
        cVar.f116386f = 1;
        cVar.f116382b = i11;
        cVar.f116387g = Integer.MIN_VALUE;
    }

    public final void B(a aVar) {
        A(aVar.f116366b, aVar.f116367c);
    }

    public final void C(int i10, int i11) {
        this.mLayoutState.f116383c = i11 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f116384d = i10;
        cVar.f116385e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f116386f = -1;
        cVar.f116382b = i11;
        cVar.f116387g = Integer.MIN_VALUE;
    }

    public final void D(a aVar) {
        C(aVar.f116366b, aVar.f116367c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.z zVar, @NonNull int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(zVar);
        if (this.mLayoutState.f116386f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.z zVar, RecyclerView.LayoutManager.c cVar) {
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        ensureLayoutState();
        z(i10 > 0 ? 1 : -1, Math.abs(i10), true, zVar);
        collectPrefetchPositionsForLayoutState(zVar, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i10, RecyclerView.LayoutManager.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.hasValidAnchor()) {
            v();
            z10 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z10 = savedState2.mAnchorLayoutFromEnd;
            i11 = savedState2.mAnchorPosition;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.z zVar, c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i10 = cVar.f116384d;
        if (i10 < 0 || i10 >= zVar.d()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f116387g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return g(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return h(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return i(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return g(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return h(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return i(zVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z10) {
        int i10 = cVar.f116383c;
        int i11 = cVar.f116387g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f116387g = i11 + i10;
            }
            r(uVar, cVar);
        }
        int i12 = cVar.f116383c + cVar.f116388h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f116393m && i12 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            layoutChunk(uVar, zVar, cVar, bVar);
            if (!bVar.f116371b) {
                cVar.f116382b = (bVar.f116370a * cVar.f116386f) + cVar.f116382b;
                if (!bVar.f116372c || cVar.f116392l != null || !zVar.j()) {
                    int i13 = cVar.f116383c;
                    int i14 = bVar.f116370a;
                    cVar.f116383c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f116387g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f116370a;
                    cVar.f116387g = i16;
                    int i17 = cVar.f116383c;
                    if (i17 < 0) {
                        cVar.f116387g = i16 + i17;
                    }
                    r(uVar, cVar);
                }
                if (z10 && bVar.f116373d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f116383c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z10, z11) : findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z10, z11) : findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 <= i10 && i11 >= i10) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.g(getChildAt(i10)) < this.mOrientationHelper.n()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = U.f113740I;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    public View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        ensureLayoutState();
        int i12 = LauncherAnimUtils.ALL_APPS_TRANSITION_MS;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i13, i12) : this.mVerticalBoundCheck.a(i10, i11, i13, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.u r17, androidx.recyclerview.widget.RecyclerView.z r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.d()
            androidx.recyclerview.widget.x r7 = r0.mOrientationHelper
            int r7 = r7.n()
            androidx.recyclerview.widget.x r8 = r0.mOrientationHelper
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.x r14 = r0.mOrientationHelper
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.x r15 = r0.mOrientationHelper
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r13 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r13
            boolean r13 = r13.g()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    public final int g(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return B.a(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.z zVar) {
        if (zVar.h()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return B.b(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public final int i(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return B.c(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    public final View k() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public final View l() {
        return this.mShouldReverseLayout ? j() : k();
    }

    public void layoutChunk(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int iF;
        int i14;
        int i15;
        View viewE = cVar.e(uVar);
        if (viewE == null) {
            bVar.f116371b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewE.getLayoutParams();
        if (cVar.f116392l == null) {
            if (this.mShouldReverseLayout == (cVar.f116386f == -1)) {
                addView(viewE);
            } else {
                addView(viewE, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f116386f == -1)) {
                addDisappearingView(viewE);
            } else {
                addDisappearingView(viewE, 0);
            }
        }
        measureChildWithMargins(viewE, 0, 0);
        bVar.f116370a = this.mOrientationHelper.e(viewE);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iF = getWidth() - getPaddingRight();
                paddingLeft = iF - this.mOrientationHelper.f(viewE);
            } else {
                paddingLeft = getPaddingLeft();
                iF = this.mOrientationHelper.f(viewE) + paddingLeft;
            }
            if (cVar.f116386f == -1) {
                i15 = cVar.f116382b;
                i14 = i15 - bVar.f116370a;
            } else {
                i14 = cVar.f116382b;
                i15 = bVar.f116370a + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int paddingTop = getPaddingTop();
            int iF2 = this.mOrientationHelper.f(viewE) + paddingTop;
            if (cVar.f116386f == -1) {
                int i17 = cVar.f116382b;
                i12 = i17 - bVar.f116370a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f116382b;
                i10 = bVar.f116370a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        layoutDecoratedWithMargins(viewE, i12, i13, i10, i11);
        if (layoutParams.g() || layoutParams.f()) {
            bVar.f116372c = true;
        }
        bVar.f116373d = viewE.hasFocusable();
    }

    public final View m() {
        return this.mShouldReverseLayout ? k() : j();
    }

    public final int n(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int i11;
        int i12 = this.mOrientationHelper.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -scrollBy(-i12, uVar, zVar);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.mOrientationHelper.i() - i14) <= 0) {
            return i13;
        }
        this.mOrientationHelper.t(i11);
        return i11 + i13;
    }

    public final int o(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int iN;
        int iN2 = i10 - this.mOrientationHelper.n();
        if (iN2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(iN2, uVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (iN = i12 - this.mOrientationHelper.n()) <= 0) {
            return i11;
        }
        this.mOrientationHelper.t(-iN);
        return i11 - iN;
    }

    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(uVar);
            uVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iConvertFocusDirectionToLayoutDirection;
        v();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        z(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * 0.33333334f), false, zVar);
        c cVar = this.mLayoutState;
        cVar.f116387g = Integer.MIN_VALUE;
        cVar.f116381a = false;
        fill(uVar, cVar, zVar, true);
        View viewM = iConvertFocusDirectionToLayoutDirection == -1 ? m() : l();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewM;
        }
        if (viewM == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iN;
        int i14;
        View viewFindViewByPosition;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && zVar.d() == 0) {
            removeAndRecycleAllViews(uVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.f116381a = false;
        v();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f116369e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f116368d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            y(uVar, zVar, aVar2);
            this.mAnchorInfo.f116369e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f116386f = cVar.f116391k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int iN2 = this.mOrientationHelper.n() + Math.max(0, this.mReusableIntPair[0]);
        int iJ = this.mOrientationHelper.j() + Math.max(0, this.mReusableIntPair[1]);
        if (zVar.j() && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition);
                iG = this.mPendingScrollPositionOffset;
            } else {
                iG = this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iN2 += i17;
            } else {
                iJ -= i17;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f116368d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(uVar, zVar, aVar3, i16);
        detachAndScrapAttachedViews(uVar);
        this.mLayoutState.f116393m = resolveIsInfinite();
        this.mLayoutState.f116390j = zVar.j();
        this.mLayoutState.f116389i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f116368d) {
            C(aVar4.f116366b, aVar4.f116367c);
            c cVar2 = this.mLayoutState;
            cVar2.f116388h = iN2;
            fill(uVar, cVar2, zVar, false);
            c cVar3 = this.mLayoutState;
            i11 = cVar3.f116382b;
            int i18 = cVar3.f116384d;
            int i19 = cVar3.f116383c;
            if (i19 > 0) {
                iJ += i19;
            }
            B(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f116388h = iJ;
            cVar4.f116384d += cVar4.f116385e;
            fill(uVar, cVar4, zVar, false);
            c cVar5 = this.mLayoutState;
            i10 = cVar5.f116382b;
            int i20 = cVar5.f116383c;
            if (i20 > 0) {
                C(i18, i11);
                c cVar6 = this.mLayoutState;
                cVar6.f116388h = i20;
                fill(uVar, cVar6, zVar, false);
                i11 = this.mLayoutState.f116382b;
            }
        } else {
            A(aVar4.f116366b, aVar4.f116367c);
            c cVar7 = this.mLayoutState;
            cVar7.f116388h = iJ;
            fill(uVar, cVar7, zVar, false);
            c cVar8 = this.mLayoutState;
            i10 = cVar8.f116382b;
            int i21 = cVar8.f116384d;
            int i22 = cVar8.f116383c;
            if (i22 > 0) {
                iN2 += i22;
            }
            D(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f116388h = iN2;
            cVar9.f116384d += cVar9.f116385e;
            fill(uVar, cVar9, zVar, false);
            c cVar10 = this.mLayoutState;
            int i23 = cVar10.f116382b;
            int i24 = cVar10.f116383c;
            if (i24 > 0) {
                A(i21, i10);
                c cVar11 = this.mLayoutState;
                cVar11.f116388h = i24;
                fill(uVar, cVar11, zVar, false);
                i10 = this.mLayoutState.f116382b;
            }
            i11 = i23;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iN3 = n(i10, uVar, zVar, true);
                i12 = i11 + iN3;
                i13 = i10 + iN3;
                iN = o(i12, uVar, zVar, false);
            } else {
                int iO = o(i11, uVar, zVar, true);
                i12 = i11 + iO;
                i13 = i10 + iO;
                iN = n(i13, uVar, zVar, false);
            }
            i11 = i12 + iN;
            i10 = i13 + iN;
        }
        p(uVar, zVar, i11, i10);
        if (zVar.j()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.u();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.z zVar) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.invalidateAnchor();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() <= 0) {
            savedState2.invalidateAnchor();
            return savedState2;
        }
        ensureLayoutState();
        boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState2.mAnchorLayoutFromEnd = z10;
        if (z10) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState2.mAnchorOffset = this.mOrientationHelper.i() - this.mOrientationHelper.d(childClosestToEnd);
            savedState2.mAnchorPosition = getPosition(childClosestToEnd);
            return savedState2;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState2.mAnchorPosition = getPosition(childClosestToStart);
        savedState2.mAnchorOffset = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.n();
        return savedState2;
    }

    public final void p(RecyclerView.u uVar, RecyclerView.z zVar, int i10, int i11) {
        if (!zVar.n() || getChildCount() == 0 || zVar.j() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.C> list = uVar.f116445d;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C c10 = list.get(i12);
            if (!c10.isRemoved()) {
                if ((c10.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iE += this.mOrientationHelper.e(c10.itemView);
                } else {
                    iE2 += this.mOrientationHelper.e(c10.itemView);
                }
            }
        }
        this.mLayoutState.f116392l = list;
        if (iE > 0) {
            C(getPosition(getChildClosestToStart()), i10);
            c cVar = this.mLayoutState;
            cVar.f116388h = iE;
            cVar.f116383c = 0;
            cVar.a();
            fill(uVar, this.mLayoutState, zVar, false);
        }
        if (iE2 > 0) {
            A(getPosition(getChildClosestToEnd()), i11);
            c cVar2 = this.mLayoutState;
            cVar2.f116388h = iE2;
            cVar2.f116383c = 0;
            cVar2.a();
            fill(uVar, this.mLayoutState, zVar, false);
        }
        this.mLayoutState.f116392l = null;
    }

    @Override // androidx.recyclerview.widget.m.j
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        v();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b10 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.e(view) + this.mOrientationHelper.g(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (b10 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    public final void q() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void r(RecyclerView.u uVar, c cVar) {
        if (!cVar.f116381a || cVar.f116393m) {
            return;
        }
        int i10 = cVar.f116387g;
        int i11 = cVar.f116389i;
        if (cVar.f116386f == -1) {
            t(uVar, i10, i11);
        } else {
            u(uVar, i10, i11);
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    public final void s(RecyclerView.u uVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, uVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, uVar);
            }
        }
    }

    public int scrollBy(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f116381a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        z(i11, iAbs, true, zVar);
        c cVar = this.mLayoutState;
        int iFill = fill(uVar, cVar, zVar, false) + cVar.f116387g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i10 = i11 * iFill;
        }
        this.mOrientationHelper.t(-i10);
        this.mLayoutState.f116391k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, uVar, zVar);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("invalid orientation:", i10));
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            x xVarB = x.b(this, i10);
            this.mOrientationHelper = xVarB;
            this.mAnchorInfo.f116365a = xVarB;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.setTargetPosition(i10);
        startSmoothScroll(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public final void t(RecyclerView.u uVar, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int iH = (this.mOrientationHelper.h() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.g(childAt) < iH || this.mOrientationHelper.r(childAt) < iH) {
                    s(uVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.g(childAt2) < iH || this.mOrientationHelper.r(childAt2) < iH) {
                s(uVar, i13, i14);
                return;
            }
        }
    }

    public final void u(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.d(childAt) > i12 || this.mOrientationHelper.q(childAt) > i12) {
                    s(uVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.d(childAt2) > i12 || this.mOrientationHelper.q(childAt2) > i12) {
                s(uVar, i14, i15);
                return;
            }
        }
    }

    public final void v() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iG = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int iG2 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    q();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iG2 < iG);
                    throw new RuntimeException(sb2.toString());
                }
                if (iG2 > iG) {
                    q();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int iG3 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                q();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(iG3 < iG);
                throw new RuntimeException(sb3.toString());
            }
            if (iG3 < iG) {
                q();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public final boolean w(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        View viewFindReferenceChild;
        boolean z10 = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null && aVar.d(focusedChild, zVar)) {
                aVar.c(focusedChild, getPosition(focusedChild));
                return true;
            }
            boolean z11 = this.mLastStackFromEnd;
            boolean z12 = this.mStackFromEnd;
            if (z11 == z12 && (viewFindReferenceChild = findReferenceChild(uVar, zVar, aVar.f116368d, z12)) != null) {
                aVar.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                if (!zVar.j() && supportsPredictiveItemAnimations()) {
                    int iG = this.mOrientationHelper.g(viewFindReferenceChild);
                    int iD = this.mOrientationHelper.d(viewFindReferenceChild);
                    int iN = this.mOrientationHelper.n();
                    int i10 = this.mOrientationHelper.i();
                    boolean z13 = iD <= iN && iG < iN;
                    if (iG >= i10 && iD > i10) {
                        z10 = true;
                    }
                    if (z13 || z10) {
                        if (aVar.f116368d) {
                            iN = i10;
                        }
                        aVar.f116367c = iN;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean x(RecyclerView.z zVar, a aVar) {
        int i10;
        if (!zVar.j() && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < zVar.d()) {
                aVar.f116366b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.hasValidAnchor()) {
                    boolean z10 = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    aVar.f116368d = z10;
                    if (z10) {
                        aVar.f116367c = this.mOrientationHelper.i() - this.mPendingSavedState.mAnchorOffset;
                        return true;
                    }
                    aVar.f116367c = this.mOrientationHelper.n() + this.mPendingSavedState.mAnchorOffset;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z11 = this.mShouldReverseLayout;
                    aVar.f116368d = z11;
                    if (z11) {
                        aVar.f116367c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                        return true;
                    }
                    aVar.f116367c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f116368d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                    return true;
                }
                if (this.mOrientationHelper.e(viewFindViewByPosition) > this.mOrientationHelper.o()) {
                    aVar.a();
                    return true;
                }
                if (this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n() < 0) {
                    aVar.f116367c = this.mOrientationHelper.n();
                    aVar.f116368d = false;
                    return true;
                }
                if (this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition) >= 0) {
                    aVar.f116367c = aVar.f116368d ? this.mOrientationHelper.p() + this.mOrientationHelper.d(viewFindViewByPosition) : this.mOrientationHelper.g(viewFindViewByPosition);
                    return true;
                }
                aVar.f116367c = this.mOrientationHelper.i();
                aVar.f116368d = true;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void y(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (x(zVar, aVar) || w(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f116366b = this.mStackFromEnd ? zVar.d() - 1 : 0;
    }

    public final void z(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        int iN;
        this.mLayoutState.f116393m = resolveIsInfinite();
        this.mLayoutState.f116386f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i10 == 1;
        c cVar = this.mLayoutState;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f116388h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f116389i = iMax;
        if (z11) {
            cVar.f116388h = this.mOrientationHelper.j() + i12;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f116385e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f116384d = position + cVar3.f116385e;
            cVar3.f116382b = this.mOrientationHelper.d(childClosestToEnd);
            iN = this.mOrientationHelper.d(childClosestToEnd) - this.mOrientationHelper.i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f116388h = this.mOrientationHelper.n() + cVar4.f116388h;
            c cVar5 = this.mLayoutState;
            cVar5.f116385e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f116384d = position2 + cVar6.f116385e;
            cVar6.f116382b = this.mOrientationHelper.g(childClosestToStart);
            iN = (-this.mOrientationHelper.g(childClosestToStart)) + this.mOrientationHelper.n();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f116383c = i11;
        if (z10) {
            cVar7.f116383c = i11 - iN;
        }
        cVar7.f116387g = iN;
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f116401a);
        setReverseLayout(properties.f116403c);
        setStackFromEnd(properties.f116404d);
    }
}
