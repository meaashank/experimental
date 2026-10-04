package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.C2406e;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,259:1\n37#2,2:260\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n*L\n206#1:260,2\n*E\n"})
@z
public final class C2623k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f115282b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public NavOptions f115283c;

    @NotNull
    public final C2622j a() {
        Bundle bundleB;
        int i10 = this.f115281a;
        NavOptions navOptions = this.f115283c;
        if (this.f115282b.isEmpty()) {
            bundleB = null;
        } else {
            Pair[] pairArr = (Pair[]) p0.J1(this.f115282b).toArray(new Pair[0]);
            bundleB = C2406e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new C2622j(i10, navOptions, bundleB);
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f115282b;
    }

    public final int c() {
        return this.f115281a;
    }

    public final void d(@NotNull ed.l<? super NavOptionsBuilder, L0> optionsBuilder) {
        kotlin.jvm.internal.G.p(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.f115283c = navOptionsBuilder.b();
    }

    public final void e(int i10) {
        this.f115281a = i10;
    }
}
