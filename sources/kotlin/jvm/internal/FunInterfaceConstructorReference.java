package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.InterfaceC4887e0;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f217881a;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.f217881a = cls;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            return this.f217881a.equals(((FunInterfaceConstructorReference) obj).f217881a);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public /* bridge */ /* synthetic */ kotlin.reflect.c getReflected() {
        getReflected();
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.f217881a.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface ".concat(this.f217881a.getName());
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public kotlin.reflect.i getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
