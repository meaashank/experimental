package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f154286a;

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f154286a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) ? a() : str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) ? d(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) ? f(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) ? c(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) ? a(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) ? e(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) ? e(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) ? d(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) ? g(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) ? a(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) ? b(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) ? b(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("898")) ? c(obj) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            StringBuilder sbA = androidx.activity.result.i.a("Error handling map operation: ", str, U6.j.f68738d);
            sbA.append(e10.getMessage());
            q0.b("MapOperator", sbA.toString(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b((Object) strValueOf));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((Map) obj).get(strValueOf));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        Map<String, Object> mapA;
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            try {
                mapA = new com.mbridge.msdk.config.dynamic.utils.e().a(new JSONObject(strValueOf));
            } catch (JSONException e10) {
                q0.b("MapOperator", e10.getMessage());
                mapA = null;
            }
            if (mapA != null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(mapA);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                aVar.c(strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(strValueOf)) {
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                    aVar.a(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(java.lang.Object r5, java.util.List<java.lang.Object> r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a
            if (r0 != 0) goto Lf
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L9
            goto Lf
        L9:
            r5 = 0
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        Lf:
            if (r0 == 0) goto L3a
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r5 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) r5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r5 = r5.a()
            java.util.Iterator r5 = r5.iterator()
        L20:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L20
        L3a:
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0
        L3d:
            r5 = 0
            if (r6 == 0) goto L5f
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L5f
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r6.trim()
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r1 = "or"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L5f
            goto L61
        L5f:
            java.lang.String r1 = "and"
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L6f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L99
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r2 != 0) goto L82
            java.lang.String r2 = " "
            androidx.concurrent.futures.b.a(r6, r2, r1, r2)
        L82:
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r6.append(r2)
            java.lang.String r2 = "="
            r6.append(r2)
            java.lang.Object r2 = r3.getValue()
            r6.append(r2)
            r2 = r5
            goto L6f
        L99:
            java.lang.String r5 = r6.toString()
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.g(java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? a(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        String strValueOf;
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        } else {
            strValueOf = "";
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a((Object) strValueOf)));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((Map) obj).containsKey(strValueOf)));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj) {
        ?? map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new JSONObject((Map) map).toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Collection<Object> collectionG = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).g();
            if (!collectionG.isEmpty()) {
                arrayList.addAll(collectionG);
            }
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            if (!collectionValues.isEmpty()) {
                arrayList.addAll(collectionValues);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:15:0x003f, B:16:0x004d, B:18:0x0053, B:20:0x005b, B:23:0x0063, B:24:0x0086), top: B:28:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            boolean r1 = r6 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a
            r2 = 0
            if (r1 != 0) goto L11
            boolean r3 = r6 instanceof java.util.Map
            if (r3 == 0) goto Lc
            goto L11
        Lc:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r2)
            return r6
        L11:
            if (r1 == 0) goto L3c
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r6 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) r6
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r6 = r6.a()
            java.util.Iterator r6 = r6.iterator()
        L22:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r6.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            r1.put(r4, r3)
            goto L22
        L3c:
            r1 = r6
            java.util.Map r1 = (java.util.Map) r1
        L3f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r6.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L61
            r3 = 1
        L4d:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L86
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L61
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L63
            java.lang.String r3 = "&"
            r6.append(r3)     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r6 = move-exception
            goto L8f
        L63:
            java.lang.Object r3 = r4.getKey()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch: java.lang.Throwable -> L61
            r6.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "="
            r6.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r4.getValue()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch: java.lang.Throwable -> L61
            r6.append(r3)     // Catch: java.lang.Throwable -> L61
            r3 = 0
            goto L4d
        L86:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L61
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r6)     // Catch: java.lang.Throwable -> L61
            return r6
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error encoding URL parameters: "
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MapOperator"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r0, r6)
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.e(java.lang.Object):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Set<String> setE = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).e();
            if (!setE.isEmpty()) {
                arrayList.addAll(setE);
            }
        }
        if (obj instanceof Map) {
            Set setKeySet = ((Map) obj).keySet();
            if (!setKeySet.isEmpty()) {
                arrayList.addAll(setKeySet);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new HashMap());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).f()));
        }
        if (obj instanceof Map) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((Map) obj).size()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("898"));
    }
}
