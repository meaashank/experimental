package androidx.compose.runtime;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1884a0
@androidx.compose.runtime.internal.r(parameters = 0)
public final class F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99119c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public androidx.compose.runtime.tooling.e f99120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f99121b;

    /* JADX WARN: Multi-variable type inference failed */
    public F() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final androidx.compose.runtime.tooling.e a() {
        return this.f99120a;
    }

    public final boolean b() {
        return this.f99121b;
    }

    public final void c(@Nullable androidx.compose.runtime.tooling.e eVar) {
        this.f99120a = eVar;
    }

    public final void d(boolean z10) {
        this.f99121b = z10;
    }

    public F(@Nullable androidx.compose.runtime.tooling.e eVar, boolean z10) {
        this.f99120a = eVar;
        this.f99121b = z10;
    }

    public /* synthetic */ F(androidx.compose.runtime.tooling.e eVar, boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : eVar, (i10 & 2) != 0 ? false : z10);
    }
}
