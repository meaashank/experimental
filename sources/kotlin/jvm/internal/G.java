package kotlin.jvm.internal;

import com.android.launcher3.IconCache;
import java.util.Arrays;
import kotlin.InterfaceC4887e0;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes7.dex */
public class G {

    @InterfaceC4887e0(version = "1.4")
    public static class a {
    }

    public static <T extends Throwable> T A(T t10) {
        B(t10, G.class.getName());
        return t10;
    }

    public static <T extends Throwable> T B(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        AssertionError assertionError = new AssertionError();
        B(assertionError, G.class.getName());
        throw assertionError;
    }

    public static void E(String str) {
        AssertionError assertionError = new AssertionError(str);
        B(assertionError, G.class.getName());
        throw assertionError;
    }

    public static void F() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        B(illegalArgumentException, G.class.getName());
        throw illegalArgumentException;
    }

    public static void G(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        B(illegalArgumentException, G.class.getName());
        throw illegalArgumentException;
    }

    public static void H() {
        IllegalStateException illegalStateException = new IllegalStateException();
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    public static void I(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    @InterfaceC4887e0(version = "1.4")
    public static void J() {
        NullPointerException nullPointerException = new NullPointerException();
        B(nullPointerException, G.class.getName());
        throw nullPointerException;
    }

    @InterfaceC4887e0(version = "1.4")
    public static void K(String str) {
        NullPointerException nullPointerException = new NullPointerException(str);
        B(nullPointerException, G.class.getName());
        throw nullPointerException;
    }

    public static void L() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        B(kotlinNullPointerException, G.class.getName());
        throw kotlinNullPointerException;
    }

    public static void M(String str) {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(str);
        B(kotlinNullPointerException, G.class.getName());
        throw kotlinNullPointerException;
    }

    public static void N(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v(str));
        B(illegalArgumentException, G.class.getName());
        throw illegalArgumentException;
    }

    public static void O(String str) {
        NullPointerException nullPointerException = new NullPointerException(v(str));
        B(nullPointerException, G.class.getName());
        throw nullPointerException;
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        throw null;
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(str);
        B(uninitializedPropertyAccessException, G.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
        throw null;
    }

    @InterfaceC4887e0(version = "1.1")
    public static boolean a(double d10, Double d11) {
        return d11 != null && d10 == d11.doubleValue();
    }

    @InterfaceC4887e0(version = "1.1")
    public static boolean b(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    @InterfaceC4887e0(version = "1.1")
    public static boolean c(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    @InterfaceC4887e0(version = "1.1")
    public static boolean d(Double d10, Double d11) {
        return d10 == null ? d11 == null : d11 != null && d10.doubleValue() == d11.doubleValue();
    }

    @InterfaceC4887e0(version = "1.1")
    public static boolean e(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    @InterfaceC4887e0(version = "1.1")
    public static boolean f(Float f10, Float f11) {
        return f10 == null ? f11 == null : f11 != null && f10.floatValue() == f11.floatValue();
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(androidx.compose.runtime.changelist.j.a(str, " must not be null"));
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str);
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(androidx.fragment.app.G.a("Field specified as non-null is null: ", str, IconCache.EMPTY_CLASS_NAME, str2));
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    public static void k(String str) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e10) {
            ClassNotFoundException classNotFoundException = new ClassNotFoundException(android.support.v4.media.i.a("Class ", strReplace, " is not found. Please update the Kotlin runtime to the latest version"), e10);
            B(classNotFoundException, G.class.getName());
            throw classNotFoundException;
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e10) {
            ClassNotFoundException classNotFoundException = new ClassNotFoundException(androidx.fragment.app.G.a("Class ", strReplace, " is not found: this code requires the Kotlin runtime of version at least ", str2), e10);
            B(classNotFoundException, G.class.getName());
            throw classNotFoundException;
        }
    }

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        J();
        throw null;
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        K(str);
        throw null;
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(androidx.compose.runtime.changelist.j.a(str, " must not be null"));
        B(nullPointerException, G.class.getName());
        throw nullPointerException;
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        O(str);
        throw null;
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        N(str);
        throw null;
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str);
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    public static void s(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(androidx.fragment.app.G.a("Method specified as non-null returned null: ", str, IconCache.EMPTY_CLASS_NAME, str2));
        B(illegalStateException, G.class.getName());
        throw illegalStateException;
    }

    public static int t(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int u(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = G.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), IconCache.EMPTY_CLASS_NAME, stackTraceElement.getMethodName(), ", parameter ");
        sbA.append(str);
        return sbA.toString();
    }

    public static void w() {
        P();
        throw null;
    }

    public static void x(String str) {
        Q(str);
        throw null;
    }

    public static void y(int i10, String str) {
        P();
        throw null;
    }

    public static void z(int i10, String str, String str2) {
        Q(str2);
        throw null;
    }
}
