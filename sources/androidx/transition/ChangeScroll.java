package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeScroll extends Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f117689a = "android:changeScroll:x";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117690b = "android:changeScroll:y";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f117691c = {f117689a, f117690b};

    public ChangeScroll() {
    }

    private void captureValues(A a10) {
        a10.f117611a.put(f117689a, Integer.valueOf(a10.f117612b.getScrollX()));
        a10.f117611a.put(f117690b, Integer.valueOf(a10.f117612b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable A a10, @Nullable A a11) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (a10 == null || a11 == null) {
            return null;
        }
        View view = a11.f117612b;
        int iIntValue = ((Integer) a10.f117611a.get(f117689a)).intValue();
        int iIntValue2 = ((Integer) a11.f117611a.get(f117689a)).intValue();
        int iIntValue3 = ((Integer) a10.f117611a.get(f117690b)).intValue();
        int iIntValue4 = ((Integer) a11.f117611a.get(f117690b)).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return C2713z.c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f117691c;
    }

    public ChangeScroll(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
