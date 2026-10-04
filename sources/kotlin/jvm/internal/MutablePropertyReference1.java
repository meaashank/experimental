package kotlin.jvm.internal;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.l;
import kotlin.reflect.p;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements kotlin.reflect.l {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return O.k(this);
    }

    @Override // kotlin.reflect.p
    @InterfaceC4887e0(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.l) getReflected()).getDelegate(obj);
    }

    @Override // ed.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @InterfaceC4887e0(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.j
    public l.a d() {
        return ((kotlin.reflect.l) getReflected()).d();
    }

    @Override // kotlin.reflect.n
    public p.a getGetter() {
        return ((kotlin.reflect.l) getReflected()).getGetter();
    }

    @InterfaceC4887e0(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
