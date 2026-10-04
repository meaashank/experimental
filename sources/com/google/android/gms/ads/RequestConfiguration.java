package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class RequestConfiguration {

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    @Nullable
    private final AgeRestrictedTreatment zzb;
    private final int zzc;
    private final int zzd;

    @Nullable
    private final String zze;
    private final List zzf;
    private final PublisherPrivacyPersonalizationState zzg;

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @NonNull
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, "T", MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class Builder {

        @Nullable
        private AgeRestrictedTreatment zza = null;
        private int zzb = -1;
        private int zzc = -1;

        @Nullable
        private String zzd = null;
        private final List zze = new ArrayList();
        private PublisherPrivacyPersonalizationState zzf = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }

        @NonNull
        public Builder setAgeRestrictedTreatment(@Nullable AgeRestrictedTreatment ageRestrictedTreatment) {
            this.zza = ageRestrictedTreatment;
            return this;
        }

        @NonNull
        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str == null || "".equals(str)) {
                this.zzd = null;
                return this;
            }
            if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || "T".equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.zzd = str;
                return this;
            }
            zzo.zzi("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.zzf = publisherPrivacyPersonalizationState;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForChildDirectedTreatment(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.zzb = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 57);
            sb2.append("Invalid value passed to setTagForChildDirectedTreatment: ");
            sb2.append(i10);
            zzo.zzi(sb2.toString());
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.zzc = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 52);
            sb2.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
            sb2.append(i10);
            zzo.zzi(sb2.toString());
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(@Nullable List<String> list) {
            List list2 = this.zze;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zza;

        PublisherPrivacyPersonalizationState(int i10) {
            this.zza = i10;
        }

        public int getValue() {
            return this.zza;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(AgeRestrictedTreatment ageRestrictedTreatment, int i10, int i11, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, byte[] bArr) {
        this.zzb = ageRestrictedTreatment;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = str;
        this.zzf = list;
        this.zzg = publisherPrivacyPersonalizationState;
    }

    @NonNull
    public AgeRestrictedTreatment getAgeRestrictedTreatment() {
        AgeRestrictedTreatment ageRestrictedTreatment = this.zzb;
        return ageRestrictedTreatment == null ? AgeRestrictedTreatment.UNSPECIFIED : ageRestrictedTreatment;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.zze;
        return str == null ? "" : str;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzg;
    }

    @Deprecated
    public int getTagForChildDirectedTreatment() {
        return this.zzc;
    }

    @Deprecated
    public int getTagForUnderAgeOfConsent() {
        return this.zzd;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zzf);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setAgeRestrictedTreatment(this.zzb);
        builder.setTagForChildDirectedTreatment(this.zzc);
        builder.setTagForUnderAgeOfConsent(this.zzd);
        builder.setMaxAdContentRating(this.zze);
        builder.setTestDeviceIds(this.zzf);
        builder.setPublisherPrivacyPersonalizationState(this.zzg);
        return builder;
    }

    @androidx.annotation.Nullable
    public final AgeRestrictedTreatment zza() {
        return this.zzb;
    }
}
