package com.gaia.ngallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.lib.pfs.file.PrivateFile;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class AlbumMeta implements Parcelable {
    public static final Parcelable.Creator<AlbumMeta> CREATOR = new a();
    private static final int DATA_VERSION = 1;
    private int imageCount;
    private long lastModified;
    private String name;
    private String thumbnail;
    private int videoCount;

    public class a implements Parcelable.Creator<AlbumMeta> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AlbumMeta createFromParcel(Parcel parcel) {
            return new AlbumMeta(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AlbumMeta[] newArray(int i10) {
            return new AlbumMeta[i10];
        }
    }

    public static AlbumMeta readFromFile(PrivateFile privateFile) throws Throwable {
        if (!privateFile.sync(false).exists()) {
            return new AlbumMeta();
        }
        Parcel toParcel = privateFile.readToParcel();
        if (toParcel == null) {
            return new AlbumMeta();
        }
        AlbumMeta albumMeta = new AlbumMeta(toParcel);
        toParcel.recycle();
        return albumMeta;
    }

    public void decImageCount() {
        this.imageCount--;
    }

    public void decVideoCount() {
        this.videoCount--;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getImageCount() {
        return this.imageCount;
    }

    public long getLastModified() {
        return this.lastModified;
    }

    public String getName() {
        return this.name;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public int getVideoCount() {
        return this.videoCount;
    }

    public void incImageCount() {
        this.imageCount++;
    }

    public void incVideoCount() {
        this.videoCount++;
    }

    public void setImageCount(int i10) {
        this.imageCount = i10;
    }

    public void setLastModified(long j10) {
        this.lastModified = j10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public void setVideoCount(int i10) {
        this.videoCount = i10;
    }

    public void writeToFile(PrivateFile privateFile) throws IOException {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        try {
            privateFile.writeFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(1);
        parcel.writeString(this.name);
        parcel.writeString(this.thumbnail);
        parcel.writeLong(this.lastModified);
        parcel.writeInt(this.imageCount);
        parcel.writeInt(this.videoCount);
    }

    public AlbumMeta() {
        this.lastModified = 0L;
        this.imageCount = 0;
        this.videoCount = 0;
    }

    private AlbumMeta(Parcel parcel) {
        this.lastModified = 0L;
        this.imageCount = 0;
        this.videoCount = 0;
        parcel.readInt();
        this.name = parcel.readString();
        this.thumbnail = parcel.readString();
        this.lastModified = parcel.readLong();
        this.imageCount = parcel.readInt();
        this.videoCount = parcel.readInt();
    }
}
