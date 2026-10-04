package androidx.compose.ui.layout;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102533d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.p f102534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC2188x f102535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Object f102536c;

    public Z(@NotNull androidx.compose.ui.p pVar, @NotNull InterfaceC2188x interfaceC2188x, @Nullable Object obj) {
        this.f102534a = pVar;
        this.f102535b = interfaceC2188x;
        this.f102536c = obj;
    }

    @NotNull
    public final InterfaceC2188x a() {
        return this.f102535b;
    }

    @Nullable
    public final Object b() {
        return this.f102536c;
    }

    @NotNull
    public final androidx.compose.ui.p c() {
        return this.f102534a;
    }

    @NotNull
    public String toString() {
        return "ModifierInfo(" + this.f102534a + U6.j.f68738d + this.f102535b + U6.j.f68738d + this.f102536c + ')';
    }

    public /* synthetic */ Z(androidx.compose.ui.p pVar, InterfaceC2188x interfaceC2188x, Object obj, int i10, C4969v c4969v) {
        this(pVar, interfaceC2188x, (i10 & 4) != 0 ? null : obj);
    }
}
