package T2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2680q;
import androidx.room.InterfaceC2685w;
import androidx.room.P;
import androidx.work.Data;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2680q(foreignKeys = {@InterfaceC2685w(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @P
    @InterfaceC2662g(name = "work_spec_id")
    public final String f68207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "progress")
    public final Data f68208b;

    public o(@NonNull String workSpecId, @NonNull Data progress) {
        this.f68207a = workSpecId;
        this.f68208b = progress;
    }
}
