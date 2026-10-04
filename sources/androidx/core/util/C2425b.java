package androidx.core.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.core.util.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2425b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f111404d = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f111405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f111406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f111407c;

    public C2425b(@NonNull File file) {
        this.f111405a = file;
        this.f111406b = new File(file.getPath() + ".new");
        this.f111407c = new File(file.getPath() + ".bak");
    }

    public static void g(@NonNull File file, @NonNull File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f111404d, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(f111404d, "Failed to rename " + file + " to " + file2);
    }

    public static boolean i(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f111405a.delete();
        this.f111406b.delete();
        this.f111407c.delete();
    }

    public void b(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f111404d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e(f111404d, "Failed to close file output stream", e10);
        }
        if (this.f111406b.delete()) {
            return;
        }
        Log.e(f111404d, "Failed to delete new file " + this.f111406b);
    }

    public void c(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f111404d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e(f111404d, "Failed to close file output stream", e10);
        }
        g(this.f111406b, this.f111405a);
    }

    @NonNull
    public File d() {
        return this.f111405a;
    }

    @NonNull
    public FileInputStream e() throws FileNotFoundException {
        if (this.f111407c.exists()) {
            g(this.f111407c, this.f111405a);
        }
        if (this.f111406b.exists() && this.f111405a.exists() && !this.f111406b.delete()) {
            Log.e(f111404d, "Failed to delete outdated new file " + this.f111406b);
        }
        return new FileInputStream(this.f111405a);
    }

    @NonNull
    public byte[] f() throws IOException {
        FileInputStream fileInputStreamE = e();
        try {
            byte[] bArr = new byte[fileInputStreamE.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamE.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamE.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamE.close();
        }
    }

    @NonNull
    public FileOutputStream h() throws IOException {
        if (this.f111407c.exists()) {
            g(this.f111407c, this.f111405a);
        }
        try {
            return new FileOutputStream(this.f111406b);
        } catch (FileNotFoundException unused) {
            if (!this.f111406b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f111406b);
            }
            try {
                return new FileOutputStream(this.f111406b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f111406b, e10);
            }
        }
    }
}
