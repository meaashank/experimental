package com.bykv.vk.openvk.preload.a.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> f140235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b.b f140236b = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public b(Map<Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> map) {
        this.f140235a = map;
    }

    public final <T> h<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        final Type typeB = aVar.b();
        final Class<? super T> clsA = aVar.a();
        final com.bykv.vk.openvk.preload.geckox.a.a.c<?> cVar = this.f140235a.get(typeB);
        if (cVar != null) {
            return new h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.1
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) cVar.c();
                }
            };
        }
        final com.bykv.vk.openvk.preload.geckox.a.a.c<?> cVar2 = this.f140235a.get(clsA);
        if (cVar2 != null) {
            return new h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.7
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) cVar2.c();
                }
            };
        }
        h<T> hVarA = a(clsA);
        if (hVarA != null) {
            return hVarA;
        }
        h<T> hVar = Collection.class.isAssignableFrom(clsA) ? SortedSet.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.10
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                Type type = typeB;
                if (!(type instanceof ParameterizedType)) {
                    throw new com.bykv.vk.openvk.preload.a.i("Invalid EnumSet type: " + typeB.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new com.bykv.vk.openvk.preload.a.i("Invalid EnumSet type: " + typeB.toString());
            }
        } : Set.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.11
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.12
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new ArrayDeque();
            }
        } : (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.13
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(clsA) ? ConcurrentNavigableMap.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.14
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.2
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new ConcurrentHashMap();
            }
        } : SortedMap.class.isAssignableFrom(clsA) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.3
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new TreeMap();
            }
        } : (!(typeB instanceof ParameterizedType) || String.class.isAssignableFrom(com.bykv.vk.openvk.preload.a.c.a.a(((ParameterizedType) typeB).getActualTypeArguments()[0]).a())) ? (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.5
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new g();
            }
        } : (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.4
            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                return new LinkedHashMap();
            }
        } : null;
        return hVar != null ? hVar : (h<T>) new h<Object>() { // from class: com.bykv.vk.openvk.preload.a.b.b.6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final i f140250a = i.a();

            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                try {
                    return this.f140250a.a(clsA);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + typeB + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
                }
            }
        };
    }

    public final String toString() {
        return this.f140235a.toString();
    }

    private <T> h<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                this.f140236b.a(declaredConstructor);
            }
            return new h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.8
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e10) {
                        throw new AssertionError(e10);
                    } catch (InstantiationException e11) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e11);
                    } catch (InvocationTargetException e12) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e12.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
