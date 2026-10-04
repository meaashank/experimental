package com.prism.gaia.helper;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class GUri implements Parcelable, Comparable<GUri> {
    public static final Parcelable.Creator<GUri> CREATOR = new a();
    private final String authority;

    public class a implements Parcelable.Creator<GUri> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GUri createFromParcel(Parcel parcel) {
            return new GUri(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GUri[] newArray(int i10) {
            return new GUri[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.authority.equals(((GUri) obj).authority);
    }

    public String getAuthority() {
        return this.authority;
    }

    public Uri getContentUri() {
        return Uri.parse("content://" + this.authority);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.authority);
    }

    public GUri(String str) {
        this.authority = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(GUri gUri) {
        return this.authority.compareTo(gUri.authority);
    }

    private GUri(Parcel parcel) {
        this.authority = parcel.readString();
    }
}
