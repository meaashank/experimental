package androidx.compose.ui.window;

import androidx.compose.animation.C1635o;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105741f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SecureFlagPolicy f105744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f105745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f105746e;

    public d() {
        this(false, false, null, false, false, 31, null);
    }

    public final boolean a() {
        return this.f105746e;
    }

    public final boolean b() {
        return this.f105742a;
    }

    public final boolean c() {
        return this.f105743b;
    }

    @NotNull
    public final SecureFlagPolicy d() {
        return this.f105744c;
    }

    public final boolean e() {
        return this.f105745d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f105742a == dVar.f105742a && this.f105743b == dVar.f105743b && this.f105744c == dVar.f105744c && this.f105745d == dVar.f105745d && this.f105746e == dVar.f105746e;
    }

    public int hashCode() {
        return C1635o.a(this.f105746e) + ((C1635o.a(this.f105745d) + ((this.f105744c.hashCode() + ((C1635o.a(this.f105743b) + (C1635o.a(this.f105742a) * 31)) * 31)) * 31)) * 31);
    }

    public d(boolean z10, boolean z11, @NotNull SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13) {
        this.f105742a = z10;
        this.f105743b = z11;
        this.f105744c = secureFlagPolicy;
        this.f105745d = z12;
        this.f105746e = z13;
    }

    public /* synthetic */ d(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public /* synthetic */ d(boolean z10, boolean z11, boolean z12, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, SecureFlagPolicy.Inherit, z12, true);
    }

    public /* synthetic */ d(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ d(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy) {
        this(z10, z11, secureFlagPolicy, true, true);
    }
}
