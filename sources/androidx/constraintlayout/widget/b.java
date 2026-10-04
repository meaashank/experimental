package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f107813c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f107814d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f107815e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f107816f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f107817g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f107818h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f107819i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f107820j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f107821k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f107822l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f107823m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f107824n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f107825o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintLayout.LayoutParams f107826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f107827b;

    public b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f107826a = (ConstraintLayout.LayoutParams) layoutParams;
        this.f107827b = view;
    }

    public b A(float weight) {
        this.f107826a.f107634L = weight;
        return this;
    }

    public b B(int anchor, int value) {
        switch (anchor) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f107826a).leftMargin = value;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f107826a).rightMargin = value;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f107826a).topMargin = value;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f107826a).bottomMargin = value;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f107826a.setMarginStart(value);
                return this;
            case 7:
                this.f107826a.setMarginEnd(value);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public b C(int anchor) {
        switch (anchor) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.f107826a;
                layoutParams.f107659f = -1;
                layoutParams.f107657e = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.f107693w = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.f107826a;
                layoutParams2.f107663h = -1;
                layoutParams2.f107661g = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.f107696y = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.f107826a;
                layoutParams3.f107667j = -1;
                layoutParams3.f107665i = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.f107695x = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.f107826a;
                layoutParams4.f107669k = -1;
                layoutParams4.f107671l = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.f107697z = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f107826a.f107673m = -1;
                return this;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.f107826a;
                layoutParams5.f107685s = -1;
                layoutParams5.f107687t = -1;
                layoutParams5.setMarginStart(-1);
                this.f107826a.f107623A = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.f107826a;
                layoutParams6.f107689u = -1;
                layoutParams6.f107691v = -1;
                layoutParams6.setMarginEnd(-1);
                this.f107826a.f107624B = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public b D() {
        ConstraintLayout.LayoutParams layoutParams = this.f107826a;
        int i10 = layoutParams.f107659f;
        int i11 = layoutParams.f107661g;
        if (i10 != -1 || i11 != -1) {
            b bVar = new b(((ViewGroup) this.f107827b.getParent()).findViewById(i10));
            b bVar2 = new b(((ViewGroup) this.f107827b.getParent()).findViewById(i11));
            ConstraintLayout.LayoutParams layoutParams2 = this.f107826a;
            if (i10 != -1 && i11 != -1) {
                bVar.m(2, i11, 1, 0);
                bVar2.m(1, i10, 2, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = layoutParams2.f107663h;
                if (i12 != -1) {
                    bVar.m(2, i12, 2, 0);
                } else {
                    int i13 = layoutParams2.f107657e;
                    if (i13 != -1) {
                        bVar2.m(1, i13, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
            return this;
        }
        int i14 = layoutParams.f107685s;
        int i15 = layoutParams.f107689u;
        if (i14 != -1 || i15 != -1) {
            b bVar3 = new b(((ViewGroup) this.f107827b.getParent()).findViewById(i14));
            b bVar4 = new b(((ViewGroup) this.f107827b.getParent()).findViewById(i15));
            ConstraintLayout.LayoutParams layoutParams3 = this.f107826a;
            if (i14 != -1 && i15 != -1) {
                bVar3.m(7, i15, 6, 0);
                bVar4.m(6, i10, 7, 0);
            } else if (i10 != -1 || i15 != -1) {
                int i16 = layoutParams3.f107663h;
                if (i16 != -1) {
                    bVar3.m(7, i16, 7, 0);
                } else {
                    int i17 = layoutParams3.f107657e;
                    if (i17 != -1) {
                        bVar4.m(6, i17, 6, 0);
                    }
                }
            }
        }
        C(6);
        C(7);
        return this;
    }

    public b E() {
        ConstraintLayout.LayoutParams layoutParams = this.f107826a;
        int i10 = layoutParams.f107667j;
        int i11 = layoutParams.f107669k;
        if (i10 != -1 || i11 != -1) {
            b bVar = new b(((ViewGroup) this.f107827b.getParent()).findViewById(i10));
            b bVar2 = new b(((ViewGroup) this.f107827b.getParent()).findViewById(i11));
            ConstraintLayout.LayoutParams layoutParams2 = this.f107826a;
            if (i10 != -1 && i11 != -1) {
                bVar.m(4, i11, 3, 0);
                bVar2.m(3, i10, 4, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = layoutParams2.f107671l;
                if (i12 != -1) {
                    bVar.m(4, i12, 4, 0);
                } else {
                    int i13 = layoutParams2.f107665i;
                    if (i13 != -1) {
                        bVar2.m(3, i13, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public b F(float rotation) {
        this.f107827b.setRotation(rotation);
        return this;
    }

    public b G(float rotationX) {
        this.f107827b.setRotationX(rotationX);
        return this;
    }

    public b H(float rotationY) {
        this.f107827b.setRotationY(rotationY);
        return this;
    }

    public b I(float scaleX) {
        this.f107827b.setScaleY(scaleX);
        return this;
    }

    public b J(float scaleY) {
        return this;
    }

    public final String K(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public b L(float transformPivotX, float transformPivotY) {
        this.f107827b.setPivotX(transformPivotX);
        this.f107827b.setPivotY(transformPivotY);
        return this;
    }

    public b M(float transformPivotX) {
        this.f107827b.setPivotX(transformPivotX);
        return this;
    }

    public b N(float transformPivotY) {
        this.f107827b.setPivotY(transformPivotY);
        return this;
    }

    public b O(float translationX, float translationY) {
        this.f107827b.setTranslationX(translationX);
        this.f107827b.setTranslationY(translationY);
        return this;
    }

    public b P(float translationX) {
        this.f107827b.setTranslationX(translationX);
        return this;
    }

    public b Q(float translationY) {
        this.f107827b.setTranslationY(translationY);
        return this;
    }

    public b R(float translationZ) {
        this.f107827b.setTranslationZ(translationZ);
        return this;
    }

    public b S(float bias) {
        this.f107826a.f107630H = bias;
        return this;
    }

    public b T(int chainStyle) {
        this.f107826a.f107637O = chainStyle;
        return this;
    }

    public b U(float weight) {
        this.f107826a.f107635M = weight;
        return this;
    }

    public b V(int visibility) {
        this.f107827b.setVisibility(visibility);
        return this;
    }

    public b a(int leftId, int rightId) {
        m(1, leftId, leftId == 0 ? 1 : 2, 0);
        m(2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            new b(((ViewGroup) this.f107827b.getParent()).findViewById(leftId)).m(2, this.f107827b.getId(), 1, 0);
        }
        if (rightId != 0) {
            new b(((ViewGroup) this.f107827b.getParent()).findViewById(rightId)).m(1, this.f107827b.getId(), 2, 0);
        }
        return this;
    }

    public b b(int leftId, int rightId) {
        m(6, leftId, leftId == 0 ? 6 : 7, 0);
        m(7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            new b(((ViewGroup) this.f107827b.getParent()).findViewById(leftId)).m(7, this.f107827b.getId(), 6, 0);
        }
        if (rightId != 0) {
            new b(((ViewGroup) this.f107827b.getParent()).findViewById(rightId)).m(6, this.f107827b.getId(), 7, 0);
        }
        return this;
    }

    public b c(int topId, int bottomId) {
        m(3, topId, topId == 0 ? 3 : 4, 0);
        m(4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            new b(((ViewGroup) this.f107827b.getParent()).findViewById(topId)).m(4, this.f107827b.getId(), 3, 0);
        }
        if (bottomId != 0) {
            new b(((ViewGroup) this.f107827b.getParent()).findViewById(bottomId)).m(3, this.f107827b.getId(), 4, 0);
        }
        return this;
    }

    public b d(float alpha) {
        this.f107827b.setAlpha(alpha);
        return this;
    }

    public void e() {
    }

    public b f(int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            m(1, firstID, firstSide, firstMargin);
            m(2, secondId, secondSide, secondMargin);
            this.f107826a.f107629G = bias;
            return this;
        }
        if (firstSide == 6 || firstSide == 7) {
            m(6, firstID, firstSide, firstMargin);
            m(7, secondId, secondSide, secondMargin);
            this.f107826a.f107629G = bias;
            return this;
        }
        m(3, firstID, firstSide, firstMargin);
        m(4, secondId, secondSide, secondMargin);
        this.f107826a.f107630H = bias;
        return this;
    }

    public b g(int toView) {
        if (toView == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        f(toView, 2, 0, toView, 1, 0, 0.5f);
        return this;
    }

    public b h(int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        m(1, leftId, leftSide, leftMargin);
        m(2, rightId, rightSide, rightMargin);
        this.f107826a.f107629G = bias;
        return this;
    }

    public b i(int toView) {
        if (toView == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        f(toView, 7, 0, toView, 6, 0, 0.5f);
        return this;
    }

    public b j(int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        m(6, startId, startSide, startMargin);
        m(7, endId, endSide, endMargin);
        this.f107826a.f107629G = bias;
        return this;
    }

    public b k(int toView) {
        if (toView == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        f(toView, 4, 0, toView, 3, 0, 0.5f);
        return this;
    }

    public b l(int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        m(3, topId, topSide, topMargin);
        m(4, bottomId, bottomSide, bottomMargin);
        this.f107826a.f107630H = bias;
        return this;
    }

    public b m(int startSide, int endID, int endSide, int margin) {
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    ConstraintLayout.LayoutParams layoutParams = this.f107826a;
                    layoutParams.f107657e = endID;
                    layoutParams.f107659f = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("Left to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = this.f107826a;
                    layoutParams2.f107659f = endID;
                    layoutParams2.f107657e = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f107826a).leftMargin = margin;
                return this;
            case 2:
                if (endSide == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.f107826a;
                    layoutParams3.f107661g = endID;
                    layoutParams3.f107663h = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = this.f107826a;
                    layoutParams4.f107663h = endID;
                    layoutParams4.f107661g = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f107826a).rightMargin = margin;
                return this;
            case 3:
                if (endSide == 3) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.f107826a;
                    layoutParams5.f107665i = endID;
                    layoutParams5.f107667j = -1;
                    layoutParams5.f107673m = -1;
                    layoutParams5.f107675n = -1;
                    layoutParams5.f107677o = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = this.f107826a;
                    layoutParams6.f107667j = endID;
                    layoutParams6.f107665i = -1;
                    layoutParams6.f107673m = -1;
                    layoutParams6.f107675n = -1;
                    layoutParams6.f107677o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f107826a).topMargin = margin;
                return this;
            case 4:
                if (endSide == 4) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.f107826a;
                    layoutParams7.f107671l = endID;
                    layoutParams7.f107669k = -1;
                    layoutParams7.f107673m = -1;
                    layoutParams7.f107675n = -1;
                    layoutParams7.f107677o = -1;
                } else {
                    if (endSide != 3) {
                        throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams8 = this.f107826a;
                    layoutParams8.f107669k = endID;
                    layoutParams8.f107671l = -1;
                    layoutParams8.f107673m = -1;
                    layoutParams8.f107675n = -1;
                    layoutParams8.f107677o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f107826a).bottomMargin = margin;
                return this;
            case 5:
                if (endSide == 5) {
                    ConstraintLayout.LayoutParams layoutParams9 = this.f107826a;
                    layoutParams9.f107673m = endID;
                    layoutParams9.f107671l = -1;
                    layoutParams9.f107669k = -1;
                    layoutParams9.f107665i = -1;
                    layoutParams9.f107667j = -1;
                }
                if (endSide == 3) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.f107826a;
                    layoutParams10.f107675n = endID;
                    layoutParams10.f107671l = -1;
                    layoutParams10.f107669k = -1;
                    layoutParams10.f107665i = -1;
                    layoutParams10.f107667j = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = this.f107826a;
                    layoutParams11.f107677o = endID;
                    layoutParams11.f107671l = -1;
                    layoutParams11.f107669k = -1;
                    layoutParams11.f107665i = -1;
                    layoutParams11.f107667j = -1;
                }
                this.f107826a.f107626D = margin;
                return this;
            case 6:
                if (endSide == 6) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.f107826a;
                    layoutParams12.f107687t = endID;
                    layoutParams12.f107685s = -1;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams13 = this.f107826a;
                    layoutParams13.f107685s = endID;
                    layoutParams13.f107687t = -1;
                }
                this.f107826a.setMarginStart(margin);
                return this;
            case 7:
                if (endSide == 7) {
                    ConstraintLayout.LayoutParams layoutParams14 = this.f107826a;
                    layoutParams14.f107691v = endID;
                    layoutParams14.f107689u = -1;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams15 = this.f107826a;
                    layoutParams15.f107689u = endID;
                    layoutParams15.f107691v = -1;
                }
                this.f107826a.setMarginEnd(margin);
                return this;
            default:
                throw new IllegalArgumentException(K(startSide) + " to " + K(endSide) + " unknown");
        }
    }

    public b n(int height) {
        this.f107826a.f107639Q = height;
        return this;
    }

    public b o(int width) {
        this.f107826a.f107638P = width;
        return this;
    }

    public b p(int height) {
        ((ViewGroup.MarginLayoutParams) this.f107826a).height = height;
        return this;
    }

    public b q(int height) {
        this.f107826a.f107643U = height;
        return this;
    }

    public b r(int width) {
        this.f107826a.f107642T = width;
        return this;
    }

    public b s(int height) {
        this.f107826a.f107641S = height;
        return this;
    }

    public b t(int width) {
        this.f107826a.f107640R = width;
        return this;
    }

    public b u(int width) {
        ((ViewGroup.MarginLayoutParams) this.f107826a).width = width;
        return this;
    }

    public b v(String ratio) {
        this.f107826a.f107631I = ratio;
        return this;
    }

    public b w(float elevation) {
        this.f107827b.setElevation(elevation);
        return this;
    }

    public b x(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.f107826a.f107693w = value;
                return this;
            case 2:
                this.f107826a.f107696y = value;
                return this;
            case 3:
                this.f107826a.f107695x = value;
                return this;
            case 4:
                this.f107826a.f107697z = value;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f107826a.f107623A = value;
                return this;
            case 7:
                this.f107826a.f107624B = value;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public b y(float bias) {
        this.f107826a.f107629G = bias;
        return this;
    }

    public b z(int chainStyle) {
        this.f107826a.f107636N = chainStyle;
        return this;
    }
}
