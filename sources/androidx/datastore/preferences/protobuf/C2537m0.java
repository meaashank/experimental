package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2537m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f112897a = "List";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f112898b = "OrBuilderList";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f112899c = "Map";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f112900d = "Bytes";

    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == 0.0d : obj instanceof String ? obj.equals("") : obj instanceof ByteString ? obj.equals(ByteString.f112510e) : obj instanceof MessageLite ? obj == ((MessageLite) obj).getDefaultInstanceForType() : (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    public static final void c(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(P0.e((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(P0.a((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            d((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        c(sb2, i13, "key", entry.getKey());
        c(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    public static void d(MessageLite messageLite, StringBuilder sb2, int i10) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (java.lang.reflect.Method method : messageLite.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith(w7.i.f240158w)) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst(w7.i.f240158w, "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith(f112897a) && !strReplaceFirst.endsWith(f112898b) && !strReplaceFirst.equals(f112897a)) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb2, i10, a(str2), GeneratedMessageLite.M(method2, messageLite, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith(f112899c) && !strReplaceFirst.equals(f112899c)) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i10, a(str3), GeneratedMessageLite.M(method3, messageLite, new Object[0]));
                }
            }
            if (((java.lang.reflect.Method) map2.get("set".concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith(f112900d)) {
                    if (map.containsKey(w7.i.f240158w + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) map.get(w7.i.f240158w.concat(strReplaceFirst));
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objM = GeneratedMessageLite.M(method4, messageLite, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.M(method5, messageLite, new Object[0])).booleanValue();
                    } else if (b(objM)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        c(sb2, i10, a(str4), objM);
                    }
                }
            }
        }
        if (messageLite instanceof GeneratedMessageLite.d) {
            Iterator<Map.Entry<T, Object>> itH = ((GeneratedMessageLite.d) messageLite).extensions.H();
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                c(sb2, i10, android.support.v4.media.d.a(new StringBuilder("["), ((GeneratedMessageLite.f) entry.getKey()).f112611b, "]"), entry.getValue());
            }
        }
        X0 x02 = ((GeneratedMessageLite) messageLite).unknownFields;
        if (x02 != null) {
            x02.q(sb2, i10);
        }
    }

    public static String e(MessageLite messageLite, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(messageLite, sb2, 0);
        return sb2.toString();
    }
}
