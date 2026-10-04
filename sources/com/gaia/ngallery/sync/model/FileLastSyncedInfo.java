package com.gaia.ngallery.sync.model;

import android.os.Parcel;
import com.gaia.ngallery.sync.model.ParcelableWithVersion;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes3.dex */
public class FileLastSyncedInfo extends ParcelableWithVersion {
    private static final int DEFAULT_DATA_VERSION = 0;
    private static final String TAG = l0.b("FileLastSyncedInfo");
    public static final ParcelableWithVersion.a<FileLastSyncedInfo> CREATOR = new a();
    private long lastSyncedTime = 0;
    private long lastModifedFromServer = 0;

    public class a extends ParcelableWithVersion.a<FileLastSyncedInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FileLastSyncedInfo[] newArray(int i10) {
            return new FileLastSyncedInfo[i10];
        }

        @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public FileLastSyncedInfo d() {
            return new FileLastSyncedInfo();
        }
    }

    @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion
    public int getDefaultDataVersion() {
        return 0;
    }

    public long getLastModifedFromServer() {
        return this.lastModifedFromServer;
    }

    public long getLastSyncedTime() {
        return this.lastSyncedTime;
    }

    @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion
    public void readDataFromParcel(Parcel parcel, int i10) {
        this.lastSyncedTime = parcel.readLong();
        this.lastModifedFromServer = parcel.readLong();
    }

    public void setLastModifedFromServer(long j10) {
        this.lastModifedFromServer = j10;
    }

    public void setLastSyncedTime(long j10) {
        this.lastSyncedTime = j10;
    }

    @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion
    public void writeDataToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.lastSyncedTime);
        parcel.writeLong(this.lastModifedFromServer);
    }
}
