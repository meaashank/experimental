package com.prism.lib.pfs.compat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.commons.file.FileType;
import com.prism.commons.interfaces.WalkCmd;
import com.prism.commons.utils.C3858w;
import com.prism.lib.pfs.exception.PfsIOException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import o6.l;

/* JADX INFO: loaded from: classes7.dex */
public class PfsCompatExtFileLegacy implements PfsCompatExtFile {
    public static final Parcelable.Creator<PfsCompatExtFileLegacy> CREATOR = new b();
    private final PfsCompatCoreLegacy pfsCompatCoreLegacy;
    private String relativePath;

    public class a implements com.prism.lib.pfs.file.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FileInputStream f183669a;

        public a(FileInputStream fileInputStream) {
            this.f183669a = fileInputStream;
        }

        @Override // com.prism.lib.pfs.file.a
        public FileDescriptor a() throws IOException {
            return this.f183669a.getFD();
        }

        @Override // com.prism.lib.pfs.file.a
        public void close() {
            C3858w.f(this.f183669a);
        }

        @Override // com.prism.lib.pfs.file.a
        public long getOffset() {
            return 0L;
        }
    }

    public class b implements Parcelable.Creator<PfsCompatExtFileLegacy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PfsCompatExtFileLegacy createFromParcel(Parcel parcel) {
            return new PfsCompatExtFileLegacy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PfsCompatExtFileLegacy[] newArray(int i10) {
            return new PfsCompatExtFileLegacy[i10];
        }
    }

    private void checkValid() throws PfsIOException {
        if (isInvalid()) {
            throw new PfsIOException(1, "PFS not mounted yet");
        }
    }

    private static String fmtRelativePath(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return File.separator;
        }
        String str2 = File.separator;
        return str.startsWith(str2) ? str : androidx.compose.runtime.changelist.j.a(str2, str);
    }

    private File getRealFile() {
        return new File(getRealPath());
    }

    private boolean isInvalid() {
        return !this.pfsCompatCoreLegacy.isMounted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WalkCmd lambda$walk$0(l lVar, File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            PfsCompatExtFileLegacy pfsCompatExtFileLegacy = new PfsCompatExtFileLegacy(this.pfsCompatCoreLegacy);
            pfsCompatExtFileLegacy.relativePath = canonicalPath.substring(this.pfsCompatCoreLegacy.getPfsResidePath().length());
            return lVar.a(pfsCompatExtFileLegacy);
        } catch (IOException unused) {
            throw new GaiaRuntimeException("system given file calc canonical path failed");
        }
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean createNewFile() throws PfsIOException {
        checkValid();
        File realFile = getRealFile();
        if (realFile.exists()) {
            if (realFile.isDirectory()) {
                throw new PfsIOException(3, android.support.v4.media.e.a(new StringBuilder("relative path("), this.relativePath, ") exist directory, createNewFile() failed"));
            }
            if (!C3858w.l(realFile)) {
                return false;
            }
        }
        try {
            return realFile.createNewFile();
        } catch (IOException e10) {
            throw new PfsIOException(3, e10);
        }
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean delete() throws PfsIOException {
        checkValid();
        return C3858w.m(getRealFile());
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean deleteQuietly() {
        if (isInvalid()) {
            return false;
        }
        return C3858w.m(getRealFile());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean existValidChild(boolean z10) {
        if (isInvalid()) {
            return false;
        }
        return C3858w.o(getRealFile(), z10);
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile, com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean exists() {
        return getRealFile().exists();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public com.prism.lib.pfs.file.a getFileDescriptorProxy() throws PfsIOException {
        checkValid();
        try {
            return new a(new FileInputStream(getRealFile()));
        } catch (IOException e10) {
            throw new PfsIOException(4, e10);
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getId() {
        return getRelativePath();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public InputStream getInputStream() throws PfsIOException {
        checkValid();
        try {
            return C3858w.E(getRealFile());
        } catch (IOException e10) {
            throw new PfsIOException(6, e10);
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getName() {
        return new File(this.relativePath).getName();
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public PfsCompatExtFile getParent() {
        if (this.relativePath.equals(File.separator)) {
            return null;
        }
        return new PfsCompatExtFileLegacy(this.pfsCompatCoreLegacy).refer(new File(this.relativePath).getParent());
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public String getRealPath() {
        return this.pfsCompatCoreLegacy.getPfsResidePath() + this.relativePath;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public String getRelativePath() {
        return this.relativePath;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public FileType getType() {
        return C3858w.y(getName());
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean isDirectory() {
        return getRealFile().isDirectory();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long lastModified() {
        try {
            return getRealFile().lastModified();
        } catch (SecurityException unused) {
            return 0L;
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long length() {
        try {
            return getRealFile().length();
        } catch (SecurityException unused) {
            return 0L;
        }
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public List<PfsCompatExtFile> list() {
        File[] fileArrListFiles;
        if (isInvalid()) {
            return null;
        }
        File realFile = getRealFile();
        if (!realFile.isDirectory() || (fileArrListFiles = realFile.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(new PfsCompatExtFileLegacy(this.pfsCompatCoreLegacy).refer(this.relativePath + File.separator + file.getName()));
        }
        return arrayList;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public void mkDirs() throws PfsIOException {
        checkValid();
        try {
            C3858w.J(getRealFile());
        } catch (IOException e10) {
            throw new PfsIOException(3, e10);
        }
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public void mkParentDirs() throws PfsIOException {
        checkValid();
        try {
            C3858w.L(getRealFile());
        } catch (IOException e10) {
            throw new PfsIOException(3, e10);
        }
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean move(PfsCompatExtFile pfsCompatExtFile) {
        if (isInvalid() || !(pfsCompatExtFile instanceof PfsCompatExtFileLegacy)) {
            return false;
        }
        PfsCompatExtFileLegacy pfsCompatExtFileLegacy = (PfsCompatExtFileLegacy) pfsCompatExtFile;
        if (pfsCompatExtFileLegacy.isInvalid()) {
            return false;
        }
        PfsCompatExtFileLegacy pfsCompatExtFileLegacyRefer = new PfsCompatExtFileLegacy(this.pfsCompatCoreLegacy).refer(pfsCompatExtFileLegacy.relativePath + File.separator + getName());
        try {
            if (C3858w.O(getRealPath(), pfsCompatExtFileLegacyRefer.getRealPath())) {
                this.relativePath = pfsCompatExtFileLegacyRefer.relativePath;
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean rename(String str) {
        if (isInvalid() || getParent() == null) {
            return false;
        }
        PfsCompatExtFileLegacy pfsCompatExtFileLegacyRefer = new PfsCompatExtFileLegacy(this.pfsCompatCoreLegacy).refer(new File(this.relativePath).getParent() + File.separator + str);
        if (!getRealFile().renameTo(pfsCompatExtFileLegacyRefer.getRealFile())) {
            return false;
        }
        this.relativePath = pfsCompatExtFileLegacyRefer.relativePath;
        return true;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean rmEmptySubDirs() {
        if (isInvalid()) {
            return false;
        }
        return C3858w.S(getRealFile());
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public PfsCompatExtFile sync(boolean z10) {
        return this;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public boolean walk(final l<PfsCompatExtFile> lVar, @Nullable o6.k kVar) {
        if (isInvalid()) {
            return true;
        }
        return C3858w.X(getRealFile(), new l() { // from class: com.prism.lib.pfs.compat.h
            @Override // o6.l
            public final WalkCmd a(Object obj) {
                return this.f183690a.lambda$walk$0(lVar, (File) obj);
            }
        }, kVar);
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean writeFromInputStream(InputStream inputStream, boolean z10) throws PfsIOException {
        checkValid();
        try {
            return C3858w.Z(getRealFile(), inputStream, z10);
        } catch (IOException e10) {
            throw new PfsIOException(7, e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.pfsCompatCoreLegacy, i10);
        parcel.writeString(this.relativePath);
    }

    public PfsCompatExtFileLegacy(PfsCompatCoreLegacy pfsCompatCoreLegacy) {
        this.pfsCompatCoreLegacy = pfsCompatCoreLegacy;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatExtFile
    public PfsCompatExtFileLegacy refer(String str) {
        this.relativePath = fmtRelativePath(str);
        return this;
    }

    private PfsCompatExtFileLegacy(Parcel parcel) {
        this.pfsCompatCoreLegacy = (PfsCompatCoreLegacy) parcel.readParcelable(PfsCompatCoreLegacy.class.getClassLoader());
        this.relativePath = parcel.readString();
    }
}
