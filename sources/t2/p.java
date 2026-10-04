package T2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.T;
import androidx.work.Data;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface p {
    @T("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void a(@NonNull String workSpecId);

    @C(onConflict = 1)
    void b(@NonNull o progress);

    @Nullable
    @T("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    Data c(@NonNull String workSpecId);

    @NonNull
    @T("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<Data> d(@NonNull List<String> workSpecIds);

    @T("DELETE FROM WorkProgress")
    void z();
}
