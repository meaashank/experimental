package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.C1498d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f152618a = 0;

    public static final ArrayList a(Context context) {
        File databasePath;
        kotlin.jvm.internal.G.p(context, "context");
        ArrayList arrayList = new ArrayList();
        String[] strArrDatabaseList = context.databaseList();
        if (strArrDatabaseList != null) {
            if (!(strArrDatabaseList.length == 0)) {
                for (String str : strArrDatabaseList) {
                    kotlin.jvm.internal.G.m(str);
                    if (new Regex("com\\.im_([0-9]+\\.){3}db").m(str)) {
                        int i10 = C3481b3.f152724a;
                        if (!str.equals("com.im_10.8.0.db") && (databasePath = context.getDatabasePath(str)) != null && databasePath.exists() && !context.deleteDatabase(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        List listQ = kotlin.collections.I.Q("com.im.keyValueStore.carb_store", "com.im.keyValueStore.aes_key_store", "com.im.keyValueStore.mraid_js_store", "com.im.keyValueStore.omid_js_store", "com.im.keyValueStore.user_info_store", "com.im.keyValueStore.coppa_store", "com.im.keyValueStore.gesture_info_store", "com.im.keyValueStore.display_info_store", "com.im.keyValueStore.unified_id_info_store", "com.im.keyValueStore.app_bundle_store", "com.im.keyValueStore.pub_signals_store");
        if (Build.VERSION.SDK_INT >= 24) {
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                context.deleteSharedPreferences((String) it.next());
            }
        } else {
            Iterator it2 = listQ.iterator();
            while (it2.hasNext()) {
                File file = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + ((String) it2.next()) + C1498d.f86308y);
                if (file.exists() && file.delete()) {
                    file.getName();
                }
            }
        }
        return !a(context).isEmpty();
    }

    public static final void a(File path) {
        kotlin.jvm.internal.G.p(path, "path");
        try {
            if (path.exists()) {
                File[] fileArrListFiles = path.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isDirectory()) {
                            a(file);
                        } else if (file.delete()) {
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    path.getName();
                }
            }
        } catch (Exception unused) {
        }
    }
}
