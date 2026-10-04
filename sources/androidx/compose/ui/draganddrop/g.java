package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100462d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClipData f100463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f100464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100465c;

    public g(@NotNull ClipData clipData, @Nullable Object obj, int i10) {
        this.f100463a = clipData;
        this.f100464b = obj;
        this.f100465c = i10;
    }

    @NotNull
    public final ClipData a() {
        return this.f100463a;
    }

    public final int b() {
        return this.f100465c;
    }

    @Nullable
    public final Object c() {
        return this.f100464b;
    }

    public /* synthetic */ g(ClipData clipData, Object obj, int i10, int i11, C4969v c4969v) {
        this(clipData, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? 0 : i10);
    }
}
