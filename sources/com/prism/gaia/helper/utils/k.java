package com.prism.gaia.helper.utils;

import android.annotation.TargetApi;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.prism.commons.utils.C3838b;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class k extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f165145e = "FileBridge";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f165146f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f165147g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f165148h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f165149i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileDescriptor f165150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f165151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileDescriptor f165152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f165153d;

    public k() {
        FileDescriptor fileDescriptor = new FileDescriptor();
        this.f165151b = fileDescriptor;
        FileDescriptor fileDescriptor2 = new FileDescriptor();
        this.f165152c = fileDescriptor2;
        try {
            Os.socketpair(OsConstants.AF_UNIX, OsConstants.SOCK_STREAM, 0, fileDescriptor, fileDescriptor2);
        } catch (ErrnoException unused) {
            throw new RuntimeException("Failed to create bridge");
        }
    }

    public static void a(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null || !fileDescriptor.valid()) {
            return;
        }
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e10) {
            e10.printStackTrace();
        }
    }

    public static int e(FileDescriptor fileDescriptor, byte[] bArr, int i10, int i11) throws IOException {
        C3838b.a(bArr.length, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        try {
            int i12 = Os.read(fileDescriptor, bArr, i10, i11);
            if (i12 == 0) {
                return -1;
            }
            return i12;
        } catch (ErrnoException e10) {
            if (e10.errno == OsConstants.EAGAIN) {
                return 0;
            }
            throw new IOException(e10);
        }
    }

    public static void g(FileDescriptor fileDescriptor, byte[] bArr, int i10, int i11) throws IOException {
        C3838b.a(bArr.length, i10, i11);
        if (i11 == 0) {
            return;
        }
        while (i11 > 0) {
            try {
                int iWrite = Os.write(fileDescriptor, bArr, i10, i11);
                i11 -= iWrite;
                i10 += iWrite;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public void b() {
        a(this.f165150a);
        a(this.f165151b);
        a(this.f165152c);
        this.f165153d = true;
    }

    public FileDescriptor c() {
        return this.f165152c;
    }

    public boolean d() {
        return this.f165153d;
    }

    public void f(FileDescriptor fileDescriptor) {
        this.f165150a = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                if (e(this.f165151b, bArr, 0, 8) != 8) {
                    break;
                }
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                int iT = l.T(bArr, 0, byteOrder);
                if (iT == 1) {
                    int iT2 = l.T(bArr, 4, byteOrder);
                    while (iT2 > 0) {
                        int iE = e(this.f165151b, bArr, 0, Math.min(8192, iT2));
                        if (iE == -1) {
                            throw new IOException("Unexpected EOF; still expected " + iT2 + " bytes");
                        }
                        g(this.f165150a, bArr, 0, iE);
                        iT2 -= iE;
                    }
                } else if (iT == 2) {
                    Os.fsync(this.f165150a);
                    g(this.f165151b, bArr, 0, 8);
                } else if (iT == 3) {
                    Os.fsync(this.f165150a);
                    Os.close(this.f165150a);
                    this.f165153d = true;
                    g(this.f165151b, bArr, 0, 8);
                    break;
                }
            } catch (ErrnoException | IOException unused) {
                b();
                return;
            } catch (Throwable th) {
                b();
                throw th;
            }
        }
        b();
    }
}
