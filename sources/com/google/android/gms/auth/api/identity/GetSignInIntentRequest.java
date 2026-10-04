package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zzg();

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private String zzau;

    @SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String zzax;

    @Nullable
    @SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    private final String zzbd;

    public static final class Builder {

        @Nullable
        private String zzau;
        private String zzax;

        @Nullable
        private String zzbd;

        public final GetSignInIntentRequest build() {
            return new GetSignInIntentRequest(this.zzax, this.zzbd, this.zzau);
        }

        public final Builder filterByHostedDomain(@Nullable String str) {
            this.zzbd = str;
            return this;
        }

        public final Builder setServerClientId(String str) {
            Preconditions.checkNotNull(str);
            this.zzax = str;
            return this;
        }

        public final Builder zzf(@Nullable String str) {
            this.zzau = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public GetSignInIntentRequest(@SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) String str3) {
        Preconditions.checkNotNull(str);
        this.zzax = str;
        this.zzbd = str2;
        this.zzau = str3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(GetSignInIntentRequest getSignInIntentRequest) {
        Preconditions.checkNotNull(getSignInIntentRequest);
        Builder builderFilterByHostedDomain = builder().setServerClientId(getSignInIntentRequest.getServerClientId()).filterByHostedDomain(getSignInIntentRequest.getHostedDomainFilter());
        String str = getSignInIntentRequest.zzau;
        if (str != null) {
            builderFilterByHostedDomain.zzf(str);
        }
        return builderFilterByHostedDomain;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return Objects.equal(this.zzax, getSignInIntentRequest.zzax) && Objects.equal(this.zzbd, getSignInIntentRequest.zzbd) && Objects.equal(this.zzau, getSignInIntentRequest.zzau);
    }

    @Nullable
    public String getHostedDomainFilter() {
        return this.zzbd;
    }

    public String getServerClientId() {
        return this.zzax;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzax, this.zzbd, this.zzau);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 2, getHostedDomainFilter(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzau, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
