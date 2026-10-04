package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public class y extends Utf8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<a> f113479b = ThreadLocal.withInitial(new x());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharsetEncoder f113480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharsetDecoder f113481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f113482c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ByteBuffer f113483d = null;

        public a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f113480a = charset.newEncoder();
            this.f113481b = charset.newDecoder();
        }
    }

    public static /* synthetic */ a f() {
        return new a();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String a(ByteBuffer byteBuffer, int i10, int i11) {
        CharsetDecoder charsetDecoder = f113479b.get().f113481b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e10) {
            throw new IllegalArgumentException("Bad encoding", e10);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f113479b.get();
        if (aVar.f113482c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f113483d);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int c(CharSequence charSequence) {
        a aVar = f113479b.get();
        int iMaxBytesPerChar = (int) (aVar.f113480a.maxBytesPerChar() * charSequence.length());
        ByteBuffer byteBuffer = aVar.f113483d;
        if (byteBuffer == null || byteBuffer.capacity() < iMaxBytesPerChar) {
            aVar.f113483d = ByteBuffer.allocate(Math.max(128, iMaxBytesPerChar));
        }
        aVar.f113483d.clear();
        aVar.f113482c = charSequence;
        CoderResult coderResultEncode = aVar.f113480a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f113483d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new IllegalArgumentException("bad character encoding", e10);
            }
        }
        aVar.f113483d.flip();
        return aVar.f113483d.remaining();
    }
}
