package com.android.billingclient.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f136561b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: Z0, reason: collision with root package name */
        public static final int f136562Z0 = 0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final int f136563a1 = 1;
    }

    public U(int i10, @Nullable String str) {
        this.f136560a = 0;
        this.f136561b = null;
    }

    public static U c(Bundle bundle) {
        return bundle == null ? new U(0, null) : new U(zzc.zza(bundle, "InAppMessageResult"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"), bundle.getString("IN_APP_MESSAGE_PURCHASE_ID"));
    }

    @Nullable
    public String a() {
        return this.f136561b;
    }

    public int b() {
        return this.f136560a;
    }

    public U(int i10, @Nullable String str, @Nullable String str2) {
        this.f136560a = i10;
        this.f136561b = str;
    }
}
