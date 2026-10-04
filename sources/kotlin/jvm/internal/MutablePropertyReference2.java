package kotlin.jvm.internal;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.m;
import kotlin.reflect.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements kotlin.reflect.m {
    public MutablePropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return O.l(this);
    }

    @Override // ed.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.q
    @InterfaceC4887e0(version = "1.1")
    public Object r(Object obj, Object obj2) {
        return ((kotlin.reflect.m) getReflected()).r(obj, obj2);
    }

    @InterfaceC4887e0(version = "1.4")
    public MutablePropertyReference2(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.j
    public m.a d() {
        return ((kotlin.reflect.m) getReflected()).d();
    }

    @Override // kotlin.reflect.n
    public q.a getGetter() {
        return ((kotlin.reflect.m) getReflected()).getGetter();
    }
}
