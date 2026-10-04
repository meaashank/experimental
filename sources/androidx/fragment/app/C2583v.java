package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.U0;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2583v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0<ClassLoader, U0<String, Class<?>>> f113898a = new U0<>();

    public static boolean b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    public static Class<?> c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        U0<ClassLoader, U0<String, Class<?>>> u02 = f113898a;
        U0<String, Class<?>> u03 = u02.get(classLoader);
        if (u03 == null) {
            u03 = new U0<>();
            u02.put(classLoader, u03);
        }
        Class<?> cls = u03.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        u03.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException(android.support.v4.media.i.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), (Throwable) e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(android.support.v4.media.i.a("Unable to instantiate fragment ", str, ": make sure class name exists"), (Throwable) e11);
        }
    }

    @NonNull
    public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new Fragment.InstantiationException(android.support.v4.media.i.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e10);
        } catch (InstantiationException e11) {
            throw new Fragment.InstantiationException(android.support.v4.media.i.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.InstantiationException(android.support.v4.media.i.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), (Throwable) e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.InstantiationException(android.support.v4.media.i.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), (Throwable) e13);
        }
    }
}
