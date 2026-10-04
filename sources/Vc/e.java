package Vc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,158:1\n37#2,2:159\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:159,2\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f76434a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76435b = 2;

    public static final d a(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    public static final int b(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @InterfaceC4887e0(version = "2.2")
    @InterfaceC4850b0
    public static final int c(@NotNull BaseContinuationImpl baseContinuationImpl) {
        int iB;
        G.p(baseContinuationImpl, "<this>");
        d dVarA = a(baseContinuationImpl);
        if (dVarA != null && dVarA.v() >= 2 && (iB = b(baseContinuationImpl)) >= 0 && iB < dVarA.nl().length) {
            return dVarA.nl()[iB];
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "getSpilledVariableFieldMapping")
    @Nullable
    @InterfaceC4850b0
    public static final String[] d(@NotNull BaseContinuationImpl baseContinuationImpl) {
        G.p(baseContinuationImpl, "<this>");
        d dVarA = a(baseContinuationImpl);
        if (dVarA == null || dVarA.v() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iB = b(baseContinuationImpl);
        int[] iArrI = dVarA.i();
        int length = iArrI.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArrI[i10] == iB) {
                arrayList.add(dVarA.s()[i10]);
                arrayList.add(dVarA.n()[i10]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "getStackTraceElement")
    @Nullable
    @InterfaceC4850b0
    public static final StackTraceElement e(@NotNull BaseContinuationImpl baseContinuationImpl) {
        String strC;
        G.p(baseContinuationImpl, "<this>");
        d dVarA = a(baseContinuationImpl);
        if (dVarA == null || dVarA.v() < 1) {
            return null;
        }
        int iB = b(baseContinuationImpl);
        int i10 = iB < 0 ? -1 : dVarA.l()[iB];
        String strB = h.f76436a.b(baseContinuationImpl);
        if (strB == null) {
            strC = dVarA.c();
        } else {
            strC = strB + '/' + dVarA.c();
        }
        return new StackTraceElement(strC, dVarA.m(), dVarA.f(), i10);
    }
}
