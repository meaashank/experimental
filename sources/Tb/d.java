package tb;

import com.tencent.qcloud.core.common.QCloudClientException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f239249b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, q> f239250a = new HashMap(100);

    @Override // tb.p
    public q a(n[] nVarArr) throws QCloudClientException {
        int iHashCode = n.a(nVarArr).hashCode();
        q qVarE = e(iHashCode);
        if (qVarE != null) {
            return qVarE;
        }
        q qVarD = d(nVarArr);
        c(iHashCode, qVarD);
        return qVarD;
    }

    @Override // tb.g
    public h b() throws QCloudClientException {
        throw new UnsupportedOperationException("not support ths op");
    }

    public final synchronized void c(int i10, q qVar) {
        try {
            Iterator<Map.Entry<Integer, q>> it = this.f239250a.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    it.remove();
                }
            }
            if (this.f239250a.size() > 100) {
                int size = this.f239250a.size() - 100;
                Iterator<Map.Entry<Integer, q>> it2 = this.f239250a.entrySet().iterator();
                while (it2.hasNext()) {
                    int i11 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it2.remove();
                    size = i11;
                }
            }
            this.f239250a.put(Integer.valueOf(i10), qVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract q d(n[] nVarArr) throws QCloudClientException;

    public final synchronized q e(int i10) {
        q qVar = this.f239250a.get(Integer.valueOf(i10));
        if (qVar != null) {
            if (qVar.isValid()) {
                return qVar;
            }
        }
        return null;
    }

    @Override // tb.g
    public void refresh() {
    }
}
