package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes6.dex */
public class EqualsBuilder implements Builder<Boolean> {
    private static final ThreadLocal<Set<Pair<IDKey, IDKey>>> REGISTRY = new ThreadLocal<>();
    private boolean isEquals = true;

    public static Pair<IDKey, IDKey> getRegisterPair(Object obj, Object obj2) {
        return Pair.of(new IDKey(obj), new IDKey(obj2));
    }

    public static Set<Pair<IDKey, IDKey>> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj, Object obj2) {
        Set<Pair<IDKey, IDKey>> registry = getRegistry();
        Pair<IDKey, IDKey> registerPair = getRegisterPair(obj, obj2);
        Pair pairOf = Pair.of(registerPair.getLeft(), registerPair.getRight());
        if (registry != null) {
            return registry.contains(registerPair) || registry.contains(pairOf);
        }
        return false;
    }

    private static void reflectionAppend(Object obj, Object obj2, Class<?> cls, EqualsBuilder equalsBuilder, boolean z10, String[] strArr) {
        if (isRegistered(obj, obj2)) {
            return;
        }
        try {
            register(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i10 = 0; i10 < declaredFields.length && equalsBuilder.isEquals; i10++) {
                Field field = declaredFields[i10];
                if (!ArrayUtils.contains(strArr, field.getName()) && field.getName().indexOf(36) == -1 && (z10 || !Modifier.isTransient(field.getModifiers()))) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        continue;
                    } else {
                        try {
                            equalsBuilder.append(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            unregister(obj, obj2);
        } catch (Throwable th) {
            unregister(obj, obj2);
            throw th;
        }
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection<String> collection) {
        return reflectionEquals(obj, obj2, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public static void register(Object obj, Object obj2) {
        synchronized (EqualsBuilder.class) {
            try {
                if (getRegistry() == null) {
                    REGISTRY.set(new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        getRegistry().add(getRegisterPair(obj, obj2));
    }

    public static void unregister(Object obj, Object obj2) {
        Set<Pair<IDKey, IDKey>> registry = getRegistry();
        if (registry != null) {
            registry.remove(getRegisterPair(obj, obj2));
            synchronized (EqualsBuilder.class) {
                try {
                    Set<Pair<IDKey, IDKey>> registry2 = getRegistry();
                    if (registry2 != null && registry2.isEmpty()) {
                        REGISTRY.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public EqualsBuilder append(Object obj, Object obj2) {
        if (!this.isEquals || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            setEquals(false);
            return this;
        }
        if (!obj.getClass().isArray()) {
            this.isEquals = obj.equals(obj2);
            return this;
        }
        if (obj.getClass() != obj2.getClass()) {
            setEquals(false);
            return this;
        }
        if (obj instanceof long[]) {
            append((long[]) obj, (long[]) obj2);
            return this;
        }
        if (obj instanceof int[]) {
            append((int[]) obj, (int[]) obj2);
            return this;
        }
        if (obj instanceof short[]) {
            append((short[]) obj, (short[]) obj2);
            return this;
        }
        if (obj instanceof char[]) {
            append((char[]) obj, (char[]) obj2);
            return this;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj, (byte[]) obj2);
            return this;
        }
        if (obj instanceof double[]) {
            append((double[]) obj, (double[]) obj2);
            return this;
        }
        if (obj instanceof float[]) {
            append((float[]) obj, (float[]) obj2);
            return this;
        }
        if (obj instanceof boolean[]) {
            append((boolean[]) obj, (boolean[]) obj2);
            return this;
        }
        append((Object[]) obj, (Object[]) obj2);
        return this;
    }

    public EqualsBuilder appendSuper(boolean z10) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z10;
        return this;
    }

    public boolean isEquals() {
        return this.isEquals;
    }

    public void reset() {
        this.isEquals = true;
    }

    public void setEquals(boolean z10) {
        this.isEquals = z10;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String... strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Boolean build() {
        return Boolean.valueOf(isEquals());
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z10) {
        return reflectionEquals(obj, obj2, z10, null, new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean reflectionEquals(java.lang.Object r7, java.lang.Object r8, boolean r9, java.lang.Class<?> r10, java.lang.String... r11) {
        /*
            if (r7 != r8) goto L4
            r0 = 1
            return r0
        L4:
            r6 = 0
            if (r7 == 0) goto L52
            if (r8 != 0) goto La
            goto L52
        La:
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r4 = r2.isInstance(r8)
            if (r4 == 0) goto L1f
            boolean r4 = r3.isInstance(r7)
            if (r4 != 0) goto L2d
            goto L2c
        L1f:
            boolean r4 = r3.isInstance(r7)
            if (r4 == 0) goto L52
            boolean r4 = r2.isInstance(r8)
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            r2 = r3
        L2d:
            org.apache.commons.lang3.builder.EqualsBuilder r3 = new org.apache.commons.lang3.builder.EqualsBuilder
            r3.<init>()
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r11
            reflectionAppend(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L52
        L39:
            java.lang.Class r0 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L52
            if (r0 == 0) goto L4d
            if (r2 == r10) goto L4d
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L52
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r11
            reflectionAppend(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L52
            goto L39
        L4d:
            boolean r0 = r3.isEquals()
            return r0
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[]):boolean");
    }

    public EqualsBuilder append(long j10, long j11) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = j10 == j11;
        return this;
    }

    public EqualsBuilder append(int i10, int i11) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = i10 == i11;
        return this;
    }

    public EqualsBuilder append(short s10, short s11) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = s10 == s11;
        return this;
    }

    public EqualsBuilder append(char c10, char c11) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = c10 == c11;
        return this;
    }

    public EqualsBuilder append(byte b10, byte b11) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = b10 == b11;
        return this;
    }

    public EqualsBuilder append(double d10, double d11) {
        return !this.isEquals ? this : append(Double.doubleToLongBits(d10), Double.doubleToLongBits(d11));
    }

    public EqualsBuilder append(float f10, float f11) {
        return !this.isEquals ? this : append(Float.floatToIntBits(f10), Float.floatToIntBits(f11));
    }

    public EqualsBuilder append(boolean z10, boolean z11) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z10 == z11;
        return this;
    }

    public EqualsBuilder append(Object[] objArr, Object[] objArr2) {
        if (this.isEquals && objArr != objArr2) {
            if (objArr != null && objArr2 != null) {
                if (objArr.length != objArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < objArr.length && this.isEquals; i10++) {
                    append(objArr[i10], objArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(long[] jArr, long[] jArr2) {
        if (this.isEquals && jArr != jArr2) {
            if (jArr != null && jArr2 != null) {
                if (jArr.length != jArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < jArr.length && this.isEquals; i10++) {
                    append(jArr[i10], jArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(int[] iArr, int[] iArr2) {
        if (this.isEquals && iArr != iArr2) {
            if (iArr != null && iArr2 != null) {
                if (iArr.length != iArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < iArr.length && this.isEquals; i10++) {
                    append(iArr[i10], iArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(short[] sArr, short[] sArr2) {
        if (this.isEquals && sArr != sArr2) {
            if (sArr != null && sArr2 != null) {
                if (sArr.length != sArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < sArr.length && this.isEquals; i10++) {
                    append(sArr[i10], sArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(char[] cArr, char[] cArr2) {
        if (this.isEquals && cArr != cArr2) {
            if (cArr != null && cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < cArr.length && this.isEquals; i10++) {
                    append(cArr[i10], cArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(byte[] bArr, byte[] bArr2) {
        if (this.isEquals && bArr != bArr2) {
            if (bArr != null && bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < bArr.length && this.isEquals; i10++) {
                    append(bArr[i10], bArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(double[] dArr, double[] dArr2) {
        if (this.isEquals && dArr != dArr2) {
            if (dArr != null && dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < dArr.length && this.isEquals; i10++) {
                    append(dArr[i10], dArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(float[] fArr, float[] fArr2) {
        if (this.isEquals && fArr != fArr2) {
            if (fArr != null && fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < fArr.length && this.isEquals; i10++) {
                    append(fArr[i10], fArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(boolean[] zArr, boolean[] zArr2) {
        if (this.isEquals && zArr != zArr2) {
            if (zArr != null && zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i10 = 0; i10 < zArr.length && this.isEquals; i10++) {
                    append(zArr[i10], zArr2[i10]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }
}
