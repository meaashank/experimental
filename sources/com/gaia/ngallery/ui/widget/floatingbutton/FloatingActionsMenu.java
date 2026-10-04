package com.gaia.ngallery.ui.widget.floatingbutton;

import N4.l;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.collection.C1545m0;
import androidx.constraintlayout.motion.widget.f;
import com.prism.commons.utils.l0;
import e.InterfaceC4339m;
import h5.C4494c;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionsMenu extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f150483A = 2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f150484B = 3;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f150485C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f150486D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f150487E = 300;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final float f150488F = 0.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final float f150489G = 135.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f150494y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f150495z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f150497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f150501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f150502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f150503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f150504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f150505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f150506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f150507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AnimatorSet f150508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AnimatorSet f150509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AddFloatingActionButton f150510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f150511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f150512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f150513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f150514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f150515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f150516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C4494c f150517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f150518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f150493x = l0.b("FloatingActionsMenu");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static Interpolator f150490H = new OvershootInterpolator();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static Interpolator f150491I = new DecelerateInterpolator(3.0f);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static Interpolator f150492J = new DecelerateInterpolator();

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean mExpanded;

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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.mExpanded ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mExpanded = parcel.readInt() == 1;
        }
    }

    public class a extends AddFloatingActionButton {
        public a(Context context) {
            super(context, null);
        }

        @Override // com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton
        public void H() {
            this.f150456o = FloatingActionsMenu.this.f150498c;
            FloatingActionsMenu floatingActionsMenu = FloatingActionsMenu.this;
            this.f150464a = floatingActionsMenu.f150499d;
            this.f150465b = floatingActionsMenu.f150500e;
            this.f150475l = floatingActionsMenu.f150502g;
            super.H();
        }

        @Override // com.gaia.ngallery.ui.widget.floatingbutton.AddFloatingActionButton, com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton
        public Drawable l() {
            e eVar = new e(super.l());
            FloatingActionsMenu.this.f150511p = eVar;
            OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(eVar, f.f106849i, 135.0f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(eVar, f.f106849i, 0.0f, 135.0f);
            objectAnimatorOfFloat.setInterpolator(overshootInterpolator);
            objectAnimatorOfFloat2.setInterpolator(overshootInterpolator);
            FloatingActionsMenu.this.f150508m.play(objectAnimatorOfFloat2);
            FloatingActionsMenu.this.f150509n.play(objectAnimatorOfFloat);
            return eVar;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FloatingActionsMenu.this.B();
        }
    }

    public class c extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ObjectAnimator f150521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ObjectAnimator f150522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ObjectAnimator f150523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ObjectAnimator f150524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f150525e;

        public class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f150527a;

            public a(View view) {
                this.f150527a = view;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.f150527a.setLayerType(0, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.f150527a.setLayerType(2, null);
            }
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f150521a = new ObjectAnimator();
            this.f150522b = new ObjectAnimator();
            this.f150523c = new ObjectAnimator();
            this.f150524d = new ObjectAnimator();
            this.f150521a.setInterpolator(FloatingActionsMenu.f150490H);
            this.f150522b.setInterpolator(FloatingActionsMenu.f150492J);
            this.f150523c.setInterpolator(FloatingActionsMenu.f150491I);
            this.f150524d.setInterpolator(FloatingActionsMenu.f150491I);
            ObjectAnimator objectAnimator = this.f150524d;
            Property property = View.ALPHA;
            objectAnimator.setProperty(property);
            this.f150524d.setFloatValues(1.0f, 0.0f);
            this.f150522b.setProperty(property);
            this.f150522b.setFloatValues(0.0f, 1.0f);
            int i10 = FloatingActionsMenu.this.f150503h;
            if (i10 == 0 || i10 == 1) {
                ObjectAnimator objectAnimator2 = this.f150523c;
                Property property2 = View.TRANSLATION_Y;
                objectAnimator2.setProperty(property2);
                this.f150521a.setProperty(property2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                ObjectAnimator objectAnimator3 = this.f150523c;
                Property property3 = View.TRANSLATION_X;
                objectAnimator3.setProperty(property3);
                this.f150521a.setProperty(property3);
            }
        }

        public final void c(Animator animator, View view) {
            animator.addListener(new a(view));
        }

        public void d(View view) {
            this.f150524d.setTarget(view);
            this.f150523c.setTarget(view);
            this.f150522b.setTarget(view);
            this.f150521a.setTarget(view);
            if (this.f150525e) {
                return;
            }
            c(this.f150521a, view);
            c(this.f150523c, view);
            FloatingActionsMenu.this.f150509n.play(this.f150524d);
            FloatingActionsMenu.this.f150509n.play(this.f150523c);
            FloatingActionsMenu.this.f150508m.play(this.f150522b);
            FloatingActionsMenu.this.f150508m.play(this.f150521a);
            this.f150525e = true;
        }
    }

    public interface d {
        void a();

        void b();
    }

    public static class e extends LayerDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f150529a;

        public e(Drawable drawable) {
            super(new Drawable[]{drawable});
        }

        public float a() {
            return this.f150529a;
        }

        public void b(float f10) {
            this.f150529a = f10;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.rotate(this.f150529a, getBounds().centerX(), getBounds().centerY());
            super.draw(canvas);
            canvas.restore();
        }
    }

    public FloatingActionsMenu(Context context) {
        this(context, null);
    }

    public void A(d dVar) {
        this.f150518w = dVar;
    }

    public void B() {
        if (this.f150507l) {
            o();
        } else {
            t();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(super.generateDefaultLayoutParams());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(super.generateLayoutParams(attributeSet));
    }

    public void m(FloatingActionButton floatingActionButton) {
        addView(floatingActionButton, this.f150516u - 1);
        this.f150516u++;
        if (this.f150514s != 0) {
            s();
        }
    }

    public final int n(int i10) {
        return (i10 * 12) / 10;
    }

    public void o() {
        p(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f150510o);
        this.f150516u = getChildCount();
        if (this.f150514s != 0) {
            s();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        char c10;
        float f10;
        char c11;
        int i14;
        int i15;
        String str = f150493x;
        StringBuilder sbA = C1545m0.a("onLayout before: l:", i10, " t:", i11, " r:");
        sbA.append(i12);
        sbA.append(" b:");
        sbA.append(i13);
        Log.d(str, sbA.toString());
        int paddingBottom = i13 - getPaddingBottom();
        int paddingRight = i12 - getPaddingRight();
        int paddingTop = getPaddingTop() + i11;
        int paddingLeft = getPaddingLeft() + i10;
        int i16 = this.f150503h;
        int i17 = 8;
        char c12 = 0;
        float f11 = 0.0f;
        char c13 = 1;
        int i18 = 2;
        if (i16 != 0 && i16 != 1) {
            if (i16 == 2 || i16 == 3) {
                boolean z11 = i16 == 2;
                int measuredWidth = z11 ? (paddingRight - paddingLeft) - this.f150510o.getMeasuredWidth() : 0;
                int i19 = this.f150513r;
                int measuredHeight = ((i19 - this.f150510o.getMeasuredHeight()) / 2) + ((paddingBottom - paddingTop) - i19);
                AddFloatingActionButton addFloatingActionButton = this.f150510o;
                addFloatingActionButton.layout(measuredWidth, measuredHeight, addFloatingActionButton.getMeasuredWidth() + measuredWidth, this.f150510o.getMeasuredHeight() + measuredHeight);
                int measuredWidth2 = z11 ? measuredWidth - this.f150504i : this.f150510o.getMeasuredWidth() + measuredWidth + this.f150504i;
                for (int i20 = this.f150516u - 1; i20 >= 0; i20--) {
                    View childAt = getChildAt(i20);
                    if (childAt != this.f150510o && childAt.getVisibility() != 8) {
                        if (z11) {
                            measuredWidth2 -= childAt.getMeasuredWidth();
                        }
                        int measuredHeight2 = ((this.f150510o.getMeasuredHeight() - childAt.getMeasuredHeight()) / 2) + measuredHeight;
                        childAt.layout(measuredWidth2, measuredHeight2, childAt.getMeasuredWidth() + measuredWidth2, childAt.getMeasuredHeight() + measuredHeight2);
                        float f12 = measuredWidth - measuredWidth2;
                        childAt.setTranslationX(this.f150507l ? 0.0f : f12);
                        childAt.setAlpha(this.f150507l ? 1.0f : 0.0f);
                        c cVar = (c) childAt.getLayoutParams();
                        cVar.f150523c.setFloatValues(0.0f, f12);
                        cVar.f150521a.setFloatValues(f12, 0.0f);
                        cVar.d(childAt);
                        measuredWidth2 = z11 ? measuredWidth2 - this.f150504i : this.f150504i + childAt.getMeasuredWidth() + measuredWidth2;
                    }
                }
                return;
            }
            return;
        }
        boolean z12 = i16 == 0;
        if (z10) {
            this.f150517v.b();
        }
        if (z12) {
            paddingTop = paddingBottom - this.f150510o.getMeasuredHeight();
        }
        int i21 = this.f150515t == 0 ? paddingRight - (this.f150512q / 2) : (this.f150512q / 2) + paddingLeft;
        int measuredWidth3 = i21 - (this.f150510o.getMeasuredWidth() / 2);
        AddFloatingActionButton addFloatingActionButton2 = this.f150510o;
        addFloatingActionButton2.layout(measuredWidth3, paddingTop, addFloatingActionButton2.getMeasuredWidth() + measuredWidth3, this.f150510o.getMeasuredHeight() + paddingTop);
        int i22 = (this.f150512q / 2) + this.f150505j;
        int i23 = this.f150515t == 0 ? i21 - i22 : i22 + i21;
        int measuredHeight3 = z12 ? paddingTop - this.f150504i : this.f150510o.getMeasuredHeight() + paddingTop + this.f150504i;
        int i24 = this.f150516u - 1;
        while (i24 >= 0) {
            View childAt2 = getChildAt(i24);
            if (childAt2 == this.f150510o || childAt2.getVisibility() == i17) {
                c10 = c12;
                f10 = f11;
                c11 = c13;
                i14 = i18;
            } else {
                int measuredWidth4 = i21 - (childAt2.getMeasuredWidth() / i18);
                if (z12) {
                    measuredHeight3 -= childAt2.getMeasuredHeight();
                }
                childAt2.layout(measuredWidth4, measuredHeight3, childAt2.getMeasuredWidth() + measuredWidth4, childAt2.getMeasuredHeight() + measuredHeight3);
                float f13 = paddingTop - measuredHeight3;
                childAt2.setTranslationY(this.f150507l ? f11 : f13);
                childAt2.setAlpha(this.f150507l ? 1.0f : f11);
                c cVar2 = (c) childAt2.getLayoutParams();
                ObjectAnimator objectAnimator = cVar2.f150523c;
                c10 = c12;
                float[] fArr = new float[i18];
                fArr[c10] = f11;
                fArr[c13] = f13;
                objectAnimator.setFloatValues(fArr);
                ObjectAnimator objectAnimator2 = cVar2.f150521a;
                float[] fArr2 = new float[i18];
                fArr2[c10] = f13;
                fArr2[c13] = f11;
                objectAnimator2.setFloatValues(fArr2);
                cVar2.d(childAt2);
                View view = (View) childAt2.getTag(l.h.f62317n3);
                if (view != null) {
                    int measuredWidth5 = this.f150515t == 0 ? i23 - view.getMeasuredWidth() : view.getMeasuredWidth() + i23;
                    int i25 = this.f150515t;
                    if (i25 == 0) {
                        f10 = f11;
                        i15 = measuredWidth5;
                    } else {
                        f10 = f11;
                        i15 = i23;
                    }
                    if (i25 == 0) {
                        measuredWidth5 = i23;
                    }
                    int measuredHeight4 = ((childAt2.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (measuredHeight3 - this.f150506k);
                    c11 = c13;
                    view.layout(i15, measuredHeight4, measuredWidth5, view.getMeasuredHeight() + measuredHeight4);
                    int i26 = i18;
                    this.f150517v.a(new TouchDelegate(new Rect(Math.min(measuredWidth4, i15), measuredHeight3 - (this.f150504i / i18), Math.max(childAt2.getMeasuredWidth() + measuredWidth4, measuredWidth5), (this.f150504i / 2) + childAt2.getMeasuredHeight() + measuredHeight3), childAt2));
                    view.setTranslationY(this.f150507l ? f10 : f13);
                    view.setAlpha(this.f150507l ? 1.0f : f10);
                    c cVar3 = (c) view.getLayoutParams();
                    ObjectAnimator objectAnimator3 = cVar3.f150523c;
                    i14 = i26;
                    float[] fArr3 = new float[i14];
                    fArr3[c10] = f10;
                    fArr3[c11] = f13;
                    objectAnimator3.setFloatValues(fArr3);
                    ObjectAnimator objectAnimator4 = cVar3.f150521a;
                    float[] fArr4 = new float[i14];
                    fArr4[c10] = f13;
                    fArr4[c11] = f10;
                    objectAnimator4.setFloatValues(fArr4);
                    cVar3.d(view);
                } else {
                    f10 = f11;
                    c11 = c13;
                    i14 = i18;
                }
                measuredHeight3 = z12 ? measuredHeight3 - this.f150504i : this.f150504i + childAt2.getMeasuredHeight() + measuredHeight3;
            }
            i24--;
            c12 = c10;
            f11 = f10;
            i18 = i14;
            c13 = c11;
            i17 = 8;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        TextView textView;
        measureChildren(i10, i11);
        this.f150512q = 0;
        this.f150513r = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < this.f150516u; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int i13 = this.f150503h;
                if (i13 == 0 || i13 == 1) {
                    this.f150512q = Math.max(this.f150512q, childAt.getMeasuredWidth());
                    childAt.getMeasuredHeight();
                } else if (i13 == 2 || i13 == 3) {
                    childAt.getMeasuredWidth();
                    this.f150513r = Math.max(this.f150513r, childAt.getMeasuredHeight());
                }
                if (!u() && (textView = (TextView) childAt.getTag(l.h.f62317n3)) != null) {
                    iMax = Math.max(iMax, textView.getMeasuredWidth());
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        boolean z10 = savedState.mExpanded;
        this.f150507l = z10;
        this.f150517v.d(z10);
        e eVar = this.f150511p;
        if (eVar != null) {
            eVar.b(this.f150507l ? 135.0f : 0.0f);
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mExpanded = this.f150507l;
        return savedState;
    }

    public final void p(boolean z10) {
        if (this.f150507l) {
            this.f150507l = false;
            this.f150517v.d(false);
            this.f150509n.setDuration(z10 ? 0L : 300L);
            this.f150509n.start();
            this.f150508m.cancel();
            setBackgroundColor(this.f150497b);
            setClickable(false);
        }
    }

    public void q() {
        p(true);
    }

    public final void r(Context context) {
        a aVar = new a(context);
        this.f150510o = aVar;
        aVar.setId(l.h.f62304m3);
        this.f150510o.E(this.f150501f);
        this.f150510o.setOnClickListener(new b());
        addView(this.f150510o, super.generateDefaultLayoutParams());
        this.f150516u++;
    }

    public final void s() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f150514s);
        for (int i10 = 0; i10 < this.f150516u; i10++) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i10);
            String strO = floatingActionButton.o();
            if (floatingActionButton != this.f150510o && strO != null) {
                int i11 = l.h.f62317n3;
                if (floatingActionButton.getTag(i11) == null) {
                    TextView textView = new TextView(contextThemeWrapper);
                    textView.setTextAppearance(getContext(), this.f150514s);
                    textView.setText(floatingActionButton.o());
                    addView(textView);
                    floatingActionButton.setTag(i11, textView);
                }
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f150510o.setEnabled(z10);
    }

    public void t() {
        if (this.f150507l) {
            return;
        }
        this.f150507l = true;
        this.f150517v.d(true);
        this.f150509n.cancel();
        this.f150508m.start();
        setBackgroundColor(this.f150496a);
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: h5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202427a.o();
            }
        });
        d dVar = this.f150518w;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final boolean u() {
        int i10 = this.f150503h;
        return i10 == 2 || i10 == 3;
    }

    public final int v(@InterfaceC4339m int i10) {
        return getResources().getColor(i10);
    }

    public final void w(Context context, AttributeSet attributeSet) {
        float dimension = getResources().getDimension(l.f.f61112Z1) - getResources().getDimension(l.f.f61217g2);
        Resources resources = getResources();
        int i10 = l.f.f61202f2;
        this.f150504i = (int) (dimension - resources.getDimension(i10));
        this.f150505j = getResources().getDimensionPixelSize(l.f.f61142b2);
        this.f150506k = getResources().getDimensionPixelSize(i10);
        C4494c c4494c = new C4494c(this);
        this.f150517v = c4494c;
        setTouchDelegate(c4494c);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.r.Ih, 0, 0);
        this.f150498c = typedArrayObtainStyledAttributes.getColor(l.r.Lh, v(R.color.white));
        this.f150499d = typedArrayObtainStyledAttributes.getColor(l.r.Jh, v(R.color.holo_blue_dark));
        this.f150500e = typedArrayObtainStyledAttributes.getColor(l.r.Kh, v(R.color.holo_blue_light));
        this.f150501f = typedArrayObtainStyledAttributes.getInt(l.r.Mh, 0);
        this.f150502g = typedArrayObtainStyledAttributes.getBoolean(l.r.Nh, true);
        this.f150503h = typedArrayObtainStyledAttributes.getInt(l.r.Ph, 0);
        this.f150514s = typedArrayObtainStyledAttributes.getResourceId(l.r.Qh, 0);
        this.f150515t = typedArrayObtainStyledAttributes.getInt(l.r.Rh, 0);
        this.f150496a = typedArrayObtainStyledAttributes.getColor(l.r.Oh, v(R.color.transparent));
        this.f150497b = v(R.color.transparent);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f150514s != 0 && u()) {
            throw new IllegalStateException("Operation labels in horizontal expand orientation is not supported.");
        }
        r(context);
    }

    public boolean x() {
        return this.f150507l;
    }

    public final /* synthetic */ void y(View view) {
        o();
    }

    public void z(FloatingActionButton floatingActionButton) {
        removeView(floatingActionButton.m());
        removeView(floatingActionButton);
        floatingActionButton.setTag(l.h.f62317n3, null);
        this.f150516u--;
    }

    public FloatingActionsMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150508m = new AnimatorSet().setDuration(300L);
        this.f150509n = new AnimatorSet().setDuration(300L);
        w(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(super.generateLayoutParams(layoutParams));
    }

    public FloatingActionsMenu(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f150508m = new AnimatorSet().setDuration(300L);
        this.f150509n = new AnimatorSet().setDuration(300L);
        w(context, attributeSet);
    }
}
