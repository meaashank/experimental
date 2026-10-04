package ka;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import com.prism.commons.utils.I;
import com.prism.gaia.remote.GuestAppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import v8.C5693c;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f217416a = "AccountsRepo";

    public static boolean a(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (d(it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, Integer> b(u uVar) {
        try {
            Map<String, Integer> mapY = C5693c.k().y(uVar.f217417a, uVar.f217418b);
            if (mapY != null) {
                return mapY;
            }
        } catch (Throwable th) {
            I.i(f217416a, th);
        }
        return new LinkedHashMap();
    }

    public static int c(List<u> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(it.next().f217418b));
        }
        return linkedHashSet.size();
    }

    public static boolean d(int i10) {
        try {
            AuthenticatorDescription[] authenticatorDescriptionArrW = C5693c.k().w(i10);
            if (authenticatorDescriptionArrW != null) {
                if (authenticatorDescriptionArrW.length > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            I.i(f217416a, th);
            return false;
        }
    }

    public static List<u> e() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) h();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int iIntValue = ((Integer) obj).intValue();
            try {
                Account[] accountArrS = C5693c.k().s(iIntValue);
                if (accountArrS != null) {
                    for (Account account : accountArrS) {
                        u uVar = new u(account, iIntValue);
                        uVar.f217419c = b(uVar).size();
                        arrayList.add(uVar);
                    }
                }
            } catch (Throwable th) {
                I.i(f217416a, th);
            }
        }
        return arrayList;
    }

    public static boolean f(u uVar) {
        try {
            if (!C5693c.k().L(uVar.f217417a, uVar.f217418b)) {
                I.b(f217416a, "the account service says %s was not removed", uVar.b());
                return false;
            }
            try {
                Account[] accountArrS = C5693c.f239866b.s(uVar.f217418b);
                if (accountArrS == null) {
                    return true;
                }
                for (Account account : accountArrS) {
                    if (account != null && uVar.f217417a.equals(account)) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                I.i(f217416a, th);
                return false;
            }
        } catch (Throwable th2) {
            I.i(f217416a, th2);
            return false;
        }
    }

    public static int g(List<u> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        return linkedHashSet.size();
    }

    public static List<Integer> h() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        try {
            List<GuestAppInfo> listD = C5842a.m().d();
            if (listD != null) {
                Iterator<GuestAppInfo> it = listD.iterator();
                while (it.hasNext()) {
                    int[] installedUsers = it.next().getInstalledUsers();
                    if (installedUsers != null) {
                        for (int i10 : installedUsers) {
                            treeSet.add(Integer.valueOf(i10));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            I.i(f217416a, th);
        }
        return new ArrayList(treeSet);
    }
}
