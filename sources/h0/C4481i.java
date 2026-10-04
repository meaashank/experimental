package h0;

import androidx.compose.runtime.InterfaceC1924k0;
import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.B;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,90:1\n151#2,3:91\n33#2,4:94\n154#2,2:98\n38#2:100\n156#2:101\n33#2,4:102\n154#2,2:106\n38#2:108\n156#2:109\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n54#1:91,3\n54#1:94,4\n54#1:98,2\n54#1:100\n54#1:101\n54#1:102,4\n54#1:106,2\n54#1:108\n54#1:109\n*E\n"})
@InterfaceC1924k0
public final class C4481i implements Collection<C4480h>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202383d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<C4480h> f202385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f202382c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C4481i f202384e = new C4481i(EmptyList.f217510a);

    /* JADX INFO: renamed from: h0.i$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final C4481i a() {
            return C4483k.a().b();
        }

        @NotNull
        public final C4481i b() {
            return C4481i.f202384e;
        }

        public a(C4969v c4969v) {
        }
    }

    public C4481i(@NotNull List<C4480h> list) {
        this.f202385a = list;
        this.f202386b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C4480h c4480h) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C4480h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C4480h)) {
            return false;
        }
        return this.f202385a.contains((C4480h) obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return this.f202385a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4481i) && G.g(this.f202385a, ((C4481i) obj).f202385a);
    }

    public boolean g(C4480h c4480h) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int getSize() {
        return this.f202386b;
    }

    public boolean h(@NotNull C4480h c4480h) {
        return this.f202385a.contains(c4480h);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f202385a.hashCode();
    }

    @NotNull
    public final C4480h i(int i10) {
        return this.f202385a.get(i10);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f202385a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<C4480h> iterator() {
        return this.f202385a.iterator();
    }

    @NotNull
    public final List<C4480h> j() {
        return this.f202385a;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super C4480h> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f202386b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @NotNull
    public String toString() {
        return "LocaleList(localeList=" + this.f202385a + ')';
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C4968u.b(this, tArr);
    }

    public C4481i(@NotNull String str) {
        List listR5 = M.r5(str, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listR5.size());
        int size = listR5.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(M.e6((String) listR5.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new C4480h((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }

    public C4481i(@NotNull C4480h... c4480hArr) {
        this((List<C4480h>) B.dz(c4480hArr));
    }
}
