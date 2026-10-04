package t0;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* JADX INFO: renamed from: t0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5595a extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f238641n0;

    public C5595a(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.f238641n0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        ArrayList<Object> arrayList = this.f106036l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ConstraintReference constraintReferenceE = this.f106034j0.e(obj);
            constraintReferenceE.u();
            Object obj2 = this.f105960O;
            if (obj2 != null) {
                constraintReferenceE.A0(obj2);
            } else {
                Object obj3 = this.f105961P;
                if (obj3 != null) {
                    constraintReferenceE.z0(obj3);
                } else {
                    constraintReferenceE.A0(State.f106027j);
                }
            }
            Object obj4 = this.f105962Q;
            if (obj4 != null) {
                constraintReferenceE.A(obj4);
            } else {
                Object obj5 = this.f105963R;
                if (obj5 != null) {
                    constraintReferenceE.z(obj5);
                } else {
                    constraintReferenceE.z(State.f106027j);
                }
            }
            float f10 = this.f238641n0;
            if (f10 != 0.5f) {
                constraintReferenceE.X(f10);
            }
        }
    }
}
