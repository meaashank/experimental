package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.V1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.y.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f116480A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f116481B = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f116482C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Deprecated
    public static final int f116483D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f116484E = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f116485F = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final float f116486G = 0.33333334f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f116487y = "StaggeredGridLManager";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f116488z = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c[] f116490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public x f116491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public x f116492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final p f116495g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BitSet f116498j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f116503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f116504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SavedState f116505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f116506r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f116511w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116489a = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116496h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f116497i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f116499k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f116500l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LazySpanLookup f116501m = new LazySpanLookup();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f116502n = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f116507s = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f116508t = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f116509u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f116510v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f116512x = new a();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116513g = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f116514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f116515f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int j() {
            c cVar = this.f116514e;
            if (cVar == null) {
                return -1;
            }
            return cVar.f116532e;
        }

        public boolean k() {
            return this.f116515f;
        }

        public void l(boolean z10) {
            this.f116515f = z10;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

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

        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int i10 = parcel.readInt();
            this.mSpanOffsetsSize = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.mSpanLookupSize = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f116522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f116523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f116524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f116525f;

        public b() {
            c();
        }

        public void a() {
            this.f116521b = this.f116522c ? StaggeredGridLayoutManager.this.f116491c.i() : StaggeredGridLayoutManager.this.f116491c.n();
        }

        public void b(int i10) {
            if (this.f116522c) {
                this.f116521b = StaggeredGridLayoutManager.this.f116491c.i() - i10;
            } else {
                this.f116521b = StaggeredGridLayoutManager.this.f116491c.n() + i10;
            }
        }

        public void c() {
            this.f116520a = -1;
            this.f116521b = Integer.MIN_VALUE;
            this.f116522c = false;
            this.f116523d = false;
            this.f116524e = false;
            int[] iArr = this.f116525f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f116525f;
            if (iArr == null || iArr.length < length) {
                this.f116525f = new int[StaggeredGridLayoutManager.this.f116490b.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f116525f[i10] = cVarArr[i10].u(Integer.MIN_VALUE);
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116527g = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<View> f116528a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116529b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116530c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116531d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f116532e;

        public c(int i10) {
            this.f116532e = i10;
        }

        public void A(int i10) {
            this.f116529b = i10;
            this.f116530c = i10;
        }

        public void a(View view) {
            LayoutParams layoutParamsS = s(view);
            layoutParamsS.f116514e = this;
            this.f116528a.add(view);
            this.f116530c = Integer.MIN_VALUE;
            if (this.f116528a.size() == 1) {
                this.f116529b = Integer.MIN_VALUE;
            }
            if (layoutParamsS.g() || layoutParamsS.f()) {
                this.f116531d = StaggeredGridLayoutManager.this.f116491c.e(view) + this.f116531d;
            }
        }

        public void b(boolean z10, int i10) {
            int iQ = z10 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (iQ == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iQ >= StaggeredGridLayoutManager.this.f116491c.i()) {
                if (z10 || iQ <= StaggeredGridLayoutManager.this.f116491c.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iQ += i10;
                    }
                    this.f116530c = iQ;
                    this.f116529b = iQ;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = (View) V1.a(this.f116528a, 1);
            LayoutParams layoutParamsS = s(view);
            this.f116530c = StaggeredGridLayoutManager.this.f116491c.d(view);
            if (layoutParamsS.f116515f && (fullSpanItemF = StaggeredGridLayoutManager.this.f116501m.f(layoutParamsS.d())) != null && fullSpanItemF.mGapDir == 1) {
                this.f116530c += fullSpanItemF.getGapForSpan(this.f116532e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.f116528a.get(0);
            LayoutParams layoutParamsS = s(view);
            this.f116529b = StaggeredGridLayoutManager.this.f116491c.g(view);
            if (layoutParamsS.f116515f && (fullSpanItemF = StaggeredGridLayoutManager.this.f116501m.f(layoutParamsS.d())) != null && fullSpanItemF.mGapDir == -1) {
                this.f116529b -= fullSpanItemF.getGapForSpan(this.f116532e);
            }
        }

        public void e() {
            this.f116528a.clear();
            v();
            this.f116531d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f116496h ? n(this.f116528a.size() - 1, -1, true) : n(0, this.f116528a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f116496h ? m(this.f116528a.size() - 1, -1, true) : m(0, this.f116528a.size(), true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.f116496h ? n(this.f116528a.size() - 1, -1, false) : n(0, this.f116528a.size(), false);
        }

        public int i() {
            return StaggeredGridLayoutManager.this.f116496h ? n(0, this.f116528a.size(), true) : n(this.f116528a.size() - 1, -1, true);
        }

        public int j() {
            return StaggeredGridLayoutManager.this.f116496h ? m(0, this.f116528a.size(), true) : m(this.f116528a.size() - 1, -1, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.f116496h ? n(0, this.f116528a.size(), false) : n(this.f116528a.size() - 1, -1, false);
        }

        public int l(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iN = StaggeredGridLayoutManager.this.f116491c.n();
            int i12 = StaggeredGridLayoutManager.this.f116491c.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f116528a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f116491c.g(view);
                int iD = StaggeredGridLayoutManager.this.f116491c.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iN : iD >= iN) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iN && iD <= i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iG < iN || iD > i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int m(int i10, int i11, boolean z10) {
            return l(i10, i11, false, false, z10);
        }

        public int n(int i10, int i11, boolean z10) {
            return l(i10, i11, z10, true, false);
        }

        public int o() {
            return this.f116531d;
        }

        public int p() {
            int i10 = this.f116530c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f116530c;
        }

        public int q(int i10) {
            int i11 = this.f116530c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f116528a.size() == 0) {
                return i10;
            }
            c();
            return this.f116530c;
        }

        public View r(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f116528a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f116528a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f116496h && staggeredGridLayoutManager.getPosition(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f116496h && staggeredGridLayoutManager2.getPosition(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f116528a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f116528a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f116496h && staggeredGridLayoutManager3.getPosition(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f116496h && staggeredGridLayoutManager4.getPosition(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public LayoutParams s(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public int t() {
            int i10 = this.f116529b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f116529b;
        }

        public int u(int i10) {
            int i11 = this.f116529b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f116528a.size() == 0) {
                return i10;
            }
            d();
            return this.f116529b;
        }

        public void v() {
            this.f116529b = Integer.MIN_VALUE;
            this.f116530c = Integer.MIN_VALUE;
        }

        public void w(int i10) {
            int i11 = this.f116529b;
            if (i11 != Integer.MIN_VALUE) {
                this.f116529b = i11 + i10;
            }
            int i12 = this.f116530c;
            if (i12 != Integer.MIN_VALUE) {
                this.f116530c = i12 + i10;
            }
        }

        public void x() {
            int size = this.f116528a.size();
            View viewRemove = this.f116528a.remove(size - 1);
            LayoutParams layoutParamsS = s(viewRemove);
            layoutParamsS.f116514e = null;
            if (layoutParamsS.g() || layoutParamsS.f()) {
                this.f116531d -= StaggeredGridLayoutManager.this.f116491c.e(viewRemove);
            }
            if (size == 1) {
                this.f116529b = Integer.MIN_VALUE;
            }
            this.f116530c = Integer.MIN_VALUE;
        }

        public void y() {
            View viewRemove = this.f116528a.remove(0);
            LayoutParams layoutParamsS = s(viewRemove);
            layoutParamsS.f116514e = null;
            if (this.f116528a.size() == 0) {
                this.f116530c = Integer.MIN_VALUE;
            }
            if (layoutParamsS.g() || layoutParamsS.f()) {
                this.f116531d -= StaggeredGridLayoutManager.this.f116491c.e(viewRemove);
            }
            this.f116529b = Integer.MIN_VALUE;
        }

        public void z(View view) {
            LayoutParams layoutParamsS = s(view);
            layoutParamsS.f116514e = this;
            this.f116528a.add(0, view);
            this.f116529b = Integer.MIN_VALUE;
            if (this.f116528a.size() == 1) {
                this.f116530c = Integer.MIN_VALUE;
            }
            if (layoutParamsS.g() || layoutParamsS.f()) {
                this.f116531d = StaggeredGridLayoutManager.this.f116491c.e(view) + this.f116531d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f116401a);
        setSpanCount(properties.f116402b);
        setReverseLayout(properties.f116403c);
        this.f116495g = new p();
        t();
    }

    private void R(View view, int i10, int i11, boolean z10) {
        calculateItemDecorationsForChild(view, this.f116507s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f116507s;
        int iL0 = l0(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f116507s;
        int iL02 = l0(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z10 ? shouldReMeasureChild(view, iL0, iL02, layoutParams) : shouldMeasureChild(view, iL0, iL02, layoutParams)) {
            view.measure(iL0, iL02);
        }
    }

    private void b0() {
        if (this.f116493e == 1 || !isLayoutRTL()) {
            this.f116497i = this.f116496h;
        } else {
            this.f116497i = !this.f116496h;
        }
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f116493e == 1) ? 1 : Integer.MIN_VALUE : this.f116493e == 0 ? 1 : Integer.MIN_VALUE : this.f116493e == 1 ? -1 : Integer.MIN_VALUE : this.f116493e == 0 ? -1 : Integer.MIN_VALUE : (this.f116493e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f116493e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private int o(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return B.a(zVar, this.f116491c, y(!this.f116510v), x(!this.f116510v), this, this.f116510v);
    }

    private int p(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return B.b(zVar, this.f116491c, y(!this.f116510v), x(!this.f116510v), this, this.f116510v, this.f116497i);
    }

    private int q(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return B.c(zVar, this.f116491c, y(!this.f116510v), x(!this.f116510v), this, this.f116510v);
    }

    public int[] A(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f116489a];
        } else if (iArr.length < this.f116489a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f116489a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f116489a; i10++) {
            iArr[i10] = this.f116490b[i10].h();
        }
        return iArr;
    }

    public int[] B(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f116489a];
        } else if (iArr.length < this.f116489a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f116489a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f116489a; i10++) {
            iArr[i10] = this.f116490b[i10].i();
        }
        return iArr;
    }

    public final int C(int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    public int[] D(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f116489a];
        } else if (iArr.length < this.f116489a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f116489a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f116489a; i10++) {
            iArr[i10] = this.f116490b[i10].k();
        }
        return iArr;
    }

    public final void E(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int i10;
        int iJ = J(Integer.MIN_VALUE);
        if (iJ != Integer.MIN_VALUE && (i10 = this.f116491c.i() - iJ) > 0) {
            int i11 = i10 - (-scrollBy(-i10, uVar, zVar));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f116491c.t(i11);
        }
    }

    public final void F(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int iN;
        int iM = M(Integer.MAX_VALUE);
        if (iM != Integer.MAX_VALUE && (iN = iM - this.f116491c.n()) > 0) {
            int iScrollBy = iN - scrollBy(iN, uVar, zVar);
            if (!z10 || iScrollBy <= 0) {
                return;
            }
            this.f116491c.t(-iScrollBy);
        }
    }

    public int G() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int H() {
        return this.f116502n;
    }

    public int I() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int J(int i10) {
        int iQ = this.f116490b[0].q(i10);
        for (int i11 = 1; i11 < this.f116489a; i11++) {
            int iQ2 = this.f116490b[i11].q(i10);
            if (iQ2 > iQ) {
                iQ = iQ2;
            }
        }
        return iQ;
    }

    public final int K(int i10) {
        int iU = this.f116490b[0].u(i10);
        for (int i11 = 1; i11 < this.f116489a; i11++) {
            int iU2 = this.f116490b[i11].u(i10);
            if (iU2 > iU) {
                iU = iU2;
            }
        }
        return iU;
    }

    public final int L(int i10) {
        int iQ = this.f116490b[0].q(i10);
        for (int i11 = 1; i11 < this.f116489a; i11++) {
            int iQ2 = this.f116490b[i11].q(i10);
            if (iQ2 < iQ) {
                iQ = iQ2;
            }
        }
        return iQ;
    }

    public final int M(int i10) {
        int iU = this.f116490b[0].u(i10);
        for (int i11 = 1; i11 < this.f116489a; i11++) {
            int iU2 = this.f116490b[i11].u(i10);
            if (iU2 < iU) {
                iU = iU2;
            }
        }
        return iU;
    }

    public final c N(p pVar) {
        int i10;
        int i11;
        int i12;
        if (U(pVar.f116887e)) {
            i11 = this.f116489a - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f116489a;
            i11 = 0;
            i12 = 1;
        }
        c cVar = null;
        if (pVar.f116887e == 1) {
            int iN = this.f116491c.n();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                c cVar2 = this.f116490b[i11];
                int iQ = cVar2.q(iN);
                if (iQ < i13) {
                    cVar = cVar2;
                    i13 = iQ;
                }
                i11 += i12;
            }
            return cVar;
        }
        int i14 = this.f116491c.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            c cVar3 = this.f116490b[i11];
            int iU = cVar3.u(i14);
            if (iU > i15) {
                cVar = cVar3;
                i15 = iU;
            }
            i11 += i12;
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f116497i
            if (r0 == 0) goto L9
            int r0 = r6.I()
            goto Ld
        L9:
            int r0 = r6.G()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f116501m
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f116501m
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f116501m
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f116501m
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f116501m
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f116497i
            if (r7 == 0) goto L4e
            int r7 = r6.G()
            goto L52
        L4e:
            int r7 = r6.I()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View P() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f116489a
            r2.<init>(r3)
            int r3 = r12.f116489a
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f116493e
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f116497i
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f116514e
            int r9 = r9.f116532e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f116514e
            boolean r9 = r12.n(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f116514e
            int r9 = r9.f116532e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f116515f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f116497i
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.x r10 = r12.f116491c
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.x r11 = r12.f116491c
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.x r10 = r12.f116491c
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.x r11 = r12.f116491c
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f116514e
            int r8 = r8.f116532e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f116514e
            int r9 = r9.f116532e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P():android.view.View");
    }

    public void Q() {
        this.f116501m.b();
        requestLayout();
    }

    public final void S(View view, LayoutParams layoutParams, boolean z10) {
        if (layoutParams.f116515f) {
            if (this.f116493e != 1) {
                R(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f116506r, z10);
                return;
            }
            R(view, this.f116506r, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z10);
            return;
        }
        if (this.f116493e != 1) {
            R(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.f116494f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z10);
            return;
        }
        R(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.f116494f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    public final boolean U(int i10) {
        if (this.f116493e == 0) {
            return (i10 == -1) != this.f116497i;
        }
        return ((i10 == -1) == this.f116497i) == isLayoutRTL();
    }

    public void V(int i10, RecyclerView.z zVar) {
        int iG;
        int i11;
        if (i10 > 0) {
            iG = I();
            i11 = 1;
        } else {
            iG = G();
            i11 = -1;
        }
        this.f116495g.f116883a = true;
        i0(iG, zVar);
        d0(i11);
        p pVar = this.f116495g;
        pVar.f116885c = iG + pVar.f116886d;
        pVar.f116884b = Math.abs(i10);
    }

    public final void W(View view) {
        for (int i10 = this.f116489a - 1; i10 >= 0; i10--) {
            this.f116490b[i10].z(view);
        }
    }

    public final void X(RecyclerView.u uVar, p pVar) {
        if (!pVar.f116883a || pVar.f116891i) {
            return;
        }
        if (pVar.f116884b == 0) {
            if (pVar.f116887e == -1) {
                Y(uVar, pVar.f116889g);
                return;
            } else {
                Z(uVar, pVar.f116888f);
                return;
            }
        }
        if (pVar.f116887e != -1) {
            int iL = L(pVar.f116889g) - pVar.f116889g;
            Z(uVar, iL < 0 ? pVar.f116888f : Math.min(iL, pVar.f116884b) + pVar.f116888f);
        } else {
            int i10 = pVar.f116888f;
            int iK = i10 - K(i10);
            Y(uVar, iK < 0 ? pVar.f116889g : pVar.f116889g - Math.min(iK, pVar.f116884b));
        }
    }

    public final void Y(RecyclerView.u uVar, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f116491c.g(childAt) < i10 || this.f116491c.r(childAt) < i10) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f116515f) {
                for (int i11 = 0; i11 < this.f116489a; i11++) {
                    if (this.f116490b[i11].f116528a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f116489a; i12++) {
                    this.f116490b[i12].x();
                }
            } else if (layoutParams.f116514e.f116528a.size() == 1) {
                return;
            } else {
                layoutParams.f116514e.x();
            }
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void Z(RecyclerView.u uVar, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f116491c.d(childAt) > i10 || this.f116491c.q(childAt) > i10) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f116515f) {
                for (int i11 = 0; i11 < this.f116489a; i11++) {
                    if (this.f116490b[i11].f116528a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f116489a; i12++) {
                    this.f116490b[i12].y();
                }
            } else if (layoutParams.f116514e.f116528a.size() == 1) {
                return;
            } else {
                layoutParams.f116514e.y();
            }
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void a0() {
        if (this.f116492d.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float fE = this.f116492d.e(childAt);
            if (fE >= fMax) {
                if (((LayoutParams) childAt.getLayoutParams()).k()) {
                    fE = (fE * 1.0f) / this.f116489a;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f116494f;
        int iRound = Math.round(fMax * this.f116489a);
        if (this.f116492d.l() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f116492d.o());
        }
        j0(iRound);
        if (this.f116494f == i11) {
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.f116515f) {
                if (isLayoutRTL() && this.f116493e == 1) {
                    int i13 = -((this.f116489a - 1) - layoutParams.f116514e.f116532e);
                    childAt2.offsetLeftAndRight((this.f116494f * i13) - (i13 * i11));
                } else {
                    int i14 = layoutParams.f116514e.f116532e;
                    int i15 = this.f116494f * i14;
                    int i16 = i14 * i11;
                    if (this.f116493e == 1) {
                        childAt2.offsetLeftAndRight(i15 - i16);
                    } else {
                        childAt2.offsetTopAndBottom(i15 - i16);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f116505q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void c0(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f116502n) {
            return;
        }
        if (i10 != 0 && i10 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f116502n = i10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f116493e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f116493e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.z zVar, RecyclerView.LayoutManager.c cVar) {
        int iQ;
        int iU;
        if (this.f116493e != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        V(i10, zVar);
        int[] iArr = this.f116511w;
        if (iArr == null || iArr.length < this.f116489a) {
            this.f116511w = new int[this.f116489a];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f116489a; i13++) {
            p pVar = this.f116495g;
            if (pVar.f116886d == -1) {
                iQ = pVar.f116888f;
                iU = this.f116490b[i13].u(iQ);
            } else {
                iQ = this.f116490b[i13].q(pVar.f116889g);
                iU = this.f116495g.f116889g;
            }
            int i14 = iQ - iU;
            if (i14 >= 0) {
                this.f116511w[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f116511w, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f116495g.a(zVar); i15++) {
            cVar.a(this.f116495g.f116885c, this.f116511w[i15]);
            p pVar2 = this.f116495g;
            pVar2.f116885c += pVar2.f116886d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return o(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return p(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return q(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i10) {
        int iL = l(i10);
        PointF pointF = new PointF();
        if (iL == 0) {
            return null;
        }
        if (this.f116493e == 0) {
            pointF.x = iL;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iL;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return o(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return p(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return q(zVar);
    }

    public final void d0(int i10) {
        p pVar = this.f116495g;
        pVar.f116887e = i10;
        pVar.f116886d = this.f116497i != (i10 == -1) ? -1 : 1;
    }

    public final void e0(int i10, int i11) {
        for (int i12 = 0; i12 < this.f116489a; i12++) {
            if (!this.f116490b[i12].f116528a.isEmpty()) {
                k0(this.f116490b[i12], i10, i11);
            }
        }
    }

    public final boolean f0(RecyclerView.z zVar, b bVar) {
        bVar.f116520a = this.f116503o ? C(zVar.d()) : w(zVar.d());
        bVar.f116521b = Integer.MIN_VALUE;
        return true;
    }

    public final void g(View view) {
        for (int i10 = this.f116489a - 1; i10 >= 0; i10--) {
            this.f116490b[i10].a(view);
        }
    }

    public boolean g0(RecyclerView.z zVar, b bVar) {
        int i10;
        if (!zVar.j() && (i10 = this.f116499k) != -1) {
            if (i10 >= 0 && i10 < zVar.d()) {
                SavedState savedState = this.f116505q;
                if (savedState != null && savedState.mAnchorPosition != -1 && savedState.mSpanOffsetsSize >= 1) {
                    bVar.f116521b = Integer.MIN_VALUE;
                    bVar.f116520a = this.f116499k;
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.f116499k);
                if (viewFindViewByPosition == null) {
                    int i11 = this.f116499k;
                    bVar.f116520a = i11;
                    int i12 = this.f116500l;
                    if (i12 == Integer.MIN_VALUE) {
                        bVar.f116522c = l(i11) == 1;
                        bVar.a();
                    } else {
                        bVar.b(i12);
                    }
                    bVar.f116523d = true;
                    return true;
                }
                bVar.f116520a = this.f116497i ? I() : G();
                if (this.f116500l != Integer.MIN_VALUE) {
                    if (bVar.f116522c) {
                        bVar.f116521b = (this.f116491c.i() - this.f116500l) - this.f116491c.d(viewFindViewByPosition);
                        return true;
                    }
                    bVar.f116521b = (this.f116491c.n() + this.f116500l) - this.f116491c.g(viewFindViewByPosition);
                    return true;
                }
                if (this.f116491c.e(viewFindViewByPosition) > this.f116491c.o()) {
                    bVar.f116521b = bVar.f116522c ? this.f116491c.i() : this.f116491c.n();
                    return true;
                }
                int iG = this.f116491c.g(viewFindViewByPosition) - this.f116491c.n();
                if (iG < 0) {
                    bVar.f116521b = -iG;
                    return true;
                }
                int i13 = this.f116491c.i() - this.f116491c.d(viewFindViewByPosition);
                if (i13 < 0) {
                    bVar.f116521b = i13;
                    return true;
                }
                bVar.f116521b = Integer.MIN_VALUE;
                return true;
            }
            this.f116499k = -1;
            this.f116500l = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f116493e == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getOrientation() {
        return this.f116493e;
    }

    public boolean getReverseLayout() {
        return this.f116496h;
    }

    public int getSpanCount() {
        return this.f116489a;
    }

    public final void h(b bVar) {
        SavedState savedState = this.f116505q;
        int i10 = savedState.mSpanOffsetsSize;
        if (i10 > 0) {
            if (i10 == this.f116489a) {
                for (int i11 = 0; i11 < this.f116489a; i11++) {
                    this.f116490b[i11].e();
                    SavedState savedState2 = this.f116505q;
                    int i12 = savedState2.mSpanOffsets[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.mAnchorLayoutFromEnd ? this.f116491c.i() : this.f116491c.n();
                    }
                    this.f116490b[i11].A(i12);
                }
            } else {
                savedState.invalidateSpanInfo();
                SavedState savedState3 = this.f116505q;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.f116505q;
        this.f116504p = savedState4.mLastLayoutRTL;
        setReverseLayout(savedState4.mReverseLayout);
        b0();
        SavedState savedState5 = this.f116505q;
        int i13 = savedState5.mAnchorPosition;
        if (i13 != -1) {
            this.f116499k = i13;
            bVar.f116522c = savedState5.mAnchorLayoutFromEnd;
        } else {
            bVar.f116522c = this.f116497i;
        }
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.f116501m;
            lazySpanLookup.f116517a = savedState5.mSpanLookup;
            lazySpanLookup.f116518b = savedState5.mFullSpanItems;
        }
    }

    public void h0(RecyclerView.z zVar, b bVar) {
        if (g0(zVar, bVar)) {
            return;
        }
        f0(zVar, bVar);
    }

    public boolean i() {
        int iQ = this.f116490b[0].q(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f116489a; i10++) {
            if (this.f116490b[i10].q(Integer.MIN_VALUE) != iQ) {
                return false;
            }
        }
        return true;
    }

    public final void i0(int i10, RecyclerView.z zVar) {
        int iO;
        int iO2;
        int iG;
        p pVar = this.f116495g;
        boolean z10 = false;
        pVar.f116884b = 0;
        pVar.f116885c = i10;
        if (!isSmoothScrolling() || (iG = zVar.g()) == -1) {
            iO = 0;
            iO2 = 0;
        } else {
            if (this.f116497i == (iG < i10)) {
                iO = this.f116491c.o();
                iO2 = 0;
            } else {
                iO2 = this.f116491c.o();
                iO = 0;
            }
        }
        if (getClipToPadding()) {
            this.f116495g.f116888f = this.f116491c.n() - iO2;
            this.f116495g.f116889g = this.f116491c.i() + iO;
        } else {
            this.f116495g.f116889g = this.f116491c.h() + iO;
            this.f116495g.f116888f = -iO2;
        }
        p pVar2 = this.f116495g;
        pVar2.f116890h = false;
        pVar2.f116883a = true;
        if (this.f116491c.l() == 0 && this.f116491c.h() == 0) {
            z10 = true;
        }
        pVar2.f116891i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.f116502n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean j() {
        int iU = this.f116490b[0].u(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f116489a; i10++) {
            if (this.f116490b[i10].u(Integer.MIN_VALUE) != iU) {
                return false;
            }
        }
        return true;
    }

    public void j0(int i10) {
        this.f116494f = i10 / this.f116489a;
        this.f116506r = View.MeasureSpec.makeMeasureSpec(i10, this.f116492d.l());
    }

    public final void k(View view, LayoutParams layoutParams, p pVar) {
        if (pVar.f116887e == 1) {
            if (layoutParams.f116515f) {
                g(view);
                return;
            } else {
                layoutParams.f116514e.a(view);
                return;
            }
        }
        if (layoutParams.f116515f) {
            W(view);
        } else {
            layoutParams.f116514e.z(view);
        }
    }

    public final void k0(c cVar, int i10, int i11) {
        int iO = cVar.o();
        if (i10 == -1) {
            if (cVar.t() + iO <= i11) {
                this.f116498j.set(cVar.f116532e, false);
            }
        } else if (cVar.p() - iO >= i11) {
            this.f116498j.set(cVar.f116532e, false);
        }
    }

    public final int l(int i10) {
        if (getChildCount() == 0) {
            return this.f116497i ? 1 : -1;
        }
        return (i10 < G()) != this.f116497i ? -1 : 1;
    }

    public final int l0(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public boolean m() {
        int iG;
        int I10;
        if (getChildCount() == 0 || this.f116502n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f116497i) {
            iG = I();
            I10 = G();
        } else {
            iG = G();
            I10 = I();
        }
        if (iG == 0 && P() != null) {
            this.f116501m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f116509u) {
            return false;
        }
        int i10 = this.f116497i ? -1 : 1;
        int i11 = I10 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.f116501m.e(iG, i11, i10, true);
        if (fullSpanItemE == null) {
            this.f116509u = false;
            this.f116501m.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.f116501m.e(iG, fullSpanItemE.mPosition, i10 * (-1), true);
        if (fullSpanItemE2 == null) {
            this.f116501m.d(fullSpanItemE.mPosition);
        } else {
            this.f116501m.d(fullSpanItemE2.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final boolean n(c cVar) {
        boolean z10;
        if (this.f116497i) {
            if (cVar.p() < this.f116491c.i()) {
                z10 = cVar.s((View) V1.a(cVar.f116528a, 1)).f116515f;
                return !z10;
            }
            return false;
        }
        if (cVar.t() > this.f116491c.n()) {
            z10 = cVar.s(cVar.f116528a.get(0)).f116515f;
            return !z10;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f116489a; i11++) {
            this.f116490b[i11].w(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f116489a; i11++) {
            this.f116490b[i11].w(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f116501m.b();
        for (int i10 = 0; i10 < this.f116489a; i10++) {
            this.f116490b[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f116512x);
        for (int i10 = 0; i10 < this.f116489a; i10++) {
            this.f116490b[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        View viewFindContainingItemView;
        View viewR;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        b0();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z10 = layoutParams.f116515f;
        c cVar = layoutParams.f116514e;
        int I10 = iConvertFocusDirectionToLayoutDirection == 1 ? I() : G();
        i0(I10, zVar);
        d0(iConvertFocusDirectionToLayoutDirection);
        p pVar = this.f116495g;
        pVar.f116885c = pVar.f116886d + I10;
        pVar.f116884b = (int) (this.f116491c.o() * 0.33333334f);
        p pVar2 = this.f116495g;
        pVar2.f116890h = true;
        pVar2.f116883a = false;
        u(uVar, pVar2, zVar);
        this.f116503o = this.f116497i;
        if (!z10 && (viewR = cVar.r(I10, iConvertFocusDirectionToLayoutDirection)) != null && viewR != viewFindContainingItemView) {
            return viewR;
        }
        if (U(iConvertFocusDirectionToLayoutDirection)) {
            for (int i11 = this.f116489a - 1; i11 >= 0; i11--) {
                View viewR2 = this.f116490b[i11].r(I10, iConvertFocusDirectionToLayoutDirection);
                if (viewR2 != null && viewR2 != viewFindContainingItemView) {
                    return viewR2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f116489a; i12++) {
                View viewR3 = this.f116490b[i12].r(I10, iConvertFocusDirectionToLayoutDirection);
                if (viewR3 != null && viewR3 != viewFindContainingItemView) {
                    return viewR3;
                }
            }
        }
        boolean z11 = (this.f116496h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z10) {
            View viewFindViewByPosition = findViewByPosition(z11 ? cVar.g() : cVar.j());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (U(iConvertFocusDirectionToLayoutDirection)) {
            for (int i13 = this.f116489a - 1; i13 >= 0; i13--) {
                if (i13 != cVar.f116532e) {
                    View viewFindViewByPosition2 = findViewByPosition(z11 ? this.f116490b[i13].g() : this.f116490b[i13].j());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f116489a; i14++) {
                View viewFindViewByPosition3 = findViewByPosition(z11 ? this.f116490b[i14].g() : this.f116490b[i14].j());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewY = y(false);
            View viewX = x(false);
            if (viewY == null || viewX == null) {
                return;
            }
            int position = getPosition(viewY);
            int position2 = getPosition(viewX);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        O(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f116501m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        O(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        O(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        O(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        T(uVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.z zVar) {
        this.f116499k = -1;
        this.f116500l = Integer.MIN_VALUE;
        this.f116505q = null;
        this.f116508t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f116505q = savedState;
            if (this.f116499k != -1) {
                savedState.invalidateAnchorPositionInfo();
                this.f116505q.invalidateSpanInfo();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int iU;
        int iN;
        int[] iArr;
        SavedState savedState = this.f116505q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.mReverseLayout = this.f116496h;
        savedState2.mAnchorLayoutFromEnd = this.f116503o;
        savedState2.mLastLayoutRTL = this.f116504p;
        LazySpanLookup lazySpanLookup = this.f116501m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f116517a) == null) {
            savedState2.mSpanLookupSize = 0;
        } else {
            savedState2.mSpanLookup = iArr;
            savedState2.mSpanLookupSize = iArr.length;
            savedState2.mFullSpanItems = lazySpanLookup.f116518b;
        }
        if (getChildCount() <= 0) {
            savedState2.mAnchorPosition = -1;
            savedState2.mVisibleAnchorPosition = -1;
            savedState2.mSpanOffsetsSize = 0;
            return savedState2;
        }
        savedState2.mAnchorPosition = this.f116503o ? I() : G();
        savedState2.mVisibleAnchorPosition = z();
        int i10 = this.f116489a;
        savedState2.mSpanOffsetsSize = i10;
        savedState2.mSpanOffsets = new int[i10];
        for (int i11 = 0; i11 < this.f116489a; i11++) {
            if (this.f116503o) {
                iU = this.f116490b[i11].q(Integer.MIN_VALUE);
                if (iU != Integer.MIN_VALUE) {
                    iN = this.f116491c.i();
                    iU -= iN;
                }
            } else {
                iU = this.f116490b[i11].u(Integer.MIN_VALUE);
                if (iU != Integer.MIN_VALUE) {
                    iN = this.f116491c.n();
                    iU -= iN;
                }
            }
            savedState2.mSpanOffsets[i11] = iU;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            m();
        }
    }

    public final LazySpanLookup.FullSpanItem r(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f116489a];
        for (int i11 = 0; i11 < this.f116489a; i11++) {
            fullSpanItem.mGapPerSpan[i11] = i10 - this.f116490b[i11].q(i10);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem s(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f116489a];
        for (int i11 = 0; i11 < this.f116489a; i11++) {
            fullSpanItem.mGapPerSpan[i11] = this.f116490b[i11].u(i10) - i10;
        }
        return fullSpanItem;
    }

    public int scrollBy(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        V(i10, zVar);
        int iU = u(uVar, this.f116495g, zVar);
        if (this.f116495g.f116884b >= iU) {
            i10 = i10 < 0 ? -iU : iU;
        }
        this.f116491c.t(-i10);
        this.f116503o = this.f116497i;
        p pVar = this.f116495g;
        pVar.f116884b = 0;
        X(uVar, pVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        return scrollBy(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        SavedState savedState = this.f116505q;
        if (savedState != null && savedState.mAnchorPosition != i10) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.f116499k = i10;
        this.f116500l = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        SavedState savedState = this.f116505q;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.f116499k = i10;
        this.f116500l = i11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        return scrollBy(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f116493e == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i10, (this.f116494f * this.f116489a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i11, (this.f116494f * this.f116489a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f116493e) {
            return;
        }
        this.f116493e = i10;
        x xVar = this.f116491c;
        this.f116491c = this.f116492d;
        this.f116492d = xVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f116505q;
        if (savedState != null && savedState.mReverseLayout != z10) {
            savedState.mReverseLayout = z10;
        }
        this.f116496h = z10;
        requestLayout();
    }

    public void setSpanCount(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f116489a) {
            Q();
            this.f116489a = i10;
            this.f116498j = new BitSet(this.f116489a);
            this.f116490b = new c[this.f116489a];
            for (int i11 = 0; i11 < this.f116489a; i11++) {
                this.f116490b[i11] = new c(i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.setTargetPosition(i10);
        startSmoothScroll(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.f116505q == null;
    }

    public final void t() {
        this.f116491c = x.b(this, this.f116493e);
        this.f116492d = x.b(this, 1 - this.f116493e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int u(RecyclerView.u uVar, p pVar, RecyclerView.z zVar) {
        c cVarN;
        int iM;
        int iE;
        int iN;
        int iE2;
        ?? r02;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r82 = 0;
        staggeredGridLayoutManager.f116498j.set(0, staggeredGridLayoutManager.f116489a, true);
        int i10 = staggeredGridLayoutManager.f116495g.f116891i ? pVar.f116887e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : pVar.f116887e == 1 ? pVar.f116889g + pVar.f116884b : pVar.f116888f - pVar.f116884b;
        staggeredGridLayoutManager.e0(pVar.f116887e, i10);
        int i11 = staggeredGridLayoutManager.f116497i ? staggeredGridLayoutManager.f116491c.i() : staggeredGridLayoutManager.f116491c.n();
        boolean z10 = false;
        ?? r03 = staggeredGridLayoutManager;
        while (pVar.a(zVar) && (r03.f116495g.f116891i || !r03.f116498j.isEmpty())) {
            View viewB = pVar.b(uVar);
            LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
            int iD = layoutParams.d();
            int iG = r03.f116501m.g(iD);
            ?? r52 = iG == -1 ? 1 : r82;
            if (r52 != 0) {
                cVarN = layoutParams.f116515f ? r03.f116490b[r82] : r03.N(pVar);
                r03.f116501m.n(iD, cVarN);
            } else {
                cVarN = r03.f116490b[iG];
            }
            c cVar = cVarN;
            layoutParams.f116514e = cVar;
            if (pVar.f116887e == 1) {
                r03.addView(viewB);
            } else {
                r03.addView(viewB, r82);
            }
            r03.S(viewB, layoutParams, r82);
            if (pVar.f116887e == 1) {
                iE = layoutParams.f116515f ? r03.J(i11) : cVar.q(i11);
                iM = r03.f116491c.e(viewB) + iE;
                if (r52 != 0 && layoutParams.f116515f) {
                    LazySpanLookup.FullSpanItem fullSpanItemR = r03.r(iE);
                    fullSpanItemR.mGapDir = -1;
                    fullSpanItemR.mPosition = iD;
                    r03.f116501m.a(fullSpanItemR);
                }
            } else {
                iM = layoutParams.f116515f ? r03.M(i11) : cVar.u(i11);
                iE = iM - r03.f116491c.e(viewB);
                if (r52 != 0 && layoutParams.f116515f) {
                    LazySpanLookup.FullSpanItem fullSpanItemS = r03.s(iM);
                    fullSpanItemS.mGapDir = 1;
                    fullSpanItemS.mPosition = iD;
                    r03.f116501m.a(fullSpanItemS);
                }
            }
            if (layoutParams.f116515f && pVar.f116886d == -1) {
                if (r52 != 0) {
                    r03.f116509u = true;
                } else {
                    if (!(pVar.f116887e == 1 ? r03.i() : r03.j())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = r03.f116501m.f(iD);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.mHasUnwantedGapAfter = true;
                        }
                        r03.f116509u = true;
                    }
                }
            }
            r03.k(viewB, layoutParams, pVar);
            if (r03.isLayoutRTL() && r03.f116493e == 1) {
                iE2 = layoutParams.f116515f ? r03.f116492d.i() : r03.f116492d.i() - (((r03.f116489a - 1) - cVar.f116532e) * r03.f116494f);
                iN = iE2 - r03.f116492d.e(viewB);
            } else {
                iN = layoutParams.f116515f ? r03.f116492d.n() : r03.f116492d.n() + (cVar.f116532e * r03.f116494f);
                iE2 = r03.f116492d.e(viewB) + iN;
            }
            int i12 = iE2;
            int i13 = iN;
            if (r03.f116493e == 1) {
                r03.layoutDecoratedWithMargins(viewB, i13, iE, i12, iM);
                r02 = this;
            } else {
                r03.layoutDecoratedWithMargins(viewB, iE, i13, iM, i12);
                r02 = r03;
            }
            if (layoutParams.f116515f) {
                r02.e0(r02.f116495g.f116887e, i10);
            } else {
                r02.k0(cVar, r02.f116495g.f116887e, i10);
            }
            r02.X(uVar, r02.f116495g);
            if (r02.f116495g.f116890h && viewB.hasFocusable()) {
                if (layoutParams.f116515f) {
                    r02.f116498j.clear();
                } else {
                    r02.f116498j.set(cVar.f116532e, false);
                }
            }
            z10 = true;
            r82 = 0;
            r03 = r02;
        }
        if (!z10) {
            r03.X(uVar, r03.f116495g);
        }
        int iN2 = r03.f116495g.f116887e == -1 ? r03.f116491c.n() - r03.M(r03.f116491c.n()) : r03.J(r03.f116491c.i()) - r03.f116491c.i();
        if (iN2 > 0) {
            return Math.min(pVar.f116884b, iN2);
        }
        return 0;
    }

    public int[] v(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f116489a];
        } else if (iArr.length < this.f116489a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f116489a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f116489a; i10++) {
            iArr[i10] = this.f116490b[i10].f();
        }
        return iArr;
    }

    public final int w(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int position = getPosition(getChildAt(i11));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    public View x(boolean z10) {
        int iN = this.f116491c.n();
        int i10 = this.f116491c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iG = this.f116491c.g(childAt);
            int iD = this.f116491c.d(childAt);
            if (iD > iN && iG < i10) {
                if (iD <= i10 || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View y(boolean z10) {
        int iN = this.f116491c.n();
        int i10 = this.f116491c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int iG = this.f116491c.g(childAt);
            if (this.f116491c.d(childAt) > iN && iG < i10) {
                if (iG >= iN || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int z() {
        View viewX = this.f116497i ? x(true) : y(true);
        if (viewX == null) {
            return -1;
        }
        return getPosition(viewX);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f116516c = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f116517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<FullSpanItem> f116518b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.f116518b == null) {
                this.f116518b = new ArrayList();
            }
            int size = this.f116518b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f116518b.get(i10);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.f116518b.remove(i10);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.f116518b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f116518b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.f116517a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f116518b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f116517a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f116517a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f116517a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f116517a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List<FullSpanItem> list = this.f116518b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f116518b.get(size).mPosition >= i10) {
                        this.f116518b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f116518b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f116518b.get(i13);
                int i14 = fullSpanItem.mPosition;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.mGapDir == i12 || (z10 && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f116518b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f116518b.get(size);
                if (fullSpanItem.mPosition == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f116517a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f116517a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f116517a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f116517a.length;
            }
            int iMin = Math.min(i11 + 1, this.f116517a.length);
            Arrays.fill(this.f116517a, i10, iMin, -1);
            return iMin;
        }

        public final int i(int i10) {
            if (this.f116518b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i10);
            if (fullSpanItemF != null) {
                this.f116518b.remove(fullSpanItemF);
            }
            int size = this.f116518b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f116518b.get(i11).mPosition >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f116518b.get(i11);
            this.f116518b.remove(i11);
            return fullSpanItem.mPosition;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f116517a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f116517a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f116517a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f116517a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f116517a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f116517a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List<FullSpanItem> list = this.f116518b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f116518b.get(size);
                int i12 = fullSpanItem.mPosition;
                if (i12 >= i10) {
                    fullSpanItem.mPosition = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List<FullSpanItem> list = this.f116518b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f116518b.get(size);
                int i13 = fullSpanItem.mPosition;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f116518b.remove(size);
                    } else {
                        fullSpanItem.mPosition = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, c cVar) {
            c(i10);
            this.f116517a[i10] = cVar.f116532e;
        }

        public int o(int i10) {
            int length = this.f116517a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                this.mHasUnwantedGapAfter = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public int getGapForSpan(int i10) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                }
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f116493e = i11;
        setSpanCount(i10);
        this.f116495g = new p();
        t();
    }
}
