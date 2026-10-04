package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,166:1\n66#1:167\n1#2:168\n1#2:171\n1342#3,2:169\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n43#1:167\n43#1:168\n43#1:169,2\n*E\n"})
@dd.j(name = "TextStreamsKt")
public final class u {
    @Xc.f
    public static final BufferedReader b(Reader reader, int i10) {
        G.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    @Xc.f
    public static final BufferedWriter c(Writer writer, int i10) {
        G.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static /* synthetic */ BufferedReader d(Reader reader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        G.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    public static /* synthetic */ BufferedWriter e(Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        G.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    @C
    public static final long f(@NotNull Reader reader, @NotNull Writer out, int i10) throws IOException {
        G.p(reader, "<this>");
        G.p(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long g(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return f(reader, writer, i10);
    }

    public static final void h(@NotNull Reader reader, @NotNull ed.l<? super String, L0> action) throws IOException {
        G.p(reader, "<this>");
        G.p(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = i(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            bufferedReader.close();
        } finally {
        }
    }

    @NotNull
    public static final InterfaceC5000m<String> i(@NotNull BufferedReader bufferedReader) {
        G.p(bufferedReader, "<this>");
        return SequencesKt__SequencesKt.k(new r(bufferedReader));
    }

    @NotNull
    public static final byte[] j(@NotNull URL url) throws IOException {
        G.p(url, "<this>");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            G.m(inputStreamOpenStream);
            byte[] bArrP = a.p(inputStreamOpenStream);
            b.a(inputStreamOpenStream, null);
            return bArrP;
        } finally {
        }
    }

    @NotNull
    public static final List<String> k(@NotNull Reader reader) throws IOException {
        G.p(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        h(reader, new ed.l() { // from class: kotlin.io.t
            @Override // ed.l
            public final Object invoke(Object obj) {
                return u.l(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static final L0 l(ArrayList arrayList, String it) {
        G.p(it, "it");
        arrayList.add(it);
        return L0.f217464a;
    }

    @NotNull
    public static final String m(@NotNull Reader reader) {
        G.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        g(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    public static final String n(URL url, Charset charset) {
        G.p(url, "<this>");
        G.p(charset, "charset");
        return new String(j(url), charset);
    }

    public static /* synthetic */ String o(URL url, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(url, "<this>");
        G.p(charset, "charset");
        return new String(j(url), charset);
    }

    @Xc.f
    public static final StringReader p(String str) {
        G.p(str, "<this>");
        return new StringReader(str);
    }

    @C
    public static final <T> T q(@NotNull Reader reader, @NotNull ed.l<? super InterfaceC5000m<String>, ? extends T> block) throws IOException {
        G.p(reader, "<this>");
        G.p(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T tInvoke = block.invoke(i(bufferedReader));
            bufferedReader.close();
            return tInvoke;
        } finally {
        }
    }
}
