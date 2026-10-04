package kotlin.jvm.internal;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.k;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements kotlin.reflect.k {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.reflect.o
    @InterfaceC4887e0(version = "1.1")
    public Object A() {
        return ((kotlin.reflect.k) getReflected()).A();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return O.j(this);
    }

    @Override // ed.InterfaceC4376a
    public Object invoke() {
        return get();
    }

    @InterfaceC4887e0(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.j
    public k.a d() {
        return ((kotlin.reflect.k) getReflected()).d();
    }

    @Override // kotlin.reflect.n
    public o.a getGetter() {
        return ((kotlin.reflect.k) getReflected()).getGetter();
    }

    @InterfaceC4887e0(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
