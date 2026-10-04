package R9;

import V5.e;
import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<e> f67793a;

    public b(ArrayList<e> arrayList) {
        ArrayList<e> arrayList2 = new ArrayList<>();
        this.f67793a = arrayList2;
        arrayList2.clear();
        this.f67793a.addAll(arrayList);
    }

    @Override // V5.e
    public void a(Context context) {
        ArrayList<e> arrayList = this.f67793a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e eVar = arrayList.get(i10);
            i10++;
            eVar.a(context);
        }
    }

    @Override // V5.e
    public void b(Context context) {
        ArrayList<e> arrayList = this.f67793a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e eVar = arrayList.get(i10);
            i10++;
            eVar.b(context);
        }
    }
}
