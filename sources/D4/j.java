package d4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4864f0;
import kotlin.collections.J;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import md.u;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nJSONArrayExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONArrayExtensions.kt\ncom/cookiegames/smartcookie/extensions/JSONArrayExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,9:1\n1549#2:10\n1620#2,3:11\n*S KotlinDebug\n*F\n+ 1 JSONArrayExtensions.kt\ncom/cookiegames/smartcookie/extensions/JSONArrayExtensionsKt\n*L\n8#1:10\n8#1:11,3\n*E\n"})
public final class j {
    @NotNull
    public static final <T> List<T> a(@NotNull JSONArray jSONArray, @NotNull ed.l<Object, ? extends T> map) throws JSONException {
        G.p(jSONArray, "<this>");
        G.p(map, "map");
        md.l lVarY1 = u.Y1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(J.d0(lVarY1, 10));
        Iterator<Integer> it = lVarY1.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((AbstractC4864f0) it).nextInt());
            G.o(obj, "get(...)");
            arrayList.add(map.invoke(obj));
        }
        return arrayList;
    }
}
