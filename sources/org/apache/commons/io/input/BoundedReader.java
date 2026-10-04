package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes6.dex */
public class BoundedReader extends Reader {
    private static final int INVALID = -1;
    private int charsRead = 0;
    private int markedAt = -1;
    private final int maxCharsFromTargetReader;
    private int readAheadLimit;
    private final Reader target;

    public BoundedReader(Reader reader, int i10) throws IOException {
        this.target = reader;
        this.maxCharsFromTargetReader = i10;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.target.close();
    }

    @Override // java.io.Reader
    public void mark(int i10) throws IOException {
        int i11 = this.charsRead;
        this.readAheadLimit = i10 - i11;
        this.markedAt = i11;
        this.target.mark(i10);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i10 = this.charsRead;
        if (i10 >= this.maxCharsFromTargetReader) {
            return -1;
        }
        int i11 = this.markedAt;
        if (i11 >= 0 && i10 - i11 >= this.readAheadLimit) {
            return -1;
        }
        this.charsRead = i10 + 1;
        return this.target.read();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.charsRead = this.markedAt;
        this.target.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = read();
            if (i13 == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            cArr[i10 + i12] = (char) i13;
        }
        return i11;
    }
}
