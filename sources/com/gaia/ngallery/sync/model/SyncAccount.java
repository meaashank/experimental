package com.gaia.ngallery.sync.model;

import android.net.Uri;
import android.os.Parcel;
import com.gaia.ngallery.sync.model.ParcelableWithVersion;

/* JADX INFO: loaded from: classes3.dex */
public class SyncAccount extends ParcelableWithVersion {
    public static final ParcelableWithVersion.a<SyncAccount> CREATOR = new a();
    private static final int DEFAULT_DATA_VERSION = 0;
    public static final int TYPE_GOOGLE_DRIVE = 1;
    private String accountId;
    private String accountName;
    private String accountSubTitle;
    private int accountType;
    private Uri profilePhoto;

    public class a extends ParcelableWithVersion.a<SyncAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SyncAccount[] newArray(int i10) {
            return new SyncAccount[i10];
        }

        @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SyncAccount d() {
            return new SyncAccount();
        }
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountSubTitle() {
        return this.accountSubTitle;
    }

    public int getAccountType() {
        return this.accountType;
    }

    @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion
    public int getDefaultDataVersion() {
        return 0;
    }

    public Uri getProfilePhoto() {
        return this.profilePhoto;
    }

    @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion
    public void readDataFromParcel(Parcel parcel, int i10) {
        this.accountType = parcel.readInt();
        this.accountName = parcel.readString();
        this.accountId = parcel.readString();
        this.accountSubTitle = parcel.readString();
        this.profilePhoto = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAccountSubTitle(String str) {
        this.accountSubTitle = str;
    }

    public void setAccountType(int i10) {
        this.accountType = i10;
    }

    public void setProfilePhoto(Uri uri) {
        this.profilePhoto = uri;
    }

    @Override // com.gaia.ngallery.sync.model.ParcelableWithVersion
    public void writeDataToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.accountType);
        parcel.writeString(this.accountName);
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountSubTitle);
        parcel.writeParcelable(this.profilePhoto, 0);
    }
}
