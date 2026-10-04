package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.K;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class AbstractC2313j extends AbstractC2307d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f104621k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final L f104622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f104623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f104624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Typeface f104625j;

    public /* synthetic */ AbstractC2313j(L l10, int i10, K.e eVar, C4969v c4969v) {
        this(l10, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    public final int b() {
        return this.f104623h;
    }

    @Nullable
    public abstract Typeface e(@Nullable Context context);

    @Nullable
    public abstract String f();

    @Nullable
    public final Typeface g() {
        return this.f104625j;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    @NotNull
    public final L getWeight() {
        return this.f104622g;
    }

    @Nullable
    public final Typeface h(@NotNull Context context) {
        if (!this.f104624i && this.f104625j == null) {
            this.f104625j = e(context);
        }
        this.f104624i = true;
        return this.f104625j;
    }

    public final void i(@Nullable Typeface typeface) {
        this.f104625j = typeface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2313j(L l10, int i10, K.e eVar) {
        super(F.f104480c, C2314k.f104626a, eVar);
        F.f104479b.getClass();
        this.f104622g = l10;
        this.f104623h = i10;
    }
}
