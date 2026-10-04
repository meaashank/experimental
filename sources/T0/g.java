package t0;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238656a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f238656a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f238656a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f238656a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        ArrayList<Object> arrayList = this.f106036l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f106034j0.e(obj).u();
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
                Object obj3 = this.f105960O;
                if (obj3 != null) {
                    constraintReferenceE.A0(obj3).b0(this.f105993m).d0(this.f105999s);
                } else {
                    Object obj4 = this.f105961P;
                    if (obj4 != null) {
                        constraintReferenceE.z0(obj4).b0(this.f105993m).d0(this.f105999s);
                    } else {
                        Object obj5 = this.f105956K;
                        if (obj5 != null) {
                            constraintReferenceE.A0(obj5).b0(this.f105991k).d0(this.f105997q);
                        } else {
                            Object obj6 = this.f105957L;
                            if (obj6 != null) {
                                constraintReferenceE.z0(obj6).b0(this.f105991k).d0(this.f105997q);
                            } else {
                                constraintReferenceE.A0(State.f106027j);
                            }
                        }
                    }
                }
                constraintReference2 = constraintReferenceE;
            }
            if (constraintReference != null) {
                constraintReference.A(constraintReferenceE.getKey());
                constraintReferenceE.z0(constraintReference.getKey());
            }
            constraintReference = constraintReferenceE;
        }
        if (constraintReference != null) {
            Object obj7 = this.f105962Q;
            if (obj7 != null) {
                constraintReference.A(obj7).b0(this.f105994n).d0(this.f106000t);
            } else {
                Object obj8 = this.f105963R;
                if (obj8 != null) {
                    constraintReference.z(obj8).b0(this.f105994n).d0(this.f106000t);
                } else {
                    Object obj9 = this.f105958M;
                    if (obj9 != null) {
                        constraintReference.A(obj9).b0(this.f105992l).d0(this.f105998r);
                    } else {
                        Object obj10 = this.f105959N;
                        if (obj10 != null) {
                            constraintReference.z(obj10).b0(this.f105992l).d0(this.f105998r);
                        } else {
                            constraintReference.z(State.f106027j);
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f10 = this.f238647n0;
        if (f10 != 0.5f) {
            constraintReference2.X(f10);
        }
        int i12 = a.f238656a[this.f238648o0.ordinal()];
        if (i12 == 1) {
            constraintReference2.r0(0);
        } else if (i12 == 2) {
            constraintReference2.r0(1);
        } else {
            if (i12 != 3) {
                return;
            }
            constraintReference2.r0(2);
        }
    }
}
