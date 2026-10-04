package androidx.datastore.preferences.protobuf;

import androidx.collection.C1545m0;
import androidx.compose.foundation.text.C1758e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f112507b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f112508c = 256;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f112509d = 8192;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteString f112510e = new LiteralByteString(V.f112722d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f112511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f112512g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<ByteString> f112513h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112514a = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f112515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f112516k;

        public BoundedByteString(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.n(i10, i10 + i11, bArr.length);
            this.f112515j = i10;
            this.f112516k = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public void D(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f112517i, this.f112515j + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte G(int i10) {
            return this.f112517i[this.f112515j + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte j(int i10) {
            ByteString.k(i10, this.f112516k);
            return this.f112517i[this.f112515j + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public int p0() {
            return this.f112515j;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f112516k;
        }

        public Object writeReplace() {
            return new LiteralByteString(Z());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int F() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean H() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new a();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void n0(r rVar) throws IOException {
            j0(rVar);
        }

        public abstract boolean o0(ByteString byteString, int i10, int i11);
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f112517i;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f112517i = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void A(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f112517i, p0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void D(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f112517i, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte G(int i10) {
            return this.f112517i[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean I() {
            int iP0 = p0();
            return Utf8.u(this.f112517i, iP0, size() + iP0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final AbstractC2549t L() {
            return AbstractC2549t.r(this.f112517i, p0(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream M() {
            return new ByteArrayInputStream(this.f112517i, p0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int P(int i10, int i11, int i12) {
            return V.w(i10, this.f112517i, p0() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int Q(int i10, int i11, int i12) {
            int iP0 = p0() + i11;
            return Utf8.w(i10, this.f112517i, iP0, i12 + iP0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString Y(int i10, int i11) {
            int iN = ByteString.n(i10, i11, size());
            return iN == 0 ? ByteString.f112510e : new BoundedByteString(this.f112517i, p0() + i10, iN);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String d0(Charset charset) {
            return new String(this.f112517i, p0(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i10 = this.f112514a;
            int i11 = literalByteString.f112514a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                return o0(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer g() {
            return ByteBuffer.wrap(this.f112517i, p0(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> h() {
            return Collections.singletonList(g());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte j(int i10) {
            return this.f112517i[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void j0(r rVar) throws IOException {
            rVar.X(this.f112517i, p0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void k0(OutputStream outputStream) throws IOException {
            outputStream.write(Z());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void m0(OutputStream outputStream, int i10, int i11) throws IOException {
            outputStream.write(this.f112517i, p0() + i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean o0(ByteString byteString, int i10, int i11) {
            if (i11 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > byteString.size()) {
                StringBuilder sbA = C1545m0.a("Ran off end of other: ", i10, U6.j.f68738d, i11, U6.j.f68738d);
                sbA.append(byteString.size());
                throw new IllegalArgumentException(sbA.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.Y(i10, i12).equals(Y(0, i11));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.f112517i;
            byte[] bArr2 = literalByteString.f112517i;
            int iP0 = p0() + i11;
            int iP02 = p0();
            int iP03 = literalByteString.p0() + i10;
            while (iP02 < iP0) {
                if (bArr[iP02] != bArr2[iP03]) {
                    return false;
                }
                iP02++;
                iP03++;
            }
            return true;
        }

        public int p0() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f112517i.length;
        }
    }

    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112518a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112519b;

        public a() {
            this.f112519b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112518a < this.f112519b;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public byte nextByte() {
            int i10 = this.f112518a;
            if (i10 >= this.f112519b) {
                throw new NoSuchElementException();
            }
            this.f112518a = i10 + 1;
            return ByteString.this.G(i10);
        }
    }

    public static class b implements Comparator<ByteString> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            f it = byteString.iterator();
            f it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(it.nextByte() & 255, it2.nextByte() & 255);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    public static abstract class c implements f {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements e {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public d(a aVar) {
        }
    }

    public interface e {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface f extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f112521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f112522b;

        public /* synthetic */ g(int i10, a aVar) {
            this(i10);
        }

        public ByteString a() {
            this.f112521a.Z();
            return new LiteralByteString(this.f112522b);
        }

        public CodedOutputStream b() {
            return this.f112521a;
        }

        public g(int i10) {
            byte[] bArr = new byte[i10];
            this.f112522b = bArr;
            this.f112521a = CodedOutputStream.n1(bArr);
        }
    }

    public static final class i implements e {
        public i() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public i(a aVar) {
        }
    }

    static {
        f112511f = C2518d.c() ? new i() : new d();
        f112513h = new b();
    }

    public static g K(int i10) {
        return new g(i10);
    }

    public static h N() {
        return new h(128);
    }

    public static h O(int i10) {
        return new h(i10);
    }

    public static ByteString S(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        if (i11 == 0) {
            return null;
        }
        return y(bArr, 0, i11);
    }

    public static ByteString T(InputStream inputStream) throws IOException {
        return V(inputStream, 256, 8192);
    }

    public static ByteString U(InputStream inputStream, int i10) throws IOException {
        return V(inputStream, i10, i10);
    }

    public static ByteString V(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString byteStringS = S(inputStream, i10);
            if (byteStringS == null) {
                return q(arrayList);
            }
            arrayList.add(byteStringS);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    public static int a0(byte b10) {
        return b10 & 255;
    }

    public static int b(byte b10) {
        return b10 & 255;
    }

    public static Comparator<ByteString> f0() {
        return f112513h;
    }

    public static ByteString g0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return new BoundedByteString(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static ByteString h0(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public static ByteString i(Iterator<ByteString> it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return i(it, i11).o(i(it, i10 - i11));
    }

    public static ByteString i0(byte[] bArr, int i10, int i11) {
        return new BoundedByteString(bArr, i10, i11);
    }

    public static void k(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(C1758e.a("Index > length: ", i10, U6.j.f68738d, i11));
            }
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.c.a("Index < 0: ", i10));
        }
    }

    public static int n(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(androidx.collection.N0.a("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C1758e.a("Beginning index larger than ending index: ", i10, U6.j.f68738d, i11));
        }
        throw new IndexOutOfBoundsException(C1758e.a("End index: ", i11, " >= ", i12));
    }

    public static ByteString q(Iterable<ByteString> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f112510e : i(iterable.iterator(), size);
    }

    public static ByteString s(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString t(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString v(ByteBuffer byteBuffer) {
        return w(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString w(ByteBuffer byteBuffer, int i10) {
        n(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString x(byte[] bArr) {
        return y(bArr, 0, bArr.length);
    }

    public static ByteString y(byte[] bArr, int i10, int i11) {
        n(i10, i10 + i11, bArr.length);
        return new LiteralByteString(f112511f.a(bArr, i10, i11));
    }

    public static ByteString z(String str) {
        return new LiteralByteString(str.getBytes(V.f112719a));
    }

    public abstract void A(ByteBuffer byteBuffer);

    public void B(byte[] bArr, int i10) {
        C(bArr, 0, i10, size());
    }

    @Deprecated
    public final void C(byte[] bArr, int i10, int i11, int i12) {
        n(i10, i10 + i12, size());
        n(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            D(bArr, i10, i11, i12);
        }
    }

    public abstract void D(byte[] bArr, int i10, int i11, int i12);

    public final boolean E(ByteString byteString) {
        return size() >= byteString.size() && X(size() - byteString.size()).equals(byteString);
    }

    public abstract int F();

    public abstract byte G(int i10);

    public abstract boolean H();

    public abstract boolean I();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public f iterator() {
        return new a();
    }

    public abstract AbstractC2549t L();

    public abstract InputStream M();

    public abstract int P(int i10, int i11, int i12);

    public abstract int Q(int i10, int i11, int i12);

    public final int R() {
        return this.f112514a;
    }

    public final boolean W(ByteString byteString) {
        return size() >= byteString.size() && Y(0, byteString.size()).equals(byteString);
    }

    public final ByteString X(int i10) {
        return Y(i10, size());
    }

    public abstract ByteString Y(int i10, int i11);

    public final byte[] Z() {
        int size = size();
        if (size == 0) {
            return V.f112722d;
        }
        byte[] bArr = new byte[size];
        D(bArr, 0, 0, size);
        return bArr;
    }

    public final String b0(String str) throws UnsupportedEncodingException {
        try {
            return c0(Charset.forName(str));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public final String c0(Charset charset) {
        return size() == 0 ? "" : d0(charset);
    }

    public abstract String d0(Charset charset);

    public final String e0() {
        return c0(V.f112719a);
    }

    public abstract boolean equals(Object obj);

    public abstract ByteBuffer g();

    public abstract List<ByteBuffer> h();

    public final int hashCode() {
        int iP = this.f112514a;
        if (iP == 0) {
            int size = size();
            iP = P(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.f112514a = iP;
        }
        return iP;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract byte j(int i10);

    public abstract void j0(r rVar) throws IOException;

    public abstract void k0(OutputStream outputStream) throws IOException;

    public final void l0(OutputStream outputStream, int i10, int i11) throws IOException {
        n(i10, i10 + i11, size());
        if (i11 > 0) {
            m0(outputStream, i10, i11);
        }
    }

    public abstract void m0(OutputStream outputStream, int i10, int i11) throws IOException;

    public abstract void n0(r rVar) throws IOException;

    public final ByteString o(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.q0(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public static final class h extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f112523f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<ByteString> f112525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f112526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f112527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f112528e;

        public h(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f112524a = i10;
            this.f112525b = new ArrayList<>();
            this.f112527d = new byte[i10];
        }

        public final byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        public final void b(int i10) {
            this.f112525b.add(new LiteralByteString(this.f112527d));
            int length = this.f112526c + this.f112527d.length;
            this.f112526c = length;
            this.f112527d = new byte[Math.max(this.f112524a, Math.max(i10, length >>> 1))];
            this.f112528e = 0;
        }

        public final void d() {
            int i10 = this.f112528e;
            byte[] bArr = this.f112527d;
            if (i10 >= bArr.length) {
                this.f112525b.add(new LiteralByteString(this.f112527d));
                this.f112527d = f112523f;
            } else if (i10 > 0) {
                this.f112525b.add(new LiteralByteString(a(bArr, i10)));
            }
            this.f112526c += this.f112528e;
            this.f112528e = 0;
        }

        public synchronized void k() {
            this.f112525b.clear();
            this.f112526c = 0;
            this.f112528e = 0;
        }

        public synchronized int l() {
            return this.f112526c + this.f112528e;
        }

        public synchronized ByteString m() {
            d();
            return ByteString.q(this.f112525b);
        }

        public void n(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.f112525b;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.f112527d;
                i10 = this.f112528e;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.k0(outputStream);
            }
            outputStream.write(a(bArr, i10));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(l()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f112528e == this.f112527d.length) {
                    b(1);
                }
                byte[] bArr = this.f112527d;
                int i11 = this.f112528e;
                this.f112528e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f112527d;
                int length = bArr2.length;
                int i12 = this.f112528e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f112528e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f112527d, 0, i13);
                    this.f112528e = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
