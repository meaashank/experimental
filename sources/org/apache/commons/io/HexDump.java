package org.apache.commons.io;

import androidx.compose.ui.graphics.vector.f;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class HexDump {
    public static final String EOL = System.getProperty("line.separator");
    private static final char[] _hexcodes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101688t, 'B', f.f101680l, 'D', 'E', 'F'};
    private static final int[] _shifts = {28, 24, 20, 16, 12, 8, 4, 0};

    public static void dump(byte[] bArr, long j10, OutputStream outputStream, int i10) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i10 < 0 || i10 >= bArr.length) {
            StringBuilder sbA = android.support.v4.media.a.a("illegal index: ", i10, " into array of length ");
            sbA.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        long j11 = j10 + ((long) i10);
        StringBuilder sb2 = new StringBuilder(74);
        while (i10 < bArr.length) {
            int length = bArr.length - i10;
            if (length > 16) {
                length = 16;
            }
            dump(sb2, j11).append(' ');
            for (int i11 = 0; i11 < 16; i11++) {
                if (i11 < length) {
                    dump(sb2, bArr[i11 + i10]);
                } else {
                    sb2.append(GlideException.a.f139488d);
                }
                sb2.append(' ');
            }
            for (int i12 = 0; i12 < length; i12++) {
                byte b10 = bArr[i12 + i10];
                if (b10 < 32 || b10 >= 127) {
                    sb2.append('.');
                } else {
                    sb2.append((char) b10);
                }
            }
            sb2.append(EOL);
            outputStream.write(sb2.toString().getBytes(Charset.defaultCharset()));
            outputStream.flush();
            sb2.setLength(0);
            j11 += (long) length;
            i10 += 16;
        }
    }

    private static StringBuilder dump(StringBuilder sb2, long j10) {
        for (int i10 = 0; i10 < 8; i10++) {
            sb2.append(_hexcodes[((int) (j10 >> _shifts[i10])) & 15]);
        }
        return sb2;
    }

    private static StringBuilder dump(StringBuilder sb2, byte b10) {
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(_hexcodes[(b10 >> _shifts[i10 + 6]) & 15]);
        }
        return sb2;
    }
}
