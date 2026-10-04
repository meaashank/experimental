package com.cookiegames.smartcookie.html.bookmark;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f141331d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f141332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f141333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f141334c;

    public w(@NotNull String title, @NotNull String url, @NotNull String iconUrl) {
        G.p(title, "title");
        G.p(url, "url");
        G.p(iconUrl, "iconUrl");
        this.f141332a = title;
        this.f141333b = url;
        this.f141334c = iconUrl;
    }

    public static /* synthetic */ w e(w wVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = wVar.f141332a;
        }
        if ((i10 & 2) != 0) {
            str2 = wVar.f141333b;
        }
        if ((i10 & 4) != 0) {
            str3 = wVar.f141334c;
        }
        return wVar.d(str, str2, str3);
    }

    @NotNull
    public final String a() {
        return this.f141332a;
    }

    @NotNull
    public final String b() {
        return this.f141333b;
    }

    @NotNull
    public final String c() {
        return this.f141334c;
    }

    @NotNull
    public final w d(@NotNull String title, @NotNull String url, @NotNull String iconUrl) {
        G.p(title, "title");
        G.p(url, "url");
        G.p(iconUrl, "iconUrl");
        return new w(title, url, iconUrl);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return G.g(this.f141332a, wVar.f141332a) && G.g(this.f141333b, wVar.f141333b) && G.g(this.f141334c, wVar.f141334c);
    }

    @NotNull
    public final String f() {
        return this.f141334c;
    }

    @NotNull
    public final String g() {
        return this.f141332a;
    }

    @NotNull
    public final String h() {
        return this.f141333b;
    }

    public int hashCode() {
        return this.f141334c.hashCode() + androidx.compose.foundation.text.modifiers.l.a(this.f141333b, this.f141332a.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.f141332a;
        String str2 = this.f141333b;
        return android.support.v4.media.e.a(androidx.constraintlayout.core.parser.b.a("BookmarkViewModel(title=", str, ", url=", str2, ", iconUrl="), this.f141334c, ")");
    }
}
