package kotlin.jvm.internal;

import kotlin.InterfaceC4887e0;

/* JADX INFO: loaded from: classes7.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(((InterfaceC4966s) hVar).c(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.m
    public void f(Object obj, Object obj2, Object obj3) {
        d().call(obj, obj2, obj3);
    }

    @Override // kotlin.reflect.q
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @InterfaceC4887e0(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i10) {
        super(cls, str, str2, i10);
    }
}
