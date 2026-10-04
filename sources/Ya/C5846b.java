package ya;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: ya.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5846b implements InterfaceC5845a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedOutputStream f241132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f241133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RandomAccessFile f241134c;

    public C5846b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f241134c = randomAccessFile;
        this.f241133b = randomAccessFile.getFD();
        this.f241132a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    public static InterfaceC5845a a(File file) throws IOException {
        return new C5846b(file);
    }

    @Override // ya.InterfaceC5845a
    public void close() throws IOException {
        this.f241132a.close();
        this.f241134c.close();
    }

    @Override // ya.InterfaceC5845a
    public void flushAndSync() throws IOException {
        this.f241132a.flush();
        this.f241133b.sync();
    }

    @Override // ya.InterfaceC5845a
    public void seek(long j10) throws IOException {
        this.f241134c.seek(j10);
    }

    @Override // ya.InterfaceC5845a
    public void setLength(long j10) throws IOException {
        this.f241134c.setLength(j10);
    }

    @Override // ya.InterfaceC5845a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f241132a.write(bArr, i10, i11);
    }
}
