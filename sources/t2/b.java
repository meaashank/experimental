package T2;

import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.T;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
public interface b {
    @T("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> a(String id2);

    @T("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean b(String id2);

    @C(onConflict = 5)
    void c(a dependency);

    @T("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> d(String id2);

    @T("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean e(String id2);
}
