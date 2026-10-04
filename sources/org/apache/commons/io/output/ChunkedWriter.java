package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class ChunkedWriter extends FilterWriter {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedWriter(Writer writer, int i10) {
        super(writer);
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.chunkSize = i10;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int iMin = Math.min(i11, this.chunkSize);
            ((FilterWriter) this).out.write(cArr, i10, iMin);
            i11 -= iMin;
            i10 += iMin;
        }
    }

    public ChunkedWriter(Writer writer) {
        this(writer, 4096);
    }
}
