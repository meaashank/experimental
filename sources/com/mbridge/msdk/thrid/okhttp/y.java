package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f159781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f159782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r f159783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final z f159784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f159785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private volatile c f159786f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        s f159787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f159788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        r.a f159789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        z f159790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f159791e;

        public a() {
            this.f159791e = Collections.EMPTY_MAP;
            this.f159788b = "GET";
            this.f159789c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f159787a = sVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(s.b(str2));
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.f159789c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f159789c.b(str);
            return this;
        }

        public a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f159791e = map;
            this.f159787a = yVar.f159781a;
            this.f159788b = yVar.f159782b;
            this.f159790d = yVar.f159784d;
            this.f159791e = yVar.f159785e.isEmpty() ? map : new LinkedHashMap<>(yVar.f159785e);
            this.f159789c = yVar.f159783c.a();
        }

        public a a(r rVar) {
            this.f159789c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f159789c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f159278d);
        }

        public a a(@Nullable z zVar) {
            return a("DELETE", zVar);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(String str, @Nullable z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException(android.support.v4.media.i.a("method ", str, " must not have a request body."));
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException(android.support.v4.media.i.a("method ", str, " must have a request body."));
                    }
                    this.f159788b = str;
                    this.f159790d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f159787a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public y(a aVar) {
        this.f159781a = aVar.f159787a;
        this.f159782b = aVar.f159788b;
        this.f159783c = aVar.f159789c.a();
        this.f159784d = aVar.f159790d;
        this.f159785e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f159791e);
    }

    @Nullable
    public String a(String str) {
        return this.f159783c.b(str);
    }

    public c b() {
        c cVar = this.f159786f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f159783c);
        this.f159786f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f159783c;
    }

    public boolean d() {
        return this.f159781a.h();
    }

    public String e() {
        return this.f159782b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f159781a;
    }

    public String toString() {
        return "Request{method=" + this.f159782b + ", url=" + this.f159781a + ", tags=" + this.f159785e + '}';
    }

    @Nullable
    public z a() {
        return this.f159784d;
    }
}
