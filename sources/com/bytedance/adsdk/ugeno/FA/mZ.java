package com.bytedance.adsdk.ugeno.FA;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.compose.runtime.V1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends ViewGroup {
    private VelocityTracker AK;
    private float Cox;
    private final NOt FA;
    private int GC;
    private boolean Gis;
    private List<uR> HX;
    private float Ho;
    private int Hvv;
    private int IOC;
    private int IZ;
    private boolean Jem;
    private boolean MR;
    private List<Object> MU;
    private final ArrayList<NOt> Mm;
    private EdgeEffect NBW;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private boolean f140636Nb;
    private EdgeEffect Nl;
    private int Np;
    private float OCA;
    private int Qg;
    private boolean VdW;
    private final Rect Vor;
    private int Vr;
    private int WD;
    private Drawable WMI;
    private float Yx;
    private Parcelable ZH;
    private uR ZRJ;
    private int ZRu;
    private int Zf;
    private int aT;
    private int bO;
    private boolean edo;
    private int fWk;
    private int fcs;
    private float gI;
    private int gX;
    private final Runnable gaw;
    private uR gmt;
    private boolean le;
    private ClassLoader lp;
    com.bytedance.adsdk.ugeno.FA.NOt mZ;
    private boolean nqR;
    private Ht oK;
    private int om;
    private int qF;
    private boolean ru;
    private Scroller sAl;
    private int th;
    private float to;
    int uR;
    private ArrayList<View> vE;
    private int xY;
    private int yBV;
    private TFq yM;
    private boolean yz;
    static final int[] NOt = {R.attr.layout_gravity};
    private static final Comparator<NOt> TFq = new Comparator<NOt>() { // from class: com.bytedance.adsdk.ugeno.FA.mZ.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int compare(NOt nOt, NOt nOt2) {
            return nOt.NOt - nOt2.NOt;
        }
    };
    private static final Interpolator Ht = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.FA.mZ.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };

    /* JADX INFO: renamed from: Oc, reason: collision with root package name */
    private static final FA f140635Oc = new FA();

    public static class FA implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0386mZ c0386mZ = (C0386mZ) view.getLayoutParams();
            C0386mZ c0386mZ2 = (C0386mZ) view2.getLayoutParams();
            boolean z10 = c0386mZ.ZRu;
            return z10 != c0386mZ2.ZRu ? z10 ? 1 : -1 : c0386mZ.TFq - c0386mZ2.TFq;
        }
    }

    public class Ht extends DataSetObserver {
        public Ht() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            mZ.this.NOt();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            mZ.this.NOt();
        }
    }

    public static class Mm extends com.bytedance.adsdk.ugeno.FA.ZRu {
        public static final Parcelable.Creator<Mm> CREATOR = new Parcelable.ClassLoaderCreator<Mm>() { // from class: com.bytedance.adsdk.ugeno.FA.mZ.Mm.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Mm createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Mm(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Mm createFromParcel(Parcel parcel) {
                return new Mm(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Mm[] newArray(int i10) {
                return new Mm[i10];
            }
        };
        int NOt;
        Parcelable mZ;
        ClassLoader uR;

        public Mm(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return d.a(sb2, this.NOt, "}");
        }

        @Override // com.bytedance.adsdk.ugeno.FA.ZRu, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.NOt);
            parcel.writeParcelable(this.mZ, i10);
        }

        public Mm(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.NOt = parcel.readInt();
            this.mZ = parcel.readParcelable(classLoader);
            this.uR = classLoader;
        }
    }

    public static class NOt {
        int NOt;
        float TFq;
        Object ZRu;
        boolean mZ;
        float uR;
    }

    public interface TFq {
        void ZRu(View view, float f10);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ZRu {
    }

    public interface uR {
        void FA(int i10);

        void ZRu(int i10, float f10, int i11);
    }

    public mZ(Context context) {
        super(context);
        this.Mm = new ArrayList<>();
        this.FA = new NOt();
        this.Vor = new Rect();
        this.aT = -1;
        this.ZH = null;
        this.lp = null;
        this.OCA = -3.4028235E38f;
        this.to = Float.MAX_VALUE;
        this.fcs = 1;
        this.bO = -1;
        this.yz = true;
        this.Jem = false;
        this.gaw = new Runnable() { // from class: com.bytedance.adsdk.ugeno.FA.mZ.3
            @Override // java.lang.Runnable
            public void run() {
                mZ.this.setScrollState(0);
                mZ.this.mZ();
            }
        };
        this.IOC = 0;
        ZRu();
    }

    private boolean FA() {
        this.bO = -1;
        aT();
        this.NBW.onRelease();
        this.Nl.onRelease();
        return this.NBW.isFinished() || this.Nl.isFinished();
    }

    private void Ht() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0386mZ) getChildAt(i10).getLayoutParams()).ZRu) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void Mm() {
        if (this.GC != 0) {
            ArrayList<View> arrayList = this.vE;
            if (arrayList == null) {
                this.vE = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.vE.add(getChildAt(i10));
            }
            Collections.sort(this.vE, f140635Oc);
        }
    }

    private void TFq(int i10) {
        uR uRVar = this.gmt;
        if (uRVar != null) {
            uRVar.FA(i10);
        }
        List<uR> list = this.HX;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                uR uRVar2 = this.HX.get(i11);
                if (uRVar2 != null) {
                    uRVar2.FA(i10);
                }
            }
        }
        uR uRVar3 = this.ZRJ;
        if (uRVar3 != null) {
            uRVar3.FA(i10);
        }
    }

    private NOt Vor() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.yBV / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        NOt nOt = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.Mm.size()) {
            NOt nOt2 = this.Mm.get(i11);
            if (!z10 && nOt2.NOt != (i10 = i12 + 1)) {
                nOt2 = this.FA;
                nOt2.TFq = f10 + f12 + f11;
                nOt2.NOt = i10;
                nOt2.uR = this.mZ.ZRu(i10);
                i11--;
            }
            NOt nOt3 = nOt2;
            f10 = nOt3.TFq;
            float f13 = nOt3.uR + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.Mm.size() - 1) {
                return nOt3;
            }
            int i13 = nOt3.NOt;
            float f14 = nOt3.uR;
            i11++;
            i12 = i13;
            f12 = f14;
            nOt = nOt3;
            z10 = false;
        }
        return nOt;
    }

    private void aT() {
        this.f140636Nb = false;
        this.VdW = false;
        VelocityTracker velocityTracker = this.AK;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.AK = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.le != z10) {
            this.le = z10;
        }
    }

    private boolean uR(int i10) {
        if (this.Mm.size() == 0) {
            if (this.yz) {
                return false;
            }
            this.Gis = false;
            ZRu(0, 0.0f, 0);
            if (this.Gis) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        NOt nOtVor = Vor();
        int clientWidth = getClientWidth();
        int i11 = this.yBV;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = nOtVor.NOt;
        float f11 = ((i10 / f10) - nOtVor.TFq) / (nOtVor.uR + (i11 / f10));
        this.Gis = false;
        ZRu(i13, f11, (int) (i12 * f11));
        if (this.Gis) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public void NOt() {
        int iZRu = this.mZ.ZRu();
        this.ZRu = iZRu;
        boolean z10 = this.Mm.size() < (this.fcs * 2) + 1 && this.Mm.size() < iZRu;
        int iMax = this.uR;
        int i10 = 0;
        while (i10 < this.Mm.size()) {
            NOt nOt = this.Mm.get(i10);
            int iZRu2 = this.mZ.ZRu(nOt.ZRu);
            if (iZRu2 != -1) {
                if (iZRu2 == -2) {
                    this.Mm.remove(i10);
                    i10--;
                    this.mZ.ZRu((ViewGroup) this, nOt.NOt, nOt.ZRu);
                    int i11 = this.uR;
                    if (i11 == nOt.NOt) {
                        iMax = Math.max(0, Math.min(i11, iZRu - 1));
                    }
                } else {
                    int i12 = nOt.NOt;
                    if (i12 != iZRu2) {
                        if (i12 == this.uR) {
                            iMax = iZRu2;
                        }
                        nOt.NOt = iZRu2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.Mm, TFq);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0386mZ c0386mZ = (C0386mZ) getChildAt(i13).getLayoutParams();
                if (!c0386mZ.ZRu) {
                    c0386mZ.mZ = 0.0f;
                }
            }
            ZRu(iMax, false, true);
            requestLayout();
        }
    }

    public void ZRu() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.sAl = new Scroller(context, Ht);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.fWk = viewConfiguration.getScaledPagingTouchSlop();
        this.Vr = (int) (400.0f * f10);
        this.Qg = viewConfiguration.getScaledMaximumFlingVelocity();
        this.NBW = new EdgeEffect(context);
        this.Nl = new EdgeEffect(context);
        this.Hvv = (int) (25.0f * f10);
        this.IZ = (int) (2.0f * f10);
        this.th = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        NOt nOtZRu;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (nOtZRu = ZRu(childAt)) != null && nOtZRu.NOt == this.uR) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        NOt nOtZRu;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (nOtZRu = ZRu(childAt)) != null && nOtZRu.NOt == this.uR) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0386mZ c0386mZ = (C0386mZ) layoutParams;
        boolean zMZ = c0386mZ.ZRu | mZ(view);
        c0386mZ.ZRu = zMZ;
        if (!this.ru) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zMZ) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0386mZ.uR = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.mZ == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.OCA)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.to));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0386mZ) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.edo = true;
        if (this.sAl.isFinished() || !this.sAl.computeScrollOffset()) {
            ZRu(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.sAl.getCurrX();
        int currY = this.sAl.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!uR(currX)) {
                this.sAl.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || ZRu(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        NOt nOtZRu;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (nOtZRu = ZRu(childAt)) != null && nOtZRu.NOt == this.uR && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.FA.NOt nOt;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (nOt = this.mZ) != null && nOt.ZRu() > 1)) {
            if (!this.NBW.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.OCA * width);
                this.NBW.setSize(height, width);
                zDraw = this.NBW.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Nl.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.to + 1.0f)) * width2);
                this.Nl.setSize(height2, width2);
                zDraw |= this.Nl.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.NBW.finish();
            this.Nl.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.WMI;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0386mZ();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.FA.NOt getAdapter() {
        return this.mZ;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.GC == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0386mZ) this.vE.get(i11).getLayoutParams()).Ht;
    }

    public int getCurrentItem() {
        return this.uR;
    }

    public int getOffscreenPageLimit() {
        return this.fcs;
    }

    public int getPageMargin() {
        return this.yBV;
    }

    public void mZ() {
        ZRu(this.uR);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.yz = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.gaw);
        Scroller scroller = this.sAl;
        if (scroller != null && !scroller.isFinished()) {
            this.sAl.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.yBV <= 0 || this.WMI == null || this.Mm.size() <= 0 || this.mZ == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.yBV / width;
        int i12 = 0;
        NOt nOt = this.Mm.get(0);
        float f12 = nOt.TFq;
        int size = this.Mm.size();
        int i13 = nOt.NOt;
        int i14 = this.Mm.get(size - 1).NOt;
        while (i13 < i14) {
            while (true) {
                i10 = nOt.NOt;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                nOt = this.Mm.get(i12);
            }
            if (i13 == i10) {
                float f13 = nOt.TFq;
                float f14 = nOt.uR;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fZRu = this.mZ.ZRu(i13);
                f10 = (f12 + fZRu) * width;
                f12 = fZRu + f11 + f12;
            }
            if (this.yBV + f10 > scrollX) {
                i11 = scrollX;
                this.WMI.setBounds(Math.round(f10), this.qF, Math.round(this.yBV + f10), this.om);
                this.WMI.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            FA();
            return false;
        }
        if (action != 0) {
            if (this.f140636Nb) {
                return true;
            }
            if (this.VdW) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.gI = x10;
            this.Yx = x10;
            float y10 = motionEvent.getY();
            this.Ho = y10;
            this.Cox = y10;
            this.bO = motionEvent.getPointerId(0);
            this.VdW = false;
            this.edo = true;
            this.sAl.computeScrollOffset();
            if (this.IOC != 2 || Math.abs(this.sAl.getFinalX() - this.sAl.getCurrX()) <= this.IZ) {
                ZRu(false);
                this.f140636Nb = false;
            } else {
                this.sAl.abortAnimation();
                this.MR = false;
                mZ();
                this.f140636Nb = true;
                mZ(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.bO;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.Yx;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.Ho);
                if (f10 != 0.0f && !ZRu(this.Yx, f10) && ZRu(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.Yx = x11;
                    this.Cox = y11;
                    this.VdW = true;
                    return false;
                }
                int i11 = this.fWk;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f140636Nb = true;
                    mZ(true);
                    setScrollState(1);
                    float f11 = this.gI;
                    float f12 = this.fWk;
                    this.Yx = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.Cox = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.VdW = true;
                }
                if (this.f140636Nb && NOt(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            ZRu(motionEvent);
        }
        if (this.AK == null) {
            this.AK = VelocityTracker.obtain();
        }
        this.AK.addMovement(motionEvent);
        return this.f140636Nb;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.FA.mZ.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C0386mZ c0386mZ;
        C0386mZ c0386mZ2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.WD = Math.min(measuredWidth / 10, this.th);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0386mZ2 = (C0386mZ) childAt.getLayoutParams()) != null && c0386mZ2.ZRu) {
                int i15 = c0386mZ2.NOt;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0386mZ2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0386mZ2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.xY = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.Zf = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.ru = true;
        mZ();
        this.ru = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0386mZ = (C0386mZ) childAt2.getLayoutParams()) == null || !c0386mZ.ZRu)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0386mZ.mZ), 1073741824), this.Zf);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        NOt nOtZRu;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (nOtZRu = ZRu(childAt)) != null && nOtZRu.NOt == this.uR && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Mm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Mm mm = (Mm) parcelable;
        super.onRestoreInstanceState(mm.ZRu());
        if (this.mZ != null) {
            ZRu(mm.NOt, false, true);
            return;
        }
        this.aT = mm.NOt;
        this.ZH = mm.mZ;
        this.lp = mm.uR;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Mm mm = new Mm(super.onSaveInstanceState());
        mm.NOt = this.uR;
        com.bytedance.adsdk.ugeno.FA.NOt nOt = this.mZ;
        if (nOt != null) {
            mm.mZ = nOt.NOt();
        }
        return mm;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.yBV;
            ZRu(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.FA.NOt nOt;
        int iFindPointerIndex;
        if (this.nqR) {
            return true;
        }
        boolean zFA = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (nOt = this.mZ) == null || nOt.ZRu() == 0) {
            return false;
        }
        if (this.AK == null) {
            this.AK = VelocityTracker.obtain();
        }
        this.AK.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.sAl.abortAnimation();
            this.MR = false;
            mZ();
            float x10 = motionEvent.getX();
            this.gI = x10;
            this.Yx = x10;
            float y10 = motionEvent.getY();
            this.Ho = y10;
            this.Cox = y10;
            this.bO = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.Yx = motionEvent.getX(actionIndex);
                            this.bO = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        ZRu(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.bO);
                        if (iFindPointerIndex2 != -1) {
                            this.Yx = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f140636Nb) {
                    ZRu(this.uR, true, 0, false);
                    zFA = FA();
                }
            } else if (!this.f140636Nb) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.bO);
                if (iFindPointerIndex3 == -1) {
                    zFA = FA();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.Yx);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.Cox);
                    if (fAbs > this.fWk && fAbs > fAbs2) {
                        this.f140636Nb = true;
                        mZ(true);
                        float f10 = this.gI;
                        this.Yx = x11 - f10 > 0.0f ? f10 + this.fWk : f10 - this.fWk;
                        this.Cox = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f140636Nb) {
                        zFA = NOt(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f140636Nb && (iFindPointerIndex = motionEvent.findPointerIndex(this.bO)) != -1) {
                zFA = NOt(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f140636Nb) {
            VelocityTracker velocityTracker = this.AK;
            velocityTracker.computeCurrentVelocity(1000, this.Qg);
            int xVelocity = (int) velocityTracker.getXVelocity(this.bO);
            this.MR = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            NOt nOtVor = Vor();
            float f11 = clientWidth;
            int i10 = nOtVor.NOt;
            float f12 = ((scrollX / f11) - nOtVor.TFq) / (nOtVor.uR + (this.yBV / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.bO);
            if (iFindPointerIndex4 != -1) {
                ZRu(ZRu(i10, f12, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.gI)), true, true, xVelocity);
                zFA = FA();
            }
        }
        if (zFA) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.ru) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.FA.NOt nOt) {
        com.bytedance.adsdk.ugeno.FA.NOt nOt2 = this.mZ;
        if (nOt2 != null) {
            nOt2.ZRu((DataSetObserver) null);
            for (int i10 = 0; i10 < this.Mm.size(); i10++) {
                NOt nOt3 = this.Mm.get(i10);
                this.mZ.ZRu((ViewGroup) this, nOt3.NOt, nOt3.ZRu);
            }
            this.Mm.clear();
            Ht();
            this.uR = 0;
            scrollTo(0, 0);
        }
        this.mZ = nOt;
        this.ZRu = 0;
        if (nOt != null) {
            if (this.oK == null) {
                this.oK = new Ht();
            }
            this.mZ.ZRu((DataSetObserver) this.oK);
            this.MR = false;
            boolean z10 = this.yz;
            this.yz = true;
            this.ZRu = this.mZ.ZRu();
            int i11 = this.aT;
            if (i11 >= 0) {
                ZRu(i11, false, true);
                this.aT = -1;
                this.ZH = null;
                this.lp = null;
            } else if (z10) {
                requestLayout();
            } else {
                mZ();
            }
        }
        List<Object> list = this.MU;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.MU.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.MU.get(i12);
        }
    }

    public void setCurrentItem(int i10) {
        this.MR = false;
        ZRu(i10, !this.yz, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.fcs) {
            this.fcs = i10;
            mZ();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(uR uRVar) {
        this.gmt = uRVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.yBV;
        this.yBV = i10;
        int width = getWidth();
        ZRu(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.WMI = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.IOC == i10) {
            return;
        }
        this.IOC = i10;
        if (this.yM != null) {
            NOt(i10 != 0);
        }
        Ht(i10);
    }

    public void setScroller(Scroller scroller) {
        this.sAl = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.WMI;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.FA.mZ$mZ, reason: collision with other inner class name */
    public static class C0386mZ extends ViewGroup.LayoutParams {
        int Ht;
        public int NOt;
        int TFq;
        public boolean ZRu;
        float mZ;
        boolean uR;

        public C0386mZ() {
            super(-1, -1);
            this.mZ = 0.0f;
        }

        public C0386mZ(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mZ = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mZ.NOt);
            this.NOt = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean mZ(View view) {
        return view.getClass().getAnnotation(ZRu.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0386mZ(getContext(), attributeSet);
    }

    private void mZ(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void Ht(int i10) {
        List<uR> list = this.HX;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.HX.get(i11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mZ(int r5) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.FA.mZ.mZ(int):boolean");
    }

    public boolean TFq() {
        com.bytedance.adsdk.ugeno.FA.NOt nOt = this.mZ;
        if (nOt == null || this.uR >= nOt.ZRu() - 1) {
            return false;
        }
        ZRu(this.uR + 1, true);
        return true;
    }

    public void ZRu(int i10, boolean z10) {
        this.MR = false;
        ZRu(i10, z10, false);
    }

    public boolean uR() {
        int i10 = this.uR;
        if (i10 <= 0) {
            return false;
        }
        ZRu(i10 - 1, true);
        return true;
    }

    public void ZRu(int i10, boolean z10, boolean z11) {
        ZRu(i10, z10, z11, 0);
    }

    public void ZRu(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.FA.NOt nOt = this.mZ;
        if (nOt != null && nOt.ZRu() > 0) {
            if (!z11 && this.uR == i10 && this.Mm.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.mZ.ZRu()) {
                i10 = this.mZ.ZRu() - 1;
            }
            int i12 = this.fcs;
            int i13 = this.uR;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.Mm.size(); i14++) {
                    this.Mm.get(i14).mZ = true;
                }
            }
            boolean z12 = this.uR != i10;
            if (this.yz) {
                this.uR = i10;
                if (z12) {
                    TFq(i10);
                }
                requestLayout();
                return;
            }
            ZRu(i10);
            ZRu(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public NOt NOt(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return ZRu(view);
            }
        }
    }

    public NOt NOt(int i10) {
        for (int i11 = 0; i11 < this.Mm.size(); i11++) {
            NOt nOt = this.Mm.get(i11);
            if (nOt.NOt == i10) {
                return nOt;
            }
        }
        return null;
    }

    private void NOt(int i10, float f10, int i11) {
        uR uRVar = this.gmt;
        if (uRVar != null) {
            uRVar.ZRu(i10, f10, i11);
        }
        List<uR> list = this.HX;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                uR uRVar2 = this.HX.get(i12);
                if (uRVar2 != null) {
                    uRVar2.ZRu(i10, f10, i11);
                }
            }
        }
        uR uRVar3 = this.ZRJ;
        if (uRVar3 != null) {
            uRVar3.ZRu(i10, f10, i11);
        }
    }

    private void ZRu(int i10, boolean z10, int i11, boolean z11) {
        int iMax;
        NOt NOt2 = NOt(i10);
        if (NOt2 != null) {
            iMax = (int) (Math.max(this.OCA, Math.min(NOt2.TFq, this.to)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z10) {
            ZRu(iMax, 0, i11);
            if (z11) {
                TFq(i10);
                return;
            }
            return;
        }
        if (z11) {
            TFq(i10);
        }
        ZRu(false);
        scrollTo(iMax, 0);
        uR(iMax);
    }

    private void NOt(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.gX : 0, null);
        }
    }

    private boolean NOt(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.Yx - f10;
        this.Yx = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.OCA * clientWidth;
        float f13 = this.to * clientWidth;
        boolean z12 = false;
        NOt nOt = this.Mm.get(0);
        NOt nOt2 = (NOt) V1.a(this.Mm, 1);
        if (nOt.NOt != 0) {
            f12 = nOt.TFq * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (nOt2.NOt != this.mZ.ZRu() - 1) {
            f13 = nOt2.TFq * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.NBW.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.Nl.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.Yx = (scrollX - i10) + this.Yx;
        scrollTo(i10, getScrollY());
        uR(i10);
        return z12;
    }

    public void ZRu(uR uRVar) {
        if (this.HX == null) {
            this.HX = new ArrayList();
        }
        this.HX.add(uRVar);
    }

    public void ZRu(boolean z10, TFq tFq) {
        ZRu(z10, tFq, 2);
    }

    public void ZRu(boolean z10, TFq tFq, int i10) {
        boolean z11 = tFq != null;
        boolean z12 = z11 != (this.yM != null);
        this.yM = tFq;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.GC = z10 ? 2 : 1;
            this.gX = i10;
        } else {
            this.GC = 0;
        }
        if (z12) {
            mZ();
        }
    }

    public float ZRu(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void ZRu(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.sAl;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.edo ? this.sAl.getCurrX() : this.sAl.getStartX();
            this.sAl.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            ZRu(false);
            mZ();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fZRu = (ZRu(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11) + f11;
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fZRu / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((this.mZ.ZRu(this.uR) * f10) + this.yBV)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.edo = false;
        this.sAl.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    public NOt ZRu(int i10, int i11) {
        NOt nOt = new NOt();
        nOt.NOt = i10;
        nOt.ZRu = this.mZ.ZRu((ViewGroup) this, i10);
        nOt.uR = this.mZ.ZRu(i10);
        if (i11 >= 0 && i11 < this.Mm.size()) {
            this.Mm.add(i11, nOt);
            return nOt;
        }
        this.Mm.add(nOt);
        return nOt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[PHI: r7 r10 r14
      0x00c6: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(int r18) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.FA.mZ.ZRu(int):void");
    }

    private void ZRu(NOt nOt, int i10, NOt nOt2) {
        int i11;
        int i12;
        NOt nOt3;
        NOt nOt4;
        int iZRu = this.mZ.ZRu();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.yBV / clientWidth : 0.0f;
        if (nOt2 != null) {
            int i13 = nOt2.NOt;
            int i14 = nOt.NOt;
            if (i13 < i14) {
                float fZRu = nOt2.TFq + nOt2.uR + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= nOt.NOt && i16 < this.Mm.size()) {
                    NOt nOt5 = this.Mm.get(i16);
                    while (true) {
                        nOt4 = nOt5;
                        if (i15 <= nOt4.NOt || i16 >= this.Mm.size() - 1) {
                            break;
                        }
                        i16++;
                        nOt5 = this.Mm.get(i16);
                    }
                    while (i15 < nOt4.NOt) {
                        fZRu += this.mZ.ZRu(i15) + f10;
                        i15++;
                    }
                    nOt4.TFq = fZRu;
                    fZRu += nOt4.uR + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.Mm.size() - 1;
                float fZRu2 = nOt2.TFq;
                while (true) {
                    i13--;
                    if (i13 < nOt.NOt || size < 0) {
                        break;
                    }
                    NOt nOt6 = this.Mm.get(size);
                    while (true) {
                        nOt3 = nOt6;
                        if (i13 >= nOt3.NOt || size <= 0) {
                            break;
                        }
                        size--;
                        nOt6 = this.Mm.get(size);
                    }
                    while (i13 > nOt3.NOt) {
                        fZRu2 -= this.mZ.ZRu(i13) + f10;
                        i13--;
                    }
                    fZRu2 -= nOt3.uR + f10;
                    nOt3.TFq = fZRu2;
                }
            }
        }
        int size2 = this.Mm.size();
        float fZRu3 = nOt.TFq;
        int i17 = nOt.NOt;
        int i18 = i17 - 1;
        this.OCA = i17 == 0 ? fZRu3 : -3.4028235E38f;
        int i19 = iZRu - 1;
        this.to = i17 == i19 ? (nOt.uR + fZRu3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            NOt nOt7 = this.Mm.get(i20);
            while (true) {
                i12 = nOt7.NOt;
                if (i18 <= i12) {
                    break;
                }
                fZRu3 -= this.mZ.ZRu(i18) + f10;
                i18--;
            }
            fZRu3 -= nOt7.uR + f10;
            nOt7.TFq = fZRu3;
            if (i12 == 0) {
                this.OCA = fZRu3;
            }
            i20--;
            i18--;
        }
        float fZRu4 = nOt.TFq + nOt.uR + f10;
        int i21 = nOt.NOt + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            NOt nOt8 = this.Mm.get(i22);
            while (true) {
                i11 = nOt8.NOt;
                if (i21 >= i11) {
                    break;
                }
                fZRu4 += this.mZ.ZRu(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.to = (nOt8.uR + fZRu4) - 1.0f;
            }
            nOt8.TFq = fZRu4;
            fZRu4 += nOt8.uR + f10;
            i22++;
            i21++;
        }
        this.Jem = false;
    }

    public NOt ZRu(View view) {
        for (int i10 = 0; i10 < this.Mm.size(); i10++) {
            NOt nOt = this.Mm.get(i10);
            if (this.mZ.ZRu(view, nOt.ZRu)) {
                return nOt;
            }
        }
        return null;
    }

    private void ZRu(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.Mm.isEmpty()) {
            if (!this.sAl.isFinished()) {
                this.sAl.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        NOt NOt2 = NOt(this.uR);
        int iMin = (int) ((NOt2 != null ? Math.min(NOt2.TFq, this.to) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            ZRu(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.Np
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.FA.mZ$mZ r9 = (com.bytedance.adsdk.ugeno.FA.mZ.C0386mZ) r9
            boolean r10 = r9.ZRu
            if (r10 == 0) goto L68
            int r9 = r9.NOt
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5c
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L45:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5c
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L45
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.NOt(r13, r14, r15)
            com.bytedance.adsdk.ugeno.FA.mZ$TFq r13 = r12.yM
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.FA.mZ$mZ r0 = (com.bytedance.adsdk.ugeno.FA.mZ.C0386mZ) r0
            boolean r0 = r0.ZRu
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.FA.mZ$TFq r3 = r12.yM
            r3.ZRu(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.Gis = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.FA.mZ.ZRu(int, float, int):void");
    }

    private void ZRu(boolean z10) {
        boolean z11 = this.IOC == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.sAl.isFinished()) {
                this.sAl.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.sAl.getCurrX();
                int currY = this.sAl.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        uR(currX);
                    }
                }
            }
        }
        this.MR = false;
        for (int i10 = 0; i10 < this.Mm.size(); i10++) {
            NOt nOt = this.Mm.get(i10);
            if (nOt.mZ) {
                nOt.mZ = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.gaw);
            } else {
                this.gaw.run();
            }
        }
    }

    private boolean ZRu(float f10, float f11) {
        if (f10 >= this.WD || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.WD)) && f11 < 0.0f;
        }
        return true;
    }

    private int ZRu(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.Hvv || Math.abs(i11) <= this.Vr) {
            i10 += (int) (f10 + (i10 >= this.uR ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.Mm.size() > 0) {
            return Math.max(this.Mm.get(0).NOt, Math.min(i10, ((NOt) V1.a(this.Mm, 1)).NOt));
        }
        return i10;
    }

    private void ZRu(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.bO) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.Yx = motionEvent.getX(i10);
            this.bO = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.AK;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean ZRu(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && ZRu(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean ZRu(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return uR();
            }
            return mZ(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return TFq();
            }
            return mZ(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return mZ(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return mZ(1);
        }
        return false;
    }

    private Rect ZRu(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
