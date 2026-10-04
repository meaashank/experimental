package com.prism.gaia.server.pm;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.prism.gaia.server.pm.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4181p<F, R> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f167609h = "asdf-".concat(AbstractC4181p.class.getSimpleName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f167610i = new C4180o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<F> f167611a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, F[]> f167612b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, F[]> f167613c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, F[]> f167614d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, F[]> f167615e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<String, F[]> f167616f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap<String, F[]> f167617g = new HashMap<>();

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.p$a */
    public class a implements Iterator<F> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<F> f167618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public F f167619b;

        public a(Iterator<F> it) {
            this.f167618a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f167618a.hasNext();
        }

        @Override // java.util.Iterator
        public F next() {
            F next = this.f167618a.next();
            this.f167619b = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            F f10 = this.f167619b;
            if (f10 != null) {
                AbstractC4181p.this.y(f10);
            }
            this.f167618a.remove();
        }
    }

    public static /* synthetic */ int a(Object obj, Object obj2) {
        int priority;
        int priority2;
        if (!(obj instanceof IntentFilter)) {
            if (obj instanceof ResolveInfo) {
                ResolveInfo resolveInfo = (ResolveInfo) obj2;
                IntentFilter intentFilter = ((ResolveInfo) obj).filter;
                priority = intentFilter == null ? 0 : intentFilter.getPriority();
                IntentFilter intentFilter2 = resolveInfo.filter;
                priority2 = intentFilter2 == null ? 0 : intentFilter2.getPriority();
            }
        }
        priority = ((IntentFilter) obj).getPriority();
        priority2 = ((IntentFilter) obj2).getPriority();
        if (priority > priority2) {
            return -1;
        }
        return priority < priority2 ? 1 : 0;
    }

    public static boolean i(IntentFilter intentFilter, IntentFilter intentFilter2) {
        int iCountDataSchemes;
        int iCountActions = intentFilter.countActions();
        if (iCountActions != intentFilter2.countActions()) {
            return false;
        }
        for (int i10 = 0; i10 < iCountActions; i10++) {
            if (!intentFilter2.hasAction(intentFilter.getAction(i10))) {
                return false;
            }
        }
        int iCountCategories = intentFilter.countCategories();
        if (iCountCategories != intentFilter2.countCategories()) {
            return false;
        }
        for (int i11 = 0; i11 < iCountCategories; i11++) {
            if (!intentFilter2.hasCategory(intentFilter.getCategory(i11))) {
                return false;
            }
        }
        if (intentFilter.countDataTypes() != intentFilter2.countDataTypes() || (iCountDataSchemes = intentFilter.countDataSchemes()) != intentFilter2.countDataSchemes()) {
            return false;
        }
        for (int i12 = 0; i12 < iCountDataSchemes; i12++) {
            if (!intentFilter2.hasDataScheme(intentFilter.getDataScheme(i12))) {
                return false;
            }
        }
        return intentFilter.countDataAuthorities() == intentFilter2.countDataAuthorities() && intentFilter.countDataPaths() == intentFilter2.countDataPaths() && intentFilter.countDataSchemeSpecificParts() == intentFilter2.countDataSchemeSpecificParts();
    }

    public static com.prism.gaia.helper.utils.i<String> n(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new com.prism.gaia.helper.utils.i<>((String[]) categories.toArray(new String[categories.size()]));
    }

    public void A(List<R> list) {
        Collections.sort(list, f167610i);
    }

    public final int B(F f10, Iterator<String> it, HashMap<String, F[]> map, String str) {
        int i10 = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i10++;
            z(map, it.next(), f10);
        }
        return i10;
    }

    public final int C(F f10, String str) {
        String strIntern;
        Iterator<String> itTypesIterator = o(f10).typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i10 = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            i10++;
            int iIndexOf = next.indexOf(47);
            if (iIndexOf > 0) {
                strIntern = next.substring(0, iIndexOf).intern();
            } else {
                strIntern = next;
                next = next.concat("/*");
            }
            z(this.f167612b, next, f10);
            if (iIndexOf > 0) {
                z(this.f167613c, strIntern, f10);
            } else {
                z(this.f167614d, strIntern, f10);
            }
        }
        return i10;
    }

    public void b(F f10) {
        IntentFilter intentFilterO = o(f10);
        this.f167611a.add(f10);
        int iV = v(f10, intentFilterO.schemesIterator(), this.f167615e, "      Scheme: ");
        int iW = w(f10, "      Type: ");
        if (iV == 0 && iW == 0) {
            v(f10, intentFilterO.actionsIterator(), this.f167616f, "      Action: ");
        }
        if (iW != 0) {
            v(f10, intentFilterO.actionsIterator(), this.f167617g, "      TypedAction: ");
        }
    }

    public final void c(HashMap<String, F[]> map, String str, F f10) {
        F[] fArr = map.get(str);
        if (fArr == null) {
            F[] fArrR = r(2);
            map.put(str, fArrR);
            fArrR[0] = f10;
            return;
        }
        int length = fArr.length;
        int i10 = length;
        while (i10 > 0 && fArr[i10 - 1] == null) {
            i10--;
        }
        if (i10 < length) {
            fArr[i10] = f10;
            return;
        }
        F[] fArrR2 = r((length * 3) / 2);
        System.arraycopy(fArr, 0, fArrR2, 0, length);
        fArrR2[length] = f10;
        map.put(str, fArrR2);
    }

    public boolean d(F f10, List<R> list) {
        return true;
    }

    public final void e(Intent intent, com.prism.gaia.helper.utils.i<String> iVar, boolean z10, String str, String str2, F[] fArr, List<R> list, int i10) {
        int iMatch;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        int length = fArr != null ? fArr.length : 0;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            F f10 = fArr[i11];
            if (f10 == null) {
                break;
            }
            if ((str3 == null || q(str3, f10)) && d(f10, list) && (iMatch = o(f10).match(action, str, str2, data, iVar, f167609h)) >= 0) {
                if (!z10 || o(f10).hasCategory("android.intent.category.DEFAULT")) {
                    R rS = s(f10, iMatch, i10);
                    if (rS != null) {
                        list.add(rS);
                    }
                } else {
                    z11 = true;
                }
            }
        }
        if (!z11 || list.size() == 0) {
            return;
        }
        list.size();
    }

    public final ArrayList<F> f(F[] fArr, IntentFilter intentFilter) {
        F f10;
        ArrayList<F> arrayList = null;
        if (fArr != null) {
            for (int i10 = 0; i10 < fArr.length && (f10 = fArr[i10]) != null; i10++) {
                if (i(o(f10), intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(f10);
                }
            }
        }
        return arrayList;
    }

    public void g(PrintWriter printWriter, String str, F f10) {
        printWriter.print(str);
        printWriter.println(f10);
    }

    public void h(PrintWriter printWriter, String str, Object obj, int i10) {
        printWriter.print(str);
        printWriter.print(obj);
        printWriter.print(": ");
        printWriter.println(i10);
    }

    public Iterator<F> j() {
        return new a(this.f167611a.iterator());
    }

    public Set<F> k() {
        return Collections.unmodifiableSet(this.f167611a);
    }

    public Object l(F f10) {
        return "IntentFilter";
    }

    public ArrayList<F> m(IntentFilter intentFilter) {
        if (intentFilter.countDataSchemes() == 1) {
            return f(this.f167615e.get(intentFilter.getDataScheme(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() != 0 && intentFilter.countActions() == 1) {
            return f(this.f167617g.get(intentFilter.getAction(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() == 0 && intentFilter.countDataSchemes() == 0 && intentFilter.countActions() == 1) {
            return f(this.f167616f.get(intentFilter.getAction(0)), intentFilter);
        }
        ArrayList<F> arrayList = null;
        for (F f10 : this.f167611a) {
            if (i(o(f10), intentFilter)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(f10);
            }
        }
        return arrayList;
    }

    public abstract IntentFilter o(@NonNull F f10);

    public boolean p(F f10) {
        return false;
    }

    public abstract boolean q(String str, F f10);

    public abstract F[] r(int i10);

    /* JADX WARN: Multi-variable type inference failed */
    public R s(F f10, int i10, int i11) {
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<R> t(android.content.Intent r13, java.lang.String r14, boolean r15, int r16) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.pm.AbstractC4181p.t(android.content.Intent, java.lang.String, boolean, int):java.util.List");
    }

    public List<R> u(Intent intent, String str, boolean z10, ArrayList<F[]> arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList();
        com.prism.gaia.helper.utils.i<String> iVarN = n(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e(intent, iVarN, z10, str, scheme, arrayList.get(i11), arrayList2, i10);
        }
        A(arrayList2);
        return arrayList2;
    }

    public final int v(F f10, Iterator<String> it, HashMap<String, F[]> map, String str) {
        int i10 = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i10++;
            c(map, it.next(), f10);
        }
        return i10;
    }

    public final int w(F f10, String str) {
        String strIntern;
        Iterator<String> itTypesIterator = o(f10).typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i10 = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            i10++;
            int iIndexOf = next.indexOf(47);
            if (iIndexOf > 0) {
                strIntern = next.substring(0, iIndexOf).intern();
            } else {
                strIntern = next;
                next = next.concat("/*");
            }
            c(this.f167612b, next, f10);
            if (iIndexOf > 0) {
                c(this.f167613c, strIntern, f10);
            } else {
                c(this.f167614d, strIntern, f10);
            }
        }
        return i10;
    }

    public void x(F f10) {
        y(f10);
        this.f167611a.remove(f10);
    }

    public void y(F f10) {
        IntentFilter intentFilterO = o(f10);
        int iB = B(f10, intentFilterO.schemesIterator(), this.f167615e, "      Scheme: ");
        int iC = C(f10, "      Type: ");
        if (iB == 0 && iC == 0) {
            B(f10, intentFilterO.actionsIterator(), this.f167616f, "      Action: ");
        }
        if (iC != 0) {
            B(f10, intentFilterO.actionsIterator(), this.f167617g, "      TypedAction: ");
        }
    }

    public final void z(HashMap<String, F[]> map, String str, Object obj) {
        F[] fArr = map.get(str);
        if (fArr != null) {
            int length = fArr.length - 1;
            while (length >= 0 && fArr[length] == null) {
                length--;
            }
            int i10 = length;
            while (length >= 0) {
                if (fArr[length] == obj) {
                    int i11 = i10 - length;
                    if (i11 > 0) {
                        System.arraycopy(fArr, length + 1, fArr, length, i11);
                    }
                    fArr[i10] = null;
                    i10--;
                }
                length--;
            }
            if (i10 < 0) {
                map.remove(str);
            } else if (i10 < fArr.length / 2) {
                F[] fArrR = r(i10 + 2);
                System.arraycopy(fArr, 0, fArrR, 0, i10 + 1);
                map.put(str, fArrR);
            }
        }
    }
}
