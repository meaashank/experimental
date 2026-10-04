package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import e.InterfaceC4345t;
import e.T;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f85335a = "ResourcesFlusher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f85336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f85337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class<?> f85338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f85339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f85340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f85341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f85342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f85343i;

    @T(16)
    public static class a {
        @InterfaceC4345t
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(@NonNull Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else {
            c(resources);
        }
    }

    @T(21)
    public static void b(@NonNull Resources resources) {
        Map map;
        if (!f85337c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f85336b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f85335a, "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f85337c = true;
        }
        Field field = f85336b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e(f85335a, "Could not retrieve value from Resources#mDrawableCache", e11);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @T(23)
    public static void c(@NonNull Resources resources) {
        Object obj;
        if (!f85337c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f85336b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f85335a, "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f85337c = true;
        }
        Field field = f85336b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e(f85335a, "Could not retrieve value from Resources#mDrawableCache", e11);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @T(24)
    public static void d(@NonNull Resources resources) {
        Object obj;
        if (!f85343i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f85342h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f85335a, "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f85343i = true;
        }
        Field field = f85342h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e(f85335a, "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f85337c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f85336b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e(f85335a, "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f85337c = true;
        }
        Field field2 = f85336b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e(f85335a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @T(16)
    public static void e(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f85339e) {
            try {
                f85338d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e(f85335a, "Could not find ThemedResourceCache class", e10);
            }
            f85339e = true;
        }
        Class<?> cls = f85338d;
        if (cls == null) {
            return;
        }
        if (!f85341g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f85340f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e(f85335a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f85341g = true;
        }
        Field field = f85340f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e(f85335a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
