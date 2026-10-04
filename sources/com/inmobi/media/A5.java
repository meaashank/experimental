package com.inmobi.media;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class A5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f151743b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f151744a = new HashMap();

    @dd.o
    public static final boolean a(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        return C3818z5.a(jSONObject, jSONObject2);
    }

    public static final /* synthetic */ String b() {
        return "A5";
    }

    @dd.o
    public static final void a(@NotNull Object obj, @NotNull Object obj2) {
        C3818z5.b(obj, obj2);
    }

    @dd.o
    public static final void b(boolean z10) {
        f151743b = z10;
    }

    @NotNull
    public final A5 a(@NotNull Va key, @NotNull Ua types) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(types, "types");
        this.f151744a.put(key, types);
        return this;
    }

    public final JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            Class superclass = cls.getSuperclass();
            if (superclass == null || Object.class.equals(superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getClass();
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.G.o(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(InterfaceC3692q4.class)) {
                        kotlin.jvm.internal.G.m(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !kotlin.jvm.internal.G.g(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (!kotlin.jvm.internal.G.g(cls2, type) && !kotlin.jvm.internal.G.g(cls2, type) && !Integer.class.equals(type)) {
                                Class cls3 = Boolean.TYPE;
                                if (!kotlin.jvm.internal.G.g(cls3, type) && !kotlin.jvm.internal.G.g(cls3, type) && !Boolean.class.equals(type)) {
                                    Class cls4 = Double.TYPE;
                                    if (!kotlin.jvm.internal.G.g(cls4, type) && !kotlin.jvm.internal.G.g(cls4, type) && !Double.class.equals(type)) {
                                        Class cls5 = Float.TYPE;
                                        if (!kotlin.jvm.internal.G.g(cls5, type) && !kotlin.jvm.internal.G.g(cls5, type) && !Float.class.equals(type)) {
                                            Class cls6 = Long.TYPE;
                                            if (!kotlin.jvm.internal.G.g(cls6, type) && !kotlin.jvm.internal.G.g(cls6, type) && !Long.class.equals(type)) {
                                                Class cls7 = Byte.TYPE;
                                                if (!kotlin.jvm.internal.G.g(cls7, type) && !kotlin.jvm.internal.G.g(cls7, type) && !Byte.class.equals(type)) {
                                                    if (!String.class.equals(type) && !JSONObject.class.equals(type) && !JSONArray.class.equals(type)) {
                                                        Class cls8 = Short.TYPE;
                                                        if (!kotlin.jvm.internal.G.g(cls8, type) && !kotlin.jvm.internal.G.g(cls8, type) && !Short.class.equals(type)) {
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                HashMap map = this.f151744a;
                                                                kotlin.jvm.internal.G.m(name);
                                                                Ua ua2 = (Ua) map.get(new Va(name, cls));
                                                                if (ua2 instanceof C3777w6) {
                                                                    JSONObject jSONObject2 = new JSONObject();
                                                                    Object obj2 = field.get(obj);
                                                                    if (obj2 != null) {
                                                                        Map map2 = (Map) obj2;
                                                                        C3777w6 c3777w6 = (C3777w6) ua2;
                                                                        for (Object obj3 : map2.keySet()) {
                                                                            c3777w6.getClass();
                                                                            Object objA = map2.get(obj3);
                                                                            if (objA != null) {
                                                                                if (!C3818z5.b(objA.getClass()) && !C3818z5.a(objA.getClass())) {
                                                                                    objA = a(objA, (Class) objA.getClass());
                                                                                }
                                                                                jSONObject2.put(obj3.toString(), objA);
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, jSONObject2);
                                                                }
                                                            } else if (List.class.isAssignableFrom(type)) {
                                                                HashMap map3 = this.f151744a;
                                                                kotlin.jvm.internal.G.m(name);
                                                                Object obj4 = map3.get(new Va(name, cls));
                                                                kotlin.jvm.internal.G.m(obj4);
                                                                if (((Ua) obj4) instanceof C3484b6) {
                                                                    JSONArray jSONArray = new JSONArray();
                                                                    Object obj5 = field.get(obj);
                                                                    if (obj5 != null) {
                                                                        for (Object obj6 : (List) obj5) {
                                                                            if (obj6 != null) {
                                                                                Object objA2 = (C3818z5.b(obj6.getClass()) || C3818z5.a(obj6.getClass())) ? obj6 : a(obj6, (Class) obj6.getClass());
                                                                                if (objA2 == null) {
                                                                                    obj6.getClass().toString();
                                                                                } else {
                                                                                    jSONArray.put(objA2);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, jSONArray);
                                                                }
                                                            } else {
                                                                Object obj7 = field.get(obj);
                                                                if (obj7 != null) {
                                                                    jSONObject.put(name, a(obj7, (Class) obj7.getClass()));
                                                                }
                                                            }
                                                        } else {
                                                            Object obj8 = field.get(obj);
                                                            kotlin.jvm.internal.G.n(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                            jSONObject.put(name, (Short) obj8);
                                                        }
                                                    } else {
                                                        jSONObject.put(name, field.get(obj));
                                                    }
                                                } else {
                                                    Object obj9 = field.get(obj);
                                                    kotlin.jvm.internal.G.n(obj9, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj9);
                                                }
                                            } else {
                                                Object obj10 = field.get(obj);
                                                kotlin.jvm.internal.G.n(obj10, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj10).longValue());
                                            }
                                        } else {
                                            Object obj11 = field.get(obj);
                                            kotlin.jvm.internal.G.n(obj11, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj11);
                                        }
                                    } else {
                                        Object obj12 = field.get(obj);
                                        kotlin.jvm.internal.G.n(obj12, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj12).doubleValue());
                                    }
                                } else {
                                    Object obj13 = field.get(obj);
                                    kotlin.jvm.internal.G.n(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj13).booleanValue());
                                }
                            } else {
                                Object obj14 = field.get(obj);
                                kotlin.jvm.internal.G.n(obj14, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj14).intValue());
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final JSONObject a(@NotNull Object obj) {
        kotlin.jvm.internal.G.p(obj, "obj");
        return a(obj, (Class) obj.getClass());
    }

    @Nullable
    public final Object a(@NotNull JSONObject jsonObject, @NotNull Class<Object> type) {
        kotlin.jvm.internal.G.p(jsonObject, "jsonObject");
        kotlin.jvm.internal.G.p(type, "type");
        return type.cast(a(jsonObject, type, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00ad: MOVE (r7 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:40:0x00ad */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ab A[Catch: Exception -> 0x00ac, TryCatch #5 {Exception -> 0x00ac, blocks: (B:42:0x00b7, B:44:0x00bd, B:45:0x00ca, B:47:0x00d8, B:52:0x00f5, B:55:0x0100, B:58:0x0109, B:60:0x010f, B:63:0x0121, B:65:0x012b, B:67:0x0131, B:70:0x0146, B:72:0x014c, B:74:0x0152, B:77:0x0168, B:79:0x016e, B:81:0x0174, B:84:0x018a, B:86:0x0190, B:88:0x0196, B:91:0x01ac, B:93:0x01b2, B:95:0x01b8, B:98:0x01ce, B:100:0x01d6, B:102:0x01dc, B:105:0x01f2, B:107:0x01fa, B:108:0x0203, B:110:0x020b, B:112:0x0211, B:115:0x0225, B:117:0x022d, B:120:0x023d, B:121:0x0242, B:123:0x024a, B:124:0x0253, B:128:0x0263, B:130:0x0279, B:132:0x0282, B:133:0x02a1, B:135:0x02a7, B:137:0x02ce, B:142:0x02f6, B:138:0x02d9, B:141:0x02e6, B:143:0x0308, B:147:0x031a, B:148:0x0322, B:150:0x0332, B:152:0x0346, B:154:0x034c, B:156:0x0364, B:158:0x0379, B:167:0x03ae, B:166:0x03ab, B:160:0x0387, B:163:0x0392, B:168:0x03b3, B:169:0x03b8, B:171:0x03be, B:37:0x00a8), top: B:264:0x001c }] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17, types: [int] */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r20v33 */
    /* JADX WARN: Type inference failed for: r20v34 */
    /* JADX WARN: Type inference failed for: r20v35 */
    /* JADX WARN: Type inference failed for: r20v36 */
    /* JADX WARN: Type inference failed for: r20v37 */
    /* JADX WARN: Type inference failed for: r20v38 */
    /* JADX WARN: Type inference failed for: r20v39 */
    /* JADX WARN: Type inference failed for: r20v40 */
    /* JADX WARN: Type inference failed for: r20v41 */
    /* JADX WARN: Type inference failed for: r20v42 */
    /* JADX WARN: Type inference failed for: r20v43 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.json.JSONObject r25, java.lang.Class r26, java.lang.Object r27, java.lang.Object r28) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.A5.a(org.json.JSONObject, java.lang.Class, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
