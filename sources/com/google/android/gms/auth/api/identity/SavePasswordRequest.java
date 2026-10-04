package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zzj();

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String zzau;

    @SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final SignInPassword zzbe;

    public static final class Builder {

        @Nullable
        private String zzau;
        private SignInPassword zzbe;

        public final SavePasswordRequest build() {
            return new SavePasswordRequest(this.zzbe, this.zzau);
        }

        public final Builder setSignInPassword(@NonNull SignInPassword signInPassword) {
            this.zzbe = signInPassword;
            return this;
        }

        public final Builder zzg(@NonNull String str) {
            this.zzau = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SavePasswordRequest(@SafeParcelable.Param(id = 1) SignInPassword signInPassword, @Nullable @SafeParcelable.Param(id = 2) String str) {
        this.zzbe = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zzau = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder signInPassword = builder().setSignInPassword(savePasswordRequest.getSignInPassword());
        String str = savePasswordRequest.zzau;
        if (str != null) {
            signInPassword.zzg(str);
        }
        return signInPassword;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.equal(this.zzbe, savePasswordRequest.zzbe) && Objects.equal(this.zzau, savePasswordRequest.zzau);
    }

    public SignInPassword getSignInPassword() {
        return this.zzbe;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbe, this.zzau);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i10, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzau, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
