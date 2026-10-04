package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class UnixLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private final InputStream target;
    private boolean slashNSeen = false;
    private boolean slashRSeen = false;
    private boolean eofSeen = false;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z10) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z10;
    }

    private int eofGame(boolean z10) {
        if (z10 || !this.ensureLineFeedAtEndOfFile || this.slashNSeen) {
            return -1;
        }
        this.slashNSeen = true;
        return 10;
    }

    private int readWithUpdate() throws IOException {
        int i10 = this.target.read();
        boolean z10 = i10 == -1;
        this.eofSeen = z10;
        if (z10) {
            return i10;
        }
        this.slashNSeen = i10 == 10;
        this.slashRSeen = i10 == 13;
        return i10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.target.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        throw new UnsupportedOperationException("Mark notsupported");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z10 = this.slashRSeen;
        if (this.eofSeen) {
            return eofGame(z10);
        }
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame(z10);
        }
        if (this.slashRSeen) {
            return 10;
        }
        return (z10 && this.slashNSeen) ? read() : withUpdate;
    }
}
