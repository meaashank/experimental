package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.InterfaceC2324v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2318o implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104633c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2324v.b f104634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f104635b = new Object();

    public C2318o(@NotNull InterfaceC2324v.b bVar) {
        this.f104634a = bVar;
    }

    @Override // androidx.compose.ui.text.font.U
    @NotNull
    public Object a() {
        return this.f104635b;
    }

    @Override // androidx.compose.ui.text.font.U
    @Nullable
    public Object b(@NotNull InterfaceC2324v interfaceC2324v, @NotNull kotlin.coroutines.e<Object> eVar) {
        return this.f104634a.a(interfaceC2324v);
    }

    @Override // androidx.compose.ui.text.font.U
    @NotNull
    public Object c(@NotNull InterfaceC2324v interfaceC2324v) {
        return this.f104634a.a(interfaceC2324v);
    }

    @NotNull
    public final InterfaceC2324v.b d() {
        return this.f104634a;
    }
}
