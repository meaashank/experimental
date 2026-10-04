package T2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.K;
import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.T;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
public interface e {
    @NonNull
    @T("SELECT long_value FROM Preference where `key`=:key")
    K<Long> a(@NonNull String key);

    @C(onConflict = 1)
    void b(@NonNull d preference);

    @Nullable
    @T("SELECT long_value FROM Preference where `key`=:key")
    Long c(@NonNull String key);
}
