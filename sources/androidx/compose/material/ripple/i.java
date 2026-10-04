package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<h, k> f98882a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<k, h> f98883b = new LinkedHashMap();

    @Nullable
    public final h a(@NotNull k kVar) {
        return this.f98883b.get(kVar);
    }

    @Nullable
    public final k b(@NotNull h hVar) {
        return this.f98882a.get(hVar);
    }

    public final void c(@NotNull h hVar) {
        k kVar = this.f98882a.get(hVar);
        if (kVar != null) {
            this.f98883b.remove(kVar);
        }
        this.f98882a.remove(hVar);
    }

    public final void d(@NotNull h hVar, @NotNull k kVar) {
        this.f98882a.put(hVar, kVar);
        this.f98883b.put(kVar, hVar);
    }
}
