package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements ed.l<Type, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParameterizedTypeImpl$getTypeName$1$1 f218021a = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // ed.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String invoke(Type p02) {
        G.p(p02, "p0");
        return TypesJVMKt.j(p02);
    }
}
