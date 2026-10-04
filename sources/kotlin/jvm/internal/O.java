package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.InterfaceC4887e0;
import kotlin.reflect.KVariance;

/* JADX INFO: loaded from: classes7.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f217893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f217894b = " (Kotlin reflection is not available)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlin.reflect.d[] f217895c;

    static {
        P p10 = null;
        try {
            p10 = (P) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p10 == null) {
            p10 = new P();
        }
        f217893a = p10;
        f217895c = new kotlin.reflect.d[0];
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r A(Class cls) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), Collections.EMPTY_LIST, false);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r B(Class cls, kotlin.reflect.t tVar) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), Collections.singletonList(tVar), false);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r C(Class cls, kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), Arrays.asList(tVar, tVar2), false);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r D(Class cls, kotlin.reflect.t... tVarArr) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), kotlin.collections.B.dz(tVarArr), false);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r E(kotlin.reflect.g gVar) {
        return f217893a.s(gVar, Collections.EMPTY_LIST, false);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.s F(Object obj, String str, KVariance kVariance, boolean z10) {
        return f217893a.t(obj, str, kVariance, z10);
    }

    public static kotlin.reflect.d a(Class cls) {
        return f217893a.a(cls);
    }

    public static kotlin.reflect.d b(Class cls, String str) {
        return f217893a.b(cls, str);
    }

    public static kotlin.reflect.i c(FunctionReference functionReference) {
        return f217893a.c(functionReference);
    }

    public static kotlin.reflect.d d(Class cls) {
        return f217893a.d(cls);
    }

    public static kotlin.reflect.d e(Class cls, String str) {
        return f217893a.e(cls, str);
    }

    public static kotlin.reflect.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f217895c;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = f217893a.d(clsArr[i10]);
        }
        return dVarArr;
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.h g(Class cls) {
        return f217893a.f(cls, "");
    }

    public static kotlin.reflect.h h(Class cls, String str) {
        return f217893a.f(cls, str);
    }

    @InterfaceC4887e0(version = "1.6")
    public static kotlin.reflect.r i(kotlin.reflect.r rVar) {
        return f217893a.g(rVar);
    }

    public static kotlin.reflect.k j(MutablePropertyReference0 mutablePropertyReference0) {
        return f217893a.h(mutablePropertyReference0);
    }

    public static kotlin.reflect.l k(MutablePropertyReference1 mutablePropertyReference1) {
        return f217893a.i(mutablePropertyReference1);
    }

    public static kotlin.reflect.m l(MutablePropertyReference2 mutablePropertyReference2) {
        return f217893a.j(mutablePropertyReference2);
    }

    @InterfaceC4887e0(version = "1.6")
    public static kotlin.reflect.r m(kotlin.reflect.r rVar) {
        return f217893a.k(rVar);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r n(Class cls) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), Collections.EMPTY_LIST, true);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r o(Class cls, kotlin.reflect.t tVar) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), Collections.singletonList(tVar), true);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r p(Class cls, kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), Arrays.asList(tVar, tVar2), true);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r q(Class cls, kotlin.reflect.t... tVarArr) {
        P p10 = f217893a;
        return p10.s(p10.d(cls), kotlin.collections.B.dz(tVarArr), true);
    }

    @InterfaceC4887e0(version = "1.4")
    public static kotlin.reflect.r r(kotlin.reflect.g gVar) {
        return f217893a.s(gVar, Collections.EMPTY_LIST, true);
    }

    @InterfaceC4887e0(version = "1.6")
    public static kotlin.reflect.r s(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return f217893a.l(rVar, rVar2);
    }

    public static kotlin.reflect.o t(PropertyReference0 propertyReference0) {
        return f217893a.m(propertyReference0);
    }

    public static kotlin.reflect.p u(PropertyReference1 propertyReference1) {
        return f217893a.n(propertyReference1);
    }

    public static kotlin.reflect.q v(PropertyReference2 propertyReference2) {
        return f217893a.o(propertyReference2);
    }

    @InterfaceC4887e0(version = "1.3")
    public static String w(C c10) {
        return f217893a.p(c10);
    }

    @InterfaceC4887e0(version = "1.1")
    public static String x(Lambda lambda) {
        return f217893a.q(lambda);
    }

    @InterfaceC4887e0(version = "1.4")
    public static void y(kotlin.reflect.s sVar, kotlin.reflect.r rVar) {
        f217893a.r(sVar, Collections.singletonList(rVar));
    }

    @InterfaceC4887e0(version = "1.4")
    public static void z(kotlin.reflect.s sVar, kotlin.reflect.r... rVarArr) {
        f217893a.r(sVar, kotlin.collections.B.dz(rVarArr));
    }
}
