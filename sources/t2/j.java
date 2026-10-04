package T2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.T;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
public interface j {
    @Nullable
    @T("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    i a(@NonNull String workSpecId);

    @NonNull
    @T("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> b();

    @C(onConflict = 1)
    void c(@NonNull i systemIdInfo);

    @T("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void d(@NonNull String workSpecId);
}
