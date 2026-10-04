package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f112719a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f112720b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f112721c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f112722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f112723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2549t f112724f;

    public interface a extends k<Boolean> {
        void addBoolean(boolean z10);

        @Override // androidx.datastore.preferences.protobuf.V.k
        k<Boolean> d(int i10);

        boolean e(int i10, boolean z10);

        boolean r(int i10);
    }

    public interface b extends k<Double> {
        void N1(double d10);

        @Override // androidx.datastore.preferences.protobuf.V.k
        k<Double> d(int i10);

        double getDouble(int i10);

        double p(int i10, double d10);
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
        T a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends k<Float> {
        @Override // androidx.datastore.preferences.protobuf.V.k
        k<Float> d(int i10);

        float getFloat(int i10);

        float m(int i10, float f10);

        void m2(float f10);
    }

    public interface g extends k<Integer> {
        @Override // androidx.datastore.preferences.protobuf.V.k
        k<Integer> d(int i10);

        int f(int i10, int i11);

        int getInt(int i10);

        void q3(int i10);
    }

    public static class h<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<F> f112725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<F, T> f112726b;

        public interface a<F, T> {
            T a(F f10);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f112725a = list;
            this.f112726b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.f112726b.a(this.f112725a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f112725a.size();
        }
    }

    public interface i extends k<Long> {
        void G1(long j10);

        @Override // androidx.datastore.preferences.protobuf.V.k
        k<Long> d(int i10);

        long getLong(int i10);

        long u(int i10, long j10);
    }

    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, RealValue> f112727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<RealValue, V> f112728b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f112729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f112730b;

            public a(d dVar, c cVar) {
                this.f112729a = dVar;
                this.f112730b = cVar;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // androidx.datastore.preferences.protobuf.V.j.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer b(c cVar) {
                return Integer.valueOf(cVar.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // androidx.datastore.preferences.protobuf.V.j.b
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c a(Integer num) {
                c cVarA = this.f112729a.a(num.intValue());
                return cVarA == null ? this.f112730b : cVarA;
            }
        }

        public interface b<A, B> {
            B a(A a10);

            A b(B b10);
        }

        public class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map.Entry<K, RealValue> f112731a;

            public c(Map.Entry<K, RealValue> entry) {
                this.f112731a = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f112731a.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) j.this.f112728b.a(this.f112731a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f112731a.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v10) {
                RealValue value = this.f112731a.setValue((RealValue) j.this.f112728b.b(v10));
                if (value == null) {
                    return null;
                }
                return j.this.f112728b.a(value);
            }
        }

        public class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, RealValue>> f112733a;

            public d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f112733a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f112733a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f112733a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f112733a.remove();
            }
        }

        public class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set<Map.Entry<K, RealValue>> f112735a;

            public e(Set<Map.Entry<K, RealValue>> set) {
                this.f112735a = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f112735a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f112735a.size();
            }
        }

        public j(Map<K, RealValue> map, b<RealValue, V> bVar) {
            this.f112727a = map;
            this.f112728b = bVar;
        }

        public static <T extends c> b<Integer, T> b(d<T> dVar, T t10) {
            return new a(dVar, t10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f112727a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.f112727a.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f112728b.a(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            RealValue realvaluePut = this.f112727a.put(k10, this.f112728b.b(v10));
            if (realvaluePut == null) {
                return null;
            }
            return this.f112728b.a(realvaluePut);
        }
    }

    public interface k<E> extends List<E>, RandomAccess {
        k<E> d(int i10);

        boolean k3();

        void p2();
    }

    static {
        byte[] bArr = new byte[0];
        f112722d = bArr;
        f112723e = ByteBuffer.wrap(bArr);
        f112724f = AbstractC2549t.r(bArr, 0, bArr.length, false);
    }

    public static byte[] a(String str) {
        return str.getBytes(f112720b);
    }

    public static ByteBuffer b(String str) {
        return ByteBuffer.wrap(str.getBytes(f112720b));
    }

    public static ByteString c(String str) {
        return ByteString.x(str.getBytes(f112720b));
    }

    public static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean g(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    public static boolean i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!h(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends MessageLite> T j(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + cls, e10);
        }
    }

    public static int k(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int l(List<byte[]> list) {
        int iN = 1;
        for (byte[] bArr : list) {
            iN = (iN * 31) + n(bArr, 0, bArr.length);
        }
        return iN;
    }

    public static int m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static int n(byte[] bArr, int i10, int i11) {
        int iW = w(i11, bArr, i10, i11);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }

    public static int o(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iW = w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (iW == 0) {
                return 1;
            }
            return iW;
        }
        int iCapacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        int iCapacity2 = byteBuffer.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = w(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static int p(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iO = 1;
        while (it.hasNext()) {
            iO = (iO * 31) + o(it.next());
        }
        return iO;
    }

    public static int q(c cVar) {
        return cVar.getNumber();
    }

    public static int r(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int number = 1;
        while (it.hasNext()) {
            number = (number * 31) + it.next().getNumber();
        }
        return number;
    }

    public static int s(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean t(ByteString byteString) {
        return byteString.I();
    }

    public static boolean u(byte[] bArr) {
        return Utf8.t(bArr);
    }

    public static Object v(Object obj, Object obj2) {
        return ((MessageLite) obj).e().mergeFrom((MessageLite) obj2).buildPartial();
    }

    public static int w(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String x(String str) {
        return new String(str.getBytes(f112720b), f112719a);
    }

    public static byte[] y(String str) {
        return str.getBytes(f112719a);
    }

    public static String z(byte[] bArr) {
        return new String(bArr, f112719a);
    }
}
