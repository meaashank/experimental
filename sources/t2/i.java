package T2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2680q;
import androidx.room.InterfaceC2685w;
import androidx.room.P;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2680q(foreignKeys = {@InterfaceC2685w(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @P
    @InterfaceC2662g(name = "work_spec_id")
    public final String f68195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC2662g(name = "system_id")
    public final int f68196b;

    public i(@NonNull String workSpecId, int systemId) {
        this.f68195a = workSpecId;
        this.f68196b = systemId;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof i)) {
            return false;
        }
        i iVar = (i) o10;
        if (this.f68196b != iVar.f68196b) {
            return false;
        }
        return this.f68195a.equals(iVar.f68195a);
    }

    public int hashCode() {
        return (this.f68195a.hashCode() * 31) + this.f68196b;
    }
}
