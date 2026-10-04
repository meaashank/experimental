package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final D f136427b;

    public J(@RecentlyNonNull BillingResult billingResult, @Nullable D d10) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f136426a = billingResult;
        this.f136427b = d10;
    }

    @RecentlyNonNull
    public static /* synthetic */ J d(@RecentlyNonNull J j10, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull D d10, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = j10.f136426a;
        }
        if ((i10 & 2) != 0) {
            d10 = j10.f136427b;
        }
        return j10.c(billingResult, d10);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136426a;
    }

    @RecentlyNullable
    public final D b() {
        return this.f136427b;
    }

    @NotNull
    public final J c(@RecentlyNonNull BillingResult billingResult, @Nullable D d10) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        return new J(billingResult, d10);
    }

    @RecentlyNullable
    public final D e() {
        return this.f136427b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return kotlin.jvm.internal.G.g(this.f136426a, j10.f136426a) && kotlin.jvm.internal.G.g(this.f136427b, j10.f136427b);
    }

    @NotNull
    public final BillingResult f() {
        return this.f136426a;
    }

    public int hashCode() {
        int iHashCode = this.f136426a.hashCode() * 31;
        D d10 = this.f136427b;
        return iHashCode + (d10 == null ? 0 : d10.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateBillingProgramReportingDetailsResult(billingResult=" + this.f136426a + ", billingProgramReportingDetails=" + this.f136427b + ")";
    }
}
