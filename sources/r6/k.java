package r6;

import com.prism.commons.utils.s0;
import com.prism.commons.utils.x0;

/* JADX INFO: loaded from: classes5.dex */
public class k<T> extends AbstractC5535c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0<T> f227251d;

    public k(s0<T> s0Var) {
        super(false);
        this.f227251d = s0Var;
    }

    @Override // r6.AbstractC5535c
    public T f() {
        return o();
    }

    public T o() {
        return this.f227251d.a();
    }

    public void p(T t10) {
        T tO = o();
        this.f227251d.b(t10);
        if (tO != t10) {
            c(t10);
        }
    }

    public k(x0<T> x0Var) {
        this(x0Var, false);
    }

    public k(x0<T> x0Var, boolean z10) {
        super(z10);
        this.f227251d = new s0<>(x0Var, x0Var);
    }
}
