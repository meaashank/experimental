package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface WindowMetricsCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f120134a = Companion.f120135a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f120135a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static ed.l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> f120136b = new ed.l<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @NotNull
            public final WindowMetricsCalculator e(@NotNull WindowMetricsCalculator it) {
                kotlin.jvm.internal.G.p(it, "it");
                return it;
            }

            @Override // ed.l
            public WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
                WindowMetricsCalculator it = windowMetricsCalculator;
                kotlin.jvm.internal.G.p(it, "it");
                return it;
            }
        };

        @dd.o
        @NotNull
        public final WindowMetricsCalculator a() {
            return f120136b.invoke(G.f120088b);
        }

        @androidx.window.core.d
        @dd.o
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void b(@NotNull H overridingDecorator) {
            kotlin.jvm.internal.G.p(overridingDecorator, "overridingDecorator");
            f120136b = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @androidx.window.core.d
        @dd.o
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void c() {
            f120136b = WindowMetricsCalculator$Companion$reset$1.f120138d;
        }
    }

    @NotNull
    C a(@NotNull Activity activity);

    @NotNull
    C b(@NotNull Activity activity);
}
