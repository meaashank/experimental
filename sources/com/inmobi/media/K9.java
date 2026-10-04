package com.inmobi.media;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.K9;
import ed.InterfaceC4376a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public final class K9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static E9 f152173c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n[] f152172b = {kotlin.jvm.internal.O.u(new PropertyReference1Impl(K9.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K9 f152171a = new K9();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3591j1 f152174d = new C3591j1((Object) new JSONObject(), (InterfaceC4376a) J9.f152129a, true, true);

    public static void b() {
        final Context contextD = C3657nb.d();
        if (contextD != null) {
            C3657nb.a(new Runnable() { // from class: F5.Q
                @Override // java.lang.Runnable
                public final void run() {
                    K9.a(contextD);
                }
            });
        }
    }

    public final LinkedHashMap a() {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) f152174d.getValue(this, f152172b[0]);
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) D4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getPublisherConfig();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject2.has(key)) {
                int iHashCode = value.hashCode();
                if (iHashCode != -1325958191) {
                    if (iHashCode != -891985903) {
                        if (iHashCode != 104431) {
                            if (iHashCode == 3029738 && value.equals("bool")) {
                                linkedHashMap2.put(key, Boolean.valueOf(jSONObject2.optBoolean(key)));
                            }
                        } else if (value.equals("int")) {
                            linkedHashMap2.put(key, Integer.valueOf(jSONObject2.optInt(key)));
                        }
                    } else if (value.equals(x.b.f238264e)) {
                        String strOptString = jSONObject2.optString(key);
                        kotlin.jvm.internal.G.o(strOptString, "optString(...)");
                        linkedHashMap2.put(key, strOptString);
                    }
                } else if (value.equals("double")) {
                    linkedHashMap2.put(key, Double.valueOf(jSONObject2.optDouble(key)));
                }
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(key2);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                int i10 = 0;
                while (i10 < length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(key2);
                    sb2.append(Ra.b.f67799c);
                    if (i10 == 0) {
                        str = "ban";
                    } else if (i10 == 1) {
                        str = "int";
                    } else if (i10 == 2) {
                        str = "rew";
                    } else if (i10 != 3) {
                        jSONObject = jSONObject2;
                        i10++;
                        jSONObject2 = jSONObject;
                    } else {
                        str = "nat";
                    }
                    sb2.append(str);
                    String string = sb2.toString();
                    int iHashCode2 = value2.hashCode();
                    jSONObject = jSONObject2;
                    if (iHashCode2 != -1325958191) {
                        if (iHashCode2 != -891985903) {
                            if (iHashCode2 != 104431) {
                                if (iHashCode2 == 3029738 && value2.equals("bool")) {
                                    linkedHashMap2.put(string, Boolean.valueOf(jSONArrayOptJSONArray.optBoolean(i10)));
                                }
                            } else if (value2.equals("int")) {
                                linkedHashMap2.put(string, Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                            }
                        } else if (value2.equals(x.b.f238264e)) {
                            String strOptString2 = jSONArrayOptJSONArray.optString(i10);
                            kotlin.jvm.internal.G.o(strOptString2, "optString(...)");
                            linkedHashMap2.put(string, strOptString2);
                        }
                    } else if (value2.equals("double")) {
                        linkedHashMap2.put(string, Double.valueOf(jSONArrayOptJSONArray.optDouble(i10)));
                    }
                    i10++;
                    jSONObject2 = jSONObject;
                }
            }
        }
        return linkedHashMap2;
    }

    public static final void b(JSONObject this_saveSignalsToPersistentCache) {
        kotlin.jvm.internal.G.p(this_saveSignalsToPersistentCache, "$this_saveSignalsToPersistentCache");
        Context contextD = C3657nb.d();
        if (contextD != null) {
            f152171a.getClass();
            if (f152173c == null) {
                f152173c = new E9(contextD, "pub_signals_store");
            }
            E9 e92 = f152173c;
            if (e92 != null) {
                String string = this_saveSignalsToPersistentCache.toString();
                kotlin.jvm.internal.G.o(string, "toString(...)");
                e92.a("saved_signals", string);
                f152174d.a();
                AbstractC3666o6.a((byte) 2, "PubSignalsStore", "Publisher Signals saved successfully.");
                return;
            }
            kotlin.jvm.internal.G.S("prefDao");
            throw null;
        }
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.G.p(context, "$context");
        try {
            f152171a.getClass();
            if (f152173c == null) {
                f152173c = new E9(context, "pub_signals_store");
            }
            E9 e92 = f152173c;
            if (e92 != null) {
                e92.c("saved_signals");
                f152174d.a();
            } else {
                kotlin.jvm.internal.G.S("prefDao");
                throw null;
            }
        } catch (Exception e10) {
            AbstractC3666o6.a((byte) 1, "PubSignalsStore", "Publisher signals could not be reset.");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap, SignalsConfig.PublisherConfig publisherConfig) {
        Object objA;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.putAll(linkedHashMap);
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = linkedHashMap.get(key);
            if (obj != null && (objA = a(obj, value)) != null) {
                linkedHashMap3.remove(key);
                linkedHashMap2.put(key, objA);
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String strA = androidx.compose.runtime.changelist.j.a(key2, "_ban");
            String strA2 = androidx.compose.runtime.changelist.j.a(key2, "_int");
            String strA3 = androidx.compose.runtime.changelist.j.a(key2, "_rew");
            String strA4 = androidx.compose.runtime.changelist.j.a(key2, "_nat");
            Object obj2 = linkedHashMap.get(strA);
            Object objA2 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = linkedHashMap.get(strA2);
            Object objA3 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = linkedHashMap.get(strA3);
            Object objA4 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = linkedHashMap.get(strA4);
            Object objA5 = obj5 != null ? a(obj5, value2) : null;
            if (objA2 != null || objA3 != null || objA4 != null || objA5 != null) {
                if (objA2 != null) {
                    linkedHashMap3.remove(strA);
                }
                if (objA3 != null) {
                    linkedHashMap3.remove(strA2);
                }
                if (objA4 != null) {
                    linkedHashMap3.remove(strA3);
                }
                if (objA5 != null) {
                    linkedHashMap3.remove(strA4);
                }
                JSONArray jSONArray = new JSONArray();
                if (objA2 == null) {
                    objA2 = a(value2);
                }
                JSONArray jSONArrayPut = jSONArray.put(objA2);
                if (objA3 == null) {
                    objA3 = a(value2);
                }
                JSONArray jSONArrayPut2 = jSONArrayPut.put(objA3);
                if (objA4 == null) {
                    objA4 = a(value2);
                }
                JSONArray jSONArrayPut3 = jSONArrayPut2.put(objA4);
                if (objA5 == null) {
                    objA5 = a(value2);
                }
                JSONArray jSONArrayPut4 = jSONArrayPut3.put(objA5);
                kotlin.jvm.internal.G.o(jSONArrayPut4, "put(...)");
                linkedHashMap2.put(key2, jSONArrayPut4);
            }
        }
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            AbstractC3666o6.a((byte) 1, "PubSignalsStore", "Publisher Signal, " + ((String) entry3.getKey()) + SignatureVisitor.INSTANCEOF + entry3.getValue() + " Not supported");
        }
        return linkedHashMap2;
    }

    public static Object a(Object obj, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1325958191) {
            if (!str.equals("double")) {
                return null;
            }
            if (obj instanceof Double) {
                return (Double) obj;
            }
            if (obj instanceof Integer) {
                return Double.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Number) obj).floatValue());
            }
            return null;
        }
        if (iHashCode == -891985903) {
            if (str.equals(x.b.f238264e) && (obj instanceof String)) {
                return (String) obj;
            }
            return null;
        }
        if (iHashCode != 104431) {
            if (iHashCode == 3029738 && str.equals("bool") && (obj instanceof Boolean)) {
                return (Boolean) obj;
            }
            return null;
        }
        if (str.equals("int") && (obj instanceof Integer)) {
            return (Integer) obj;
        }
        return null;
    }

    public static Object a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1325958191) {
            if (iHashCode == -891985903) {
                str.equals(x.b.f238264e);
            } else if (iHashCode != 104431) {
                if (iHashCode == 3029738) {
                    str.equals("bool");
                }
            } else if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt("-1"));
            }
        } else if (str.equals("double")) {
            return Double.valueOf(Double.parseDouble("-1"));
        }
        return "-1";
    }

    public static JSONObject a(LinkedHashMap linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public static void a(final JSONObject jSONObject) {
        C3657nb.a(new Runnable() { // from class: F5.S
            @Override // java.lang.Runnable
            public final void run() {
                K9.b(jSONObject);
            }
        });
    }

    public static JSONObject a(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        if (jSONObject.toString().length() <= publisherConfig.getPayloadSize()) {
            return jSONObject;
        }
        AbstractC3666o6.a((byte) 1, "PubSignalsStore", "Publisher Signal payload size exceeded.");
        C3511d5 c3511d5 = C3511d5.f152815a;
        C3511d5.f152817c.a(new R1(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }
}
