package x2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x2.c;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5779a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f240472d = "Startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5779a f240473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f240474f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f240477c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Set<Class<? extends InterfaceC5780b<?>>> f240476b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Map<Class<?>, Object> f240475a = new HashMap();

    public C5779a(@NonNull Context context) {
        this.f240477c = context.getApplicationContext();
    }

    @NonNull
    public static C5779a e(@NonNull Context context) {
        if (f240473e == null) {
            synchronized (f240474f) {
                try {
                    if (f240473e == null) {
                        f240473e = new C5779a(context);
                    }
                } finally {
                }
            }
        }
        return f240473e;
    }

    public static void h(@NonNull C5779a c5779a) {
        synchronized (f240474f) {
            f240473e = c5779a;
        }
    }

    public void a() {
        try {
            try {
                Trace.beginSection(z2.b.m(f240472d));
                b(this.f240477c.getPackageManager().getProviderInfo(new ComponentName(this.f240477c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            Trace.endSection();
        }
    }

    public void b(@Nullable Bundle bundle) {
        String string = this.f240477c.getString(c.a.f240478a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC5780b.class.isAssignableFrom(cls)) {
                            this.f240476b.add((Class<? extends InterfaceC5780b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC5780b<?>>> it = this.f240476b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    @NonNull
    public <T> T c(@NonNull Class<? extends InterfaceC5780b<?>> cls) {
        T t10;
        synchronized (f240474f) {
            try {
                t10 = (T) this.f240475a.get(cls);
                if (t10 == null) {
                    t10 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    @NonNull
    public final <T> T d(@NonNull Class<? extends InterfaceC5780b<?>> cls, @NonNull Set<Class<?>> set) {
        T t10;
        if (z2.b.i()) {
            try {
                Trace.beginSection(z2.b.m(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f240475a.containsKey(cls)) {
            t10 = (T) this.f240475a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC5780b<?> interfaceC5780bNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends InterfaceC5780b<?>>> listDependencies = interfaceC5780bNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends InterfaceC5780b<?>> cls2 : listDependencies) {
                        if (!this.f240475a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) interfaceC5780bNewInstance.create(this.f240477c);
                set.remove(cls);
                this.f240475a.put(cls, t10);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return t10;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends InterfaceC5780b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends InterfaceC5780b<?>> cls) {
        return this.f240476b.contains(cls);
    }
}
