package androidx.emoji2.text.flatbuffer;

import androidx.compose.foundation.text.C1758e;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import okio.h0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Utf8 f113411a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i10, int i11) {
            super(C1758e.a("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws IllegalArgumentException {
            if (!f(b11)) {
                if ((((b11 + 112) + (b10 << Ascii.FS)) >> 30) == 0 && !f(b12) && !f(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & h0.f225962a) << 12) | ((b12 & h0.f225962a) << 6) | (b13 & h0.f225962a);
                    cArr[i10] = e(i11);
                    cArr[i10 + 1] = j(i11);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void b(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws IllegalArgumentException {
            if (f(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || f(b12)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i10] = (char) (((b10 & Ascii.SI) << 12) | ((b11 & h0.f225962a) << 6) | (b12 & h0.f225962a));
        }

        public static void d(byte b10, byte b11, char[] cArr, int i10) throws IllegalArgumentException {
            if (b10 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (f(b11)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i10] = (char) (((b10 & Ascii.US) << 6) | (b11 & h0.f225962a));
        }

        public static char e(int i10) {
            return (char) ((i10 >>> 10) + h0.f225965d);
        }

        public static boolean f(byte b10) {
            return b10 > -65;
        }

        public static boolean g(byte b10) {
            return b10 >= 0;
        }

        public static boolean h(byte b10) {
            return b10 < -16;
        }

        public static boolean i(byte b10) {
            return b10 < -32;
        }

        public static char j(int i10) {
            return (char) ((i10 & 1023) + h0.f225966e);
        }

        public static int k(byte b10) {
            return b10 & h0.f225962a;
        }
    }

    public static Utf8 d() {
        if (f113411a == null) {
            f113411a = new Utf8Safe();
        }
        return f113411a;
    }

    public static void e(Utf8 utf8) {
        f113411a = utf8;
    }

    public abstract String a(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
