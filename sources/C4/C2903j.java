package c4;

import android.graphics.drawable.Drawable;
import e.InterfaceC4337k;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2903j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f126150f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Drawable f126151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f126152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f126153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f126154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f126155e;

    public C2903j(@Nullable Drawable drawable, @InterfaceC4337k @Nullable Integer num, @e.Z int i10, boolean z10, @NotNull InterfaceC4376a<L0> onClick) {
        kotlin.jvm.internal.G.p(onClick, "onClick");
        this.f126151a = drawable;
        this.f126152b = num;
        this.f126153c = i10;
        this.f126154d = z10;
        this.f126155e = onClick;
    }

    @Nullable
    public final Integer a() {
        return this.f126152b;
    }

    @Nullable
    public final Drawable b() {
        return this.f126151a;
    }

    public final int c() {
        return this.f126153c;
    }

    public final boolean d() {
        return this.f126154d;
    }

    public final void e() {
        this.f126155e.invoke();
    }

    public /* synthetic */ C2903j(Drawable drawable, Integer num, int i10, boolean z10, InterfaceC4376a interfaceC4376a, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? null : drawable, (i11 & 2) != 0 ? null : num, i10, (i11 & 8) != 0 ? true : z10, interfaceC4376a);
    }
}
