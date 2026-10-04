package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.u;

/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f107447a = "TransitionBuilder";

    public static u.b a(u scene, int transitionId, int startConstraintSetId, androidx.constraintlayout.widget.d startConstraintSet, int endConstraintSetId, androidx.constraintlayout.widget.d endConstraintSet) {
        u.b bVar = new u.b(transitionId, scene, startConstraintSetId, endConstraintSetId);
        b(scene, bVar, startConstraintSet, endConstraintSet);
        return bVar;
    }

    public static void b(u scene, u.b transition, androidx.constraintlayout.widget.d startConstraintSet, androidx.constraintlayout.widget.d endConstraintSet) {
        int I10 = transition.I();
        int iB = transition.B();
        scene.j0(I10, startConstraintSet);
        scene.j0(iB, endConstraintSet);
    }

    public static void c(MotionLayout layout) {
        u uVar = layout.f106732a;
        if (uVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!uVar.s0(layout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (uVar.f107278c == null || uVar.s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
