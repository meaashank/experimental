package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import g.C4426a;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f85719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f85720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f85721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f85722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f85723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f85724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85727j;

    @e.T(21)
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public View b() {
        return this.f85719b;
    }

    public final boolean c(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void d(Drawable drawable) {
        Drawable drawable2 = this.f85722e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f85722e);
        }
        this.f85722e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f85720c;
            if (view != null) {
                this.f85722e.setBounds(view.getLeft(), this.f85720c.getTop(), this.f85720c.getRight(), this.f85720c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f85725h ? !(this.f85722e != null || this.f85723f != null) : this.f85724g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f85722e;
        if (drawable != null && drawable.isStateful()) {
            this.f85722e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f85723f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f85723f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f85724g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f85724g.setState(getDrawableState());
    }

    public void e(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f85724g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f85724g);
        }
        this.f85724g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f85725h && (drawable2 = this.f85724g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f85725h ? !(this.f85722e != null || this.f85723f != null) : this.f85724g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void f(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f85723f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f85723f);
        }
        this.f85723f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f85726i && (drawable2 = this.f85723f) != null) {
                drawable2.setBounds(this.f85719b.getLeft(), this.f85719b.getTop(), this.f85719b.getRight(), this.f85719b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f85725h ? !(this.f85722e != null || this.f85723f != null) : this.f85724g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void g(M m10) {
        View view = this.f85719b;
        if (view != null) {
            removeView(view);
        }
        this.f85719b = m10;
        if (m10 != null) {
            addView(m10);
            ViewGroup.LayoutParams layoutParams = m10.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m10.m(false);
        }
    }

    public void h(boolean z10) {
        this.f85718a = z10;
        setDescendantFocusability(z10 ? Opcodes.ASM6 : 262144);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f85722e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f85723f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f85724g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f85720c = findViewById(C4426a.g.f201276a);
        this.f85721d = findViewById(C4426a.g.f201290h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f85718a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            android.view.View r8 = r6.f85719b
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f85725h
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f85724g
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f85722e
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f85720c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f85722e
            android.view.View r9 = r6.f85720c
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f85720c
            int r10 = r10.getTop()
            android.view.View r1 = r6.f85720c
            int r1 = r1.getRight()
            android.view.View r3 = r6.f85720c
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f85721d
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f85722e
            android.view.View r9 = r6.f85721d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f85721d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f85721d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f85721d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f85722e
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f85726i = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f85723f
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f85720c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f85727j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f85720c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f85719b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f85719b) + (!c(this.f85720c) ? a(this.f85720c) : !c(this.f85721d) ? a(this.f85721d) : 0), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f85722e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f85723f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f85724g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f85722e && !this.f85725h) {
            return true;
        }
        if (drawable == this.f85723f && this.f85726i) {
            return true;
        }
        return (drawable == this.f85724g && this.f85725h) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2507z0.O1(this, new C1496b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4426a.m.f201950a);
        this.f85722e = typedArrayObtainStyledAttributes.getDrawable(C4426a.m.f201959b);
        this.f85723f = typedArrayObtainStyledAttributes.getDrawable(C4426a.m.f201977d);
        this.f85727j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4426a.m.f202072o, -1);
        boolean z10 = true;
        if (getId() == C4426a.g.f201295j0) {
            this.f85725h = true;
            this.f85724g = typedArrayObtainStyledAttributes.getDrawable(C4426a.m.f201968c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f85725h ? this.f85722e != null || this.f85723f != null : this.f85724g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
