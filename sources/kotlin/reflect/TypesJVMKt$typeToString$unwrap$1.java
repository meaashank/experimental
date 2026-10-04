package kotlin.reflect;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements ed.l<Class<?>, Class<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypesJVMKt$typeToString$unwrap$1 f218023a = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // ed.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Class<?> invoke(Class<?> p02) {
        G.p(p02, "p0");
        return p02.getComponentType();
    }
}
