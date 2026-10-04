package t3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: t3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C5601d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239148b = "ManifestParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f239149c = "GlideModule";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f239150a;

    public C5601d(Context context) {
        this.f239150a = context;
    }

    public static InterfaceC5599b c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof InterfaceC5599b) {
                    return (InterfaceC5599b) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e10) {
                d(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                d(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                d(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                d(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    @Nullable
    public final ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f239150a.getPackageManager().getApplicationInfo(this.f239150a.getPackageName(), 128);
    }

    public List<InterfaceC5599b> b() {
        if (Log.isLoggable(f239148b, 3)) {
            Log.d(f239148b, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable(f239148b, 2)) {
                    Log.v(f239148b, "Got app info metadata: " + applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if (f239149c.equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                        if (Log.isLoggable(f239148b, 3)) {
                            Log.d(f239148b, "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable(f239148b, 3)) {
                    Log.d(f239148b, "Finished loading Glide modules");
                    return arrayList;
                }
            } else if (Log.isLoggable(f239148b, 3)) {
                Log.d(f239148b, "Got null app info metadata");
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable(f239148b, 6)) {
                Log.e(f239148b, "Failed to parse glide modules", e10);
            }
        }
        return arrayList;
    }
}
