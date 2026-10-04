package o8;

import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.OsConstants;
import com.android.launcher3.IconCache;
import com.prism.gaia.client.natives.NativeMirror;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import v8.C5716z;

/* JADX INFO: renamed from: o8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5339e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f223364b = "asdf-".concat(C5339e.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f223365c = 16384;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C5339e f223366d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServerSocket f223367a;

    public C5339e(ServerSocket serverSocket) {
        this.f223367a = serverSocket;
    }

    public static /* synthetic */ void a(InputStream inputStream, OutputStream outputStream, AtomicBoolean atomicBoolean, ParcelFileDescriptor parcelFileDescriptor) {
        i(inputStream, outputStream, null);
        if (atomicBoolean.get()) {
            return;
        }
        k(parcelFileDescriptor);
    }

    public static void e(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof Socket) {
                ((Socket) obj).close();
            } else if (obj instanceof ParcelFileDescriptor) {
                ((ParcelFileDescriptor) obj).close();
            }
        } catch (Throwable unused) {
        }
    }

    public static String f(int i10) {
        return ((i10 >>> 24) & 255) + IconCache.EMPTY_CLASS_NAME + ((i10 >>> 16) & 255) + IconCache.EMPTY_CLASS_NAME + ((i10 >>> 8) & 255) + IconCache.EMPTY_CLASS_NAME + (i10 & 255);
    }

    public static synchronized int h() {
        C5339e c5339e;
        c5339e = f223366d;
        return c5339e == null ? 0 : c5339e.f223367a.getLocalPort();
    }

    public static long i(InputStream inputStream, OutputStream outputStream, String str) {
        byte[] bArr = new byte[16384];
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                if (j10 == 0 && str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 8 && i11 < i10; i11++) {
                        sb2.append(String.format("%02x ", Byte.valueOf(bArr[i11])));
                    }
                    sb2.toString().trim();
                }
                outputStream.write(bArr, 0, i10);
                outputStream.flush();
                j10 += (long) i10;
            } catch (IOException unused) {
            }
        }
        return j10;
    }

    public static void k(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return;
        }
        try {
            Os.shutdown(parcelFileDescriptor.getFileDescriptor(), OsConstants.SHUT_WR);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static synchronized int l() {
        C5339e c5339e = f223366d;
        if (c5339e != null) {
            return c5339e.f223367a.getLocalPort();
        }
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(InetAddress.getByName(H3.b.f45544f), 0), 128);
            final C5339e c5339e2 = new C5339e(serverSocket);
            Thread thread = new Thread(new Runnable() { // from class: o8.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f223363a.d();
                }
            }, "gaia-vpn-sink");
            thread.setDaemon(true);
            thread.start();
            f223366d = c5339e2;
            serverSocket.getLocalPort();
            return serverSocket.getLocalPort();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final void d() {
        while (!this.f223367a.isClosed()) {
            try {
                final Socket socketAccept = this.f223367a.accept();
                Thread thread = new Thread(new Runnable() { // from class: o8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f223357a.g(socketAccept);
                    }
                }, "gaia-vpn-relay");
                thread.setDaemon(true);
                thread.start();
            } catch (IOException unused) {
                this.f223367a.isClosed();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void g(Socket socket) {
        try {
            int port = socket.getPort();
            long jVpnLookupOrigDst = NativeMirror.vpnLookupOrigDst(port);
            if (jVpnLookupOrigDst == 0) {
                e(socket);
                return;
            }
            int i10 = (int) (jVpnLookupOrigDst >>> 16);
            int i11 = (int) (jVpnLookupOrigDst & Nd.g.f65032t);
            final ParcelFileDescriptor parcelFileDescriptorH = C5716z.a().h(i10, i11);
            if (!(parcelFileDescriptorH != null)) {
                int iVpnOpenOutbound = NativeMirror.vpnOpenOutbound(i10, i11);
                if (iVpnOpenOutbound < 0) {
                    f(i10);
                    e(socket);
                    return;
                }
                parcelFileDescriptorH = ParcelFileDescriptor.adoptFd(iVpnOpenOutbound);
            }
            f(i10);
            final InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorH);
            final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorH);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Thread thread = new Thread(new Runnable() { // from class: o8.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5339e.a(inputStream, autoCloseOutputStream, atomicBoolean, parcelFileDescriptorH);
                }
            }, "gaia-vpn-up");
            thread.setDaemon(true);
            thread.start();
            i(autoCloseInputStream, outputStream, com.prism.gaia.server.accounts.b.f166434b0 + port + " downstream");
            atomicBoolean.set(true);
            e(socket);
            e(parcelFileDescriptorH);
        } catch (Throwable unused) {
            e(socket);
            e(null);
        }
    }
}
