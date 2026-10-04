package androidx.compose.ui.semantics;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2287v0;
import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.A;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1747#2,3:200\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n78#1:200,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class l implements u, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104171d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<SemanticsPropertyKey<?>, Object> f104172a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104174c;

    public final void A(boolean z10) {
        this.f104173b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.u
    public <T> void b(@NotNull SemanticsPropertyKey<T> semanticsPropertyKey, T t10) {
        if (!(t10 instanceof a) || !this.f104172a.containsKey(semanticsPropertyKey)) {
            this.f104172a.put(semanticsPropertyKey, t10);
            return;
        }
        Object obj = this.f104172a.get(semanticsPropertyKey);
        G.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj;
        Map<SemanticsPropertyKey<?>, Object> map = this.f104172a;
        a aVar2 = (a) t10;
        String str = aVar2.f104099a;
        if (str == null) {
            str = aVar.f104099a;
        }
        A a10 = aVar2.f104100b;
        if (a10 == null) {
            a10 = aVar.f104100b;
        }
        map.put(semanticsPropertyKey, new a(str, a10));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return G.g(this.f104172a, lVar.f104172a) && this.f104173b == lVar.f104173b && this.f104174c == lVar.f104174c;
    }

    public final void g(@NotNull l lVar) {
        if (lVar.f104173b) {
            this.f104173b = true;
        }
        if (lVar.f104174c) {
            this.f104174c = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : lVar.f104172a.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f104172a.containsKey(key)) {
                this.f104172a.put(key, value);
            } else if (value instanceof a) {
                Object obj = this.f104172a.get(key);
                G.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.f104172a;
                String str = aVar.f104099a;
                if (str == null) {
                    str = ((a) value).f104099a;
                }
                A a10 = aVar.f104100b;
                if (a10 == null) {
                    a10 = ((a) value).f104100b;
                }
                map.put(key, new a(str, a10));
            }
        }
    }

    public final <T> boolean h(@NotNull SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.f104172a.containsKey(semanticsPropertyKey);
    }

    public int hashCode() {
        return C1635o.a(this.f104174c) + ((C1635o.a(this.f104173b) + (this.f104172a.hashCode() * 31)) * 31);
    }

    public final boolean i() {
        Set<SemanticsPropertyKey<?>> setKeySet = this.f104172a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((SemanticsPropertyKey) it.next()).f104096c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.f104172a.entrySet().iterator();
    }

    @NotNull
    public final l j() {
        l lVar = new l();
        lVar.f104173b = this.f104173b;
        lVar.f104174c = this.f104174c;
        lVar.f104172a.putAll(this.f104172a);
        return lVar;
    }

    public final <T> T o(@NotNull SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t10 = (T) this.f104172a.get(semanticsPropertyKey);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T q(@NotNull SemanticsPropertyKey<T> semanticsPropertyKey, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T t10 = (T) this.f104172a.get(semanticsPropertyKey);
        return t10 == null ? interfaceC4376a.invoke() : t10;
    }

    @Nullable
    public final <T> T t(@NotNull SemanticsPropertyKey<T> semanticsPropertyKey, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T t10 = (T) this.f104172a.get(semanticsPropertyKey);
        return t10 == null ? interfaceC4376a.invoke() : t10;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f104173b) {
            sb2.append("mergeDescendants=true");
            str = U6.j.f68738d;
        } else {
            str = "";
        }
        if (this.f104174c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = U6.j.f68738d;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.f104172a.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(key.f104094a);
            sb2.append(" : ");
            sb2.append(value);
            str = U6.j.f68738d;
        }
        return C2287v0.c(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final boolean v() {
        return this.f104174c;
    }

    public final boolean w() {
        return this.f104173b;
    }

    public final void x(@NotNull l lVar) {
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : lVar.f104172a.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f104172a.get(key);
            G.n(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objInvoke = key.f104095b.invoke(obj, value);
            if (objInvoke != null) {
                this.f104172a.put(key, objInvoke);
            }
        }
    }

    public final void z(boolean z10) {
        this.f104174c = z10;
    }
}
