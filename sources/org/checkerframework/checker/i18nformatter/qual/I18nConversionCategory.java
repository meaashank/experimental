package org.checkerframework.checker.i18nformatter.qual;

import Pd.b;
import U6.j;
import Y6.c;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public enum I18nConversionCategory {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{FileResponse.FIELD_DATE, "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{c.e.f79288c, "choice"});

    public final String[] strings;
    public final Class<?>[] types;
    static I18nConversionCategory[] namedCategories = {DATE, NUMBER};

    I18nConversionCategory(Class[] clsArr, String[] strArr) {
        this.types = clsArr;
        this.strings = strArr;
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static I18nConversionCategory intersect(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        I18nConversionCategory i18nConversionCategory3 = UNUSED;
        if (i18nConversionCategory != i18nConversionCategory3) {
            if (i18nConversionCategory2 != i18nConversionCategory3) {
                I18nConversionCategory i18nConversionCategory4 = GENERAL;
                if (i18nConversionCategory != i18nConversionCategory4) {
                    if (i18nConversionCategory2 != i18nConversionCategory4) {
                        Set setArrayToSet = arrayToSet(i18nConversionCategory.types);
                        setArrayToSet.retainAll(arrayToSet(i18nConversionCategory2.types));
                        I18nConversionCategory[] i18nConversionCategoryArr = {DATE, NUMBER};
                        for (int i10 = 0; i10 < 2; i10++) {
                            I18nConversionCategory i18nConversionCategory5 = i18nConversionCategoryArr[i10];
                            if (arrayToSet(i18nConversionCategory5.types).equals(setArrayToSet)) {
                                return i18nConversionCategory5;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return i18nConversionCategory;
        }
        return i18nConversionCategory2;
    }

    public static boolean isSubsetOf(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        return intersect(i18nConversionCategory, i18nConversionCategory2) == i18nConversionCategory;
    }

    public static I18nConversionCategory stringToI18nConversionCategory(String str) {
        String lowerCase = str.toLowerCase();
        for (I18nConversionCategory i18nConversionCategory : namedCategories) {
            for (String str2 : i18nConversionCategory.strings) {
                if (str2.equals(lowerCase)) {
                    return i18nConversionCategory;
                }
            }
        }
        throw new IllegalArgumentException(y.a("Invalid format type ", lowerCase));
    }

    public static I18nConversionCategory union(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        I18nConversionCategory i18nConversionCategory3 = UNUSED;
        return (i18nConversionCategory == i18nConversionCategory3 || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = GENERAL) || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = DATE) || i18nConversionCategory2 == i18nConversionCategory3) ? i18nConversionCategory3 : NUMBER;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        Class<?>[] clsArr = this.types;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb2 = new StringBuilder(name());
        if (this.types == null) {
            sb2.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoinerA = b.a(j.f68738d, " conversion category (one of: ", ")");
            for (Class<?> cls : this.types) {
                stringJoinerA.add(cls.getCanonicalName());
            }
            sb2.append(stringJoinerA);
        }
        return sb2.toString();
    }
}
