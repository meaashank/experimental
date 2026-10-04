package T2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2680q;
import androidx.room.P;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2680q
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @P
    @InterfaceC2662g(name = "key")
    public String f68185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    @InterfaceC2662g(name = "long_value")
    public Long f68186b;

    public d(@NonNull String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof d)) {
            return false;
        }
        d dVar = (d) o10;
        if (!this.f68185a.equals(dVar.f68185a)) {
            return false;
        }
        Long l10 = this.f68186b;
        Long l11 = dVar.f68186b;
        return l10 != null ? l10.equals(l11) : l11 == null;
    }

    public int hashCode() {
        int iHashCode = this.f68185a.hashCode() * 31;
        Long l10 = this.f68186b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(@NonNull String key, long value) {
        this.f68185a = key;
        this.f68186b = Long.valueOf(value);
    }
}
