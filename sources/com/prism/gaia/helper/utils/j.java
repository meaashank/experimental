package com.prism.gaia.helper.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.text.X;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes6.dex */
public class j implements XmlSerializer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f165133l = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Writer f165137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OutputStream f165138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharsetEncoder f165139e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f165142h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f165132k = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f165134m = "                                                              ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f165135a = new char[8192];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f165140f = ByteBuffer.allocate(8192);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f165141g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f165143i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f165144j = true;

    public final void a(char c10) throws IOException {
        int i10 = this.f165136b;
        if (i10 >= 8191) {
            flush();
            i10 = this.f165136b;
        }
        this.f165135a[i10] = c10;
        this.f165136b = i10 + 1;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IllegalStateException, IOException, IllegalArgumentException {
        a(' ');
        if (str != null) {
            c(str, 0, str.length());
            a(':');
        }
        b(str2);
        c("=\"", 0, 2);
        f(str3);
        a('\"');
        this.f165144j = false;
        return this;
    }

    public final void b(String str) throws IOException {
        c(str, 0, str.length());
    }

    public final void c(String str, int i10, int i11) throws IOException {
        if (i11 > 8192) {
            int i12 = i11 + i10;
            while (i10 < i12) {
                int i13 = i10 + 8192;
                c(str, i10, i13 < i12 ? 8192 : i12 - i10);
                i10 = i13;
            }
            return;
        }
        int i14 = this.f165136b;
        if (i14 + i11 > 8192) {
            flush();
            i14 = this.f165136b;
        }
        str.getChars(i10, i10 + i11, this.f165135a, i14);
        this.f165136b = i14 + i11;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public final void d(char[] cArr, int i10, int i11) throws IOException {
        if (i11 > 8192) {
            int i12 = i11 + i10;
            while (i10 < i12) {
                int i13 = i10 + 8192;
                d(cArr, i10, i13 < i12 ? 8192 : i12 - i10);
                i10 = i13;
            }
            return;
        }
        int i14 = this.f165136b;
        if (i14 + i11 > 8192) {
            flush();
            i14 = this.f165136b;
        }
        System.arraycopy(cArr, i10, this.f165135a, i14, i11);
        this.f165136b = i14 + i11;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public final void e(int i10) throws IOException {
        int length = i10 * 4;
        if (length > f165134m.length()) {
            length = f165134m.length();
        }
        c(f165134m, 0, length);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IllegalStateException, IOException, IllegalArgumentException {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        int i10 = this.f165143i - 1;
        this.f165143i = i10;
        if (this.f165142h) {
            c(" />\n", 0, 4);
        } else {
            if (this.f165141g && this.f165144j) {
                e(i10);
            }
            c("</", 0, 2);
            if (str != null) {
                c(str, 0, str.length());
                a(':');
            }
            b(str2);
            c(">\n", 0, 2);
        }
        this.f165144j = true;
        this.f165142h = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public final void f(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = f165132k;
        char length2 = (char) strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < length2 && (str2 = strArr[cCharAt]) != null) {
                if (i11 < i10) {
                    c(str, i11, i10 - i11);
                }
                i11 = i10 + 1;
                c(str2, 0, str2.length());
            }
            i10++;
        }
        if (i11 < i10) {
            c(str, i11, i10 - i11);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        int i10 = this.f165136b;
        if (i10 > 0) {
            if (this.f165138d != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(this.f165135a, 0, i10);
                CoderResult coderResultEncode = this.f165139e.encode(charBufferWrap, this.f165140f, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        h();
                        coderResultEncode = this.f165139e.encode(charBufferWrap, this.f165140f, true);
                    } else {
                        h();
                        this.f165138d.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.f165137c.write(this.f165135a, 0, i10);
            this.f165137c.flush();
            this.f165136b = 0;
        }
    }

    public final void g(char[] cArr, int i10, int i11) throws IOException {
        String str;
        String[] strArr = f165132k;
        char length = (char) strArr.length;
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 < length && (str = strArr[c10]) != null) {
                if (i13 < i10) {
                    d(cArr, i13, i10 - i13);
                }
                i13 = i10 + 1;
                c(str, 0, str.length());
            }
            i10++;
        }
        if (i13 < i10) {
            d(cArr, i13, i10 - i13);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z10) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public final void h() throws IOException {
        int iPosition = this.f165140f.position();
        if (iPosition > 0) {
            this.f165140f.flip();
            this.f165138d.write(this.f165140f.array(), 0, iPosition);
            this.f165140f.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z10) throws IllegalStateException, IllegalArgumentException {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
        this.f165141g = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f165139e = Charset.forName(str).newEncoder();
            this.f165138d = outputStream;
        } catch (IllegalCharsetNameException e10) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e10));
        } catch (UnsupportedCharsetException e11) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e11));
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) throws IllegalStateException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IllegalStateException, IOException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        sb2.append(bool.booleanValue() ? "yes" : "no");
        sb2.append("' ?>\n");
        b(sb2.toString());
        this.f165144j = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (this.f165142h) {
            c(">\n", 0, 2);
        }
        if (this.f165141g) {
            e(this.f165143i);
        }
        this.f165143i++;
        a(X.f218303e);
        if (str != null) {
            c(str, 0, str.length());
            a(':');
        }
        b(str2);
        this.f165142h = true;
        this.f165144j = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i10, int i11) throws IllegalStateException, IOException, IllegalArgumentException {
        if (this.f165142h) {
            c(">", 0, 1);
            this.f165142h = false;
        }
        g(cArr, i10, i11);
        if (this.f165141g) {
            this.f165144j = cArr[(i10 + i11) - 1] == '\n';
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IllegalStateException, IOException, IllegalArgumentException {
        this.f165137c = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        if (this.f165142h) {
            c(">", 0, 1);
            this.f165142h = false;
        }
        f(str);
        if (this.f165141g) {
            this.f165144j = str.length() > 0 && str.charAt(str.length() - 1) == '\n';
        }
        return this;
    }
}
