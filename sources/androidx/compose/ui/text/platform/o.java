package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.text.font.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class o implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104924c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Typeface f104925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AbstractC2325w f104926b;

    public o(@NotNull Typeface typeface) {
        this.f104925a = typeface;
    }

    @Override // androidx.compose.ui.text.font.e0
    @Nullable
    public AbstractC2325w a() {
        return this.f104926b;
    }

    @Override // androidx.compose.ui.text.platform.m
    @NotNull
    public Typeface b(@NotNull L l10, int i10, int i11) {
        return this.f104925a;
    }

    @NotNull
    public final Typeface c() {
        return this.f104925a;
    }
}
