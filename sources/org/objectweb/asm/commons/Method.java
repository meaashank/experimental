package org.objectweb.asm.commons;

import androidx.compose.ui.graphics.vector.f;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.objectweb.asm.Type;
import s0.x;
import t1.b;

/* JADX INFO: loaded from: classes8.dex */
public class Method {
    private static final Map<String, String> PRIMITIVE_TYPE_DESCRIPTORS;
    private final String descriptor;
    private final String name;

    static {
        HashMap map = new HashMap();
        map.put("void", b.f238870X4);
        map.put("byte", "B");
        map.put("char", "C");
        map.put("double", "D");
        map.put(x.b.f238262c, "F");
        map.put("int", "I");
        map.put("long", "J");
        map.put("short", b.f238816R4);
        map.put(x.b.f238265f, "Z");
        PRIMITIVE_TYPE_DESCRIPTORS = map;
    }

    public Method(String str, String str2) {
        this.name = str;
        this.descriptor = str2;
    }

    private static String getDescriptorInternal(String str, boolean z10) {
        if ("".equals(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int iIndexOf = 0;
        while (true) {
            iIndexOf = str.indexOf(HttpUrl.f225216p, iIndexOf) + 1;
            if (iIndexOf <= 0) {
                break;
            }
            sb2.append('[');
        }
        String strSubstring = str.substring(0, str.length() - (sb2.length() * 2));
        String str2 = PRIMITIVE_TYPE_DESCRIPTORS.get(strSubstring);
        if (str2 != null) {
            sb2.append(str2);
        } else {
            sb2.append(f.f101674f);
            if (strSubstring.indexOf(46) < 0) {
                if (!z10) {
                    sb2.append("java/lang/");
                }
                sb2.append(strSubstring);
            } else {
                sb2.append(strSubstring.replace('.', '/'));
            }
            sb2.append(';');
        }
        return sb2.toString();
    }

    public static Method getMethod(java.lang.reflect.Method method) {
        return new Method(method.getName(), Type.getMethodDescriptor(method));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Method)) {
            return false;
        }
        Method method = (Method) obj;
        return this.name.equals(method.name) && this.descriptor.equals(method.descriptor);
    }

    public Type[] getArgumentTypes() {
        return Type.getArgumentTypes(this.descriptor);
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return Type.getReturnType(this.descriptor);
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.descriptor.hashCode();
    }

    public String toString() {
        return this.name + this.descriptor;
    }

    public static Method getMethod(Constructor<?> constructor) {
        return new Method("<init>", Type.getConstructorDescriptor(constructor));
    }

    public static Method getMethod(String str) {
        return getMethod(str, false);
    }

    public Method(String str, Type type, Type[] typeArr) {
        this(str, Type.getMethodDescriptor(type, typeArr));
    }

    public static Method getMethod(String str, boolean z10) {
        int iIndexOf;
        String descriptorInternal;
        int iIndexOf2 = str.indexOf(32);
        int iIndexOf3 = str.indexOf(40, iIndexOf2);
        int i10 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(41, i10);
        if (iIndexOf2 != -1 && i10 != 0 && iIndexOf4 != -1) {
            String strSubstring = str.substring(0, iIndexOf2);
            String strTrim = str.substring(iIndexOf2 + 1, iIndexOf3).trim();
            StringBuilder sb2 = new StringBuilder("(");
            do {
                iIndexOf = str.indexOf(44, i10);
                if (iIndexOf == -1) {
                    descriptorInternal = getDescriptorInternal(str.substring(i10, iIndexOf4).trim(), z10);
                } else {
                    descriptorInternal = getDescriptorInternal(str.substring(i10, iIndexOf).trim(), z10);
                    i10 = iIndexOf + 1;
                }
                sb2.append(descriptorInternal);
            } while (iIndexOf != -1);
            sb2.append(')');
            sb2.append(getDescriptorInternal(strSubstring, z10));
            return new Method(strTrim, sb2.toString());
        }
        throw new IllegalArgumentException();
    }
}
