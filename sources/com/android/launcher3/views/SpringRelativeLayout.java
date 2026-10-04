package com.android.launcher3.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.g;
import androidx.dynamicanimation.animation.j;
import androidx.dynamicanimation.animation.k;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class SpringRelativeLayout extends RelativeLayout {
    private static final g<SpringRelativeLayout> DAMPED_SCROLL = new AnonymousClass1("value");
    private static final float DAMPING_RATIO = 0.5f;
    private static final float STIFFNESS = 850.0f;
    private static final float VELOCITY_MULTIPLIER = 0.3f;
    private SpringEdgeEffect mActiveEdge;
    private float mDampedScrollShift;
    private final j mSpring;
    private final SparseBooleanArray mSpringViews;

    /* JADX INFO: renamed from: com.android.launcher3.views.SpringRelativeLayout$1, reason: invalid class name */
    public class AnonymousClass1 extends g<SpringRelativeLayout> {
        public AnonymousClass1(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(SpringRelativeLayout springRelativeLayout) {
            return springRelativeLayout.mDampedScrollShift;
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(SpringRelativeLayout springRelativeLayout, float f10) {
            springRelativeLayout.setDampedScrollShift(f10);
        }
    }

    public class SpringEdgeEffect extends EdgeEffect {
        private float mDistance;
        private final float mVelocityMultiplier;

        public SpringEdgeEffect(Context context, float f10) {
            super(context);
            this.mVelocityMultiplier = f10;
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            return false;
        }

        @Override // android.widget.EdgeEffect
        public void onAbsorb(int i10) {
            SpringRelativeLayout.this.finishScrollWithVelocity(i10 * this.mVelocityMultiplier);
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f10, float f11) {
            SpringRelativeLayout.this.setActiveEdge(this);
            float f12 = ((this.mVelocityMultiplier / 3.0f) * f10) + this.mDistance;
            this.mDistance = f12;
            SpringRelativeLayout.this.setDampedScrollShift(f12 * r3.getHeight());
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
            this.mDistance = 0.0f;
            SpringRelativeLayout.this.finishScrollWithVelocity(0.0f);
        }
    }

    public class SpringEdgeEffectFactory extends RecyclerView.k {
        @Override // androidx.recyclerview.widget.RecyclerView.k
        @NonNull
        public EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i10) {
            if (i10 == 1) {
                SpringRelativeLayout springRelativeLayout = SpringRelativeLayout.this;
                return springRelativeLayout.new SpringEdgeEffect(springRelativeLayout.getContext(), 0.3f);
            }
            if (i10 != 3) {
                return super.createEdgeEffect(recyclerView, i10);
            }
            SpringRelativeLayout springRelativeLayout2 = SpringRelativeLayout.this;
            return springRelativeLayout2.new SpringEdgeEffect(springRelativeLayout2.getContext(), -0.3f);
        }

        private SpringEdgeEffectFactory() {
        }
    }

    public SpringRelativeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishScrollWithVelocity(float f10) {
        j jVar = this.mSpring;
        jVar.f113199a = f10;
        jVar.t(this.mDampedScrollShift);
        this.mSpring.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveEdge(SpringEdgeEffect springEdgeEffect) {
        SpringEdgeEffect springEdgeEffect2 = this.mActiveEdge;
        if (springEdgeEffect2 != springEdgeEffect && springEdgeEffect2 != null) {
            springEdgeEffect2.mDistance = 0.0f;
        }
        this.mActiveEdge = springEdgeEffect;
    }

    public void addSpringView(int i10) {
        this.mSpringViews.put(i10, true);
    }

    public RecyclerView.k createEdgeEffectFactory() {
        return new SpringEdgeEffectFactory();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.mDampedScrollShift == 0.0f || !this.mSpringViews.get(view.getId())) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.translate(0.0f, this.mDampedScrollShift);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.translate(0.0f, -this.mDampedScrollShift);
        return zDrawChild;
    }

    public void finishWithShiftAndVelocity(float f10, float f11, b.q qVar) {
        setDampedScrollShift(f10);
        this.mSpring.b(qVar);
        finishScrollWithVelocity(f11);
    }

    public void removeSpringView(int i10) {
        this.mSpringViews.delete(i10);
        invalidate();
    }

    public void setDampedScrollShift(float f10) {
        if (f10 != this.mDampedScrollShift) {
            this.mDampedScrollShift = f10;
            invalidate();
        }
    }

    public SpringRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpringRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mSpringViews = new SparseBooleanArray();
        this.mDampedScrollShift = 0.0f;
        j jVar = new j(this, DAMPED_SCROLL, 0.0f);
        this.mSpring = jVar;
        k kVar = new k(0.0f);
        kVar.i(STIFFNESS);
        kVar.g(0.5f);
        jVar.f113224G = kVar;
    }
}
