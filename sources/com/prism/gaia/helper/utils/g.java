package com.prism.gaia.helper.utils;

import com.prism.commons.utils.C3843g;
import com.prism.commons.utils.C3860y;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165126a = "asdf-".concat(g.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f165127b = {100, 101, 120, 10};

    public class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".apk");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r2) {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L1d
            r1.<init>(r2)     // Catch: java.io.IOException -> L1d
            java.lang.String r2 = "classes.dex"
            java.util.zip.ZipEntry r2 = r1.getEntry(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            boolean r2 = r2.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            r2 = 1
            goto L19
        L16:
            r2 = move-exception
            goto L1f
        L18:
            r2 = r0
        L19:
            r1.close()     // Catch: java.io.IOException -> L1d
            return r2
        L1d:
            r2 = move-exception
            goto L28
        L1f:
            r1.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.io.IOException -> L1d
        L27:
            throw r2     // Catch: java.io.IOException -> L1d
        L28:
            r2.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.helper.utils.g.a(java.io.File):boolean");
    }

    public static boolean b(String str, boolean z10) {
        return z10 ? c(str) : d(str);
    }

    public static boolean c(String str) {
        for (File file : new File(str).getParentFile().listFiles(new a())) {
            if (a(file)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        return a(new File(str));
    }

    public static List<byte[]> e(File file) {
        int iB;
        LinkedList linkedList = new LinkedList();
        try {
            byte[] bArrA0 = l.a0(file);
            List<Integer> listI = C3843g.i(bArrA0, f165127b);
            ((LinkedList) listI).size();
            for (Integer num : listI) {
                if (bArrA0[num.intValue() + 4] == 48 && bArrA0[num.intValue() + 5] == 51 && bArrA0[num.intValue() + 6] >= 53 && bArrA0[num.intValue() + 7] == 0 && (iB = C3843g.b(bArrA0, num.intValue() + 32, false)) > 0 && num.intValue() + iB < bArrA0.length) {
                    file.getAbsolutePath();
                    linkedList.add(C3843g.e(bArrA0, num.intValue(), iB));
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                f((byte[]) it.next());
            }
            return linkedList;
        } catch (IOException e10) {
            file.getAbsolutePath();
            e10.getMessage();
            return linkedList;
        }
    }

    public static void f(byte[] bArr) {
        System.arraycopy(C3860y.p(bArr, 32), 0, bArr, 12, 20);
        System.arraycopy(C3860y.c(bArr, 12), 0, bArr, 8, 4);
    }

    public static boolean g(File file) {
        return l.c(file, 0, 1684371466L);
    }

    public static boolean h(File file) {
        return l.c(file, 0, 1684371722L);
    }

    public static boolean i(File file) {
        return l.c(file, 0, 1347093252L);
    }
}
