package zd;

import fd.InterfaceC4420c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.collections.J;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nmozilla/components/concept/fetch/MutableHeaders\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n11065#2:170\n11400#2,3:171\n533#3,6:174\n766#3:180\n857#3,2:181\n1549#3:183\n1620#3,3:184\n1747#3,3:187\n1864#3,3:190\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nmozilla/components/concept/fetch/MutableHeaders\n*L\n96#1:170\n96#1:171,3\n108#1:174,6\n114#1:180\n114#1:181,2\n115#1:183\n115#1:184,3\n133#1:187,3\n153#1:190,3\n*E\n"})
public final class f implements d, Iterable<c>, InterfaceC4420c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<c> f241374a;

    public f(@NotNull List<c> headers) {
        G.p(headers, "headers");
        this.f241374a = U.d6(headers);
    }

    @Override // zd.d
    public void F2(int i10, @NotNull c header) {
        G.p(header, "header");
        this.f241374a.set(i10, header);
    }

    @NotNull
    public final f b(@NotNull String name, @NotNull String value) {
        G.p(name, "name");
        G.p(value, "value");
        this.f241374a.add(new c(name, value));
        return this;
    }

    @Override // zd.d
    public boolean contains(@NotNull String name) {
        G.p(name, "name");
        List<c> list = this.f241374a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (F.e2(((c) it.next()).f241360a, name, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof f) && G.g(this.f241374a, ((f) obj).f241374a);
    }

    @Override // zd.d
    @NotNull
    public List<String> f1(@NotNull String name) {
        G.p(name, "name");
        List<c> list = this.f241374a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (F.e2(((c) obj).f241360a, name, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(J.d0(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((c) obj2).f241361b);
        }
        return arrayList2;
    }

    @NotNull
    public final f g(@NotNull String name, @NotNull String value) {
        G.p(name, "name");
        G.p(value, "value");
        int i10 = 0;
        for (Object obj : this.f241374a) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            if (F.e2(((c) obj).f241360a, name, true)) {
                this.f241374a.set(i10, new c(name, value));
                return this;
            }
            i10 = i11;
        }
        b(name, value);
        return this;
    }

    @Override // zd.d
    @NotNull
    public c get(int i10) {
        return this.f241374a.get(i10);
    }

    @Override // zd.d
    public int getSize() {
        return this.f241374a.size();
    }

    public int hashCode() {
        return this.f241374a.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<c> iterator() {
        return this.f241374a.iterator();
    }

    @Override // zd.d
    @Nullable
    public String get(@NotNull String name) {
        c cVarPrevious;
        G.p(name, "name");
        List<c> list = this.f241374a;
        ListIterator<c> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cVarPrevious = null;
                break;
            }
            cVarPrevious = listIterator.previous();
            if (F.e2(cVarPrevious.f241360a, name, true)) {
                break;
            }
        }
        c cVar = cVarPrevious;
        if (cVar != null) {
            return cVar.f241361b;
        }
        return null;
    }

    public f(@NotNull Pair<String, String>... pairs) {
        G.p(pairs, "pairs");
        ArrayList arrayList = new ArrayList(pairs.length);
        for (Pair<String, String> pair : pairs) {
            arrayList.add(new c(pair.f217467a, pair.f217468b));
        }
        this((List<c>) U.d6(arrayList));
    }
}
