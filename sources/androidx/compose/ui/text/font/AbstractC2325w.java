package androidx.compose.ui.text.font;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.X1;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class AbstractC2325w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104659c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104658b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final d0 f104660d = new C2316m(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final P f104661e = new P("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final P f104662f = new P("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final P f104663g = new P("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final P f104664h = new P("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.w$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final P a() {
            return AbstractC2325w.f104664h;
        }

        @NotNull
        public final d0 b() {
            return AbstractC2325w.f104660d;
        }

        @NotNull
        public final P c() {
            return AbstractC2325w.f104663g;
        }

        @NotNull
        public final P d() {
            return AbstractC2325w.f104661e;
        }

        @NotNull
        public final P e() {
            return AbstractC2325w.f104662f;
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.w$b */
    public interface b {
        @Nullable
        Object a(@NotNull AbstractC2325w abstractC2325w, @NotNull kotlin.coroutines.e<? super L0> eVar);

        @NotNull
        X1<Object> b(@Nullable AbstractC2325w abstractC2325w, @NotNull L l10, int i10, int i11);
    }

    public /* synthetic */ AbstractC2325w(boolean z10, C4969v c4969v) {
        this(z10);
    }

    public static /* synthetic */ void q() {
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean o() {
        return this.f104665a;
    }

    public AbstractC2325w(boolean z10) {
        this.f104665a = z10;
    }
}
