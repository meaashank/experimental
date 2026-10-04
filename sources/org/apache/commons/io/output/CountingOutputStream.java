package org.apache.commons.io.output;

import androidx.collection.LruCacheKt;
import androidx.compose.ui.input.pointer.C2151s;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class CountingOutputStream extends ProxyOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.count = 0L;
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    public synchronized void beforeWrite(int i10) {
        this.count += (long) i10;
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
}
