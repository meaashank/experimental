package y3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: y3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5816e extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("POOL")
    public static final Queue<C5816e> f241061c = o.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f241062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f241063b;

    public static void d() {
        synchronized (f241061c) {
            while (true) {
                try {
                    Queue<C5816e> queue = f241061c;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @NonNull
    public static C5816e l(@NonNull InputStream inputStream) {
        C5816e c5816ePoll;
        Queue<C5816e> queue = f241061c;
        synchronized (queue) {
            c5816ePoll = queue.poll();
        }
        if (c5816ePoll == null) {
            c5816ePoll = new C5816e();
        }
        c5816ePoll.f241062a = inputStream;
        return c5816ePoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f241062a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f241062a.close();
    }

    @Nullable
    public IOException k() {
        return this.f241063b;
    }

    public void m(@NonNull InputStream inputStream) {
        this.f241062a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f241062a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f241062a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f241062a.read();
        } catch (IOException e10) {
            this.f241063b = e10;
            throw e10;
        }
    }

    public void release() {
        this.f241063b = null;
        this.f241062a = null;
        Queue<C5816e> queue = f241061c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f241062a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f241062a.skip(j10);
        } catch (IOException e10) {
            this.f241063b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f241062a.read(bArr);
        } catch (IOException e10) {
            this.f241063b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f241062a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f241063b = e10;
            throw e10;
        }
    }
}
