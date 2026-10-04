package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2098q2 {

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.q2$a */
    public static final class a extends AbstractC2098q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Path f101393a;

        public a(@NotNull Path path) {
            this.f101393a = path;
        }

        @Override // androidx.compose.ui.graphics.AbstractC2098q2
        @NotNull
        public P.j a() {
            return this.f101393a.getBounds();
        }

        @NotNull
        public final Path b() {
            return this.f101393a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.q2$b */
    @InterfaceC1924k0
    public static final class b extends AbstractC2098q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final P.j f101394a;

        public b(@NotNull P.j jVar) {
            this.f101394a = jVar;
        }

        @Override // androidx.compose.ui.graphics.AbstractC2098q2
        @NotNull
        public P.j a() {
            return this.f101394a;
        }

        @NotNull
        public final P.j b() {
            return this.f101394a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.G.g(this.f101394a, ((b) obj).f101394a);
        }

        public int hashCode() {
            return this.f101394a.hashCode();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.q2$c */
    @kotlin.jvm.internal.V({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
    @InterfaceC1924k0
    public static final class c extends AbstractC2098q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final P.l f101395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Path f101396b;

        public c(@NotNull P.l lVar) {
            this.f101395a = lVar;
            Path path = null;
            if (!P.m.q(lVar)) {
                Path pathA = C2031g0.a();
                C2117v2.B(pathA, lVar, null, 2, null);
                path = pathA;
            }
            this.f101396b = path;
        }

        @Override // androidx.compose.ui.graphics.AbstractC2098q2
        @NotNull
        public P.j a() {
            return P.m.g(this.f101395a);
        }

        @NotNull
        public final P.l b() {
            return this.f101395a;
        }

        @Nullable
        public final Path c() {
            return this.f101396b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.G.g(this.f101395a, ((c) obj).f101395a);
        }

        public int hashCode() {
            return this.f101395a.hashCode();
        }
    }

    public AbstractC2098q2() {
    }

    @NotNull
    public abstract P.j a();

    public AbstractC2098q2(C4969v c4969v) {
    }
}
