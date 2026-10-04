package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.widget.g;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static h sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.a mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private f mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.d mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    b mMeasurer;
    private o0.b mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107759a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f107759a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107759a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107759a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107759a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements b.InterfaceC0270b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f107760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f107761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f107762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f107763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f107764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f107765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f107766g;

        public b(ConstraintLayout l10) {
            this.f107760a = l10;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0270b
        public final void a() {
            int childCount = this.f107760a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f107760a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).f(this.f107760a);
                }
            }
            int size = this.f107760a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((ConstraintHelper) this.f107760a.mConstraintHelpers.get(i11)).getClass();
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0270b
        @SuppressLint({"WrongCall"})
        public final void b(ConstraintWidget widget, b.a measure) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (widget == null) {
                return;
            }
            if (widget.l0() == 8 && !widget.C0()) {
                measure.f106294e = 0;
                measure.f106295f = 0;
                measure.f106296g = 0;
                return;
            }
            if (widget.U() == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f106290a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f106291b;
            int i11 = measure.f106292c;
            int i12 = measure.f106293d;
            int i13 = this.f107761b + this.f107762c;
            int i14 = this.f107763d;
            View view = (View) widget.w();
            int[] iArr = a.f107759a;
            int i15 = iArr[dimensionBehaviour.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f107765f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f107765f, widget.I() + i14, -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f107765f, i14, -2);
                boolean z10 = widget.f106233w == 1;
                int i16 = measure.f106299j;
                if (i16 == b.a.f106288l || i16 == b.a.f106289m) {
                    boolean z11 = view.getMeasuredHeight() == widget.D();
                    if (measure.f106299j == b.a.f106289m || !z10 || ((z10 && z11) || (view instanceof Placeholder) || widget.G0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widget.m0(), 1073741824);
                    }
                }
            }
            int i17 = iArr[dimensionBehaviour2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f107766g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f107766g, widget.k0() + i13, -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f107766g, i13, -2);
                boolean z12 = widget.f106235x == 1;
                int i18 = measure.f106299j;
                if (i18 == b.a.f106288l || i18 == b.a.f106289m) {
                    boolean z13 = view.getMeasuredWidth() == widget.m0();
                    if (measure.f106299j == b.a.f106289m || !z12 || ((z12 && z13) || (view instanceof Placeholder) || widget.H0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(widget.D(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) widget.U();
            if (dVar != null && androidx.constraintlayout.core.widgets.g.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == widget.m0() && view.getMeasuredWidth() < dVar.m0() && view.getMeasuredHeight() == widget.D() && view.getMeasuredHeight() < dVar.D() && view.getBaseline() == widget.t() && !widget.F0() && d(widget.J(), iMakeMeasureSpec, widget.m0()) && d(widget.K(), iMakeMeasureSpec2, widget.D())) {
                measure.f106294e = widget.m0();
                measure.f106295f = widget.D();
                measure.f106296g = widget.t();
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z14 = dimensionBehaviour == dimensionBehaviour3;
            boolean z15 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z16 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z17 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z18 = z14 && widget.f106200f0 > 0.0f;
            boolean z19 = z15 && widget.f106200f0 > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i19 = measure.f106299j;
            if (i19 != b.a.f106288l && i19 != b.a.f106289m && z14 && widget.f106233w == 0 && z15 && widget.f106235x == 0) {
                iMax2 = 0;
                i10 = -1;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (widget instanceof androidx.constraintlayout.core.widgets.i)) {
                    ((VirtualLayout) view).O((androidx.constraintlayout.core.widgets.i) widget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                widget.J1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = widget.f106239z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = widget.f106143A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = widget.f106147C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = widget.f106149D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                if (!androidx.constraintlayout.core.widgets.g.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z18 && z16) {
                        iMax = (int) ((iMax2 * widget.f106200f0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / widget.f106200f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    widget.J1(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z21 = baseline != i10;
            measure.f106298i = (iMax == measure.f106292c && iMax2 == measure.f106293d) ? false : true;
            if (layoutParams.f107662g0) {
                z21 = true;
            }
            if (z21 && baseline != -1 && widget.t() != baseline) {
                measure.f106298i = true;
            }
            measure.f106294e = iMax;
            measure.f106295f = iMax2;
            measure.f106297h = z21;
            measure.f106296g = baseline;
        }

        public void c(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.f107761b = top;
            this.f107762c = bottom;
            this.f107763d = width;
            this.f107764e = height;
            this.f107765f = widthSpec;
            this.f107766g = heightSpec;
        }

        public final boolean d(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && widgetSize == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        i(null, 0, 0);
    }

    public static h getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new h();
        }
        return sSharedValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyConstraintsFromLayoutParams(boolean r15, android.view.View r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r18, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r19) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p10) {
        return p10 instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).K(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(o0.b metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.E2(metrics);
    }

    @Override // android.view.View
    public void forceLayout() {
        j();
        super.forceLayout();
    }

    public final int g() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public Object getDesignInformation(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String str = (String) value;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.H2();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f106217o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f106217o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f106217o = d.f107893V1;
            }
        }
        if (this.mLayoutWidget.y() == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
            dVar.j1(dVar.f106217o);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.y());
        }
        ArrayList<ConstraintWidget> arrayListL2 = this.mLayoutWidget.l2();
        int size = arrayListL2.size();
        int i10 = 0;
        while (i10 < size) {
            ConstraintWidget constraintWidget = arrayListL2.get(i10);
            i10++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            View view = (View) constraintWidget2.w();
            if (view != null) {
                if (constraintWidget2.f106217o == null && (id2 = view.getId()) != -1) {
                    constraintWidget2.f106217o = getContext().getResources().getResourceEntryName(id2);
                }
                if (constraintWidget2.y() == null) {
                    constraintWidget2.j1(constraintWidget2.f106217o);
                    Log.v(TAG, " setDebugName " + constraintWidget2.y());
                }
            }
        }
        this.mLayoutWidget.b0(sb2);
        return sb2.toString();
    }

    public View getViewById(int id2) {
        return this.mChildrenByIds.get(id2);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f107692v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f107692v0;
        }
        return null;
    }

    public final ConstraintWidget h(int id2) {
        if (id2 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(id2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).f107692v0;
    }

    public final void i(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.mLayoutWidget.h1(this);
        this.mLayoutWidget.U2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f110547y6, defStyleAttr, defStyleRes);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f110027P6) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == g.m.f110042Q6) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == g.m.f109997N6) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == g.m.f110012O6) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == g.m.f109924I8) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == g.m.f109848D7) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == g.m.f110291h7) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.V2(this.mOptimizationLevel);
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void j() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public final void k() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i10));
            if (viewWidget != null) {
                viewWidget.R0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    h(childAt.getId()).j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).c();
                }
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.t(this, true);
        }
        this.mLayoutWidget.p2();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).M(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).g(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.a(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    public final void l(ConstraintWidget widget, LayoutParams layoutParams, SparseArray<ConstraintWidget> idToWidget, int baselineTarget, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(baselineTarget);
        ConstraintWidget constraintWidget = idToWidget.get(baselineTarget);
        if (constraintWidget == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f107662g0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f107662g0 = true;
            layoutParams2.f107692v0.x1(true);
        }
        widget.r(type2).b(constraintWidget.r(type), layoutParams.f107626D, layoutParams.f107625C, true);
        widget.x1(true);
        widget.r(ConstraintAnchor.Type.TOP).x();
        widget.r(ConstraintAnchor.Type.BOTTOM).x();
    }

    public void loadLayoutDescription(int layoutDescription) {
        if (layoutDescription == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.a(getContext(), this, layoutDescription);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    public final boolean m() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            k();
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View viewA;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f107692v0;
            if ((childAt.getVisibility() != 8 || layoutParams.f107664h0 || layoutParams.f107666i0 || layoutParams.f107670k0 || zIsInEditMode) && !layoutParams.f107668j0) {
                int iO0 = constraintWidget.o0();
                int iP0 = constraintWidget.p0();
                int iM0 = constraintWidget.m0() + iO0;
                int iD = constraintWidget.D() + iP0;
                childAt.layout(iO0, iP0, iM0, iD);
                if ((childAt instanceof Placeholder) && (viewA = ((Placeholder) childAt).a()) != null) {
                    viewA.setVisibility(0);
                    viewA.layout(iO0, iP0, iM0, iD);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.mConstraintHelpers.get(i11).I(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mOnMeasureWidthMeasureSpec == widthMeasureSpec) {
            int i10 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                if (getChildAt(i11).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i11++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = widthMeasureSpec;
        this.mOnMeasureHeightMeasureSpec = heightMeasureSpec;
        this.mLayoutWidget.Y2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m()) {
                this.mLayoutWidget.a3();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, widthMeasureSpec, heightMeasureSpec);
        resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, this.mLayoutWidget.m0(), this.mLayoutWidget.D(), this.mLayoutWidget.P2(), this.mLayoutWidget.N2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.f fVar = new androidx.constraintlayout.core.widgets.f();
            layoutParams.f107692v0 = fVar;
            layoutParams.f107664h0 = true;
            fVar.B2(layoutParams.f107648Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.N();
            ((LayoutParams) view.getLayoutParams()).f107666i0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.o2(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int id2) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.a(getContext(), this, id2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        j();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        b bVar = this.mMeasurer;
        int i10 = bVar.f107764e;
        int iResolveSizeAndState = View.resolveSizeAndState(measuredWidth + bVar.f107763d, widthMeasureSpec, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(measuredHeight + i10, heightMeasureSpec, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (isWidthMeasuredTooSmall) {
            iMin |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(androidx.constraintlayout.core.widgets.d layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i11 = iMax + iMax2;
        int iG = g();
        this.mMeasurer.c(widthMeasureSpec, heightMeasureSpec, iMax, iMax2, iG, i11);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                i10 = iMax4;
            }
            int i12 = size - iG;
            int i13 = size2 - i11;
            setSelfDimensionBehaviour(layout, mode, i12, mode2, i13);
            layout.Q2(optimizationLevel, mode, i12, mode2, i13, this.mLastMeasureWidth, this.mLastMeasureHeight, i10, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i10 = iMax3;
        int i122 = size - iG;
        int i132 = size2 - i11;
        setSelfDimensionBehaviour(layout, mode, i122, mode2, i132);
        layout.Q2(optimizationLevel, mode, i122, mode2, i132, this.mLastMeasureWidth, this.mLastMeasureHeight, i10, iMax);
    }

    public void setConstraintSet(d set) {
        this.mConstraintSet = set;
    }

    public void setDesignInformation(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) value1;
            int iIndexOf = strSubstring.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) value2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int id2) {
        this.mChildrenByIds.remove(getId());
        super.setId(id2);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int value) {
        if (value == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = value;
        requestLayout();
    }

    public void setMaxWidth(int value) {
        if (value == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = value;
        requestLayout();
    }

    public void setMinHeight(int value) {
        if (value == this.mMinHeight) {
            return;
        }
        this.mMinHeight = value;
        requestLayout();
    }

    public void setMinWidth(int value) {
        if (value == this.mMinWidth) {
            return;
        }
        this.mMinWidth = value;
        requestLayout();
    }

    public void setOnConstraintsChanged(f constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        androidx.constraintlayout.widget.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.d(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int level) {
        this.mOptimizationLevel = level;
        this.mLayoutWidget.V2(level);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = r7.mMeasurer
            int r1 = r0.f107764e
            int r0 = r0.f107763d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r5
            goto L38
        L1a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r5
            goto L5d
        L40:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.m0()
            if (r10 != r11) goto L69
            int r11 = r8.D()
            if (r12 == r11) goto L6c
        L69:
            r8.M2()
        L6c:
            r8.f2(r5)
            r8.g2(r5)
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            r8.M1(r11)
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r8.L1(r11)
            r8.P1(r5)
            r8.O1(r5)
            r8.D1(r9)
            r8.c2(r10)
            r8.Y1(r2)
            r8.y1(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            r8.P1(r9)
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            r8.O1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d, int, int, int, int):void");
    }

    public void setState(int id2, int screenWidth, int screenHeight) {
        androidx.constraintlayout.widget.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.e(id2, screenWidth, screenHeight);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p10) {
        return new LayoutParams(p10);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        i(attrs, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        i(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        i(attrs, defStyleAttr, defStyleRes);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public static final int f107599A0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public static final int f107600B0 = 0;

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public static final int f107601C0 = 1;

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public static final int f107602D0 = 1;

        /* JADX INFO: renamed from: E0, reason: collision with root package name */
        public static final int f107603E0 = 2;

        /* JADX INFO: renamed from: F0, reason: collision with root package name */
        public static final int f107604F0 = 3;

        /* JADX INFO: renamed from: G0, reason: collision with root package name */
        public static final int f107605G0 = 4;

        /* JADX INFO: renamed from: H0, reason: collision with root package name */
        public static final int f107606H0 = 5;

        /* JADX INFO: renamed from: I0, reason: collision with root package name */
        public static final int f107607I0 = 6;

        /* JADX INFO: renamed from: J0, reason: collision with root package name */
        public static final int f107608J0 = 7;

        /* JADX INFO: renamed from: K0, reason: collision with root package name */
        public static final int f107609K0 = 8;

        /* JADX INFO: renamed from: L0, reason: collision with root package name */
        public static final int f107610L0 = 1;

        /* JADX INFO: renamed from: M0, reason: collision with root package name */
        public static final int f107611M0 = 0;

        /* JADX INFO: renamed from: N0, reason: collision with root package name */
        public static final int f107612N0 = 2;

        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        public static final int f107613O0 = 0;

        /* JADX INFO: renamed from: P0, reason: collision with root package name */
        public static final int f107614P0 = 1;

        /* JADX INFO: renamed from: Q0, reason: collision with root package name */
        public static final int f107615Q0 = 2;

        /* JADX INFO: renamed from: R0, reason: collision with root package name */
        public static final int f107616R0 = 0;

        /* JADX INFO: renamed from: S0, reason: collision with root package name */
        public static final int f107617S0 = 1;

        /* JADX INFO: renamed from: T0, reason: collision with root package name */
        public static final int f107618T0 = 2;

        /* JADX INFO: renamed from: U0, reason: collision with root package name */
        public static final int f107619U0 = 3;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f107620x0 = 0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f107621y0 = 0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f107622z0 = -1;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f107623A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f107624B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f107625C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f107626D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f107627E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean f107628F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f107629G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f107630H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public String f107631I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f107632J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f107633K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f107634L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f107635M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f107636N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f107637O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f107638P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f107639Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f107640R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f107641S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f107642T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f107643U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public float f107644V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public float f107645W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f107646X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f107647Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f107648Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107649a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f107650a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f107651b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f107652b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f107653c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f107654c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f107655d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f107656d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f107657e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f107658e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f107659f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f107660f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f107661g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public boolean f107662g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f107663h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f107664h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f107665i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f107666i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f107667j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f107668j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f107669k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public boolean f107670k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f107671l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f107672l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f107673m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public int f107674m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f107675n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f107676n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f107677o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f107678o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f107679p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f107680p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f107681q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f107682q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f107683r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f107684r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f107685s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f107686s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f107687t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f107688t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f107689u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f107690u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f107691v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public ConstraintWidget f107692v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f107693w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f107694w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f107695x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f107696y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f107697z;

        public static class a {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public static final int f107698A = 26;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public static final int f107699B = 27;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public static final int f107700C = 28;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final int f107701D = 29;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            public static final int f107702E = 30;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            public static final int f107703F = 31;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            public static final int f107704G = 32;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            public static final int f107705H = 33;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            public static final int f107706I = 34;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            public static final int f107707J = 35;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            public static final int f107708K = 36;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            public static final int f107709L = 37;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            public static final int f107710M = 38;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            public static final int f107711N = 39;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final int f107712O = 40;

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            public static final int f107713P = 41;

            /* JADX INFO: renamed from: Q, reason: collision with root package name */
            public static final int f107714Q = 42;

            /* JADX INFO: renamed from: R, reason: collision with root package name */
            public static final int f107715R = 43;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            public static final int f107716S = 44;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            public static final int f107717T = 45;

            /* JADX INFO: renamed from: U, reason: collision with root package name */
            public static final int f107718U = 46;

            /* JADX INFO: renamed from: V, reason: collision with root package name */
            public static final int f107719V = 47;

            /* JADX INFO: renamed from: W, reason: collision with root package name */
            public static final int f107720W = 48;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            public static final int f107721X = 49;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final int f107722Y = 50;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            public static final int f107723Z = 51;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f107724a = 0;

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public static final int f107725a0 = 52;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f107726b = 1;

            /* JADX INFO: renamed from: b0, reason: collision with root package name */
            public static final int f107727b0 = 53;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f107728c = 2;

            /* JADX INFO: renamed from: c0, reason: collision with root package name */
            public static final int f107729c0 = 54;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f107730d = 3;

            /* JADX INFO: renamed from: d0, reason: collision with root package name */
            public static final int f107731d0 = 55;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f107732e = 4;

            /* JADX INFO: renamed from: e0, reason: collision with root package name */
            public static final int f107733e0 = 64;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f107734f = 5;

            /* JADX INFO: renamed from: f0, reason: collision with root package name */
            public static final int f107735f0 = 65;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f107736g = 6;

            /* JADX INFO: renamed from: g0, reason: collision with root package name */
            public static final int f107737g0 = 66;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f107738h = 7;

            /* JADX INFO: renamed from: h0, reason: collision with root package name */
            public static final int f107739h0 = 67;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f107740i = 8;

            /* JADX INFO: renamed from: i0, reason: collision with root package name */
            public static final SparseIntArray f107741i0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f107742j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f107743k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f107744l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f107745m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f107746n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f107747o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f107748p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f107749q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f107750r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f107751s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f107752t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final int f107753u = 20;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f107754v = 21;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f107755w = 22;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final int f107756x = 23;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f107757y = 24;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final int f107758z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f107741i0 = sparseIntArray;
                sparseIntArray.append(g.m.f110474t8, 64);
                sparseIntArray.append(g.m.f110130W7, 65);
                sparseIntArray.append(g.m.f110262f8, 8);
                sparseIntArray.append(g.m.f110277g8, 9);
                sparseIntArray.append(g.m.f110307i8, 10);
                sparseIntArray.append(g.m.f110324j8, 11);
                sparseIntArray.append(g.m.f110414p8, 12);
                sparseIntArray.append(g.m.f110399o8, 13);
                sparseIntArray.append(g.m.f109983M7, 14);
                sparseIntArray.append(g.m.f109968L7, 15);
                sparseIntArray.append(g.m.f109908H7, 16);
                sparseIntArray.append(g.m.f109938J7, 52);
                sparseIntArray.append(g.m.f109923I7, 53);
                sparseIntArray.append(g.m.f109998N7, 2);
                sparseIntArray.append(g.m.f110028P7, 3);
                sparseIntArray.append(g.m.f110013O7, 4);
                sparseIntArray.append(g.m.f110549y8, 49);
                sparseIntArray.append(g.m.f110564z8, 50);
                sparseIntArray.append(g.m.f110088T7, 5);
                sparseIntArray.append(g.m.f110102U7, 6);
                sparseIntArray.append(g.m.f110116V7, 7);
                sparseIntArray.append(g.m.f109833C7, 67);
                sparseIntArray.append(g.m.f110562z6, 1);
                sparseIntArray.append(g.m.f110339k8, 17);
                sparseIntArray.append(g.m.f110354l8, 18);
                sparseIntArray.append(g.m.f110073S7, 19);
                sparseIntArray.append(g.m.f110058R7, 20);
                sparseIntArray.append(g.m.f109849D8, 21);
                sparseIntArray.append(g.m.f109894G8, 22);
                sparseIntArray.append(g.m.f109864E8, 23);
                sparseIntArray.append(g.m.f109819B8, 24);
                sparseIntArray.append(g.m.f109879F8, 25);
                sparseIntArray.append(g.m.f109834C8, 26);
                sparseIntArray.append(g.m.f109804A8, 55);
                sparseIntArray.append(g.m.f109909H8, 54);
                sparseIntArray.append(g.m.f110202b8, 29);
                sparseIntArray.append(g.m.f110429q8, 30);
                sparseIntArray.append(g.m.f110043Q7, 44);
                sparseIntArray.append(g.m.f110232d8, 45);
                sparseIntArray.append(g.m.f110459s8, 46);
                sparseIntArray.append(g.m.f110217c8, 47);
                sparseIntArray.append(g.m.f110444r8, 48);
                sparseIntArray.append(g.m.f109878F7, 27);
                sparseIntArray.append(g.m.f109863E7, 28);
                sparseIntArray.append(g.m.f110489u8, 31);
                sparseIntArray.append(g.m.f110144X7, 32);
                sparseIntArray.append(g.m.f110519w8, 33);
                sparseIntArray.append(g.m.f110504v8, 34);
                sparseIntArray.append(g.m.f110534x8, 35);
                sparseIntArray.append(g.m.f110172Z7, 36);
                sparseIntArray.append(g.m.f110158Y7, 37);
                sparseIntArray.append(g.m.f110187a8, 38);
                sparseIntArray.append(g.m.f110247e8, 39);
                sparseIntArray.append(g.m.f110384n8, 40);
                sparseIntArray.append(g.m.f110292h8, 41);
                sparseIntArray.append(g.m.f109953K7, 42);
                sparseIntArray.append(g.m.f109893G7, 43);
                sparseIntArray.append(g.m.f110369m8, 51);
                sparseIntArray.append(g.m.f109939J8, 66);
            }
        }

        public LayoutParams(LayoutParams source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f107649a = -1;
            this.f107651b = -1;
            this.f107653c = -1.0f;
            this.f107655d = true;
            this.f107657e = -1;
            this.f107659f = -1;
            this.f107661g = -1;
            this.f107663h = -1;
            this.f107665i = -1;
            this.f107667j = -1;
            this.f107669k = -1;
            this.f107671l = -1;
            this.f107673m = -1;
            this.f107675n = -1;
            this.f107677o = -1;
            this.f107679p = -1;
            this.f107681q = 0;
            this.f107683r = 0.0f;
            this.f107685s = -1;
            this.f107687t = -1;
            this.f107689u = -1;
            this.f107691v = -1;
            this.f107693w = Integer.MIN_VALUE;
            this.f107695x = Integer.MIN_VALUE;
            this.f107696y = Integer.MIN_VALUE;
            this.f107697z = Integer.MIN_VALUE;
            this.f107623A = Integer.MIN_VALUE;
            this.f107624B = Integer.MIN_VALUE;
            this.f107625C = Integer.MIN_VALUE;
            this.f107626D = 0;
            this.f107627E = true;
            this.f107628F = true;
            this.f107629G = 0.5f;
            this.f107630H = 0.5f;
            this.f107631I = null;
            this.f107632J = 0.0f;
            this.f107633K = 1;
            this.f107634L = -1.0f;
            this.f107635M = -1.0f;
            this.f107636N = 0;
            this.f107637O = 0;
            this.f107638P = 0;
            this.f107639Q = 0;
            this.f107640R = 0;
            this.f107641S = 0;
            this.f107642T = 0;
            this.f107643U = 0;
            this.f107644V = 1.0f;
            this.f107645W = 1.0f;
            this.f107646X = -1;
            this.f107647Y = -1;
            this.f107648Z = -1;
            this.f107650a0 = false;
            this.f107652b0 = false;
            this.f107654c0 = null;
            this.f107656d0 = 0;
            this.f107658e0 = true;
            this.f107660f0 = true;
            this.f107662g0 = false;
            this.f107664h0 = false;
            this.f107666i0 = false;
            this.f107668j0 = false;
            this.f107670k0 = false;
            this.f107672l0 = -1;
            this.f107674m0 = -1;
            this.f107676n0 = -1;
            this.f107678o0 = -1;
            this.f107680p0 = Integer.MIN_VALUE;
            this.f107682q0 = Integer.MIN_VALUE;
            this.f107684r0 = 0.5f;
            this.f107692v0 = new ConstraintWidget();
            this.f107694w0 = false;
            this.f107649a = source.f107649a;
            this.f107651b = source.f107651b;
            this.f107653c = source.f107653c;
            this.f107655d = source.f107655d;
            this.f107657e = source.f107657e;
            this.f107659f = source.f107659f;
            this.f107661g = source.f107661g;
            this.f107663h = source.f107663h;
            this.f107665i = source.f107665i;
            this.f107667j = source.f107667j;
            this.f107669k = source.f107669k;
            this.f107671l = source.f107671l;
            this.f107673m = source.f107673m;
            this.f107675n = source.f107675n;
            this.f107677o = source.f107677o;
            this.f107679p = source.f107679p;
            this.f107681q = source.f107681q;
            this.f107683r = source.f107683r;
            this.f107685s = source.f107685s;
            this.f107687t = source.f107687t;
            this.f107689u = source.f107689u;
            this.f107691v = source.f107691v;
            this.f107693w = source.f107693w;
            this.f107695x = source.f107695x;
            this.f107696y = source.f107696y;
            this.f107697z = source.f107697z;
            this.f107623A = source.f107623A;
            this.f107624B = source.f107624B;
            this.f107625C = source.f107625C;
            this.f107626D = source.f107626D;
            this.f107629G = source.f107629G;
            this.f107630H = source.f107630H;
            this.f107631I = source.f107631I;
            this.f107632J = source.f107632J;
            this.f107633K = source.f107633K;
            this.f107634L = source.f107634L;
            this.f107635M = source.f107635M;
            this.f107636N = source.f107636N;
            this.f107637O = source.f107637O;
            this.f107650a0 = source.f107650a0;
            this.f107652b0 = source.f107652b0;
            this.f107638P = source.f107638P;
            this.f107639Q = source.f107639Q;
            this.f107640R = source.f107640R;
            this.f107642T = source.f107642T;
            this.f107641S = source.f107641S;
            this.f107643U = source.f107643U;
            this.f107644V = source.f107644V;
            this.f107645W = source.f107645W;
            this.f107646X = source.f107646X;
            this.f107647Y = source.f107647Y;
            this.f107648Z = source.f107648Z;
            this.f107658e0 = source.f107658e0;
            this.f107660f0 = source.f107660f0;
            this.f107662g0 = source.f107662g0;
            this.f107664h0 = source.f107664h0;
            this.f107672l0 = source.f107672l0;
            this.f107674m0 = source.f107674m0;
            this.f107676n0 = source.f107676n0;
            this.f107678o0 = source.f107678o0;
            this.f107680p0 = source.f107680p0;
            this.f107682q0 = source.f107682q0;
            this.f107684r0 = source.f107684r0;
            this.f107654c0 = source.f107654c0;
            this.f107656d0 = source.f107656d0;
            this.f107692v0 = source.f107692v0;
            this.f107627E = source.f107627E;
            this.f107628F = source.f107628F;
        }

        public String a() {
            return this.f107654c0;
        }

        public ConstraintWidget b() {
            return this.f107692v0;
        }

        public void c() {
            ConstraintWidget constraintWidget = this.f107692v0;
            if (constraintWidget != null) {
                constraintWidget.R0();
            }
        }

        public void d(String text) {
            this.f107692v0.j1(text);
        }

        public void e() {
            this.f107664h0 = false;
            this.f107658e0 = true;
            this.f107660f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f107650a0) {
                this.f107658e0 = false;
                if (this.f107638P == 0) {
                    this.f107638P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f107652b0) {
                this.f107660f0 = false;
                if (this.f107639Q == 0) {
                    this.f107639Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f107658e0 = false;
                if (i10 == 0 && this.f107638P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f107650a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f107660f0 = false;
                if (i11 == 0 && this.f107639Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f107652b0 = true;
                }
            }
            if (this.f107653c == -1.0f && this.f107649a == -1 && this.f107651b == -1) {
                return;
            }
            this.f107664h0 = true;
            this.f107658e0 = true;
            this.f107660f0 = true;
            if (!(this.f107692v0 instanceof androidx.constraintlayout.core.widgets.f)) {
                this.f107692v0 = new androidx.constraintlayout.core.widgets.f();
            }
            ((androidx.constraintlayout.core.widgets.f) this.f107692v0).B2(this.f107648Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(Context c10, AttributeSet attrs) {
            super(c10, attrs);
            this.f107649a = -1;
            this.f107651b = -1;
            this.f107653c = -1.0f;
            this.f107655d = true;
            this.f107657e = -1;
            this.f107659f = -1;
            this.f107661g = -1;
            this.f107663h = -1;
            this.f107665i = -1;
            this.f107667j = -1;
            this.f107669k = -1;
            this.f107671l = -1;
            this.f107673m = -1;
            this.f107675n = -1;
            this.f107677o = -1;
            this.f107679p = -1;
            this.f107681q = 0;
            this.f107683r = 0.0f;
            this.f107685s = -1;
            this.f107687t = -1;
            this.f107689u = -1;
            this.f107691v = -1;
            this.f107693w = Integer.MIN_VALUE;
            this.f107695x = Integer.MIN_VALUE;
            this.f107696y = Integer.MIN_VALUE;
            this.f107697z = Integer.MIN_VALUE;
            this.f107623A = Integer.MIN_VALUE;
            this.f107624B = Integer.MIN_VALUE;
            this.f107625C = Integer.MIN_VALUE;
            this.f107626D = 0;
            this.f107627E = true;
            this.f107628F = true;
            this.f107629G = 0.5f;
            this.f107630H = 0.5f;
            this.f107631I = null;
            this.f107632J = 0.0f;
            this.f107633K = 1;
            this.f107634L = -1.0f;
            this.f107635M = -1.0f;
            this.f107636N = 0;
            this.f107637O = 0;
            this.f107638P = 0;
            this.f107639Q = 0;
            this.f107640R = 0;
            this.f107641S = 0;
            this.f107642T = 0;
            this.f107643U = 0;
            this.f107644V = 1.0f;
            this.f107645W = 1.0f;
            this.f107646X = -1;
            this.f107647Y = -1;
            this.f107648Z = -1;
            this.f107650a0 = false;
            this.f107652b0 = false;
            this.f107654c0 = null;
            this.f107656d0 = 0;
            this.f107658e0 = true;
            this.f107660f0 = true;
            this.f107662g0 = false;
            this.f107664h0 = false;
            this.f107666i0 = false;
            this.f107668j0 = false;
            this.f107670k0 = false;
            this.f107672l0 = -1;
            this.f107674m0 = -1;
            this.f107676n0 = -1;
            this.f107678o0 = -1;
            this.f107680p0 = Integer.MIN_VALUE;
            this.f107682q0 = Integer.MIN_VALUE;
            this.f107684r0 = 0.5f;
            this.f107692v0 = new ConstraintWidget();
            this.f107694w0 = false;
            TypedArray typedArrayObtainStyledAttributes = c10.obtainStyledAttributes(attrs, g.m.f110547y6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f107741i0.get(index);
                switch (i11) {
                    case 1:
                        this.f107648Z = typedArrayObtainStyledAttributes.getInt(index, this.f107648Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f107679p);
                        this.f107679p = resourceId;
                        if (resourceId == -1) {
                            this.f107679p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f107681q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107681q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f107683r) % 360.0f;
                        this.f107683r = f10;
                        if (f10 < 0.0f) {
                            this.f107683r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f107649a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f107649a);
                        break;
                    case 6:
                        this.f107651b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f107651b);
                        break;
                    case 7:
                        this.f107653c = typedArrayObtainStyledAttributes.getFloat(index, this.f107653c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107657e);
                        this.f107657e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f107657e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107659f);
                        this.f107659f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f107659f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107661g);
                        this.f107661g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f107661g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107663h);
                        this.f107663h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f107663h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107665i);
                        this.f107665i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f107665i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107667j);
                        this.f107667j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f107667j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107669k);
                        this.f107669k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f107669k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107671l);
                        this.f107671l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f107671l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107673m);
                        this.f107673m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f107673m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107685s);
                        this.f107685s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f107685s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107687t);
                        this.f107687t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f107687t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107689u);
                        this.f107689u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f107689u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107691v);
                        this.f107691v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f107691v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f107693w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107693w);
                        break;
                    case 22:
                        this.f107695x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107695x);
                        break;
                    case 23:
                        this.f107696y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107696y);
                        break;
                    case 24:
                        this.f107697z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107697z);
                        break;
                    case 25:
                        this.f107623A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107623A);
                        break;
                    case 26:
                        this.f107624B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107624B);
                        break;
                    case 27:
                        this.f107650a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f107650a0);
                        break;
                    case 28:
                        this.f107652b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f107652b0);
                        break;
                    case 29:
                        this.f107629G = typedArrayObtainStyledAttributes.getFloat(index, this.f107629G);
                        break;
                    case 30:
                        this.f107630H = typedArrayObtainStyledAttributes.getFloat(index, this.f107630H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f107638P = i12;
                        if (i12 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f107639Q = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f107640R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107640R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f107640R) == -2) {
                                this.f107640R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f107642T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107642T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f107642T) == -2) {
                                this.f107642T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f107644V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f107644V));
                        this.f107638P = 2;
                        break;
                    case 36:
                        try {
                            this.f107641S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107641S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f107641S) == -2) {
                                this.f107641S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f107643U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107643U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f107643U) == -2) {
                                this.f107643U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f107645W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f107645W));
                        this.f107639Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                d.C0(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f107634L = typedArrayObtainStyledAttributes.getFloat(index, this.f107634L);
                                break;
                            case 46:
                                this.f107635M = typedArrayObtainStyledAttributes.getFloat(index, this.f107635M);
                                break;
                            case 47:
                                this.f107636N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f107637O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f107646X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f107646X);
                                break;
                            case 50:
                                this.f107647Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f107647Y);
                                break;
                            case 51:
                                this.f107654c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107675n);
                                this.f107675n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f107675n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f107677o);
                                this.f107677o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f107677o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f107626D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107626D);
                                break;
                            case 55:
                                this.f107625C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f107625C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.A0(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f107627E = true;
                                        break;
                                    case 65:
                                        d.A0(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f107628F = true;
                                        break;
                                    case 66:
                                        this.f107656d0 = typedArrayObtainStyledAttributes.getInt(index, this.f107656d0);
                                        break;
                                    case 67:
                                        this.f107655d = typedArrayObtainStyledAttributes.getBoolean(index, this.f107655d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            e();
        }

        public LayoutParams(int width, int height) {
            super(width, height);
            this.f107649a = -1;
            this.f107651b = -1;
            this.f107653c = -1.0f;
            this.f107655d = true;
            this.f107657e = -1;
            this.f107659f = -1;
            this.f107661g = -1;
            this.f107663h = -1;
            this.f107665i = -1;
            this.f107667j = -1;
            this.f107669k = -1;
            this.f107671l = -1;
            this.f107673m = -1;
            this.f107675n = -1;
            this.f107677o = -1;
            this.f107679p = -1;
            this.f107681q = 0;
            this.f107683r = 0.0f;
            this.f107685s = -1;
            this.f107687t = -1;
            this.f107689u = -1;
            this.f107691v = -1;
            this.f107693w = Integer.MIN_VALUE;
            this.f107695x = Integer.MIN_VALUE;
            this.f107696y = Integer.MIN_VALUE;
            this.f107697z = Integer.MIN_VALUE;
            this.f107623A = Integer.MIN_VALUE;
            this.f107624B = Integer.MIN_VALUE;
            this.f107625C = Integer.MIN_VALUE;
            this.f107626D = 0;
            this.f107627E = true;
            this.f107628F = true;
            this.f107629G = 0.5f;
            this.f107630H = 0.5f;
            this.f107631I = null;
            this.f107632J = 0.0f;
            this.f107633K = 1;
            this.f107634L = -1.0f;
            this.f107635M = -1.0f;
            this.f107636N = 0;
            this.f107637O = 0;
            this.f107638P = 0;
            this.f107639Q = 0;
            this.f107640R = 0;
            this.f107641S = 0;
            this.f107642T = 0;
            this.f107643U = 0;
            this.f107644V = 1.0f;
            this.f107645W = 1.0f;
            this.f107646X = -1;
            this.f107647Y = -1;
            this.f107648Z = -1;
            this.f107650a0 = false;
            this.f107652b0 = false;
            this.f107654c0 = null;
            this.f107656d0 = 0;
            this.f107658e0 = true;
            this.f107660f0 = true;
            this.f107662g0 = false;
            this.f107664h0 = false;
            this.f107666i0 = false;
            this.f107668j0 = false;
            this.f107670k0 = false;
            this.f107672l0 = -1;
            this.f107674m0 = -1;
            this.f107676n0 = -1;
            this.f107678o0 = -1;
            this.f107680p0 = Integer.MIN_VALUE;
            this.f107682q0 = Integer.MIN_VALUE;
            this.f107684r0 = 0.5f;
            this.f107692v0 = new ConstraintWidget();
            this.f107694w0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
            this.f107649a = -1;
            this.f107651b = -1;
            this.f107653c = -1.0f;
            this.f107655d = true;
            this.f107657e = -1;
            this.f107659f = -1;
            this.f107661g = -1;
            this.f107663h = -1;
            this.f107665i = -1;
            this.f107667j = -1;
            this.f107669k = -1;
            this.f107671l = -1;
            this.f107673m = -1;
            this.f107675n = -1;
            this.f107677o = -1;
            this.f107679p = -1;
            this.f107681q = 0;
            this.f107683r = 0.0f;
            this.f107685s = -1;
            this.f107687t = -1;
            this.f107689u = -1;
            this.f107691v = -1;
            this.f107693w = Integer.MIN_VALUE;
            this.f107695x = Integer.MIN_VALUE;
            this.f107696y = Integer.MIN_VALUE;
            this.f107697z = Integer.MIN_VALUE;
            this.f107623A = Integer.MIN_VALUE;
            this.f107624B = Integer.MIN_VALUE;
            this.f107625C = Integer.MIN_VALUE;
            this.f107626D = 0;
            this.f107627E = true;
            this.f107628F = true;
            this.f107629G = 0.5f;
            this.f107630H = 0.5f;
            this.f107631I = null;
            this.f107632J = 0.0f;
            this.f107633K = 1;
            this.f107634L = -1.0f;
            this.f107635M = -1.0f;
            this.f107636N = 0;
            this.f107637O = 0;
            this.f107638P = 0;
            this.f107639Q = 0;
            this.f107640R = 0;
            this.f107641S = 0;
            this.f107642T = 0;
            this.f107643U = 0;
            this.f107644V = 1.0f;
            this.f107645W = 1.0f;
            this.f107646X = -1;
            this.f107647Y = -1;
            this.f107648Z = -1;
            this.f107650a0 = false;
            this.f107652b0 = false;
            this.f107654c0 = null;
            this.f107656d0 = 0;
            this.f107658e0 = true;
            this.f107660f0 = true;
            this.f107662g0 = false;
            this.f107664h0 = false;
            this.f107666i0 = false;
            this.f107668j0 = false;
            this.f107670k0 = false;
            this.f107672l0 = -1;
            this.f107674m0 = -1;
            this.f107676n0 = -1;
            this.f107678o0 = -1;
            this.f107680p0 = Integer.MIN_VALUE;
            this.f107682q0 = Integer.MIN_VALUE;
            this.f107684r0 = 0.5f;
            this.f107692v0 = new ConstraintWidget();
            this.f107694w0 = false;
        }
    }
}
