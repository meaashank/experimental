package Z6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84377a = "asdf-".concat(k.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84378b = "hook_disable.list";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Set<String> f84379c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f84380d = "+";

    public static File a() {
        return new File(D9.d.j(), f84378b);
    }

    public static boolean b(String str) {
        U6.c.N();
        return false;
    }

    public static boolean c(String str) {
        U6.c.N();
        return false;
    }

    public static Set<String> d() {
        HashSet hashSet = new HashSet();
        File fileA = a();
        if (!fileA.isFile()) {
            return hashSet;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileA), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        hashSet.isEmpty();
                        return hashSet;
                    }
                    String strTrim = line.trim();
                    if (!strTrim.isEmpty() && !strTrim.startsWith("#")) {
                        hashSet.add(strTrim);
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.getMessage();
            return Collections.EMPTY_SET;
        }
    }
}
