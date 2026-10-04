package Yc;

import Xc.m;
import dd.g;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class a extends m {

    /* JADX INFO: renamed from: Yc.a$a, reason: collision with other inner class name */
    @V({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class C0154a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0154a f79375a = new C0154a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g
        @Nullable
        public static final Integer f79376b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f79376b = num;
        }
    }

    private final boolean f(int i10) {
        Integer num = C0154a.f79376b;
        return num == null || num.intValue() >= i10;
    }

    @Override // Xc.m
    public void a(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        G.p(cause, "cause");
        G.p(exception, "exception");
        if (f(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // Xc.m
    @NotNull
    public List<Throwable> d(@NotNull Throwable exception) {
        G.p(exception, "exception");
        if (!f(19)) {
            return super.d(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        G.o(suppressed, "getSuppressed(...)");
        return C4875q.t(suppressed);
    }
}
