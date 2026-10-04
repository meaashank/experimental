package z8;

import android.util.ArraySet;
import androidx.datastore.preferences.protobuf.C2538n;
import e.T;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    @T(api = 23)
    public static <E> ArraySet<E> a() {
        return new ArraySet<>();
    }

    @T(api = 23)
    public static <E> ArraySet<E> b(E... eArr) {
        ArraySet<E> arraySet = new ArraySet<>(C2538n.a(eArr.length, 4, 3, 1));
        Collections.addAll(arraySet, eArr);
        return arraySet;
    }

    public static <K> HashSet<K> c() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> d(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(C2538n.a(eArr.length, 4, 3, 1));
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static <E> SortedSet<E> e() {
        return new TreeSet();
    }

    public static <E> SortedSet<E> f(E... eArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, eArr);
        return treeSet;
    }
}
