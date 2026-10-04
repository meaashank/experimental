package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "ConsoleKt")
public final class c {
    @Xc.f
    public static final void a(byte b10) {
        System.out.print(Byte.valueOf(b10));
    }

    @Xc.f
    public static final void b(char c10) {
        System.out.print(c10);
    }

    @Xc.f
    public static final void c(double d10) {
        System.out.print(d10);
    }

    @Xc.f
    public static final void d(float f10) {
        System.out.print(f10);
    }

    @Xc.f
    public static final void e(int i10) {
        System.out.print(i10);
    }

    @Xc.f
    public static final void f(long j10) {
        System.out.print(j10);
    }

    @Xc.f
    public static final void g(Object obj) {
        System.out.print(obj);
    }

    @Xc.f
    public static final void h(short s10) {
        System.out.print(Short.valueOf(s10));
    }

    @Xc.f
    public static final void i(boolean z10) {
        System.out.print(z10);
    }

    @Xc.f
    public static final void j(char[] message) {
        G.p(message, "message");
        System.out.print(message);
    }

    @Xc.f
    public static final void k() {
        System.out.println();
    }

    @Xc.f
    public static final void l(byte b10) {
        System.out.println(Byte.valueOf(b10));
    }

    @Xc.f
    public static final void m(char c10) {
        System.out.println(c10);
    }

    @Xc.f
    public static final void n(double d10) {
        System.out.println(d10);
    }

    @Xc.f
    public static final void o(float f10) {
        System.out.println(f10);
    }

    @Xc.f
    public static final void p(int i10) {
        System.out.println(i10);
    }

    @Xc.f
    public static final void q(long j10) {
        System.out.println(j10);
    }

    @Xc.f
    public static final void r(Object obj) {
        System.out.println(obj);
    }

    @Xc.f
    public static final void s(short s10) {
        System.out.println(Short.valueOf(s10));
    }

    @Xc.f
    public static final void t(boolean z10) {
        System.out.println(z10);
    }

    @Xc.f
    public static final void u(char[] message) {
        G.p(message, "message");
        System.out.println(message);
    }

    @Nullable
    public static final String v() {
        q qVar = q.f217852a;
        InputStream in2 = System.in;
        G.o(in2, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        G.o(charsetDefaultCharset, "defaultCharset(...)");
        return qVar.d(in2, charsetDefaultCharset);
    }

    @InterfaceC4887e0(version = "1.6")
    @NotNull
    public static final String w() {
        String strV = v();
        if (strV != null) {
            return strV;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @InterfaceC4887e0(version = "1.6")
    @Nullable
    public static final String x() {
        return v();
    }
}
