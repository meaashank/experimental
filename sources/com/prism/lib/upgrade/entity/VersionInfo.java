package com.prism.lib.upgrade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import db.C4313c;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class VersionInfo extends ChecksumBase implements Parcelable {
    public static final Parcelable.Creator<VersionInfo> CREATOR = new Parcelable.Creator<VersionInfo>() { // from class: com.prism.lib.upgrade.entity.VersionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VersionInfo createFromParcel(Parcel parcel) {
            return new VersionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VersionInfo[] newArray(int i10) {
            return new VersionInfo[i10];
        }
    };

    @SerializedName("pkg_channel")
    public String pkgChannel;

    @SerializedName("pkg_size")
    public long pkgSize;

    @SerializedName("pkg_url")
    public String pkgUrl;

    @SerializedName("pkg_version_code")
    public long pkgVersionCode;

    @SerializedName("pkg_version_name")
    public String pkgVersionName;

    @SerializedName("popup_count")
    public int popupCount;

    @SerializedName("popup_interval_time")
    public int popupIntervalTime;

    @SerializedName("popup_interval_type")
    public String popupIntervalType;

    @SerializedName("popup_theme")
    public String popupTheme;

    @SerializedName("popup_type")
    public String popupType;

    @SerializedName("timestamp")
    public long timestamp;

    @SerializedName("upgrade_desc")
    public String upgradeDesc;

    @SerializedName("upgrade_time")
    public long upgradeTime;

    public VersionInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VersionInfo versionInfo = (VersionInfo) obj;
            if (this.popupCount == versionInfo.popupCount && this.popupIntervalTime == versionInfo.popupIntervalTime && this.pkgVersionCode == versionInfo.pkgVersionCode && this.pkgSize == versionInfo.pkgSize && this.upgradeTime == versionInfo.upgradeTime && Objects.equals(this.popupType, versionInfo.popupType) && Objects.equals(this.popupIntervalType, versionInfo.popupIntervalType) && Objects.equals(this.popupTheme, versionInfo.popupTheme) && Objects.equals(this.pkgVersionName, versionInfo.pkgVersionName) && Objects.equals(this.pkgChannel, versionInfo.pkgChannel) && Objects.equals(this.pkgUrl, versionInfo.pkgUrl) && Objects.equals(this.upgradeDesc, versionInfo.upgradeDesc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.prism.lib.upgrade.entity.ChecksumBase
    public Object[] getChecksumFields() {
        return new Object[]{C4313c.f199890f, this.popupType, Integer.valueOf(this.popupCount), this.popupIntervalType, Integer.valueOf(this.popupIntervalTime), this.popupTheme, this.pkgVersionName, Long.valueOf(this.pkgVersionCode), this.pkgChannel, Long.valueOf(this.pkgSize), this.pkgUrl, Long.valueOf(this.upgradeTime), this.upgradeDesc, Long.valueOf(this.timestamp)};
    }

    public int hashCode() {
        return Objects.hash(this.popupType, Integer.valueOf(this.popupCount), this.popupIntervalType, Integer.valueOf(this.popupIntervalTime), this.popupTheme, this.pkgVersionName, Long.valueOf(this.pkgVersionCode), this.pkgChannel, Long.valueOf(this.pkgSize), this.pkgUrl, Long.valueOf(this.upgradeTime), this.upgradeDesc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.popupType);
        parcel.writeInt(this.popupCount);
        parcel.writeString(this.popupIntervalType);
        parcel.writeInt(this.popupIntervalTime);
        parcel.writeString(this.popupTheme);
        parcel.writeString(this.pkgVersionName);
        parcel.writeLong(this.pkgVersionCode);
        parcel.writeString(this.pkgChannel);
        parcel.writeLong(this.pkgSize);
        parcel.writeString(this.pkgUrl);
        parcel.writeLong(this.upgradeTime);
        parcel.writeString(this.upgradeDesc);
        parcel.writeString(this.checksum);
    }

    public VersionInfo(Parcel parcel) {
        this.popupType = parcel.readString();
        this.popupCount = parcel.readInt();
        this.popupIntervalType = parcel.readString();
        this.popupIntervalTime = parcel.readInt();
        this.popupTheme = parcel.readString();
        this.pkgVersionName = parcel.readString();
        this.pkgVersionCode = parcel.readLong();
        this.pkgChannel = parcel.readString();
        this.pkgSize = parcel.readLong();
        this.pkgUrl = parcel.readString();
        this.upgradeTime = parcel.readLong();
        this.upgradeDesc = parcel.readString();
        this.checksum = parcel.readString();
    }
}
