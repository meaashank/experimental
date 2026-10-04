package d5;

import android.util.Log;
import com.prism.commons.utils.l0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n<T_ITEM> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f194837e = l0.b(n.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<T_ITEM> f194838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f194839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f194841d;

    public interface a {
        void a(int i10);
    }

    public n(List<T_ITEM> list) {
        synchronized (this) {
            this.f194838a = list;
            this.f194839b = new boolean[list.size()];
            a();
            this.f194840c = 0;
        }
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f194839b;
            if (i10 >= zArr.length) {
                return;
            }
            zArr[i10] = false;
            i10++;
        }
    }

    public void b(int i10) {
        synchronized (this) {
            try {
                boolean[] zArr = this.f194839b;
                boolean z10 = zArr[i10];
                zArr[i10] = false;
                if (z10) {
                    int i11 = this.f194840c - 1;
                    this.f194840c = i11;
                    a aVar = this.f194841d;
                    if (aVar != null) {
                        aVar.a(i11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        a aVar;
        synchronized (this) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                try {
                    boolean[] zArr = this.f194839b;
                    if (i10 >= zArr.length) {
                        break;
                    }
                    if (zArr[i10]) {
                        z10 = true;
                    }
                    zArr[i10] = false;
                    i10++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f194840c = 0;
            if (z10 && (aVar = this.f194841d) != null) {
                aVar.a(0);
            }
        }
    }

    public int d() {
        return this.f194840c;
    }

    public int[] e() {
        int[] iArr;
        synchronized (this) {
            try {
                int i10 = this.f194840c;
                iArr = new int[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < this.f194838a.size(); i12++) {
                    if (this.f194839b[i12]) {
                        if (i11 >= i10) {
                            throw new IllegalStateException("selected count is not right count:" + i10);
                        }
                        iArr[i11] = i12;
                        i11++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public List<T_ITEM> f() {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f194838a.size(); i10++) {
                    if (this.f194839b[i10]) {
                        arrayList.add(this.f194838a.get(i10));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public boolean g(int i10) {
        return this.f194839b[i10];
    }

    public void h(int i10) {
        synchronized (this) {
            try {
                boolean[] zArr = this.f194839b;
                boolean z10 = zArr[i10];
                zArr[i10] = true;
                if (!z10) {
                    int i11 = this.f194840c + 1;
                    this.f194840c = i11;
                    a aVar = this.f194841d;
                    if (aVar != null) {
                        aVar.a(i11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        boolean[] zArr;
        a aVar;
        synchronized (this) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                try {
                    zArr = this.f194839b;
                    if (i10 >= zArr.length) {
                        break;
                    }
                    if (!zArr[i10]) {
                        z10 = true;
                    }
                    zArr[i10] = true;
                    i10++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int length = zArr.length;
            this.f194840c = length;
            if (z10 && (aVar = this.f194841d) != null) {
                aVar.a(length);
            }
        }
    }

    public void j(a aVar) {
        this.f194841d = aVar;
        Log.d(f194837e, "setOnSelectedCountChangeListener selectedCount:" + this.f194840c);
        a aVar2 = this.f194841d;
        if (aVar2 != null) {
            aVar2.a(this.f194840c);
        }
    }
}
