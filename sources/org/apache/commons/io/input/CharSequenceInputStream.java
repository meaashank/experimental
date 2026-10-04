package org.apache.commons.io.input;

import androidx.viewpager.widget.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes6.dex */
public class CharSequenceInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private static final int NO_MARK = -1;
    private final ByteBuffer bbuf;
    private final CharBuffer cbuf;
    private final CharsetEncoder encoder;
    private int mark_bbuf;
    private int mark_cbuf;

    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i10) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.encoder = charsetEncoderOnUnmappableCharacter;
        float fMaxBytesPerChar = charsetEncoderOnUnmappableCharacter.maxBytesPerChar();
        if (i10 < fMaxBytesPerChar) {
            throw new IllegalArgumentException("Buffer size " + i10 + " is less than maxBytesPerChar " + fMaxBytesPerChar);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        this.bbuf = byteBufferAllocate;
        byteBufferAllocate.flip();
        this.cbuf = CharBuffer.wrap(charSequence);
        this.mark_cbuf = -1;
        this.mark_bbuf = -1;
    }

    private void fillBuffer() throws CharacterCodingException {
        this.bbuf.compact();
        CoderResult coderResultEncode = this.encoder.encode(this.cbuf, this.bbuf, true);
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        }
        this.bbuf.flip();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.cbuf.remaining() + this.bbuf.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.mark_cbuf = this.cbuf.position();
        this.mark_bbuf = this.bbuf.position();
        this.cbuf.mark();
        this.bbuf.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i11 < 0 || i10 + i11 > bArr.length) {
            StringBuilder sb2 = new StringBuilder("Array Size=");
            a.a(sb2, bArr.length, ", offset=", i10, ", length=");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
            return -1;
        }
        while (i11 > 0) {
            if (!this.bbuf.hasRemaining()) {
                fillBuffer();
                if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.bbuf.remaining(), i11);
                this.bbuf.get(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                i12 += iMin;
            }
        }
        if (i12 != 0 || this.cbuf.hasRemaining()) {
            return i12;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            if (this.mark_cbuf != -1) {
                if (this.cbuf.position() != 0) {
                    this.encoder.reset();
                    this.cbuf.rewind();
                    this.bbuf.rewind();
                    this.bbuf.limit(0);
                    while (this.cbuf.position() < this.mark_cbuf) {
                        this.bbuf.rewind();
                        this.bbuf.limit(0);
                        fillBuffer();
                    }
                }
                if (this.cbuf.position() != this.mark_cbuf) {
                    throw new IllegalStateException("Unexpected CharBuffer postion: actual=" + this.cbuf.position() + " expected=" + this.mark_cbuf);
                }
                this.bbuf.position(this.mark_bbuf);
                this.mark_cbuf = -1;
                this.mark_bbuf = -1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = 0;
        while (j10 > 0 && available() > 0) {
            read();
            j10--;
            j11++;
        }
        return j11;
    }

    public CharSequenceInputStream(CharSequence charSequence, String str, int i10) {
        this(charSequence, Charset.forName(str), i10);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.bbuf.hasRemaining()) {
            fillBuffer();
            if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                return -1;
            }
        }
        return this.bbuf.get() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
