package c7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: c7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C2959k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f131260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f131262c;

    public C2959k(Method method, Object obj, Object[] objArr) {
        this.f131260a = method;
        this.f131261b = obj;
        this.f131262c = objArr;
    }

    public <T> T a() throws InvocationTargetException {
        try {
            return (T) this.f131260a.invoke(this.f131261b, this.f131262c);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    public <T> T b() {
        try {
            return (T) this.f131260a.invoke(this.f131261b, this.f131262c);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public <T> T c(int i10) {
        return (T) this.f131262c[i10];
    }

    public void d(int i10, Object obj) {
        this.f131262c[i10] = obj;
    }
}
