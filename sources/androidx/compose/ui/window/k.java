package androidx.compose.ui.window;

import androidx.compose.animation.C1635o;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105748g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f105752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f105753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f105754f;

    public k(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f105749a = i10;
        this.f105750b = z10;
        this.f105751c = z11;
        this.f105752d = z12;
        this.f105753e = z13;
        this.f105754f = z14;
    }

    public final boolean a() {
        return (this.f105749a & 512) == 0;
    }

    public final boolean b() {
        return this.f105751c;
    }

    public final boolean c() {
        return this.f105752d;
    }

    public final boolean d() {
        return this.f105753e;
    }

    public final int e() {
        return this.f105749a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f105749a == kVar.f105749a && this.f105750b == kVar.f105750b && this.f105751c == kVar.f105751c && this.f105752d == kVar.f105752d && this.f105753e == kVar.f105753e && this.f105754f == kVar.f105754f;
    }

    public final boolean f() {
        return (this.f105749a & 8) == 0;
    }

    public final boolean g() {
        return this.f105750b;
    }

    @NotNull
    public final SecureFlagPolicy h() {
        return this.f105750b ? SecureFlagPolicy.Inherit : (this.f105749a & 8192) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public int hashCode() {
        return C1635o.a(this.f105754f) + ((C1635o.a(this.f105753e) + ((C1635o.a(this.f105752d) + ((C1635o.a(this.f105751c) + ((C1635o.a(this.f105750b) + (this.f105749a * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.f105754f;
    }

    public /* synthetic */ k(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i11, C4969v c4969v) {
        this(i10, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? true : z13, (i11 & 32) != 0 ? false : z14);
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, boolean z13, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public k(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, SecureFlagPolicy.Inherit, true, z13, false);
    }

    public k(boolean z10, boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true, false);
    }

    public k(boolean z10, boolean z11, boolean z12, @NotNull SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14) {
        this(z10, z11, z12, secureFlagPolicy, z13, z14, false);
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, boolean z15, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? true : z14, (i10 & 64) != 0 ? false : z15);
    }

    public k(boolean z10, boolean z11, boolean z12, @NotNull SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, boolean z15) {
        this(AndroidPopup_androidKt.j(z10, secureFlagPolicy, z14), secureFlagPolicy == SecureFlagPolicy.Inherit, z11, z12, z13, z15);
    }
}
