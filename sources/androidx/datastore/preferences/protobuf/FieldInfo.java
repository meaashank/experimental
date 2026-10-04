package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldInfo implements Comparable<FieldInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f112573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FieldType f112574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f112575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f112577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f112578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2556w0 f112581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Field f112582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class<?> f112583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f112584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V.e f112585m;

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private V.e enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private C2556w0 oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public FieldInfo build() {
            C2556w0 c2556w0 = this.oneof;
            if (c2556w0 != null) {
                return FieldInfo.f(this.fieldNumber, this.type, c2556w0, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.e(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                return this.required ? FieldInfo.j(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : FieldInfo.i(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            V.e eVar = this.enumVerifier;
            if (eVar != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                return field2 == null ? FieldInfo.d(this.field, this.fieldNumber, this.type, eVar) : FieldInfo.h(this.field, this.fieldNumber, this.type, eVar, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            return field3 == null ? FieldInfo.c(this.field, this.fieldNumber, this.type, this.enforceUtf8) : FieldInfo.g(this.field, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z10) {
            this.enforceUtf8 = z10;
            return this;
        }

        public Builder withEnumVerifier(V.e eVar) {
            this.enumVerifier = eVar;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            if (this.oneof != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public Builder withFieldNumber(int i10) {
            this.fieldNumber = i10;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(C2556w0 c2556w0, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = c2556w0;
            this.oneofStoredType = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i10) {
            V.e(field, "presenceField");
            this.presenceField = field;
            this.presenceMask = i10;
            return this;
        }

        public Builder withRequired(boolean z10) {
            this.required = z10;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112586a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f112586a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112586a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112586a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112586a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i10, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, C2556w0 c2556w0, Class<?> cls2, Object obj, V.e eVar, java.lang.reflect.Field field3) {
        this.f112573a = field;
        this.f112574b = fieldType;
        this.f112575c = cls;
        this.f112576d = i10;
        this.f112577e = field2;
        this.f112578f = i11;
        this.f112579g = z10;
        this.f112580h = z11;
        this.f112581i = c2556w0;
        this.f112583k = cls2;
        this.f112584l = obj;
        this.f112585m = eVar;
        this.f112582j = field3;
    }

    public static boolean A(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    public static Builder C() {
        return new Builder(null);
    }

    public static void a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("fieldNumber must be positive: ", i10));
        }
    }

    public static FieldInfo c(java.lang.reflect.Field field, int i10, FieldType fieldType, boolean z10) {
        a(i10);
        V.e(field, "field");
        V.e(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static FieldInfo d(java.lang.reflect.Field field, int i10, FieldType fieldType, V.e eVar) {
        a(i10);
        V.e(field, "field");
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static FieldInfo e(java.lang.reflect.Field field, int i10, Object obj, V.e eVar) {
        V.e(obj, "mapDefaultEntry");
        a(i10);
        V.e(field, "field");
        return new FieldInfo(field, i10, FieldType.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static FieldInfo f(int i10, FieldType fieldType, C2556w0 c2556w0, Class<?> cls, boolean z10, V.e eVar) {
        a(i10);
        V.e(fieldType, "fieldType");
        V.e(c2556w0, "oneof");
        V.e(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new FieldInfo(null, i10, fieldType, null, null, 0, false, z10, c2556w0, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + fieldType);
    }

    public static FieldInfo g(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2) {
        a(i10);
        V.e(field, "field");
        V.e(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static FieldInfo h(java.lang.reflect.Field field, int i10, FieldType fieldType, V.e eVar, java.lang.reflect.Field field2) {
        a(i10);
        V.e(field, "field");
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static FieldInfo i(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z10, V.e eVar) {
        a(i10);
        V.e(field, "field");
        V.e(fieldType, "fieldType");
        V.e(field2, "presenceField");
        if (A(i11)) {
            return new FieldInfo(field, i10, fieldType, null, field2, i11, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("presenceMask must have exactly one bit set: ", i11));
    }

    public static FieldInfo j(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z10, V.e eVar) {
        a(i10);
        V.e(field, "field");
        V.e(fieldType, "fieldType");
        V.e(field2, "presenceField");
        if (A(i11)) {
            return new FieldInfo(field, i10, fieldType, null, field2, i11, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("presenceMask must have exactly one bit set: ", i11));
    }

    public static FieldInfo k(java.lang.reflect.Field field, int i10, FieldType fieldType, Class<?> cls) {
        a(i10);
        V.e(field, "field");
        V.e(fieldType, "fieldType");
        V.e(cls, "messageClass");
        return new FieldInfo(field, i10, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    public boolean B() {
        return this.f112579g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f112576d - fieldInfo.f112576d;
    }

    public java.lang.reflect.Field l() {
        return this.f112582j;
    }

    public V.e m() {
        return this.f112585m;
    }

    public java.lang.reflect.Field n() {
        return this.f112573a;
    }

    public int p() {
        return this.f112576d;
    }

    public Class<?> r() {
        return this.f112575c;
    }

    public Object s() {
        return this.f112584l;
    }

    public Class<?> t() {
        int i10 = a.f112586a[this.f112574b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            java.lang.reflect.Field field = this.f112573a;
            return field != null ? field.getType() : this.f112583k;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f112575c;
        }
        return null;
    }

    public C2556w0 u() {
        return this.f112581i;
    }

    public Class<?> v() {
        return this.f112583k;
    }

    public java.lang.reflect.Field w() {
        return this.f112577e;
    }

    public int x() {
        return this.f112578f;
    }

    public FieldType y() {
        return this.f112574b;
    }

    public boolean z() {
        return this.f112580h;
    }
}
