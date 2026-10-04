package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class J implements Parcelable {

    @dd.g
    @NotNull
    public static final Parcelable.Creator<J> CREATOR = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f152077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f152078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f152080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f152081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f152082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f152083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f152084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f152085k;

    public J(long j10, String str, String str2, String str3, C4969v c4969v) {
        this.f152082h = "";
        this.f152083i = "activity";
        this.f152075a = j10;
        this.f152076b = str;
        this.f152079e = str2;
        this.f152076b = str == null ? "" : str;
        this.f152080f = str3;
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void n() {
    }

    @NotNull
    public final String d() {
        String str = this.f152081g;
        kotlin.jvm.internal.G.m(str);
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.f152085k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return this.f152075a == j10.f152075a && kotlin.jvm.internal.G.g(this.f152083i, j10.f152083i) && kotlin.jvm.internal.G.g(this.f152076b, j10.f152076b) && kotlin.jvm.internal.G.g(this.f152079e, j10.f152079e);
    }

    @Nullable
    public final Map<String, String> f() {
        return this.f152077c;
    }

    public final long g() {
        return this.f152075a;
    }

    @NotNull
    public final String h() {
        return "im";
    }

    public int hashCode() {
        long j10 = this.f152075a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f152079e;
        return this.f152083i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    @Nullable
    public final String i() {
        return this.f152078d;
    }

    @NotNull
    public final String j() {
        return this.f152083i;
    }

    public final long l() {
        return this.f152075a;
    }

    @Nullable
    public final String m() {
        return this.f152080f;
    }

    @Nullable
    public final String o() {
        return this.f152076b;
    }

    public final boolean p() {
        return this.f152084j;
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f152075a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        kotlin.jvm.internal.G.p(dest, "dest");
        dest.writeLong(this.f152075a);
        dest.writeString(this.f152083i);
        dest.writeString(this.f152079e);
    }

    @Nullable
    public final String b() {
        return this.f152079e;
    }

    public final void a(@Nullable Map<String, String> map) {
        this.f152077c = map;
    }

    public final void b(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<set-?>");
        this.f152083i = str;
    }

    @NotNull
    public final String a() {
        return this.f152082h;
    }

    public final void a(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<set-?>");
        this.f152082h = str;
    }

    public J(Parcel parcel, C4969v c4969v) {
        this.f152082h = "";
        String str = "activity";
        this.f152083i = "activity";
        this.f152075a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !string.equals("activity") && string.equals("others")) {
            str = "others";
        }
        this.f152083i = str;
        this.f152079e = parcel.readString();
    }
}
