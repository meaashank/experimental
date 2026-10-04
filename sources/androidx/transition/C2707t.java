package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2707t extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f119539d = 3.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f119540e = 80;

    @Override // androidx.transition.AbstractC2712y
    public long c(ViewGroup viewGroup, Transition transition, A a10, A a11) {
        int i10;
        int i11;
        int iCenterY;
        int i12;
        ViewGroup viewGroup2;
        int i13;
        int i14;
        int i15;
        A a12 = a10;
        if (a12 == null && a11 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (a11 == null || e(a12) == 0) {
            i10 = -1;
        } else {
            a12 = a11;
            i10 = 1;
        }
        int iF = f(a12);
        int iG = g(a12);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (epicenter != null) {
            int iCenterX = epicenter.centerX();
            i12 = iG;
            viewGroup2 = viewGroup;
            i13 = iRound2;
            i14 = iRound;
            i15 = height;
            iCenterY = epicenter.centerY();
            i11 = iCenterX;
        } else {
            i11 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i12 = iG;
            viewGroup2 = viewGroup;
            i13 = iRound2;
            i14 = iRound;
            i15 = height;
        }
        float fH = h(viewGroup2, iF, i12, i11, iCenterY, i14, i13, width, i15) / i(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i10)) / this.f119539d) * fH);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            int r0 = r5.f119540e
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 3
            r4 = 5
            if (r0 != r1) goto L14
            int r6 = androidx.core.view.C2507z0.c0(r6)
            if (r6 != r2) goto L12
        L10:
            r0 = r4
            goto L20
        L12:
            r0 = r3
            goto L20
        L14:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L20
            int r6 = androidx.core.view.C2507z0.c0(r6)
            if (r6 != r2) goto L10
            goto L12
        L20:
            if (r0 == r3) goto L46
            if (r0 == r4) goto L3e
            r6 = 48
            if (r0 == r6) goto L36
            r6 = 80
            if (r0 == r6) goto L2e
            r6 = 0
            return r6
        L2e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r8
            return r6
        L36:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r14
            return r6
        L3e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r7
            return r6
        L46:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r13
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C2707t.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    public final int i(ViewGroup viewGroup) {
        int i10 = this.f119540e;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void j(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f119539d = f10;
    }

    public void k(int i10) {
        this.f119540e = i10;
    }
}
