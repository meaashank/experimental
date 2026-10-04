package t0;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class f implements e, androidx.constraintlayout.core.state.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State f238649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f238650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.f f238651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f238652d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f238653e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f238654f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f238655g;

    public f(State state) {
        this.f238649a = state;
    }

    @Override // t0.e, androidx.constraintlayout.core.state.c
    public ConstraintWidget a() {
        if (this.f238651c == null) {
            this.f238651c = new androidx.constraintlayout.core.widgets.f();
        }
        return this.f238651c;
    }

    @Override // t0.e, androidx.constraintlayout.core.state.c
    public void apply() {
        this.f238651c.B2(this.f238650b);
        int i10 = this.f238652d;
        if (i10 != -1) {
            this.f238651c.w2(i10);
            return;
        }
        int i11 = this.f238653e;
        if (i11 != -1) {
            this.f238651c.x2(i11);
        } else {
            this.f238651c.y2(this.f238654f);
        }
    }

    @Override // androidx.constraintlayout.core.state.c
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            this.f238651c = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        } else {
            this.f238651c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.c
    public void c(Object obj) {
        this.f238655g = obj;
    }

    @Override // androidx.constraintlayout.core.state.c
    public e d() {
        return null;
    }

    public f e(Object obj) {
        this.f238652d = -1;
        this.f238653e = this.f238649a.f(obj);
        this.f238654f = 0.0f;
        return this;
    }

    public int f() {
        return this.f238650b;
    }

    public f g(float f10) {
        this.f238652d = -1;
        this.f238653e = -1;
        this.f238654f = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public Object getKey() {
        return this.f238655g;
    }

    public void h(int i10) {
        this.f238650b = i10;
    }

    public f i(Object obj) {
        this.f238652d = this.f238649a.f(obj);
        this.f238653e = -1;
        this.f238654f = 0.0f;
        return this;
    }
}
