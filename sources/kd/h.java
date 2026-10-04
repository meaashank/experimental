package Kd;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58588d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Method f58589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Method f58590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Method f58591c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final h a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(w7.i.f240158w, null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new h(method3, method2, method);
        }

        public a(C4969v c4969v) {
        }
    }

    public h(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f58589a = method;
        this.f58590b = method2;
        this.f58591c = method3;
    }

    @Nullable
    public final Object a(@NotNull String closer) {
        G.p(closer, "closer");
        Method method = this.f58589a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f58590b;
                G.m(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f58591c;
            G.m(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
