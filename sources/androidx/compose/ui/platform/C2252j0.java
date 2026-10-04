package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.c;
import ed.InterfaceC4376a;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2252j0 implements androidx.compose.runtime.saveable.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103883c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<kotlin.L0> f103884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.c f103885b;

    public C2252j0(@NotNull androidx.compose.runtime.saveable.c cVar, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        this.f103884a = interfaceC4376a;
        this.f103885b = cVar;
    }

    @Override // androidx.compose.runtime.saveable.c
    public boolean a(@NotNull Object obj) {
        return this.f103885b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.c
    @NotNull
    public c.a b(@NotNull String str, @NotNull InterfaceC4376a<? extends Object> interfaceC4376a) {
        return this.f103885b.b(str, interfaceC4376a);
    }

    @Override // androidx.compose.runtime.saveable.c
    @NotNull
    public Map<String, List<Object>> c() {
        return this.f103885b.c();
    }

    public final void d() {
        this.f103884a.invoke();
    }

    @Override // androidx.compose.runtime.saveable.c
    @Nullable
    public Object e(@NotNull String str) {
        return this.f103885b.e(str);
    }
}
