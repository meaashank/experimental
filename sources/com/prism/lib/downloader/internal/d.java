package com.prism.lib.downloader.internal;

import Ma.h;
import android.util.Log;
import com.prism.commons.utils.l0;
import com.prism.lib.downloader.common.DownloadProgress;
import com.prism.lib.downloader.common.DownloadStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import va.C5719a;
import wa.C5770a;
import wa.InterfaceC5771b;
import xa.C5800b;
import ya.InterfaceC5845a;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f178686m = l0.b(d.class.getSimpleName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f178687n = 4096;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f178688o = 2000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f178689p = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5800b f178690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DownloadResponse f178691b = new DownloadResponse();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f178692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f178693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f178694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputStream f178695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC5845a f178696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC5771b f178697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f178698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f178699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f178700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f178701l;

    public d(C5800b c5800b) {
        this.f178690a = c5800b;
    }

    public static d e(C5800b c5800b) {
        return new d(c5800b);
    }

    public final void c(InterfaceC5845a interfaceC5845a) {
        InputStream inputStream = this.f178695f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        try {
            if (interfaceC5845a != null) {
                try {
                    q(interfaceC5845a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (interfaceC5845a != null) {
                try {
                    interfaceC5845a.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                interfaceC5845a.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            throw th;
        }
    }

    public final String d(InputStream inputStream) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (IOException unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb2.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException | NullPointerException unused3) {
                }
            } catch (IOException unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return sb2.toString();
    }

    public DownloadResponse f() {
        return this.f178691b;
    }

    public final boolean g() {
        C5800b c5800b;
        return (this.f178700k == null || (c5800b = this.f178690a) == null || c5800b.q() == null || this.f178690a.q().equals(this.f178700k)) ? false : true;
    }

    public final boolean h() {
        int i10 = this.f178699j;
        return i10 >= 200 && i10 < 300;
    }

    public final boolean i() {
        return this.f178699j == 206;
    }

    public final /* synthetic */ void j(List list) {
        if (list == null || list.size() == 0) {
            Log.w(f178686m, "weired fail on import file into private-file-system: Downloads");
        } else {
            this.f178690a.p0(((h) list.get(0)).f().getUserPath());
        }
    }

    public final /* synthetic */ void k(List list) {
        if (list != null && list.size() != 0) {
            this.f178690a.a0(((h) list.get(0)).f().getRealPath());
        } else {
            Log.w(f178686m, "weired fail on import file into public-file-system: " + com.prism.lib.downloader.a.q().getTargetResidePath());
        }
    }

    public final void l() {
        C5800b c5800b = this.f178690a;
        c5800b.M(new DownloadProgress(c5800b.p(), this.f178690a.H()));
    }

    public final void m() {
        this.f178690a.N();
    }

    public final void n() throws IllegalAccessException, IOException {
        if (this.f178699j == 416 || g()) {
            this.f178690a.k();
            this.f178690a.c0(this.f178700k);
            this.f178690a.b0(0L);
            this.f178690a.x0(0L);
            this.f178697h.getClass();
            InterfaceC5771b interfaceC5771bClone = com.prism.lib.downloader.a.h().c().clone();
            this.f178697h = interfaceC5771bClone;
            ((C5770a) interfaceC5771bClone).m3(this.f178690a);
            InterfaceC5771b interfaceC5771bA = C5719a.a(this.f178697h, this.f178690a);
            this.f178697h = interfaceC5771bA;
            this.f178699j = interfaceC5771bA.V1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac A[Catch: all -> 0x0078, TryCatch #2 {all -> 0x0078, blocks: (B:5:0x0008, B:9:0x0031, B:11:0x0054, B:20:0x0084, B:22:0x0096, B:23:0x009b, B:25:0x00a3, B:26:0x00b0, B:29:0x00b8, B:31:0x00d9, B:33:0x00e3, B:34:0x00ee, B:37:0x00f6, B:39:0x0100, B:41:0x010e, B:43:0x015d, B:42:0x0138, B:44:0x0169, B:47:0x0189, B:49:0x018d, B:50:0x0192, B:52:0x01a8, B:54:0x01ac, B:55:0x01b1), top: B:60:0x0004, inners: #4, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o() {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib.downloader.internal.d.o():void");
    }

    public final boolean p() {
        if (this.f178690a.E() == DownloadStatus.CANCELLED) {
            this.f178690a.k();
            this.f178691b.f();
            return true;
        }
        if (this.f178690a.E() != DownloadStatus.PAUSED) {
            return false;
        }
        this.f178691b.h();
        return true;
    }

    public final void q(InterfaceC5845a interfaceC5845a) {
        try {
            interfaceC5845a.flushAndSync();
            if (this.f178701l) {
                this.f178690a.j0(System.currentTimeMillis());
                this.f178690a.A0();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void r(InterfaceC5845a interfaceC5845a) {
        long jP = this.f178690a.p();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jP - this.f178694e;
        long j11 = jCurrentTimeMillis - this.f178693d;
        if (j10 <= 65536 || j11 <= 2000) {
            return;
        }
        q(interfaceC5845a);
        this.f178694e = jP;
        this.f178693d = jCurrentTimeMillis;
    }
}
