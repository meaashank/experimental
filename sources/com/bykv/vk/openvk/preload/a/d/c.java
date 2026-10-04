package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlin.time.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f140365a = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f140366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Writer f140367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f140368d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f140369e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f140370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f140371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f140372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f140373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f140374j;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f140365a[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f140365a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f140366b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f140370f = com.prism.gaia.server.accounts.b.f166434b0;
        this.f140374j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f140367c = writer;
    }

    private int i() {
        int i10 = this.f140369e;
        if (i10 != 0) {
            return this.f140368d[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void j() throws IOException {
        if (this.f140373i != null) {
            k();
            c(this.f140373i);
            this.f140373i = null;
        }
    }

    private void k() throws IOException {
        int i10 = i();
        if (i10 == 5) {
            this.f140367c.write(44);
        } else if (i10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        b(4);
    }

    private void l() throws IOException {
        int i10 = i();
        if (i10 == 1) {
            b(2);
            return;
        }
        if (i10 == 2) {
            this.f140367c.append(',');
            return;
        }
        if (i10 == 4) {
            this.f140367c.append((CharSequence) this.f140370f);
            b(5);
            return;
        }
        if (i10 != 6) {
            if (i10 != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.f140371g) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        b(7);
    }

    public final void a(boolean z10) {
        this.f140371g = z10;
    }

    public final void b(boolean z10) {
        this.f140372h = z10;
    }

    public final void c(boolean z10) {
        this.f140374j = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f140367c.close();
        int i10 = this.f140369e;
        if (i10 > 1 || (i10 == 1 && this.f140368d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f140369e = 0;
    }

    public final c d() throws IOException {
        j();
        return a(1, '[');
    }

    public final c e() throws IOException {
        return a(1, 2, ']');
    }

    public final c f() throws IOException {
        j();
        return a(3, '{');
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f140369e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f140367c.flush();
    }

    public final c g() throws IOException {
        return a(3, 5, '}');
    }

    public final c h() throws IOException {
        if (this.f140373i != null) {
            if (!this.f140374j) {
                this.f140373i = null;
                return this;
            }
            j();
        }
        l();
        this.f140367c.write("null");
        return this;
    }

    public final boolean a() {
        return this.f140371g;
    }

    public final boolean b() {
        return this.f140372h;
    }

    public final boolean c() {
        return this.f140374j;
    }

    private c a(int i10, char c10) throws IOException {
        l();
        a(i10);
        this.f140367c.write(c10);
        return this;
    }

    private void b(int i10) {
        this.f140368d[this.f140369e - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f140372h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f140366b
            goto L9
        L7:
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f140365a
        L9:
            java.io.Writer r1 = r8.f140367c
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f140367c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f140367c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f140367c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f140367c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.c.c(java.lang.String):void");
    }

    public final c d(boolean z10) throws IOException {
        j();
        l();
        this.f140367c.write(z10 ? "true" : "false");
        return this;
    }

    public final c b(String str) throws IOException {
        if (str == null) {
            return h();
        }
        j();
        l();
        c(str);
        return this;
    }

    private c a(int i10, int i11, char c10) throws IOException {
        int i12 = i();
        if (i12 != i11 && i12 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f140373i == null) {
            this.f140369e--;
            this.f140367c.write(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f140373i);
    }

    private void a(int i10) {
        int i11 = this.f140369e;
        int[] iArr = this.f140368d;
        if (i11 == iArr.length) {
            this.f140368d = Arrays.copyOf(iArr, i11 << 1);
        }
        int[] iArr2 = this.f140368d;
        int i12 = this.f140369e;
        this.f140369e = i12 + 1;
        iArr2[i12] = i10;
    }

    public final c a(String str) throws IOException {
        if (str != null) {
            if (this.f140373i == null) {
                if (this.f140369e != 0) {
                    this.f140373i = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final c a(Boolean bool) throws IOException {
        if (bool == null) {
            return h();
        }
        j();
        l();
        this.f140367c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public final c a(long j10) throws IOException {
        j();
        l();
        this.f140367c.write(Long.toString(j10));
        return this;
    }

    public final c a(Number number) throws IOException {
        if (number == null) {
            return h();
        }
        j();
        String string = number.toString();
        if (!this.f140371g && (string.equals("-Infinity") || string.equals(j.f218437k) || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        l();
        this.f140367c.append((CharSequence) string);
        return this;
    }
}
