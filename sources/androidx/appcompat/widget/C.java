package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.os.C2403b;
import androidx.core.view.I0;
import e.InterfaceC4345t;
import g.C4426a;
import i.C4540c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class C extends ListView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f85929n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f85930o = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f85931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f85937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f85940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I0 f85941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.core.widget.l f85942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f85943m;

    @e.T(21)
    public static class a {
        @InterfaceC4345t
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    @e.T(30)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f85944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f85945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f85946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f85947d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f85944a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f85945b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f85946c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f85947d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        public static boolean a() {
            return f85947d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void b(C c10, int i10, View view) {
            try {
                f85944a.invoke(c10, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f85945b.invoke(c10, Integer.valueOf(i10));
                f85946c.invoke(c10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    @e.T(33)
    public static class c {
        @InterfaceC4345t
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @InterfaceC4345t
        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    public static class d extends C4540c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f85948a;

        public d(Drawable drawable) {
            super(drawable);
            this.f85948a = true;
        }

        public void a(boolean z10) {
            this.f85948a = z10;
        }

        @Override // i.C4540c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f85948a) {
                super.draw(canvas);
            }
        }

        @Override // i.C4540c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f85948a) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // i.C4540c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f85948a) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // i.C4540c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f85948a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // i.C4540c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f85948a) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f85949a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f85949a = declaredField;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f85949a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z10) {
            Field field = f85949a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void a() {
            C c10 = C.this;
            c10.f85943m = null;
            c10.removeCallbacks(this);
        }

        public void b() {
            C.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C c10 = C.this;
            c10.f85943m = null;
            c10.drawableStateChanged();
        }
    }

    public C(@NonNull Context context, boolean z10) {
        super(context, null, C4426a.b.f200925p1);
        this.f85931a = new Rect();
        this.f85932b = 0;
        this.f85933c = 0;
        this.f85934d = 0;
        this.f85935e = 0;
        this.f85939i = z10;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f85940j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f85936f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        I0 i02 = this.f85941k;
        if (i02 != null) {
            i02.d();
            this.f85941k = null;
        }
    }

    public final void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f85931a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f85931a);
        selector.draw(canvas);
    }

    public int d(int i10, boolean z10) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z10) {
                    iMin = Math.max(0, i10);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i10, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i10 >= 0 && i10 < count) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f85943m != null) {
            return;
        }
        super.drawableStateChanged();
        l(true);
        p();
    }

    public int e(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.k(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.l r9 = r7.f85942l
            if (r9 != 0) goto L5a
            androidx.core.widget.l r9 = new androidx.core.widget.l
            r9.<init>(r7)
            r7.f85942l = r9
        L5a:
            androidx.core.widget.l r9 = r7.f85942l
            r9.o(r1)
            androidx.core.widget.l r9 = r7.f85942l
            r9.onTouch(r7, r8)
            return r3
        L65:
            androidx.core.widget.l r8 = r7.f85942l
            if (r8 == 0) goto L6c
            r8.o(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C.f(android.view.MotionEvent, int):boolean");
    }

    public final void g(int i10, View view) {
        Rect rect = this.f85931a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f85932b;
        rect.top -= this.f85933c;
        rect.right += this.f85934d;
        rect.bottom += this.f85935e;
        boolean zM = m();
        if (view.isEnabled() != zM) {
            n(!zM);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void h(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        g(i10, view);
        if (z10) {
            Rect rect = this.f85931a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            selector.setHotspot(fExactCenterX, fExactCenterY);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f85939i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f85939i || super.hasWindowFocus();
    }

    public final void i(int i10, View view, float f10, float f11) {
        h(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        selector.setHotspot(f10, f11);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f85939i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f85939i && this.f85938h) || super.isInTouchMode();
    }

    public void j(boolean z10) {
        this.f85938h = z10;
    }

    public final void k(View view, int i10, float f10, float f11) {
        View childAt;
        this.f85940j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f85936f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f85936f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i10, view, f10, f11);
        l(false);
        refreshDrawableState();
    }

    public final void l(boolean z10) {
        d dVar = this.f85937g;
        if (dVar != null) {
            dVar.a(z10);
        }
    }

    @e.N(markerClass = {C2403b.InterfaceC0282b.class})
    public final boolean m() {
        return C2403b.k() ? c.a(this) : e.a(this);
    }

    @e.N(markerClass = {C2403b.InterfaceC0282b.class})
    public final void n(boolean z10) {
        if (C2403b.k()) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    public final boolean o() {
        return this.f85940j;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f85943m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f85943m == null) {
            f fVar = new f();
            this.f85943m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            p();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f85936f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f85943m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        Drawable selector = getSelector();
        if (selector != null && this.f85940j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f85937g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f85932b = rect.left;
        this.f85933c = rect.top;
        this.f85934d = rect.right;
        this.f85935e = rect.bottom;
    }
}
