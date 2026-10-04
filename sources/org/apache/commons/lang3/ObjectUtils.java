package org.apache.commons.lang3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang3.exception.CloneFailedException;

/* JADX INFO: loaded from: classes6.dex */
public class ObjectUtils {
    public static final Null NULL = new Null();

    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        private Object readResolve() {
            return ObjectUtils.NULL;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T clone(T t10) {
        if (!(t10 instanceof Cloneable)) {
            return null;
        }
        if (!t10.getClass().isArray()) {
            try {
                return (T) t10.getClass().getMethod("clone", null).invoke(t10, null);
            } catch (IllegalAccessException e10) {
                throw new CloneFailedException("Cannot clone Cloneable type ".concat(t10.getClass().getName()), e10);
            } catch (NoSuchMethodException e11) {
                throw new CloneFailedException("Cloneable type " + t10.getClass().getName() + " has no clone method", e11);
            } catch (InvocationTargetException e12) {
                throw new CloneFailedException("Exception cloning Cloneable type ".concat(t10.getClass().getName()), e12.getCause());
            }
        }
        Class<?> componentType = t10.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t10).clone();
        }
        int length = Array.getLength(t10);
        T t11 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i10 = length - 1;
            if (length <= 0) {
                return t11;
            }
            Array.set(t11, i10, Array.get(t10, i10));
            length = i10;
        }
    }

    public static <T> T cloneIfPossible(T t10) {
        T t11 = (T) clone(t10);
        return t11 == null ? t10 : t11;
    }

    public static <T extends Comparable<? super T>> int compare(T t10, T t11) {
        return compare(t10, t11, false);
    }

    public static <T> T defaultIfNull(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static <T> T firstNonNull(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t10 : tArr) {
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public static int hashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int hashCodeMulti(Object... objArr) {
        int iHashCode = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                iHashCode = (iHashCode * 31) + hashCode(obj);
            }
        }
        return iHashCode;
    }

    public static String identityToString(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        identityToString(stringBuffer, obj);
        return stringBuffer.toString();
    }

    public static <T extends Comparable<? super T>> T max(T... tArr) {
        T t10 = null;
        if (tArr != null) {
            for (T t11 : tArr) {
                if (compare(t11, t10, false) > 0) {
                    t10 = t11;
                }
            }
        }
        return t10;
    }

    public static <T extends Comparable<? super T>> T min(T... tArr) {
        T t10 = null;
        if (tArr != null) {
            for (T t11 : tArr) {
                if (compare(t11, t10, true) < 0) {
                    t10 = t11;
                }
            }
        }
        return t10;
    }

    public static boolean notEqual(Object obj, Object obj2) {
        return !equals(obj, obj2);
    }

    public static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static <T extends Comparable<? super T>> int compare(T t10, T t11, boolean z10) {
        if (t10 == t11) {
            return 0;
        }
        return t10 == null ? z10 ? 1 : -1 : t11 == null ? z10 ? -1 : 1 : t10.compareTo(t11);
    }

    public static String toString(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }

    public static void identityToString(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            stringBuffer.append(obj.getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        throw new NullPointerException("Cannot get the toString of a null identity");
    }
}
