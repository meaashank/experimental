package com.prism.gaia.helper.compat.bit32bit64;

import android.app.ActivityManager;
import android.content.Context;
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
public class f implements Gaia32bit64bitProvider.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165006a = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f165007b = "maxNum";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f165008c = "flags";

    public static List<ActivityManager.RecentTaskInfo> b(String str, int i10, int i11) {
        Context contextN = GaiaContext.j().n();
        Bundle bundle = new Bundle();
        bundle.putInt(f165007b, i10);
        bundle.putInt("flags", i11);
        Bundle bundleCall = null;
        try {
            bundleCall = contextN.getContentResolver().call(Gaia32bit64bitProvider.e(str).getContentUri(), Gaia32bit64bitProvider.f166089g, (String) null, bundle);
        } catch (Throwable unused) {
        }
        if (bundleCall == null) {
            return new ArrayList();
        }
        Parcelable[] parcelableArray = bundleCall.getParcelableArray(Gaia32bit64bitProvider.f166093k);
        return parcelableArray == null ? new ArrayList() : Arrays.asList((ActivityManager.RecentTaskInfo[]) Arrays.copyOf(parcelableArray, parcelableArray.length, ActivityManager.RecentTaskInfo[].class));
    }

    public static List<ActivityManager.RecentTaskInfo> c(Collection<String> collection, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            linkedList.addAll(b(it.next(), i10, i11));
        }
        return linkedList;
    }

    @Override // com.prism.gaia.server.Gaia32bit64bitProvider.a
    public void a(Bundle bundle, Bundle bundle2) {
        List<ActivityManager.RecentTaskInfo> recentTasks = Gaia32bit64bitProvider.a().b().getRecentTasks(bundle.getInt(f165007b, 0), bundle.getInt("flags", 0));
        if (recentTasks == null) {
            return;
        }
        bundle2.putParcelableArray(Gaia32bit64bitProvider.f166093k, (Parcelable[]) recentTasks.toArray(new ActivityManager.RecentTaskInfo[0]));
    }
}
