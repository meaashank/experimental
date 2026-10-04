package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C2591d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2591d f114307c = new C2591d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f114308d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f114309e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114310f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, a> f114311a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f114312b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.d$a */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Lifecycle.Event, List<b>> f114313a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<b, Lifecycle.Event> f114314b;

        public a(Map<b, Lifecycle.Event> map) {
            this.f114314b = map;
            for (Map.Entry<b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<b> arrayList = this.f114313a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f114313a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void b(List<b> list, B b10, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(b10, event, obj);
                }
            }
        }

        public void a(B b10, Lifecycle.Event event, Object obj) {
            b(this.f114313a.get(event), b10, event, obj);
            b(this.f114313a.get(Lifecycle.Event.ON_ANY), b10, event, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.d$b */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f114316b;

        public b(int i10, Method method) {
            this.f114315a = i10;
            this.f114316b = method;
            method.setAccessible(true);
        }

        public void a(B b10, Lifecycle.Event event, Object obj) {
            try {
                int i10 = this.f114315a;
                if (i10 == 0) {
                    this.f114316b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f114316b.invoke(obj, b10);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f114316b.invoke(obj, b10, event);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f114315a == bVar.f114315a && this.f114316b.getName().equals(bVar.f114316b.getName());
        }

        public int hashCode() {
            return this.f114316b.getName().hashCode() + (this.f114315a * 31);
        }
    }

    public final a a(Class<?> cls, @Nullable Method[] methodArr) {
        int i10;
        a aVarC;
        Class<?> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f114314b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : c(cls2).f114314b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            S s10 = (S) method.getAnnotation(S.class);
            if (s10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!B.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                Lifecycle.Event eventValue = s10.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), eventValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f114311a.put(cls, aVar);
        this.f114312b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f114311a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f114312b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((S) method.getAnnotation(S.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f114312b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f114316b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }
}
