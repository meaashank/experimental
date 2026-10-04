package j5;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static Object a(Object obj, String str) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
