package org.jacoco.core.internal.data;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class CompactDataInput extends DataInputStream {
    public CompactDataInput(InputStream inputStream) {
        super(inputStream);
    }

    public boolean[] readBooleanArray() throws IOException {
        int varInt = readVarInt();
        boolean[] zArr = new boolean[varInt];
        int i10 = 0;
        for (int i11 = 0; i11 < varInt; i11++) {
            if (i11 % 8 == 0) {
                i10 = readByte();
            }
            zArr[i11] = (i10 & 1) != 0;
            i10 >>>= 1;
        }
        return zArr;
    }

    public int readVarInt() throws IOException {
        byte b10 = readByte();
        return (b10 & 128) == 0 ? b10 & 255 : (b10 & 127) | (readVarInt() << 7);
    }
}
