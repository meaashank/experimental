package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;
import e.f0;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f120482b = "androidx.work.workdb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f120481a = androidx.work.i.f("WrkDbPathHelper");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f120483c = {"-journal", "-shm", "-wal"};

    @NonNull
    @f0
    public static File a(@NonNull Context context) {
        return c(context, f120482b);
    }

    @NonNull
    @f0
    public static File b(@NonNull Context context) {
        return context.getDatabasePath(f120482b);
    }

    @T(23)
    public static File c(@NonNull Context context, @NonNull String filePath) {
        return new File(context.getNoBackupFilesDir(), filePath);
    }

    @NonNull
    public static String d() {
        return f120482b;
    }

    public static void e(@NonNull Context context) {
        if (context.getDatabasePath(f120482b).exists()) {
            androidx.work.i.c().a(f120481a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap map = (HashMap) f(context);
            for (File file : map.keySet()) {
                File file2 = (File) map.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        androidx.work.i.c().h(f120481a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    androidx.work.i.c().a(f120481a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    @NonNull
    @f0
    public static Map<File, File> f(@NonNull Context context) {
        HashMap map = new HashMap();
        File databasePath = context.getDatabasePath(f120482b);
        File fileC = c(context, f120482b);
        map.put(databasePath, fileC);
        for (String str : f120483c) {
            map.put(new File(databasePath.getPath() + str), new File(fileC.getPath() + str));
        }
        return map;
    }
}
