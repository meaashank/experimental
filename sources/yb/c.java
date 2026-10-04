package yb;

import androidx.collection.LruCacheKt;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f241138a = '/';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f241139b = '\\';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f241140c = File.separatorChar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f241141d = "\n";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f241142e = "\r\n";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f241143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f241144g = 4096;

    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        f241143f = stringWriter.toString();
    }

    public static String A(byte[] bArr) throws IOException {
        return new String(bArr);
    }

    public static String B(byte[] bArr, String str) throws IOException {
        return str == null ? new String(bArr) : new String(bArr, str);
    }

    public static void C(String str, OutputStream outputStream) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    public static void D(String str, OutputStream outputStream, String str2) throws IOException {
        if (str != null) {
            if (str2 == null) {
                C(str, outputStream);
            } else {
                outputStream.write(str.getBytes(str2));
            }
        }
    }

    public static void E(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static void F(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes());
        }
    }

    public static void G(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            if (str == null) {
                F(stringBuffer, outputStream);
            } else {
                outputStream.write(stringBuffer.toString().getBytes(str));
            }
        }
    }

    public static void H(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void I(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void J(byte[] bArr, Writer writer) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr));
        }
    }

    public static void K(byte[] bArr, Writer writer, String str) throws IOException {
        if (bArr != null) {
            if (str == null) {
                J(bArr, writer);
            } else {
                writer.write(new String(bArr, str));
            }
        }
    }

    public static void L(char[] cArr, OutputStream outputStream) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes());
        }
    }

    public static void M(char[] cArr, OutputStream outputStream, String str) throws IOException {
        if (cArr != null) {
            if (str == null) {
                L(cArr, outputStream);
            } else {
                outputStream.write(new String(cArr).getBytes(str));
            }
        }
    }

    public static void N(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void O(Collection collection, String str, OutputStream outputStream) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f241143f;
        }
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes());
            }
            outputStream.write(str.getBytes());
        }
    }

    public static void P(Collection collection, String str, OutputStream outputStream, String str2) throws IOException {
        if (str2 == null) {
            O(collection, str, outputStream);
            return;
        }
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f241143f;
        }
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(str2));
            }
            outputStream.write(str.getBytes(str2));
        }
    }

    public static void Q(Collection collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f241143f;
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void c(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void d(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean e(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        for (int i10 = inputStream.read(); -1 != i10; i10 = inputStream.read()) {
            if (i10 != inputStream2.read()) {
                return false;
            }
        }
        return inputStream2.read() == -1;
    }

    public static boolean f(Reader reader, Reader reader2) throws IOException {
        if (!(reader instanceof BufferedReader)) {
            reader = new BufferedReader(reader);
        }
        if (!(reader2 instanceof BufferedReader)) {
            reader2 = new BufferedReader(reader2);
        }
        for (int i10 = reader.read(); -1 != i10; i10 = reader.read()) {
            if (i10 != reader2.read()) {
                return false;
            }
        }
        return reader2.read() == -1;
    }

    public static int g(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jM = m(inputStream, outputStream);
        if (jM > LruCacheKt.f86729a) {
            return -1;
        }
        return (int) jM;
    }

    public static int h(Reader reader, Writer writer) throws IOException {
        long jN = n(reader, writer);
        if (jN > LruCacheKt.f86729a) {
            return -1;
        }
        return (int) jN;
    }

    public static void i(InputStream inputStream, Writer writer) throws IOException {
        h(new InputStreamReader(inputStream), writer);
    }

    public static void j(InputStream inputStream, Writer writer, String str) throws IOException {
        if (str == null) {
            i(inputStream, writer);
        } else {
            h(new InputStreamReader(inputStream, str), writer);
        }
    }

    public static void k(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        h(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void l(Reader reader, OutputStream outputStream, String str) throws IOException {
        if (str == null) {
            k(reader, outputStream);
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        h(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static long m(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static long n(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static List o(InputStream inputStream) throws IOException {
        return q(new InputStreamReader(inputStream));
    }

    public static List p(InputStream inputStream, String str) throws IOException {
        return str == null ? o(inputStream) : q(new InputStreamReader(inputStream, str));
    }

    public static List q(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            arrayList.add(line);
        }
        return arrayList;
    }

    public static byte[] r(String str) throws IOException {
        return str.getBytes();
    }

    public static char[] s(InputStream inputStream) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        i(inputStream, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static char[] t(InputStream inputStream, String str) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        j(inputStream, charArrayWriter, str);
        return charArrayWriter.toCharArray();
    }

    public static char[] u(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        h(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream v(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    public static InputStream w(String str, String str2) throws IOException {
        return new ByteArrayInputStream(str2 != null ? str.getBytes(str2) : str.getBytes());
    }

    public static String x(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        i(inputStream, stringWriter);
        return stringWriter.toString();
    }

    public static String y(InputStream inputStream, String str) throws IOException {
        StringWriter stringWriter = new StringWriter();
        j(inputStream, stringWriter, str);
        return stringWriter.toString();
    }

    public static String z(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        h(reader, stringWriter);
        return stringWriter.toString();
    }
}
