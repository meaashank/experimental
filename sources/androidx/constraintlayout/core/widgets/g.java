package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f106482a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f106483b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f106484c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f106485d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f106486e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f106487f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f106488g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f106489h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106490i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f106491j = 256;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f106492k = 512;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f106493l = 1024;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f106494m = 257;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean[] f106495n = new boolean[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f106496o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f106497p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f106498q = 2;

    public static void a(d dVar, androidx.constraintlayout.core.d dVar2, ConstraintWidget constraintWidget) {
        constraintWidget.f106227t = -1;
        constraintWidget.f106229u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f106192b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f106192b0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i10 = constraintWidget.f106175Q.f106107g;
            int iM0 = dVar.m0() - constraintWidget.f106179S.f106107g;
            ConstraintAnchor constraintAnchor = constraintWidget.f106175Q;
            constraintAnchor.f106109i = dVar2.u(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f106179S;
            constraintAnchor2.f106109i = dVar2.u(constraintAnchor2);
            dVar2.f(constraintWidget.f106175Q.f106109i, i10);
            dVar2.f(constraintWidget.f106179S.f106109i, iM0);
            constraintWidget.f106227t = 2;
            constraintWidget.C1(i10, iM0);
        }
        if (dVar.f106192b0[1] == dimensionBehaviour2 || constraintWidget.f106192b0[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i11 = constraintWidget.f106177R.f106107g;
        int iD = dVar.D() - constraintWidget.f106181T.f106107g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f106177R;
        constraintAnchor3.f106109i = dVar2.u(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f106181T;
        constraintAnchor4.f106109i = dVar2.u(constraintAnchor4);
        dVar2.f(constraintWidget.f106177R.f106109i, i11);
        dVar2.f(constraintWidget.f106181T.f106109i, iD);
        if (constraintWidget.f106216n0 > 0 || constraintWidget.l0() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f106183U;
            constraintAnchor5.f106109i = dVar2.u(constraintAnchor5);
            dVar2.f(constraintWidget.f106183U.f106109i, constraintWidget.f106216n0 + i11);
        }
        constraintWidget.f106229u = 2;
        constraintWidget.X1(i11, iD);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
