package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class f140261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f140262b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f140263c = c();

    private boolean b(AccessibleObject accessibleObject) {
        if (this.f140262b != null && this.f140263c != null) {
            try {
                Long l10 = (Long) f140261a.getMethod("objectFieldOffset", Field.class).invoke(this.f140262b, this.f140263c);
                l10.longValue();
                f140261a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f140262b, accessibleObject, l10, Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.b.b
    public final void a(AccessibleObject accessibleObject) {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new i("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    private static Object b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f140261a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
