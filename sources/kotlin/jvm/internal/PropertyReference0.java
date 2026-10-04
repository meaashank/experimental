package kotlin.jvm.internal;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PropertyReference0 extends PropertyReference implements kotlin.reflect.o {
    public PropertyReference0() {
    }

    @Override // kotlin.reflect.o
    @InterfaceC4887e0(version = "1.1")
    public Object A() {
        return ((kotlin.reflect.o) getReflected()).A();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return O.t(this);
    }

    @Override // ed.InterfaceC4376a
    public Object invoke() {
        return get();
    }

    @InterfaceC4887e0(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.n
    public o.a getGetter() {
        return ((kotlin.reflect.o) getReflected()).getGetter();
    }

    @InterfaceC4887e0(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
