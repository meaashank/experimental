package S1;

import R1.a;
import androidx.lifecycle.InterfaceC2605s;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import ed.l;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n37#2,2:100\n1282#3,2:102\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n59#1:100,2\n85#1:102,2\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f68117a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f68118b = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    public static final class a implements a.b<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68119a = new a();
    }

    @NotNull
    public final m0.c a(@NotNull Collection<? extends R1.h<?>> initializers) {
        G.p(initializers, "initializers");
        R1.h[] hVarArr = (R1.h[]) initializers.toArray(new R1.h[0]);
        return new R1.b((R1.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
    }

    @NotNull
    public final m0.c b(@NotNull R1.h<?>... initializers) {
        G.p(initializers, "initializers");
        return new R1.b((R1.h[]) Arrays.copyOf(initializers, initializers.length));
    }

    @NotNull
    public final <VM extends k0> VM c(@NotNull kotlin.reflect.d<VM> modelClass, @NotNull R1.a extras, @NotNull R1.h<?>... initializers) {
        VM vm;
        R1.h<?> hVar;
        l<R1.a, T> lVar;
        G.p(modelClass, "modelClass");
        G.p(extras, "extras");
        G.p(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm = null;
            if (i10 >= length) {
                hVar = null;
                break;
            }
            hVar = initializers[i10];
            if (G.g(hVar.f67692a, modelClass)) {
                break;
            }
            i10++;
        }
        if (hVar != null && (lVar = hVar.f67693b) != 0) {
            vm = (VM) lVar.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + modelClass.k()).toString());
    }

    @NotNull
    public final R1.a d(@NotNull q0 owner) {
        G.p(owner, "owner");
        return owner instanceof InterfaceC2605s ? ((InterfaceC2605s) owner).getDefaultViewModelCreationExtras() : a.C0103a.f67688b;
    }

    @NotNull
    public final m0.c e(@NotNull q0 owner) {
        G.p(owner, "owner");
        return owner instanceof InterfaceC2605s ? ((InterfaceC2605s) owner).getDefaultViewModelProviderFactory() : c.f68111b;
    }

    @NotNull
    public final <T extends k0> String f(@NotNull kotlin.reflect.d<T> modelClass) {
        G.p(modelClass, "modelClass");
        String strK = modelClass.k();
        if (strK != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @NotNull
    public final <VM extends k0> VM g() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
