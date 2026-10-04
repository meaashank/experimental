package com.prism.hider.utils;

import android.os.Process;
import com.android.launcher3.AllAppsList;
import com.prism.hider.modules.SeduceImportModule;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168370a = "gaia_";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168372c = "gaia_module_.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f168371b = "gaia_guest_.";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f168373d = {f168372c, SeduceImportModule.MODULE_IMPORT_APP_PREFIX, f168371b};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f168374e = {SeduceImportModule.MODULE_IMPORT_APP_PREFIX, f168371b};

    public static String a(String str) {
        if (str.startsWith(f168371b)) {
            return str.substring(12);
        }
        throw new IllegalStateException(str.concat(" is not a guest pkg"));
    }

    public static String b(String str) {
        if (str.startsWith(f168372c)) {
            return str.substring(13);
        }
        throw new IllegalStateException(str.concat(" is not a module id"));
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f168374e) {
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
            }
        }
        return str;
    }

    public static String d(String str) {
        if (str.startsWith(SeduceImportModule.MODULE_IMPORT_APP_PREFIX)) {
            return str.substring(14);
        }
        throw new IllegalStateException(str.concat(" is not a seduce pkg"));
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f168373d) {
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
            }
        }
        return str;
    }

    public static String f(String str) {
        return str.startsWith(f168371b) ? str : f168371b.concat(str);
    }

    public static String g(String str) {
        return str.startsWith(f168372c) ? str : f168372c.concat(str);
    }

    public static String h(String str) {
        return str.startsWith(SeduceImportModule.MODULE_IMPORT_APP_PREFIX) ? str : SeduceImportModule.MODULE_IMPORT_APP_PREFIX.concat(str);
    }

    public static boolean i(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(f168371b);
    }

    public static boolean j(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(f168372c);
    }

    public static boolean k(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(f168370a);
    }

    public static boolean l(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(SeduceImportModule.MODULE_IMPORT_APP_PREFIX);
    }

    public static boolean m(Set<String> set, AllAppsList allAppsList, String str) {
        if (set.contains(g(str))) {
            return false;
        }
        String strE = e(str);
        return (set.contains(f(strE)) || allAppsList.findAppInfo(strE, Process.myUserHandle()) == null || !Z6.g.B().D(strE)) ? false : true;
    }

    public static boolean n(Set<String> set, String str) {
        if (!str.startsWith(f168372c)) {
            return false;
        }
        String strSubstring = str.substring(13);
        if (!strSubstring.startsWith(SeduceImportModule.MODULE_IMPORT_APP_PREFIX)) {
            return false;
        }
        String strSubstring2 = strSubstring.substring(14);
        return set.contains(strSubstring2) || set.contains(f(strSubstring2));
    }
}
