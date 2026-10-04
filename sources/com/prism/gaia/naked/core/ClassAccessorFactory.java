package com.prism.gaia.naked.core;

import androidx.annotation.NonNull;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ClassAccessorFactory {
    private static final ClassAccessorFactory instance = new ClassAccessorFactory();
    private Map<Class, ClassAccessor> map = new ConcurrentHashMap();

    private ClassAccessorFactory() {
    }

    public static ClassAccessorFactory instance() {
        return instance;
    }

    public <T extends ClassAccessor> T get(@NonNull Class<T> cls) {
        T t10;
        T t11 = (T) this.map.get(cls);
        if (t11 != null) {
            return t11;
        }
        synchronized (this) {
            t10 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ClassAccessorInvocationHandler(cls));
            this.map.put(cls, t10);
        }
        return t10;
    }
}
