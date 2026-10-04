package xa;

import java.util.Comparator;

/* JADX INFO: renamed from: xa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5799a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((C5800b) obj2).r(), ((C5800b) obj).r());
    }
}
