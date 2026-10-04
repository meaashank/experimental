package y3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: y3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C5815d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Queue<C5815d> f241058c = o.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f241059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f241060b;

    public static void d() {
        while (true) {
            Queue<C5815d> queue = f241058c;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @NonNull
    public static C5815d l(@NonNull InputStream inputStream) {
        C5815d c5815dPoll;
        Queue<C5815d> queue = f241058c;
        synchronized (queue) {
            c5815dPoll = queue.poll();
        }
        if (c5815dPoll == null) {
            c5815dPoll = new C5815d();
        }
        c5815dPoll.m(inputStream);
        return c5815dPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f241059a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f241059a.close();
    }

    @Nullable
    public IOException k() {
        return this.f241060b;
    }

    public void m(@NonNull InputStream inputStream) {
        this.f241059a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f241059a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f241059a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f241059a.read(bArr);
        } catch (IOException e10) {
            this.f241060b = e10;
            return -1;
        }
    }

    public void release() {
        this.f241060b = null;
        this.f241059a = null;
        Queue<C5815d> queue = f241058c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f241059a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f241059a.skip(j10);
        } catch (IOException e10) {
            this.f241060b = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f241059a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f241060b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f241059a.read();
        } catch (IOException e10) {
            this.f241060b = e10;
            return -1;
        }
    }
}
