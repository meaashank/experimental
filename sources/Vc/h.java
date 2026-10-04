package Vc;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f76436a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f76437b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static a f76438c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @Nullable
        public final Method f76439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dd.g
        @Nullable
        public final Method f76440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @Nullable
        public final Method f76441c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f76439a = method;
            this.f76440b = method2;
            this.f76441c = method3;
        }
    }

    public final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f76438c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f76437b;
            f76438c = aVar2;
            return aVar2;
        }
    }

    @Nullable
    public final String b(@NotNull BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        G.p(continuation, "continuation");
        a aVarA = f76438c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f76437b && (method = aVarA.f76439a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f76440b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f76441c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
