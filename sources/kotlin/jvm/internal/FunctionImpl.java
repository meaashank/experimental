package kotlin.jvm.internal;

import ed.InterfaceC4376a;
import ed.InterfaceC4377b;
import ed.InterfaceC4378c;
import ed.InterfaceC4379d;
import java.io.Serializable;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4982o(level = DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@Deprecated
public abstract class FunctionImpl implements kotlin.A, Serializable, InterfaceC4376a, ed.l, ed.p, ed.q, ed.r, ed.s, ed.t, ed.u, ed.v, ed.w, InterfaceC4377b, InterfaceC4378c, InterfaceC4379d, ed.e, ed.f, ed.g, ed.h, ed.i, ed.j, ed.k, ed.m, ed.n, ed.o {
    @Override // ed.o
    public Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        e(22);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
        throw null;
    }

    @Override // ed.t
    public Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        e(6);
        g(obj, obj2, obj3, obj4, obj5, obj6);
        throw null;
    }

    @Override // ed.f
    public Object G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        e(14);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
        throw null;
    }

    @Override // ed.i
    public Object H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        e(17);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
        throw null;
    }

    @Override // ed.u
    public Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        e(7);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7);
        throw null;
    }

    @Override // ed.g
    public Object L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        e(15);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
        throw null;
    }

    @Override // ed.j
    public Object M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        e(18);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
        throw null;
    }

    @Override // ed.w
    public Object S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        e(9);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        throw null;
    }

    @Override // ed.InterfaceC4377b
    public Object T(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        e(10);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        throw null;
    }

    @Override // ed.InterfaceC4378c
    public Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        e(11);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
        throw null;
    }

    @Override // ed.m
    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        e(20);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
        throw null;
    }

    @Override // ed.e
    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        e(13);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
        throw null;
    }

    public final void e(int i10) {
        if (getArity() == i10) {
            return;
        }
        h(i10);
        throw null;
    }

    public Object g(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    public abstract int getArity();

    public final void h(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Wrong function arity, expected: ", i10, ", actual: ");
        sbA.append(getArity());
        throw new IllegalStateException(sbA.toString());
    }

    @Override // ed.InterfaceC4376a
    public Object invoke() {
        e(0);
        g(new Object[0]);
        throw null;
    }

    @Override // ed.InterfaceC4379d
    public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        e(12);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
        throw null;
    }

    @Override // ed.k
    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        e(19);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
        throw null;
    }

    @Override // ed.h
    public Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        e(16);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
        throw null;
    }

    @Override // ed.s
    public Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        e(5);
        g(obj, obj2, obj3, obj4, obj5);
        throw null;
    }

    @Override // ed.n
    public Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        e(21);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
        throw null;
    }

    @Override // ed.r
    public Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        e(4);
        g(obj, obj2, obj3, obj4);
        throw null;
    }

    @Override // ed.v
    public Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        e(8);
        g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        throw null;
    }

    @Override // ed.l
    public Object invoke(Object obj) {
        e(1);
        g(obj);
        throw null;
    }

    @Override // ed.p
    public Object invoke(Object obj, Object obj2) {
        e(2);
        g(obj, obj2);
        throw null;
    }

    @Override // ed.q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        e(3);
        g(obj, obj2, obj3);
        throw null;
    }
}
