package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.u;
import androidx.savedstate.d;
import ed.InterfaceC4376a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
public final class DisposableSaveableStateRegistry_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Class<? extends Object>[] f103526a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @NotNull
    public static final C2252j0 b(@NotNull View view, @NotNull androidx.savedstate.f fVar) {
        Object parent = view.getParent();
        kotlin.jvm.internal.G.n(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(u.b.f105451H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, fVar);
    }

    @NotNull
    public static final C2252j0 c(@NotNull String str, @NotNull androidx.savedstate.f fVar) {
        final boolean z10;
        final String str2 = androidx.compose.runtime.saveable.c.class.getSimpleName() + ':' + str;
        final androidx.savedstate.d savedStateRegistry = fVar.getSavedStateRegistry();
        Bundle bundleB = savedStateRegistry.b(str2);
        final androidx.compose.runtime.saveable.c cVarA = SaveableStateRegistryKt.a(bundleB != null ? h(bundleB) : null, new ed.l<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.f(obj));
            }
        });
        try {
            savedStateRegistry.j(str2, new d.c() { // from class: androidx.compose.ui.platform.k0
                @Override // androidx.savedstate.d.c
                public final Bundle a() {
                    return DisposableSaveableStateRegistry_androidKt.d(cVarA);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C2252j0(cVarA, new InterfaceC4376a<kotlin.L0>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
                invoke2();
                return kotlin.L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z10) {
                    savedStateRegistry.m(str2);
                }
            }
        });
    }

    public static final Bundle d(androidx.compose.runtime.saveable.c cVar) {
        return g(cVar.c());
    }

    public static final boolean f(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.v) {
            androidx.compose.runtime.snapshots.v vVar = (androidx.compose.runtime.snapshots.v) obj;
            if (vVar.getPolicy() == androidx.compose.runtime.L1.a() || vVar.getPolicy() == androidx.compose.runtime.L1.c() || vVar.getPolicy() == androidx.compose.runtime.L1.b()) {
                T value = vVar.getValue();
                if (value == 0) {
                    return true;
                }
                return f(value);
            }
        } else {
            if ((obj instanceof kotlin.A) && (obj instanceof Serializable)) {
                return false;
            }
            for (Class<? extends Object> cls : f103526a) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    public static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.G.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
