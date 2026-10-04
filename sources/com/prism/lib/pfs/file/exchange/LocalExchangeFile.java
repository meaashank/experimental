package com.prism.lib.pfs.file.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.C3858w;
import com.prism.lib.pfs.exception.PfsIOException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class LocalExchangeFile implements ExchangeFile {
    public static final Parcelable.Creator<LocalExchangeFile> CREATOR = new b();
    private final File localFile;

    public class a implements com.prism.lib.pfs.file.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FileInputStream f188861a;

        public a(FileInputStream fileInputStream) {
            this.f188861a = fileInputStream;
        }

        @Override // com.prism.lib.pfs.file.a
        public FileDescriptor a() throws IOException {
            return this.f188861a.getFD();
        }

        @Override // com.prism.lib.pfs.file.a
        public void close() {
            C3858w.f(this.f188861a);
        }

        @Override // com.prism.lib.pfs.file.a
        public long getOffset() {
            return 0L;
        }
    }

    public class b implements Parcelable.Creator<LocalExchangeFile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LocalExchangeFile createFromParcel(Parcel parcel) {
            return new LocalExchangeFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public LocalExchangeFile[] newArray(int i10) {
            return new LocalExchangeFile[i10];
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean deleteQuietly() {
        return C3858w.m(this.localFile);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.localFile.equals(((LocalExchangeFile) obj).localFile);
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean exists() {
        return this.localFile.exists();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public com.prism.lib.pfs.file.a getFileDescriptorProxy() throws IOException {
        try {
            return new a(new FileInputStream(this.localFile));
        } catch (IOException e10) {
            throw new PfsIOException(4, e10);
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getId() {
        return this.localFile.getAbsolutePath();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public InputStream getInputStream() throws IOException {
        return C3858w.E(this.localFile);
    }

    public File getLocalFile() {
        return this.localFile;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getName() {
        return this.localFile.getName();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public FileType getType() {
        return C3858w.y(getName());
    }

    public int hashCode() {
        return this.localFile.hashCode();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long lastModified() {
        return this.localFile.lastModified();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long length() {
        return this.localFile.length();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean writeFromInputStream(InputStream inputStream, boolean z10) throws IOException {
        return C3858w.Z(this.localFile, inputStream, z10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.localFile.getAbsolutePath());
    }

    public LocalExchangeFile(String str) {
        this.localFile = new File(str);
    }

    public LocalExchangeFile(File file) {
        this.localFile = file;
    }

    private LocalExchangeFile(Parcel parcel) {
        this.localFile = new File(parcel.readString());
    }
}
