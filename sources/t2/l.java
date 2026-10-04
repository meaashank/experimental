package T2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Index;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2680q;
import androidx.room.InterfaceC2685w;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2680q(foreignKeys = {@InterfaceC2685w(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "name")
    public final String f68202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "work_spec_id")
    public final String f68203b;

    public l(@NonNull String name, @NonNull String workSpecId) {
        this.f68202a = name;
        this.f68203b = workSpecId;
    }
}
