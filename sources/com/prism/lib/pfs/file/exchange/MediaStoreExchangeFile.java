package com.prism.lib.pfs.file.exchange;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3849m;
import com.prism.commons.utils.C3858w;
import com.prism.gaia.download.j;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.exception.PfsIOException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o6.C5330c;

/* JADX INFO: loaded from: classes7.dex */
public class MediaStoreExchangeFile implements ExchangeFile {
    public static final Parcelable.Creator<MediaStoreExchangeFile> CREATOR = new b();
    private long addedDate;
    private C5330c<MediaStoreExchangeFile> batchHandler;
    private int bucketId;
    private String bucketName;
    private long duration;
    private FileType fileType;
    private final Uri fileUri;
    private int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f188863id;
    private long lastModified;
    private float latitude;
    private long length;
    private float longitude;
    private String mimeType;
    private String name;
    private String path;
    private String title;
    private int width;

    public class a implements com.prism.lib.pfs.file.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AssetFileDescriptor f188864a;

        public a(AssetFileDescriptor assetFileDescriptor) {
            this.f188864a = assetFileDescriptor;
        }

        @Override // com.prism.lib.pfs.file.a
        public FileDescriptor a() throws IOException {
            FileDescriptor fileDescriptor = this.f188864a.getFileDescriptor();
            if (fileDescriptor.valid()) {
                return fileDescriptor;
            }
            throw new PfsIOException(4, "fileDescriptor invalid");
        }

        @Override // com.prism.lib.pfs.file.a
        public void close() {
            try {
                AssetFileDescriptor assetFileDescriptor = this.f188864a;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.prism.lib.pfs.file.a
        public long getOffset() {
            return 0L;
        }
    }

    public class b implements Parcelable.Creator<MediaStoreExchangeFile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MediaStoreExchangeFile createFromParcel(Parcel parcel) {
            return new MediaStoreExchangeFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public MediaStoreExchangeFile[] newArray(int i10) {
            return new MediaStoreExchangeFile[i10];
        }
    }

    private static ContentResolver getContentResolver() {
        return PrivateFileSystem.getAppContext().getContentResolver();
    }

    private String getRealPath() throws Throwable {
        Cursor cursorQuery;
        FileType type = getType();
        FileType fileType = FileType.IMAGE;
        String str = j.b.f164768t;
        Cursor cursor = null;
        if (type != fileType && type != FileType.VIDEO && type != FileType.AUDIO) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            cursorQuery = getContentResolver().query(this.fileUri, new String[]{str}, null, null, null);
            if (cursorQuery == null) {
                C3849m.a(cursorQuery);
                return null;
            }
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(str);
                if (!cursorQuery.moveToFirst()) {
                    C3849m.a(cursorQuery);
                    return null;
                }
                String string = cursorQuery.getString(columnIndexOrThrow);
                C3849m.a(cursorQuery);
                return string;
            } catch (Exception unused) {
                C3849m.a(cursorQuery);
                return null;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                C3849m.a(cursor);
                throw th;
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean deleteQuietly() {
        if (C3841e.x()) {
            C5330c<MediaStoreExchangeFile> c5330c = this.batchHandler;
            if (c5330c == null) {
                return false;
            }
            c5330c.g(this);
            return true;
        }
        if (C3841e.w()) {
            return getContentResolver().delete(this.fileUri, null, null) != 0;
        }
        if (this.path == null) {
            this.path = getRealPath();
        }
        if (this.path == null) {
            return false;
        }
        getContentResolver().delete(this.fileUri, null, null);
        return C3858w.l(new File(this.path));
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
        return this.fileUri.equals(((MediaStoreExchangeFile) obj).fileUri);
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean exists() {
        PrivateFileSystem.getAppContext();
        return true;
    }

    public long getAddedDate() {
        return this.addedDate;
    }

    public int getBucketId() {
        return this.bucketId;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public long getDuration() {
        return this.duration;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public com.prism.lib.pfs.file.a getFileDescriptorProxy() throws IOException {
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = getContentResolver().openAssetFileDescriptor(this.fileUri, CampaignEx.JSON_KEY_AD_R);
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                return new a(assetFileDescriptorOpenAssetFileDescriptor);
            }
            throw new PfsIOException(4, "getFileDescriptor result null");
        } catch (FileNotFoundException e10) {
            throw new PfsIOException(4, e10);
        }
    }

    public Uri getFileUri() {
        return this.fileUri;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getId() {
        return this.f188863id;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public InputStream getInputStream() throws IOException {
        return C3858w.D(getContentResolver(), this.fileUri);
    }

    public float getLatitude() {
        return this.latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public FileType getType() {
        return this.fileType;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.fileUri.hashCode();
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long lastModified() {
        return this.lastModified;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public long length() {
        return this.length;
    }

    public void setAddedDate(long j10) {
        this.addedDate = j10;
    }

    public void setBatchHandler(C5330c<MediaStoreExchangeFile> c5330c) {
        this.batchHandler = c5330c;
    }

    public void setBucketId(int i10) {
        this.bucketId = i10;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setDuration(long j10) {
        this.duration = j10;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setLastModified(long j10) {
        this.lastModified = j10;
    }

    public void setLatitude(float f10) {
        this.latitude = f10;
    }

    public void setLength(long j10) {
        this.length = j10;
    }

    public void setLongitude(float f10) {
        this.longitude = f10;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(FileType fileType) {
        this.fileType = fileType;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    public boolean writeFromInputStream(InputStream inputStream, boolean z10) throws Throwable {
        C3858w.Y(getContentResolver(), this.fileUri, inputStream, z10);
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.fileUri, i10);
        parcel.writeString(this.f188863id);
        parcel.writeString(this.name);
        parcel.writeInt(this.fileType.ordinal());
        parcel.writeLong(this.length);
        parcel.writeLong(this.lastModified);
        parcel.writeInt(this.bucketId);
        parcel.writeString(this.bucketName);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.title);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.addedDate);
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
    }

    public MediaStoreExchangeFile(Uri uri) {
        this.fileType = FileType.UNKNOWN;
        this.length = 0L;
        this.lastModified = 0L;
        this.bucketId = -1;
        this.width = 0;
        this.height = 0;
        this.duration = 0L;
        this.addedDate = 0L;
        this.latitude = 0.0f;
        this.longitude = 0.0f;
        this.fileUri = uri;
        this.f188863id = uri.toString();
    }

    private MediaStoreExchangeFile(Parcel parcel) {
        this.fileType = FileType.UNKNOWN;
        this.length = 0L;
        this.lastModified = 0L;
        this.bucketId = -1;
        this.width = 0;
        this.height = 0;
        this.duration = 0L;
        this.addedDate = 0L;
        this.latitude = 0.0f;
        this.longitude = 0.0f;
        this.fileUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f188863id = parcel.readString();
        this.name = parcel.readString();
        this.fileType = FileType.values()[parcel.readInt()];
        this.length = parcel.readLong();
        this.lastModified = parcel.readLong();
        this.bucketId = parcel.readInt();
        this.bucketName = parcel.readString();
        this.mimeType = parcel.readString();
        this.title = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        this.addedDate = parcel.readLong();
        this.latitude = parcel.readFloat();
        this.longitude = parcel.readFloat();
    }
}
