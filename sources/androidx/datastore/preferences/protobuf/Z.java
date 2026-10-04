package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class Z extends AbstractC2514b<String> implements InterfaceC2513a0, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z f112783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC2513a0 f112784e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Object> f112785c;

    public static class a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Z f112786a;

        public a(Z z10) {
            this.f112786a = z10;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(int i10, byte[] bArr) {
            this.f112786a.q(i10, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] get(int i10) {
            return this.f112786a.L0(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int i10) {
            String strRemove = this.f112786a.remove(i10);
            ((AbstractList) this).modCount++;
            return Z.s(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public byte[] set(int i10, byte[] bArr) {
            Object objC = this.f112786a.C(i10, bArr);
            ((AbstractList) this).modCount++;
            return Z.s(objC);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f112786a.size();
        }
    }

    public static class b extends AbstractList<ByteString> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Z f112787a;

        public b(Z z10) {
            this.f112787a = z10;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(int i10, ByteString byteString) {
            this.f112787a.n(i10, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString get(int i10) {
            return this.f112787a.V2(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ByteString remove(int i10) {
            String strRemove = this.f112787a.remove(i10);
            ((AbstractList) this).modCount++;
            return Z.t(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public ByteString set(int i10, ByteString byteString) {
            Object objB = this.f112787a.B(i10, byteString);
            ((AbstractList) this).modCount++;
            return Z.t(objB);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f112787a.size();
        }
    }

    static {
        Z z10 = new Z();
        f112783d = z10;
        z10.f112824a = false;
        f112784e = z10;
    }

    public Z() {
        this(10);
    }

    public static byte[] s(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? V.y((String) obj) : ((ByteString) obj).Z();
    }

    public static ByteString t(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.z((String) obj) : ByteString.x((byte[]) obj);
    }

    public static String v(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            return V.z((byte[]) obj);
        }
        ByteString byteString = (ByteString) obj;
        byteString.getClass();
        return byteString.c0(V.f112719a);
    }

    public static Z w() {
        return f112783d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        b();
        return v(this.f112785c.set(i10, str));
    }

    public final Object B(int i10, ByteString byteString) {
        b();
        return this.f112785c.set(i10, byteString);
    }

    public final Object C(int i10, byte[] bArr) {
        b();
        return this.f112785c.set(i10, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void C1(ByteString byteString) {
        b();
        this.f112785c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public List<?> J2() {
        return Collections.unmodifiableList(this.f112785c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public byte[] L0(int i10) {
        Object obj = this.f112785c.get(i10);
        byte[] bArrS = s(obj);
        if (bArrS != obj) {
            this.f112785c.set(i10, bArrS);
        }
        return bArrS;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public boolean M1(Collection<? extends ByteString> collection) {
        b();
        boolean zAddAll = this.f112785c.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public boolean O0(Collection<byte[]> collection) {
        b();
        boolean zAddAll = this.f112785c.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public List<byte[]> Q0() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void R2(InterfaceC2513a0 interfaceC2513a0) {
        b();
        for (Object obj : interfaceC2513a0.J2()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f112785c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f112785c.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public Object U3(int i10) {
        return this.f112785c.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public ByteString V2(int i10) {
        Object obj = this.f112785c.get(i10);
        ByteString byteStringT = t(obj);
        if (byteStringT != obj) {
            this.f112785c.set(i10, byteStringT);
        }
        return byteStringT;
    }

    @Override // androidx.datastore.preferences.protobuf.D0
    public List<ByteString> Z2() {
        return new b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public InterfaceC2513a0 c2() {
        return k3() ? new Z0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f112785c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, androidx.datastore.preferences.protobuf.V.k
    public boolean k3() {
        return this.f112824a;
    }

    public final void n(int i10, ByteString byteString) {
        b();
        this.f112785c.add(i10, byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        b();
        this.f112785c.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    public final void q(int i10, byte[] bArr) {
        b();
        this.f112785c.add(i10, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112785c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f112785c.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            byte[] bArr = (byte[]) obj;
            String strZ = V.z(bArr);
            if (Utf8.t(bArr)) {
                this.f112785c.set(i10, strZ);
            }
            return strZ;
        }
        ByteString byteString = (ByteString) obj;
        byteString.getClass();
        String strC0 = byteString.c0(V.f112719a);
        if (byteString.I()) {
            this.f112785c.set(i10, strC0);
        }
        return strC0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void x3(int i10, byte[] bArr) {
        C(i10, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Z d2(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f112785c);
        return new Z((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        b();
        Object objRemove = this.f112785c.remove(i10);
        ((AbstractList) this).modCount++;
        return v(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void z2(int i10, ByteString byteString) {
        B(i10, byteString);
    }

    public Z(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void add(byte[] bArr) {
        b();
        this.f112785c.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof InterfaceC2513a0) {
            collection = ((InterfaceC2513a0) collection).J2();
        }
        boolean zAddAll = this.f112785c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public Z(InterfaceC2513a0 interfaceC2513a0) {
        this.f112785c = new ArrayList(interfaceC2513a0.size());
        addAll(interfaceC2513a0);
    }

    public Z(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    public Z(ArrayList<Object> arrayList) {
        this.f112785c = arrayList;
    }
}
