package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.d;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f140260a;

    static {
        f140260a = d.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return f140260a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
