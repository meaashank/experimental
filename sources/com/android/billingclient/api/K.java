package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final P f136431b;

    public K(@RecentlyNonNull BillingResult billingResult, @Nullable P p10) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f136430a = billingResult;
        this.f136431b = p10;
    }

    @RecentlyNonNull
    public static /* synthetic */ K d(@RecentlyNonNull K k10, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull P p10, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = k10.f136430a;
        }
        if ((i10 & 2) != 0) {
            p10 = k10.f136431b;
        }
        return k10.c(billingResult, p10);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136430a;
    }

    @RecentlyNullable
    public final P b() {
        return this.f136431b;
    }

    @NotNull
    public final K c(@RecentlyNonNull BillingResult billingResult, @Nullable P p10) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        return new K(billingResult, p10);
    }

    @NotNull
    public final BillingResult e() {
        return this.f136430a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return kotlin.jvm.internal.G.g(this.f136430a, k10.f136430a) && kotlin.jvm.internal.G.g(this.f136431b, k10.f136431b);
    }

    @RecentlyNullable
    public final P f() {
        return this.f136431b;
    }

    public int hashCode() {
        int iHashCode = this.f136430a.hashCode() * 31;
        P p10 = this.f136431b;
        return iHashCode + (p10 == null ? 0 : p10.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateExternalOfferReportingDetailsResult(billingResult=" + this.f136430a + ", externalOfferReportingDetails=" + this.f136431b + ")";
    }
}
