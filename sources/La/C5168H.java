package la;

import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.GuestAppSizeG;
import com.prism.gaia.remote.RunningProcessInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import v8.C5703m;
import y8.C5842a;

/* JADX INFO: renamed from: la.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5168H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f220996a = "GuestAppsRepo";

    /* JADX INFO: renamed from: la.H$a */
    public class a implements Comparator<C5169I> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C5169I c5169i, C5169I c5169i2) {
            if (c5169i.e() != c5169i2.e()) {
                return c5169i.e() ? -1 : 1;
            }
            int iCompareToIgnoreCase = c5169i.h().compareToIgnoreCase(c5169i2.h());
            return iCompareToIgnoreCase != 0 ? iCompareToIgnoreCase : c5169i.f220998b - c5169i2.f220998b;
        }
    }

    public static void a(List<C5169I> list) {
        try {
            List<RunningProcessInfo> listW = C5703m.o().w();
            Iterator<C5169I> it = list.iterator();
            while (it.hasNext()) {
                it.next().f221001e.clear();
            }
            if (listW == null) {
                return;
            }
            for (RunningProcessInfo runningProcessInfo : listW) {
                for (C5169I c5169i : list) {
                    if (c5169i.i(runningProcessInfo)) {
                        List<String> list2 = c5169i.f221001e;
                        String strJ = runningProcessInfo.processName;
                        if (strJ == null) {
                            strJ = c5169i.j();
                        }
                        list2.add(strJ);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static long b(List<C5169I> list) {
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        for (C5169I c5169i : list) {
            if (c5169i.f221000d != null) {
                if (!arrayList.contains(c5169i.j())) {
                    arrayList.add(c5169i.j());
                    j10 += c5169i.f221000d.appSize;
                }
                GuestAppSizeG guestAppSizeG = c5169i.f221000d;
                j10 += guestAppSizeG.dataSize + guestAppSizeG.cacheSize;
            }
        }
        return j10;
    }

    public static List<C5169I> c() {
        ArrayList arrayList = new ArrayList();
        try {
            List<GuestAppInfo> listD = C5842a.m().d();
            if (listD != null) {
                for (GuestAppInfo guestAppInfo : listD) {
                    int[] iArr = guestAppInfo.vuserIds;
                    if (iArr == null || iArr.length == 0) {
                        iArr = new int[]{0};
                    }
                    for (int i10 : iArr) {
                        arrayList.add(new C5169I(guestAppInfo, i10, iArr.length));
                    }
                }
                a(arrayList);
                e(arrayList);
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static void d(C5169I c5169i) {
        try {
            c5169i.f221000d = C5842a.m().h(c5169i.j(), c5169i.f220998b);
        } catch (Throwable unused) {
            c5169i.j();
        }
    }

    public static void e(List<C5169I> list) {
        Collections.sort(list, new a());
    }
}
