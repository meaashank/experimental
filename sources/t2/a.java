package T2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Index;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2680q;
import androidx.room.InterfaceC2685w;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2680q(foreignKeys = {@InterfaceC2685w(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @InterfaceC2685w(childColumns = {"prerequisite_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "work_spec_id")
    public final String f68180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "prerequisite_id")
    public final String f68181b;

    public a(@NonNull String workSpecId, @NonNull String prerequisiteId) {
        this.f68180a = workSpecId;
        this.f68181b = prerequisiteId;
    }
}
