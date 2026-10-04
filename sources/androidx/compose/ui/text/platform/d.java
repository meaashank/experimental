package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.text.font.C2312i;
import androidx.compose.ui.text.font.H;
import androidx.compose.ui.text.font.L;
import androidx.compose.ui.text.font.P;
import androidx.compose.ui.text.font.p0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "This path for preloading loading fonts is not supported.")
@androidx.compose.runtime.internal.r(parameters = 0)
public final class d implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104911c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC2325w f104912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Typeface f104913b;

    public d(@NotNull P p10) {
        this.f104912a = p10;
        Typeface typefaceCreate = Typeface.create(p10.f104578j, 0);
        G.m(typefaceCreate);
        this.f104913b = typefaceCreate;
    }

    @Override // androidx.compose.ui.text.font.e0
    @NotNull
    public AbstractC2325w a() {
        return this.f104912a;
    }

    @Override // androidx.compose.ui.text.platform.m
    @NotNull
    public Typeface b(@NotNull L l10, int i10, int i11) {
        return c(l10, i10);
    }

    public final Typeface c(L l10, int i10) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.f104913b, C2312i.c(l10, i10));
        }
        p0 p0Var = p0.f104636a;
        Typeface typeface = this.f104913b;
        int i11 = l10.f104572a;
        H.f104527b.getClass();
        return p0Var.a(typeface, i11, i10 == H.f104529d);
    }
}
