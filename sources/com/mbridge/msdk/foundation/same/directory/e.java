package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f156382c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f156383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f156384b = new ArrayList<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f156385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f156386b;

        public a(c cVar, File file) {
            this.f156386b = cVar;
            this.f156385a = file;
        }
    }

    private e(b bVar) {
        this.f156383a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f156384b == null || b().f156384b.isEmpty()) {
                return null;
            }
            ArrayList<a> arrayList = b().f156384b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                a aVar = arrayList.get(i10);
                i10++;
                a aVar2 = aVar;
                if (aVar2.f156386b.equals(cVar)) {
                    return aVar2.f156385a;
                }
            }
            return null;
        } catch (Throwable th) {
            q0.b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f156382c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f156382c;
    }

    public static synchronized void a(b bVar) {
        if (f156382c == null) {
            f156382c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f156383a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f156384b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
