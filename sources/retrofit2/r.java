package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.d;
import retrofit2.h;

/* JADX INFO: loaded from: classes8.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f237724a = f();

    public static class a extends r {

        /* JADX INFO: renamed from: retrofit2.r$a$a, reason: collision with other inner class name */
        public static class ExecutorC0878a implements Executor {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f237725a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f237725a.post(runnable);
            }
        }

        @Override // retrofit2.r
        public List<? extends d.a> a(@Nullable Executor executor) {
            if (executor == null) {
                throw new AssertionError();
            }
            j jVar = new j(executor);
            return Build.VERSION.SDK_INT >= 24 ? Arrays.asList(g.f237650a, jVar) : Collections.singletonList(jVar);
        }

        @Override // retrofit2.r
        public int b() {
            return Build.VERSION.SDK_INT >= 24 ? 2 : 1;
        }

        @Override // retrofit2.r
        public Executor c() {
            return new ExecutorC0878a();
        }

        @Override // retrofit2.r
        public List<? extends h.a> d() {
            return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(o.f237696a) : Collections.EMPTY_LIST;
        }

        @Override // retrofit2.r
        public int e() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        @Override // retrofit2.r
        @IgnoreJRERequirement
        public boolean i(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    public static class b extends r {
        @Override // retrofit2.r
        public List<? extends d.a> a(@Nullable Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(g.f237650a);
            if (executor != null) {
                arrayList.add(new j(executor));
            } else {
                arrayList.add(i.f237661a);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // retrofit2.r
        public int b() {
            return 2;
        }

        @Override // retrofit2.r
        public List<? extends h.a> d() {
            return Collections.singletonList(o.f237696a);
        }

        @Override // retrofit2.r
        public int e() {
            return 1;
        }

        @Override // retrofit2.r
        public Object h(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor declaredConstructor = s.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return t.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // retrofit2.r
        public boolean i(Method method) {
            return method.isDefault();
        }
    }

    public static r f() {
        try {
            try {
                Class.forName("android.os.Build");
                return new a();
            } catch (ClassNotFoundException unused) {
                return new r();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("java.util.Optional");
            return new b();
        }
    }

    public static r g() {
        return f237724a;
    }

    public List<? extends d.a> a(@Nullable Executor executor) {
        return executor != null ? Collections.singletonList(new j(executor)) : Collections.singletonList(i.f237661a);
    }

    public int b() {
        return 1;
    }

    @Nullable
    public Executor c() {
        return null;
    }

    public List<? extends h.a> d() {
        return Collections.EMPTY_LIST;
    }

    public int e() {
        return 0;
    }

    @Nullable
    public Object h(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    public boolean i(Method method) {
        return false;
    }
}
