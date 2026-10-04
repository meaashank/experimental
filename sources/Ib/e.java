package Ib;

import Ab.i;
import android.content.Context;
import android.content.Intent;
import com.tonyodev.fetch2.DownloadNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.J;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nNotificationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationUtils.kt\ncom/tonyodev/fetch2/util/NotificationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,57:1\n1485#2:58\n1510#2,3:59\n1513#2,3:69\n1557#2:73\n1628#2,3:74\n381#3,7:62\n216#4:72\n217#4:77\n*S KotlinDebug\n*F\n+ 1 NotificationUtils.kt\ncom/tonyodev/fetch2/util/NotificationUtilsKt\n*L\n35#1:58\n35#1:59,3\n35#1:69,3\n37#1:73\n37#1:74,3\n35#1:62,7\n35#1:72\n35#1:77\n*E\n"})
public final class e {
    public static final void a(@Nullable Context context, @Nullable Intent intent, @NotNull com.tonyodev.fetch2.c fetchNotificationManager) {
        G.p(fetchNotificationManager, "fetchNotificationManager");
        if (context == null || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(i.f12225p);
        int intExtra = intent.getIntExtra(i.f12226q, -1);
        int intExtra2 = intent.getIntExtra(i.f12230u, -1);
        intent.getIntExtra(i.f12228s, -1);
        int intExtra3 = intent.getIntExtra(i.f12229t, -1);
        boolean booleanExtra = intent.getBooleanExtra(i.f12231v, false);
        Collection parcelableArrayListExtra = intent.getParcelableArrayListExtra(i.f12227r);
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = EmptyList.f217510a;
        }
        if (!booleanExtra) {
            if (stringExtra == null || stringExtra.length() == 0 || intExtra == -1 || intExtra2 == -1) {
                return;
            }
            com.tonyodev.fetch2.b bVarN = fetchNotificationManager.n(stringExtra);
            if (bVarN.isClosed()) {
                return;
            }
            if (intExtra2 == 0) {
                bVarN.e(intExtra);
                return;
            }
            if (intExtra2 == 1) {
                bVarN.B0(intExtra);
                return;
            }
            if (intExtra2 == 2) {
                bVarN.b(intExtra);
                return;
            } else if (intExtra2 == 4) {
                bVarN.t(intExtra);
                return;
            } else {
                if (intExtra2 != 5) {
                    return;
                }
                bVarN.L0(intExtra);
                return;
            }
        }
        if (intExtra3 == -1 || parcelableArrayListExtra.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : parcelableArrayListExtra) {
            String namespace = ((DownloadNotification) obj).getNamespace();
            Object arrayList = linkedHashMap.get(namespace);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(namespace, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(J.d0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((DownloadNotification) it.next()).getNotificationId()));
            }
            com.tonyodev.fetch2.b bVarN2 = fetchNotificationManager.n(str);
            if (!bVarN2.isClosed()) {
                switch (intExtra2) {
                    case 6:
                        bVarN2.k0(arrayList2);
                        break;
                    case 7:
                        bVarN2.o0(arrayList2);
                        break;
                    case 8:
                        bVarN2.a0(arrayList2);
                        break;
                    case 9:
                        bVarN2.B(arrayList2);
                        break;
                    case 10:
                        bVarN2.Z(arrayList2);
                        break;
                }
            }
        }
    }
}
