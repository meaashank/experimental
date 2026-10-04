package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class FlowKt__CollectionKt {

    public static final class a<T> implements f {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f219416a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public a(Collection collection) {
            this.f219416a = collection;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        public final Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            this.f219416a.add(t10);
            return L0.f217464a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.e<? extends T> r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super C> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) r0
            int r1 = r0.f219419c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219419c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f219418b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219419c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f219417a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.C4885d0.n(r6)
            return r4
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C4885d0.n(r6)
            kotlinx.coroutines.flow.FlowKt__CollectionKt$a r6 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$a
            r6.<init>(r5)
            r0.f219417a = r5
            r0.f219419c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__CollectionKt.a(kotlinx.coroutines.flow.e, java.util.Collection, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final <T> Object b(@NotNull e<? extends T> eVar, @NotNull List<T> list, @NotNull kotlin.coroutines.e<? super List<? extends T>> eVar2) {
        return a(eVar, list, eVar2);
    }

    public static Object c(e eVar, List list, kotlin.coroutines.e eVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return a(eVar, list, eVar2);
    }

    @Nullable
    public static final <T> Object d(@NotNull e<? extends T> eVar, @NotNull Set<T> set, @NotNull kotlin.coroutines.e<? super Set<? extends T>> eVar2) {
        return a(eVar, set, eVar2);
    }

    public static Object e(e eVar, Set set, kotlin.coroutines.e eVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return a(eVar, set, eVar2);
    }
}
