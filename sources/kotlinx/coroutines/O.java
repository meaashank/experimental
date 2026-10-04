package kotlinx.coroutines;

import kotlin.C4885d0;
import kotlin.Result;
import kotlinx.coroutines.internal.C5079m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class O {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String c(@NotNull kotlin.coroutines.e<?> eVar) {
        Object objA;
        if (eVar instanceof C5079m) {
            return eVar.toString();
        }
        try {
            objA = eVar + '@' + b(eVar);
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        if (Result.e(objA) != null) {
            objA = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) objA;
    }
}
