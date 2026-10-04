package T2;

import androidx.annotation.NonNull;
import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.T;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
public interface m {
    @NonNull
    @T("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> a(@NonNull String workSpecId);

    @C(onConflict = 5)
    void b(l workName);

    @T("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> c(String name);
}
