package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import java.util.Arrays;
import java.util.HashMap;
import u0.C5634b;
import u0.InterfaceC5633a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f107590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f107592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC5633a f107593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f107594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f107595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f107596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View[] f107597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<Integer, String> f107598i;

    public ConstraintHelper(Context context) {
        super(context);
        this.f107590a = new int[32];
        this.f107594e = false;
        this.f107597h = null;
        this.f107598i = new HashMap<>();
        this.f107592c = context;
        A(null);
    }

    public void A(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f110547y6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f110306i7) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f107595f = string;
                    E(string);
                } else if (index == g.m.f110323j7) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f107596g = string2;
                    F(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void B(d.a constraint, C5634b child, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> mapIdToWidget) {
        d.b bVar = constraint.f107984e;
        int[] iArr = bVar.f108122k0;
        if (iArr != null) {
            G(iArr);
        } else {
            String str = bVar.f108124l0;
            if (str != null) {
                if (str.length() > 0) {
                    d.b bVar2 = constraint.f107984e;
                    bVar2.f108122k0 = u(this, bVar2.f108124l0);
                } else {
                    constraint.f107984e.f108122k0 = null;
                }
            }
        }
        if (child == null) {
            return;
        }
        child.b();
        if (constraint.f107984e.f108122k0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int[] iArr2 = constraint.f107984e.f108122k0;
            if (i10 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = mapIdToWidget.get(iArr2[i10]);
            if (constraintWidget != null) {
                child.a(constraintWidget);
            }
            i10++;
        }
    }

    public int C(View view) {
        int i10;
        int id2 = view.getId();
        int i11 = -1;
        if (id2 == -1) {
            return -1;
        }
        this.f107595f = null;
        int i12 = 0;
        while (true) {
            if (i12 >= this.f107591b) {
                break;
            }
            if (this.f107590a[i12] == id2) {
                int i13 = i12;
                while (true) {
                    i10 = this.f107591b;
                    if (i13 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = this.f107590a;
                    int i14 = i13 + 1;
                    iArr[i13] = iArr[i14];
                    i13 = i14;
                }
                this.f107590a[i10 - 1] = 0;
                this.f107591b = i10 - 1;
                i11 = i12;
            } else {
                i12++;
            }
        }
        requestLayout();
        return i11;
    }

    public void D(ConstraintWidget widget, boolean isRtl) {
    }

    public void E(String idList) {
        this.f107595f = idList;
        if (idList == null) {
            return;
        }
        int i10 = 0;
        this.f107591b = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i10);
            if (iIndexOf == -1) {
                m(idList.substring(i10));
                return;
            } else {
                m(idList.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void F(String tagList) {
        this.f107596g = tagList;
        if (tagList == null) {
            return;
        }
        int i10 = 0;
        this.f107591b = 0;
        while (true) {
            int iIndexOf = tagList.indexOf(44, i10);
            if (iIndexOf == -1) {
                o(tagList.substring(i10));
                return;
            } else {
                o(tagList.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void G(int[] ids) {
        this.f107595f = null;
        this.f107591b = 0;
        for (int i10 : ids) {
            n(i10);
        }
    }

    public void H(ConstraintLayout container) {
    }

    public void I(ConstraintLayout container) {
    }

    public void J(ConstraintLayout container) {
    }

    public void K(ConstraintLayout container) {
    }

    public void L(androidx.constraintlayout.core.widgets.d container, InterfaceC5633a helper, SparseArray<ConstraintWidget> map) {
        helper.b();
        for (int i10 = 0; i10 < this.f107591b; i10++) {
            helper.a(map.get(this.f107590a[i10]));
        }
    }

    public void M(ConstraintLayout container) {
        String str;
        int iV;
        if (isInEditMode()) {
            E(this.f107595f);
        }
        InterfaceC5633a interfaceC5633a = this.f107593d;
        if (interfaceC5633a == null) {
            return;
        }
        interfaceC5633a.b();
        for (int i10 = 0; i10 < this.f107591b; i10++) {
            int i11 = this.f107590a[i10];
            View viewById = container.getViewById(i11);
            if (viewById == null && (iV = v(container, (str = this.f107598i.get(Integer.valueOf(i11))))) != 0) {
                this.f107590a[i10] = iV;
                this.f107598i.put(Integer.valueOf(iV), str);
                viewById = container.getViewById(iV);
            }
            if (viewById != null) {
                this.f107593d.a(container.getViewWidget(viewById));
            }
        }
        this.f107593d.c(container.mLayoutWidget);
    }

    public void N() {
        if (this.f107593d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f107692v0 = (ConstraintWidget) this.f107593d;
        }
    }

    public final void m(String idString) {
        if (idString == null || idString.length() == 0 || this.f107592c == null) {
            return;
        }
        String strTrim = idString.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iW = w(strTrim);
        if (iW != 0) {
            this.f107598i.put(Integer.valueOf(iW), strTrim);
            n(iW);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void n(int id2) {
        if (id2 == getId()) {
            return;
        }
        int i10 = this.f107591b + 1;
        int[] iArr = this.f107590a;
        if (i10 > iArr.length) {
            this.f107590a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f107590a;
        int i11 = this.f107591b;
        iArr2[i11] = id2;
        this.f107591b = i11 + 1;
    }

    public final void o(String tagString) {
        if (tagString == null || tagString.length() == 0 || this.f107592c == null) {
            return;
        }
        String strTrim = tagString.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f107654c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    n(childAt.getId());
                }
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f107595f;
        if (str != null) {
            E(str);
        }
        String str2 = this.f107596g;
        if (str2 != null) {
            F(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f107594e) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f107595f = null;
            n(view.getId());
            requestLayout();
        }
    }

    public void q() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        r((ConstraintLayout) parent);
    }

    public void r(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f107591b; i10++) {
            View viewById = container.getViewById(this.f107590a[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void s(ConstraintLayout container) {
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.f107595f == null) {
            n(key);
        }
    }

    public boolean t(final int id2) {
        for (int i10 : this.f107590a) {
            if (i10 == id2) {
                return true;
            }
        }
        return false;
    }

    public final int[] u(View view, String referenceIdString) {
        String[] strArrSplit = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        for (String str : strArrSplit) {
            int iW = w(str.trim());
            if (iW != 0) {
                iArr[i10] = iW;
                i10++;
            }
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public final int v(ConstraintLayout container, String idString) {
        Resources resources;
        String resourceEntryName;
        if (idString == null || container == null || (resources = this.f107592c.getResources()) == null) {
            return 0;
        }
        int childCount = container.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = container.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (idString.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int w(String referenceId) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iV = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, referenceId);
            if (designInformation instanceof Integer) {
                iV = ((Integer) designInformation).intValue();
            }
        }
        if (iV == 0 && constraintLayout != null) {
            iV = v(constraintLayout, referenceId);
        }
        if (iV == 0) {
            try {
                iV = g.C0275g.class.getField(referenceId).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iV == 0 ? this.f107592c.getResources().getIdentifier(referenceId, "id", this.f107592c.getPackageName()) : iV;
    }

    public int[] x() {
        return Arrays.copyOf(this.f107590a, this.f107591b);
    }

    public View[] y(ConstraintLayout layout) {
        View[] viewArr = this.f107597h;
        if (viewArr == null || viewArr.length != this.f107591b) {
            this.f107597h = new View[this.f107591b];
        }
        for (int i10 = 0; i10 < this.f107591b; i10++) {
            this.f107597h[i10] = layout.getViewById(this.f107590a[i10]);
        }
        return this.f107597h;
    }

    public int z(final int id2) {
        int i10 = -1;
        for (int i11 : this.f107590a) {
            i10++;
            if (i11 == id2) {
                return i10;
            }
        }
        return i10;
    }

    public ConstraintHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107590a = new int[32];
        this.f107594e = false;
        this.f107597h = null;
        this.f107598i = new HashMap<>();
        this.f107592c = context;
        A(attrs);
    }

    public ConstraintHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107590a = new int[32];
        this.f107594e = false;
        this.f107597h = null;
        this.f107598i = new HashMap<>();
        this.f107592c = context;
        A(attrs);
    }
}
