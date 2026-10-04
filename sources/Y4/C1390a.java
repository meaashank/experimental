package Y4;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.tasks.Task;
import com.prism.lib.pfs.file.PrivateFile;

/* JADX INFO: renamed from: Y4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1390a extends Z4.b<Metadata, PrivateFile, Task<Object>> {
    @Override // Z4.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(Metadata metadata) {
        return metadata.getTitle();
    }

    @Override // Z4.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String b(PrivateFile privateFile) {
        return privateFile.getName();
    }
}
