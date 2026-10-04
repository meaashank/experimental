package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ChunkedOutputStream extends FilterOutputStream {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedOutputStream(OutputStream outputStream, int i10) {
        super(outputStream);
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.chunkSize = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int iMin = Math.min(i11, this.chunkSize);
            ((FilterOutputStream) this).out.write(bArr, i10, iMin);
            i11 -= iMin;
            i10 += iMin;
        }
    }

    public ChunkedOutputStream(OutputStream outputStream) {
        this(outputStream, 4096);
    }
}
