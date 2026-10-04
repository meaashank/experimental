package com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu;

import C4.q;
import U6.j;
import android.support.v4.media.a;
import android.support.v4.media.i;
import android.util.Log;
import com.android.launcher3.IconCache;
import e3.b;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ZRu implements Closeable {
    static final Pattern ZRu = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream mZ = new OutputStream() { // from class: com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };
    private final int FA;
    private final File Ht;
    private final File Mm;
    final ExecutorService NOt;
    private final File TFq;
    private long Vor;
    private final int aT;
    private int edo;
    private Writer lp;
    private final File uR;
    private long ZH = 0;
    private final LinkedHashMap<String, NOt> sAl = new LinkedHashMap<>(0, 0.75f, true);
    private long oK = -1;
    private long yBV = 0;
    private final Callable<Void> WMI = new Callable<Void>() { // from class: com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (ZRu.this) {
                try {
                    if (ZRu.this.lp == null) {
                        return null;
                    }
                    ZRu.this.FA();
                    if (ZRu.this.Ht()) {
                        ZRu.this.TFq();
                        ZRu.this.edo = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public final class NOt {
        private long Ht;
        private final String NOt;
        private C0411ZRu TFq;
        private final long[] mZ;
        private boolean uR;

        private NOt(String str) {
            this.NOt = str;
            this.mZ = new long[ZRu.this.aT];
        }

        private IOException NOt(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File NOt(int i10) {
            return new File(ZRu.this.uR, this.NOt + IconCache.EMPTY_CLASS_NAME + i10 + ".tmp");
        }

        public String ZRu() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.mZ) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ZRu(String[] strArr) throws IOException {
            if (strArr.length == ZRu.this.aT) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.mZ[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw NOt(strArr);
                    }
                }
                return;
            }
            throw NOt(strArr);
        }

        public File ZRu(int i10) {
            return new File(ZRu.this.uR, this.NOt + IconCache.EMPTY_CLASS_NAME + i10);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public final class C0411ZRu {
        private final NOt NOt;
        private boolean TFq;
        private final boolean[] mZ;
        private boolean uR;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu$ZRu$ZRu, reason: collision with other inner class name */
        public class C0412ZRu extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0411ZRu.this.uR = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0411ZRu.this.uR = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0411ZRu.this.uR = true;
                }
            }

            private C0412ZRu(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0411ZRu.this.uR = true;
                }
            }
        }

        private C0411ZRu(NOt nOt) {
            this.NOt = nOt;
            this.mZ = nOt.uR ? null : new boolean[ZRu.this.aT];
        }

        public void NOt() throws IOException {
            ZRu.this.ZRu(this, false);
        }

        public OutputStream ZRu(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0412ZRu c0412ZRu;
            if (i10 >= 0 && i10 < ZRu.this.aT) {
                synchronized (ZRu.this) {
                    try {
                        if (this.NOt.TFq == this) {
                            if (!this.NOt.uR) {
                                this.mZ[i10] = true;
                            }
                            File fileNOt = this.NOt.NOt(i10);
                            try {
                                fileOutputStream = new FileOutputStream(fileNOt);
                            } catch (FileNotFoundException unused) {
                                ZRu.this.uR.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileNOt);
                                } catch (FileNotFoundException unused2) {
                                    return ZRu.mZ;
                                }
                            }
                            c0412ZRu = new C0412ZRu(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c0412ZRu;
            }
            StringBuilder sbA = a.a("Expected index ", i10, " to be greater than 0 and less than the maximum value count of ");
            sbA.append(ZRu.this.aT);
            throw new IllegalArgumentException(sbA.toString());
        }

        public void ZRu() throws IOException {
            if (this.uR) {
                ZRu.this.ZRu(this, false);
                ZRu.this.mZ(this.NOt.NOt);
            } else {
                ZRu.this.ZRu(this, true);
            }
            this.TFq = true;
        }
    }

    public final class mZ implements Closeable {
        private final String NOt;
        private final long[] TFq;
        private final long mZ;
        private final InputStream[] uR;

        public InputStream ZRu(int i10) {
            return this.uR[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.uR) {
                com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(inputStream);
            }
        }

        private mZ(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.NOt = str;
            this.mZ = j10;
            this.uR = inputStreamArr;
            this.TFq = jArr;
        }
    }

    private ZRu(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.uR = file;
        this.FA = i10;
        this.TFq = new File(file, b.f200174o);
        this.Ht = new File(file, b.f200175p);
        this.Mm = new File(file, b.f200176q);
        this.aT = i11;
        this.Vor = j10;
        this.NOt = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FA() throws IOException {
        long j10 = this.Vor;
        long j11 = this.oK;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.ZH > j10) {
            mZ(this.sAl.entrySet().iterator().next().getKey());
        }
        this.oK = -1L;
    }

    private void Mm() {
        if (this.lp == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.lp == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.sAl.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                NOt nOt = (NOt) obj;
                if (nOt.TFq != null) {
                    nOt.TFq.NOt();
                }
            }
            FA();
            this.lp.close();
            this.lp = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Ht() {
        int i10 = this.edo;
        return i10 >= 2000 && i10 >= this.sAl.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void TFq() throws IOException {
        try {
            Writer writer = this.lp;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Ht), uR.ZRu));
            try {
                bufferedWriter.write(b.f200177r);
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.FA));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.aT));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (NOt nOt : this.sAl.values()) {
                    if (nOt.TFq != null) {
                        bufferedWriter.write("DIRTY " + nOt.NOt + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + nOt.NOt + nOt.ZRu() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.TFq.exists()) {
                    ZRu(this.TFq, this.Mm, true);
                }
                ZRu(this.Ht, this.TFq, false);
                this.Mm.delete();
                this.lp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.TFq, true), uR.ZRu));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void mZ() throws IOException {
        com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.mZ mZVar = new com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.mZ(new FileInputStream(this.TFq), uR.ZRu);
        try {
            String strZRu = mZVar.ZRu();
            String strZRu2 = mZVar.ZRu();
            String strZRu3 = mZVar.ZRu();
            String strZRu4 = mZVar.ZRu();
            String strZRu5 = mZVar.ZRu();
            if (!b.f200177r.equals(strZRu) || !"1".equals(strZRu2) || !Integer.toString(this.FA).equals(strZRu3) || !Integer.toString(this.aT).equals(strZRu4) || !"".equals(strZRu5)) {
                throw new IOException("unexpected journal header: [" + strZRu + j.f68738d + strZRu2 + j.f68738d + strZRu4 + j.f68738d + strZRu5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    uR(mZVar.ZRu());
                    i10++;
                } catch (EOFException unused) {
                    this.edo = i10 - this.sAl.size();
                    if (mZVar.NOt()) {
                        TFq();
                    } else {
                        this.lp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.TFq, true), uR.ZRu));
                    }
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(mZVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(mZVar);
            throw th;
        }
    }

    private void uR(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(b.f200182w)) {
                this.sAl.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        NOt nOt = this.sAl.get(strSubstring);
        if (nOt == null) {
            nOt = new NOt(strSubstring);
            this.sAl.put(strSubstring, nOt);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(b.f200180u)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(q.f17581a);
            nOt.uR = true;
            nOt.TFq = null;
            nOt.ZRu(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(b.f200181v)) {
            nOt.TFq = new C0411ZRu(nOt);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(b.f200183x)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    public C0411ZRu NOt(String str) throws IOException {
        return ZRu(str, -1L);
    }

    public void NOt() throws IOException {
        close();
        uR.ZRu(this.uR);
    }

    public static ZRu ZRu(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, b.f200176q);
            if (file2.exists()) {
                File file3 = new File(file, b.f200174o);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    ZRu(file2, file3, false);
                }
            }
            ZRu zRu = new ZRu(file, i10, i11, j10, executorService);
            if (zRu.TFq.exists()) {
                try {
                    zRu.mZ();
                    zRu.uR();
                    return zRu;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    zRu.NOt();
                }
            }
            file.mkdirs();
            ZRu zRu2 = new ZRu(file, i10, i11, j10, executorService);
            zRu2.TFq();
            return zRu2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean mZ(String str) throws IOException {
        try {
            Mm();
            TFq(str);
            NOt nOt = this.sAl.get(str);
            if (nOt != null && nOt.TFq == null) {
                for (int i10 = 0; i10 < this.aT; i10++) {
                    File fileZRu = nOt.ZRu(i10);
                    if (fileZRu.exists() && !fileZRu.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileZRu)));
                    }
                    this.ZH -= nOt.mZ[i10];
                    nOt.mZ[i10] = 0;
                }
                this.edo++;
                this.lp.append((CharSequence) ("REMOVE " + str + '\n'));
                this.sAl.remove(str);
                if (Ht()) {
                    this.NOt.submit(this.WMI);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    private void uR() throws IOException {
        ZRu(this.Ht);
        Iterator<NOt> it = this.sAl.values().iterator();
        while (it.hasNext()) {
            NOt next = it.next();
            int i10 = 0;
            if (next.TFq != null) {
                next.TFq = null;
                while (i10 < this.aT) {
                    ZRu(next.ZRu(i10));
                    ZRu(next.NOt(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.aT) {
                    this.ZH += next.mZ[i10];
                    i10++;
                }
            }
        }
    }

    private static void ZRu(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void ZRu(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            ZRu(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void TFq(String str) {
        if (!ZRu.matcher(str).matches()) {
            throw new IllegalArgumentException(i.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized mZ ZRu(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        try {
            Mm();
            TFq(str);
            NOt nOt = this.sAl.get(str);
            if (nOt == null) {
                return null;
            }
            if (!nOt.uR) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.aT];
            for (int i10 = 0; i10 < this.aT; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(nOt.ZRu(i10));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.aT && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            }
            this.edo++;
            this.lp.append((CharSequence) ("READ " + str + '\n'));
            if (Ht()) {
                this.NOt.submit(this.WMI);
            }
            return new mZ(str, nOt.Ht, inputStreamArr, nOt.mZ);
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    private synchronized C0411ZRu ZRu(String str, long j10) throws IOException {
        Mm();
        TFq(str);
        NOt nOt = this.sAl.get(str);
        if (j10 != -1 && (nOt == null || nOt.Ht != j10)) {
            return null;
        }
        if (nOt != null) {
            if (nOt.TFq != null) {
                return null;
            }
        } else {
            nOt = new NOt(str);
            this.sAl.put(str, nOt);
        }
        C0411ZRu c0411ZRu = new C0411ZRu(nOt);
        nOt.TFq = c0411ZRu;
        this.lp.write("DIRTY " + str + '\n');
        this.lp.flush();
        return c0411ZRu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ZRu(C0411ZRu c0411ZRu, boolean z10) throws IOException {
        NOt nOt = c0411ZRu.NOt;
        if (nOt.TFq == c0411ZRu) {
            if (z10 && !nOt.uR) {
                for (int i10 = 0; i10 < this.aT; i10++) {
                    if (c0411ZRu.mZ[i10]) {
                        if (!nOt.NOt(i10).exists()) {
                            c0411ZRu.NOt();
                            return;
                        }
                    } else {
                        c0411ZRu.NOt();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.aT; i11++) {
                File fileNOt = nOt.NOt(i11);
                if (z10) {
                    if (fileNOt.exists()) {
                        File fileZRu = nOt.ZRu(i11);
                        fileNOt.renameTo(fileZRu);
                        long j10 = nOt.mZ[i11];
                        long length = fileZRu.length();
                        nOt.mZ[i11] = length;
                        this.ZH = (this.ZH - j10) + length;
                    }
                } else {
                    ZRu(fileNOt);
                }
            }
            this.edo++;
            nOt.TFq = null;
            if (!(nOt.uR | z10)) {
                this.sAl.remove(nOt.NOt);
                this.lp.write("REMOVE " + nOt.NOt + '\n');
            } else {
                nOt.uR = true;
                this.lp.write("CLEAN " + nOt.NOt + nOt.ZRu() + '\n');
                if (z10) {
                    long j11 = this.yBV;
                    this.yBV = 1 + j11;
                    nOt.Ht = j11;
                }
            }
            this.lp.flush();
            if (this.ZH > this.Vor || Ht()) {
                this.NOt.submit(this.WMI);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void ZRu() throws IOException {
        Mm();
        FA();
        this.lp.flush();
    }
}
