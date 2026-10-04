package kotlin.jvm.internal;

import java.util.List;
import kotlin.InterfaceC4887e0;
import kotlin.reflect.KVariance;

/* JADX INFO: loaded from: classes7.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f217896a = "kotlin.jvm.functions.";

    public kotlin.reflect.d a(Class cls) {
        return new C4967t(cls);
    }

    public kotlin.reflect.d b(Class cls, String str) {
        return new C4967t(cls);
    }

    public kotlin.reflect.i c(FunctionReference functionReference) {
        return functionReference;
    }

    public kotlin.reflect.d d(Class cls) {
        return new C4967t(cls);
    }

    public kotlin.reflect.d e(Class cls, String str) {
        return new C4967t(cls);
    }

    public kotlin.reflect.h f(Class cls, String str) {
        return new M(cls, str);
    }

    @InterfaceC4887e0(version = "1.6")
    public kotlin.reflect.r g(kotlin.reflect.r rVar) {
        b0 b0Var = (b0) rVar;
        return new b0(rVar.I(), rVar.h(), b0Var.f217932c, b0Var.f217933d | 2);
    }

    public kotlin.reflect.k h(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public kotlin.reflect.l i(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public kotlin.reflect.m j(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    @InterfaceC4887e0(version = "1.6")
    public kotlin.reflect.r k(kotlin.reflect.r rVar) {
        b0 b0Var = (b0) rVar;
        return new b0(rVar.I(), rVar.h(), b0Var.f217932c, b0Var.f217933d | 4);
    }

    @InterfaceC4887e0(version = "1.6")
    public kotlin.reflect.r l(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return new b0(rVar.I(), rVar.h(), rVar2, ((b0) rVar).f217933d);
    }

    public kotlin.reflect.o m(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.p n(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public kotlin.reflect.q o(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @InterfaceC4887e0(version = "1.3")
    public String p(C c10) {
        String string = c10.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(f217896a) ? string.substring(21) : string;
    }

    @InterfaceC4887e0(version = "1.1")
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @InterfaceC4887e0(version = "1.4")
    public void r(kotlin.reflect.s sVar, List<kotlin.reflect.r> list) {
        ((Z) sVar).d(list);
    }

    @InterfaceC4887e0(version = "1.4")
    public kotlin.reflect.r s(kotlin.reflect.g gVar, List<kotlin.reflect.t> list, boolean z10) {
        return new b0(gVar, list, z10);
    }

    @InterfaceC4887e0(version = "1.4")
    public kotlin.reflect.s t(Object obj, String str, KVariance kVariance, boolean z10) {
        return new Z(obj, str, kVariance, z10);
    }
}
