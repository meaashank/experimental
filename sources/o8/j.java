package o8;

import android.os.ParcelFileDescriptor;
import com.prism.gaia.client.natives.NativeMirror;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.internal.ZipKt;
import v8.C5716z;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223371e = 65536;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static j f223372f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f223374h = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatagramSocket f223375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f223376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, a> f223377c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f223370d = "asdf-".concat(j.class.getSimpleName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<Long, j> f223373g = new ConcurrentHashMap();

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f223378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InetAddress f223379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptor f223380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f223381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f223382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public OutputStream f223383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f223384g;

        public a(int i10, InetAddress inetAddress, ParcelFileDescriptor parcelFileDescriptor, int i11, int i12) {
            this.f223378a = i10;
            this.f223379b = inetAddress;
            this.f223380c = parcelFileDescriptor;
            this.f223381d = i11;
            this.f223382e = i12;
        }

        public void b() {
            if (this.f223384g) {
                return;
            }
            this.f223384g = true;
            j.this.f223377c.remove(Integer.valueOf(this.f223378a), this);
            try {
                this.f223380c.close();
            } catch (Throwable unused) {
            }
        }

        public final /* synthetic */ void c() {
            int i10;
            byte[] bArr = new byte[65536];
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f223380c);
                while (!this.f223384g && (i10 = autoCloseInputStream.read(bArr)) >= 0) {
                    try {
                        j.this.f223375a.send(new DatagramPacket(bArr, i10, this.f223379b, this.f223378a));
                    } finally {
                    }
                }
                autoCloseInputStream.close();
            } catch (Throwable unused) {
            }
            b();
        }

        public void d(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                this.f223383f.write(bArr2);
                this.f223383f.flush();
            } catch (Throwable unused) {
                b();
            }
        }

        public void e() {
            this.f223383f = new ParcelFileDescriptor.AutoCloseOutputStream(this.f223380c);
            Thread thread = new Thread(new Runnable() { // from class: o8.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f223369a.c();
                }
            }, "gaia-vpn-udp-r" + this.f223378a);
            thread.setDaemon(true);
            thread.start();
        }
    }

    public j(DatagramSocket datagramSocket, long j10) {
        this.f223375a = datagramSocket;
        this.f223376b = j10;
    }

    public static int d(int i10, int i11) {
        long jF = f(i10, i11);
        Map<Long, j> map = f223373g;
        j jVar = map.get(Long.valueOf(jF));
        if (jVar != null) {
            return jVar.f223375a.getLocalPort();
        }
        synchronized (j.class) {
            try {
                j jVar2 = map.get(Long.valueOf(jF));
                if (jVar2 != null) {
                    return jVar2.f223375a.getLocalPort();
                }
                if (map.size() >= 64) {
                    map.size();
                    return 0;
                }
                try {
                    DatagramSocket datagramSocket = new DatagramSocket(new InetSocketAddress(InetAddress.getByName(H3.b.f45544f), 0));
                    j jVar3 = new j(datagramSocket, jF);
                    Thread thread = new Thread(new g(jVar3), "gaia-vpn-udp-chan-" + datagramSocket.getLocalPort());
                    thread.setDaemon(true);
                    thread.start();
                    map.put(Long.valueOf(jF), jVar3);
                    datagramSocket.getLocalPort();
                    return datagramSocket.getLocalPort();
                } catch (Throwable unused) {
                    return 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long f(int i10, int i11) {
        return ((long) (65535 & i11)) | ((((long) i10) & ZipKt.f225990j) << 16);
    }

    public static synchronized int g() {
        j jVar;
        jVar = f223372f;
        return jVar == null ? 0 : jVar.f223375a.getLocalPort();
    }

    public static synchronized int i() {
        j jVar = f223372f;
        if (jVar != null) {
            return jVar.f223375a.getLocalPort();
        }
        try {
            DatagramSocket datagramSocket = new DatagramSocket(new InetSocketAddress(InetAddress.getByName(H3.b.f45544f), 0));
            j jVar2 = new j(datagramSocket, 0L);
            Thread thread = new Thread(new g(jVar2), "gaia-vpn-udp-sink");
            thread.setDaemon(true);
            thread.start();
            f223372f = jVar2;
            datagramSocket.getLocalPort();
            return datagramSocket.getLocalPort();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final a e(int i10, InetAddress inetAddress) {
        int i11;
        int i12;
        ParcelFileDescriptor parcelFileDescriptorG;
        long jVpnLookupOrigDst = this.f223376b;
        if (jVpnLookupOrigDst == 0) {
            jVpnLookupOrigDst = NativeMirror.vpnLookupOrigDst(i10);
        }
        if (jVpnLookupOrigDst == 0 || (parcelFileDescriptorG = C5716z.a().g((i11 = (int) (jVpnLookupOrigDst >>> 16)), (i12 = (int) (jVpnLookupOrigDst & Nd.g.f65032t)))) == null) {
            return null;
        }
        a aVar = new a(i10, inetAddress, parcelFileDescriptorG, i11, i12);
        a aVar2 = (a) this.f223377c.putIfAbsent(Integer.valueOf(i10), aVar);
        if (aVar2 != null) {
            aVar.b();
            return aVar2;
        }
        aVar.e();
        return aVar;
    }

    public final void h() {
        byte[] bArr = new byte[65536];
        while (!this.f223375a.isClosed()) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 65536);
            try {
                this.f223375a.receive(datagramPacket);
                int port = datagramPacket.getPort();
                a aVarE = this.f223377c.get(Integer.valueOf(port));
                if (aVarE != null || (aVarE = e(port, datagramPacket.getAddress())) != null) {
                    aVarE.d(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                }
            } catch (Throwable unused) {
                this.f223375a.isClosed();
                return;
            }
        }
    }
}
