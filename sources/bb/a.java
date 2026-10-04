package Bb;

import androidx.room.K0;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Extras;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converter.kt\ncom/tonyodev/fetch2/database/Converter\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,112:1\n32#2,2:113\n32#2,2:115\n32#2,2:117\n32#2,2:119\n*S KotlinDebug\n*F\n+ 1 Converter.kt\ncom/tonyodev/fetch2/database/Converter\n*L\n28#1:113,2\n40#1:115,2\n94#1:117,2\n105#1:119,2\n*E\n"})
public final class a {
    @K0
    @NotNull
    public final EnqueueAction a(int i10) {
        return EnqueueAction.Companion.a(i10);
    }

    @K0
    @NotNull
    public final Error b(int i10) {
        return Error.Companion.a(i10);
    }

    @K0
    @NotNull
    public final Extras c(@NotNull String jsonString) {
        G.p(jsonString, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(jsonString);
        Iterator<String> itKeys = jSONObject.keys();
        G.o(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return new Extras(linkedHashMap);
    }

    @K0
    @NotNull
    public final String d(@NotNull Extras extras) throws JSONException {
        G.p(extras, "extras");
        if (extras.isEmpty()) {
            return Ib.b.f53002g;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : extras.getMap().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        G.m(string);
        return string;
    }

    @K0
    @NotNull
    public final Map<String, String> e(@NotNull String jsonString) {
        G.p(jsonString, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(jsonString);
        Iterator<String> itKeys = jSONObject.keys();
        G.o(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    @K0
    @NotNull
    public final NetworkType f(int i10) {
        return NetworkType.Companion.a(i10);
    }

    @K0
    @NotNull
    public final Priority g(int i10) {
        return Priority.Companion.a(i10);
    }

    @K0
    @NotNull
    public final Status h(int i10) {
        return Status.Companion.a(i10);
    }

    @K0
    public final int i(@NotNull EnqueueAction enqueueAction) {
        G.p(enqueueAction, "enqueueAction");
        return enqueueAction.getValue();
    }

    @K0
    public final int j(@NotNull Error error) {
        G.p(error, "error");
        return error.getValue();
    }

    @K0
    @NotNull
    public final String k(@NotNull Map<String, String> headerMap) throws JSONException {
        G.p(headerMap, "headerMap");
        if (headerMap.isEmpty()) {
            return Ib.b.f53002g;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        G.m(string);
        return string;
    }

    @K0
    public final int l(@NotNull NetworkType networkType) {
        G.p(networkType, "networkType");
        return networkType.getValue();
    }

    @K0
    public final int m(@NotNull Priority priority) {
        G.p(priority, "priority");
        return priority.getValue();
    }

    @K0
    public final int n(@NotNull Status status) {
        G.p(status, "status");
        return status.getValue();
    }
}
