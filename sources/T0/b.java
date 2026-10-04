package t0;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f238642n0;

    public b(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.f238642n0 = 0.5f;
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
            constraintReferenceE.v();
            Object obj2 = this.f105964S;
            if (obj2 != null) {
                constraintReferenceE.D0(obj2);
            } else {
                Object obj3 = this.f105965T;
                if (obj3 != null) {
                    constraintReferenceE.C0(obj3);
                } else {
                    constraintReferenceE.D0(State.f106027j);
                }
            }
            Object obj4 = this.f105966U;
            if (obj4 != null) {
                constraintReferenceE.p(obj4);
            } else {
                Object obj5 = this.f105967V;
                if (obj5 != null) {
                    constraintReferenceE.o(obj5);
                } else {
                    constraintReferenceE.o(State.f106027j);
                }
            }
            float f10 = this.f238642n0;
            if (f10 != 0.5f) {
                constraintReferenceE.I0(f10);
            }
        }
    }
}
