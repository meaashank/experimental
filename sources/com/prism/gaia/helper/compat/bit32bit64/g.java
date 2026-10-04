package com.prism.gaia.helper.compat.bit32bit64;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.Gaia32bit64bitProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g implements Gaia32bit64bitProvider.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165009a = "asdf-".concat(g.class.getSimpleName());

    public static List<ActivityManager.RunningAppProcessInfo> b(String str) {
        Bundle bundleCall = null;
        try {
            bundleCall = GaiaContext.j().n().getContentResolver().call(Gaia32bit64bitProvider.e(str).getContentUri(), Gaia32bit64bitProvider.f166090h, (String) null, (Bundle) null);
        } catch (Throwable unused) {
        }
        if (bundleCall == null) {
            return new ArrayList();
        }
        Parcelable[] parcelableArray = bundleCall.getParcelableArray(Gaia32bit64bitProvider.f166093k);
        return parcelableArray == null ? new ArrayList() : Arrays.asList((ActivityManager.RunningAppProcessInfo[]) Arrays.copyOf(parcelableArray, parcelableArray.length, ActivityManager.RunningAppProcessInfo[].class));
    }

    public static List<ActivityManager.RunningAppProcessInfo> c(Collection<String> collection) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            linkedList.addAll(b(it.next()));
        }
        return linkedList;
    }

    @Override // com.prism.gaia.server.Gaia32bit64bitProvider.a
    public void a(Bundle bundle, Bundle bundle2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = Gaia32bit64bitProvider.a().b().getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return;
        }
        bundle2.putParcelableArray(Gaia32bit64bitProvider.f166093k, (Parcelable[]) runningAppProcesses.toArray(new ActivityManager.RunningAppProcessInfo[0]));
    }
}
