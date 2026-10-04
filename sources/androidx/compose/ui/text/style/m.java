package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.Y2;
import androidx.compose.ui.graphics.d3;
import ed.InterfaceC4376a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f105031a = a.f105032a;

    @V({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,150:1\n696#2:151\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n78#1:151\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f105032a = new a();

        @NotNull
        public final m a(@Nullable AbstractC2131z0 abstractC2131z0, float f10) {
            if (abstractC2131z0 == null) {
                return b.f105033b;
            }
            if (abstractC2131z0 instanceof d3) {
                return b(l.c(((d3) abstractC2131z0).f101064c, f10));
            }
            if (abstractC2131z0 instanceof Y2) {
                return new c((Y2) abstractC2131z0, f10);
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final m b(long j10) {
            return j10 != 16 ? new d(j10) : b.f105033b;
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f105033b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f105034c = 0;

        @Override // androidx.compose.ui.text.style.m
        public long a() {
            K0.f100733b.getClass();
            return K0.f100746o;
        }

        @Override // androidx.compose.ui.text.style.m
        public /* synthetic */ m b(InterfaceC4376a interfaceC4376a) {
            return TextForegroundStyle$CC.b(this, interfaceC4376a);
        }

        @Override // androidx.compose.ui.text.style.m
        public /* synthetic */ m c(m mVar) {
            return TextForegroundStyle$CC.a(this, mVar);
        }

        @Override // androidx.compose.ui.text.style.m
        @Nullable
        public AbstractC2131z0 d() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.m
        public float f() {
            return Float.NaN;
        }
    }

    long a();

    @NotNull
    m b(@NotNull InterfaceC4376a<? extends m> interfaceC4376a);

    @NotNull
    m c(@NotNull m mVar);

    @Nullable
    AbstractC2131z0 d();

    float f();
}
