package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.C2705q;

/* JADX INFO: loaded from: classes2.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f117729b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f117730c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f117731d = "android:explode:screenBounds";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f117732a;

    public Explode() {
        this.f117732a = new int[2];
        setPropagation(new C2691c());
    }

    private void captureValues(A a10) {
        View view = a10.f117612b;
        view.getLocationOnScreen(this.f117732a);
        int[] iArr = this.f117732a;
        int i10 = iArr[0];
        int i11 = iArr[1];
        a10.f117611a.put(f117731d, new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    public static float u(float f10, float f11) {
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    public static float v(View view, int i10, int i11) {
        return u(Math.max(i10, view.getWidth() - i10), Math.max(i11, view.getHeight() - i11));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull A a10) {
        super.captureEndValues(a10);
        captureValues(a10);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        super.captureStartValues(a10);
        captureValues(a10);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(ViewGroup viewGroup, View view, A a10, A a11) {
        if (a11 == null) {
            return null;
        }
        Rect rect = (Rect) a11.f117611a.get(f117731d);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        w(viewGroup, rect, this.f117732a);
        int[] iArr = this.f117732a;
        return C.a(view, a11, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f117729b, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(ViewGroup viewGroup, View view, A a10, A a11) {
        float f10;
        float f11;
        if (a10 == null) {
            return null;
        }
        Rect rect = (Rect) a10.f117611a.get(f117731d);
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) a10.f117612b.getTag(C2705q.g.f118512T1);
        if (iArr != null) {
            f10 = (r7 - rect.left) + translationX;
            f11 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        w(viewGroup, rect, this.f117732a);
        int[] iArr2 = this.f117732a;
        return C.a(view, a10, i10, i11, translationX, translationY, f10 + iArr2[0], f11 + iArr2[1], f117730c, this);
    }

    public final void w(View view, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        view.getLocationOnScreen(this.f117732a);
        int[] iArr2 = this.f117732a;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            iCenterX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i10;
            iCenterY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i11;
        } else {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fU = u(fCenterX, fCenterY);
        float fV = v(view, iCenterX - i10, iCenterY - i11);
        iArr[0] = Math.round((fCenterX / fU) * fV);
        iArr[1] = Math.round(fV * (fCenterY / fU));
    }

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117732a = new int[2];
        setPropagation(new C2691c());
    }
}
