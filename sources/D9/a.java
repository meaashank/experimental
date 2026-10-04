package D9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f22984c = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f22985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f22986b;

    public a(File file) {
        this.f22985a = file;
        this.f22986b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f22985a.delete();
        this.f22986b.delete();
    }

    public boolean b() {
        return this.f22985a.exists() || this.f22986b.exists();
    }

    public void c(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            com.prism.gaia.helper.utils.l.Y(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f22985a.delete();
                this.f22986b.renameTo(this.f22985a);
            } catch (IOException unused) {
            }
        }
    }

    public void d(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            com.prism.gaia.helper.utils.l.Y(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f22986b.delete();
            } catch (IOException unused) {
            }
        }
    }

    public File e() {
        return this.f22985a;
    }

    public FileOutputStream f() throws IOException {
        try {
            return new FileOutputStream(this.f22985a, true);
        } catch (FileNotFoundException unused) {
            throw new IOException("Couldn't append " + this.f22985a);
        }
    }

    public FileInputStream g() throws FileNotFoundException {
        if (this.f22986b.exists()) {
            this.f22985a.delete();
            this.f22986b.renameTo(this.f22985a);
        }
        return new FileInputStream(this.f22985a);
    }

    public byte[] h() throws IOException {
        FileInputStream fileInputStreamG = g();
        try {
            byte[] bArr = new byte[fileInputStreamG.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamG.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamG.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamG.close();
        }
    }

    public FileOutputStream i() throws IOException {
        if (this.f22985a.exists()) {
            if (this.f22986b.exists()) {
                this.f22985a.delete();
            } else if (!this.f22985a.renameTo(this.f22986b)) {
                Objects.toString(this.f22985a);
                Objects.toString(this.f22986b);
            }
        }
        try {
            return new FileOutputStream(this.f22985a);
        } catch (FileNotFoundException unused) {
            File parentFile = this.f22985a.getParentFile();
            if (!parentFile.mkdir()) {
                throw new IOException("Couldn't create directory " + this.f22985a);
            }
            try {
                com.prism.gaia.helper.utils.l.e(parentFile.getPath(), 505);
                try {
                    return new FileOutputStream(this.f22985a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f22985a);
                }
            } catch (Exception unused3) {
                throw new IOException("Couldn't chmod directory " + parentFile.getAbsolutePath());
            }
        }
    }

    public void j() throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f22985a);
            com.prism.gaia.helper.utils.l.Y(fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException unused) {
            throw new IOException("Couldn't append " + this.f22985a);
        } catch (IOException unused2) {
        }
    }
}
