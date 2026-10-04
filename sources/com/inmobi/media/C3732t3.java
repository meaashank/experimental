package com.inmobi.media;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3732t3 implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f153379p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C3663o3 f153380q = new C3663o3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f153381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f153382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f153383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f153384d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f153386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gd f153387g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BufferedWriter f153390j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f153392l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f153389i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f153391k = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f153393m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f153394n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CallableC3649n3 f153395o = new CallableC3649n3(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f153385e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f153388h = 2;

    public C3732t3(File file, long j10, gd gdVar) {
        this.f153381a = file;
        this.f153382b = new File(file, e3.b.f200174o);
        this.f153383c = new File(file, e3.b.f200175p);
        this.f153384d = new File(file, e3.b.f200176q);
        this.f153386f = j10;
        this.f153387g = gdVar;
    }

    public static void a(C3732t3 c3732t3, C3691q3 c3691q3, boolean z10) {
        synchronized (c3732t3) {
            C3704r3 c3704r3 = c3691q3.f153289a;
            if (c3704r3.f153307d != c3691q3) {
                throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
            }
            if (z10 && !c3704r3.f153306c) {
                for (int i10 = 0; i10 < c3732t3.f153388h; i10++) {
                    if (!c3691q3.f153290b[i10]) {
                        a(c3691q3.f153292d, c3691q3, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!c3704r3.b(i10).exists()) {
                        a(c3691q3.f153292d, c3691q3, false);
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < c3732t3.f153388h; i11++) {
                File fileB = c3704r3.b(i11);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = c3704r3.a(i11);
                        fileB.renameTo(fileA);
                        long j10 = c3704r3.f153305b[i11];
                        long length = fileA.length();
                        c3704r3.f153305b[i11] = length;
                        c3732t3.f153389i = (c3732t3.f153389i - j10) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            c3732t3.f153392l++;
            c3704r3.f153307d = null;
            if (c3704r3.f153306c || z10) {
                c3704r3.f153306c = true;
                BufferedWriter bufferedWriter = c3732t3.f153390j;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(c3704r3.f153304a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : c3704r3.f153305b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    c3732t3.f153393m++;
                }
            } else {
                c3732t3.f153391k.remove(c3704r3.f153304a);
                c3732t3.f153390j.write("REMOVE " + c3704r3.f153304a + '\n');
            }
            c3732t3.f153390j.flush();
            if (c3732t3.f153389i > c3732t3.f153386f || c3732t3.a()) {
                c3732t3.f153394n.submit(c3732t3.f153395o);
            }
        }
    }

    public final void b() throws IOException {
        File file = this.f153383c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f153391k.values().iterator();
        while (it.hasNext()) {
            C3704r3 c3704r3 = (C3704r3) it.next();
            int i10 = 0;
            if (c3704r3.f153307d == null) {
                while (i10 < this.f153388h) {
                    this.f153389i += c3704r3.f153305b[i10];
                    i10++;
                }
            } else {
                c3704r3.f153307d = null;
                while (i10 < this.f153388h) {
                    File fileA = c3704r3.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = c3704r3.b(i10);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        Bb bb2 = new Bb(new FileInputStream(this.f153382b), Bc.f151810a);
        try {
            String strA = bb2.a();
            String strA2 = bb2.a();
            String strA3 = bb2.a();
            String strA4 = bb2.a();
            String strA5 = bb2.a();
            if (!e3.b.f200177r.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f153385e).equals(strA3) || !Integer.toString(this.f153388h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + U6.j.f68738d + strA2 + U6.j.f68738d + strA4 + U6.j.f68738d + strA5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(bb2.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f153392l = i10 - this.f153391k.size();
                    Bc.a(bb2);
                    return;
                }
            }
        } catch (Throwable th) {
            Bc.a(bb2);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f153390j == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f153391k.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C3691q3 c3691q3 = ((C3704r3) obj).f153307d;
                if (c3691q3 != null) {
                    a(c3691q3.f153292d, c3691q3, false);
                }
            }
            while (this.f153389i > this.f153386f) {
                d((String) ((Map.Entry) this.f153391k.entrySet().iterator().next()).getKey());
            }
            this.f153390j.close();
            this.f153390j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.f153390j;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f153383c), Bc.f151810a));
            try {
                bufferedWriter2.write(e3.b.f200177r);
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f153385e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f153388h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C3704r3 c3704r3 : this.f153391k.values()) {
                    if (c3704r3.f153307d != null) {
                        bufferedWriter2.write("DIRTY " + c3704r3.f153304a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(c3704r3.f153304a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : c3704r3.f153305b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f153382b.exists()) {
                    File file = this.f153382b;
                    File file2 = this.f153384d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f153383c.renameTo(this.f153382b)) {
                    throw new IOException();
                }
                this.f153384d.delete();
                this.f153390j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f153382b, true), Bc.f151810a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith(e3.b.f200182w)) {
                    this.f153391k.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            C3704r3 c3704r3 = (C3704r3) this.f153391k.get(strSubstring);
            if (c3704r3 == null) {
                c3704r3 = new C3704r3(this, strSubstring);
                this.f153391k.put(strSubstring, c3704r3);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(e3.b.f200180u)) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(C4.q.f17581a);
                c3704r3.f153306c = true;
                c3704r3.f153307d = null;
                if (strArrSplit.length == c3704r3.f153308e.f153388h) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            c3704r3.f153305b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(e3.b.f200181v)) {
                c3704r3.f153307d = new C3691q3(this, c3704r3);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(e3.b.f200183x)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized C3718s3 b(String key) {
        InputStream inputStream;
        if (this.f153390j != null) {
            if (f153379p.matcher(key).matches()) {
                C3704r3 c3704r3 = (C3704r3) this.f153391k.get(key);
                if (c3704r3 == null) {
                    return null;
                }
                if (!c3704r3.f153306c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f153388h];
                for (int i10 = 0; i10 < this.f153388h; i10++) {
                    try {
                        inputStreamArr[i10] = new FileInputStream(c3704r3.a(i10));
                    } catch (FileNotFoundException unused) {
                        if (this.f153387g != null) {
                            kotlin.jvm.internal.G.p(key, "key");
                            Map mapJ0 = kotlin.collections.n0.j0(new Pair("urlKey", key));
                            Lb lb2 = Lb.f152196a;
                            Lb.b("ResourceDiskCacheFileMissing", mapJ0, Qb.f152402a);
                        }
                        for (int i11 = 0; i11 < this.f153388h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            Bc.a(inputStream);
                        }
                        return null;
                    }
                }
                this.f153392l++;
                this.f153390j.append((CharSequence) ("READ " + key + '\n'));
                if (a()) {
                    this.f153394n.submit(this.f153395o);
                }
                return new C3718s3(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void d(String str) {
        if (this.f153390j != null) {
            if (f153379p.matcher(str).matches()) {
                C3704r3 c3704r3 = (C3704r3) this.f153391k.get(str);
                if (c3704r3 != null && c3704r3.f153307d == null) {
                    for (int i10 = 0; i10 < this.f153388h; i10++) {
                        File file = c3704r3.a(i10);
                        if (this.f153387g != null) {
                            kotlin.jvm.internal.G.p(file, "file");
                            if (str != null && i10 == 0) {
                                String str2 = "";
                                try {
                                    String strA = Bc.a(new InputStreamReader(new FileInputStream(file), Bc.f151811b));
                                    kotlin.jvm.internal.G.o(strA, "readFully(...)");
                                    str2 = strA;
                                } catch (Exception unused) {
                                }
                                Map mapJ0 = kotlin.collections.n0.j0(new Pair("urlKey", str), new Pair("url", str2));
                                Lb lb2 = Lb.f152196a;
                                Lb.b("ResourceDiskCacheFileEvicted", mapJ0, Qb.f152402a);
                            }
                        }
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j10 = this.f153389i;
                        long[] jArr = c3704r3.f153305b;
                        this.f153389i = j10 - jArr[i10];
                        jArr[i10] = 0;
                    }
                    this.f153392l++;
                    this.f153390j.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f153391k.remove(str);
                    if (a()) {
                        this.f153394n.submit(this.f153395o);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final C3691q3 a(String str) {
        synchronized (this) {
            try {
                if (this.f153390j != null) {
                    if (f153379p.matcher(str).matches()) {
                        C3704r3 c3704r3 = (C3704r3) this.f153391k.get(str);
                        if (c3704r3 == null) {
                            c3704r3 = new C3704r3(this, str);
                            this.f153391k.put(str, c3704r3);
                        } else if (c3704r3.f153307d != null) {
                            return null;
                        }
                        C3691q3 c3691q3 = new C3691q3(this, c3704r3);
                        c3704r3.f153307d = c3691q3;
                        this.f153390j.write("DIRTY " + str + '\n');
                        this.f153390j.flush();
                        return c3691q3;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        int i10 = this.f153392l;
        return i10 >= 2000 && i10 >= this.f153391k.size();
    }
}
