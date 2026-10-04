package dd;

import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.InterfaceC4966s;
import kotlin.jvm.internal.O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.x;

/* JADX INFO: renamed from: dd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "JvmClassMappingKt")
public final class C4325b {
    @NotNull
    public static final <T extends Annotation> kotlin.reflect.d<? extends T> a(@NotNull T t10) {
        G.p(t10, "<this>");
        Class<? extends Annotation> clsAnnotationType = t10.annotationType();
        G.o(clsAnnotationType, "annotationType(...)");
        return O.d(clsAnnotationType);
    }

    public static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        G.p(r12, "<this>");
        Class<E> declaringClass = r12.getDeclaringClass();
        G.o(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    @NotNull
    public static final <T> Class<T> d(@NotNull T t10) {
        G.p(t10, "<this>");
        return (Class<T>) t10.getClass();
    }

    @j(name = "getJavaClass")
    @NotNull
    public static final <T> Class<T> e(@NotNull kotlin.reflect.d<T> dVar) {
        G.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC4966s) dVar).c();
        G.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final <T> Class<T> g(@NotNull kotlin.reflect.d<T> dVar) {
        G.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC4966s) dVar).c();
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(x.b.f238265f)) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(x.b.f238262c)) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final <T> Class<T> h(@NotNull kotlin.reflect.d<T> dVar) {
        G.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC4966s) dVar).c();
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @j(name = "getKotlinClass")
    @NotNull
    public static final <T> kotlin.reflect.d<T> i(@NotNull Class<T> cls) {
        G.p(cls, "<this>");
        return O.d(cls);
    }

    @j(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    public static final <T> Class<kotlin.reflect.d<T>> j(@NotNull kotlin.reflect.d<T> dVar) {
        G.p(dVar, "<this>");
        return (Class<kotlin.reflect.d<T>>) dVar.getClass();
    }

    public static final boolean l(Object[] objArr) {
        G.p(objArr, "<this>");
        G.P();
        throw null;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    public static /* synthetic */ void c(Enum r02) {
    }

    public static /* synthetic */ void f(kotlin.reflect.d dVar) {
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @InterfaceC4852c0(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }
}
