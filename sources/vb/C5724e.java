package vb;

import androidx.annotation.Nullable;
import androidx.compose.runtime.changelist.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: vb.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5724e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<InterfaceC5723d> f239948a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f239949b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f239950c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f239951d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f239952e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f239953f = 6;

    public static void a(InterfaceC5723d interfaceC5723d) {
        if (interfaceC5723d != null) {
            synchronized (InterfaceC5723d.class) {
                try {
                    Iterator<InterfaceC5723d> it = f239948a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            f239948a.add(interfaceC5723d);
                            break;
                        } else if (it.next().getClass().equals(interfaceC5723d.getClass())) {
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        i(3, str, null, str2, objArr);
    }

    public static void c(String str, Throwable th, String str2, Object... objArr) {
        i(3, str, th, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        i(6, str, null, str2, objArr);
    }

    public static void e(String str, Throwable th, String str2, Object... objArr) {
        i(6, str, th, str2, objArr);
    }

    public static <T extends InterfaceC5723d> T f(Class<T> cls) {
        synchronized (InterfaceC5723d.class) {
            try {
                Iterator<InterfaceC5723d> it = f239948a.iterator();
                while (it.hasNext()) {
                    T t10 = (T) it.next();
                    if (t10.getClass().equals(cls)) {
                        return t10;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(String str, String str2, Object... objArr) {
        i(4, str, null, str2, objArr);
    }

    public static void h(String str, Throwable th, String str2, Object... objArr) {
        i(4, str, th, str2, objArr);
    }

    public static void i(int i10, String str, @Nullable Throwable th, String str2, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    str2 = String.format(str2, objArr);
                }
            } catch (Exception unused) {
                str2 = j.a(str2, ": !!!! Log format exception: ");
            }
        }
        synchronized (InterfaceC5723d.class) {
            try {
                for (InterfaceC5723d interfaceC5723d : f239948a) {
                    if (interfaceC5723d.b(i10, str)) {
                        interfaceC5723d.a(i10, str, str2, th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        i(2, str, null, str2, objArr);
    }

    public static void k(String str, Throwable th, String str2, Object... objArr) {
        i(2, str, th, str2, objArr);
    }

    public static void l(String str, String str2, Object... objArr) {
        i(5, str, null, str2, objArr);
    }

    public static void m(String str, Throwable th, String str2, Object... objArr) {
        i(5, str, th, str2, objArr);
    }
}
