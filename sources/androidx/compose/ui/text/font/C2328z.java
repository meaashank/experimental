package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2328z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TypefaceRequestCache f104666a = new TypefaceRequestCache();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AsyncTypefaceCache f104667b = new AsyncTypefaceCache();

    @NotNull
    public static final AsyncTypefaceCache a() {
        return f104667b;
    }

    @NotNull
    public static final TypefaceRequestCache b() {
        return f104666a;
    }
}
