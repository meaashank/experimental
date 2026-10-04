package kotlin.reflect;

import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,46:1\n9#2:47\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n25#1:47\n*E\n"})
@dd.j(name = "KClasses")
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @Xc.i
    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T> T a(@NotNull d<T> dVar, @Nullable Object obj) {
        G.p(dVar, "<this>");
        if (dVar.J(obj)) {
            G.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.i
    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T b(@NotNull d<T> dVar, @Nullable Object obj) {
        G.p(dVar, "<this>");
        if (!dVar.J(obj)) {
            return null;
        }
        G.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
