package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class PrewarmRequest implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<PrewarmRequest> CREATOR = new zzm();
    private final String zza;
    private final String zzb;

    @Nullable
    private final IBinder zzc;
    private final Bundle zzd;

    public /* synthetic */ PrewarmRequest(Parcel parcel, zzn zznVar) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.zza = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.zzb = string2;
        if (parcel.readByte() != 0) {
            this.zzc = parcel.readStrongBinder();
        } else {
            this.zzc = null;
        }
        Bundle bundle = parcel.readBundle(PrewarmRequest.class.getClassLoader());
        this.zzd = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public Bundle getExtras() {
        return new Bundle(this.zzd);
    }

    @NonNull
    public String getTargetPackage() {
        return this.zza;
    }

    @NonNull
    public String getUrl() {
        return this.zzb;
    }

    @Nullable
    public IBinder getWindowToken() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        IBinder iBinder = this.zzc;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.zzd);
    }

    public PrewarmRequest(@NonNull String str, @NonNull String str2, @Nullable IBinder iBinder, @Nullable Bundle bundle) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.zza = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.zzb = str2;
        this.zzc = iBinder;
        this.zzd = bundle != null ? new Bundle(bundle) : Bundle.EMPTY;
    }
}
