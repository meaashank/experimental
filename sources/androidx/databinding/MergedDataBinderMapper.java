package androidx.databinding;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MergedDataBinderMapper extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f112267d = "MergedDataBinderMapper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<Class<? extends k>> f112268a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<k> f112269b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f112270c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.k
    public String b(int i10) {
        Iterator<k> it = this.f112269b.iterator();
        while (it.hasNext()) {
            String strB = it.next().b(i10);
            if (strB != null) {
                return strB;
            }
        }
        if (h()) {
            return b(i10);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public B c(DataBindingComponent dataBindingComponent, View view, int i10) {
        Iterator<k> it = this.f112269b.iterator();
        while (it.hasNext()) {
            B bC = it.next().c(dataBindingComponent, view, i10);
            if (bC != null) {
                return bC;
            }
        }
        if (h()) {
            return c(dataBindingComponent, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public B d(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        Iterator<k> it = this.f112269b.iterator();
        while (it.hasNext()) {
            B bD = it.next().d(dataBindingComponent, viewArr, i10);
            if (bD != null) {
                return bD;
            }
        }
        if (h()) {
            return d(dataBindingComponent, viewArr, i10);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Iterator<k> it = this.f112269b.iterator();
        while (it.hasNext()) {
            int iE = it.next().e(str);
            if (iE != 0) {
                return iE;
            }
        }
        if (h()) {
            return e(str);
        }
        return 0;
    }

    public void f(k kVar) {
        if (this.f112268a.add((Class<? extends k>) kVar.getClass())) {
            this.f112269b.add(kVar);
            Iterator<k> it = kVar.a().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    public void g(String str) {
        this.f112270c.add(str + ".DataBinderMapperImpl");
    }

    public final boolean h() {
        boolean z10 = false;
        for (String str : this.f112270c) {
            try {
                Class<?> cls = Class.forName(str);
                if (k.class.isAssignableFrom(cls)) {
                    f((k) cls.newInstance());
                    this.f112270c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e(f112267d, "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e(f112267d, "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }
}
