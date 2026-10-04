package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class Z0 extends AbstractList<String> implements InterfaceC2513a0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2513a0 f112788a;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator<String> f112789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f112790b;

        public a(int i10) {
            this.f112790b = i10;
            this.f112789a = Z0.this.f112788a.listIterator(i10);
        }

        public void a(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
            a(str);
            throw null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f112789a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f112789a.previous();
        }

        public void d(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f112789a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f112789a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f112789a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f112789a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
            d(str);
            throw null;
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<String> f112792a;

        public b() {
            this.f112792a = Z0.this.f112788a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f112792a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112792a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Z0(InterfaceC2513a0 interfaceC2513a0) {
        this.f112788a = interfaceC2513a0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void C1(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public List<?> J2() {
        return this.f112788a.J2();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public byte[] L0(int i10) {
        return this.f112788a.L0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public boolean M1(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public boolean O0(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public List<byte[]> Q0() {
        return Collections.unmodifiableList(this.f112788a.Q0());
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void R2(InterfaceC2513a0 interfaceC2513a0) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public Object U3(int i10) {
        return this.f112788a.U3(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public ByteString V2(int i10) {
        return this.f112788a.V2(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.D0
    public List<ByteString> Z2() {
        return Collections.unmodifiableList(this.f112788a.Z2());
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f112788a.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public InterfaceC2513a0 c2() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112788a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void x3(int i10, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2513a0
    public void z2(int i10, ByteString byteString) {
        throw new UnsupportedOperationException();
    }
}
