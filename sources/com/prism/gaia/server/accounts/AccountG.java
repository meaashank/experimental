package com.prism.gaia.server.accounts;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AccountG implements Parcelable {
    public static final Parcelable.Creator<AccountG> CREATOR = new a();
    public Map<String, String> authTokens;
    public long lastAuthenticatedTime;
    public String name;
    public String password;
    public String previousName;
    public String type;
    public Map<String, String> userDatas;
    public int userId;

    public class a implements Parcelable.Creator<AccountG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AccountG createFromParcel(Parcel parcel) {
            return new AccountG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AccountG[] newArray(int i10) {
            return new AccountG[i10];
        }
    }

    public AccountG(int i10, Account account) {
        this.userId = i10;
        this.name = account.name;
        this.type = account.type;
        this.authTokens = new HashMap();
        this.userDatas = new HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(userId:");
        sb2.append(this.userId);
        sb2.append(",name:");
        sb2.append(this.name);
        sb2.append(",type:");
        return android.support.v4.media.e.a(sb2, this.type, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.userId);
        parcel.writeString(this.name);
        parcel.writeString(this.previousName);
        parcel.writeString(this.type);
        parcel.writeString(this.password);
        parcel.writeLong(this.lastAuthenticatedTime);
        parcel.writeInt(this.authTokens.size());
        for (Map.Entry<String, String> entry : this.authTokens.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.userDatas.size());
        for (Map.Entry<String, String> entry2 : this.userDatas.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public AccountG(Parcel parcel) {
        this.userId = parcel.readInt();
        this.name = parcel.readString();
        this.previousName = parcel.readString();
        this.type = parcel.readString();
        this.password = parcel.readString();
        this.lastAuthenticatedTime = parcel.readLong();
        int i10 = parcel.readInt();
        this.authTokens = new HashMap(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.authTokens.put(parcel.readString(), parcel.readString());
        }
        int i12 = parcel.readInt();
        this.userDatas = new HashMap(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            this.userDatas.put(parcel.readString(), parcel.readString());
        }
    }
}
