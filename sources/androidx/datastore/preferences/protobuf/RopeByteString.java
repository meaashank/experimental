package androidx.datastore.preferences.protobuf;

import androidx.collection.LruCacheKt;
import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.objectweb.asm.Opcodes;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
final class RopeByteString extends ByteString {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f112676n = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, x.e.f238355z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f112677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ByteString f112678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ByteString f112679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f112680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f112681m;

    public class a extends ByteString.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f112682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.f f112683b = b();

        public a() {
            this.f112682a = new c(RopeByteString.this);
        }

        public final ByteString.f b() {
            if (this.f112682a.hasNext()) {
                return this.f112682a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112683b != null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public byte nextByte() {
            ByteString.f fVar = this.f112683b;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = fVar.nextByte();
            if (!this.f112683b.hasNext()) {
                this.f112683b = b();
            }
            return bNextByte;
        }
    }

    public static final class c implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<RopeByteString> f112686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.LeafByteString f112687b;

        public /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        public final ByteString.LeafByteString a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f112686a.push(ropeByteString);
                byteString = ropeByteString.f112678j;
            }
            return (ByteString.LeafByteString) byteString;
        }

        public final ByteString.LeafByteString b() {
            ByteString.LeafByteString leafByteStringA;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f112686a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringA = a(this.f112686a.pop().f112679k);
            } while (leafByteStringA.isEmpty());
            return leafByteStringA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f112687b;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.f112687b = b();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112687b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f112686a = null;
                this.f112687b = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.f112681m);
            this.f112686a = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.f112687b = a(ropeByteString.f112678j);
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    public static ByteString q0(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            return r0(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (byteString2.size() + ropeByteString.f112679k.size() < 128) {
                return new RopeByteString(ropeByteString.f112678j, r0(ropeByteString.f112679k, byteString2));
            }
            if (ropeByteString.f112678j.F() > ropeByteString.f112679k.F() && ropeByteString.f112681m > byteString2.F()) {
                return new RopeByteString(ropeByteString.f112678j, new RopeByteString(ropeByteString.f112679k, byteString2));
            }
        }
        return size >= f112676n[Math.max(byteString.F(), byteString2.F()) + 1] ? new RopeByteString(byteString, byteString2) : new b().b(byteString, byteString2);
    }

    public static ByteString r0(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.C(bArr, 0, 0, size);
        byteString2.C(bArr, 0, size, size2);
        return new ByteString.LiteralByteString(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public static RopeByteString t0(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void A(ByteBuffer byteBuffer) {
        this.f112678j.A(byteBuffer);
        this.f112679k.A(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void D(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f112680l;
        if (i13 <= i14) {
            this.f112678j.D(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f112679k.D(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f112678j.D(bArr, i10, i11, i15);
            this.f112679k.D(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int F() {
        return this.f112681m;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte G(int i10) {
        int i11 = this.f112680l;
        return i10 < i11 ? this.f112678j.G(i10) : this.f112679k.G(i10 - i11);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean H() {
        return this.f112677i >= f112676n[this.f112681m];
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean I() {
        int iQ = this.f112678j.Q(0, 0, this.f112680l);
        ByteString byteString = this.f112679k;
        return byteString.Q(iQ, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: J */
    public ByteString.f iterator() {
        return new a();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public AbstractC2549t L() {
        return AbstractC2549t.k(new d(), 4096);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream M() {
        return new d();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int P(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f112680l;
        if (i13 <= i14) {
            return this.f112678j.P(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f112679k.P(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f112679k.P(this.f112678j.P(i10, i11, i15), 0, i12 - i15);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int Q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f112680l;
        if (i13 <= i14) {
            return this.f112678j.Q(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f112679k.Q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f112679k.Q(this.f112678j.Q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString Y(int i10, int i11) {
        int iN = ByteString.n(i10, i11, this.f112677i);
        if (iN == 0) {
            return ByteString.f112510e;
        }
        if (iN == this.f112677i) {
            return this;
        }
        int i12 = this.f112680l;
        return i11 <= i12 ? this.f112678j.Y(i10, i11) : i10 >= i12 ? this.f112679k.Y(i10 - i12, i11 - i12) : new RopeByteString(this.f112678j.X(i10), this.f112679k.Y(0, i11 - this.f112680l));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String d0(Charset charset) {
        return new String(Z(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f112677i != byteString.size()) {
            return false;
        }
        if (this.f112677i == 0) {
            return true;
        }
        int i10 = this.f112514a;
        int i11 = byteString.f112514a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return s0(byteString);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer g() {
        return ByteBuffer.wrap(Z()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> h() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().g());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new a();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte j(int i10) {
        ByteString.k(i10, this.f112677i);
        return G(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void j0(r rVar) throws IOException {
        this.f112678j.j0(rVar);
        this.f112679k.j0(rVar);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void k0(OutputStream outputStream) throws IOException {
        this.f112678j.k0(outputStream);
        this.f112679k.k0(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void m0(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f112680l;
        if (i12 <= i13) {
            this.f112678j.m0(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f112679k.m0(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f112678j.m0(outputStream, i10, i14);
            this.f112679k.m0(outputStream, 0, i11 - i14);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void n0(r rVar) throws IOException {
        this.f112679k.n0(rVar);
        this.f112678j.n0(rVar);
    }

    public final boolean s0(ByteString byteString) {
        c cVar = new c(this);
        ByteString.LeafByteString next = cVar.next();
        c cVar2 = new c(byteString);
        ByteString.LeafByteString next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next.o0(next2, i11, iMin) : next2.o0(next, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f112677i;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i10 = 0;
                next = cVar.next();
            } else {
                i10 += iMin;
                next = next;
            }
            if (iMin == size2) {
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.f112677i;
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(Z());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<ByteString> f112685a;

        public b() {
            this.f112685a = new ArrayDeque<>();
        }

        public final ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f112685a.pop();
            while (!this.f112685a.isEmpty()) {
                byteStringPop = new RopeByteString(this.f112685a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        public final void c(ByteString byteString) {
            if (byteString.H()) {
                e(byteString);
                return;
            }
            if (!(byteString instanceof RopeByteString)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            c(ropeByteString.f112678j);
            c(ropeByteString.f112679k);
        }

        public final int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(RopeByteString.f112676n, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(ByteString byteString) {
            int iD = d(byteString.size());
            int[] iArr = RopeByteString.f112676n;
            int i10 = iArr[iD + 1];
            if (this.f112685a.isEmpty() || this.f112685a.peek().size() >= i10) {
                this.f112685a.push(byteString);
                return;
            }
            int i11 = iArr[iD];
            ByteString byteStringPop = this.f112685a.pop();
            while (!this.f112685a.isEmpty() && this.f112685a.peek().size() < i11) {
                byteStringPop = new RopeByteString(this.f112685a.pop(), byteStringPop);
            }
            RopeByteString ropeByteString = new RopeByteString(byteStringPop, byteString);
            while (!this.f112685a.isEmpty()) {
                if (this.f112685a.peek().size() >= RopeByteString.f112676n[d(ropeByteString.f112677i) + 1]) {
                    break;
                } else {
                    ropeByteString = new RopeByteString(this.f112685a.pop(), ropeByteString);
                }
            }
            this.f112685a.push(ropeByteString);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f112678j = byteString;
        this.f112679k = byteString2;
        int size = byteString.size();
        this.f112680l = size;
        this.f112677i = byteString2.size() + size;
        this.f112681m = Math.max(byteString.F(), byteString2.F()) + 1;
    }

    public class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f112688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.LeafByteString f112689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f112690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f112692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f112693f;

        public d() {
            k();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return RopeByteString.this.f112677i - (this.f112692e + this.f112691d);
        }

        public final void d() {
            if (this.f112689b != null) {
                int i10 = this.f112691d;
                int i11 = this.f112690c;
                if (i10 == i11) {
                    this.f112692e += i11;
                    this.f112691d = 0;
                    if (!this.f112688a.hasNext()) {
                        this.f112689b = null;
                        this.f112690c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f112688a.next();
                        this.f112689b = next;
                        this.f112690c = next.size();
                    }
                }
            }
        }

        public final void k() {
            c cVar = new c(RopeByteString.this);
            this.f112688a = cVar;
            ByteString.LeafByteString next = cVar.next();
            this.f112689b = next;
            this.f112690c = next.size();
            this.f112691d = 0;
            this.f112692e = 0;
        }

        public final int l(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (true) {
                if (i12 <= 0) {
                    break;
                }
                d();
                if (this.f112689b != null) {
                    int iMin = Math.min(this.f112690c - this.f112691d, i12);
                    if (bArr != null) {
                        this.f112689b.C(bArr, this.f112691d, i10, iMin);
                        i10 += iMin;
                    }
                    this.f112691d += iMin;
                    i12 -= iMin;
                } else if (i12 == i11) {
                    return -1;
                }
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f112693f = this.f112692e + this.f112691d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return l(bArr, i10, i11);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            k();
            l(null, 0, this.f112693f);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > LruCacheKt.f86729a) {
                j10 = 2147483647L;
            }
            return l(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            d();
            ByteString.LeafByteString leafByteString = this.f112689b;
            if (leafByteString == null) {
                return -1;
            }
            int i10 = this.f112691d;
            this.f112691d = i10 + 1;
            return leafByteString.j(i10) & 255;
        }
    }
}
