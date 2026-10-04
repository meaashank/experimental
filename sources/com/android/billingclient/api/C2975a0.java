package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.android.billingclient.api.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2975a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List f136650b;

    public C2975a0(@RecentlyNonNull BillingResult billingResult, @Nullable List<Y> list) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f136649a = billingResult;
        this.f136650b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ C2975a0 d(@RecentlyNonNull C2975a0 c2975a0, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = c2975a0.f136649a;
        }
        if ((i10 & 2) != 0) {
            list = c2975a0.f136650b;
        }
        return c2975a0.c(billingResult, list);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136649a;
    }

    @RecentlyNullable
    public final List<Y> b() {
        return this.f136650b;
    }

    @NotNull
    public final C2975a0 c(@RecentlyNonNull BillingResult billingResult, @Nullable List<Y> list) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        return new C2975a0(billingResult, list);
    }

    @NotNull
    public final BillingResult e() {
        return this.f136649a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2975a0)) {
            return false;
        }
        C2975a0 c2975a0 = (C2975a0) obj;
        return kotlin.jvm.internal.G.g(this.f136649a, c2975a0.f136649a) && kotlin.jvm.internal.G.g(this.f136650b, c2975a0.f136650b);
    }

    @RecentlyNullable
    public final List<Y> f() {
        return this.f136650b;
    }

    public int hashCode() {
        int iHashCode = this.f136649a.hashCode() * 31;
        List list = this.f136650b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductDetailsResult(billingResult=" + this.f136649a + ", productDetailsList=" + this.f136650b + ")";
    }
}
