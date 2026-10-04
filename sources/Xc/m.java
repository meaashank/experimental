package Xc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.B;
import kotlin.collections.C4875q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.random.Random;
import kotlin.text.C5020l;
import kotlin.time.InterfaceC5038e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public class m {

    @V({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f79083a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dd.g
        @Nullable
        public static final Method f79084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @Nullable
        public static final Method f79085c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            G.m(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (G.g(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    G.o(parameterTypes, "getParameterTypes(...)");
                    if (G.g(B.Ut(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f79084b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (G.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f79085c = method;
        }
    }

    public void a(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        G.p(cause, "cause");
        G.p(exception, "exception");
        Method method = a.f79084b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @NotNull
    public Random b() {
        return new kotlin.random.b();
    }

    @Nullable
    public C5020l c(@NotNull MatchResult matchResult, @NotNull String name) {
        G.p(matchResult, "matchResult");
        G.p(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public List<Throwable> d(@NotNull Throwable exception) {
        Object objInvoke;
        G.p(exception, "exception");
        Method method = a.f79085c;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null) ? EmptyList.f217510a : C4875q.t((Throwable[]) objInvoke);
    }

    @NotNull
    public InterfaceC5038e e() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
