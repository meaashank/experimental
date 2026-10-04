package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.InterfaceC2324v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2317n implements U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104628d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2324v.b f104629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f104631c = new Object();

    public C2317n(@NotNull InterfaceC2324v.b bVar, @NotNull Context context) {
        this.f104629a = bVar;
        this.f104630b = context;
    }

    @Override // androidx.compose.ui.text.font.U
    @NotNull
    public Object a() {
        return this.f104631c;
    }

    @Override // androidx.compose.ui.text.font.U
    @Nullable
    public Object b(@NotNull InterfaceC2324v interfaceC2324v, @NotNull kotlin.coroutines.e<Object> eVar) {
        if (!(interfaceC2324v instanceof AbstractC2307d)) {
            return this.f104629a.a(interfaceC2324v);
        }
        AbstractC2307d abstractC2307d = (AbstractC2307d) interfaceC2324v;
        abstractC2307d.f104614d.b(this.f104630b, abstractC2307d, eVar);
        throw null;
    }

    @Override // androidx.compose.ui.text.font.U
    @Nullable
    public Object c(@NotNull InterfaceC2324v interfaceC2324v) {
        if (!(interfaceC2324v instanceof AbstractC2307d)) {
            return this.f104629a.a(interfaceC2324v);
        }
        AbstractC2307d abstractC2307d = (AbstractC2307d) interfaceC2324v;
        return abstractC2307d.f104614d.a(this.f104630b, abstractC2307d);
    }

    @NotNull
    public final InterfaceC2324v.b d() {
        return this.f104629a;
    }
}
