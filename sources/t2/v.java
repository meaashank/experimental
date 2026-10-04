package T2;

import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.T;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
public interface v {
    @C(onConflict = 5)
    void a(u workTag);

    @T("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> b(String id2);

    @T("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> c(String tag);
}
