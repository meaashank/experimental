package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

/* JADX INFO: loaded from: classes6.dex */
public class HashCodeBuilder implements Builder<Integer> {
    private static final ThreadLocal<Set<IDKey>> REGISTRY = new ThreadLocal<>();
    private final int iConstant;
    private int iTotal;

    public HashCodeBuilder() {
        this.iConstant = 37;
        this.iTotal = 17;
    }

    public static Set<IDKey> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj) {
        Set<IDKey> registry = getRegistry();
        return registry != null && registry.contains(new IDKey(obj));
    }

    private static void reflectionAppend(Object obj, Class<?> cls, HashCodeBuilder hashCodeBuilder, boolean z10, String[] strArr) {
        if (isRegistered(obj)) {
            return;
        }
        try {
            register(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!ArrayUtils.contains(strArr, field.getName()) && field.getName().indexOf(36) == -1 && (z10 || !Modifier.isTransient(field.getModifiers()))) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        continue;
                    } else {
                        try {
                            hashCodeBuilder.append(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            unregister(obj);
        } catch (Throwable th) {
            unregister(obj);
            throw th;
        }
    }

    public static int reflectionHashCode(int i10, int i11, Object obj) {
        return reflectionHashCode(i10, i11, obj, false, null, new String[0]);
    }

    public static void register(Object obj) {
        synchronized (HashCodeBuilder.class) {
            try {
                if (getRegistry() == null) {
                    REGISTRY.set(new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        getRegistry().add(new IDKey(obj));
    }

    public static void unregister(Object obj) {
        Set<IDKey> registry = getRegistry();
        if (registry != null) {
            registry.remove(new IDKey(obj));
            synchronized (HashCodeBuilder.class) {
                try {
                    Set<IDKey> registry2 = getRegistry();
                    if (registry2 != null && registry2.isEmpty()) {
                        REGISTRY.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public HashCodeBuilder append(boolean z10) {
        this.iTotal = (this.iTotal * this.iConstant) + (!z10 ? 1 : 0);
        return this;
    }

    public HashCodeBuilder appendSuper(int i10) {
        this.iTotal = (this.iTotal * this.iConstant) + i10;
        return this;
    }

    public int hashCode() {
        return toHashCode();
    }

    public int toHashCode() {
        return this.iTotal;
    }

    public static int reflectionHashCode(int i10, int i11, Object obj, boolean z10) {
        return reflectionHashCode(i10, i11, obj, z10, null, new String[0]);
    }

    public HashCodeBuilder append(boolean[] zArr) {
        if (zArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (boolean z10 : zArr) {
            append(z10);
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Integer build() {
        return Integer.valueOf(toHashCode());
    }

    public static <T> int reflectionHashCode(int i10, int i11, T t10, boolean z10, Class<? super T> cls, String... strArr) {
        if (t10 != null) {
            HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(i10, i11);
            Class<?> superclass = t10.getClass();
            reflectionAppend(t10, superclass, hashCodeBuilder, z10, strArr);
            while (superclass.getSuperclass() != null && superclass != cls) {
                superclass = superclass.getSuperclass();
                reflectionAppend(t10, superclass, hashCodeBuilder, z10, strArr);
            }
            return hashCodeBuilder.toHashCode();
        }
        throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }

    public HashCodeBuilder(int i10, int i11) {
        this.iTotal = 0;
        if (i10 != 0) {
            if (i10 % 2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
            }
            if (i11 != 0) {
                if (i11 % 2 != 0) {
                    this.iConstant = i11;
                    this.iTotal = i10;
                    return;
                }
                throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
            }
            throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
        }
        throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
    }

    public HashCodeBuilder append(byte b10) {
        this.iTotal = (this.iTotal * this.iConstant) + b10;
        return this;
    }

    public HashCodeBuilder append(byte[] bArr) {
        if (bArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (byte b10 : bArr) {
            append(b10);
        }
        return this;
    }

    public HashCodeBuilder append(char c10) {
        this.iTotal = (this.iTotal * this.iConstant) + c10;
        return this;
    }

    public HashCodeBuilder append(char[] cArr) {
        if (cArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (char c10 : cArr) {
            append(c10);
        }
        return this;
    }

    public static int reflectionHashCode(Object obj, boolean z10) {
        return reflectionHashCode(17, 37, obj, z10, null, new String[0]);
    }

    public static int reflectionHashCode(Object obj, Collection<String> collection) {
        return reflectionHashCode(obj, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public static int reflectionHashCode(Object obj, String... strArr) {
        return reflectionHashCode(17, 37, obj, false, null, strArr);
    }

    public HashCodeBuilder append(double d10) {
        return append(Double.doubleToLongBits(d10));
    }

    public HashCodeBuilder append(double[] dArr) {
        if (dArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (double d10 : dArr) {
            append(d10);
        }
        return this;
    }

    public HashCodeBuilder append(float f10) {
        this.iTotal = Float.floatToIntBits(f10) + (this.iTotal * this.iConstant);
        return this;
    }

    public HashCodeBuilder append(float[] fArr) {
        if (fArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (float f10 : fArr) {
            append(f10);
        }
        return this;
    }

    public HashCodeBuilder append(int i10) {
        this.iTotal = (this.iTotal * this.iConstant) + i10;
        return this;
    }

    public HashCodeBuilder append(int[] iArr) {
        if (iArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (int i10 : iArr) {
            append(i10);
        }
        return this;
    }

    public HashCodeBuilder append(long j10) {
        this.iTotal = (this.iTotal * this.iConstant) + ((int) (j10 ^ (j10 >> 32)));
        return this;
    }

    public HashCodeBuilder append(long[] jArr) {
        if (jArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (long j10 : jArr) {
            append(j10);
        }
        return this;
    }

    public HashCodeBuilder append(Object obj) {
        if (obj == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                append((long[]) obj);
                return this;
            }
            if (obj instanceof int[]) {
                append((int[]) obj);
                return this;
            }
            if (obj instanceof short[]) {
                append((short[]) obj);
                return this;
            }
            if (obj instanceof char[]) {
                append((char[]) obj);
                return this;
            }
            if (obj instanceof byte[]) {
                append((byte[]) obj);
                return this;
            }
            if (obj instanceof double[]) {
                append((double[]) obj);
                return this;
            }
            if (obj instanceof float[]) {
                append((float[]) obj);
                return this;
            }
            if (obj instanceof boolean[]) {
                append((boolean[]) obj);
                return this;
            }
            append((Object[]) obj);
            return this;
        }
        this.iTotal = obj.hashCode() + (this.iTotal * this.iConstant);
        return this;
    }

    public HashCodeBuilder append(Object[] objArr) {
        if (objArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (Object obj : objArr) {
            append(obj);
        }
        return this;
    }

    public HashCodeBuilder append(short s10) {
        this.iTotal = (this.iTotal * this.iConstant) + s10;
        return this;
    }

    public HashCodeBuilder append(short[] sArr) {
        if (sArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (short s10 : sArr) {
            append(s10);
        }
        return this;
    }
}
