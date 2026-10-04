package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class NioByteString extends ByteString.LeafByteString {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ByteBuffer f112665i;

    public NioByteString(ByteBuffer byteBuffer) {
        V.e(byteBuffer, "buffer");
        this.f112665i = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.v(this.f112665i.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void A(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f112665i.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void D(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f112665i.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte G(int i10) {
        return j(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean I() {
        return Utf8.s(this.f112665i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public AbstractC2549t L() {
        return AbstractC2549t.o(this.f112665i, true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream M() {
        return new a();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int P(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f112665i.get(i13);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int Q(int i10, int i11, int i12) {
        return Utf8.v(i10, this.f112665i, i11, i12 + i11);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString Y(int i10, int i11) {
        try {
            return new NioByteString(q0(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String d0(Charset charset) {
        byte[] bArrZ;
        int length;
        int iPosition;
        if (this.f112665i.hasArray()) {
            bArrZ = this.f112665i.array();
            iPosition = this.f112665i.position() + this.f112665i.arrayOffset();
            length = this.f112665i.remaining();
        } else {
            bArrZ = Z();
            length = bArrZ.length;
            iPosition = 0;
        }
        return new String(bArrZ, iPosition, length, charset);
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
        if (this.f112665i.remaining() != byteString.size()) {
            return false;
        }
        if (this.f112665i.remaining() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? this.f112665i.equals(((NioByteString) obj).f112665i) : obj instanceof RopeByteString ? obj.equals(this) : this.f112665i.equals(byteString.g());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer g() {
        return this.f112665i.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> h() {
        return Collections.singletonList(this.f112665i.asReadOnlyBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte j(int i10) {
        try {
            return this.f112665i.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void j0(r rVar) throws IOException {
        rVar.W(this.f112665i.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void k0(OutputStream outputStream) throws IOException {
        outputStream.write(Z());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void m0(OutputStream outputStream, int i10, int i11) throws IOException {
        if (!this.f112665i.hasArray()) {
            C2544q.h(q0(i10, i11 + i10), outputStream);
            return;
        }
        outputStream.write(this.f112665i.array(), this.f112665i.position() + this.f112665i.arrayOffset() + i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
    public boolean o0(ByteString byteString, int i10, int i11) {
        return Y(0, i11).equals(byteString.Y(i10, i11 + i10));
    }

    public final ByteBuffer q0(int i10, int i11) {
        if (i10 < this.f112665i.position() || i11 > this.f112665i.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f112665i.slice();
        byteBufferSlice.position(i10 - this.f112665i.position());
        byteBufferSlice.limit(i11 - this.f112665i.position());
        return byteBufferSlice;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.f112665i.remaining();
    }

    public class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f112666a;

        public a() {
            this.f112666a = NioByteString.this.f112665i.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f112666a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f112666a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f112666a.hasRemaining()) {
                return this.f112666a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f112666a.reset();
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!this.f112666a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, this.f112666a.remaining());
            this.f112666a.get(bArr, i10, iMin);
            return iMin;
        }
    }
}
