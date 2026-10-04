package okio;

import androidx.activity.C1477d;
import com.google.common.base.Ascii;
import com.prism.commons.utils.C3860y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f225866d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f225867e = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f225868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f225869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public transient String f225870c;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ ByteString k(a aVar, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = C5013e.f218326b;
            }
            return aVar.j(str, charset);
        }

        public static ByteString p(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = l0.f226064b;
            }
            return aVar.o(bArr, i10, i11);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @dd.j(name = "-deprecated_decodeBase64")
        @Nullable
        public final ByteString a(@NotNull String string) {
            kotlin.jvm.internal.G.p(string, "string");
            return h(string);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @dd.j(name = "-deprecated_decodeHex")
        @NotNull
        public final ByteString b(@NotNull String string) {
            kotlin.jvm.internal.G.p(string, "string");
            return i(string);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @dd.j(name = "-deprecated_encodeString")
        @NotNull
        public final ByteString c(@NotNull String string, @NotNull Charset charset) {
            kotlin.jvm.internal.G.p(string, "string");
            kotlin.jvm.internal.G.p(charset, "charset");
            return j(string, charset);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @dd.j(name = "-deprecated_encodeUtf8")
        @NotNull
        public final ByteString d(@NotNull String string) {
            kotlin.jvm.internal.G.p(string, "string");
            return l(string);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @dd.j(name = "-deprecated_of")
        @NotNull
        public final ByteString e(@NotNull ByteBuffer buffer) {
            kotlin.jvm.internal.G.p(buffer, "buffer");
            return m(buffer);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @dd.j(name = "-deprecated_of")
        @NotNull
        public final ByteString f(@NotNull byte[] array, int i10, int i11) {
            kotlin.jvm.internal.G.p(array, "array");
            return o(array, i10, i11);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @dd.j(name = "-deprecated_read")
        @NotNull
        public final ByteString g(@NotNull InputStream inputstream, int i10) {
            kotlin.jvm.internal.G.p(inputstream, "inputstream");
            return q(inputstream, i10);
        }

        @dd.o
        @Nullable
        public final ByteString h(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<this>");
            byte[] bArrA = j0.a(str);
            if (bArrA != null) {
                return new ByteString(bArrA);
            }
            return null;
        }

        @dd.o
        @NotNull
        public final ByteString i(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (okio.internal.e.I(str.charAt(i11 + 1)) + (okio.internal.e.I(str.charAt(i11)) << 4));
            }
            return new ByteString(bArr);
        }

        @dd.o
        @dd.j(name = "encodeString")
        @NotNull
        public final ByteString j(@NotNull String str, @NotNull Charset charset) {
            kotlin.jvm.internal.G.p(str, "<this>");
            kotlin.jvm.internal.G.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @dd.o
        @NotNull
        public final ByteString l(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<this>");
            ByteString byteString = new ByteString(k0.a(str));
            byteString.f225870c = str;
            return byteString;
        }

        @dd.o
        @dd.j(name = "of")
        @NotNull
        public final ByteString m(@NotNull ByteBuffer byteBuffer) {
            kotlin.jvm.internal.G.p(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @dd.o
        @NotNull
        public final ByteString n(@NotNull byte... data) {
            kotlin.jvm.internal.G.p(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        @dd.o
        @dd.j(name = "of")
        @NotNull
        public final ByteString o(@NotNull byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.G.p(bArr, "<this>");
            int iM = l0.m(bArr, i11);
            l0.e(bArr.length, i10, iM);
            return new ByteString(C4875q.f1(bArr, i10, iM + i10));
        }

        @dd.o
        @dd.j(name = "read")
        @NotNull
        public final ByteString q(@NotNull InputStream inputStream, int i10) throws IOException {
            kotlin.jvm.internal.G.p(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("byteCount < 0: ", i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new ByteString(bArr);
        }

        public a(C4969v c4969v) {
        }
    }

    public ByteString(@NotNull byte[] data) {
        kotlin.jvm.internal.G.p(data, "data");
        this.f225868a = data;
    }

    public static /* synthetic */ int J(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.G(byteString2, i10);
    }

    public static /* synthetic */ int K(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.I(bArr, i10);
    }

    public static int S(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = l0.f226064b;
        }
        return byteString.O(byteString2, i10);
    }

    public static int T(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = l0.f226064b;
        }
        return byteString.R(bArr, i10);
    }

    @dd.o
    @dd.j(name = "of")
    @NotNull
    public static final ByteString W(@NotNull ByteBuffer byteBuffer) {
        return f225866d.m(byteBuffer);
    }

    @dd.o
    @NotNull
    public static final ByteString X(@NotNull byte... bArr) {
        return f225866d.n(bArr);
    }

    @dd.o
    @dd.j(name = "of")
    @NotNull
    public static final ByteString Y(@NotNull byte[] bArr, int i10, int i11) {
        return f225866d.o(bArr, i10, i11);
    }

    @dd.o
    @dd.j(name = "read")
    @NotNull
    public static final ByteString b0(@NotNull InputStream inputStream, int i10) throws IOException {
        return f225866d.q(inputStream, i10);
    }

    public static /* synthetic */ void l(ByteString byteString, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        byteString.k(i10, bArr, i11, i12);
    }

    @dd.o
    @Nullable
    public static final ByteString m(@NotNull String str) {
        return f225866d.h(str);
    }

    @dd.o
    @NotNull
    public static final ByteString n(@NotNull String str) {
        return f225866d.i(str);
    }

    public static ByteString o0(ByteString byteString, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = l0.f226064b;
        }
        return byteString.n0(i10, i11);
    }

    @dd.o
    @dd.j(name = "encodeString")
    @NotNull
    public static final ByteString r(@NotNull String str, @NotNull Charset charset) {
        return f225866d.j(str, charset);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteStringQ = f225866d.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, byteStringQ.f225868a);
    }

    @dd.o
    @NotNull
    public static final ByteString s(@NotNull String str) {
        return f225866d.l(str);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f225868a.length);
        objectOutputStream.write(this.f225868a);
    }

    @NotNull
    public String A() {
        byte[] bArr = this.f225868a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = okio.internal.e.f226044a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return kotlin.text.F.N1(cArr);
    }

    @NotNull
    public ByteString B(@NotNull String algorithm, @NotNull ByteString key) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.G.p(algorithm, "algorithm");
        kotlin.jvm.internal.G.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.r0(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.f225868a);
            kotlin.jvm.internal.G.o(bArrDoFinal, "mac.doFinal(data)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NotNull
    public ByteString C(@NotNull ByteString key) {
        kotlin.jvm.internal.G.p(key, "key");
        return B("HmacSHA1", key);
    }

    @NotNull
    public ByteString D(@NotNull ByteString key) {
        kotlin.jvm.internal.G.p(key, "key");
        return B("HmacSHA256", key);
    }

    @NotNull
    public ByteString E(@NotNull ByteString key) {
        kotlin.jvm.internal.G.p(key, "key");
        return B("HmacSHA512", key);
    }

    @dd.k
    public final int F(@NotNull ByteString other) {
        kotlin.jvm.internal.G.p(other, "other");
        return J(this, other, 0, 2, null);
    }

    @dd.k
    public final int G(@NotNull ByteString other, int i10) {
        kotlin.jvm.internal.G.p(other, "other");
        return I(other.L(), i10);
    }

    @dd.k
    public final int H(@NotNull byte[] other) {
        kotlin.jvm.internal.G.p(other, "other");
        return K(this, other, 0, 2, null);
    }

    @dd.k
    public int I(@NotNull byte[] other, int i10) {
        kotlin.jvm.internal.G.p(other, "other");
        int length = this.f225868a.length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!l0.d(this.f225868a, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public byte[] L() {
        return this.f225868a;
    }

    public byte M(int i10) {
        return this.f225868a[i10];
    }

    @dd.k
    public final int N(@NotNull ByteString other) {
        kotlin.jvm.internal.G.p(other, "other");
        return S(this, other, 0, 2, null);
    }

    @dd.k
    public final int O(@NotNull ByteString other, int i10) {
        kotlin.jvm.internal.G.p(other, "other");
        return R(other.L(), i10);
    }

    @dd.k
    public final int Q(@NotNull byte[] other) {
        kotlin.jvm.internal.G.p(other, "other");
        return T(this, other, 0, 2, null);
    }

    @dd.k
    public int R(@NotNull byte[] other, int i10) {
        kotlin.jvm.internal.G.p(other, "other");
        for (int iMin = Math.min(l0.l(this, i10), this.f225868a.length - other.length); -1 < iMin; iMin--) {
            if (l0.d(this.f225868a, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @NotNull
    public final ByteString V() {
        return p("MD5");
    }

    public boolean Z(int i10, @NotNull ByteString other, int i11, int i12) {
        kotlin.jvm.internal.G.p(other, "other");
        return other.a0(i11, this.f225868a, i10, i12);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @InterfaceC4852c0(expression = "this[index]", imports = {}))
    @dd.j(name = "-deprecated_getByte")
    public final byte a(int i10) {
        return M(i10);
    }

    public boolean a0(int i10, @NotNull byte[] other, int i11, int i12) {
        kotlin.jvm.internal.G.p(other, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr = this.f225868a;
        return i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && l0.d(bArr, i10, other, i11, i12);
    }

    public final void c0(int i10) {
        this.f225869b = i10;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = X3.i.f76775k, imports = {}))
    @dd.j(name = "-deprecated_size")
    public final int d() {
        return y();
    }

    public final void d0(@Nullable String str) {
        this.f225870c = str;
    }

    @NotNull
    public final ByteString e0() {
        return p(C3860y.f162169b);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iY = byteString.y();
            byte[] bArr = this.f225868a;
            if (iY == bArr.length && byteString.a0(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ByteString f0() {
        return p("SHA-256");
    }

    @NotNull
    public ByteBuffer g() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f225868a).asReadOnlyBuffer();
        kotlin.jvm.internal.G.o(byteBufferAsReadOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @NotNull
    public final ByteString g0() {
        return p("SHA-512");
    }

    @NotNull
    public String h() {
        return j0.c(this.f225868a, null, 1, null);
    }

    @dd.j(name = X3.i.f76775k)
    public final int h0() {
        return y();
    }

    public int hashCode() {
        int i10 = this.f225869b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f225868a);
        this.f225869b = iHashCode;
        return iHashCode;
    }

    @NotNull
    public String i() {
        return j0.b(this.f225868a, j0.f());
    }

    public final boolean i0(@NotNull ByteString prefix) {
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return Z(0, prefix, 0, prefix.y());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull ByteString other) {
        kotlin.jvm.internal.G.p(other, "other");
        int iY = y();
        int iY2 = other.y();
        int iMin = Math.min(iY, iY2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM = M(i10) & 255;
            int iM2 = other.M(i10) & 255;
            if (iM != iM2) {
                return iM < iM2 ? -1 : 1;
            }
        }
        if (iY == iY2) {
            return 0;
        }
        return iY < iY2 ? -1 : 1;
    }

    public final boolean j0(@NotNull byte[] prefix) {
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return a0(0, prefix, 0, prefix.length);
    }

    public void k(int i10, @NotNull byte[] target, int i11, int i12) {
        kotlin.jvm.internal.G.p(target, "target");
        C4875q.v0(this.f225868a, target, i11, i10, i12 + i10);
    }

    @NotNull
    public String k0(@NotNull Charset charset) {
        kotlin.jvm.internal.G.p(charset, "charset");
        return new String(this.f225868a, charset);
    }

    @dd.k
    @NotNull
    public final ByteString l0() {
        return o0(this, 0, 0, 3, null);
    }

    @dd.k
    @NotNull
    public final ByteString m0(int i10) {
        return o0(this, i10, 0, 2, null);
    }

    @dd.k
    @NotNull
    public ByteString n0(int i10, int i11) {
        int iL = l0.l(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f225868a;
        if (iL > bArr.length) {
            throw new IllegalArgumentException(C1477d.a(new StringBuilder("endIndex > length("), this.f225868a.length, ')').toString());
        }
        if (iL - i10 >= 0) {
            return (i10 == 0 && iL == bArr.length) ? this : new ByteString(C4875q.f1(bArr, i10, iL));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    @NotNull
    public ByteString p(@NotNull String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.G.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f225868a, 0, y());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.G.o(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @NotNull
    public ByteString p0() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f225868a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i10++;
        }
    }

    @NotNull
    public ByteString q0() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f225868a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i10];
            byte b12 = (byte) 97;
            if (b11 >= b12 && b11 <= (b10 = (byte) 122)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i10++;
        }
    }

    @NotNull
    public byte[] r0() {
        byte[] bArr = this.f225868a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public String s0() {
        String str = this.f225870c;
        if (str != null) {
            return str;
        }
        String strC = k0.c(L());
        this.f225870c = strC;
        return strC;
    }

    public final boolean t(@NotNull ByteString suffix) {
        kotlin.jvm.internal.G.p(suffix, "suffix");
        return Z(y() - suffix.y(), suffix, 0, suffix.y());
    }

    public void t0(@NotNull OutputStream out) throws IOException {
        kotlin.jvm.internal.G.p(out, "out");
        out.write(this.f225868a);
    }

    @NotNull
    public String toString() {
        byte[] bArr = this.f225868a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int iC = okio.internal.e.c(bArr, 64);
        if (iC != -1) {
            String strS0 = s0();
            String strSubstring = strS0.substring(0, iC);
            kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strB2 = kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strS0.length()) {
                return "[text=" + strB2 + ']';
            }
            return "[size=" + this.f225868a.length + " text=" + strB2 + "…]";
        }
        if (this.f225868a.length <= 64) {
            return "[hex=" + A() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.f225868a.length);
        sb2.append(" hex=");
        int iL = l0.l(this, 64);
        byte[] bArr2 = this.f225868a;
        if (iL > bArr2.length) {
            throw new IllegalArgumentException(C1477d.a(new StringBuilder("endIndex > length("), this.f225868a.length, ')').toString());
        }
        if (iL < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((iL == bArr2.length ? this : new ByteString(C4875q.f1(bArr2, 0, iL))).A());
        sb2.append("…]");
        return sb2.toString();
    }

    public final boolean u(@NotNull byte[] suffix) {
        kotlin.jvm.internal.G.p(suffix, "suffix");
        return a0(y() - suffix.length, suffix, 0, suffix.length);
    }

    public void u0(@NotNull C5360j buffer, int i10, int i11) {
        kotlin.jvm.internal.G.p(buffer, "buffer");
        okio.internal.e.H(this, buffer, i10, i11);
    }

    @dd.j(name = "getByte")
    public final byte v(int i10) {
        return M(i10);
    }

    @NotNull
    public final byte[] w() {
        return this.f225868a;
    }

    public final int x() {
        return this.f225869b;
    }

    public int y() {
        return this.f225868a.length;
    }

    @Nullable
    public final String z() {
        return this.f225870c;
    }
}
