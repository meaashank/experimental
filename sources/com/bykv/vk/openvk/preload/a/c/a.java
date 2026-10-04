package com.bykv.vk.openvk.preload.a.c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<? super T> f140309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Type f140310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f140311c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f140310b = typeA;
        this.f140309a = (Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.f140311c = this.f140310b.hashCode();
    }

    public final Class<? super T> a() {
        return this.f140309a;
    }

    public final Type b() {
        return this.f140310b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && com.bykv.vk.openvk.preload.a.b.a.a(this.f140310b, ((a) obj).f140310b);
    }

    public final int hashCode() {
        return this.f140311c;
    }

    public final String toString() {
        return com.bykv.vk.openvk.preload.a.b.a.c(this.f140310b);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    private a(Type type) {
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a((Type) com.bykv.vk.openvk.preload.falconx.a.a.a(type));
        this.f140310b = typeA;
        this.f140309a = (Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.f140311c = this.f140310b.hashCode();
    }
}
