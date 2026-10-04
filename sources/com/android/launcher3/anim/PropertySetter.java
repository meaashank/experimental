package com.android.launcher3.anim;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class PropertySetter {
    public static final PropertySetter NO_ANIM_PROPERTY_SETTER = new PropertySetter();

    public static class AnimatedPropertySetter extends PropertySetter {
        private final long mDuration;
        private final AnimatorSetBuilder mStateAnimator;

        public AnimatedPropertySetter(long j10, AnimatorSetBuilder animatorSetBuilder) {
            this.mDuration = j10;
            this.mStateAnimator = animatorSetBuilder;
        }

        @Override // com.android.launcher3.anim.PropertySetter
        public <T> void setFloat(T t10, Property<T, Float> property, float f10, TimeInterpolator timeInterpolator) {
            if (property.get(t10).floatValue() == f10) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(t10, property, f10);
            objectAnimatorOfFloat.setDuration(this.mDuration).setInterpolator(timeInterpolator);
            this.mStateAnimator.play(objectAnimatorOfFloat);
        }

        @Override // com.android.launcher3.anim.PropertySetter
        public <T> void setInt(T t10, Property<T, Integer> property, int i10, TimeInterpolator timeInterpolator) {
            if (property.get(t10).intValue() == i10) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(t10, property, i10);
            objectAnimatorOfInt.setDuration(this.mDuration).setInterpolator(timeInterpolator);
            this.mStateAnimator.play(objectAnimatorOfInt);
        }

        @Override // com.android.launcher3.anim.PropertySetter
        public void setViewAlpha(View view, float f10, TimeInterpolator timeInterpolator) {
            if (view == null || view.getAlpha() == f10) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f10);
            objectAnimatorOfFloat.addListener(new AlphaUpdateListener(view));
            objectAnimatorOfFloat.setDuration(this.mDuration).setInterpolator(timeInterpolator);
            this.mStateAnimator.play(objectAnimatorOfFloat);
        }
    }

    public <T> void setFloat(T t10, Property<T, Float> property, float f10, TimeInterpolator timeInterpolator) {
        property.set(t10, Float.valueOf(f10));
    }

    public <T> void setInt(T t10, Property<T, Integer> property, int i10, TimeInterpolator timeInterpolator) {
        property.set(t10, Integer.valueOf(i10));
    }

    public void setViewAlpha(View view, float f10, TimeInterpolator timeInterpolator) {
        if (view != null) {
            view.setAlpha(f10);
            AlphaUpdateListener.updateVisibility(view);
        }
    }
}
