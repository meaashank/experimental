package U0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: renamed from: U0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class C1279b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f68389a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68390b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68391c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68392d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68393e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68394f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68395g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68396h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f68397i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f68398j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f68399k = 63;

    /* JADX INFO: renamed from: U0.b$a */
    @T(24)
    public static class a {
        public static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        public static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        public static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    @NonNull
    public static Spanned a(@NonNull String str, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.a(str, i10) : Html.fromHtml(str);
    }

    @NonNull
    public static Spanned b(@NonNull String str, int i10, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? a.b(str, i10, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @NonNull
    public static String c(@NonNull Spanned spanned, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.c(spanned, i10) : Html.toHtml(spanned);
    }
}
