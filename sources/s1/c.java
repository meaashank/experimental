package S1;

import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import dd.C4325b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements m0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f68111b = new c();

    @Override // androidx.lifecycle.m0.c
    public /* synthetic */ k0 a(Class cls, R1.a aVar) {
        return n0.b(this, cls, aVar);
    }

    @Override // androidx.lifecycle.m0.c
    public /* synthetic */ k0 b(Class cls) {
        n0.a(this, cls);
        throw null;
    }

    @Override // androidx.lifecycle.m0.c
    @NotNull
    public <T extends k0> T c(@NotNull kotlin.reflect.d<T> modelClass, @NotNull R1.a extras) {
        G.p(modelClass, "modelClass");
        G.p(extras, "extras");
        return (T) d.f68112a.a(C4325b.e(modelClass));
    }
}
