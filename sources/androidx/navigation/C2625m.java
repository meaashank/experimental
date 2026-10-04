package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.InterfaceC2624l;
import dd.C4325b;
import ed.InterfaceC4376a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2625m<Args extends InterfaceC2624l> implements kotlin.G<Args> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.reflect.d<Args> f115284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Bundle> f115285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Args f115286c;

    public C2625m(@NotNull kotlin.reflect.d<Args> navArgsClass, @NotNull InterfaceC4376a<Bundle> argumentProducer) {
        kotlin.jvm.internal.G.p(navArgsClass, "navArgsClass");
        kotlin.jvm.internal.G.p(argumentProducer, "argumentProducer");
        this.f115284a = navArgsClass;
        this.f115285b = argumentProducer;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.G
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.f115286c;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.f115285b.invoke();
        Method method = C2626n.a().get(this.f115284a);
        if (method == null) {
            Class clsE = C4325b.e(this.f115284a);
            Class<Bundle>[] clsArr = C2626n.f115287a;
            method = clsE.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            C2626n.f115288b.put((kotlin.reflect.d<? extends InterfaceC2624l>) this.f115284a, method);
            kotlin.jvm.internal.G.o(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        kotlin.jvm.internal.G.n(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.f115286c = args2;
        return args2;
    }

    @Override // kotlin.G
    public boolean isInitialized() {
        return this.f115286c != null;
    }
}
