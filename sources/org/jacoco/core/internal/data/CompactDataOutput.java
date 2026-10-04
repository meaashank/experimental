package org.jacoco.core.internal.data;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class CompactDataOutput extends DataOutputStream {
    public CompactDataOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public void writeBooleanArray(boolean[] zArr) throws IOException {
        writeVarInt(zArr.length);
        int i10 = 0;
        int i11 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i11 |= 1 << i10;
            }
            i10++;
            if (i10 == 8) {
                writeByte(i11);
                i10 = 0;
                i11 = 0;
            }
        }
        if (i10 > 0) {
            writeByte(i11);
        }
    }

    public void writeVarInt(int i10) throws IOException {
        if ((i10 & (-128)) == 0) {
            writeByte(i10);
        } else {
            writeByte((i10 & 127) | 128);
            writeVarInt(i10 >>> 7);
        }
    }
}
