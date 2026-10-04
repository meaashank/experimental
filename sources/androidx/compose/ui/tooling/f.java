package androidx.compose.ui.tooling;

import android.util.Log;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f105421a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f105422b = 0;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ void b(a aVar, String str, Throwable th, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th = null;
            }
            aVar.a(str, th);
        }

        public static /* synthetic */ void d(a aVar, String str, Throwable th, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th = null;
            }
            aVar.c(str, th);
        }

        public final void a(@NotNull String str, @Nullable Throwable th) {
            Log.e(g.f105423a, str, th);
        }

        public final void c(@NotNull String str, @Nullable Throwable th) {
            Log.w(g.f105423a, str, th);
        }

        public a(C4969v c4969v) {
        }
    }
}
