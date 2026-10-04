package androidx.work;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.K0;
import e.f0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Data {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f120217b = i.f("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Data f120218c = new Builder().build();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f120219d = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f120220a;

    public static final class Builder {
        private Map<String, Object> mValues = new HashMap();

        @NonNull
        public Data build() throws Throwable {
            Data data = new Data((Map<String, ?>) this.mValues);
            Data.F(data);
            return data;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder put(@NonNull String key, @Nullable Object value) {
            if (value == null) {
                this.mValues.put(key, null);
                return this;
            }
            Class<?> cls = value.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.mValues.put(key, value);
                return this;
            }
            if (cls == boolean[].class) {
                this.mValues.put(key, Data.a((boolean[]) value));
                return this;
            }
            if (cls == byte[].class) {
                this.mValues.put(key, Data.b((byte[]) value));
                return this;
            }
            if (cls == int[].class) {
                this.mValues.put(key, Data.e((int[]) value));
                return this;
            }
            if (cls == long[].class) {
                this.mValues.put(key, Data.f((long[]) value));
                return this;
            }
            if (cls == float[].class) {
                this.mValues.put(key, Data.d((float[]) value));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
            }
            this.mValues.put(key, Data.c((double[]) value));
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Data data) {
            putAll(data.f120220a);
            return this;
        }

        @NonNull
        public Builder putBoolean(@NonNull String key, boolean value) {
            this.mValues.put(key, Boolean.valueOf(value));
            return this;
        }

        @NonNull
        public Builder putBooleanArray(@NonNull String key, @NonNull boolean[] value) {
            this.mValues.put(key, Data.a(value));
            return this;
        }

        @NonNull
        public Builder putByte(@NonNull String key, byte value) {
            this.mValues.put(key, Byte.valueOf(value));
            return this;
        }

        @NonNull
        public Builder putByteArray(@NonNull String key, @NonNull byte[] value) {
            this.mValues.put(key, Data.b(value));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String key, double value) {
            this.mValues.put(key, Double.valueOf(value));
            return this;
        }

        @NonNull
        public Builder putDoubleArray(@NonNull String key, @NonNull double[] value) {
            this.mValues.put(key, Data.c(value));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String key, float value) {
            this.mValues.put(key, Float.valueOf(value));
            return this;
        }

        @NonNull
        public Builder putFloatArray(@NonNull String key, @NonNull float[] value) {
            this.mValues.put(key, Data.d(value));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String key, int value) {
            this.mValues.put(key, Integer.valueOf(value));
            return this;
        }

        @NonNull
        public Builder putIntArray(@NonNull String key, @NonNull int[] value) {
            this.mValues.put(key, Data.e(value));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String key, long value) {
            this.mValues.put(key, Long.valueOf(value));
            return this;
        }

        @NonNull
        public Builder putLongArray(@NonNull String key, @NonNull long[] value) {
            this.mValues.put(key, Data.f(value));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String key, @Nullable String value) {
            this.mValues.put(key, value);
            return this;
        }

        @NonNull
        public Builder putStringArray(@NonNull String key, @NonNull String[] value) {
            this.mValues.put(key, value);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public Data() {
    }

    @NonNull
    @K0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] F(@NonNull Data data) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(data.f120220a.size());
            for (Map.Entry<String, Object> entry : data.f120220a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(f120217b, "Error in Data#toByteArray: ", e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(f120217b, "Error in Data#toByteArray: ", e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(f120217b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(f120217b, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(f120217b, "Error in Data#toByteArray: ", e15);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e16) {
                    Log.e(f120217b, "Error in Data#toByteArray: ", e16);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e17) {
                Log.e(f120217b, "Error in Data#toByteArray: ", e17);
                throw th;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Boolean[] a(@NonNull boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            boolArr[i10] = Boolean.valueOf(value[i10]);
        }
        return boolArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Byte[] b(@NonNull byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            bArr[i10] = Byte.valueOf(value[i10]);
        }
        return bArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Double[] c(@NonNull double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            dArr[i10] = Double.valueOf(value[i10]);
        }
        return dArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Float[] d(@NonNull float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            fArr[i10] = Float.valueOf(value[i10]);
        }
        return fArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Integer[] e(@NonNull int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            numArr[i10] = Integer.valueOf(value[i10]);
        }
        return numArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Long[] f(@NonNull long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            lArr[i10] = Long.valueOf(value[i10]);
        }
        return lArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] g(@NonNull Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            bArr[i10] = array[i10].byteValue();
        }
        return bArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static double[] h(@NonNull Double[] array) {
        double[] dArr = new double[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            dArr[i10] = array[i10].doubleValue();
        }
        return dArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static float[] i(@NonNull Float[] array) {
        float[] fArr = new float[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            fArr[i10] = array[i10].floatValue();
        }
        return fArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int[] j(@NonNull Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            iArr[i10] = array[i10].intValue();
        }
        return iArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static long[] k(@NonNull Long[] array) {
        long[] jArr = new long[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            jArr[i10] = array[i10].longValue();
        }
        return jArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean[] l(@NonNull Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            zArr[i10] = array[i10].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:4|(7:58|5|61|6|(2:8|9)|52|16)|56|20|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        android.util.Log.e(androidx.work.Data.f120217b, "Error in Data#fromByteArray: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.NonNull
    @androidx.room.K0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.Data m(@androidx.annotation.NonNull byte[] r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
        L1b:
            if (r7 <= 0) goto L31
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r7 = move-exception
            goto L69
        L2d:
            r7 = move-exception
            goto L51
        L2f:
            r7 = move-exception
            goto L51
        L31:
            r3.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.f120217b
            android.util.Log.e(r3, r0, r7)
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L63
        L3f:
            r7 = move-exception
            java.lang.String r2 = androidx.work.Data.f120217b
            android.util.Log.e(r2, r0, r7)
            goto L63
        L46:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L4a:
            r3 = move-exception
        L4b:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L51
        L4f:
            r3 = move-exception
            goto L4b
        L51:
            java.lang.String r4 = androidx.work.Data.f120217b     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L3b
            r3.close()     // Catch: java.io.IOException -> L5c
            goto L3b
        L5c:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.f120217b
            android.util.Log.e(r3, r0, r7)
            goto L3b
        L63:
            androidx.work.Data r7 = new androidx.work.Data
            r7.<init>(r1)
            return r7
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.Data.f120217b
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.Data.f120217b
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.m(byte[]):androidx.work.Data");
    }

    @Nullable
    public String A(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public String[] B(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(@NonNull String key, @NonNull Class<T> klass) {
        Object obj = this.f120220a.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int D() {
        return this.f120220a.size();
    }

    @NonNull
    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || Data.class != o10.getClass()) {
            return false;
        }
        Data data = (Data) o10;
        Set<String> setKeySet = this.f120220a.keySet();
        if (!setKeySet.equals(data.f120220a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.f120220a.get(str);
            Object obj2 = data.f120220a.get(str);
            if (!((obj == null || obj2 == null) ? obj == obj2 : ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : obj.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f120220a.hashCode() * 31;
    }

    public boolean n(@NonNull String key, boolean defaultValue) {
        Object obj = this.f120220a.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    @Nullable
    public boolean[] o(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(@NonNull String key, byte defaultValue) {
        Object obj = this.f120220a.get(key);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : defaultValue;
    }

    @Nullable
    public byte[] q(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(@NonNull String key, double defaultValue) {
        Object obj = this.f120220a.get(key);
        return obj instanceof Double ? ((Double) obj).doubleValue() : defaultValue;
    }

    @Nullable
    public double[] s(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(@NonNull String key, float defaultValue) {
        Object obj = this.f120220a.get(key);
        return obj instanceof Float ? ((Float) obj).floatValue() : defaultValue;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f120220a.isEmpty()) {
            for (String str : this.f120220a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f120220a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(U6.j.f68738d);
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Nullable
    public float[] u(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(@NonNull String key, int defaultValue) {
        Object obj = this.f120220a.get(key);
        return obj instanceof Integer ? ((Integer) obj).intValue() : defaultValue;
    }

    @Nullable
    public int[] w(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    @NonNull
    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.f120220a);
    }

    public long y(@NonNull String key, long defaultValue) {
        Object obj = this.f120220a.get(key);
        return obj instanceof Long ? ((Long) obj).longValue() : defaultValue;
    }

    @Nullable
    public long[] z(@NonNull String key) {
        Object obj = this.f120220a.get(key);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }

    public Data(@NonNull Data other) {
        this.f120220a = new HashMap(other.f120220a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Data(@NonNull Map<String, ?> values) {
        this.f120220a = new HashMap(values);
    }
}
