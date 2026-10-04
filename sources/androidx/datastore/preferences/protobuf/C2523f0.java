package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2523f0<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f112841d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f112842e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<K, V> f112843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f112844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f112845c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112846a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f112846a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112846a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112846a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f0$b */
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f112847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f112848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f112849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f112850d;

        public b(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
            this.f112847a = fieldType;
            this.f112848b = k10;
            this.f112849c = fieldType2;
            this.f112850d = v10;
        }
    }

    public C2523f0(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        this.f112843a = new b<>(fieldType, k10, fieldType2, v10);
        this.f112844b = k10;
        this.f112845c = v10;
    }

    public static <K, V> int b(b<K, V> bVar, K k10, V v10) {
        return FieldSet.o(bVar.f112849c, 2, v10) + FieldSet.o(bVar.f112847a, 1, k10);
    }

    public static <K, V> C2523f0<K, V> f(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        return new C2523f0<>(fieldType, k10, fieldType2, v10);
    }

    public static <K, V> Map.Entry<K, V> h(AbstractC2549t abstractC2549t, b<K, V> bVar, H h10) throws IOException {
        Object objI = bVar.f112848b;
        Object objI2 = bVar.f112850d;
        while (true) {
            int iY = abstractC2549t.Y();
            if (iY == 0) {
                break;
            }
            if (iY == (bVar.f112847a.getWireType() | 8)) {
                objI = i(abstractC2549t, h10, bVar.f112847a, objI);
            } else if (iY == (bVar.f112849c.getWireType() | 16)) {
                objI2 = i(abstractC2549t, h10, bVar.f112849c, objI2);
            } else if (!abstractC2549t.g0(iY)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objI, objI2);
    }

    public static <T> T i(AbstractC2549t abstractC2549t, H h10, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i10 = a.f112846a[fieldType.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builderE = ((MessageLite) t10).e();
            abstractC2549t.I(builderE, h10);
            return (T) builderE.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(abstractC2549t.z());
        }
        if (i10 != 3) {
            return (T) FieldSet.N(abstractC2549t, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void l(CodedOutputStream codedOutputStream, b<K, V> bVar, K k10, V v10) throws IOException {
        FieldSet.R(codedOutputStream, bVar.f112847a, 1, k10);
        FieldSet.R(codedOutputStream, bVar.f112849c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        int iX0 = CodedOutputStream.X0(i10);
        int iB = b(this.f112843a, k10, v10);
        return CodedOutputStream.Z0(iB) + iB + iX0;
    }

    public K c() {
        return this.f112844b;
    }

    public b<K, V> d() {
        return this.f112843a;
    }

    public V e() {
        return this.f112845c;
    }

    public Map.Entry<K, V> g(ByteString byteString, H h10) throws IOException {
        return h(byteString.L(), this.f112843a, h10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(MapFieldLite<K, V> mapFieldLite, AbstractC2549t abstractC2549t, H h10) throws IOException {
        int iT = abstractC2549t.t(abstractC2549t.N());
        b<K, V> bVar = this.f112843a;
        Object objI = bVar.f112848b;
        Object objI2 = bVar.f112850d;
        while (true) {
            int iY = abstractC2549t.Y();
            if (iY == 0) {
                break;
            }
            if (iY == (this.f112843a.f112847a.getWireType() | 8)) {
                objI = i(abstractC2549t, h10, this.f112843a.f112847a, objI);
            } else if (iY == (this.f112843a.f112849c.getWireType() | 16)) {
                objI2 = i(abstractC2549t, h10, this.f112843a.f112849c, objI2);
            } else if (!abstractC2549t.g0(iY)) {
                break;
            }
        }
        abstractC2549t.a(0);
        abstractC2549t.s(iT);
        mapFieldLite.put(objI, objI2);
    }

    public void k(CodedOutputStream codedOutputStream, int i10, K k10, V v10) throws IOException {
        codedOutputStream.g2(i10, 2);
        codedOutputStream.h2(b(this.f112843a, k10, v10));
        l(codedOutputStream, this.f112843a, k10, v10);
    }

    public C2523f0(b<K, V> bVar, K k10, V v10) {
        this.f112843a = bVar;
        this.f112844b = k10;
        this.f112845c = v10;
    }
}
