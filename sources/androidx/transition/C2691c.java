package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2691c extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f117834d = 3.0f;

    public static float h(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f15 * f15) + (f14 * f14));
    }

    @Override // androidx.transition.AbstractC2712y
    public long c(ViewGroup viewGroup, Transition transition, A a10, A a11) {
        int i10;
        int iRound;
        int iCenterX;
        if (a10 == null && a11 == null) {
            return 0L;
        }
        if (a11 == null || e(a10) == 0) {
            i10 = -1;
        } else {
            a10 = a11;
            i10 = 1;
        }
        int iF = f(a10);
        int iG = g(a10);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r5[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r5[1]);
            iCenterX = iRound2;
        }
        float fH = h(iF, iG, iCenterX, iRound) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i10)) / this.f117834d) * fH);
    }

    public void i(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f117834d = f10;
    }
}
