package com.prism.lib.pfs.file;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.file.FileType;
import com.prism.commons.interfaces.WalkCmd;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.compat.PfsCompatExtFile;
import com.prism.lib.pfs.exception.PfsIOException;
import com.prism.lib.pfs.file.PrivatePath;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.file.exchange.ExchangeFileEx;
import com.prism.lib.pfs.file.image.PrivateImage;
import com.prism.lib.pfs.file.video.PrivateVideo;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import l6.C5149a;
import o6.k;
import o6.l;

/* JADX INFO: loaded from: classes7.dex */
public class PrivateFile implements ExchangeFileEx, Parcelable {
    private FileType contentType;
    protected final PrivatePath privatePath;
    private static final String TAG = l0.b("PrivateFile");
    public static final Comparator<PrivateFile> MODIFIED_TIME_ASC = new com.prism.lib.pfs.file.b();
    public static final Comparator<PrivateFile> MODIFIED_TIME_DSC = new com.prism.lib.pfs.file.c();
    public static final Comparator<PrivateFile> NAME_ASC = new d();
    public static final Comparator<PrivateFile> NAME_DSC = new e();
    public static final Parcelable.Creator<PrivateFile> CREATOR = new b();

    public class a implements com.prism.lib.pfs.file.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.prism.lib.pfs.file.a f188857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f188858b;

        public a(com.prism.lib.pfs.file.a aVar, long j10) {
            this.f188857a = aVar;
            this.f188858b = j10;
        }

        @Override // com.prism.lib.pfs.file.a
        public FileDescriptor a() throws IOException {
            return this.f188857a.a();
        }

        @Override // com.prism.lib.pfs.file.a
        public void close() {
            this.f188857a.close();
        }

        @Override // com.prism.lib.pfs.file.a
        public long getOffset() {
            return this.f188858b;
        }
    }

    public class b implements Parcelable.Creator<PrivateFile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PrivateFile createFromParcel(Parcel parcel) {
            return new PrivateFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PrivateFile[] newArray(int i10) {
            return new PrivateFile[i10];
        }
    }

    public static class c {
        public static PrivateFile a(PrivateFileSystem privateFileSystem, String str) throws PfsIOException {
            return c(PrivatePath.c.a(privateFileSystem, str));
        }

        public static PrivateFile b(PrivateFile privateFile, String str) throws PfsIOException {
            return c(PrivatePath.c.b(privateFile.privatePath, str));
        }

        public static PrivateFile c(PrivatePath privatePath) {
            FileType fileTypeY = C3858w.y(privatePath.getUserPath());
            return fileTypeY == FileType.IMAGE ? new PrivateImage(privatePath) : (fileTypeY == FileType.VIDEO || fileTypeY == FileType.AUDIO) ? new PrivateVideo(privatePath) : new PrivateFile(privatePath);
        }

        public static PrivateFile d(PrivateFileSystem privateFileSystem, File file, String str) throws PfsIOException {
            return e(privateFileSystem, new File(file, str).getPath());
        }

        public static PrivateFile e(PrivateFileSystem privateFileSystem, String str) throws PfsIOException {
            return c(PrivatePath.c.d(privateFileSystem, str));
        }

        public static PrivateFile f(PrivateFileSystem privateFileSystem, String str, String str2) throws PfsIOException {
            return e(privateFileSystem, new File(str, str2).getPath());
        }

        public static PrivateFile g(PrivateFile privateFile, String str) throws PfsIOException {
            return c(PrivatePath.c.f(privateFile.privatePath, str));
        }

        public static PrivateFile h(PrivateFileSystem privateFileSystem) {
            return new PrivateFile(PrivatePath.c.g(privateFileSystem));
        }
    }

    private PfsCompatExtFile getPfsCompatExtFile() {
        return this.privatePath.getCompatExtFile();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFileEx
    public void adjustFilename(boolean z10) {
        this.privatePath.adjustPath(z10);
    }

    public PrivateFile asRoot() {
        return new PrivateFile(this.privatePath.asRoot());
    }

    public boolean createNewFile() throws PfsIOException {
        return getPfsCompatExtFile().sync(false).createNewFile();
    }

    public boolean delete() throws PfsIOException {
        return getPfsCompatExtFile().sync(false).delete();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean deleteQuietly() {
        try {
            return getPfsCompatExtFile().sync(false).delete();
        } catch (PfsIOException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void doExport(ExchangeFile exchangeFile, boolean z10) throws IOException {
        exchangeFile.writeFromInputStream(getInputStream(), false);
        if (z10) {
            return;
        }
        deleteQuietly();
    }

    public void doImport(ExchangeFile exchangeFile, boolean z10) throws IOException {
        mkParentDirs();
        this.privatePath.adjustPath(z10);
        if (writeFromInputStream(exchangeFile.getInputStream(), false)) {
            return;
        }
        deleteQuietly();
        throw new PfsIOException(7, "import failed");
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrivateFile) {
            return ((PrivateFile) obj).privatePath.equals(this.privatePath);
        }
        return false;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean exists() {
        return getPfsCompatExtFile().sync(false).exists();
    }

    public Context getAppContext() {
        return PrivateFileSystem.getAppContext();
    }

    public InputStream getDecryptedInputStream() throws IOException {
        return Xa.d.a(getPfsCompatExtFile().sync(false).getInputStream(), getFileEncryptType());
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public com.prism.lib.pfs.file.a getFileDescriptorProxy() throws IOException {
        return new a(getPfsCompatExtFile().sync(false).getFileDescriptorProxy(), Xa.d.c(this.privatePath.getPreferFileEncryptType()));
    }

    public int getFileEncryptType() {
        return this.privatePath.getPreferFileEncryptType();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getId() {
        return getPfsCompatExtFile().getId();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public InputStream getInputStream() throws IOException {
        return getDecryptedInputStream();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getName() {
        return getUserPathFilename();
    }

    public PrivateFile getParent() throws PfsIOException {
        return c.c(this.privatePath.getParent());
    }

    public PrivateFileSystem getPfs() {
        return this.privatePath.getPfs();
    }

    public long getPfsHeaderLength() {
        return Xa.d.c(this.privatePath.getPreferFileEncryptType());
    }

    public PrivatePath getPrivatePath() {
        return this.privatePath;
    }

    public String getRealPath() {
        return this.privatePath.getRealPath();
    }

    public String getRelativeFilename() {
        return new File(getRelativePath()).getName();
    }

    public String getRelativePath() {
        return this.privatePath.getRelativePath();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public FileType getType() {
        FileType fileTypeY = C3858w.y(getUserPath());
        FileType fileType = FileType.UNKNOWN;
        if (fileTypeY != fileType) {
            return fileTypeY;
        }
        FileType fileType2 = this.contentType;
        return fileType2 == null ? fileType : fileType2;
    }

    public String getUserPath() {
        return this.privatePath.getUserPath();
    }

    public String getUserPathFilename() {
        return new File(getUserPath()).getName();
    }

    public int hashCode() {
        return this.privatePath.hashCode();
    }

    public boolean isDirectory() {
        return getPfsCompatExtFile().sync(false).isDirectory();
    }

    public boolean isFile() {
        return !getPfsCompatExtFile().sync(false).isDirectory();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long lastModified() {
        return getPfsCompatExtFile().sync(false).lastModified();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long length() {
        return getPfsCompatExtFile().sync(false).length();
    }

    public List<PrivateFile> list() {
        List<PrivatePath> list = this.privatePath.list();
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<PrivatePath> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(c.c(it.next()));
        }
        return linkedList;
    }

    public void mkDirs() throws PfsIOException {
        getPfsCompatExtFile().sync(false).mkDirs();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFileEx
    public void mkParentDirs() throws PfsIOException {
        getPfsCompatExtFile().sync(false).mkParentDirs();
    }

    public boolean move(PrivateFile privateFile) {
        return this.privatePath.move(privateFile.privatePath);
    }

    public Parcel readToParcel() throws Throwable {
        InputStream inputStream;
        Throwable th;
        Parcel parcelObtain;
        try {
            inputStream = getInputStream();
            try {
                try {
                    byte[] bArrW = C3858w.W(inputStream);
                    parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArrW, 0, bArrW.length);
                        parcelObtain.setDataPosition(0);
                        C3858w.f(inputStream);
                        return parcelObtain;
                    } catch (IOException unused) {
                        if (parcelObtain != null) {
                            parcelObtain.recycle();
                        }
                        C3858w.f(inputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C3858w.f(inputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                parcelObtain = null;
            }
        } catch (IOException unused3) {
            inputStream = null;
            parcelObtain = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
            C3858w.f(inputStream);
            throw th;
        }
    }

    public boolean rename(String str) {
        return this.privatePath.rename(str);
    }

    public FileType resolveTypeByContent() {
        FileType fileType = this.contentType;
        if (fileType != null) {
            return fileType;
        }
        FileType fileTypeY = C3858w.y(getUserPath());
        FileType fileTypeA = FileType.UNKNOWN;
        if (fileTypeY != fileTypeA) {
            return fileTypeA;
        }
        try {
            InputStream decryptedInputStream = getDecryptedInputStream();
            try {
                byte[] bArr = new byte[16];
                int i10 = 0;
                while (i10 < 16) {
                    int i11 = decryptedInputStream.read(bArr, i10, 16 - i10);
                    if (i11 <= 0) {
                        break;
                    }
                    i10 += i11;
                }
                fileTypeA = C5149a.a(bArr, i10);
                if (decryptedInputStream != null) {
                    decryptedInputStream.close();
                }
            } finally {
            }
        } catch (IOException e10) {
            I.v(TAG, "sniff content type failed for %s: %s", getRealPath(), e10);
        }
        this.contentType = fileTypeA;
        return fileTypeA;
    }

    public PrivateFile sync(boolean z10) {
        getPfsCompatExtFile().sync(z10);
        return this;
    }

    @NonNull
    public String toString() {
        return this.privatePath.toString();
    }

    public boolean walk(final l<PrivateFile> lVar, @Nullable k kVar) {
        return this.privatePath.walk(new l() { // from class: com.prism.lib.pfs.file.f
            @Override // o6.l
            public final WalkCmd a(Object obj) {
                return lVar.a(new PrivateFile((PrivatePath) obj));
            }
        }, kVar);
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean writeFromInputStream(InputStream inputStream, boolean z10) throws IOException {
        return getPfsCompatExtFile().sync(false).writeFromInputStream(Xa.d.b(inputStream, getFileEncryptType()), z10);
    }

    public boolean writeFromParcel(Parcel parcel) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(parcel.marshall());
            try {
                boolean zWriteFromInputStream = writeFromInputStream(byteArrayInputStream2, false);
                C3858w.f(byteArrayInputStream2);
                return zWriteFromInputStream;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                C3858w.f(byteArrayInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.privatePath, i10);
    }

    public PrivateFile(PrivatePath privatePath) {
        this.privatePath = privatePath;
    }

    private PrivateFile(Parcel parcel) {
        this.privatePath = (PrivatePath) parcel.readParcelable(PrivatePath.class.getClassLoader());
    }
}
