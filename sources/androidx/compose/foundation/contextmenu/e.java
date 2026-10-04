package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.j;
import k0.u;
import k0.v;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class e implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89044b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89045a;

    public /* synthetic */ e(long j10, C4969v c4969v) {
        this(j10);
    }

    @Override // androidx.compose.ui.window.j
    public long a(@NotNull v vVar, long j10, @NotNull LayoutDirection layoutDirection, long j11) {
        return u.a(f.b(vVar.f214334a + ((int) (this.f89045a >> 32)), (int) (j11 >> 32), (int) (j10 >> 32), layoutDirection == LayoutDirection.Ltr), f.c(vVar.f214335b + ((int) (this.f89045a & ZipKt.f225990j)), (int) (j11 & ZipKt.f225990j), (int) (ZipKt.f225990j & j10), false, 8, null));
    }

    public e(long j10) {
        this.f89045a = j10;
    }
}
