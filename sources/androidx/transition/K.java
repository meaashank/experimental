package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class K implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f117751a;

    public static class a extends ViewGroup {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Method f117752f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f117753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f117754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Drawable> f117755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public K f117756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f117757e;

        static {
            try {
                Class cls = Integer.TYPE;
                f117752f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, K k10) {
            super(context);
            this.f117755c = null;
            this.f117753a = viewGroup;
            this.f117754b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f117756d = k10;
        }

        public void a(Drawable drawable) {
            c();
            if (this.f117755c == null) {
                this.f117755c = new ArrayList<>();
            }
            if (this.f117755c.contains(drawable)) {
                return;
            }
            this.f117755c.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f117753a && viewGroup.getParent() != null && C2507z0.R0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f117753a.getLocationOnScreen(iArr2);
                    view.offsetLeftAndRight(iArr[0] - iArr2[0]);
                    view.offsetTopAndBottom(iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.f117757e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f117755c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f117757e = true;
                    this.f117753a.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f117753a.getLocationOnScreen(new int[2]);
            this.f117754b.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f117754b.getWidth(), this.f117754b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f117755c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f117755c.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f117753a.getLocationOnScreen(iArr2);
            this.f117754b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ViewParent f(int i10, int i11, Rect rect) {
            if (this.f117753a == null || f117752f == null) {
                return null;
            }
            try {
                e(new int[2]);
                f117752f.invoke(this.f117753a, Integer.valueOf(i10), Integer.valueOf(i11), rect);
                return null;
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f117755c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f117753a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f117753a == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f117755c;
            return arrayList != null && arrayList.contains(drawable);
        }
    }

    public K(Context context, ViewGroup viewGroup, View view) {
        this.f117751a = new a(context, viewGroup, view, this);
    }

    public static K a(View view) {
        ViewGroup viewGroupB = b(view);
        if (viewGroupB == null) {
            return null;
        }
        int childCount = viewGroupB.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroupB.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f117756d;
            }
        }
        return new D(viewGroupB.getContext(), viewGroupB, view);
    }

    public static ViewGroup b(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.M
    public void add(@NonNull Drawable drawable) {
        this.f117751a.a(drawable);
    }

    @Override // androidx.transition.M
    public void remove(@NonNull Drawable drawable) {
        this.f117751a.g(drawable);
    }
}
