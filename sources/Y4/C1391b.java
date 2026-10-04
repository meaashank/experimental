package Y4;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: Y4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1391b extends Z4.b<Metadata, T4.c, Task<Object>> {
    @Override // Z4.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(Metadata metadata) {
        return metadata.getTitle();
    }

    @Override // Z4.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String b(T4.c cVar) {
        return cVar.l();
    }
}
