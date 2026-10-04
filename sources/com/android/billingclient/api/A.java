package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f136269b;

    @InterfaceC3017k2
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f136270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f136271b;

        /* JADX INFO: renamed from: com.android.billingclient.api.A$a$a, reason: collision with other inner class name */
        @InterfaceC3017k2
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0354a {

            /* JADX INFO: renamed from: L0, reason: collision with root package name */
            public static final int f136272L0 = 0;

            /* JADX INFO: renamed from: M0, reason: collision with root package name */
            public static final int f136273M0 = 1;

            /* JADX INFO: renamed from: N0, reason: collision with root package name */
            public static final int f136274N0 = 2;
        }

        public a(int i10, boolean z10) {
            this.f136270a = i10;
            this.f136271b = z10;
        }

        public int a() {
            return this.f136270a;
        }

        public boolean b() {
            return this.f136271b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f136270a == aVar.f136270a && this.f136271b == aVar.f136271b;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f136270a), Boolean.valueOf(this.f136271b));
        }
    }

    public A(int i10) {
        this.f136268a = i10;
        this.f136269b = null;
    }

    @Nullable
    @InterfaceC3017k2
    public a a() {
        return this.f136269b;
    }

    public int b() {
        return this.f136268a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f136268a == a10.f136268a && Objects.equals(this.f136269b, a10.f136269b);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f136268a), this.f136269b);
    }

    public A(int i10, @Nullable a aVar) {
        this.f136268a = 5;
        this.f136269b = aVar;
    }
}
