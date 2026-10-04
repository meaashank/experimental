package kotlin.jvm.internal;

import ed.InterfaceC4376a;
import ed.InterfaceC4377b;
import ed.InterfaceC4378c;
import ed.InterfaceC4379d;
import fd.InterfaceC4418a;
import fd.InterfaceC4419b;
import fd.InterfaceC4420c;
import fd.InterfaceC4421d;
import fd.InterfaceC4422e;
import fd.InterfaceC4423f;
import fd.InterfaceC4424g;
import fd.InterfaceC4425h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class Y {
    public static int A(Object obj) {
        if (obj instanceof C) {
            return ((C) obj).getArity();
        }
        if (obj instanceof InterfaceC4376a) {
            return 0;
        }
        if (obj instanceof ed.l) {
            return 1;
        }
        if (obj instanceof ed.p) {
            return 2;
        }
        if (obj instanceof ed.q) {
            return 3;
        }
        if (obj instanceof ed.r) {
            return 4;
        }
        if (obj instanceof ed.s) {
            return 5;
        }
        if (obj instanceof ed.t) {
            return 6;
        }
        if (obj instanceof ed.u) {
            return 7;
        }
        if (obj instanceof ed.v) {
            return 8;
        }
        if (obj instanceof ed.w) {
            return 9;
        }
        if (obj instanceof InterfaceC4377b) {
            return 10;
        }
        if (obj instanceof InterfaceC4378c) {
            return 11;
        }
        if (obj instanceof InterfaceC4379d) {
            return 12;
        }
        if (obj instanceof ed.e) {
            return 13;
        }
        if (obj instanceof ed.f) {
            return 14;
        }
        if (obj instanceof ed.g) {
            return 15;
        }
        if (obj instanceof ed.h) {
            return 16;
        }
        if (obj instanceof ed.i) {
            return 17;
        }
        if (obj instanceof ed.j) {
            return 18;
        }
        if (obj instanceof ed.k) {
            return 19;
        }
        if (obj instanceof ed.m) {
            return 20;
        }
        if (obj instanceof ed.n) {
            return 21;
        }
        return obj instanceof ed.o ? 22 : -1;
    }

    public static boolean B(Object obj, int i10) {
        return (obj instanceof kotlin.A) && A(obj) == i10;
    }

    public static boolean C(Object obj) {
        if (obj instanceof Collection) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4419b);
        }
        return false;
    }

    public static boolean D(Object obj) {
        if (obj instanceof Iterable) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4420c);
        }
        return false;
    }

    public static boolean E(Object obj) {
        if (obj instanceof Iterator) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4421d);
        }
        return false;
    }

    public static boolean F(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4422e);
        }
        return false;
    }

    public static boolean G(Object obj) {
        if (obj instanceof ListIterator) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4423f);
        }
        return false;
    }

    public static boolean H(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4424g);
        }
        return false;
    }

    public static boolean I(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4424g.a);
        }
        return false;
    }

    public static boolean J(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4425h);
        }
        return false;
    }

    public static <T extends Throwable> T K(T t10) {
        G.B(t10, Y.class.getName());
        return t10;
    }

    public static ClassCastException L(ClassCastException classCastException) {
        K(classCastException);
        throw classCastException;
    }

    public static void M(Object obj, String str) {
        N((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        throw null;
    }

    public static void N(String str) {
        ClassCastException classCastException = new ClassCastException(str);
        K(classCastException);
        throw classCastException;
    }

    public static Collection a(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4419b)) {
            return s(obj);
        }
        M(obj, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Collection b(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4419b)) {
            return s(obj);
        }
        N(str);
        throw null;
    }

    public static Iterable c(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4420c)) {
            return t(obj);
        }
        M(obj, "kotlin.collections.MutableIterable");
        throw null;
    }

    public static Iterable d(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4420c)) {
            return t(obj);
        }
        N(str);
        throw null;
    }

    public static Iterator e(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4421d)) {
            return u(obj);
        }
        M(obj, "kotlin.collections.MutableIterator");
        throw null;
    }

    public static Iterator f(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4421d)) {
            return u(obj);
        }
        N(str);
        throw null;
    }

    public static List g(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4422e)) {
            return v(obj);
        }
        M(obj, "kotlin.collections.MutableList");
        throw null;
    }

    public static List h(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4422e)) {
            return v(obj);
        }
        N(str);
        throw null;
    }

    public static ListIterator i(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4423f)) {
            return w(obj);
        }
        M(obj, "kotlin.collections.MutableListIterator");
        throw null;
    }

    public static ListIterator j(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4423f)) {
            return w(obj);
        }
        N(str);
        throw null;
    }

    public static Map k(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4424g)) {
            return x(obj);
        }
        M(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    public static Map l(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4424g)) {
            return x(obj);
        }
        N(str);
        throw null;
    }

    public static Map.Entry m(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4424g.a)) {
            return y(obj);
        }
        M(obj, "kotlin.collections.MutableMap.MutableEntry");
        throw null;
    }

    public static Map.Entry n(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4424g.a)) {
            return y(obj);
        }
        N(str);
        throw null;
    }

    public static Set o(Object obj) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4425h)) {
            return z(obj);
        }
        M(obj, "kotlin.collections.MutableSet");
        throw null;
    }

    public static Set p(Object obj, String str) {
        if (!(obj instanceof InterfaceC4418a) || (obj instanceof InterfaceC4425h)) {
            return z(obj);
        }
        N(str);
        throw null;
    }

    public static Object q(Object obj, int i10) {
        if (obj == null || B(obj, i10)) {
            return obj;
        }
        M(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static Object r(Object obj, int i10, String str) {
        if (obj == null || B(obj, i10)) {
            return obj;
        }
        N(str);
        throw null;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            K(e10);
            throw e10;
        }
    }
}
