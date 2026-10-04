package com.prism.hider.vault.commons;

import android.os.Parcel;
import android.os.Parcelable;
import e.Z;

/* JADX INFO: loaded from: classes6.dex */
public class VaultUIMeta implements Parcelable {
    public static final Parcelable.Creator<VaultUIMeta> CREATOR = new a();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f168628id;

    @Z
    private final int nameResId;

    public class a implements Parcelable.Creator<VaultUIMeta> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public VaultUIMeta createFromParcel(Parcel parcel) {
            return new VaultUIMeta(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public VaultUIMeta[] newArray(int i10) {
            return new VaultUIMeta[i10];
        }
    }

    public VaultUIMeta(String str, @Z int i10) {
        this.f168628id = str;
        this.nameResId = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f168628id;
    }

    @Z
    public int getNameResId() {
        return this.nameResId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f168628id);
        parcel.writeInt(this.nameResId);
    }

    public VaultUIMeta(Parcel parcel) {
        this.f168628id = parcel.readString();
        this.nameResId = parcel.readInt();
    }
}
