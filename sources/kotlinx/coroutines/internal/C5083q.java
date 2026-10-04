package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
@dd.h
public final class C5083q<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f220354a;

    public /* synthetic */ C5083q(Object obj) {
        this.f220354a = obj;
    }

    public static final /* synthetic */ C5083q a(Object obj) {
        return new C5083q(obj);
    }

    @NotNull
    public static <E> Object b(@Nullable Object obj) {
        return obj;
    }

    public static Object c(Object obj, int i10, C4969v c4969v) {
        if ((i10 & 1) != 0) {
            return null;
        }
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof C5083q) && kotlin.jvm.internal.G.g(obj, ((C5083q) obj2).f220354a);
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.G.g(obj, obj2);
    }

    public static final void f(Object obj, @NotNull ed.l<? super E, L0> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke((Object) arrayList.get(size));
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public static final Object h(Object obj, E e10) {
        if (obj == null) {
            return e10;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e10);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return arrayList;
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f220354a, obj);
    }

    public int hashCode() {
        return g(this.f220354a);
    }

    public final /* synthetic */ Object j() {
        return this.f220354a;
    }

    public String toString() {
        return i(this.f220354a);
    }
}
