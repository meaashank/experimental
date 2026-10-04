package l3;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.C4447e;
import g3.InterfaceC4444b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k3.l;
import k3.m;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5144a<Model> implements m<Model, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<k3.h, InputStream> f220917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final l<Model, k3.h> f220918b;

    public AbstractC5144a(m<k3.h, InputStream> mVar) {
        this(mVar, null);
    }

    public static List<InterfaceC4444b> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new k3.h(it.next()));
        }
        return arrayList;
    }

    @Override // k3.m
    @Nullable
    public m.a<InputStream> a(@NonNull Model model, int i10, int i11, @NonNull C4447e c4447e) {
        l<Model, k3.h> lVar = this.f220918b;
        k3.h hVarB = lVar != null ? lVar.b(model, i10, i11) : null;
        if (hVarB == null) {
            String strF = f(model, i10, i11, c4447e);
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            k3.h hVar = new k3.h(strF, e(model, i10, i11, c4447e));
            l<Model, k3.h> lVar2 = this.f220918b;
            if (lVar2 != null) {
                lVar2.c(model, i10, i11, hVar);
            }
            hVarB = hVar;
        }
        d(model, i10, i11, c4447e);
        List list = Collections.EMPTY_LIST;
        m.a<InputStream> aVarA = this.f220917a.a(hVarB, i10, i11, c4447e);
        return (aVarA == null || list.isEmpty()) ? aVarA : new m.a<>(aVarA.f214405a, c(list), aVarA.f214407c);
    }

    public List<String> d(Model model, int i10, int i11, C4447e c4447e) {
        return Collections.EMPTY_LIST;
    }

    @Nullable
    public com.bumptech.glide.load.model.a e(Model model, int i10, int i11, C4447e c4447e) {
        return com.bumptech.glide.load.model.a.f139807b;
    }

    public abstract String f(Model model, int i10, int i11, C4447e c4447e);

    public AbstractC5144a(m<k3.h, InputStream> mVar, @Nullable l<Model, k3.h> lVar) {
        this.f220917a = mVar;
        this.f220918b = lVar;
    }
}
