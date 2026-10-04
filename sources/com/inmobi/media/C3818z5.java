package com.inmobi.media;

import java.lang.reflect.Field;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3818z5 {
    public static boolean a(Object obj, Object obj2) {
        if (!obj.getClass().equals(obj2.getClass())) {
            return (obj.getClass().equals(Integer.class) && obj2.getClass().equals(Long.class)) ? ((Integer) obj).intValue() == ((int) ((Long) obj2).longValue()) : (obj.getClass().equals(Long.class) && obj2.getClass().equals(Integer.class)) ? ((int) ((Long) obj).longValue()) == ((Integer) obj2).intValue() : (obj.getClass().equals(Integer.class) && obj2.getClass().equals(Byte.class)) ? ((Integer) obj).intValue() == ((Byte) obj2).byteValue() : (obj.getClass().equals(Byte.class) && obj2.getClass().equals(Integer.class)) ? ((Byte) obj).byteValue() == ((Integer) obj2).intValue() : obj.equals(obj2);
        }
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.TYPE) ? ((Integer) obj).intValue() == ((Integer) obj2).intValue() : cls.equals(Long.TYPE) ? ((Long) obj).longValue() == ((Long) obj2).longValue() : cls.equals(Boolean.TYPE) ? ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue() : cls.equals(Double.TYPE) ? ((Double) obj).doubleValue() == ((Double) obj2).doubleValue() : cls.equals(Byte.TYPE) ? ((Byte) obj).byteValue() == ((Byte) obj2).byteValue() : cls.equals(Short.TYPE) ? ((Short) obj).shortValue() == ((Short) obj2).shortValue() : obj.equals(obj2);
    }

    public static final boolean b(Class cls) {
        Class cls2 = Integer.TYPE;
        if (kotlin.jvm.internal.G.g(cls2, cls) || kotlin.jvm.internal.G.g(cls2, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (kotlin.jvm.internal.G.g(cls3, cls) || kotlin.jvm.internal.G.g(cls3, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (kotlin.jvm.internal.G.g(cls4, cls) || kotlin.jvm.internal.G.g(cls4, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (kotlin.jvm.internal.G.g(cls5, cls) || kotlin.jvm.internal.G.g(cls5, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (kotlin.jvm.internal.G.g(cls6, cls) || kotlin.jvm.internal.G.g(cls6, cls) || String.class.equals(cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (kotlin.jvm.internal.G.g(cls7, cls) || kotlin.jvm.internal.G.g(cls7, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return kotlin.jvm.internal.G.g(cls8, cls) || kotlin.jvm.internal.G.g(cls8, cls);
    }

    public static void b(Object copyFrom, Object copyTo) {
        kotlin.jvm.internal.G.p(copyFrom, "copyFrom");
        kotlin.jvm.internal.G.p(copyTo, "copyTo");
        Class<?> cls = copyFrom.getClass();
        if (cls.isAssignableFrom(copyTo.getClass())) {
            Object objCast = cls.cast(copyTo);
            kotlin.jvm.internal.G.o(objCast, "cast(...)");
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.G.o(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    field.set(objCast, field.get(copyFrom));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Object obj = jSONArray.get(i10);
                Object obj2 = jSONArray2.get(i10);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else {
                    kotlin.jvm.internal.G.m(obj);
                    kotlin.jvm.internal.G.m(obj2);
                    if (!a(obj, obj2)) {
                        return false;
                    }
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(JSONObject json1, JSONObject json2) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.G.p(json1, "json1");
        kotlin.jvm.internal.G.p(json2, "json2");
        if (json1.length() != json2.length()) {
            return false;
        }
        Iterator<String> itKeys = json1.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                obj = json1.get(next);
                obj2 = json2.get(next);
            } catch (JSONException unused) {
            }
            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                if (!a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                if (!a((JSONArray) obj, (JSONArray) obj2)) {
                    return false;
                }
            } else {
                kotlin.jvm.internal.G.m(obj);
                kotlin.jvm.internal.G.m(obj2);
                if (!a(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean a(Class cls) {
        return Integer.class.equals(cls) || Boolean.class.equals(cls) || Double.class.equals(cls) || Float.class.equals(cls) || Long.class.equals(cls) || String.class.equals(cls) || Byte.class.equals(cls) || Short.class.equals(cls);
    }

    public static final Object a(JSONArray jSONArray, int i10, Class cls) throws JSONException {
        Object objValueOf;
        if (kotlin.jvm.internal.G.g(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.G.g(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.G.g(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.G.g(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i10));
        } else if (kotlin.jvm.internal.G.g(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.G.g(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i10));
        } else {
            objValueOf = jSONArray.get(i10);
        }
        kotlin.jvm.internal.G.m(objValueOf);
        return objValueOf;
    }

    public static final Object a(JSONObject jSONObject, String str, Class cls) throws JSONException {
        Object objValueOf;
        if (kotlin.jvm.internal.G.g(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONObject.getInt(str));
        } else if (kotlin.jvm.internal.G.g(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONObject.getDouble(str));
        } else if (kotlin.jvm.internal.G.g(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONObject.getDouble(str));
        } else if (kotlin.jvm.internal.G.g(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONObject.getLong(str));
        } else if (kotlin.jvm.internal.G.g(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONObject.getInt(str));
        } else if (kotlin.jvm.internal.G.g(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONObject.getInt(str));
        } else {
            objValueOf = jSONObject.get(str);
        }
        kotlin.jvm.internal.G.m(objValueOf);
        return objValueOf;
    }
}
