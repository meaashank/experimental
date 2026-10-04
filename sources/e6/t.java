package e6;

import android.os.RemoteException;
import com.prism.commons.utils.l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p6.InterfaceC5394a;
import p6.d;
import p6.e;

/* JADX INFO: loaded from: classes5.dex */
public class t extends e.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f200274d = l0.b(t.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f200275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p6.d f200276f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f200277c = new HashMap();

    static {
        final t tVar = new t();
        f200275e = tVar;
        Objects.requireNonNull(tVar);
        f200276f = new p6.d(C4367c.f200254p, tVar, new d.a() { // from class: e6.s
            @Override // p6.d.a
            public final void a() {
                this.f200273a.U5();
            }
        });
    }

    public static InterfaceC5394a T5() {
        return f200276f;
    }

    public static void W5() {
        f200276f.d();
    }

    public static t v5() {
        return f200275e;
    }

    public final void U5() {
        this.f200277c.clear();
    }

    public final int V5() {
        Iterator<Integer> it = this.f200277c.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @Override // p6.e
    public void e3(String str, int i10) throws RemoteException {
        this.f200277c.put(str, Integer.valueOf(i10));
    }

    @Override // p6.e
    public int n3(String str, int i10) throws RemoteException {
        this.f200277c.put(str, Integer.valueOf(i10));
        return V5();
    }
}
