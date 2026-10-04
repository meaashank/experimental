package z8;

import androidx.datastore.preferences.protobuf.C2538n;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: z8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5863a {
    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> b(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>(C2538n.a(eArr.length, 110, 100, 5));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
