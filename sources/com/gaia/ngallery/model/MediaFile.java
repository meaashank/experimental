package com.gaia.ngallery.model;

import N4.d;
import P4.b;
import T4.e;
import T4.f;
import T4.g;
import T4.h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCacheKt;
import androidx.compose.animation.C1636p;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.file.exchange.ExchangeFileWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class MediaFile implements Comparable<MediaFile>, ExchangeFileWrapper {
    public static final int FLAG_ROTATE_CW180 = 2;
    public static final int FLAG_ROTATE_CW270 = 3;
    public static final int FLAG_ROTATE_CW90 = 1;
    public static final int FLAG_ROTATE_NONE = 0;
    private static final int MASK_ROTATION = 3;
    private WeakReference<b> albumArchiveWeakRef;
    private final ExchangeFile file;
    private byte fileFlags;
    private boolean isChecked;
    private boolean isEnable;
    private static final String TAG = l0.b("MediaFile");
    public static final Comparator<MediaFile> NAME_ASC = new e();
    public static final Comparator<MediaFile> NAME_DSC = new f();
    public static final Comparator<MediaFile> MODIFY_TIME_ASC = new g();
    public static final Comparator<MediaFile> MODIFY_TIME_DSC = new h();
    public static final Parcelable.Creator<MediaFile> CREATOR = new a();

    public class a implements Parcelable.Creator<MediaFile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MediaFile createFromParcel(Parcel parcel) {
            return new MediaFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public MediaFile[] newArray(int i10) {
            return new MediaFile[i10];
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean deleteQuietly() {
        return this.file.deleteQuietly();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaFile)) {
            return false;
        }
        MediaFile mediaFile = (MediaFile) obj;
        return getRotation() == mediaFile.getRotation() && this.file.equals(mediaFile.file);
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean exists() {
        return this.file.exists();
    }

    @Nullable
    public T4.a getAlbum() {
        b albumArchive = getAlbumArchive();
        if (albumArchive == null) {
            return null;
        }
        return albumArchive.f();
    }

    @Nullable
    public b getAlbumArchive() {
        WeakReference<b> weakReference = this.albumArchiveWeakRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFileWrapper
    public ExchangeFile getFile() {
        return this.file;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public com.prism.lib.pfs.file.a getFileDescriptorProxy() throws IOException {
        return this.file.getFileDescriptorProxy();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getId() {
        return this.file.getId();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public InputStream getInputStream() throws IOException {
        return this.file.getInputStream();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getName() {
        return this.file.getName();
    }

    public int getRotation() {
        return this.fileFlags & 3;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public FileType getType() {
        return this.file.getType();
    }

    public int hashCode() {
        return this.file.hashCode() + (getRotation() * 31);
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public boolean isMediaType() {
        return d.w(getType());
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long lastModified() {
        return this.file.lastModified();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long length() {
        return this.file.length();
    }

    public synchronized T4.a linkAlbumArchive(b bVar) {
        b bVar2;
        T4.a aVarF = null;
        if (bVar == null) {
            return unlinkAlbumArchive(null);
        }
        WeakReference<b> weakReference = this.albumArchiveWeakRef;
        if (weakReference != null && (bVar2 = weakReference.get()) != null && !bVar2.equals(bVar)) {
            this.albumArchiveWeakRef = null;
            bVar2.o(this);
            aVarF = bVar2.f();
        }
        this.albumArchiveWeakRef = new WeakReference<>(bVar);
        return aVarF;
    }

    public void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public void setEnable(boolean z10) {
        this.isEnable = z10;
    }

    public void setRotation(int i10) {
        this.fileFlags = (byte) ((i10 & 3) | (this.fileFlags & (-4)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediaFile{id='");
        sb2.append(getId());
        sb2.append("', name='");
        sb2.append(getName());
        sb2.append("', type=");
        sb2.append(getType());
        sb2.append(", length=");
        sb2.append(length());
        sb2.append(", lastModified=");
        sb2.append(lastModified());
        sb2.append(", fileFlags=");
        sb2.append((int) this.fileFlags);
        sb2.append(", isChecked=");
        sb2.append(this.isChecked);
        sb2.append(", isEnable=");
        return C1636p.a(sb2, this.isEnable, '}');
    }

    public synchronized T4.a unlinkAlbumArchive(b bVar) {
        WeakReference<b> weakReference = this.albumArchiveWeakRef;
        if (weakReference == null) {
            return null;
        }
        b bVar2 = weakReference.get();
        if (bVar2 == null) {
            return null;
        }
        if (bVar != null && !bVar2.equals(bVar)) {
            return null;
        }
        this.albumArchiveWeakRef = null;
        bVar2.o(this);
        return bVar2.f();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean writeFromInputStream(InputStream inputStream, boolean z10) throws IOException {
        return this.file.writeFromInputStream(inputStream, z10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.file, i10);
        parcel.writeByte(this.isChecked ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fileFlags);
    }

    public MediaFile(@NonNull ExchangeFile exchangeFile) {
        this.isEnable = true;
        this.fileFlags = (byte) 0;
        this.file = exchangeFile;
    }

    @Override // java.lang.Comparable
    public int compareTo(MediaFile mediaFile) {
        long jLastModified = mediaFile.lastModified() - lastModified();
        if (jLastModified > LruCacheKt.f86729a) {
            return Integer.MAX_VALUE;
        }
        if (jLastModified < -2147483647L) {
            return -2147483647;
        }
        return (int) jLastModified;
    }

    private MediaFile(Parcel parcel) {
        this.isEnable = true;
        this.fileFlags = (byte) 0;
        this.file = (ExchangeFile) parcel.readParcelable(ExchangeFile.class.getClassLoader());
        this.isChecked = parcel.readByte() != 0;
        this.isEnable = parcel.readByte() != 0;
        this.fileFlags = parcel.readByte();
    }
}
