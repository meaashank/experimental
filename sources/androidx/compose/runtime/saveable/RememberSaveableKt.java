package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.C1932n;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.H1;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.L1;
import androidx.compose.runtime.snapshots.v;
import ed.InterfaceC4376a;
import ed.l;
import ed.p;
import java.util.Arrays;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.C5011c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n77#2:275\n1225#3,6:276\n1225#3,6:282\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:275\n84#1:276,6\n94#1:282,6\n*E\n"})
public final class RememberSaveableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99980a = 36;

    @NotNull
    public static final String b(@NotNull Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> e<L0<T>, L0<Object>> c(final e<T, ? extends Object> eVar) {
        G.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.a(new p<f, L0<T>, L0<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // ed.p
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final L0<Object> invoke(@NotNull f fVar, @NotNull L0<T> l02) {
                if (!(l02 instanceof v)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object objA = eVar.a(fVar, l02.getValue());
                if (objA == null) {
                    return null;
                }
                H1<T> policy = ((v) l02).getPolicy();
                G.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return ActualAndroid_androidKt.e(objA, policy);
            }
        }, new l<L0<Object>, L0<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final L0<T> invoke(@NotNull L0<Object> l02) {
                T tB;
                if (!(l02 instanceof v)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (l02.getValue() != null) {
                    e<T, Object> eVar2 = eVar;
                    Object value = l02.getValue();
                    G.m(value);
                    tB = eVar2.b(value);
                } else {
                    tB = null;
                }
                H1<T> policy = ((v) l02).getPolicy();
                G.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
                return ActualAndroid_androidKt.e(tB, policy);
            }
        });
    }

    @InterfaceC1917i
    @NotNull
    public static final <T> L0<T> d(@NotNull Object[] objArr, @NotNull e<T, ? extends Object> eVar, @Nullable String str, @NotNull InterfaceC4376a<? extends L0<T>> interfaceC4376a, @Nullable InterfaceC1946s interfaceC1946s, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (C1968u.c0()) {
            C1968u.p0(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        L0<T> l02 = (L0) e(Arrays.copyOf(objArr, objArr.length), c(eVar), str2, interfaceC4376a, interfaceC1946s, i10 & 8064, 0);
        if (C1968u.c0()) {
            C1968u.o0();
        }
        return l02;
    }

    @InterfaceC1917i
    @NotNull
    public static final <T> T e(@NotNull Object[] objArr, @Nullable e<T, ? extends Object> eVar, @Nullable String str, @NotNull InterfaceC4376a<? extends T> interfaceC4376a, @Nullable InterfaceC1946s interfaceC1946s, int i10, int i11) {
        Object[] objArr2;
        final T t10;
        Object objE;
        if ((i11 & 2) != 0) {
            eVar = SaverKt.b();
        }
        final e<T, ? extends Object> eVar2 = eVar;
        int i12 = i11 & 4;
        T tInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (C1968u.c0()) {
            C1968u.p0(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int iJ = C1932n.j(interfaceC1946s, 0);
        if (str == null || str.length() == 0) {
            int i13 = f99980a;
            C5011c.a(i13);
            str = Integer.toString(iJ, i13);
            G.o(str, "toString(this, checkRadix(radix))");
        }
        final String str2 = str;
        G.n(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final c cVar = (c) interfaceC1946s.Q(SaveableStateRegistryKt.d());
        Object objA0 = interfaceC1946s.a0();
        InterfaceC1946s.f99968a.getClass();
        Object obj = InterfaceC1946s.a.f99970b;
        if (objA0 == obj) {
            if (cVar != null && (objE = cVar.e(str2)) != null) {
                tInvoke = eVar2.b(objE);
            }
            if (tInvoke == null) {
                tInvoke = interfaceC4376a.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(eVar2, cVar, str2, tInvoke, objArr2);
            interfaceC1946s.S(saveableHolder);
            objA0 = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) objA0;
        Object objG = saveableHolder2.g(objArr2);
        if (objG == null) {
            objG = interfaceC4376a.invoke();
        }
        boolean zC0 = interfaceC1946s.c0(saveableHolder2) | ((((i10 & 112) ^ 48) > 32 && interfaceC1946s.c0(eVar2)) || (i10 & 48) == 32) | interfaceC1946s.c0(cVar) | interfaceC1946s.x(str2) | interfaceC1946s.c0(objG) | interfaceC1946s.c0(objArr2);
        Object objA02 = interfaceC1946s.a0();
        if (zC0 || objA02 == obj) {
            final Object[] objArr3 = objArr2;
            t10 = (T) objG;
            Object obj2 = new InterfaceC4376a<kotlin.L0>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
                    invoke2();
                    return kotlin.L0.f217464a;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    saveableHolder2.i(eVar2, cVar, str2, t10, objArr3);
                }
            };
            interfaceC1946s.S(obj2);
            objA02 = obj2;
        } else {
            t10 = (T) objG;
        }
        EffectsKt.k((InterfaceC4376a) objA02, interfaceC1946s, 0);
        if (C1968u.c0()) {
            C1968u.o0();
        }
        return t10;
    }

    public static final void f(c cVar, Object obj) {
        String strB;
        if (obj == null || cVar.a(obj)) {
            return;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (vVar.getPolicy() == L1.a() || vVar.getPolicy() == L1.c() || vVar.getPolicy() == L1.b()) {
                strB = "MutableState containing " + vVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strB = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strB = b(obj);
        }
        throw new IllegalArgumentException(strB);
    }
}
