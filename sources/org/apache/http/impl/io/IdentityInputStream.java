package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes6.dex */
public class IdentityInputStream extends InputStream {
    private boolean closed = false;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final SessionInputBuffer f226132in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        this.f226132in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f226132in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return ((BufferInfo) sessionInputBuffer).length();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f226132in.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f226132in.read(bArr, i10, i11);
    }
}
