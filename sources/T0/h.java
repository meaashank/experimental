package t0;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238657a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f238657a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f238657a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f238657a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        ArrayList<Object> arrayList = this.f106036l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f106034j0.e(obj).v();
        }
        ArrayList<Object> arrayList2 = this.f106036l0;
        int size2 = arrayList2.size();
        ConstraintReference constraintReference = null;
        int i11 = 0;
        ConstraintReference constraintReference2 = null;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            ConstraintReference constraintReferenceE = this.f106034j0.e(obj2);
            if (constraintReference2 == null) {
                Object obj3 = this.f105964S;
                if (obj3 != null) {
                    constraintReferenceE.D0(obj3).b0(this.f105995o).d0(this.f106001u);
                } else {
                    Object obj4 = this.f105965T;
                    if (obj4 != null) {
                        constraintReferenceE.C0(obj4).b0(this.f105995o).d0(this.f106001u);
                    } else {
                        constraintReferenceE.D0(State.f106027j);
                    }
                }
                constraintReference2 = constraintReferenceE;
            }
            if (constraintReference != null) {
                constraintReference.p(constraintReferenceE.getKey());
                constraintReferenceE.C0(constraintReference.getKey());
            }
            constraintReference = constraintReferenceE;
        }
        if (constraintReference != null) {
            Object obj5 = this.f105966U;
            if (obj5 != null) {
                constraintReference.p(obj5).b0(this.f105996p).d0(this.f106002v);
            } else {
                Object obj6 = this.f105967V;
                if (obj6 != null) {
                    constraintReference.o(obj6).b0(this.f105996p).d0(this.f106002v);
                } else {
                    constraintReference.o(State.f106027j);
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f10 = this.f238647n0;
        if (f10 != 0.5f) {
            constraintReference2.I0(f10);
        }
        int i12 = a.f238657a[this.f238648o0.ordinal()];
        if (i12 == 1) {
            constraintReference2.u0(0);
        } else if (i12 == 2) {
            constraintReference2.u0(1);
        } else {
            if (i12 != 3) {
                return;
            }
            constraintReference2.u0(2);
        }
    }
}
