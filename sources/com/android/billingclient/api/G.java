package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f136392b;

    public G(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f136391a = billingResult;
        this.f136392b = str;
    }

    @RecentlyNonNull
    public static /* synthetic */ G d(@RecentlyNonNull G g10, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = g10.f136391a;
        }
        if ((i10 & 2) != 0) {
            str = g10.f136392b;
        }
        return g10.c(billingResult, str);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136391a;
    }

    @RecentlyNullable
    public final String b() {
        return this.f136392b;
    }

    @NotNull
    public final G c(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        return new G(billingResult, str);
    }

    @NotNull
    public final BillingResult e() {
        return this.f136391a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.G.g(this.f136391a, g10.f136391a) && kotlin.jvm.internal.G.g(this.f136392b, g10.f136392b);
    }

    @RecentlyNullable
    public final String f() {
        return this.f136392b;
    }

    public int hashCode() {
        int iHashCode = this.f136391a.hashCode() * 31;
        String str = this.f136392b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConsumeResult(billingResult=");
        sb2.append(this.f136391a);
        sb2.append(", purchaseToken=");
        return android.support.v4.media.e.a(sb2, this.f136392b, ")");
    }
}
