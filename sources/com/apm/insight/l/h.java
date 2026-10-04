package com.apm.insight.l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f137363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f137364b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f137365a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f137366b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f137367c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f137368d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f137369e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f137370f = new a("NULL", 5);

        private a(String str, int i10) {
        }
    }

    private h(Writer writer) {
        this.f137363a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f137365a, "[");
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f137365a;
        a aVar2 = a.f137366b;
        return a("]");
    }

    private h c() throws JSONException, IOException {
        return a(a.f137367c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f137367c;
        a aVar2 = a.f137369e;
        return a("}");
    }

    private a e() throws JSONException {
        return (a) androidx.appcompat.view.menu.d.a(this.f137364b, 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f137364b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f137365a) {
            a(a.f137366b);
            return;
        }
        if (aVarE == a.f137366b) {
            this.f137363a.write(44);
        } else if (aVarE == a.f137368d) {
            this.f137363a.write(com.prism.gaia.server.accounts.b.f166434b0);
            a(a.f137369e);
        } else if (aVarE != a.f137370f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f137364b.add(aVar);
        this.f137363a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f137363a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f137363a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f137363a.write("\\b");
                            continue;
                        case '\t':
                            this.f137363a.write("\\t");
                            continue;
                        case '\n':
                            this.f137363a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f137363a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f137363a.write(92);
                }
                this.f137363a.write(cCharAt);
            } else {
                this.f137363a.write("\\r");
            }
        }
        this.f137363a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f137369e) {
            this.f137363a.write(44);
        } else if (aVarE != a.f137367c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f137368d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        this.f137364b.remove(r0.size() - 1);
        this.f137363a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f137364b.set(r0.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f137363a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f137363a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f137363a.write("null");
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}
