package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Collections;
import u0.C5634b;

/* JADX INFO: loaded from: classes.dex */
public class a extends ConstraintReference implements t0.e {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final State f106034j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final State.Helper f106035k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ArrayList<Object> f106036l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public C5634b f106037m0;

    public a(State state, State.Helper helper) {
        super(state);
        this.f106036l0 = new ArrayList<>();
        this.f106034j0 = state;
        this.f106035k0 = helper;
    }

    public a L0(Object... objArr) {
        Collections.addAll(this.f106036l0, objArr);
        return this;
    }

    public C5634b M0() {
        return this.f106037m0;
    }

    public State.Helper N0() {
        return this.f106035k0;
    }

    public void O0(C5634b c5634b) {
        this.f106037m0 = c5634b;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public ConstraintWidget a() {
        return M0();
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
    }
}
