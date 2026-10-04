package e3;

import C4.q;
import U6.j;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f200174o = "journal";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f200175p = "journal.tmp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f200176q = "journal.bkp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f200177r = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f200178s = "1";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f200179t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f200180u = "CLEAN";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f200181v = "DIRTY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f200182w = "REMOVE";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f200183x = "READ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f200184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f200185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f200186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f200187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f200188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f200189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f200190g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Writer f200192i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f200194k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f200191h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap<String, d> f200193j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f200195l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f200196m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0725b());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Callable<Void> f200197n = new a();

    public class a implements Callable<Void> {
        public a() {
        }

        public Void a() throws Exception {
            synchronized (b.this) {
                try {
                    b bVar = b.this;
                    if (bVar.f200192i == null) {
                        return null;
                    }
                    bVar.C1();
                    if (b.this.L0()) {
                        b.this.X0();
                        b.this.f200194k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
            a();
            return null;
        }
    }

    /* JADX INFO: renamed from: e3.b$b, reason: collision with other inner class name */
    public static final class ThreadFactoryC0725b implements ThreadFactory {
        public ThreadFactoryC0725b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public ThreadFactoryC0725b(a aVar) {
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f200199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f200200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f200201c;

        public /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            b.this.p(this, false);
        }

        public void b() {
            if (this.f200201c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.p(this, true);
            this.f200201c = true;
        }

        public File f(int i10) throws IOException {
            File file;
            synchronized (b.this) {
                try {
                    d dVar = this.f200199a;
                    if (dVar.f200208f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.f200207e) {
                        this.f200200b[i10] = true;
                    }
                    file = dVar.f200206d[i10];
                    b.this.f200184a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }

        public String g(int i10) throws IOException {
            InputStream inputStreamH = h(i10);
            if (inputStreamH != null) {
                return b.C0(inputStreamH);
            }
            return null;
        }

        public final InputStream h(int i10) throws IOException {
            synchronized (b.this) {
                d dVar = this.f200199a;
                if (dVar.f200208f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f200207e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f200199a.f200205c[i10]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void i(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i10)), e3.d.f200225b);
                try {
                    outputStreamWriter2.write(str);
                    e3.d.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    e3.d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public c(d dVar) {
            this.f200199a = dVar;
            this.f200200b = dVar.f200207e ? null : new boolean[b.this.f200190g];
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f200203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f200204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File[] f200205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File[] f200206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f200207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f200208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f200209g;

        public /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        public File j(int i10) {
            return this.f200205c[i10];
        }

        public File k(int i10) {
            return this.f200206d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f200204b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f200190g) {
                m(strArr);
                throw null;
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f200204b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    m(strArr);
                    throw null;
                }
            }
        }

        public d(String str) {
            this.f200203a = str;
            int i10 = b.this.f200190g;
            this.f200204b = new long[i10];
            this.f200205c = new File[i10];
            this.f200206d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < b.this.f200190g; i11++) {
                sb2.append(i11);
                this.f200205c[i11] = new File(b.this.f200184a, sb2.toString());
                sb2.append(".tmp");
                this.f200206d[i11] = new File(b.this.f200184a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f200211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f200212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f200213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f200214d;

        public /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.u(this.f200211a, this.f200212b);
        }

        public File b(int i10) {
            return this.f200214d[i10];
        }

        public long c(int i10) {
            return this.f200213c[i10];
        }

        public String d(int i10) throws IOException {
            return b.C0(new FileInputStream(this.f200214d[i10]));
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f200211a = str;
            this.f200212b = j10;
            this.f200214d = fileArr;
            this.f200213c = jArr;
        }
    }

    public b(File file, int i10, int i11, long j10) {
        this.f200184a = file;
        this.f200188e = i10;
        this.f200185b = new File(file, f200174o);
        this.f200186c = new File(file, f200175p);
        this.f200187d = new File(file, f200176q);
        this.f200190g = i11;
        this.f200189f = j10;
    }

    public static String C0(InputStream inputStream) throws IOException {
        return e3.d.c(new InputStreamReader(inputStream, e3.d.f200225b));
    }

    public static b N0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f200176q);
        if (file2.exists()) {
            File file3 = new File(file, f200174o);
            if (file3.exists()) {
                file2.delete();
            } else {
                h1(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f200185b.exists()) {
            try {
                bVar.Q0();
                bVar.O0();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.q();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.X0();
        return bVar2;
    }

    public static void h1(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            r(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void o(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void r(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void y(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public synchronized void B1(long j10) {
        this.f200189f = j10;
        this.f200196m.submit(this.f200197n);
    }

    public final void C1() throws IOException {
        while (this.f200191h > this.f200189f) {
            f1(this.f200193j.entrySet().iterator().next().getKey());
        }
    }

    public final boolean L0() {
        int i10 = this.f200194k;
        return i10 >= 2000 && i10 >= this.f200193j.size();
    }

    public final void O0() throws IOException {
        r(this.f200186c);
        Iterator<d> it = this.f200193j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f200208f == null) {
                while (i10 < this.f200190g) {
                    this.f200191h += next.f200204b[i10];
                    i10++;
                }
            } else {
                next.f200208f = null;
                while (i10 < this.f200190g) {
                    r(next.f200205c[i10]);
                    r(next.f200206d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public synchronized e P(String str) throws IOException {
        Throwable th;
        try {
            try {
                n();
                d dVar = this.f200193j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f200207e) {
                    return null;
                }
                for (File file : dVar.f200205c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f200194k++;
                this.f200192i.append((CharSequence) f200183x);
                this.f200192i.append(' ');
                this.f200192i.append((CharSequence) str);
                this.f200192i.append('\n');
                if (L0()) {
                    this.f200196m.submit(this.f200197n);
                }
                return new e(str, dVar.f200209g, dVar.f200205c, dVar.f200204b);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public final void Q0() throws IOException {
        e3.c cVar = new e3.c(new FileInputStream(this.f200185b), 8192, e3.d.f200224a);
        try {
            String strL = cVar.l();
            String strL2 = cVar.l();
            String strL3 = cVar.l();
            String strL4 = cVar.l();
            String strL5 = cVar.l();
            if (!f200177r.equals(strL) || !"1".equals(strL2) || !Integer.toString(this.f200188e).equals(strL3) || !Integer.toString(this.f200190g).equals(strL4) || !"".equals(strL5)) {
                throw new IOException("unexpected journal header: [" + strL + j.f68738d + strL2 + j.f68738d + strL4 + j.f68738d + strL5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    T0(cVar.l());
                    i10++;
                } catch (EOFException unused) {
                    this.f200194k = i10 - this.f200193j.size();
                    if (cVar.k()) {
                        X0();
                    } else {
                        this.f200192i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f200185b, true), e3.d.f200224a));
                    }
                    e3.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            e3.d.a(cVar);
            throw th;
        }
    }

    public final void T0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(f200182w)) {
                this.f200193j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f200193j.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            this.f200193j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f200180u)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(q.f17581a);
            dVar.f200207e = true;
            dVar.f200208f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f200181v)) {
            dVar.f200208f = new c(dVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(f200183x)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    public File U() {
        return this.f200184a;
    }

    public final synchronized void X0() throws IOException {
        try {
            Writer writer = this.f200192i;
            if (writer != null) {
                o(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f200186c), e3.d.f200224a));
            try {
                bufferedWriter.write(f200177r);
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f200188e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f200190g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f200193j.values()) {
                    if (dVar.f200208f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f200203a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f200203a + dVar.l() + '\n');
                    }
                }
                o(bufferedWriter);
                if (this.f200185b.exists()) {
                    h1(this.f200185b, this.f200187d, true);
                }
                h1(this.f200186c, this.f200185b, false);
                this.f200187d.delete();
                this.f200192i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f200185b, true), e3.d.f200224a));
            } catch (Throwable th) {
                o(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f200192i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f200193j.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c cVar = ((d) obj).f200208f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            C1();
            o(this.f200192i);
            this.f200192i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean f1(String str) throws IOException {
        try {
            n();
            d dVar = this.f200193j.get(str);
            if (dVar != null && dVar.f200208f == null) {
                for (int i10 = 0; i10 < this.f200190g; i10++) {
                    File file = dVar.f200205c[i10];
                    if (file.exists() && !file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                    long j10 = this.f200191h;
                    long[] jArr = dVar.f200204b;
                    this.f200191h = j10 - jArr[i10];
                    jArr[i10] = 0;
                }
                this.f200194k++;
                this.f200192i.append((CharSequence) f200182w);
                this.f200192i.append(' ');
                this.f200192i.append((CharSequence) str);
                this.f200192i.append('\n');
                this.f200193j.remove(str);
                if (L0()) {
                    this.f200196m.submit(this.f200197n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void flush() throws IOException {
        n();
        C1();
        y(this.f200192i);
    }

    public synchronized boolean isClosed() {
        return this.f200192i == null;
    }

    public final void n() {
        if (this.f200192i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void p(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f200199a;
        if (dVar.f200208f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f200207e) {
            for (int i10 = 0; i10 < this.f200190g; i10++) {
                if (!cVar.f200200b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.f200206d[i10].exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f200190g; i11++) {
            File file = dVar.f200206d[i11];
            if (!z10) {
                r(file);
            } else if (file.exists()) {
                File file2 = dVar.f200205c[i11];
                file.renameTo(file2);
                long j10 = dVar.f200204b[i11];
                long length = file2.length();
                dVar.f200204b[i11] = length;
                this.f200191h = (this.f200191h - j10) + length;
            }
        }
        this.f200194k++;
        dVar.f200208f = null;
        if (dVar.f200207e || z10) {
            dVar.f200207e = true;
            this.f200192i.append((CharSequence) f200180u);
            this.f200192i.append(' ');
            this.f200192i.append((CharSequence) dVar.f200203a);
            this.f200192i.append((CharSequence) dVar.l());
            this.f200192i.append('\n');
            if (z10) {
                long j11 = this.f200195l;
                this.f200195l = 1 + j11;
                dVar.f200209g = j11;
            }
        } else {
            this.f200193j.remove(dVar.f200203a);
            this.f200192i.append((CharSequence) f200182w);
            this.f200192i.append(' ');
            this.f200192i.append((CharSequence) dVar.f200203a);
            this.f200192i.append('\n');
        }
        y(this.f200192i);
        if (this.f200191h > this.f200189f || L0()) {
            this.f200196m.submit(this.f200197n);
        }
    }

    public void q() throws IOException {
        close();
        e3.d.b(this.f200184a);
    }

    public synchronized long r0() {
        return this.f200189f;
    }

    public c s(String str) throws IOException {
        return u(str, -1L);
    }

    public synchronized long size() {
        return this.f200191h;
    }

    public final synchronized c u(String str, long j10) throws IOException {
        n();
        d dVar = this.f200193j.get(str);
        if (j10 != -1 && (dVar == null || dVar.f200209g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(str);
            this.f200193j.put(str, dVar);
        } else if (dVar.f200208f != null) {
            return null;
        }
        c cVar = new c(dVar);
        dVar.f200208f = cVar;
        this.f200192i.append((CharSequence) f200181v);
        this.f200192i.append(' ');
        this.f200192i.append((CharSequence) str);
        this.f200192i.append('\n');
        y(this.f200192i);
        return cVar;
    }
}
