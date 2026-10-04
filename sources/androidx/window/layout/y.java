package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.C4967t;
import kotlin.jvm.internal.O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f120187a = a.f120188a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f120189b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f120188a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static final String f120190c = ((C4967t) O.f217893a.d(y.class)).Q();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static z f120191d = n.f120143a;

        @dd.o
        @dd.j(name = "getOrCreate")
        @NotNull
        public final y a(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            return f120191d.a(new WindowInfoTrackerImpl(G.f120088b, d(context)));
        }

        @dd.o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void b(@NotNull z overridingDecorator) {
            kotlin.jvm.internal.G.p(overridingDecorator, "overridingDecorator");
            f120191d = overridingDecorator;
        }

        @dd.o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void c() {
            f120191d = n.f120143a;
        }

        @NotNull
        public final w d(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            p pVar = null;
            try {
                WindowLayoutComponent windowLayoutComponentM = SafeWindowLayoutComponentProvider.f120090a.m();
                if (windowLayoutComponentM != null) {
                    pVar = new p(windowLayoutComponentM);
                }
            } catch (Throwable unused) {
                if (f120189b) {
                    Log.d(f120190c, "Failed to load WindowExtensions");
                }
            }
            return pVar == null ? u.f120173c.a(context) : pVar;
        }
    }

    @NotNull
    kotlinx.coroutines.flow.e<B> a(@NotNull Activity activity);
}
