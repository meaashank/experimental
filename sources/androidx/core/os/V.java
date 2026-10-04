package androidx.core.os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Method f111277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Constructor<UserHandle> f111278b;

    @e.T(24)
    public static class a {
        private a() {
        }

        @NonNull
        public static UserHandle a(int i10) {
            return UserHandle.getUserHandleForUid(i10);
        }
    }

    public static Method a() throws NoSuchMethodException {
        if (f111277a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f111277a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f111277a;
    }

    public static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f111278b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f111278b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f111278b;
    }

    @NonNull
    public static UserHandle c(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(i10);
        }
        try {
            return b().newInstance((Integer) a().invoke(null, Integer.valueOf(i10)));
        } catch (IllegalAccessException e10) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e10);
            throw illegalAccessError;
        } catch (InstantiationException e11) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e11);
            throw instantiationError;
        } catch (NoSuchMethodException e12) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e12);
            throw noSuchMethodError;
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }
}
