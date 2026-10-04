package com.prism.gaia.helper.utils;

import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class f implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f165120f = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f165121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f165122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f165123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f165124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<f> f165125e;

    public f(String str) throws FileNotFoundException {
        this(new File(str));
    }

    public void a(f fVar) {
        if (this.f165125e == null) {
            this.f165125e = new ArrayList<>();
        }
        this.f165125e.add(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f165121a.close();
        } catch (IOException unused) {
        }
        ArrayList<f> arrayList = this.f165125e;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                f fVar = arrayList.get(i10);
                i10++;
                fVar.close();
            }
        }
    }

    public FileChannel d() {
        return this.f165121a.getChannel();
    }

    public File k() {
        return this.f165122b;
    }

    public long l() throws IOException {
        return this.f165121a.length();
    }

    public int m() throws IOException {
        long filePointer = this.f165121a.getFilePointer();
        int i10 = readInt();
        this.f165121a.seek(filePointer);
        return i10;
    }

    public final int n(byte[] bArr) throws IOException {
        return this.f165121a.read(bArr);
    }

    public final int o(char[] cArr) throws IOException {
        byte[] bArr = new byte[cArr.length];
        int i10 = this.f165121a.read(bArr);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            cArr[i11] = (char) bArr[i11];
        }
        return i10;
    }

    public final void p(@NonNull int[] iArr) throws IOException {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = readInt();
        }
    }

    public long position() throws IOException {
        return this.f165121a.getFilePointer();
    }

    public final int q(byte[] bArr, int i10, int i11) throws IOException {
        return this.f165121a.read(bArr, i10, i11);
    }

    public void r(long j10) throws IOException {
        this.f165121a.seek(j10);
    }

    public final int readInt() throws IOException {
        int i10 = this.f165121a.readInt();
        if (!this.f165124d) {
            return i10;
        }
        return ((i10 & (-16777216)) >>> 24) | ((i10 & 255) << 24) | ((65280 & i10) << 8) | ((16711680 & i10) >>> 8);
    }

    public final long readLong() throws IOException {
        if (!this.f165124d) {
            return this.f165121a.readLong();
        }
        this.f165121a.readFully(this.f165123c, 0, 8);
        byte[] bArr = this.f165123c;
        return ((long) (bArr[0] & 255)) | (((long) bArr[7]) << 56) | (((long) (bArr[6] & 255)) << 48) | (((long) (bArr[5] & 255)) << 40) | (((long) (bArr[4] & 255)) << 32) | (((long) (bArr[3] & 255)) << 24) | (((long) (bArr[2] & 255)) << 16) | (((long) (bArr[1] & 255)) << 8);
    }

    public final short readShort() throws IOException {
        short s10 = this.f165121a.readShort();
        if (!this.f165124d) {
            return s10;
        }
        return (short) (((s10 & 65280) >>> 8) | ((s10 & 255) << 8));
    }

    public void s(boolean z10) {
        this.f165124d = z10;
    }

    public f(File file) throws FileNotFoundException {
        this.f165123c = new byte[8];
        this.f165124d = true;
        this.f165122b = file;
        this.f165121a = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
    }
}
