package kotlin.jvm.internal;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PropertyReference2 extends PropertyReference implements kotlin.reflect.q {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return O.v(this);
    }

    @Override // ed.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.q
    @InterfaceC4887e0(version = "1.1")
    public Object r(Object obj, Object obj2) {
        return ((kotlin.reflect.q) getReflected()).r(obj, obj2);
    }

    @InterfaceC4887e0(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.n
    public q.a getGetter() {
        return ((kotlin.reflect.q) getReflected()).getGetter();
    }
}
