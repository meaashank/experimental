package com.cookiegames.smartcookie.browser.bookmarks;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f141010c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3.a f141011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Bitmap f141012b;

    public r(@NotNull T3.a bookmark, @Nullable Bitmap bitmap) {
        G.p(bookmark, "bookmark");
        this.f141011a = bookmark;
        this.f141012b = bitmap;
    }

    public static /* synthetic */ r d(r rVar, T3.a aVar, Bitmap bitmap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = rVar.f141011a;
        }
        if ((i10 & 2) != 0) {
            bitmap = rVar.f141012b;
        }
        return rVar.c(aVar, bitmap);
    }

    @NotNull
    public final T3.a a() {
        return this.f141011a;
    }

    @Nullable
    public final Bitmap b() {
        return this.f141012b;
    }

    @NotNull
    public final r c(@NotNull T3.a bookmark, @Nullable Bitmap bitmap) {
        G.p(bookmark, "bookmark");
        return new r(bookmark, bitmap);
    }

    @NotNull
    public final T3.a e() {
        return this.f141011a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return G.g(this.f141011a, rVar.f141011a) && G.g(this.f141012b, rVar.f141012b);
    }

    @Nullable
    public final Bitmap f() {
        return this.f141012b;
    }

    public final void g(@Nullable Bitmap bitmap) {
        this.f141012b = bitmap;
    }

    public int hashCode() {
        int iHashCode = this.f141011a.hashCode() * 31;
        Bitmap bitmap = this.f141012b;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "BookmarksViewModel(bookmark=" + this.f141011a + ", icon=" + this.f141012b + ")";
    }

    public /* synthetic */ r(T3.a aVar, Bitmap bitmap, int i10, C4969v c4969v) {
        this(aVar, (i10 & 2) != 0 ? null : bitmap);
    }
}
