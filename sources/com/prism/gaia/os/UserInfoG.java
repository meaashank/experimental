package com.prism.gaia.os;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.gaia.server.accounts.b;

/* JADX INFO: loaded from: classes6.dex */
public class UserInfoG implements Parcelable {
    public static final Parcelable.Creator<UserInfoG> CREATOR = new a();
    public static final int FLAG_ADMIN = 2;
    public static final int FLAG_DISABLED = 64;
    public static final int FLAG_GUEST = 4;
    public static final int FLAG_INITIALIZED = 16;
    public static final int FLAG_MANAGED_PROFILE = 32;
    public static final int FLAG_MASK_USER_TYPE = 255;
    public static final int FLAG_PRIMARY = 1;
    public static final int FLAG_RESTRICTED = 8;
    public static final int NO_PROFILE_GROUP_ID = -1;
    public long creationTime;
    public int flags;
    public boolean guestToRemove;
    public String iconPath;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f166024id;
    public long lastLoggedInTime;
    public String name;
    public boolean partial;
    public int profileGroupId;
    public int serialNumber;

    public class a implements Parcelable.Creator<UserInfoG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public UserInfoG createFromParcel(Parcel parcel) {
            return new UserInfoG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public UserInfoG[] newArray(int i10) {
            return new UserInfoG[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isAdmin() {
        return (this.flags & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.flags & 64) != 64;
    }

    public boolean isGuest() {
        return (this.flags & 4) == 4;
    }

    public boolean isManagedProfile() {
        return (this.flags & 32) == 32;
    }

    public boolean isPrimary() {
        return (this.flags & 1) == 1;
    }

    public boolean isRestricted() {
        return (this.flags & 8) == 8;
    }

    public String toString() {
        return "UserInfo{" + this.f166024id + b.f166434b0 + this.name + b.f166434b0 + Integer.toHexString(this.flags) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f166024id);
        parcel.writeString(this.name);
        parcel.writeString(this.iconPath);
        parcel.writeInt(this.flags);
        parcel.writeInt(this.serialNumber);
        parcel.writeLong(this.creationTime);
        parcel.writeLong(this.lastLoggedInTime);
        parcel.writeInt(this.partial ? 1 : 0);
        parcel.writeInt(this.profileGroupId);
        parcel.writeInt(this.guestToRemove ? 1 : 0);
    }

    public UserInfoG(int i10, String str, int i11) {
        this(i10, str, null, i11);
    }

    public UserInfoG(int i10, String str, String str2, int i11) {
        this.f166024id = i10;
        this.name = str;
        this.flags = i11;
        this.iconPath = str2;
        this.profileGroupId = -1;
    }

    public UserInfoG() {
    }

    public UserInfoG(UserInfoG userInfoG) {
        this.name = userInfoG.name;
        this.iconPath = userInfoG.iconPath;
        this.f166024id = userInfoG.f166024id;
        this.flags = userInfoG.flags;
        this.serialNumber = userInfoG.serialNumber;
        this.creationTime = userInfoG.creationTime;
        this.lastLoggedInTime = userInfoG.lastLoggedInTime;
        this.partial = userInfoG.partial;
        this.profileGroupId = userInfoG.profileGroupId;
        this.guestToRemove = userInfoG.guestToRemove;
    }

    private UserInfoG(Parcel parcel) {
        this.f166024id = parcel.readInt();
        this.name = parcel.readString();
        this.iconPath = parcel.readString();
        this.flags = parcel.readInt();
        this.serialNumber = parcel.readInt();
        this.creationTime = parcel.readLong();
        this.lastLoggedInTime = parcel.readLong();
        this.partial = parcel.readInt() != 0;
        this.profileGroupId = parcel.readInt();
        this.guestToRemove = parcel.readInt() != 0;
    }
}
