package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import com.prism.gaia.download.j;
import com.tonyodev.fetch2core.server.FileResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c[] f159436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f159437b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f159438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f159439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f159440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f159441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c[] f159442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f159443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f159444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f159445h;

        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f159441d;
            int i11 = this.f159445h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f159442e, (Object) null);
            this.f159443f = this.f159442e.length - 1;
            this.f159444g = 0;
            this.f159445h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f159436a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f159438a.add(d.f159436a[i10]);
                return;
            }
            int iA = a(i10 - d.f159436a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f159442e;
                if (iA < cVarArr.length) {
                    this.f159438a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f159438a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f159438a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f159438a);
            this.f159438a.clear();
            return arrayList;
        }

        public void f() throws IOException {
            while (!this.f159439b.f()) {
                byte b10 = this.f159439b.readByte();
                int i10 = b10 & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((b10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f159441d = iA;
                    if (iA < 0 || iA > this.f159440c) {
                        throw new IOException("Invalid dynamic table size update " + this.f159441d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        public a(int i10, int i11, s sVar) {
            this.f159438a = new ArrayList();
            this.f159442e = new c[8];
            this.f159443f = 7;
            this.f159444g = 0;
            this.f159445h = 0;
            this.f159440c = i10;
            this.f159441d = i11;
            this.f159439b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.f159439b.readByte() & 255;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f159436a[i10].f159433a;
            }
            int iA = a(i10 - d.f159436a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f159442e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f159433a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int a(int i10) {
            return this.f159443f + 1 + i10;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f159438a.add(cVar);
            int i11 = cVar.f159435c;
            if (i10 != -1) {
                i11 -= this.f159442e[a(i10)].f159435c;
            }
            int i12 = this.f159441d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f159445h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f159444g + 1;
                c[] cVarArr = this.f159442e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f159443f = this.f159442e.length - 1;
                    this.f159442e = cVarArr2;
                }
                int i14 = this.f159443f;
                this.f159443f = i14 - 1;
                this.f159442e[i14] = cVar;
                this.f159444g++;
            } else {
                this.f159442e[a(i10) + iB + i10] = cVar;
            }
            this.f159445h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f159442e.length;
                while (true) {
                    length--;
                    i11 = this.f159443f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f159442e[length].f159435c;
                    i10 -= i13;
                    this.f159445h -= i13;
                    this.f159444g--;
                    i12++;
                }
                c[] cVarArr = this.f159442e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f159444g);
                this.f159443f += i12;
            }
            return i12;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f159439b.c(iA)));
            }
            return this.f159439b.b(iA);
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        public int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f159446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f159447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f159448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f159449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f159451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        c[] f159452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f159453h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f159454i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f159455j;

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f159452g.length;
                while (true) {
                    length--;
                    i11 = this.f159453h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f159452g[length].f159435c;
                    i10 -= i13;
                    this.f159455j -= i13;
                    this.f159454i--;
                    i12++;
                }
                c[] cVarArr = this.f159452g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f159454i);
                c[] cVarArr2 = this.f159452g;
                int i15 = this.f159453h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f159453h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f159452g, (Object) null);
            this.f159453h = this.f159452g.length - 1;
            this.f159454i = 0;
            this.f159455j = 0;
        }

        public b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f159448c = Integer.MAX_VALUE;
            this.f159452g = new c[8];
            this.f159453h = 7;
            this.f159454i = 0;
            this.f159455j = 0;
            this.f159450e = i10;
            this.f159451f = i10;
            this.f159447b = z10;
            this.f159446a = cVar;
        }

        public void b(int i10) {
            this.f159450e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f159451f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f159448c = Math.min(this.f159448c, iMin);
            }
            this.f159449d = true;
            this.f159451f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f159435c;
            int i11 = this.f159451f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f159455j + i10) - i11);
            int i12 = this.f159454i + 1;
            c[] cVarArr = this.f159452g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f159453h = this.f159452g.length - 1;
                this.f159452g = cVarArr2;
            }
            int i13 = this.f159453h;
            this.f159453h = i13 - 1;
            this.f159452g[i13] = cVar;
            this.f159454i++;
            this.f159455j += i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.d.b.a(java.util.List):void");
        }

        public void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f159446a.writeByte(i10 | i12);
                return;
            }
            this.f159446a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f159446a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f159446a.writeByte(i13);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.f159447b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.j(), 127, 128);
                this.f159446a.a(fVarO);
                return;
            }
            a(fVar.j(), 127, 0);
            this.f159446a.a(fVar);
        }

        private void a() {
            int i10 = this.f159451f;
            int i11 = this.f159455j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f159432i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f159429f;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f159430g;
        c cVar4 = new c(fVar2, RemoteSettings.FORWARD_SLASH_STRING);
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f159431h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f159428e;
        f159436a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c(com.tonyodev.fetch2core.b.f194469d, ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c(com.tonyodev.fetch2core.b.f194478m, ""), new c("content-type", ""), new c("cookie", ""), new c(FileResponse.FIELD_DATE, ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(x.h.f238400c, ""), new c(Hd.d.f50815k, ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c(j.b.f164700F, ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f159437b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f159436a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f159436a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f159433a)) {
                linkedHashMap.put(cVarArr[i10].f159433a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
