package androidx.room;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f117309a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f117310b = "room_master_table";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f117311c = "room_master_table";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f117312d = "id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f117313e = "identity_hash";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f117314f = "42";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f117315g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f117316h = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @dd.o
    @NotNull
    public static final String a(@NotNull String hash) {
        kotlin.jvm.internal.G.p(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
