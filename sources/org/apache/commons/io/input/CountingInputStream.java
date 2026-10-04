package org.apache.commons.io.input;

import androidx.collection.LruCacheKt;
import androidx.compose.ui.input.pointer.C2151s;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class CountingInputStream extends ProxyInputStream {
    private long count;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public synchronized void afterRead(int i10) {
        if (i10 != -1) {
            this.count += (long) i10;
        }
    }

    public synchronized long getByteCount() {
        return this.count;
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= LruCacheKt.f86729a) {
            return (int) byteCount;
        }
        throw new ArithmeticException(C2151s.a("The byte count ", byteCount, " is too large to be converted to an int"));
    }

    public synchronized long resetByteCount() {
        long j10;
        j10 = this.count;
        this.count = 0L;
        return j10;
    }

    public int resetCount() {
        long jResetByteCount = resetByteCount();
        if (jResetByteCount <= LruCacheKt.f86729a) {
            return (int) jResetByteCount;
        }
        throw new ArithmeticException(C2151s.a("The byte count ", jResetByteCount, " is too large to be converted to an int"));
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        long jSkip;
        jSkip = super.skip(j10);
        this.count += jSkip;
        return jSkip;
    }
}
