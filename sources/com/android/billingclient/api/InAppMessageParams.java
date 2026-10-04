package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class InAppMessageParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f136423a;

    public static final class Builder {
        private final Set zza = new HashSet();

        @NonNull
        public Builder addAllInAppMessageCategoriesToShow() {
            this.zza.add(2);
            return this;
        }

        @NonNull
        public Builder addInAppMessageCategoryToShow(int i10) {
            this.zza.add(Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public InAppMessageParams build() {
            return new InAppMessageParams(this.zza, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: X0, reason: collision with root package name */
        public static final int f136424X0 = 0;

        /* JADX INFO: renamed from: Y0, reason: collision with root package name */
        public static final int f136425Y0 = 2;
    }

    public /* synthetic */ InAppMessageParams(Set set, C3013j2 c3013j2) {
        this.f136423a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    public static Builder a() {
        return new Builder();
    }

    public final ArrayList b() {
        return this.f136423a;
    }
}
