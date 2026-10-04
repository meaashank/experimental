package t0;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import u0.C5634b;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public State.Direction f238643n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f238644o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f238645p0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238646a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f238646a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f238646a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f238646a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f238646a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f238646a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f238646a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.a
    public C5634b M0() {
        if (this.f238645p0 == null) {
            this.f238645p0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.f238645p0;
    }

    public void P0(State.Direction direction) {
        this.f238643n0 = direction;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        M0();
        int i10 = a.f238646a[this.f238643n0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.f238645p0.u2(i11);
        this.f238645p0.v2(this.f238644o0);
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference b0(int i10) {
        this.f238644o0 = i10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference c0(Object obj) {
        b0(this.f106034j0.f(obj));
        return this;
    }
}
