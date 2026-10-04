package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C2998g f136515b;

    public S(@RecentlyNonNull BillingResult billingResult, @Nullable C2998g c2998g) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f136514a = billingResult;
        this.f136515b = c2998g;
    }

    @RecentlyNonNull
    public static /* synthetic */ S d(@RecentlyNonNull S s10, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull C2998g c2998g, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = s10.f136514a;
        }
        if ((i10 & 2) != 0) {
            c2998g = s10.f136515b;
        }
        return s10.c(billingResult, c2998g);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136514a;
    }

    @RecentlyNullable
    public final C2998g b() {
        return this.f136515b;
    }

    @NotNull
    public final S c(@RecentlyNonNull BillingResult billingResult, @Nullable C2998g c2998g) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        return new S(billingResult, c2998g);
    }

    @RecentlyNullable
    public final C2998g e() {
        return this.f136515b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return kotlin.jvm.internal.G.g(this.f136514a, s10.f136514a) && kotlin.jvm.internal.G.g(this.f136515b, s10.f136515b);
    }

    @NotNull
    public final BillingResult f() {
        return this.f136514a;
    }

    public int hashCode() {
        int iHashCode = this.f136514a.hashCode() * 31;
        C2998g c2998g = this.f136515b;
        return iHashCode + (c2998g == null ? 0 : c2998g.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetBillingChoiceInfoResult(billingResult=" + this.f136514a + ", billingChoiceInfo=" + this.f136515b + ")";
    }
}
