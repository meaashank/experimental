package U2;

import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import v2.C5673b;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static void a(@NonNull StringBuilder builder, int count) {
        if (count <= 0) {
            return;
        }
        builder.append("?");
        for (int i10 = 1; i10 < count; i10++) {
            builder.append(",");
            builder.append("?");
        }
    }

    @NonNull
    public static v2.f b(@NonNull WorkQuery querySpec) {
        String str;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> list = querySpec.f120235d;
        String str2 = " AND";
        if (list.isEmpty()) {
            str = " WHERE";
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            Iterator<WorkInfo.State> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(T2.x.j(it.next())));
            }
            sb2.append(" WHERE state IN (");
            a(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        List<UUID> list2 = querySpec.f120232a;
        if (!list2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            Iterator<UUID> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb2.append(str);
            sb2.append(" id IN (");
            a(sb2, list2.size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        List<String> list3 = querySpec.f120234c;
        if (list3.isEmpty()) {
            str2 = str;
        } else {
            sb2.append(str);
            sb2.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb2, list3.size());
            sb2.append("))");
            arrayList.addAll(list3);
        }
        List<String> list4 = querySpec.f120233b;
        if (!list4.isEmpty()) {
            sb2.append(str2);
            sb2.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb2, list4.size());
            sb2.append("))");
            arrayList.addAll(list4);
        }
        sb2.append(";");
        return new C5673b(sb2.toString(), arrayList.toArray());
    }
}
