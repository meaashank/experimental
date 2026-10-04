package com.prism.gaia.remote;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.e;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class ProviderPlacementG implements Parcelable {
    public static final Parcelable.Creator<ProviderPlacementG> CREATOR = new a();

    @Nullable
    public final String initAuthority;
    public final boolean runHere;

    public class a implements Parcelable.Creator<ProviderPlacementG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ProviderPlacementG createFromParcel(Parcel parcel) {
            return new ProviderPlacementG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ProviderPlacementG[] newArray(int i10) {
            return new ProviderPlacementG[i10];
        }
    }

    private ProviderPlacementG(boolean z10, @Nullable String str) {
        this.runHere = z10;
        this.initAuthority = str;
    }

    public static ProviderPlacementG inProcess(@Nullable String str) {
        return new ProviderPlacementG(false, str);
    }

    public static ProviderPlacementG runHere() {
        return new ProviderPlacementG(true, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.runHere ? "ProviderPlacementG{runHere}" : e.a(new StringBuilder("ProviderPlacementG{"), this.initAuthority, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.runHere ? 1 : 0);
        parcel.writeString(this.initAuthority);
    }

    public ProviderPlacementG(Parcel parcel) {
        this.runHere = parcel.readInt() != 0;
        this.initAuthority = parcel.readString();
    }
}
