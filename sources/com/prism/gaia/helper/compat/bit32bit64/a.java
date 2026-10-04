package com.prism.gaia.helper.compat.bit32bit64;

import android.app.ActivityManager;
import android.os.Bundle;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.Gaia32bit64bitProvider;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Gaia32bit64bitProvider.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165000a = "asdf-".concat(a.class.getSimpleName());

    public static Set<Integer> b(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            for (int i10 : c(it.next())) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    public static int[] c(String str) {
        Bundle bundleCall = null;
        try {
            bundleCall = GaiaContext.j().n().getContentResolver().call(Gaia32bit64bitProvider.e(str).getContentUri(), Gaia32bit64bitProvider.f166088f, (String) null, new Bundle());
        } catch (Throwable unused) {
        }
        if (bundleCall == null) {
            return new int[0];
        }
        int[] intArray = bundleCall.getIntArray(Gaia32bit64bitProvider.f166093k);
        return intArray == null ? new int[0] : intArray;
    }

    @Override // com.prism.gaia.server.Gaia32bit64bitProvider.a
    public void a(Bundle bundle, Bundle bundle2) {
        HashSet hashSet = new HashSet();
        List<ActivityManager.AppTask> appTasks = Gaia32bit64bitProvider.a().b().getAppTasks();
        if (appTasks == null) {
            return;
        }
        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null) {
                hashSet.add(Integer.valueOf(taskInfo.id));
            }
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            iArr[i10] = ((Integer) it2.next()).intValue();
            i10++;
        }
        bundle2.putIntArray(Gaia32bit64bitProvider.f166093k, iArr);
    }
}
