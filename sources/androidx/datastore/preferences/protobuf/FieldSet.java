package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.b;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldSet<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f112588d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FieldSet f112589e = new FieldSet(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J0<T, Object> f112590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f112591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f112592c;

    public static final class Builder<T extends b<T>> {
        private J0<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = FieldSet.l(this.fields, true);
            this.isMutable = true;
        }

        public static <T extends b<T>> Builder<T> fromFieldSet(FieldSet<T> fieldSet) {
            Builder<T> builder = new Builder<>(FieldSet.l(fieldSet.f112590a, true));
            ((Builder) builder).hasLazyField = fieldSet.f112592c;
            return builder;
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof X) {
                value = ((X) value).p();
            }
            if (key.m3()) {
                Object field = getField(key);
                if (field == null) {
                    field = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) field).add(FieldSet.n(it.next()));
                }
                this.fields.put(key, field);
                return;
            }
            if (key.V1() != WireFormat.JavaType.MESSAGE) {
                this.fields.put(key, FieldSet.n(value));
                return;
            }
            Object field2 = getField(key);
            if (field2 == null) {
                this.fields.put(key, FieldSet.n(value));
            } else if (field2 instanceof MessageLite.Builder) {
                key.U((MessageLite.Builder) field2, (MessageLite) value);
            } else {
                this.fields.put(key, key.U(((MessageLite) field2).e(), (MessageLite) value).build());
            }
        }

        private static Object replaceBuilder(Object obj) {
            return obj instanceof MessageLite.Builder ? ((MessageLite.Builder) obj).build() : obj;
        }

        private static <T extends b<T>> void replaceBuilders(J0<T, Object> j02) {
            for (int i10 = 0; i10 < j02.o(); i10++) {
                replaceBuilders(j02.m(i10));
            }
            Iterator it = j02.q().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next());
            }
        }

        private static void verifyType(WireFormat.FieldType fieldType, Object obj) {
            if (FieldSet.G(fieldType, obj)) {
                return;
            }
            if (fieldType.getJavaType() != WireFormat.JavaType.MESSAGE || !(obj instanceof MessageLite.Builder)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        public void addRepeatedField(T t10, Object obj) {
            List arrayList;
            ensureIsMutable();
            if (!t10.m3()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            verifyType(t10.T0(), obj);
            Object field = getField(t10);
            if (field == null) {
                arrayList = new ArrayList();
                this.fields.put(t10, arrayList);
            } else {
                arrayList = (List) field;
            }
            arrayList.add(obj);
        }

        public FieldSet<T> build() {
            if (this.fields.isEmpty()) {
                return FieldSet.s();
            }
            this.isMutable = false;
            J0<T, Object> j0L = this.fields;
            if (this.hasNestedBuilders) {
                j0L = FieldSet.l(j0L, false);
                replaceBuilders(j0L);
            }
            FieldSet<T> fieldSet = new FieldSet<>(j0L);
            fieldSet.f112592c = this.hasLazyField;
            return fieldSet;
        }

        public void clearField(T t10) {
            ensureIsMutable();
            this.fields.remove(t10);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.u() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            J0 j0L = FieldSet.l(this.fields, false);
            if (this.fields.u()) {
                j0L.v();
                return j0L;
            }
            replaceBuilders(j0L);
            return j0L;
        }

        public Object getField(T t10) {
            return replaceBuilders(t10, getFieldAllowBuilders(t10));
        }

        public Object getFieldAllowBuilders(T t10) {
            Object obj = this.fields.get(t10);
            return obj instanceof X ? ((X) obj).p() : obj;
        }

        public Object getRepeatedField(T t10, int i10) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t10, i10));
        }

        public Object getRepeatedFieldAllowBuilders(T t10, int i10) {
            if (!t10.m3()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int getRepeatedFieldCount(T t10) {
            if (!t10.m3()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object field = getField(t10);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }

        public boolean hasField(T t10) {
            if (t10.m3()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(t10) != null;
        }

        public boolean isInitialized() {
            for (int i10 = 0; i10 < this.fields.o(); i10++) {
                if (!FieldSet.F(this.fields.m(i10))) {
                    return false;
                }
            }
            Iterator it = this.fields.q().iterator();
            while (it.hasNext()) {
                if (!FieldSet.F((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(FieldSet<T> fieldSet) {
            ensureIsMutable();
            for (int i10 = 0; i10 < fieldSet.f112590a.o(); i10++) {
                mergeFromField(fieldSet.f112590a.m(i10));
            }
            Iterator it = fieldSet.f112590a.q().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t10, Object obj) {
            ensureIsMutable();
            if (!t10.m3()) {
                verifyType(t10.T0(), obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    verifyType(t10.T0(), obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof MessageLite.Builder);
                }
                obj = arrayList;
            }
            if (obj instanceof X) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            this.fields.put(t10, obj);
        }

        public void setRepeatedField(T t10, int i10, Object obj) {
            ensureIsMutable();
            if (!t10.m3()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            Object field = getField(t10);
            if (field == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(t10.T0(), obj);
            ((List) field).set(i10, obj);
        }

        private Builder() {
            this(J0.w(16));
        }

        private Builder(J0<T, Object> j02) {
            this.fields = j02;
            this.isMutable = true;
        }

        private static <T extends b<T>> void replaceBuilders(Map.Entry<T, Object> entry) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue()));
        }

        private static <T extends b<T>> Object replaceBuilders(T t10, Object obj) {
            if (obj == null || t10.V1() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (t10.m3()) {
                if (obj instanceof List) {
                    List arrayList = (List) obj;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        Object obj2 = arrayList.get(i10);
                        Object objReplaceBuilder = replaceBuilder(obj2);
                        if (objReplaceBuilder != obj2) {
                            if (arrayList == obj) {
                                arrayList = new ArrayList(arrayList);
                            }
                            arrayList.set(i10, objReplaceBuilder);
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            return replaceBuilder(obj);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f112594b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f112594b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112594b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112594b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112594b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112594b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112594b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112594b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f112594b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f112594b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f112594b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f112594b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f112594b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f112594b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f112594b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f112594b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f112594b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f112594b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f112594b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f112593a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f112593a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f112593a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f112593a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f112593a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f112593a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f112593a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f112593a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f112593a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        V.d<?> H2();

        WireFormat.FieldType T0();

        MessageLite.Builder U(MessageLite.Builder builder, MessageLite messageLite);

        WireFormat.JavaType V1();

        int getNumber();

        boolean isPacked();

        boolean m3();
    }

    public /* synthetic */ FieldSet(J0 j02, a aVar) {
        this(j02);
    }

    public static int A(WireFormat.FieldType fieldType, boolean z10) {
        if (z10) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public static <T extends b<T>> boolean F(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.V1() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.m3()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((MessageLite) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof MessageLite) {
            return ((MessageLite) value).isInitialized();
        }
        if (value instanceof X) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean G(WireFormat.FieldType fieldType, Object obj) {
        V.d(obj);
        switch (a.f112593a[fieldType.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof V.c)) {
                }
                break;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof X)) {
                }
                break;
        }
        return false;
    }

    public static <T extends b<T>> Builder<T> L() {
        return new Builder<>((a) null);
    }

    public static <T extends b<T>> FieldSet<T> M() {
        return new FieldSet<>();
    }

    public static Object N(AbstractC2549t abstractC2549t, WireFormat.FieldType fieldType, boolean z10) throws IOException {
        return z10 ? WireFormat.d(abstractC2549t, fieldType, WireFormat.Utf8Validation.STRICT) : WireFormat.d(abstractC2549t, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    public static void R(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.F1(i10, (MessageLite) obj);
        } else {
            codedOutputStream.g2(i10, fieldType.getWireType());
            S(codedOutputStream, fieldType, obj);
        }
    }

    public static void S(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f112594b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.A1(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.E1(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.i2(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.i2(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.J1(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.C1(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.T(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                codedOutputStream.getClass();
                ((MessageLite) obj).c(codedOutputStream);
                break;
            case 10:
                codedOutputStream.N1((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.f2((String) obj);
                } else {
                    codedOutputStream.z1((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.w1((byte[]) obj);
                } else {
                    codedOutputStream.z1((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.h2(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.C1(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.d2(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.e2(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof V.c)) {
                    codedOutputStream.J1(((Integer) obj).intValue());
                } else {
                    codedOutputStream.J1(((V.c) obj).getNumber());
                }
                break;
        }
    }

    public static void T(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType fieldTypeT0 = bVar.T0();
        int number = bVar.getNumber();
        if (!bVar.m3()) {
            if (obj instanceof X) {
                R(codedOutputStream, fieldTypeT0, number, ((X) obj).p());
                return;
            } else {
                R(codedOutputStream, fieldTypeT0, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                R(codedOutputStream, fieldTypeT0, number, it.next());
            }
            return;
        }
        codedOutputStream.g2(number, 2);
        Iterator it2 = list.iterator();
        int iP = 0;
        while (it2.hasNext()) {
            iP += p(fieldTypeT0, it2.next());
        }
        codedOutputStream.h2(iP);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            S(codedOutputStream, fieldTypeT0, it3.next());
        }
    }

    public static <T extends b<T>> J0<T, Object> l(J0<T, Object> j02, boolean z10) {
        J0<T, Object> j0W = J0.w(16);
        for (int i10 = 0; i10 < j02.o(); i10++) {
            m(j0W, j02.m(i10), z10);
        }
        Iterator it = j02.q().iterator();
        while (it.hasNext()) {
            m(j0W, (Map.Entry) it.next(), z10);
        }
        return j0W;
    }

    public static <T extends b<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof X) {
            map.put(key, ((X) value).p());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    public static Object n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int o(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iX0 = CodedOutputStream.X0(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iX0 *= 2;
        }
        return p(fieldType, obj) + iX0;
    }

    public static int p(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f112594b[fieldType.ordinal()]) {
            case 1:
                CodedOutputStream.j0(((Double) obj).doubleValue());
                return 8;
            case 2:
                CodedOutputStream.r0(((Float) obj).floatValue());
                return 4;
            case 3:
                return CodedOutputStream.z0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.b1(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.x0(((Integer) obj).intValue());
            case 6:
                CodedOutputStream.p0(((Long) obj).longValue());
                return 8;
            case 7:
                CodedOutputStream.n0(((Integer) obj).intValue());
                return 4;
            case 8:
                CodedOutputStream.b0(((Boolean) obj).booleanValue());
                return 1;
            case 9:
                return CodedOutputStream.u0((MessageLite) obj);
            case 10:
                return obj instanceof X ? CodedOutputStream.C0((X) obj) : CodedOutputStream.H0((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.h0((ByteString) obj) : CodedOutputStream.W0((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.h0((ByteString) obj) : CodedOutputStream.d0((byte[]) obj);
            case 13:
                return CodedOutputStream.Z0(((Integer) obj).intValue());
            case 14:
                CodedOutputStream.O0(((Integer) obj).intValue());
                return 4;
            case 15:
                CodedOutputStream.Q0(((Long) obj).longValue());
                return 8;
            case 16:
                return CodedOutputStream.S0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.U0(((Long) obj).longValue());
            case 18:
                return obj instanceof V.c ? CodedOutputStream.l0(((V.c) obj).getNumber()) : CodedOutputStream.l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeT0 = bVar.T0();
        int number = bVar.getNumber();
        if (!bVar.m3()) {
            return o(fieldTypeT0, number, obj);
        }
        int iO = 0;
        if (!bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iO += o(fieldTypeT0, number, it.next());
            }
            return iO;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iO += p(fieldTypeT0, it2.next());
        }
        return CodedOutputStream.Z0(iO) + CodedOutputStream.X0(number) + iO;
    }

    public static <T extends b<T>> FieldSet<T> s() {
        return f112589e;
    }

    public boolean B(T t10) {
        if (t10.m3()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f112590a.get(t10) != null;
    }

    public boolean C() {
        return this.f112590a.isEmpty();
    }

    public boolean D() {
        return this.f112591b;
    }

    public boolean E() {
        for (int i10 = 0; i10 < this.f112590a.o(); i10++) {
            if (!F(this.f112590a.m(i10))) {
                return false;
            }
        }
        Iterator it = this.f112590a.q().iterator();
        while (it.hasNext()) {
            if (!F((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> H() {
        return this.f112592c ? new X.c(this.f112590a.entrySet().iterator()) : this.f112590a.entrySet().iterator();
    }

    public void I() {
        if (this.f112591b) {
            return;
        }
        this.f112590a.v();
        this.f112591b = true;
    }

    public void J(FieldSet<T> fieldSet) {
        for (int i10 = 0; i10 < fieldSet.f112590a.o(); i10++) {
            K(fieldSet.f112590a.m(i10));
        }
        Iterator it = fieldSet.f112590a.q().iterator();
        while (it.hasNext()) {
            K((Map.Entry) it.next());
        }
    }

    public final void K(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof X) {
            value = ((X) value).p();
        }
        if (key.m3()) {
            Object objU = u(key);
            if (objU == null) {
                objU = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objU).add(n(it.next()));
            }
            this.f112590a.put(key, objU);
            return;
        }
        if (key.V1() != WireFormat.JavaType.MESSAGE) {
            this.f112590a.put(key, n(value));
            return;
        }
        Object objU2 = u(key);
        if (objU2 == null) {
            this.f112590a.put(key, n(value));
        } else {
            this.f112590a.put(key, key.U(((MessageLite) objU2).e(), (MessageLite) value).build());
        }
    }

    public void O(T t10, Object obj) {
        if (!t10.m3()) {
            Q(t10.T0(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                Q(t10.T0(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof X) {
            this.f112592c = true;
        }
        this.f112590a.put(t10, obj);
    }

    public void P(T t10, int i10, Object obj) {
        if (!t10.m3()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t10);
        if (objU == null) {
            throw new IndexOutOfBoundsException();
        }
        Q(t10.T0(), obj);
        ((List) objU).set(i10, obj);
    }

    public final void Q(WireFormat.FieldType fieldType, Object obj) {
        if (!G(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public void U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f112590a.o(); i10++) {
            V(this.f112590a.m(i10), codedOutputStream);
        }
        Iterator it = this.f112590a.q().iterator();
        while (it.hasNext()) {
            V((Map.Entry) it.next(), codedOutputStream);
        }
    }

    public final void V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.V1() != WireFormat.JavaType.MESSAGE || key.m3() || key.isPacked()) {
            T(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof X) {
            value = ((X) value).p();
        }
        codedOutputStream.P1(entry.getKey().getNumber(), (MessageLite) value);
    }

    public void W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f112590a.o(); i10++) {
            Map.Entry<K, Object> entryM = this.f112590a.m(i10);
            T((b) entryM.getKey(), entryM.getValue(), codedOutputStream);
        }
        Iterator it = this.f112590a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            T((b) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f112590a.equals(((FieldSet) obj).f112590a);
        }
        return false;
    }

    public void h(T t10, Object obj) {
        List arrayList;
        if (!t10.m3()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        Q(t10.T0(), obj);
        Object objU = u(t10);
        if (objU == null) {
            arrayList = new ArrayList();
            this.f112590a.put(t10, arrayList);
        } else {
            arrayList = (List) objU;
        }
        arrayList.add(obj);
    }

    public int hashCode() {
        return this.f112590a.hashCode();
    }

    public void i() {
        this.f112590a.clear();
        this.f112592c = false;
    }

    public void j(T t10) {
        this.f112590a.remove(t10);
        if (this.f112590a.isEmpty()) {
            this.f112592c = false;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> clone() {
        FieldSet<T> fieldSet = new FieldSet<>();
        for (int i10 = 0; i10 < this.f112590a.o(); i10++) {
            Map.Entry<K, Object> entryM = this.f112590a.m(i10);
            fieldSet.O((b) entryM.getKey(), entryM.getValue());
        }
        Iterator it = this.f112590a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fieldSet.O((b) entry.getKey(), entry.getValue());
        }
        fieldSet.f112592c = this.f112592c;
        return fieldSet;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        return this.f112592c ? new X.c(this.f112590a.j().iterator()) : this.f112590a.j().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f112592c) {
            return this.f112590a.u() ? this.f112590a : Collections.unmodifiableMap(this.f112590a);
        }
        J0 j0L = l(this.f112590a, false);
        if (this.f112590a.u()) {
            j0L.v();
        }
        return j0L;
    }

    public Object u(T t10) {
        Object obj = this.f112590a.get(t10);
        return obj instanceof X ? ((X) obj).p() : obj;
    }

    public int v() {
        int iW = 0;
        for (int i10 = 0; i10 < this.f112590a.o(); i10++) {
            iW += w(this.f112590a.m(i10));
        }
        Iterator it = this.f112590a.q().iterator();
        while (it.hasNext()) {
            iW += w((Map.Entry) it.next());
        }
        return iW;
    }

    public final int w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.V1() != WireFormat.JavaType.MESSAGE || key.m3() || key.isPacked()) ? q(key, value) : value instanceof X ? CodedOutputStream.A0(entry.getKey().getNumber(), (X) value) : CodedOutputStream.E0(entry.getKey().getNumber(), (MessageLite) value);
    }

    public Object x(T t10, int i10) {
        if (!t10.m3()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t10);
        if (objU != null) {
            return ((List) objU).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(T t10) {
        if (!t10.m3()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t10);
        if (objU == null) {
            return 0;
        }
        return ((List) objU).size();
    }

    public int z() {
        int iQ = 0;
        for (int i10 = 0; i10 < this.f112590a.o(); i10++) {
            Map.Entry<K, Object> entryM = this.f112590a.m(i10);
            iQ += q((b) entryM.getKey(), entryM.getValue());
        }
        Iterator it = this.f112590a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iQ += q((b) entry.getKey(), entry.getValue());
        }
        return iQ;
    }

    public FieldSet() {
        this.f112590a = J0.w(16);
    }

    public FieldSet(boolean z10) {
        this(J0.w(0));
        I();
    }

    public FieldSet(J0<T, Object> j02) {
        this.f112590a = j02;
        I();
    }
}
