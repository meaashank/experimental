package Z4;

import com.prism.commons.utils.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<TLEFT, TRIGHT, TRESULT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79437a = l0.b(b.class.getSimpleName());

    public abstract String a(TLEFT tleft);

    public abstract String b(TRIGHT tright);

    /* JADX WARN: Multi-variable type inference failed */
    public List<TRESULT> c(Iterable<TLEFT> iterable, Iterable<TRIGHT> iterable2, a<TLEFT, TRIGHT, TRESULT> aVar) {
        HashMap map = new HashMap();
        for (TLEFT tleft : iterable) {
            map.put(a(tleft), tleft);
        }
        ArrayList arrayList = new ArrayList();
        for (TRIGHT tright : iterable2) {
            String strB = b(tright);
            arrayList.add(aVar.a(map.get(strB), tright));
            map.remove(strB);
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a(it.next(), null));
        }
        return arrayList;
    }
}
