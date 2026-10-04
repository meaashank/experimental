package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f159672c = u.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f159673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f159674b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f159675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f159676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f159677c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f159675a.add(s.a(str, HttpUrl.f225221u, false, false, true, true, this.f159677c));
            this.f159676b.add(s.a(str2, HttpUrl.f225221u, false, false, true, true, this.f159677c));
            return this;
        }

        public a(Charset charset) {
            this.f159675a = new ArrayList();
            this.f159676b = new ArrayList();
            this.f159677c = charset;
        }

        public p a() {
            return new p(this.f159675a, this.f159676b);
        }
    }

    public p(List<String> list, List<String> list2) {
        this.f159673a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f159674b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f159672c;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    private long a(@Nullable com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVarA;
        if (z10) {
            cVarA = new com.mbridge.msdk.thrid.okio.c();
        } else {
            cVarA = dVar.a();
        }
        int size = this.f159673a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVarA.writeByte(38);
            }
            cVarA.a(this.f159673a.get(i10));
            cVarA.writeByte(61);
            cVarA.a(this.f159674b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarA.size();
        cVarA.k();
        return size2;
    }
}
