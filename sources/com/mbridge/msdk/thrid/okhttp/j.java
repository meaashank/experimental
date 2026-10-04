package com.mbridge.msdk.thrid.okhttp;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f159634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f159635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f159636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f159637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f159638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f159639j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f159640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f159641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    final String[] f159642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final String[] f159643d;

    static {
        g gVar = g.f159234n1;
        g gVar2 = g.f159237o1;
        g gVar3 = g.f159240p1;
        g gVar4 = g.f159243q1;
        g gVar5 = g.f159246r1;
        g gVar6 = g.f159193Z0;
        g gVar7 = g.f159204d1;
        g gVar8 = g.f159195a1;
        g gVar9 = g.f159207e1;
        g gVar10 = g.f159225k1;
        g gVar11 = g.f159222j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f159634e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.f159163K0, g.f159165L0, g.f159218i0, g.f159221j0, g.f159154G, g.f159162K, g.f159223k};
        f159635f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f159636g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f159637h = aVarA2.a(d0Var, d0Var2, d0.TLS_1_1, d0Var3).a(true).a();
        f159638i = new a(true).a(gVarArr2).a(d0Var3).a(true).a();
        f159639j = new a(false).a();
    }

    public j(a aVar) {
        this.f159640a = aVar.f159644a;
        this.f159642c = aVar.f159645b;
        this.f159643d = aVar.f159646c;
        this.f159641b = aVar.f159647d;
    }

    @Nullable
    public List<g> a() {
        String[] strArr = this.f159642c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f159640a;
    }

    public boolean c() {
        return this.f159641b;
    }

    @Nullable
    public List<d0> d() {
        String[] strArr = this.f159643d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f159640a;
        if (z10 != jVar.f159640a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f159642c, jVar.f159642c) && Arrays.equals(this.f159643d, jVar.f159643d) && this.f159641b == jVar.f159641b);
    }

    public int hashCode() {
        if (this.f159640a) {
            return ((((Arrays.hashCode(this.f159642c) + 527) * 31) + Arrays.hashCode(this.f159643d)) * 31) + (!this.f159641b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f159640a) {
            return "ConnectionSpec()";
        }
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("ConnectionSpec(cipherSuites=", this.f159642c != null ? a().toString() : "[all enabled]", ", tlsVersions=", this.f159643d != null ? d().toString() : "[all enabled]", ", supportsTlsExtensions=");
        sbA.append(this.f159641b);
        sbA.append(")");
        return sbA.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f159644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        String[] f159645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        String[] f159646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f159647d;

        public a(boolean z10) {
            this.f159644a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f159644a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f159263a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f159644a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f159646c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f159644a = jVar.f159640a;
            this.f159645b = jVar.f159642c;
            this.f159646c = jVar.f159643d;
            this.f159647d = jVar.f159641b;
        }

        public a a(String... strArr) {
            if (this.f159644a) {
                if (strArr.length != 0) {
                    this.f159645b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f159644a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f159133a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f159644a) {
                this.f159647d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f159642c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f159196b, sSLSocket.getEnabledCipherSuites(), this.f159642c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f159643d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f159291q, sSLSocket.getEnabledProtocols(), this.f159643d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f159196b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f159643d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f159642c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f159640a) {
            return false;
        }
        String[] strArr = this.f159643d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f159291q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f159642c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f159196b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
